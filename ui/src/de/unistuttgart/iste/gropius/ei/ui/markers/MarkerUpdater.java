/**
 * Copyright (C) 2020, Tim Neumann <neumantm@fius.informatik.uni-stuttgart.de>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.unistuttgart.iste.gropius.ei.ui.markers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.progress.UIJob;

import de.unistuttgart.iste.gropius.ei.ui.Activator;
import de.unistuttgart.iste.gropius.ei.ui.UriHelper;

/**
 * Class responsible for updating the markers
 * 
 * @author Tim Neumann
 */
public class MarkerUpdater {
    private static final long MILLISECONDS_TO_WAIT_UNTIL_UPDATE = 500;
    
    private final ScheduledExecutorService executorService;
    private final MarkerRegistry registry;
    
    private ScheduledFuture<?> updateFuture;
    
    /**
     * Create new marker updater
     * 
     * @param markerRegistry The marker registry to use.
     */
    public MarkerUpdater(MarkerRegistry markerRegistry) {
        this.executorService = Executors.newSingleThreadScheduledExecutor(r -> new Thread(r, "MarkerUpdateCollector"));
        this.registry = markerRegistry;
    }
    
    /**
     * Update all issue markers
     * <p>
     * This method only schedules an update, so it may not be done immediatly.
 * @param dataSupplier Supplier of IssueMarkerIdentifiers
     */
    public void updateMarkers(Supplier<List<IssueMarkerIdentifier>> dataSupplier) {
        if (this.updateFuture != null && ! this.updateFuture.isDone()) {
            this.updateFuture.cancel(false);
        }
                
        this.updateFuture = this.executorService.schedule(() -> {
            List<IssueMarkerIdentifier> target = dataSupplier.get();
            List<IssueMarkerIdentifier> current = this.registry.getKeys();
            
            List<IssueMarkerIdentifier> toRemove = new ArrayList<>();
            List<IssueMarkerIdentifier> toAdd = new ArrayList<>();
            for (IssueMarkerIdentifier identifier : current) {
                if (!target.contains(identifier)) {
                    toRemove.add(identifier);
                }
            }
            
            for (IssueMarkerIdentifier identifier : target) {
                if (!current.contains(identifier) || !this.registry.getMarker(identifier).exists()) {
                    toAdd.add(identifier);
                }
            }
            
            UpdateWorker worker = new UpdateWorker(toAdd, toRemove);
            worker.schedule();
            try {
                worker.join();
            } catch (InterruptedException e) {
                Activator.logWarning("Marker Update Collector Thread interuppted", e);
            }
            
        }, MILLISECONDS_TO_WAIT_UNTIL_UPDATE, TimeUnit.MILLISECONDS);
    }
    
    private class UpdateWorker extends UIJob {
        private final List<IssueMarkerIdentifier> toAdd;
        private final List<IssueMarkerIdentifier> toRemove;
        
        public UpdateWorker(List<IssueMarkerIdentifier> toAdd, List<IssueMarkerIdentifier> toRemove) {
            super("Marker Update Worker");
            this.toAdd = toAdd;
            this.toRemove = toRemove;
        }
        
        @Override
        public IStatus runInUIThread(IProgressMonitor monitor) {
            int size = this.toRemove.size() + this.toAdd.size();
            monitor.beginTask(this.getName(), size);
            for (IssueMarkerIdentifier identifier : this.toRemove) {
                try {
                    doDeletion(identifier);
                } catch (CoreException e) {
                    Activator.logWarning("Failed to delete marker", e);
                }
                monitor.worked(1);
            }
            
            for (IssueMarkerIdentifier identifier : this.toAdd) {
                try {
                    doCreation(identifier);
                } catch (CoreException e) {
                    Activator.logWarning("Failed to create marker", e);
                }
                monitor.worked(1);
            }
            
            monitor.done();
            return new Status(IStatus.OK, Activator.PLUGIN_ID, "");
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
            }
        }
        
        private void doCreation(IssueMarkerIdentifier identifier) throws CoreException {
            IResource resource = UriHelper.findResource(identifier.getLocation());
            
            if (!resource.exists() || (resource.getProject() != null && !resource.getProject().isOpen())) {
                // If resource has no project, the resource is worksapce root.
                // For worspace root wo do create a marker.
                return;
            }
            doCreation(resource, identifier);
        }
        
        private void doCreation(IResource resource, IssueMarkerIdentifier identifier) throws CoreException {
            IMarker marker = resource.createMarker(identifier.getMarkerId());
            identifier.setMarkerAttributes(marker);
            IMarker previous = MarkerUpdater.this.registry.put(identifier, marker);
            if (previous != null && previous.exists()) {
                Activator.logWarning("Marker to create already existed. Will delete old one.", null);
                previous.delete();
            }
        }
    }
}
