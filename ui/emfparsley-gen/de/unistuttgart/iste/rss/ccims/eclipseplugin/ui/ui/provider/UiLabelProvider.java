package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.ui.provider;

import com.google.inject.Inject;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Interface;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.LabelIconProvider;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.ui.LocationLabelCalculator;
import java.net.URI;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;

@SuppressWarnings("all")
public class UiLabelProvider extends ViewerLabelProvider {
  @Inject
  public UiLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final CrossComponentIssue it) {
    String _title = it.getTitle();
    return _title;
  }
  
  public String text(final Component it) {
    String _name = it.getName();
    return _name;
  }
  
  public String text(final CrossComponentIssueManagementSystem it) {
    URI _locationUri = it.getLocationUri();
    String _plus = ("CCIMS at " + _locationUri);
    return _plus;
  }
  
  public String text(final Developer it) {
    String _name = it.getName();
    return _name;
  }
  
  public String text(final Interface it) {
    String _name = it.getName();
    return _name;
  }
  
  public String text(final Label it) {
    String _name = it.getName();
    return _name;
  }
  
  public String text(final Location it) {
    String _calculateLabelForLocation = LocationLabelCalculator.calculateLabelForLocation(it);
    return _calculateLabelForLocation;
  }
  
  public Object image(final CrossComponentIssue it) {
    return LabelIconProvider.getIconFor(it, 4);
  }
}
