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

import java.net.URI;
import java.util.Objects;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;
import de.unistuttgart.iste.gropius.ei.data.Location;
import de.unistuttgart.iste.gropius.ei.ui.IssueType;

/**
 * An imutable class with all information uniquely identifying an issue marker.
 * 
 * @author Tim Neumann
 */
public class IssueMarkerIdentifier {
    
    /**
     * The marker attribute key for the issue marker identifier, as defined in the
     * plugin xml.
     */
    public static final String MARKER_ATTRIBUTE_KEY_ISSUE_MARKER_IDENTIFIER = "issueMarkerIdentifier";
    private static final String MARKER_ID_BASE = "de.unistuttgart.iste.gropius.ei.ui.markers";
    
    /**
     * Create an issue marker identifier from the given issue location and issue
     * <p>
     * The resulting issue marker identifier will be at the given location and have
     * attributes based on the given isssue
     * 
     * @param location The issue location to create the identifier from
     * 
     * @return The created issue marker identifier
     * 
     * @throws IllegalStateException if the location is not contained in an issue
     */
    public static IssueMarkerIdentifier createIdentifierForIssueLocation(Location location) {
        if (location.eContainer() == null || !(location.eContainer() instanceof CrossComponentIssue)) {
            throw new IllegalStateException("Location is not contained in an issue");
        }
        CrossComponentIssue issue = (CrossComponentIssue) location.eContainer();
        return new IssueMarkerIdentifier(location.getResourcePath(), location.getLine(), issue.getTitle(),
                IssueType.getTypeOfIssue(issue));
    }
    
    private final URI location;
    private final int line;
    private final String title;
    private final IssueType type;
    
    /**
     * Create a new marker identifier with the given data
     * 
     * @param location The location of the marker
     * @param line     The line of the marker
     * @param title    The title of the marker
     * @param type     The type of the marker
     */
    public IssueMarkerIdentifier(final URI location, final int line, final String title, final IssueType type) {
        this.location = location;
        this.line = line;
        this.title = title;
        this.type = type;
    }
    
    /**
     * @return the marker id for the marker identified by this
     */
    public String getMarkerId() {
        return MARKER_ID_BASE + "." + getType().getIssueTypeName();
    }
    
    /**
     * Set the attributes of the given marker according to this idetifier
     * 
     * @param marker The marker the set the attributes for
     * 
     * @throws CoreException if this method fails. Reasons include:
     *                       <ul>
     *                       <li>This marker does not exist.</li>
     *                       <li>Resource changes are disallowed during certain
     *                       types of resource change event notification. See
     *                       <code>IResourceChangeEvent</code> for more
     *                       details.</li>
     *                       </ul>
     */
    public void setMarkerAttributes(IMarker marker) throws CoreException {
        marker.setAttribute(IMarker.MESSAGE, getTitle());
        if (getLine() > 0) {
            marker.setAttribute(IMarker.LINE_NUMBER, getLine());
        }
        marker.setAttribute(MARKER_ATTRIBUTE_KEY_ISSUE_MARKER_IDENTIFIER, this);
    }
    
    /**
     * @return the location
     */
    public URI getLocation() {
        return this.location;
    }
    
    /**
     * @return the line
     */
    public int getLine() {
        return this.line;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return this.title;
    }
    
    /**
     * @return the type
     */
    public IssueType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.line, this.location, this.title, this.type);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IssueMarkerIdentifier)) {
            return false;
        }
        IssueMarkerIdentifier other = (IssueMarkerIdentifier) obj;
        return this.line == other.line && Objects.equals(this.location, other.location)
                && Objects.equals(this.title, other.title)
                && this.type == other.type;
    }
}
