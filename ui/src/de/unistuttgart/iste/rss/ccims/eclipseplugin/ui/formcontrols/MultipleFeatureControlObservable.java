/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.formcontrols;

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
 */
public class MultipleFeatureControlObservable extends AbstractObservableValue<Object>
        implements ISelectionChangedListener {
    
    private final AbstractMultiFeatureFormControl mfc;
    
    /**
     * Create a new observable for the given AbstractMultiFeatureFormControl
     * 
     * @param mfc The AbstractMultiFeatureFormControl this is for
     */
    public MultipleFeatureControlObservable(AbstractMultiFeatureFormControl mfc) {
        this.mfc = mfc;
        mfc.addSelectionChangedListener(this);
    }
    
    @Override
    protected Object doGetValue() {
        return this.mfc.getValue();
    }
    
    @SuppressWarnings("unchecked")
    @Override
    protected void doSetValue(Object value) {
        this.mfc.setValue((List<Object>) value);
    }
    
    @Override
    public Object getValueType() {
        return null;
    }
    
    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
        fireValueChange(new ValueDiff<>() {
            
            @Override
            public Object getOldValue() {
                return null;
            }
            
            @Override
            public Object getNewValue() {
                return ((IStructuredSelection) event.getSelection()).toList();
            }
        });
    }
}
