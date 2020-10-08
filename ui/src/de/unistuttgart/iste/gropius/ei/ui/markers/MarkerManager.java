/**
 * 
 */
package de.unistuttgart.iste.gropius.ei.ui.markers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.resource.ResourceLoader;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;
import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.gropius.ei.data.Location;
import de.unistuttgart.iste.gropius.ei.ui.Activator;

/**
 * Manager for the markers.
 * <p>
 * Uses a {@link MarkerRegistry} to store its markers.
 * 
 * @author Tim Neumann
 */
public class MarkerManager {
    private final MarkerUpdater updater;
    private final ResourceLoader resourceLoader;
    private final EditingDomain editingDomain;
    
    private Resource resource;
    
    private List<IssueMarkerIdentifier> currentIdentifiers = new ArrayList<>();
    
    /**
     * Create a new marker manager using the given registry and the resource at the
     * given uri
     * 
     * @param registry       The registry to use
     * @param resourceLoader The resource loader to use
     * @param editingDomain  The editing domain to sue
     * @param resourceUri    The uri to the emf resource to load the data from
     */
    public MarkerManager(MarkerRegistry registry, ResourceLoader resourceLoader, EditingDomain editingDomain,
            URI resourceUri) {
        this.updater = new MarkerUpdater(registry);
        this.resourceLoader = resourceLoader;
        this.editingDomain = editingDomain;
        
        ResourcesPlugin.getWorkspace().addResourceChangeListener(new IResourceChangeListener() {
            @Override
            public void resourceChanged(IResourceChangeEvent event) {
                processChangesForDelta(event.getDelta());
            }
            
            private void processChangesForDeltas(IResourceDelta[] deltas) {
                for (IResourceDelta delta : deltas) {
                    processChangesForDelta(delta);
                }
            }
            
            private void processChangesForDelta(IResourceDelta delta) {
                processChangesForDeltas(delta.getAffectedChildren());
                if (delta.getResource().getType() != IResource.FILE)
                    return;
                switch (delta.getKind()) {
                case IResourceDelta.ADDED:
                case IResourceDelta.REMOVED:
                    updateMarkers(false);
                    break;
                default:
                    // nothing
                }
            }
        }, IResourceChangeEvent.POST_CHANGE);
        
        this.resource = this.resourceLoader.getResource(this.editingDomain, resourceUri).getResource();
        EContentAdapter adapter = new EContentAdapter() {
            @Override
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
                if (notification.getNotifier() instanceof CrossComponentIssue) {
                    updateMarkers(true);
                } else if (notification.getNotifier() instanceof Location) {
                    updateMarkers(true);
                }
            }
        };
        
        updateMarkers(true);
        this.resource.getResourceSet().eAdapters().add(adapter);
    }
    
    private void updateMarkers(final boolean updateIdentifiers) {
        this.updater.updateMarkers(() -> {
            synchronized (this.currentIdentifiers) {
                if (updateIdentifiers) {
                    this.currentIdentifiers.clear();
                    for (EObject obj : this.resource.getContents()) {
                        try {
                            loadAllFromResourceRootObject(obj);
                        } catch (IllegalStateException e) {
                            Activator.logWarning(
                                    "Error while loading markers. Continuing with next EObject in EResource.", e);
                        }
                    }
                }
                return List.copyOf(this.currentIdentifiers);
            }
        });
    }
    
    private void loadAllFromResourceRootObject(EObject obj) {
        if (!(obj instanceof CrossComponentIssueManagementSystem)) {
            throw new IllegalStateException("Object is not a CrossComponentIssueManagementSystem");
        }
        CrossComponentIssueManagementSystem ccims = (CrossComponentIssueManagementSystem) obj;
        for (CrossComponentIssue issue : ccims.getManagedCroCoIssues()) {
            loadIssue(issue);
        }
    }
    
    private void loadIssue(CrossComponentIssue issue) {
        for (Location location : issue.getLocations()) {
            synchronized (this.currentIdentifiers) {
                this.currentIdentifiers.add(IssueMarkerIdentifier.createIdentifierForIssueLocation(location));
            }
        }
    }
}
