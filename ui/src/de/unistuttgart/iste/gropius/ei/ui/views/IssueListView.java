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
package de.unistuttgart.iste.gropius.ei.ui.views;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.preference.IPersistentPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;
import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataFactory;
import de.unistuttgart.iste.gropius.ei.ui.Activator;
import de.unistuttgart.iste.gropius.ei.ui.IssueListColumnsHelper;
import de.unistuttgart.iste.gropius.ei.ui.UiPreferences;
import de.unistuttgart.iste.gropius.ei.ui.UiText;

public class IssueListView extends SaveableTableFormView {
    
    private class Actions {
        
        private abstract class BaseAcion extends Action implements IWorkbenchAction {
            public BaseAcion(String text, String toolTipText, ImageDescriptor icon,
                    int style) {
                super(text, style);
                if (toolTipText != null) {
                    this.setToolTipText(toolTipText);
                }
                if (icon != null) {
                    this.setImageDescriptor(icon);
                }
            }
        }
        
        private abstract class PrefAction extends BaseAcion implements IPropertyChangeListener {
            
            private final String prefName;
            
            public PrefAction(String prefName, String text, String toolTipText, ImageDescriptor icon,
                    int style) {
                super(text, toolTipText, icon, style);
                this.prefName = prefName;
                IssueListView.this.store.addPropertyChangeListener(this);
                updateUiFromPreferences(prefName);
                refresh();
            }
            
            @Override
            public void dispose() {
                IssueListView.this.store.removePropertyChangeListener(this);
            }
            
            @Override
            public void run() {
                updatePreferencesFromUi(this.prefName);
                saveStoreIfNeeded();
            }
            
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if (this.prefName.equals(event.getProperty())) {
                    Control control = getControl();
                    if (control != null && !control.isDisposed()) {
                        control.getDisplay().asyncExec(() -> {
                            if (!control.isDisposed()) {
                                updateUiFromPreferences(this.prefName);
                                refresh();
                            }
                        });
                    }
                }
            }
            
            protected abstract void updateUiFromPreferences(String prefName);
            
            protected abstract void updatePreferencesFromUi(String prefName);
        }
        
        private class BooleanPrefAction extends PrefAction {
            
            public BooleanPrefAction(String prefName, String text, String toolTipText, ImageDescriptor icon,
                    int style) {
                super(prefName, text, toolTipText, icon, style);
            }
            
            public BooleanPrefAction(String prefName, String text, String toolTipText, ImageDescriptor icon) {
                this(prefName, text, toolTipText, icon, IAction.AS_CHECK_BOX);
            }
            
            @Override
            protected void updateUiFromPreferences(String prefName) {
                setChecked(IssueListView.this.store.getBoolean(prefName));
            }
            
            @Override
            protected void updatePreferencesFromUi(String prefName) {
                IssueListView.this.store.setValue(prefName, isChecked());
            }
            
        }
        
        private abstract class BooleanListPrefAction extends PrefAction {
            private String entryName;
            
            public BooleanListPrefAction(String prefName, String entryName, String text, String toolTipText,
                    ImageDescriptor icon,
                    int style) {
                super(prefName, text, toolTipText, icon, style);
                this.entryName = entryName;
                // Because we need to ignore this call from superconstructor
                this.updateUiFromPreferences(prefName);
            }
            
            public BooleanListPrefAction(String prefName, String entryName, String text, String toolTipText,
                    ImageDescriptor icon) {
                this(prefName, entryName, text, toolTipText, icon, IAction.AS_CHECK_BOX);
            }
            
            public BooleanListPrefAction(String prefName, String entryName, String toolTipText,
                    ImageDescriptor icon) {
                this(prefName, entryName, entryName, toolTipText, icon);
            }
            
            protected abstract Set<String> getEnabledPrefs(String prefString);
            
            protected abstract String getPrefStringForEnabledPrefs(Set<String> enabledPrefs);
            
            @Override
            protected void updateUiFromPreferences(String prefName) {
                // This method get's called from superconstructor, where entryname is not yet
                // inititalized
                if (this.entryName == null)
                    return;
                setChecked(getEnabledPrefs(IssueListView.this.store.getString(prefName)).contains(this.entryName));
            }
            
            @Override
            protected void updatePreferencesFromUi(String prefName) {
                Set<String> enabledEntries = new HashSet<>(
                        getEnabledPrefs(IssueListView.this.store.getString(prefName)));
                if (isChecked()) {
                    enabledEntries.add(this.entryName);
                } else {
                    enabledEntries.remove(this.entryName);
                }
                
                IssueListView.this.store.setValue(prefName, getPrefStringForEnabledPrefs(enabledEntries));
            }
        }
        
        private BooleanPrefAction showOnlyOpenAction;
        private BooleanPrefAction showOnlyOwnAction;
        private BaseAcion newIssueAction;
        private List<BooleanListPrefAction> tableColumnsActions;
        
