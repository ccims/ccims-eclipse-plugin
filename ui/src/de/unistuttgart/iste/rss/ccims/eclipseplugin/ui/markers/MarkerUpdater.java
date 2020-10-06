/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.markers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.progress.UIJob;

import com.google.common.base.Objects;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.Activator;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.markers.MarkerChange.Kind;

/**
 * Class responsible for updating the markers
 * 
 * @author Tim Neumann
 */
public class MarkerUpdater {
    private static final long MILLISECONDS_TO_WAIT_UNTIL_UPDATE = 500;
    
    private final ScheduledExecutorService executorService;
    private final MarkerRegistry registry;
    private final Runnable failureHandler;
    
    private List<MarkerChange> markerChanges;
    private ScheduledFuture<?> updateFuture;
    

    /**
     * Create new marker updater
     * 
     * @param markerRegistry The marker registry to use.
     * @param failureHandler A handler to be called when a correct updating of the
     *                       markers is not possible
     */
    public MarkerUpdater(MarkerRegistry markerRegistry, Runnable failureHandler) {
        this.executorService = Executors.newSingleThreadScheduledExecutor(r -> new Thread(r, "MarkerUpdateCollector"));
        this.registry = markerRegistry;
        this.failureHandler = failureHandler;
        this.markerChanges = new ArrayList<>();
    }
    
    /**
     * Update the markers according to the given changes
     * <p>
     * This method only schedules an update, so it may not be done immediatly.
     * <p>
     * This method tries to collect multiple updates into one big update if they are
     * occuring within a short interval. This prevents unnecessarily updating the
     * same marker multiple times
     * 
     * @param changes The changes to perform
     */
    public void updateMarkers(List<MarkerChange> changes) {
        if (this.updateFuture != null) {
            this.updateFuture.cancel(false);
        }
        synchronized (this.markerChanges) {
            this.markerChanges.addAll(changes);
            simplifyUpdate(this.markerChanges);
        }
        
        this.updateFuture = this.executorService.schedule(() -> {
            synchronized (this.markerChanges) {
                new UpdateWorker(List.copyOf(this.markerChanges)).schedule();
                this.markerChanges.clear();
            }
        }, MILLISECONDS_TO_WAIT_UNTIL_UPDATE, TimeUnit.MILLISECONDS);
    }
    
    private static void simplifyUpdate(List<MarkerChange> changes) {
        boolean simplificationsPerformed;
        do {
            simplificationsPerformed = simplifiyOnce(changes);
        } while (simplificationsPerformed);
    }
    
    /**
     * Simplifies the given list of changes once
     * 
     * @param changes The list to simplify
     * 
     * @return Whether a simplification could be found
     */
    private static boolean simplifiyOnce(List<MarkerChange> changes) {
        for (int i = 0; i < changes.size(); i++) {
            MarkerChange earlierChange = changes.get(i);
            
            for (int j = i + 1; j < changes.size(); j++) {
                MarkerChange laterChange = changes.get(j);
                
                if (earlierChange.getKind() == Kind.DELETION) {
                    if (laterChange.getKind() == Kind.CREATION
                            && Objects.equal(earlierChange.getOldIdentifier(), laterChange.getNewIdentifier())) {
                        // Removed and created again. Just delete both changes.
                        changes.remove(j); // bigger first, as to not modifiy index of the other
                        changes.remove(i);
                        return true;
                    }
                } else if (Objects.equal(earlierChange.getNewIdentifier(), laterChange.getOldIdentifier())) {
                    // Can simplifiy
                    if (earlierChange.getKind() == Kind.CREATION) {
                        if (laterChange.getKind() == Kind.DELETION) {
                            // Created and removed again. Just delete both changes.
                            changes.remove(j); // bigger first, as to not modifiy index of the other
                            changes.remove(i);
                            return true;
                        }
                        
                        if (laterChange.getKind() == Kind.CHANGE) {
                            // Created and changed. Delete both changes. And create a creation of the final
                            // version
                            IssueMarkerIdentifier finalId = laterChange.getNewIdentifier();
                            changes.remove(j);
                            changes.add(j, new MarkerChange(null, finalId, Kind.CREATION));
                            changes.remove(i);
                            return true;
                        }
                        
                        // Creation can not happen as oldIdentifier would be null
                        
                    }
                    if (earlierChange.getKind() == Kind.CHANGE) {
                        if (laterChange.getKind() == Kind.DELETION) {
                            // Just delete it at the first change instead
                            IssueMarkerIdentifier previousId = earlierChange.getOldIdentifier();
                            changes.remove(j);
                            changes.remove(i);
                            changes.add(i, new MarkerChange(previousId, null, Kind.DELETION));
                            return true;
                        }
                        
                        if (laterChange.getKind() == Kind.CHANGE) {
                            // combine changes into one
                            IssueMarkerIdentifier previousId = earlierChange.getOldIdentifier();
                            IssueMarkerIdentifier finalId = laterChange.getNewIdentifier();
                            changes.remove(j);
                            changes.add(j, new MarkerChange(previousId, finalId, Kind.CHANGE));
                            changes.remove(i);
                            return true;
                        }
                        
                        // Creation can not happen as oldIdentifier would be null
                    }
                }
            }
        }
        return false;
    }
    
