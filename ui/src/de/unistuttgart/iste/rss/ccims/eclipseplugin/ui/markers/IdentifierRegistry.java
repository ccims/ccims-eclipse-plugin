/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.markers;

import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Tim Neumann
 *
 */
public class IdentifierRegistry {
    private final Set<IssueMarkerIdentifier> identifiers = new HashSet<>();
    private final Map<URI, Set<IssueMarkerIdentifier>> locationIdentifierMap = new HashMap<>();
    
    private void ensureMapEntryExists(URI location) {
        if (!this.locationIdentifierMap.containsKey(location)) {
            this.locationIdentifierMap.put(location, new HashSet<>());
        }
    }
    
    /**
     * Add an identifier to this registry
     * 
     * @param identifier The identifier to add
     */
    public void add(IssueMarkerIdentifier identifier) {
        this.identifiers.add(identifier);
        ensureMapEntryExists(identifier.getLocation());
        this.locationIdentifierMap.get(identifier.getLocation()).add(identifier);
    }
    
    /**
     * Removes an identifier from this registry
     * 
     * @param identifier The identifier to remove
     */
    public void remove(IssueMarkerIdentifier identifier) {
        this.identifiers.remove(identifier);
        if (this.locationIdentifierMap.containsKey(identifier.getLocation())) {
            this.locationIdentifierMap.get(identifier.getLocation()).remove(identifier);
        }
    }
    
    /**
     * Get all identifiers stored in this registry
     * 
     * @return a list of all identifiers
     */
    public Set<IssueMarkerIdentifier> getIdentifiers() {
        return Set.copyOf(this.identifiers);
    }
    
    /**
     * Get all identifiers for a specific location
     * 
     * @param location The location to geth the identifiers for
     * 
     * @return a list of identifiers for that location
     */
    public Set<IssueMarkerIdentifier> getIdentifiersForLocation(URI location) {
        ensureMapEntryExists(location);
        return Set.copyOf(this.locationIdentifierMap.get(location));
    }
    
    /**
     * Check whetehr the given identifier exists in this registry
     * 
     * @param identifier The indetifier to look for
     * 
     * @return true iff the indetifier exists in this registry
     */
    public boolean contains(IssueMarkerIdentifier identifier) {
        return this.identifiers.contains(identifier);
    }
    
    /**
     * Clears this registry
     */
    public void clear() {
        this.identifiers.clear();
        this.locationIdentifierMap.clear();
    }
}
