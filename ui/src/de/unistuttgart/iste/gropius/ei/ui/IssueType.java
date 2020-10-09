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
package de.unistuttgart.iste.gropius.ei.ui;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;

/**
 * @author Tim Neumann
 *
 */
public enum IssueType {
    /** A new/open bug */
    BUG_NEW,
    /** A bug that is beeing worked on */
    BUG_WIP,
    /** A finished/closed bug */
    BUG_DONE,
    /** A new/open enhancement */
    ENHANCEMENT_NEW,
    /** A enhancement that is beeing worked on */
    ENHANCEMENT_WIP,
    /** A finished/closed enhancement */
    ENHANCEMENT_DONE;
    
    /**
     * @return the name of this type
     */
    public String getIssueTypeName() {
        return name().toLowerCase();
    }
    
    /**
     * Get the issue type of the given issue
     * 
     * @param issue The issue to get the type from
     * 
     * @return The issue type of the given issue
     */
    public static IssueType getTypeOfIssue(CrossComponentIssue issue) {
        if (issue.getLabels().stream().map(l -> l.getName()).anyMatch(n -> n.toLowerCase().equals("enhancement"))) {
            if (issue.isIsOpen()) {
                if (issue.getLabels().stream().map(l -> l.getName()).anyMatch(n -> n.toLowerCase().equals("wip"))) {
                    return ENHANCEMENT_WIP;
                }
                return ENHANCEMENT_NEW;
                
            }
            return ENHANCEMENT_DONE;
        }
        if (issue.isIsOpen()) {
            if (issue.getLabels().stream().map(l -> l.getName()).anyMatch(n -> n.toLowerCase().equals("wip"))) {
                return BUG_WIP;
            }
            return BUG_NEW;
            
        }
        return BUG_DONE;
    }
}
