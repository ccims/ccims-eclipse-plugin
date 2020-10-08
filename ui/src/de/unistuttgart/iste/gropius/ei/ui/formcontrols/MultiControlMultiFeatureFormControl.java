/**
 * 
 */
package de.unistuttgart.iste.gropius.ei.ui.formcontrols;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.parsley.composite.CachedLabelProvider;
import org.eclipse.emf.parsley.composite.ProposalCreator;
import org.eclipse.emf.parsley.widgets.IWidgetFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * A multi feature form control using a seperate sub control for each feature
 * 
 * @author Tim Neumann
 * 
 * @param <V> The type of value of each feature. To allow any data set this to
 *            Object.
 * @param <O> The type of the owner of the features. This is the type of the
 *            object displayed by the whole form
 * @param <C> The type of controls to use
 */
public abstract class MultiControlMultiFeatureFormControl<V, O extends EObject, C extends Control>
        extends AbstractMultiFeatureFormControl<V, O> {
    private FormToolkit toolkit;
    private List<C> controls = new ArrayList<>();
    private Composite container;
    private Button button;
    private FeatureEditorDialog dialog;
    
    /**
     * Create a multi control multi feature form control
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
    public MultiControlMultiFeatureFormControl(Composite parent, IWidgetFactory widgetFactory,
            ILabelProvider labelProvider,
            O object, EStructuralFeature feature, ProposalCreator proposalCreator, boolean readonly,
            FormToolkit toolkit) {
        super(parent, widgetFactory, labelProvider, object, feature, proposalCreator, readonly, SWT.NONE);
        this.toolkit = toolkit;
    }
    
    @Override
    protected void createControls() {
        setLayout(new GridLayout(2, false));
        this.container = this.toolkit.createComposite(this);
        this.container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        this.container.setLayout(createLayout());
        this.container.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDown(MouseEvent e) {
                setFocus();
            }
        });
        
        this.button = getWidgetFactory().createButton(this, "...", SWT.PUSH);
        this.button.setLayoutData(new GridData());
        this.button.addSelectionListener(new SelectionAdapter() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                List<V> oldValue = getValue();
                List<Object> proposals = getProposalCreator().proposals(getObject(), getFeature());
                MultiControlMultiFeatureFormControl.this.dialog = new FeatureEditorDialog(getParent().getShell(),
                        new CachedLabelProvider(getLabelProvider()),
                        getObject(),
                        getFeature().getEType(), oldValue, "Select", proposals, false,
                        getFeature().isOrdered(), proposals != null);
                MultiControlMultiFeatureFormControl.this.dialog.setBlockOnOpen(true);
                if (MultiControlMultiFeatureFormControl.this.dialog.open() == Window.OK) {
                    setValue(new StructuredSelection(
                            MultiControlMultiFeatureFormControl.this.dialog.getResult().toArray()));
                }
            }
        });
        
        this.button.setVisible(!isReadonly());
    }
    
    @Override
    public void init() {
        super.init();
        refreshValue();
    }
    
    @Override
    protected void refreshValue() {
        List<V> values = getValue();
        int controlCount = this.controls.size();
        int valueCount = values.size();
        
        int toRemove = Math.max(0, controlCount - valueCount);
        int toCreate = Math.max(0, valueCount - controlCount);
        
        for (int i = 0; i < toRemove; i++) {
            this.controls.remove(this.controls.size() - 1).dispose();
        }
        
        for (int i = 0; i < toCreate; i++) {
            C c = createControl(this.container);
            this.controls.add(c);
            c.setMenu(this.container.getMenu());
        }
        
        for (int i = 0; i < valueCount; i++) {
            setControlValue(this.controls.get(i), values.get(i), i == valueCount - 1);
        }
    }
    
    /**
     * @return a layout for the composite containing the data
     */
    protected abstract Layout createLayout();
    
    /**
     * @param parent The parent for the control
     * 
     * @return a new control to use
     */
    protected abstract C createControl(Composite parent);
    
    /**
     * Set the value of the given control to the given object
     * 
     * @param control The control to set the value of
     * @param value   The value to set
     * @param last    Whether this is the last child control of the multi feature
     *                form control
     */
    protected abstract void setControlValue(C control, V value, boolean last);
    
    /**
     * @return the button of the control
     */
    public Button getButton() {
        return this.button;
    }
    
    @Override
    public void setMenu(Menu menu) {
        if (this.button != null && !this.button.isDisposed()) {
            this.button.setMenu(menu);
        }
        
        if (this.container != null && !this.container.isDisposed()) {
            this.container.setMenu(menu);
        }
        
        for (Control c : this.controls) {
            if (c != null && !c.isDisposed()) {
                c.setMenu(menu);
            }
        }
    }
    
    @Override
    public boolean setFocus() {
        if (this.button != null) {
            return this.button.setFocus();
        }
        return super.setFocus();
    }
    
    @Override
    public void addFocusListener(FocusListener listener) {
        this.button.addFocusListener(listener);
    }
    
    @Override
    public void removeFocusListener(FocusListener listener) {
        this.button.removeFocusListener(listener);
    }
    
    /**
     * @return the toolkit
     */
    protected FormToolkit getToolkit() {
        return this.toolkit;
    }
    
}
