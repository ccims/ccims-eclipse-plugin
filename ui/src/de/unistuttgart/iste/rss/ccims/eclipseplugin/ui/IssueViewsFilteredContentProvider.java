package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.parsley.edit.ui.provider.TableViewerContentProvider;
import org.eclipse.jface.preference.IPreferenceStore;

import com.google.inject.Inject;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.logic.filter.CombinedFilter;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.logic.filter.DeveloperNameFilter;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.logic.filter.IssueFilter;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.logic.filter.OpenFilter;

public class IssueViewsFilteredContentProvider extends TableViewerContentProvider {

	private IPreferenceStore store;
	
	@Inject
	public IssueViewsFilteredContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		store = Activator.getDefault().getPreferenceStore();
	}
	
	private boolean matches(CrossComponentIssue issue) {
		return calculateCurrentIssueFilter().matches(issue);
	}
	
	@Override
	public List<Object> elements(Object o) {
		List<Object> elements = super.elements(o);
		List<Object> result = new ArrayList<>();
		
		for(Object e : elements) {
			if(e instanceof CrossComponentIssue) {
				if(matches((CrossComponentIssue) e)) {
					result.add(e);
				}
			} else {
				result.add(e);
			}
		}
		
		return result;
	}
	

	public IssueFilter calculateCurrentIssueFilter() {
		List<IssueFilter> filters = new ArrayList<>();
		if(store.getBoolean(UiPreferences.ISSUE_FILTER_OPEN)) {
			filters.add(new OpenFilter());
		}
        if (store.getBoolean(UiPreferences.ISSUE_FILTER_OWN)) {
            filters.add(new DeveloperNameFilter(store.getString(UiPreferences.DEVELOPER_NAME)));
        }
		return new CombinedFilter(filters);
	}
}
