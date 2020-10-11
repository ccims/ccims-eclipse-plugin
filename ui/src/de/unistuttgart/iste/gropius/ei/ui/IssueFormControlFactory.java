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

import java.net.URI;
import java.util.List;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.composite.ControlObservablePair;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.composite.FormFactory;
import org.eclipse.emf.parsley.composite.ProposalCreator;
import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataFactory;
import de.unistuttgart.iste.gropius.ei.data.Location;
import de.unistuttgart.iste.gropius.ei.ui.dialogs.FeatureEditorElementCreatorDialog;
import de.unistuttgart.iste.gropius.ei.ui.formcontrols.MultiHyperlinkRowLayoutMultiFeatureFormControl;
import de.unistuttgart.iste.gropius.ei.ui.formcontrols.MultiLabelRowLayoutMultiFeatureFormControl;
import de.unistuttgart.iste.gropius.ei.ui.formcontrols.MultipleFeatureControlObservable;
import de.unistuttgart.iste.gropius.ei.ui.formcontrols.PlatformResourceUriFormControl;
import de.unistuttgart.iste.gropius.ei.ui.markers.IssueMarkerIdentifier;
import de.unistuttgart.iste.gropius.ei.ui.views.AbstractSaveableTableFormView;

/**
 * @author Tim Neumann
 *
 */
public class IssueFormControlFactory extends FormControlFactory {
    
    @Inject
    private Provider<ILabelProvider> labelProviderProvider;
    
    @Inject
    private ProposalCreator proposalCreator;
    
    @Inject
    private FormFactory formFactory;
    
