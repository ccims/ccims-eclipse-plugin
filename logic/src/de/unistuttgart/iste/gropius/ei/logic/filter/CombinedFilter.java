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
package de.unistuttgart.iste.gropius.ei.logic.filter;

import java.util.Arrays;
import java.util.List;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;

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
