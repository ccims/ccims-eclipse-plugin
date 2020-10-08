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