    /**
     * Get the control for the textBody field in a CrossComponentIssue form
     * 
     * @param source The value source
     * @param f      The feature
     * 
     * @return The control
     */
    public Control control_CrossComponentIssue_textBody(IObservableValue<?> source, EStructuralFeature f) {
        Text text = getToolkit().createText(getParent(), "", SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
        GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
        gridData.horizontalIndent = 10;
        gridData.heightHint = 100;
        text.setLayoutData(gridData);
        bindValue(f, DatabindingUtil.observeText(text, SWT.Modify), source);
        return text;
    }
    
    /**
     * Get the control for the label field in a CrossComponentIssue form
     * 
     * @param feature The feature
     * 
     * @return The control observable pair
     */
    public ControlObservablePair control_CrossComponentIssue_labels(EStructuralFeature feature) {
        MultiLabelRowLayoutMultiFeatureFormControl mfc = new MultiLabelRowLayoutMultiFeatureFormControl(getParent(),
                this, this.labelProviderProvider.get(), getOwner(),
                feature, this.proposalCreator, isReadonly(), getToolkit());
        mfc.init();
        
        IObservableValue<?> target = new MultipleFeatureControlObservable<>(
                mfc);
        return new ControlObservablePair(mfc, target);
    }
    
    /**
     * Get the control for the label field in a CrossComponentIssue form
     * 
     * @param feature The feature
     * 
     * @return The control observable pair
     */
    public ControlObservablePair control_CrossComponentIssue_assignees(EStructuralFeature feature) {
        MultiLabelRowLayoutMultiFeatureFormControl mfc = new MultiLabelRowLayoutMultiFeatureFormControl(getParent(),
                this, this.labelProviderProvider.get(), getOwner(),
                feature, this.proposalCreator, isReadonly(), getToolkit());
        mfc.init();
        
        IObservableValue<?> target = new MultipleFeatureControlObservable<>(
                mfc);
        return new ControlObservablePair(mfc, target);
    }
    
    /**
     * Get the control for the label field in a CrossComponentIssue form
     * 
     * @param feature The feature
     * 
     * @return The control observable pair
     */
    public ControlObservablePair control_CrossComponentIssue_locations(EStructuralFeature feature) {
        EObject owner = getOwner();
        if(!(owner instanceof CrossComponentIssue)) {
            throw new IllegalStateException("While creating control for CrossComponentIssue: Owner is not a CrossComponentIssue");
        }
        MultiHyperlinkRowLayoutMultiFeatureFormControl<Location, CrossComponentIssue, Location> mfc = new MultiHyperlinkRowLayoutMultiFeatureFormControl<>(
                getParent(),
                this, this.labelProviderProvider.get(), (CrossComponentIssue) getOwner(),
                feature, this.proposalCreator, isReadonly(), getToolkit()) {
            
            @Override
            protected Location getLinkTarget(Location value) {
                return value;
            }
            
            @Override
            protected void onHyperlinkActivated(Location target) {
                IssueMarkerIdentifier identifier = IssueMarkerIdentifier.createIdentifierForIssueLocation(target);
                IMarker marker = Activator.getDefault().getMarkerRegistry().getMarker(identifier);
                if (marker != null) {
                    try {
                        IWorkbenchPage page = getContainingAbstractSaveableTableFormView(this).getSite().getPage();
                        try {
                            IDE.openEditor(page, marker);
                        } catch (PartInitException e) {
                            Activator.logError("Could not open editor", e);
                        }
                    } catch (IllegalStateException e) {
                        Activator.logError("Could not get active workbench page to open editor in", e);
                    }
                }
            }
            
            protected java.util.List<?> openChangeDialog() {
                List<Location> oldValue = getValue();
                
                FeatureEditorElementCreatorDialog dialog = new FeatureEditorElementCreatorDialog(getShell(),
                        getLabelProvider(), IssueFormControlFactory.this.formFactory,
                        getObject(), oldValue, () -> {
                            Location loc = GropiusDataFactory.eINSTANCE.createLocation();
                            getObject().getLocations().add(loc);
                            return loc;
                        }, "Select");
                dialog.setBlockOnOpen(true);
                if (dialog.open() == Window.OK) {
                    return dialog.getResult();
                }
                return null;
            }
        };
        mfc.init();
        
        IObservableValue<?> target = new MultipleFeatureControlObservable<>(
                mfc);
        return new ControlObservablePair(mfc, target);
    }
    
    /**
     * Get the control for the label field in a CrossComponentIssue form
     * 
     * @param feature The feature
     * 
     * @return The control observable pair
     */
    public ControlObservablePair control_CrossComponentIssue_linkedIssues(EStructuralFeature feature) {
        MultiHyperlinkRowLayoutMultiFeatureFormControl<CrossComponentIssue, EObject, CrossComponentIssue> mfc = new MultiHyperlinkRowLayoutMultiFeatureFormControl<>(
                getParent(),
                this, this.labelProviderProvider.get(), getOwner(),
                feature, this.proposalCreator, isReadonly(), getToolkit()) {
            @Override
            protected CrossComponentIssue getLinkTarget(CrossComponentIssue value) {
                return value;
            }
            
            @Override
            protected void onHyperlinkActivated(CrossComponentIssue target) {
                IStructuredSelection selection = new StructuredSelection(target);
                try {
                    getContainingAbstractSaveableTableFormView(this).setSelection(selection);
                } catch (IllegalStateException e) {
                    Activator.logError("Could not select new issue", e);
                }
            }
        };
        mfc.init();
        
        IObservableValue<?> target = new MultipleFeatureControlObservable<>(
                mfc);
        return new ControlObservablePair(mfc, target);
    }
    
    /**
     * Get the control for the resource path field in a Location from
     * 
     * @param feature The feature
     * 
     * @return The control observable pair
     */
    public ControlObservablePair control_Location_resourcePath(EStructuralFeature feature) {
        PlatformResourceUriFormControl prufc = new PlatformResourceUriFormControl(getParent(), this,
                this.labelProviderProvider.get());
        IObservableValue<URI> target = prufc.new Observable();
        return new ControlObservablePair(prufc, target);
    }
    
    private static AbstractSaveableTableFormView getContainingAbstractSaveableTableFormView(final Composite composite) {
        Composite parent = composite.getParent();
        Object containingView = null;
        do {
            containingView = parent.getData(AbstractSaveableTableFormView.DATA_KEY_CONTAINING_VIEW);
            parent = parent.getParent();
        } while (parent != null && containingView == null);
        if (containingView == null) {
            throw new IllegalStateException("Could not find containing view.");
        }
        if (!(containingView instanceof AbstractSaveableTableFormView)) {
            throw new IllegalStateException("Containing view is not AbstractSaveableTableFormView.");
        }
        return ((AbstractSaveableTableFormView) containingView);
    }
}
