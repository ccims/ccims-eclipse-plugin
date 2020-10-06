package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * The main preference page
 * 
 * @author Tim Neumann
 */
public class CcimsPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
    
    @Override
    public void init(IWorkbench workbench) {
        setDescription("Preference page for all CCIMS related preferences");
        setPreferenceStore(Activator.getDefault().getPreferenceStore());
    }
    
    @Override
    protected void createFieldEditors() {
        addField(new StringFieldEditor(UiPreferences.DEVELOPER_NAME, UiText.PreferencePage_DeveloperName_Label,
                getFieldEditorParent()));
        addField(getStringFieldEditorWithToolTip(UiPreferences.BACKEND_URI,
                UiText.PreferencePage_BackendUri_Label, getFieldEditorParent(),
                UiText.PreferencePage_BackendUri_TooltipText));
    }
    
    private static StringFieldEditor getStringFieldEditorWithToolTip(String name, String label, Composite parent,
            String tooltipText) {
        StringFieldEditor editor = new StringFieldEditor(name,
                label, parent);
        editor.getTextControl(parent).setToolTipText(tooltipText);
        return editor;
    }
    
}
