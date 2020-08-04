package de.unistuttgart.iste.rss.ccims.eclipseplugin.logic.filter;

import java.util.Arrays;
import java.util.List;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;

public class CombinedFilter implements IssueFilter {

	private final List<IssueFilter> containedFilters;

	public CombinedFilter(List<? extends IssueFilter> containedFilters) {
		this.containedFilters = List.copyOf(containedFilters);
	}

	public CombinedFilter(IssueFilter... containedFilters) {
		this.containedFilters = Arrays.asList(containedFilters);
	}

	@Override
	public boolean matches(CrossComponentIssue issue) {
		return containedFilters.stream().allMatch(filter -> filter.matches(issue));
	}

}
