/**
 * 
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
