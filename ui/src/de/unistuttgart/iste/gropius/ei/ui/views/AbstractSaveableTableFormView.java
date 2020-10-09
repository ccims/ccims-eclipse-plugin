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
 * Based on org.eclipse.emf.parsley.views.AbstractSaveableTableFormView.
 * It was licensed under Eclipse Public License v1.0 there.
 * It had these contributors there:
 * 
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * Contributors:
 * Francesco Guidieri - Initial contribution and API
 * </p>
 */
package de.unistuttgart.iste.gropius.ei.ui.views;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.composite.TableFormComposite;
import org.eclipse.emf.parsley.composite.TableFormFactory;
import org.eclipse.emf.parsley.views.AbstractSaveableTableView;
import org.eclipse.emf.parsley.views.AbstractSaveableViewerView;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.google.inject.Inject;

/**
 * Abstract base class for a view with a table and a form.
 * <p>
 * Based on {@link org.eclipse.emf.parsley.views.AbstractSaveableTableFormView}
 * <p>
 * TODO: Remove after the changes are merged upstream
 * 
 * @author Francesco Guidieri - Initial contribution and API
 * @author Lorenzo Bettini - aligned to {@link AbstractSaveableTableView}
 * @author Tim Neumann - add method for children to get the composite
 */
public abstract class AbstractSaveableTableFormView extends AbstractSaveableViewerView {
    /**
     * The key used to store this view in the data of the TableFormComposite.
     */
    public static final String DATA_KEY_CONTAINING_VIEW = "containingAbstractSaveableTableFormView";
    
	@Inject
	private TableFormFactory tableFormFactory;

	private TableFormComposite tableFormComposite;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

        this.tableFormComposite = this.tableFormFactory
			.createTableFormMasterDetailComposite(parent, SWT.BORDER, getEClass());
        this.tableFormComposite.update(getResource());

		afterCreateViewer();
        this.tableFormComposite.setData(DATA_KEY_CONTAINING_VIEW, this);
	}

	@Override
	public void setFocus() {
        this.tableFormComposite.setFocus();
	}

	@Override
	public StructuredViewer getViewer() {
        return this.tableFormComposite.getViewer();
	}
    
    /**
     * Set the selection in the table of this view.
     * 
     * @param selection The selection to set
     * 
     * @throws IllegalStateException if the view has not yet been initialized or the
     *                               slection proved is not set
     */
    public void setSelection(ISelection selection) {
        var site = getSite();
        if (site == null) {
            throw new IllegalStateException("View has not yet been initialized");
        }
        var selectionProvicer = site.getSelectionProvider();
        if (selectionProvicer == null) {
            throw new IllegalStateException("No selection provider set");
        }
        selectionProvicer.setSelection(selection);
    }

	/**
	 * @return the {@link EClass} for objects to be shown in the table
	 */
	protected abstract EClass getEClass();

	/**
	 * @return the composite used by this view
	 */
	protected TableFormComposite getComposite() {
        return this.tableFormComposite;
	}
    
    /**
     * Recreates the table form composite.
     * <p>
     * Does not update or relayout anything.
     */
    protected void recreateComposite() {
        Composite parent = this.getComposite().getParent();
        for (Control child : parent.getChildren()) {
            if (child == getComposite()) {
                child.dispose();
            }
        }
        this.tableFormComposite = this.tableFormFactory
                .createTableFormMasterDetailComposite(parent, SWT.BORDER, getEClass());
    }
}
