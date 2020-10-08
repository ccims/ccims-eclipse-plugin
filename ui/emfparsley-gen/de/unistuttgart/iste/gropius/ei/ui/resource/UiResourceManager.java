package de.unistuttgart.iste.gropius.ei.ui.resource;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.gropius.ei.ui.MockDataGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.resource.ResourceManager;

@SuppressWarnings("all")
public class UiResourceManager extends ResourceManager {
  @Override
  public void initialize(final Resource it) {
    EList<EObject> _contents = it.getContents();
    CrossComponentIssueManagementSystem _generateMockData = MockDataGenerator.generateMockData();
    _contents.add(_generateMockData);
  }
}
