/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.formcontrols;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.parsley.composite.CachedLabelProvider;
import org.eclipse.emf.parsley.composite.MultipleFeatureControl;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;

/**
 * A basic multi feature form control.
 * <p>
 * This has the same functionality as {@link MultipleFeatureControl}
 * 
 * @author Tim Neumann
 */
public class BasicMultiFeatureFormControl extends AbstractMultiFeatureFormControl {
    private Label label;
    private Button button;
    private FeatureEditorDialog dialog;
    
    /**
     * Create a basic multi feature form control
     * 
     * @param parent          The parent composite
     * @param widgetFactory   The widget factory to use
     * @param labelProvider   The label provider to use
     * @param object          The EObject to use
     * @param feature         The EStructuralFeature to use
     * @param proposalCreator The ProposalCreator to use
     * @param readonly        Whether this control is readonly
     */
    public BasicMultiFeatureFormControl(Composite parent, IWidgetFactory widgetFactory, ILabelProvider labelProvider,
            EObject object, EStructuralFeature feature, ProposalCreator proposalCreator, boolean readonly) {
        super(parent, widgetFactory, labelProvider, object, feature, proposalCreator, readonly, SWT.NONE);
    }
    
    @Override
    protected void createControls() {
        setLayout(new GridLayout(2, false));
        this.label = getWidgetFactory().createLabel(this, "");
        this.label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDown(MouseEvent e) {
                BasicMultiFeatureFormControl.this.setFocus();
            }
        });
        this.label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        
        this.button = getWidgetFactory().createButton(this, "...", SWT.PUSH);
        this.button.setLayoutData(new GridData());
        this.button.addSelectionListener(new SelectionAdapter() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                List<Object> oldValue = getValue();
                List<Object> proposals = getProposalCreator().proposals(getObject(), getFeature());
                BasicMultiFeatureFormControl.this.dialog = new FeatureEditorDialog(getParent().getShell(),
                        new CachedLabelProvider(getLabelProvider()),
                        getObject(),
                        getFeature().getEType(), oldValue, "Select", proposals, false,
                        getFeature().isOrdered(), proposals != null);
                BasicMultiFeatureFormControl.this.dialog.setBlockOnOpen(true);
                if (BasicMultiFeatureFormControl.this.dialog.open() == Window.OK) {
                    setValue(new StructuredSelection(BasicMultiFeatureFormControl.this.dialog.getResult().toArray()));
                }
            }
        });
        
        this.button.setVisible(!isReadonly());
    }
    
    @Override
    protected void refreshValue() {
        this.label.setText(getLabelProvider().getText(getValue()));
    }
    
    /**
     * @return the label of the control
     */
    public Label getLabel() {
        return this.label;
    }
    
    /**
     * @return the button of the control
     */
    public Button getButton() {
        return this.button;
    }
    
    @Override
    public void setMenu(Menu menu) {
        if (this.label != null && !this.label.isDisposed()) {
            this.label.setMenu(menu);
        }
        if (this.button != null && !this.button.isDisposed()) {
            this.button.setMenu(menu);
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
    
}
