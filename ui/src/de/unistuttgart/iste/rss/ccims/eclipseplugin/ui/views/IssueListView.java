package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.views;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.parsley.composite.TableFormComposite;
import org.eclipse.emf.parsley.composite.TableFormFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.preference.IPersistentPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

import com.google.inject.Inject;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.Activator;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.UiPreferences;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.UiText;

public class IssueListView extends SaveableTableFormView {

	private class Actions {

		private abstract class PrefAction extends Action implements IWorkbenchAction, IPropertyChangeListener {

			private final String prefName;

			public PrefAction(String prefName, String text, String toolTipText, ImageDescriptor icon,
					int style) {
				super(text, style);
				this.prefName = prefName;
				this.setToolTipText(toolTipText);
				this.setImageDescriptor(icon);
				store.addPropertyChangeListener(this);
				updateUiFromPreferences(prefName);
			}

			@Override
			public void dispose() {
				store.removePropertyChangeListener(this);
			}

			@Override
			public void run() {
				updatePreferencesFromUi(prefName);
				saveStoreIfNeeded();
			}

			@Override
			public void propertyChange(PropertyChangeEvent event) {
				if (prefName.equals(event.getProperty())) {
					Control control = getControl();
					if (control != null && !control.isDisposed()) {
						control.getDisplay().asyncExec(() -> {
							if (!control.isDisposed()) {
								updateUiFromPreferences(prefName);
								refresh();
							}
						});
					}
				}
			}

			protected abstract void updateUiFromPreferences(String prefName);

			protected abstract void updatePreferencesFromUi(String prefName);
		}

		private class BooleanPrefAction extends PrefAction {

			public BooleanPrefAction(String prefName, String text, String toolTipText, ImageDescriptor icon,
					int style) {
				super(prefName, text, toolTipText, icon, style);				
			}

			public BooleanPrefAction(String prefName, String text, String toolTipText, ImageDescriptor icon) {
				this(prefName, text, toolTipText, icon, Action.AS_CHECK_BOX);
			}

			@Override
			protected void updateUiFromPreferences(String prefName) {
				setChecked(store.getBoolean(prefName));
			}

			@Override
			protected void updatePreferencesFromUi(String prefName) {
				store.setValue(prefName, isChecked());
			}

		}

		private BooleanPrefAction showOnlyOpenAction;

		private ImageDescriptor getIcon(String location) {
			try {
				return ImageDescriptor.createFromURL(new URL(location));
			} catch (MalformedURLException e) {
				Activator.handleError(e.getMessage(), e, false);
				return null;
			}
		}

		private void createActions() {
			this.showOnlyOpenAction = new BooleanPrefAction(UiPreferences.ISSUE_FILTER_OPEN,
					UiText.IssueList_ShowOpenOnlyAction_Text, UiText.IssueList_ShowOpenOnlyAction_TooltipText,
					getIcon("platform:/plugin/org.eclipse.ui/icons/full/elcl16/step_done.png"));

		}

		private void setupActionBars(IActionBars actionBars) {
			IToolBarManager toolbar = actionBars.getToolBarManager();
			IMenuManager menu = actionBars.getMenuManager();

			IMenuManager filtersSubMenu = new MenuManager(UiText.IssueList_FiltersSubMenu_Label);
			menu.add(filtersSubMenu);

			toolbar.add(showOnlyOpenAction);
			filtersSubMenu.add(showOnlyOpenAction);
		}
	}

	private IPersistentPreferenceStore store = Activator.getDefault().getPreferenceStore();

	private Actions actions = new Actions();

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		actions.createActions();
		actions.setupActionBars(this.getViewSite().getActionBars());
	}

	public void refresh() {
		getComposite().update(getResource());
	}

	public Control getControl() {
		return getComposite();
	}

	private void saveStoreIfNeeded() {
		if (store.needsSaving()) {
			try {
				store.save();
			} catch (IOException e) {
				Activator.handleError(e.getMessage(), e, false);
			}
		}
	}

}
