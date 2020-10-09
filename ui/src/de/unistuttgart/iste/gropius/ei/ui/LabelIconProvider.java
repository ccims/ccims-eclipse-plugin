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

public class LabelIconProvider {
    public static String getIconFor(CrossComponentIssue issue, int scale) {
        StringBuilder file = new StringBuilder(IssueType.getTypeOfIssue(issue).getIssueTypeName());
        
        String developerName = Activator.getDefault().getPreferenceStore().getString(UiPreferences.DEVELOPER_NAME);
        if(issue.getAssignees().stream().map(a -> a.getName()).anyMatch(n -> n.equals(developerName))) {
            file.append("_LL_star");
        }

        if (scale > 1) {
            file.append("@");
            file.append(scale);
            file.append("x");
        }
        
        file.append(".png");
        return file.toString();
    }
    
}
