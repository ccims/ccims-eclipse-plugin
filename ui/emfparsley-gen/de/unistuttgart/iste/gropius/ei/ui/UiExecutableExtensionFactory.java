package de.unistuttgart.iste.gropius.ei.ui;

import com.google.inject.Injector;
import de.unistuttgart.iste.gropius.ei.ui.UiInjectorProvider;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;

@SuppressWarnings("all")
public class UiExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return UiInjectorProvider.getInjector();
  }
}
