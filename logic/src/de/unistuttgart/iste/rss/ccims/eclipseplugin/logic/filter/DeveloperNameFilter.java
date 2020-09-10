/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.logic.filter;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer;

/**
 * Filter accepting all issues where an assigne has the given name
 * 
 * @author Tim Neumann
 */
public class DeveloperNameFilter implements IssueFilter {
    
    private String name;
    
    /**
     * Create new seveloper name filter with the given name.
     * 
     * @param name The name to look for
     */
    public DeveloperNameFilter(String name) {
        this.name = name;
    }
    
    @Override
    public boolean matches(CrossComponentIssue issue) {
        return issue.getAssignees().stream().map(Developer::getName).anyMatch(n -> n.equals(this.name));
    }
    
}
