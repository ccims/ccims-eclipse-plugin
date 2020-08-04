package de.unistuttgart.iste.rss.ccims.eclipseplugin.logic.filter;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;

public class OpenFilter implements IssueFilter {
	@Override
	public boolean matches(CrossComponentIssue issue) {
		return issue.isIsOpen();
	}
}
