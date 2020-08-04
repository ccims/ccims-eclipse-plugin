package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.ui.provider;

import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;

@SuppressWarnings("all")
public class UiTableFeaturesProvider extends TableFeaturesProvider {
  @Override
  public void buildStringMap(final EClassToEStructuralFeatureAsStringsMap stringMap) {
    super.buildStringMap(stringMap);
    
    stringMap.mapTo("de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue",
      "title", "labels");
  }
}
