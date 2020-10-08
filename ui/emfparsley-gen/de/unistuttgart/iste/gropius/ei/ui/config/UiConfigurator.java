package de.unistuttgart.iste.gropius.ei.ui.config;

import de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage;
import de.unistuttgart.iste.gropius.ei.ui.Activator;
import de.unistuttgart.iste.gropius.ei.ui.views.DebugMasterView;
import de.unistuttgart.iste.gropius.ei.ui.views.IssueListView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.config.Configurator;

@SuppressWarnings("all")
public class UiConfigurator extends Configurator {
  public URI resourceURI(final IssueListView it) {
    return Activator.getDefault().getResourceUri();
  }
  
  public URI resourceURI(final DebugMasterView it) {
    return Activator.getDefault().getResourceUri();
  }
  
  public EClass eClass(final IssueListView it) {
    return GropiusDataPackage.eINSTANCE.getCrossComponentIssue();
  }
}
