package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;

public class LabelIconProvider {
    public static String getIconFor(CrossComponentIssue issue, int scale) {
        StringBuilder file = new StringBuilder();
        if (issue.getLabels().stream().map(l -> l.getName()).anyMatch(n -> n.toLowerCase().equals("enhancement"))) {
            file.append("enhancement_");
        } else {
            file.append("bug_");
        }
        if (issue.isIsOpen()) {
            if (issue.getLabels().stream().map(l -> l.getName()).anyMatch(n -> n.toLowerCase().equals("wip"))) {
                file.append("wip");
            } else {
                file.append("new");
            }
            
        } else {
            file.append("done");
        }
        
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