        private ImageDescriptor getIcon(String location) {
            try {
                return ImageDescriptor.createFromURL(new URL(location));
            } catch (MalformedURLException e) {
                Activator.handleError(e.getMessage(), e, false);
                return null;
            }
        }
        
        private void createActions() {
            this.showOnlyOpenAction = new BooleanPrefAction(UiPreferences.ISSUE_FILTER_OPEN,
                    UiText.IssueList_ShowOpenOnlyAction_Text, UiText.IssueList_ShowOpenOnlyAction_TooltipText,
                    getIcon("platform:/plugin/org.eclipse.ui/icons/full/elcl16/step_done.png"));
            this.showOnlyOwnAction = new BooleanPrefAction(UiPreferences.ISSUE_FILTER_OWN,
                    UiText.IssueList_ShowOwnOnlyAction_Text, UiText.IssueList_ShowOwnOnlyAction_TooltipText,
                    getIcon("platform:/plugin/" + Activator.PLUGIN_ID + "/icons/star.png"));
            this.newIssueAction = new BaseAcion(UiText.IssueList_AddIssueAction_Text,
                    UiText.IssueList_AddIssueAction_TooltipText,
                    getIcon("platform:/plugin/org.eclipse.ui/icons/full/obj16/add_obj.png"), IAction.AS_PUSH_BUTTON) {
                
                @Override
                public void run() {
                    IssueListView.this.createNewIssue();
                }
                
                @Override
                public void dispose() {
                    // nothing
                }
            };
            this.tableColumnsActions = new ArrayList<>();
            for (String columnName : IssueListColumnsHelper.getIssueStructuralFeatureNames()) {
                this.tableColumnsActions
                        .add(new BooleanListPrefAction(UiPreferences.ISSUE_LIST_COLUMNS, columnName, null, null) {
                            private String lastRecreatedColumns;
                            
                            @Override
                            protected Set<String> getEnabledPrefs(String prefString) {
                                return IssueListColumnsHelper.getEnabledCloumns(prefString);
                            }
                            
                            @Override
                            protected String getPrefStringForEnabledPrefs(Set<String> enabledPrefs) {
                                return IssueListColumnsHelper.getPrefStringFromEnabledColumns(enabledPrefs);
                            }
                            
                            @Override
                            protected void updateUiFromPreferences(String prefName) {
                                super.updateUiFromPreferences(prefName);
                                String currentColumns = IssueListView.this.store.getString(prefName);
                                if (!currentColumns.equals(this.lastRecreatedColumns)) {
                                    
                                    IssueListView.this.recreateComposite();
                                    this.lastRecreatedColumns = currentColumns;
                                }
                            }
                        });
            }
        }
        
        private void setupActionBars(IActionBars actionBars) {
            IToolBarManager toolbar = actionBars.getToolBarManager();
            IMenuManager menu = actionBars.getMenuManager();
            
            menu.add(this.newIssueAction);
            toolbar.add(this.newIssueAction);
            
            toolbar.add(new Separator());
            
            toolbar.add(this.showOnlyOpenAction);
            toolbar.add(this.showOnlyOwnAction);
            
            IMenuManager filtersSubMenu = new MenuManager(UiText.IssueList_FiltersSubMenu_Label);
            menu.add(filtersSubMenu);
            filtersSubMenu.add(this.showOnlyOpenAction);
            filtersSubMenu.add(this.showOnlyOwnAction);
            
            IMenuManager columnsSubmenu = new MenuManager(UiText.IssueList_ColumnsSubMenu_Label);
            menu.add(columnsSubmenu);
            
            for (var action : this.tableColumnsActions) {
                columnsSubmenu.add(action);
            }
        }
    }
    
    private IPersistentPreferenceStore store = Activator.getDefault().getPreferenceStore();
    
    private Actions actions = new Actions();
    
    @Override
    public void createPartControl(Composite parent) {
        super.createPartControl(parent);
        this.actions.createActions();
        this.actions.setupActionBars(this.getViewSite().getActionBars());
    }
    
    public void refresh() {
        getComposite().update(getResource());
    }
    
    public void createNewIssue() {
        CrossComponentIssue newIssue = null;
        for (EObject obj : this.getResource().getContents()) {
            if (obj instanceof CrossComponentIssueManagementSystem) {
                var ccims = (CrossComponentIssueManagementSystem) obj;
                newIssue = GropiusDataFactory.eINSTANCE.createCrossComponentIssue();
                newIssue.setIsOpen(true);
                newIssue.setTitle("New Issue");
                ccims.getManagedCroCoIssues().add(newIssue);
                break;
            }
        }
        
        if (newIssue == null) {
            throw new IllegalStateException("Could not create issue because CCIMS could not be found in resource.");
        }
        refresh();
        setSelection(new StructuredSelection(newIssue));
    }
    
    public Control getControl() {
        return getComposite();
    }
    
    private void saveStoreIfNeeded() {
        if (this.store.needsSaving()) {
            try {
                this.store.save();
            } catch (IOException e) {
                Activator.handleError(e.getMessage(), e, false);
            }
        }
    }
    
}
