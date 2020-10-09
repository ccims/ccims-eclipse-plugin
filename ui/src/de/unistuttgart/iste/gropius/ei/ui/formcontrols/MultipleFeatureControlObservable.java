/**
 * Copyright (C) 2020, Tim Neumann <neumantm@fius.informatik.uni-stuttgart.de>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * <p>
 * Based on org.eclipse.emf.parsley.composite.MultipleFeatureControlObservable.
 * It was licensed under Eclipse Public License v1.0 there.
 * It had these contributors there:
 * 
 * Copyright (c) 2009, 2013 itemis AG (http://www.itemis.eu) and others.
 * Contributors:
 * itemis AG - Initial API and implementation
 * Lorenzo Bettini - refactoring for EmfParsley
 * </p>
 */
package de.unistuttgart.iste.gropius.ei.ui.formcontrols;

import java.util.List;

import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.core.databinding.observable.value.ValueDiff;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;

/**
 * Observable for the {@link AbstractMultiFeatureFormControl}
 * 
 * @author Tim Neumann
 * 
 *         <p>
 *         Based on {@link org.eclipse.emf.parsley.composite.MultipleFeatureControlObservable} with
 *         these authors:
 * @author Dennis Huebner - Initial contribution and API
 * @author Lorenzo Bettini - Refactoring and adaptations
 * 
 * @param <V> The type of the value of each feature
 */
public class MultipleFeatureControlObservable<V> extends AbstractObservableValue<List<V>>
        implements ISelectionChangedListener {
    
    private final AbstractMultiFeatureFormControl<V, ?> mfc;
    
    /**
     * Create a new observable for the given AbstractMultiFeatureFormControl
     * 
     * @param mfc The AbstractMultiFeatureFormControl this is for
     */
    public MultipleFeatureControlObservable(AbstractMultiFeatureFormControl<V, ?> mfc) {
        this.mfc = mfc;
        mfc.addSelectionChangedListener(this);
    }
    
    @Override
    protected List<V> doGetValue() {
        return this.mfc.getValue();
    }
    
    @Override
    protected void doSetValue(List<V> value) {
        this.mfc.setValue(value);
    }
    
    @Override
    public Object getValueType() {
        return null;
    }
    
    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
        fireValueChange(new ValueDiff<>() {
            
            @Override
            public List<V> getOldValue() {
                return null;
            }
            
            @Override
            public List<V> getNewValue() {
                return ((IStructuredSelection) event.getSelection()).toList();
            }
        });
    }
}
