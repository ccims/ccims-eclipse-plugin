/**
 * Copyright (C) 2020, Tim Neumann <neumantm@fius.informatik.uni-stuttgart.de>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * <p>
 * Based on org.eclipse.egit.ui.Activator. It had these contributors there:
 * 
 * Copyright (C) 2007,2010 Robin Rosenberg <robin.rosenberg@dewire.com>
 * Copyright (C) 2008, Shawn O. Pearce <spearce@spearce.org>
 * Copyright (C) 2010, Mathias Kinzler <mathias.kinzler@sap.com>
 * Copyright (C) 2012, Matthias Sohn <matthias.sohn@sap.com>
 * Copyright (C) 2015, Philipp Bumann <bumannp@gmail.com>
 * Copyright (C) 2016, Dani Megert <daniel_megert@ch.ibm.com>
 * Copyright (C) 2018, Thomas Wolf <thomas.wolf@paranor.ch>
 * </p>
 */
package de.unistuttgart.iste.gropius.ei.ui;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.parsley.resource.ResourceLoader;
import org.eclipse.jface.preference.IPersistentPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.BundleContext;

import de.unistuttgart.iste.gropius.ei.ui.markers.MarkerManager;
import de.unistuttgart.iste.gropius.ei.ui.markers.MarkerRegistry;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
    public static final String PLUGIN_ID = "de.unistuttgart.iste.gropius.ei.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * Storage for preferences.
	 */
	private ScopedPreferenceStore preferenceStore;
	
    private MarkerRegistry markerRegistry;
    private MarkerManager markerManager;
    
	public Activator() {
        plugin = this;
        
        ResourceLoader rl = UiInjectorProvider.getInjector().getInstance(ResourceLoader.class);
        EditingDomain ed = UiInjectorProvider.getInjector().getInstance(EditingDomain.class);
        
        this.markerRegistry = new MarkerRegistry();
        this.markerManager = new MarkerManager(this.markerRegistry, rl, ed, this.getResourceUri());
        
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns the preference store for this UI plug-in. This preference store is
	 * used to hold persistent settings for this plug-in in the context of a
	 * workbench. Some of these settings will be user controlled, whereas others may
	 * be internal setting that are never exposed to the user.
	 * <p>
	 * If an error occurs reading the preference store, an empty preference store is
	 * quietly created, initialized with defaults, and returned.
	 * </p>
	 *
	 * @return the preference store
	 */
	public IPersistentPreferenceStore getPreferenceStore() {
		// Create the preference store lazily.
        if (this.preferenceStore == null) {
            this.preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, getBundle().getSymbolicName());

		}
        return this.preferenceStore;
	}
	

	/**
	 * @return the id of the egit ui plugin
	 */
	public static String getPluginId() {
		return getDefault().getBundle().getSymbolicName();
	}
	
	/**
	 * Creates an {@link IStatus} from the parameters. If the throwable is an
	 * {@link InvocationTargetException}, the status is created from the first
	 * exception that is either not an InvocationTargetException or that has a
	 * message. If the message passed is empty, tries to supply a message from
	 * that exception.
	 *
	 * @param severity
	 *            of the {@link IStatus}
	 * @param message
	 *            for the status
	 * @param throwable
	 *            that caused the status, may be {@code null}
	 * @return the status
	 */
	private static IStatus toStatus(int severity, String message,
			Throwable throwable) {
		Throwable exc = throwable;
		while (exc instanceof InvocationTargetException) {
			String msg = exc.getLocalizedMessage();
			if (msg != null && !msg.isEmpty()) {
				break;
			}
			Throwable cause = exc.getCause();
			if (cause == null) {
				break;
			}
			exc = cause;
		}
		if (exc != null && (message == null || message.isEmpty())) {
			message = exc.getLocalizedMessage();
		}
		return new Status(severity, getPluginId(), message, exc);
	}

	/**
	 * Handle an error. The error is logged. If <code>show</code> is
	 * <code>true</code> the error is shown to the user.
	 *
	 * @param message
	 *            a localized message
	 * @param throwable
	 * @param show
	 */
	public static void handleError(String message, Throwable throwable,
			boolean show) {
		handleIssue(IStatus.ERROR, message, throwable, show);
	}

	/**
	 * Handle an issue. The issue is logged. If <code>show</code> is
	 * <code>true</code> the issue is shown to the user.
	 *
	 * @param severity
	 *            status severity, use constants defined in {@link IStatus}
	 * @param message
	 *            a localized message
	 * @param throwable
	 * @param show
	 */
	public static void handleIssue(int severity, String message, Throwable throwable,
			boolean show) {
		IStatus status = toStatus(severity, message, throwable);
		handleStatus(status, show);
	}

	/**
	 * Handle a status. The status is logged. If <code>show</code> is
	 * <code>true</code> the issue is shown to the user.
	 *
	 * @param status
	 *            Status to be handled.
	 *
	 * @param show
	 *            Whether or not to show the issue to the user.
	 * @since 5.2
	 */
	public static void handleStatus(IStatus status, boolean show) {
		int style = StatusManager.LOG;
		if (show) {
			style |= StatusManager.SHOW;
		}
		StatusManager.getManager().handle(status, style);
	}

	/**
	 * Shows an error. The error is NOT logged.
	 *
	 * @param message
	 *            a localized message
	 * @param throwable
	 */
	public static void showError(String message, Throwable throwable) {
		IStatus status = toStatus(IStatus.ERROR, message, throwable);
		StatusManager.getManager().handle(status, StatusManager.SHOW);
	}

	/**
	 * Shows an error. The error is NOT logged.
	 *
	 * @param message
	 *            a localized message
	 * @param status
	 */
	public static void showErrorStatus(String message, IStatus status) {
		StatusManager.getManager().handle(status, StatusManager.SHOW);
	}

	/**
	 * @param message
	 * @param e
	 */
	public static void logError(String message, Throwable e) {
		handleError(message, e, false);
	}

	/**
	 * Utility method to log warnings for this plug-in.
	 *
	 * @param message
	 *            User comprehensible message
	 * @param thr
	 *            The exception through which we noticed the warning
	 */
	public static void logWarning(final String message, final Throwable thr) {
		handleIssue(IStatus.WARNING, message, thr, false);
	}

	/**
	 * @param message
	 * @param e
	 */
	public static void error(String message, Throwable e) {
		handleError(message, e, false);
	}
    
    /**
     * Utility method to log infos for this plug-in.
     *
     * @param message User comprehensible message
     * @param thr     The exception through which we noticed the warning
     */
    public static void logInfo(final String message, final Throwable thr) {
        handleIssue(IStatus.INFO, message, thr, false);
    }

	/**
	 * Creates an error status
	 *
	 * @param message
	 *            a localized message
	 * @param throwable
	 * @return a new Status object
	 */
	public static IStatus createErrorStatus(String message,
			Throwable throwable) {
		return toStatus(IStatus.ERROR, message, throwable);
	}

	/**
	 * Creates an error status
	 *
	 * @param message
	 *            a localized message
	 * @return a new Status object
	 */
	public static IStatus createErrorStatus(String message) {
		return toStatus(IStatus.ERROR, message, null);
	}
    
    /**
     * @return the markerRegistry
     */
    public MarkerRegistry getMarkerRegistry() {
        return this.markerRegistry;
    }
    
    /**
     * Get the resource uri to use.
     * <p>
     * This get's the configured string from the preference store. Then it replaces
     * some variables and creates a URI from the result.
     * 
     * @return the resourc euir
     */
    public URI getResourceUri() {
        String uri = getPreferenceStore().getString(UiPreferences.BACKEND_URI);
        uri = uri.replace("${user_home}", System.getProperty("user.home"));
        uri = uri.replace("${workspace_loc}", ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString());
        return URI.createURI(uri);
    }
 
}
