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

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;

public class OpenFilter implements IssueFilter {
	@Override
	public boolean matches(CrossComponentIssue issue) {
		return issue.isIsOpen();
	}
}
