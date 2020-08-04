package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui;

import org.eclipse.osgi.util.NLS;

/**
 * Text resources for the plugin.
 */
public class UiText extends NLS {
	private static final String BUNDLE_NAME = "de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.uitext"; //$NON-NLS-1$
	
	static {
		initializeMessages(BUNDLE_NAME, UiText.class);
	}
	
	/** */
	public static String IssueList_ShowOpenOnlyAction_Text;

	/** */
	public static String IssueList_ShowOpenOnlyAction_TooltipText;
	
	/** */
	public static String IssueList_FiltersSubMenu_Label;
}
