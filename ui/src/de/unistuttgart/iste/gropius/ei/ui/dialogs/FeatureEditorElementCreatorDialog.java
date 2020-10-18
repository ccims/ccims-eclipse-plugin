/**
 * Copyright (C) 2020, Tim Neumann <neumantm@fius.informatik.uni-stuttgart.de>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * <p>
 * Based on org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog.
 * It had these contributors there:
 * 
 * Copyright (c) 2002-2009 IBM Corporation and others.
 * </p>
 */
package de.unistuttgart.iste.gropius.ei.ui.dialogs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.parsley.composite.FormDetailComposite;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.JFaceColors;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

import de.unistuttgart.iste.gropius.ei.ui.UiText;

/**
 * A dialog for editing a feature while creating new contents for the feature on the fly.
 * <p>
 * Based on {@link org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog}
 * 
 * @author Tim Neumann
 */
public class FeatureEditorElementCreatorDialog extends Dialog {
    private final ILabelProvider labelProvider;
    private final IContentProvider contentProvider;
    private final Object object;
    private final String displayName;
    private final ItemProvider values;
    private final FormFactory formFactory;
    private final Adapter objectEditedAdapter;
    private final Supplier<EObject> newObjectSupplier;
    
    private TableViewer featureTableViewer;
    private FormDetailComposite formComposite;
    private EObject objectBeingEdited;
    
    private EList<?> result;
    
    /**
     * Create a new feature editor element creator dialog.
     * 
     * @param parent            The parent shell
     * @param labelProvider     The label provider to use
     * @param formFactory       The form factory to use
     * @param object            The object to edit
     * @param currentValues     The current values
     * @param newObjectSupplier A supplier of new objects for the feature
     * @param displayName       The display name of the dialog
     */
    public FeatureEditorElementCreatorDialog(Shell parent,
            ILabelProvider labelProvider,
            FormFactory formFactory,
            Object object,
            List<?> currentValues,
            Supplier<EObject> newObjectSupplier,
            String displayName) {
        super(parent);
        setShellStyle(getShellStyle() | SWT.RESIZE | SWT.MAX);
        this.labelProvider = labelProvider;
        this.formFactory = formFactory;
        this.object = object;
        this.displayName = displayName;
        this.newObjectSupplier = newObjectSupplier;
        
        AdapterFactory adapterFactory = new ComposedAdapterFactory(Collections.<AdapterFactory>emptyList());
        this.values = new ItemProvider(adapterFactory, currentValues);
        this.contentProvider = new AdapterFactoryContentProvider(adapterFactory);
        
        this.objectEditedAdapter = new AdapterImpl() {
            @Override
            public void notifyChanged(Notification msg) {
                super.notifyChanged(msg);
                if (FeatureEditorElementCreatorDialog.this.featureTableViewer != null) {
                    FeatureEditorElementCreatorDialog.this.featureTableViewer.refresh();
                }
            }
        };
    }
    
    private EObject createNewObject() {
        return this.newObjectSupplier.get();
    }
    
