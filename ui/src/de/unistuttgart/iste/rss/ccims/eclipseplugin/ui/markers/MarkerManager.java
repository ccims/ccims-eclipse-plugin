/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.markers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.resource.ResourceLoader;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.util.CrossComponentIssueCopier;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.util.LocationCopier;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.Activator;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.markers.MarkerChange.Kind;

/**
 * Manager for the markers.
 * <p>
 * Uses a {@link MarkerRegistry} to store its markers.
 * 
 * @author Tim Neumann
 */
public class MarkerManager {
    private final MarkerRegistry markerRegistry;
    private final IdentifierRegistry identifierRegistry;
    private final MarkerUpdater updater;
    private final ResourceLoader resourceLoader;
    private final EditingDomain editingDomain;
    
    private Resource resource;
    
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
        this.markerRegistry = registry;
        this.identifierRegistry = new IdentifierRegistry();
        this.updater = new MarkerUpdater(registry, this::reloadAndRecreateAllMarkers);
        this.resourceLoader = resourceLoader;
        this.editingDomain = editingDomain;
        
        ResourcesPlugin.getWorkspace().addResourceChangeListener(new IResourceChangeListener() {
            @Override
            public void resourceChanged(IResourceChangeEvent event) {
                try {
                    processChangesForDelta(event.getDelta());
                } catch (IssueMarkerIllegalStateException e) {
                    Activator.logWarning("The issue marker data was in an illegal state. Reloading all markers", e);
                    reloadAndRecreateAllMarkers();
                }
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
                    checkUriAndCreateMarkersIfNeeded(delta.getResource().getLocationURI());
                    break;
                case IResourceDelta.REMOVED:
                    removeAllMarkersFromLocation(delta.getResource().getLocationURI());
                    break;
                default:
                    // nothing
                }
            }
        }, IResourceChangeEvent.POST_CHANGE);
        
        this.resource = this.resourceLoader.getResource(this.editingDomain, resourceUri).getResource();
        EContentAdapter adapter = new EContentAdapter() {
            @SuppressWarnings("unchecked")
            @Override
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
                if (notification.getNotifier() instanceof CrossComponentIssue) {
                    CrossComponentIssue issue = (CrossComponentIssue) notification.getNotifier();
                    int featureId = notification.getFeatureID(
                            CrossComponentIssue.class);
                    if (featureId == CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE__LOCATIONS) {
                        List<Location> locations;
                        switch (notification.getEventType()) {
                        case Notification.ADD_MANY:
                            locations = (List<Location>) notification.getNewValue();
                            for (Location location : locations) {
                                addMarkerIdentifierForLocation(location);
                            }
                            break;
                        case Notification.ADD:
                            addMarkerIdentifierForLocation((Location) notification.getNewValue());
                            break;
                        case Notification.REMOVE_MANY:
                            locations = (List<Location>) notification.getNewValue();
                            for (Location location : locations) {
                                removeMarkerIdentifierForLocation(location);
                            }
                            break;
                        case Notification.REMOVE:
                            removeMarkerIdentifierForLocation((Location) notification.getNewValue());
                            break;
                        default:
                            // Nothing
                        }
                    } else {
                        CrossComponentIssueCopier copier = new CrossComponentIssueCopier(issue);
                        CrossComponentIssue oldIssue = copier.getCopy();
                        oldIssue.eSet((EStructuralFeature) notification.getFeature(), notification.getOldValue());
                        List<MarkerChange> changes = new ArrayList<>();
                        for (int i = 0; i < issue.getLocations().size(); i++) {
                            var oldI = IssueMarkerIdentifier
                                    .createIdentifierForIssueLocation(oldIssue.getLocations().get(i));
                            var newI = IssueMarkerIdentifier
                                    .createIdentifierForIssueLocation(issue.getLocations().get(i));
                            changes.add(new MarkerChange(oldI, newI, Kind.CHANGE));
                        }
                        copier.resetCopy();
                        MarkerManager.this.updater.updateMarkers(changes);
                    }
                } else if (notification.getNotifier() instanceof Location) {
                    Location location = (Location) notification.getNotifier();
                    LocationCopier copier = new LocationCopier(location);
                    Location oldLocation = copier.getCopy();
                    oldLocation.eSet((EStructuralFeature) notification.getFeature(), notification.getOldValue());
                    var oldI = IssueMarkerIdentifier.createIdentifierForIssueLocation(oldLocation);
                    var newI = IssueMarkerIdentifier.createIdentifierForIssueLocation(location);
                    MarkerChange change = new MarkerChange(oldI, newI, Kind.CHANGE);
                    copier.resetCopy();
                    MarkerManager.this.updater.updateMarkers(Arrays.asList(change));
                }
            }
        };

        loadAll();
        this.resource.getResourceSet().eAdapters().add(adapter);
    }
    
    /**
     * Updates the markers from the resource
     */
    private void loadAll() {
        for (EObject obj : this.resource.getContents()) {
            try {
                loadAllFromResourceRootObject(obj);
            } catch (IllegalStateException e) {
                Activator.logWarning("Error while loading markers. Continuing with next EObject in EResource.", e);
            }
        }
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
            addMarkerIdentifierForLocation(location);
            
        }
    }
    
    /**
     * Deletes all markers, reloads the data and recreates all markers
     */
    protected void reloadAndRecreateAllMarkers() {
        for (IssueMarkerIdentifier id : this.identifierRegistry.getIdentifiers()) {
            removeMarkerIfNeeded(id);
        }
        this.identifierRegistry.clear();
        loadAll();
    }
    
    private void addMarkerIdentifierForLocation(Location location) {
        IssueMarkerIdentifier id = IssueMarkerIdentifier.createIdentifierForIssueLocation(location);
        addMarkerIdentifier(id);
    }
    
    private void addMarkerIdentifier(IssueMarkerIdentifier identifier) {
        synchronized (this.markerRegistry) {
            if (this.identifierRegistry.contains(identifier)) {
                Activator.logWarning("IssueMarkerIdentifier already exists. Ignoring", null);
                return;
            }
            this.identifierRegistry.add(identifier);
            this.updater.updateMarkers(Arrays.asList(new MarkerChange(null, identifier, Kind.CREATION)));
        }
    }
    
    private void removeMarkerIdentifierForLocation(Location location) {
        IssueMarkerIdentifier id = IssueMarkerIdentifier.createIdentifierForIssueLocation(location);
        removeMarkerIdentifier(id);
    }
    
    private void removeMarkerIdentifier(IssueMarkerIdentifier identifier) {
        synchronized (this.markerRegistry) {
            if (!this.identifierRegistry.contains(identifier)) {
                Activator.logWarning("IssueMarkerIdentifier to remove does not exist.", null);
                return;
            }
            this.identifierRegistry.remove(identifier);
            this.updater.updateMarkers(Arrays.asList(new MarkerChange(identifier, null, Kind.DELETION)));
        }
    }
    
    private void checkMarkerIdentifierIsRegistered(IssueMarkerIdentifier identifier) {
        if (!this.identifierRegistry.contains(identifier)) {
            throw new IssueMarkerIllegalStateException("Identfier not registered.");
        }
    }
    
    private void createMarkerIfNeeded(IssueMarkerIdentifier identifier) {
        synchronized (this.markerRegistry) {
            checkMarkerIdentifierIsRegistered(identifier);
            if (!this.markerRegistry.contains(identifier)) {
                this.updater.updateMarkers(Arrays.asList(new MarkerChange(null, identifier, Kind.CREATION)));
            }
        }
    }
    
    private void checkUriAndCreateMarkersIfNeeded(java.net.URI location) {
        for (IssueMarkerIdentifier identifier : MarkerManager.this.identifierRegistry
                .getIdentifiersForLocation(location)) {
            createMarkerIfNeeded(identifier);
        }
    }
    
    private void removeMarkerIfNeeded(IssueMarkerIdentifier identifier) {
        synchronized (this.markerRegistry) {
            checkMarkerIdentifierIsRegistered(identifier);
            if (this.markerRegistry.contains(identifier)) {
                this.updater.updateMarkers(Arrays.asList(new MarkerChange(identifier, null, Kind.DELETION)));
            }
        }
    }
    
    private void removeAllMarkersFromLocation(java.net.URI location) {
        for (IssueMarkerIdentifier identifier : MarkerManager.this.identifierRegistry
                .getIdentifiersForLocation(location)) {
            removeMarkerIfNeeded(identifier);
        }
    }
    
}
