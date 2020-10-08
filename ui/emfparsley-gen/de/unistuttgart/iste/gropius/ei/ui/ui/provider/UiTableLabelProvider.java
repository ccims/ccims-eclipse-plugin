package de.unistuttgart.iste.gropius.ei.ui.ui.provider;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;
import de.unistuttgart.iste.gropius.ei.ui.LabelIconProvider;
import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;

@SuppressWarnings("all")
public class UiTableLabelProvider extends TableColumnLabelProvider {
  public Object image_CrossComponentIssue_title(final CrossComponentIssue it) {
    return LabelIconProvider.getIconFor(it, 2);
  }
}