    @Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_FeatureEditorDialog_title",
                new Object[] { this.displayName, this.labelProvider.getText(this.object) }));
        shell.setImage(this.labelProvider.getImage(this.object));
    }
    
    @Override
    protected Control createDialogArea(Composite parent) {
        Composite contents = (Composite) super.createDialogArea(parent);
        
        GridLayout contentsGridLayout = (GridLayout) contents.getLayout();
        contentsGridLayout.numColumns = 3;
        
        GridData contentsGridData = (GridData) contents.getLayoutData();
        contentsGridData.horizontalAlignment = SWT.FILL;
        contentsGridData.verticalAlignment = SWT.FILL;
        
        Text patternText = null;
        
        Composite creationComposite = new Composite(contents, SWT.NONE);
        {
            GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
            data.horizontalAlignment = SWT.END;
            creationComposite.setLayoutData(data);
            
            GridLayout layout = new GridLayout();
            data.horizontalAlignment = SWT.FILL;
            layout.marginHeight = 0;
            layout.marginWidth = 0;
            layout.numColumns = 1;
            creationComposite.setLayout(layout);
        }
        
        Label creationLabel = new Label(creationComposite, SWT.NONE);
        creationLabel.setText(UiText.FeatureEditorElementCreatorDialog_Creation_Label);
        GridData choiceLabelGridData = new GridData();
        choiceLabelGridData.verticalAlignment = SWT.FILL;
        choiceLabelGridData.horizontalAlignment = SWT.FILL;
        creationLabel.setLayoutData(choiceLabelGridData);
        
        this.formComposite = createFormDetailComposite(creationComposite);
                
        Composite controlButtons = new Composite(contents, SWT.NONE);
        GridData controlButtonsGridData = new GridData();
        controlButtonsGridData.verticalAlignment = SWT.FILL;
        controlButtonsGridData.horizontalAlignment = SWT.FILL;
        controlButtons.setLayoutData(controlButtonsGridData);
        
        GridLayout controlsButtonGridLayout = new GridLayout();
        controlButtons.setLayout(controlsButtonGridLayout);
        
        final Button newButton = new Button(controlButtons, SWT.PUSH);
        newButton.setText(UiText.FeatureEditorElementCreatorDialog_Button_New_Text);
        GridData newButtonGridData = new GridData();
        newButtonGridData.verticalAlignment = SWT.FILL;
        newButtonGridData.horizontalAlignment = SWT.FILL;
        newButton.setLayoutData(newButtonGridData);
        // TODO: Enable add button when creation form is valid
        // addButton.setEnabled(this.valueHandler !=
        // null && this.valueHandler.isValid("") == null);
        

        final Button removeButton = new Button(controlButtons, SWT.PUSH);
        removeButton.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Remove_label"));
        GridData removeButtonGridData = new GridData();
        removeButtonGridData.verticalAlignment = SWT.FILL;
        removeButtonGridData.horizontalAlignment = SWT.FILL;
        removeButton.setLayoutData(removeButtonGridData);
        removeButton.setEnabled(false);
        
        Label spaceLabel = new Label(controlButtons, SWT.NONE);
        GridData spaceLabelGridData = new GridData();
        spaceLabelGridData.verticalSpan = 2;
        spaceLabel.setLayoutData(spaceLabelGridData);
        
        final Button upButton = new Button(controlButtons, SWT.PUSH);
        upButton.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Up_label"));
        GridData upButtonGridData = new GridData();
        upButtonGridData.verticalAlignment = SWT.FILL;
        upButtonGridData.horizontalAlignment = SWT.FILL;
        upButton.setLayoutData(upButtonGridData);
        upButton.setEnabled(false);
        
        final Button downButton = new Button(controlButtons, SWT.PUSH);
        downButton.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Down_label"));
        GridData downButtonGridData = new GridData();
        downButtonGridData.verticalAlignment = SWT.FILL;
        downButtonGridData.horizontalAlignment = SWT.FILL;
        downButton.setLayoutData(downButtonGridData);
        downButton.setEnabled(false);
        
        Composite featureComposite = new Composite(contents, SWT.NONE);
        {
            GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
            data.horizontalAlignment = SWT.END;
            featureComposite.setLayoutData(data);
            
            GridLayout layout = new GridLayout();
            data.horizontalAlignment = SWT.FILL;
            layout.marginHeight = 0;
            layout.marginWidth = 0;
            layout.numColumns = 1;
            featureComposite.setLayout(layout);
        }
        
        Label featureLabel = new Label(featureComposite, SWT.NONE);
        featureLabel.setText(EMFEditUIPlugin.INSTANCE.getString("_UI_Feature_label"));
        GridData featureLabelGridData = new GridData();
        featureLabelGridData.horizontalSpan = 2;
        featureLabelGridData.horizontalAlignment = SWT.FILL;
        featureLabelGridData.verticalAlignment = SWT.FILL;
        featureLabel.setLayoutData(featureLabelGridData);
        
        final Table featureTable = new Table(featureComposite, SWT.MULTI | SWT.BORDER);
        GridData featureTableGridData = new GridData();
        featureTableGridData.widthHint = Display.getCurrent().getBounds().width / 5;
        featureTableGridData.heightHint = Display.getCurrent().getBounds().height / 3;
        featureTableGridData.verticalAlignment = SWT.FILL;
        featureTableGridData.horizontalAlignment = SWT.FILL;
        featureTableGridData.grabExcessHorizontalSpace = true;
        featureTableGridData.grabExcessVerticalSpace = true;
        featureTable.setLayoutData(featureTableGridData);
        
        // We carefully manage the selection because for non-unique features,
        // because the value selected by a selection-preserving refresh will be the first of the duplicates.
        //
        this.featureTableViewer = new TableViewer(featureTable) {
            @Override
            public void refresh(Object element, boolean updateLabels) {
                internalRefresh(element, updateLabels);
            }
            
            @Override
            public void refresh(Object element) {
                internalRefresh(element);
            }
        };
        this.featureTableViewer.setContentProvider(this.contentProvider);
        this.featureTableViewer.setLabelProvider(this.labelProvider);
        this.featureTableViewer.setInput(this.values);
        
        this.featureTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                // Remove is enabled only if something is selected.
                //
                removeButton.setEnabled(!event.getSelection().isEmpty());
                
                int[] selectionIndices = getSelectionIndices(featureTable);
                
                // Up is enabled only if something will actually be moved up.
                //
                boolean upEnabled = false;
                if (selectionIndices.length > 0) {
                    int upIndex = Math.max(selectionIndices[0] - 1, 0);
                    for (int i = 0; i < selectionIndices.length; ++i) {
                        if (upIndex++ != selectionIndices[i]) {
                            upEnabled = true;
                        }
                    }
                }
                upButton.setEnabled(upEnabled);
                
                // Down is enabled only if something will actually be moved up.
                //
                boolean downEnabled = false;
                if (selectionIndices.length > 0) {
                    int downIndex = Math.min(selectionIndices[selectionIndices.length - 1] + 1,
                            featureTable.getItemCount() - 1);
                    for (int i = selectionIndices.length - 1; i >= 0; --i) {
                        if (downIndex-- != selectionIndices[i]) {
                            downEnabled = true;
                        }
                    }
                }
                downButton.setEnabled(downEnabled);
                
                boolean relayout = false;
                
                if (FeatureEditorElementCreatorDialog.this.formComposite != null) {
                    FeatureEditorElementCreatorDialog.this.formComposite.dispose();
                    FeatureEditorElementCreatorDialog.this.formComposite = createFormDetailComposite(
                            creationComposite);
                    if (FeatureEditorElementCreatorDialog.this.objectBeingEdited != null) {
                        FeatureEditorElementCreatorDialog.this.objectBeingEdited.eAdapters()
                            .remove(FeatureEditorElementCreatorDialog.this.objectEditedAdapter);
                    }
                    relayout = true;
                }
                
                // Edit selected element
                if (selectionIndices.length == 1) {
                    Object obj = FeatureEditorElementCreatorDialog.this.values.getChildren().get(selectionIndices[0]);
                    if (!(obj instanceof EObject)) {
                        throw new IllegalStateException("Obj is not an eObject.");
                    }
                    FeatureEditorElementCreatorDialog.this.objectBeingEdited = (EObject) obj;
                    FeatureEditorElementCreatorDialog.this.formComposite
                            .init(FeatureEditorElementCreatorDialog.this.objectBeingEdited);
                    FeatureEditorElementCreatorDialog.this.objectBeingEdited.eAdapters()
                            .add(FeatureEditorElementCreatorDialog.this.objectEditedAdapter);
                    
                    relayout = true;
                }
                
                if (relayout) {
                    creationComposite.layout(true);
                }
            }
        });
        
        this.featureTableViewer.addDoubleClickListener(new IDoubleClickListener() {
            @Override
            public void doubleClick(DoubleClickEvent event) {
                if (removeButton.isEnabled()) {
                    removeButton.notifyListeners(SWT.Selection, null);
                }
            }
        });
        
        final EList<Object> children = this.values.getChildren();
        if (!children.isEmpty()) {
            this.featureTableViewer.setSelection(new StructuredSelection(children.get(0)));
        }
        
        upButton.addSelectionListener(
                new SelectionAdapter() {
                    @Override
                    public void widgetSelected(SelectionEvent event) {
                        // We use indices to properly handle non-unique values.
                        //
                        int[] selectionIndices = getSelectionIndices(featureTable);
                        int index = Math.max(selectionIndices[0] - 1, 0);
                        int start = index;
                        for (int i = 0; i < selectionIndices.length; ++i) {
                            children.move(index++, selectionIndices[i]);
                        }
                        
                        // We manage the selection to select exactly the appropriate indices.
                        //
                        FeatureEditorElementCreatorDialog.this.featureTableViewer.refresh();
                        featureTable.setSelection(start, start + selectionIndices.length - 1);
                        featureTable.notifyListeners(SWT.Selection, null);
                    }
                });
        
        downButton.addSelectionListener(
                new SelectionAdapter() {
                    @Override
                    public void widgetSelected(SelectionEvent event) {
                        // We use indices to properly handle non-unique values.
                        //
                        int[] selectionIndices = getSelectionIndices(featureTable);
                        int index = Math.min(selectionIndices[selectionIndices.length - 1] + 1, children.size() - 1);
                        for (int i = selectionIndices.length - 1; i >= 0; --i) {
                            children.move(index--, selectionIndices[i]);
                        }
                        
                        // We manage the selection to select exactly the appropriate indices.
                        //
                        FeatureEditorElementCreatorDialog.this.featureTableViewer.refresh();
                        featureTable.setSelection(index + 1, index + selectionIndices.length);
                        featureTable.notifyListeners(SWT.Selection, null);
                    }
                });
        
        newButton.addSelectionListener(
                new SelectionAdapter() {
                    @Override
                    public void widgetSelected(SelectionEvent event) {
                        int index = children.size();
                        children.add(index, createNewObject());
                        FeatureEditorElementCreatorDialog.this.featureTableViewer.refresh();
                        featureTable.setSelection(index);
                        featureTable.notifyListeners(SWT.Selection, null);
                    }
                });
        
        removeButton.addSelectionListener(
                new SelectionAdapter() {
                    @Override
                    public void widgetSelected(SelectionEvent event) {
                        // Remember the selection in the feature table...
                        //
                        IStructuredSelection selection = (IStructuredSelection) FeatureEditorElementCreatorDialog.this.featureTableViewer
                                .getSelection();
                        
                        // Process the selection to remove the appropriate values.
                        // And remember the value we might put into the choice text.
                        //
                        int[] selectionIndices = getSelectionIndices(featureTable);
                        Object firstValue = children.get(selectionIndices[0]);
                        for (int i = selectionIndices.length - 1; i >= 0; --i) {
                            children.remove(selectionIndices[i]);
                        }
                        
                        // Refresh the feature table and select the index before the previous selection.
                        //
                        FeatureEditorElementCreatorDialog.this.featureTableViewer.refresh();
                        if (!children.isEmpty()) {
                            featureTable.setSelection(selectionIndices[0] == 0 ? 0 : selectionIndices[0] - 1);
                        }
                        featureTable.notifyListeners(SWT.Selection, null);
                    }
                });
        
        return contents;
    }
    
    /**
     * Create the form detail composite
     * 
     * @param parent The parent of the new composite
     * 
     * @return the new composite
     */
    protected FormDetailComposite createFormDetailComposite(Composite parent) {
        FormDetailComposite composite = getFormFactory().createFormDetailComposite(parent,
                SWT.BORDER);
        
        GridData creationFormGridData = new GridData();
        creationFormGridData.widthHint = Display.getCurrent().getBounds().width / 5;
        creationFormGridData.heightHint = Display.getCurrent().getBounds().height / 3;
        creationFormGridData.verticalAlignment = SWT.FILL;
        creationFormGridData.horizontalAlignment = SWT.FILL;
        creationFormGridData.grabExcessHorizontalSpace = true;
        creationFormGridData.grabExcessVerticalSpace = true;
        composite.setLayoutData(creationFormGridData);

        return composite;
    }
    
    @Override
    protected Control createButtonBar(Composite parent) {
        // Specialize the button area so that we can provide a label control that displays error messages.
        //
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        composite.setLayout(layout);
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_CENTER);
        composite.setLayoutData(data);
        composite.setFont(parent.getFont());
        
        Label label = new Label(composite, SWT.NONE);
        label.setForeground(JFaceColors.getErrorText(label.getDisplay()));
        GridData labelData = new GridData(
                GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_CENTER | GridData.GRAB_HORIZONTAL);
        labelData.horizontalIndent = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
        label.setLayoutData(labelData);
        
        Control ret = super.createButtonBar(composite);
        GridData buttonBarData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_CENTER);
        ret.setLayoutData(buttonBarData);
        return ret;
    }
    
    /**
     * Set the error message
     * 
     * @param message the message
     */
    protected void setErrorMessage(String message) {
        Label label = (Label) getButtonBar().getParent().getChildren()[0];
        label.setText(message == null ? "" : message);
        label.setToolTipText(message == null ? "" : message);
    }
    
    @Override
    protected void okPressed() {
        this.result = new BasicEList<>(this.values.getChildren());
        super.okPressed();
    }
    
    /**
     * @return the result
     */
    public EList<?> getResult() {
        return this.result;
    }
    
    @Override
    public boolean close() {
        this.contentProvider.dispose();
        if (this.objectBeingEdited != null) {
            this.objectBeingEdited.eAdapters().remove(this.objectEditedAdapter);
        }
        return super.close();
    }
    
    private static int[] getSelectionIndices(Table table) {
        int[] selectionIndices = table.getSelectionIndices();
        Arrays.sort(selectionIndices);
        return selectionIndices;
    }
    
    /**
     * @param result the result to set
     */
    protected void setResult(EList<?> result) {
        this.result = result;
    }
    
    /**
     * @return the labelProvider
     */
    protected ILabelProvider getLabelProvider() {
        return this.labelProvider;
    }
    
    /**
     * @return the contentProvider
     */
    protected IContentProvider getContentProvider() {
        return this.contentProvider;
    }
    
    /**
     * @return the object
     */
    protected Object getObject() {
        return this.object;
    }
    
    /**
     * @return the displayName
     */
    protected String getDisplayName() {
        return this.displayName;
    }
    
    /**
     * @return the values
     */
    protected ItemProvider getValues() {
        return this.values;
    }
    
    /**
     * @return the formFactory
     */
    protected FormFactory getFormFactory() {
        return this.formFactory;
    }
    
    /**
     * @return the featureTableViewer
     */
    protected TableViewer getFeatureTableViewer() {
        return this.featureTableViewer;
    }
    
    /**
     * @param featureTableViewer the featureTableViewer to set
     */
    protected void setFeatureTableViewer(TableViewer featureTableViewer) {
        this.featureTableViewer = featureTableViewer;
    }
    
    /**
     * @return the formComposite
     */
    protected FormDetailComposite getFormComposite() {
        return this.formComposite;
    }
    
    /**
     * @param formComposite the formComposite to set
     */
    protected void setFormComposite(FormDetailComposite formComposite) {
        this.formComposite = formComposite;
    }
    
    /**
     * @return the objectBeingEdited
     */
    protected EObject getObjectBeingEdited() {
        return this.objectBeingEdited;
    }
    
    /**
     * @param objectBeingEdited the objectBeingEdited to set
     */
    protected void setObjectBeingEdited(EObject objectBeingEdited) {
        this.objectBeingEdited = objectBeingEdited;
    }
    
    /**
     * @return the objectEditedAdapter
     */
    protected Adapter getObjectEditedAdapter() {
        return this.objectEditedAdapter;
    }
    
}
