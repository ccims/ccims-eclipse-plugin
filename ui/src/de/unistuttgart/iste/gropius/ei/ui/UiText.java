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

import org.eclipse.osgi.util.NLS;

/**
 * Text resources for the plugin.
 */
public class UiText extends NLS {
    private static final String BUNDLE_NAME = "de.unistuttgart.iste.gropius.ei.ui.uitext"; //$NON-NLS-1$
	
	static {
		initializeMessages(BUNDLE_NAME, UiText.class);
	}
	
	/** */
	public static String IssueList_ShowOpenOnlyAction_Text;

	/** */
	public static String IssueList_ShowOpenOnlyAction_TooltipText;
	
	/** */
    public static String IssueList_ShowOwnOnlyAction_Text;
    
    /** */
    public static String IssueList_ShowOwnOnlyAction_TooltipText;
    
    /** */
	public static String IssueList_FiltersSubMenu_Label;
    
    /** */
    public static String IssueList_ColumnsSubMenu_Label;
    
    /** */
    public static String PreferencePage_DeveloperName_Label;
    
    /** */
    public static String PreferencePage_BackendUri_Label;
    
    /** */
    public static String PreferencePage_BackendUri_TooltipText;
    
    /** */
    public static String FeatureEditorElementCreatorDialog_Creation_Label;
    
    /** */
    public static String FeatureEditorElementCreatorDialog_Button_New_Text;
}
