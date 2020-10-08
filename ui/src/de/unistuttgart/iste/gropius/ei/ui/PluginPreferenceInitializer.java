/**
 * 
 */
package de.unistuttgart.iste.gropius.ei.ui;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @author Tim Neumann
 *
 */
public class PluginPreferenceInitializer extends AbstractPreferenceInitializer {
    
    @Override
    public void initializeDefaultPreferences() {
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        store.setDefault(UiPreferences.ISSUE_LIST_COLUMNS, "title;labels");
        store.setDefault(UiPreferences.BACKEND_URI, "file:///${user_home}/MyIssues.issues");
    }
    
}
