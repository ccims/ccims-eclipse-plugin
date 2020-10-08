/**
 * 
 */
package de.unistuttgart.iste.gropius.ei.ui.formcontrols;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.composite.ProposalCreator;
import org.eclipse.emf.parsley.widgets.IWidgetFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * A multi feature form control using labels in a row layout
 * 
 * @author Tim Neumann
 */
public class MultiLabelRowLayoutMultiFeatureFormControl
        extends MultiControlMultiFeatureFormControl<Object, EObject, Label> {
    
    /**
     * Create a multi label row layout multi feature form control
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
    public MultiLabelRowLayoutMultiFeatureFormControl(Composite parent, IWidgetFactory widgetFactory,
            ILabelProvider labelProvider, EObject object, EStructuralFeature feature, ProposalCreator proposalCreator,
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
    protected Label createControl(Composite parent) {
        Label label = getToolkit().createLabel(parent, "");
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDown(MouseEvent e) {
                setFocus();
            }
        });
        label.setLayoutData(new RowData());
        return label;
    }
    
    @Override
    protected void setControlValue(Label control, Object value, boolean last) {
        String text = getLabelProvider().getText(value);
        if (!last) {
            text += ",";
        }
        control.setText(text);
    }
}
