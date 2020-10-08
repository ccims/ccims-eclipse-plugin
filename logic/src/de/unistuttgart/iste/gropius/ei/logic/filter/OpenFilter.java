package de.unistuttgart.iste.gropius.ei.logic.filter;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;

public class OpenFilter implements IssueFilter {
	@Override
	public boolean matches(CrossComponentIssue issue) {
		return issue.isIsOpen();
	}
}
