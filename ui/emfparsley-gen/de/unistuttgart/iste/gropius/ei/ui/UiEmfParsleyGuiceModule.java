package de.unistuttgart.iste.gropius.ei.ui;

import com.google.inject.Provider;
import de.unistuttgart.iste.gropius.ei.ui.IssueFormControlFactory;
import de.unistuttgart.iste.gropius.ei.ui.IssueFormFeaturesProvider;
import de.unistuttgart.iste.gropius.ei.ui.IssueTableFeaturesProvider;
import de.unistuttgart.iste.gropius.ei.ui.IssueViewsFilteredContentProvider;
import de.unistuttgart.iste.gropius.ei.ui.config.UiConfigurator;
import de.unistuttgart.iste.gropius.ei.ui.resource.UiResourceManager;
import de.unistuttgart.iste.gropius.ei.ui.ui.provider.UiLabelProvider;
import de.unistuttgart.iste.gropius.ei.ui.ui.provider.UiTableLabelProvider;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.edit.domain.GlobalAdapterFactoryEditingDomainProvider;
import org.eclipse.emf.parsley.edit.ui.provider.TableViewerContentProvider;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;
import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

@SuppressWarnings("all")
public class UiEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public UiEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends Provider<AdapterFactoryEditingDomain>> provideAdapterFactoryEditingDomain() {
    return GlobalAdapterFactoryEditingDomainProvider.class;
  }
  
  @Override
  public Class<? extends TableViewerContentProvider> bindTableViewerContentProvider() {
    return IssueViewsFilteredContentProvider.class;
  }
  
  @Override
  public Class<? extends FeaturesProvider> bindFeaturesProvider() {
    return IssueFormFeaturesProvider.class;
  }
  
  @Override
  public Class<? extends TableFeaturesProvider> bindTableFeaturesProvider() {
    return IssueTableFeaturesProvider.class;
  }
  
  @Override
  public Class<? extends FormControlFactory> bindFormControlFactory() {
    return IssueFormControlFactory.class;
  }
  
  @Override
  public Class<? extends ILabelProvider> bindILabelProvider() {
    return UiLabelProvider.class;
  }
  
  @Override
  public Class<? extends TableColumnLabelProvider> bindTableColumnLabelProvider() {
    return UiTableLabelProvider.class;
  }
  
  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return UiConfigurator.class;
  }
  
  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return UiResourceManager.class;
  }
}
