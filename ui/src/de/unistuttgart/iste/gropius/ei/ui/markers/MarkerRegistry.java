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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IMarker;

import de.unistuttgart.iste.gropius.ei.data.Location;

/**
 * Registry where {@link IMarker}s are stored for {@link Location}s.
 * <p>
 * All methods are synchronized on the MarkerRegistry object
 * 
 * @author Tim Neumann
 */
public class MarkerRegistry {
    private final Map<IssueMarkerIdentifier, IMarker> markers = new HashMap<>();
    
    /**
     * Put the given marker into the registry for the given identifier.
     * 
     * @param identifier The identifier
     * @param marker     The marker
     * 
     * @return The previous value
     */
    protected synchronized IMarker put(IssueMarkerIdentifier identifier, IMarker marker) {
        return this.markers.put(identifier, marker);
    }
    
    /**
     * Remove the entry for the given identifier
     * 
     * @param identifier The identifier
     * 
     * @return the marker associated with the {@code identifier}, or {@code null} if
     *         there was no marker for {@code identifier}.
     */
    protected synchronized IMarker remove(IssueMarkerIdentifier identifier) {
        return this.markers.remove(identifier);
    }
    
    /**
     * Get the marker for the given identifier
     * 
     * @param identifier The identifier to get the marker for
     * 
     * @return The marker for that identifier or null
     */
    public synchronized IMarker getMarker(IssueMarkerIdentifier identifier) {
        return this.markers.get(identifier);
    }
    
    /**
     * Check whetehr the given identifier exists in this registry
     * 
     * @param identifier The indetifier to look for
     * 
     * @return true iff the indetifier exists in this registry
     */
    public synchronized boolean contains(IssueMarkerIdentifier identifier) {
        return this.markers.containsKey(identifier);
    }
    
    public synchronized List<IssueMarkerIdentifier> getKeys() {
        return List.copyOf(this.markers.keySet());
    }
    
}
