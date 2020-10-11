/**
 * Copyright (C) 2020, Tim Neumann <neumantm@fius.informatik.uni-stuttgart.de>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.unistuttgart.iste.gropius.ei.ui;

import java.net.URI;

import de.unistuttgart.iste.gropius.ei.data.Location;

/**
 * @author Tim Neumann
 *
 */
public class LocationLabelCalculator {
    /**
     * Calculate the label for the given location
     * 
     * @param location The lcoation to calculate the label for
     * 
     * @return The label for the given location
     */
    public static String calculateLabelForLocation(Location location) {
        String projectName = UriHelper.projectName(location.getResourcePath());
        String projectRelativePath = UriHelper.projectRelativePath(location.getResourcePath());
        
        StringBuilder result = new StringBuilder();
        
        if (location.getInterface() != null) {
            result.append(location.getInterface().getName());
        } else if (location.getComponent() != null) {
            result.append(location.getComponent().getName());
        } else {
            if (projectName == null) {
                result.append("<unknown>");
            } else {
                result.append(projectName);
            }
        }
        
        if (projectRelativePath == null && location.getLine() > 0) {
            result.append(":");
            result.append("<unknown>");
        } else if (projectRelativePath == null) {
            // End of result
        } else {
            result.append(":");
            result.append(getLastPathSegment(projectRelativePath));
        }
        
        if (location.getLine() > 0) {
            result.append(":L");
            result.append(location.getLine());
        }
        return result.toString();
    }
    
    /**
     * Calculate the label for the given location resource path
     * 
     * @param resourcePath The resource path to calculate the label for
     * 
     * @return The label for the given resource path
     */
    public static String calculateLabelForLocationResourcePath(URI resourcePath) {
        String projectName = UriHelper.projectName(resourcePath);
        String projectRelativePath = UriHelper.projectRelativePath(resourcePath);
        
        StringBuilder result = new StringBuilder();
        if (projectName == null) {
            result.append("<unknown>");
        } else {
            result.append(projectName);
        }
        result.append("/.../");
        if (projectRelativePath == null) {
            result.append("<unknown>");
        } else {
            result.append(getLastPathSegment(projectRelativePath));
        }
        return result.toString();
    }
    
    private static String getLastPathSegment(String path) {
        return path.substring(path.lastIndexOf(UriHelper.URI_PATH_SEPERATOR) + 1);
    }
}
