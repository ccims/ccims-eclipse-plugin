/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.markers;

/**
 * Represents a required change of a marker
 * 
 * @author Tim Neumann
 */
public class MarkerChange {
    
    /**
     * The kind of marker change required
     */
    public enum Kind {
        /**
         * The marker should be cretaed
         */
        CREATION,
        /**
         * The marker should be deleted
         */
        DELETION,
        /**
         * The maker shuld be changed
         */
        CHANGE;
    }
    
    private final IssueMarkerIdentifier oldIdentifier;
    private final IssueMarkerIdentifier newIdentifier;
    private final Kind kind;
    
    /**
     * Cretae a new marker change
     * 
     * @param oldIdentifier the old marker identifier or null if this is a creation
     * @param newIdentifier the new marker identifier or null if this is a deletion
     * @param kind          The kind of marker change
     */
    public MarkerChange(IssueMarkerIdentifier oldIdentifier, IssueMarkerIdentifier newIdentifier, Kind kind) {
        this.oldIdentifier = oldIdentifier;
        this.newIdentifier = newIdentifier;
        this.kind = kind;
    }
    
    /**
     * @return the oldIdentifier or null if this is a creation
     */
    public IssueMarkerIdentifier getOldIdentifier() {
        return this.oldIdentifier;
    }
    
    /**
     * @return the newIdentifier or null if this is deletion
     */
    public IssueMarkerIdentifier getNewIdentifier() {
        return this.newIdentifier;
    }
    
    /**
     * @return the kind of the marker change
     */
    public Kind getKind() {
        return this.kind;
    }
}
