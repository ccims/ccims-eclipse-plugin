/**
 * 
 */
package de.unistuttgart.iste.gropius.ei.ui;

import java.net.URI;

import de.unistuttgart.iste.gropius.ei.data.Location;

/**
 * @author Tim Neumann
 *
 */
public class LocationLabelCalculator {
    public static String calculateLabelForLocation(Location location) {
        String[] pathSegements = new String[0];
        {
            URI resourcePath = location.getResourcePath();
            String path = null;
            if (resourcePath != null) {
                path = location.getResourcePath().getPath();
            }
            if (path != null && !path.isEmpty()) {
                pathSegements = path.split("/");
            }
        }
        StringBuilder result = new StringBuilder();
        
        if (location.getInterface() != null) {
            result.append(location.getInterface().getName());
        } else if (location.getComponent() != null) {
            result.append(location.getComponent().getName());
        } else {
            if (pathSegements.length < 2) {
                result.append("<unknown>");
            } else {
                result.append(pathSegements[0]);
            }
        }
        
        if (pathSegements.length < 1 && location.getLine() > 0) {
            result.append(":");
            result.append("<unknown>");
        } else if (pathSegements.length < 1) {
            // End of result
        } else {
            result.append(":");
            result.append(pathSegements[pathSegements.length - 1]);
        }
        
        if (location.getLine() > 0) {
            result.append(":L");
            result.append(location.getLine());
        }
        return result.toString();
    }
}
