package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.ui.provider;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.LabelIconProvider;
import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;

@SuppressWarnings("all")
public class UiTableLabelProvider extends TableColumnLabelProvider {
  public Object image_CrossComponentIssue_title(final CrossComponentIssue it) {
    return LabelIconProvider.getIconFor(it, 2);
  }
}
