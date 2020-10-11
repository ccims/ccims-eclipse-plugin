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

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.core.databinding.observable.value.ValueDiff;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.parsley.widgets.IWidgetFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;

import de.unistuttgart.iste.gropius.ei.ui.UriHelper;

/**
 * From control widget for features which are a platform resource URIs
 * 
 * @author Tim Neumann
 * 
 */
public class PlatformResourceUriFormControl extends Composite {
    
    private final IWidgetFactory widgetFactory;
    private final ILabelProvider labelProvider;
    private final List<BiConsumer<URI, URI>> changeListeners = new ArrayList<>();
    
    private Label label;
    private Button button;
    
    private FilteredResourcesSelectionDialog dialog;
    
    private URI value;
    
    /**
     * Create a new platform resource uri form control
     * 
     * @param parent        The parent composite
     * @param widgetFactory The widget factory to use
     * @param labelProvider The label provider to use
     */
    public PlatformResourceUriFormControl(final Composite parent, final IWidgetFactory widgetFactory,
            final ILabelProvider labelProvider) {
        super(parent, SWT.None);
        this.widgetFactory = widgetFactory;
        this.labelProvider = labelProvider;
        createControls();
    }
    
    /**
     * Create the controls
     */
    protected void createControls() {
        setLayout(new GridLayout(2, false));
        this.label = getWidgetFactory().createLabel(this, "");
        this.label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDown(MouseEvent e) {
                PlatformResourceUriFormControl.this.setFocus();
            }
        });
        this.label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        
        this.button = getWidgetFactory().createButton(this, "...", SWT.PUSH);
        this.button.setLayoutData(new GridData());
        this.button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                URI oldValue = getValue();
                PlatformResourceUriFormControl.this.dialog = new FilteredResourcesSelectionDialog(getShell(), false,
                        ResourcesPlugin.getWorkspace().getRoot(),
                        IResource.FILE + IResource.FOLDER + IResource.PROJECT + IResource.ROOT);
                PlatformResourceUriFormControl.this.dialog.setBlockOnOpen(true);
                if (PlatformResourceUriFormControl.this.dialog.open() == Window.OK) {
                    Object[] res = PlatformResourceUriFormControl.this.dialog.getResult();
                    if(res != null && res.length > 0) {
                        if (!(res[0] instanceof IResource)) {
                            throw new IllegalStateException("Result is not a resource");
                        }
                        setValue(UriHelper.resourceURI(((IResource) res[0])));
                    }
                }
            }
        });
    }
    
    /**
     * Add a change listener
     * <p>
     * The first argument of the listener is the old value and the second the new value
     * 
     * @param listener The listener to add
     */
    public void addChangeListener(BiConsumer<URI, URI> listener) {
        this.changeListeners.add(listener);
    }
    
    /**
     * Remove a change listener
     * 
     * @param listener The listener to remove
     * 
     * @return true if the given listener was registered with this control
     */
    public boolean removeChangeListener(BiConsumer<URI, URI> listener) {
        return this.changeListeners.remove(listener);
    }
    
    /**
     * Refresh the displayed value
     */
    protected void refreshValue() {
        this.label.setText(this.labelProvider.getText(getValue()));
    }
    
    /**
     * @return the widgetFactory
     */
    protected IWidgetFactory getWidgetFactory() {
        return this.widgetFactory;
    }
    
    /**
     * @return the labelProvider
     */
    protected ILabelProvider getLabelProvider() {
        return this.labelProvider;
    }
    
    /**
     * @return the label
     */
    protected Label getLabel() {
        return this.label;
    }
    
    /**
     * @return the button
     */
    protected Button getButton() {
        return this.button;
    }
    
    /**
     * @return the value
     */
    protected URI getValue() {
        return this.value;
    }
    
    /**
     * @return the dialog
     */
    protected FilteredResourcesSelectionDialog getDialog() {
        return this.dialog;
    }
    
    /**
     * @param value the value to set
     */
    protected void setValue(URI value) {
        URI oldValue = this.value;
        this.value = value;
        for (var listener : this.changeListeners) {
            listener.accept(oldValue, value);
        }
        refreshValue();
    }
    
    /**
     * An observable for {@link PlatformResourceUriFormControl}
     */
    public class Observable extends AbstractObservableValue<URI> {
        /**
         * Create a new observable
         */
        public Observable() {
            PlatformResourceUriFormControl.this.addChangeListener((oldUri, newUri) -> {
                fireValueChange( new ValueDiff<URI>() {
                    
                    @Override
                    public URI getOldValue() {
                        return oldUri;
                    }
                    
                    @Override
                    public URI getNewValue() {
                        return newUri;
                    }
                });
            });
        }
        
        @Override
        public Object getValueType() {
            return URI.class;
        }
        
        @Override
        protected URI doGetValue() {
            return PlatformResourceUriFormControl.this.getValue();
        }
        
        @Override
        protected void doSetValue(URI uri) {
            PlatformResourceUriFormControl.this.setValue(uri);
        }
    }
    
}
