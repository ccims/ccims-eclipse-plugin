/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

/**
 * @author Tim Neumann
 *
 */
public class IssueFormControlFactory extends FormControlFactory {
    public Control control_CrossComponentIssue_textBody(IObservableValue source, EStructuralFeature f) {
        Text text = getToolkit().createText(getParent(), "", SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
        GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
        gridData.horizontalIndent = 10;
        gridData.heightHint = 100;
        text.setLayoutData(gridData);
        bindValue(f, DatabindingUtil.observeText(text, SWT.Modify), source);
        return text;
    }
}
