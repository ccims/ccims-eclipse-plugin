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
package de.unistuttgart.iste.gropius.ei.ui;

/**
 * The keys for the prefrences used by this ui plugin
 * 
 * @author Tim Neumann
 */
public class UiPreferences {
    /** Whether to filter for open issues */
	public final static String ISSUE_FILTER_OPEN = "issue_filter_open"; //$NON-NLS-1$
	
    /** Whether to filter for open issues */
    public final static String ISSUE_FILTER_OWN = "issue_filter_own"; //$NON-NLS-1$
    
    /** The name of the developer */
    public final static String DEVELOPER_NAME = "developer_name"; //$NON-NLS-1$
    
    /** The uri of the backend */
    public final static String BACKEND_URI = "backend_uri"; //$NON-NLS-1$
    
    /** A list of columns to show in the issue list table */
    public final static String ISSUE_LIST_COLUMNS = "issue_list_coloumns"; //$NON-NLS-1$
}
