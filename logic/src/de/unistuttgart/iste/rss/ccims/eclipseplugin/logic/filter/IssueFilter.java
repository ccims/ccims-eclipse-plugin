package de.unistuttgart.iste.rss.ccims.eclipseplugin.logic.filter;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;

/**
 * The interface of filters for cross component issues
 * @author Tim Neumann
 */
public interface IssueFilter {
	boolean matches(CrossComponentIssue issue);
}