    private class UpdateWorker extends UIJob {
        private final List<MarkerChange> changes;
        
        public UpdateWorker(List<MarkerChange> changes) {
            super("Marker Update Worker");
            this.changes = changes;
        }
        
        @Override
        public IStatus runInUIThread(IProgressMonitor monitor) {
            int size = this.changes.size();
            monitor.beginTask(this.getName(), size);
            try {
                for (int i = 0; i < size; i++) {
                    if (monitor.isCanceled()) {
                        return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "");
                    }
                    doUpdate(this.changes.get(i));
                    monitor.worked(1);
                }
            } catch (UpdateFailedException e) {
                Activator.logInfo("Marker update failed.", e);
                MarkerUpdater.this.failureHandler.run();
            }
            monitor.done();
            return new Status(IStatus.OK, Activator.PLUGIN_ID, "");
        }
        
        private void doUpdate(MarkerChange change) {
            try {
                switch (change.getKind()) {
                case CREATION:
                    doCreation(change.getNewIdentifier());
                    break;
                case DELETION:
                    doDeletion(change.getOldIdentifier());
                    break;
                case CHANGE:
                    doChange(change.getOldIdentifier(), change.getNewIdentifier());
                    break;
                default:
                    throw new IllegalStateException("Kind is unknwon");
                }
            } catch (CoreException | IllegalStateException e) {
                Activator.logError("Could not update marker", e);
                throw new UpdateFailedException();
            }
        }
        
        private void doDeletion(IssueMarkerIdentifier identifier) throws CoreException {
            IMarker marker = MarkerUpdater.this.registry.getMarker(identifier);
            if (marker != null) {
                if (marker.exists()) {
                    // May not exist any more because eclipse alrady deleted it.
                    // For example when the resource is not available anymore.
                    marker.delete();
                }
                MarkerUpdater.this.registry.remove(identifier);
            } else {
                Activator.logWarning("Marker to delete did not exsist.", null);
                throw new UpdateFailedException();
            }
        }
        
        private void doCreation(IssueMarkerIdentifier identifier) throws CoreException {
            IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(identifier.getLocation());
            for (IFile file : files) {
                if (!file.exists()) {
                    continue;
                }
                if (file.getProject() == null || !file.getProject().isOpen()) {
                    continue;
                }
                
                IMarker marker = file.createMarker(identifier.getMarkerId());
                identifier.setMarkerAttributes(marker);
                IMarker previous = MarkerUpdater.this.registry.put(identifier, marker);
                if (previous != null && previous.exists()) {
                    Activator.logWarning("Marker to create already existed. Will delete old one.", null);
                    previous.delete();
                }
                break; // We are only interested in one marker. Just take the first for now.
            }
            // If creation fails, because no such file was found, just ignore it for now.
            // Maybe eclipse resource is gone again
        }
        
        private void doChange(IssueMarkerIdentifier from, IssueMarkerIdentifier to) throws CoreException {
            if (Objects.equal(from.getLocation(), to.getLocation())
                    && Objects.equal(from.getMarkerId(), to.getMarkerId())) {
                IMarker marker = MarkerUpdater.this.registry.getMarker(from);
                if (marker == null) {
                    // May happen because of a race condition.
                    // To porperly fix this a threadsafe queue of marker changes may be usefull.
                    // But I think the generation of marker changes would also somehow need to be
                    // synchronized.
                    
                    // For now just give up
                    throw new UpdateFailedException();
                }
                to.setMarkerAttributes(marker);
            } else {
                doDeletion(from);
                doCreation(to);
            }
        }
        
    }
    
    private class UpdateFailedException extends RuntimeException {
        /**
         * Generated
         */
        private static final long serialVersionUID = -8681227148615207194L;
        
    }
}
