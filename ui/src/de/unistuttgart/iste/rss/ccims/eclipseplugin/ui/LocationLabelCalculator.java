/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location;

/**
 * @author Tim Neumann
 *
 */
public class LocationLabelCalculator {
    public static String calculateLabelForLocation(Location location) {
        StringBuilder result = new StringBuilder();
        
        String[] pathSegements = location.getResourcePath().split("/");
        
        if (location.getInterface() != null) {
            result.append(location.getInterface().getName());
        } else if (location.getComponent() != null) {
            result.append(location.getComponent().getName());
        } else {
            result.append(pathSegements[0]);
        }
        result.append(":");
        result.append(pathSegements[pathSegements.length - 1]);
        if (location.getLine() >= 0) {
            result.append(":L");
            result.append(location.getLine());
        }
        return result.toString();
    }
}
