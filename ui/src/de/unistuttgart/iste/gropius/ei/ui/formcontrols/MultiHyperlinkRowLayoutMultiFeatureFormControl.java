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
package de.unistuttgart.iste.gropius.ei.ui.formcontrols;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.composite.ProposalCreator;
import org.eclipse.emf.parsley.widgets.IWidgetFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;

/**
 * A multi feature form control using hyperlinks in a row layout
 * 
 * @author Tim Neumann
 * 
 * @param <V> The type of value of each feature. To allow any data set this to
 *            Object.
 * @param <O> The type of the owner of the features. This is the type of the
 *            object displayed by the whole form
 * @param <T> The type of the link target
 */
public abstract class MultiHyperlinkRowLayoutMultiFeatureFormControl<V, O extends EObject, T>
        extends MultiControlMultiFeatureFormControl<V, O, Hyperlink> {
    
    /**
     * Create a multi hyperlink row layout multi feature form control
     * 
     * @param parent          The parent composite
     * @param widgetFactory   The widget factory to use
     * @param labelProvider   The label provider to use
     * @param object          The EObject to use
     * @param feature         The EStructuralFeature to use
     * @param proposalCreator The ProposalCreator to use
     * @param readonly        Whether this control is readonly
     * @param toolkit         The toolkit to use
     */
    public MultiHyperlinkRowLayoutMultiFeatureFormControl(Composite parent, IWidgetFactory widgetFactory,
            ILabelProvider labelProvider, O object, EStructuralFeature feature, ProposalCreator proposalCreator,
            boolean readonly, FormToolkit toolkit) {
        super(parent, widgetFactory, labelProvider, object, feature, proposalCreator, readonly, toolkit);
    }
    
    @Override
    protected Layout createLayout() {
        RowLayout layout = new RowLayout();
        layout.fill = true;
        layout.pack = false;
        layout.spacing = 10;
        
        return layout;
    }
    
    @Override
    protected Hyperlink createControl(Composite parent) {
        Hyperlink label = getToolkit().createHyperlink(parent, "", SWT.NONE);
        label.addHyperlinkListener(new IHyperlinkListener() {
            @Override
            public void linkExited(HyperlinkEvent e) {
                // nothing
            }
            
            @Override
            public void linkEntered(HyperlinkEvent e) {
                // nothing
            }
            
            @Override
            public void linkActivated(HyperlinkEvent e) {
                @SuppressWarnings("unchecked")
                T target = (T) e.getHref();
                onHyperlinkActivated(target);
            }
        });
        label.setLayoutData(new RowData());
        return label;
    }
    
    @Override
    protected void setControlValue(Hyperlink control, V value, boolean last) {
        String text = getLabelProvider().getText(value);
        if (!last) {
            text += ",";
        }
        control.setText(text);
        control.setHref(getLinkTarget(value));
    }
    
    /**
     * Get the target of the link from the value of the feature
     * 
     * @param value The value of the feature
     * 
     * @return The target of the link
     */
    protected abstract T getLinkTarget(V value);
    
    /**
     * Perform the action, which should be performed when the link is activated.
     * 
     * @param target The target of the link
     */
    protected abstract void onHyperlinkActivated(T target);
}
