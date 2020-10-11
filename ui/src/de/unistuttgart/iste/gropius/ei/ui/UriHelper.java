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
import java.util.Arrays;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;

/**
 * Helper class to for working with eclipse platform uris ({@code platform:})
 * 
 * @author Tim Neumann
 */
public class UriHelper {
    /**
     * The URI scheme for local files
     */
    public static final String URI_SCHEME_FILE = "file";
    /**
     * The URI scheme for eclipse platform URIs
     * 
     * @see <a href="https://www.iana.org/assignments/uri-schemes/prov/platform">IANA URI Scheme
     *      Assignment</a>
     */
    public static final String URI_SCHEME_PLATFORM = "platform";
    /**
     * The first path segement in a eclipse platform URI for eclispe platform resource URIs
     * 
     * @see <a href="https://www.iana.org/assignments/uri-schemes/prov/platform">IANA URI Scheme
     *      Assignment</a>
     */
    public static final String PLATFORM_URI_RESOURCE_PATH_ROOT = "/resource";
    
    /**
     * The path seperator in URIS
     */
    public static final String URI_PATH_SEPERATOR = "/";
    
    /**
     * The seperator between the URI scheme and the rest of the URI.
     */
    public static final String URI_SCHEME_SEPERATOR = ":";
    
    private UriHelper() {
        // hide
    }
    
    /**
     * Get the platform resource URI for the given resource.
     * <p>
     * The resulting URI will have the scheme `platform` and `resource` as the first path segment.
     * 
     * @param resource The resource to get the URI for
     * 
     * @return The platform resource URI for the given resource
     */
    public static URI resourceURI(IResource resource) {
        return resourceURI(path(resource));
    }
    
    /**
     * Get the platform resource URI for the given path.
     * <p>
     * The path must be an absolute path relative to the workspace (as returned by
     * {@link IResource#getFullPath()}
     * <p>
     * The resulting URI will have the scheme `platform` and `resource` as the first path segment.
     * 
     * @param path The absolute worksapce relative path to get the URI for
     * 
     * @return The platform resource URI for the given path
     */
    public static URI resourceURI(IPath path) {
        return resourceURI(path(path));
    }
    
    /**
     * Get the platform resource URI for the given path.
     * <p>
     * The path must be an absolute path relative to the workspace (similar to
     * {@link IResource#getFullPath()}
     * <p>
     * The resulting URI will have the scheme `platform` and `resource` as the first path segment.
     * 
     * @param path The absolute worksapce relative path to get the URI for
     * 
     * @return The platform resource URI for the given path
     */
    public static URI resourceURI(String path) {
        if (!path.startsWith(URI_PATH_SEPERATOR))
            throw new IllegalArgumentException("Path is not absolute");
        return URI.create(getPlatformResourceUriPrefix() + path);
    }
    
    /**
     * Get the project name from a platform resource URI
     * 
     * @param uri The URI to get the project name from.
     * 
     * @return The project name from the given uri or null if the URI has no project part
     * 
     * @throws IllegalArgumentException if the given URI is not a platform resource URI
     */
    public static String projectName(URI uri) {
        String[] allSegments = platformResourceUriPathSegments(uri);
        if (allSegments.length < 2)
            return null;
        return allSegments[1];
    }
    
    /**
     * Get the project relative path form a platform resource URI
     * 
     * @param uri The URI to get the project realtive path from.
     * 
     * @return The project relative path from the given uri or null if the URI has no project relative
     *         path
     * 
     * @throws IllegalArgumentException if the given URI is not a platform resource URI
     */
    public static String projectRelativePath(URI uri) {
        String[] allSegments = platformResourceUriPathSegments(uri);
        if (allSegments.length < 3)
            return null;
        String[] relevantSegments = Arrays.copyOfRange(allSegments, 2, allSegments.length);
        return String.join(URI_PATH_SEPERATOR, relevantSegments);
    }
    
    private static String[] platformResourceUriPathSegments(URI uri) {
        if (!URI_SCHEME_PLATFORM.equals(uri.getScheme())) {
            throw new IllegalArgumentException("Given uri is not a platform URI");
        }
        String path = uri.getPath();
        if(! path.startsWith(PLATFORM_URI_RESOURCE_PATH_ROOT)) {
            throw new IllegalArgumentException("Given uri is a platform URI but not a platform resource URI.");
        }
        if (path.startsWith(URI_PATH_SEPERATOR)) {
            path = path.substring(1);
        }
        return path.split(URI_PATH_SEPERATOR);
    }
    
    private static String path(IPath path) {
        String[] parts = path.toString().split(String.valueOf(IPath.DEVICE_SEPARATOR));
        return parts[parts.length - 1];
    }
    
    private static String path(IResource resource) {
        return path(resource.getFullPath());
    }
    
    /**
     * @return The prefix needed for platform resource uris including the scheme and the resource path
     *         root
     * 
     * @see #URI_SCHEME_PLATFORM
     * @see #PLATFORM_URI_RESOURCE_PATH_ROOT
     */
    public static String getPlatformResourceUriPrefix() {
        return URI_SCHEME_PLATFORM + URI_SCHEME_SEPERATOR + PLATFORM_URI_RESOURCE_PATH_ROOT;
    }
    
    /**
     * Try to get a platform resource URI form the given URI.
     * <p>
     * If the given URI is already a platform URI it will be returned without any chnages.
     * Otherwise a conversion is attempted.
     * <p>
     * This only works if either the given URI is relative (no scheme) or a file URI to a file within a
     * workpsace project
     * <p>
     * If the given URI is relative, that path of the URI is assumed to be relative to the workspace.
     * <p>
     * If the given URI is a file URI for a file within the workspace, the URI path relative to the
     * project will be appended to the platform resource URI of the project.
     * <p>
     * In both cases the fragment of the given URI is lost.
     * 
     * @param original The URI to convert.
     * 
     * @return The platform resource URI corresponding to the given URI
     * 
     * @throws IllegalArgumentException - when the given URI cannot be converted
     */
    public static URI convertToPlatformResourceUri(URI original) {
        String path = "";
        if (original.isAbsolute()) {
            String scheme = original.getScheme();
            if (scheme.equals(URI_SCHEME_PLATFORM)) {
                return original;
            }
            
            if (scheme != URI_SCHEME_FILE) {
                throw new IllegalArgumentException("The only supported scheme is file");
            }
            IProject project = findProjectForPath(original.getPath());
            String relativePath = original.getPath().substring(0, project.getLocationURI().getPath().length());
            
            String projectPath = path(project);
            if (projectPath.endsWith(URI_PATH_SEPERATOR)) {
                projectPath = projectPath.substring(0, projectPath.length() - 1);
            }
            if (relativePath.startsWith(URI_PATH_SEPERATOR)) {
                relativePath = relativePath.substring(1);
            }
            
            path = projectPath + URI_PATH_SEPERATOR + relativePath;
        } else {
            path = original.getPath();
        }
        
        if (!path.startsWith(URI_PATH_SEPERATOR)) {
            path = URI_PATH_SEPERATOR + path;
        }
        return resourceURI(path);
    }
    
    private static IProject findProjectForPath(String path) {
        for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
            if (path.startsWith(project.getLocationURI().getPath())) {
                return project;
            }
        }
        throw new IllegalArgumentException("The given path is not in a project.");
    }
}
