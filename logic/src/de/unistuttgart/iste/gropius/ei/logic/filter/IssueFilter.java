package de.unistuttgart.iste.gropius.ei.logic.filter;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;

/**
 * The interface of filters for cross component issues
 * @author Tim Neumann
 */
public interface IssueFilter {
	boolean matches(CrossComponentIssue issue);
}
