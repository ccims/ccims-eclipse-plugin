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
}
