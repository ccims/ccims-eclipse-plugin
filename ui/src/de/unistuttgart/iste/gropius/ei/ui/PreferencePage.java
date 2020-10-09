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
public class PreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
    
    @Override
    public void init(IWorkbench workbench) {
        setDescription("Preference page for all Gropius EI related preferences");
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
