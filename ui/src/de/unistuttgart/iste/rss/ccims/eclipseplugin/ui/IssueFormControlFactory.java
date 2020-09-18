/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.composite.ControlObservablePair;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.composite.ProposalCreator;
import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.Hyperlink;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.formcontrols.AbstractMultiFeatureFormControl;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.formcontrols.MultiControlMultiFeatureFormControl;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.formcontrols.MultiLabelRowLayoutMultiFeatureFormControl;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.formcontrols.MultipleFeatureControlObservable;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.views.AbstractSaveableTableFormView;

/**
 * @author Tim Neumann
 *
 */
public class IssueFormControlFactory extends FormControlFactory {
    
    @Inject
    private Provider<ILabelProvider> labelProviderProvider;
    
    @Inject
    private ProposalCreator proposalCreator;
    
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
        AbstractMultiFeatureFormControl mfc = new MultiLabelRowLayoutMultiFeatureFormControl(getParent(),
                this, this.labelProviderProvider.get(), getOwner(),
                feature, this.proposalCreator, isReadonly(), getToolkit());
        mfc.init();
        
        IObservableValue<?> target = new MultipleFeatureControlObservable(
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
        AbstractMultiFeatureFormControl mfc = new MultiLabelRowLayoutMultiFeatureFormControl(getParent(),
                this, this.labelProviderProvider.get(), getOwner(),
                feature, this.proposalCreator, isReadonly(), getToolkit());
        mfc.init();
        
        IObservableValue<?> target = new MultipleFeatureControlObservable(
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
        AbstractMultiFeatureFormControl mfc = new MultiLabelRowLayoutMultiFeatureFormControl(getParent(),
                this, this.labelProviderProvider.get(), getOwner(),
                feature, this.proposalCreator, isReadonly(), getToolkit());
        mfc.init();
        
        IObservableValue<?> target = new MultipleFeatureControlObservable(
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
        AbstractMultiFeatureFormControl mfc = new MultiControlMultiFeatureFormControl<Hyperlink>(getParent(),
                this, this.labelProviderProvider.get(), getOwner(),
                feature, this.proposalCreator, isReadonly(), getToolkit()) {
            private static final String LINKED_ISSUE_DATA_KEY = "linked_issue_data";
            
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
                        CrossComponentIssue target = ((CrossComponentIssue) e.getHref());
                        IStructuredSelection selection = new StructuredSelection(target);
                        Composite parent = getParent();
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
                        ((AbstractSaveableTableFormView) containingView).setSelection(selection);
                    }
                });
                label.setLayoutData(new RowData());
                return label;
            }
            
            @Override
            protected void setControlValue(Hyperlink control, Object value, boolean last) {
                String text = getLabelProvider().getText(value);
                if (!last) {
                    text += ",";
                }
                control.setText(text);
                if (!(value instanceof CrossComponentIssue)) {
                    throw new IllegalStateException("Value is not a CrossComponentIssue");
                }
                CrossComponentIssue issue = (CrossComponentIssue) value;
                control.setHref(issue);
            }
            
        };
        mfc.init();
        
        IObservableValue<?> target = new MultipleFeatureControlObservable(
                mfc);
        return new ControlObservablePair(mfc, target);
    }
}
