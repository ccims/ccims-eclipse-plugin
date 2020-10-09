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
 * Based on org.eclipse.emf.parsley.views.SaveableTableFormView.
 * It was licensed under Eclipse Public License v1.0 there.
 * It had these contributors there:
 * 
 * Copyright (c) 2015 RCP Vision (http://www.rcp-vision.com) and others.
 * Contributors:
 * Francesco Guidieri - Initial contribution and API
 * </p>
 */
package de.unistuttgart.iste.gropius.ei.ui.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.config.Configurator;

import com.google.inject.Inject;

/**
 * This implements the abstract methods by delegating to an injected
 * {@link Configurator}.
 * <p>
 * Based on {@link org.eclipse.emf.parsley.views.SaveableTableFormView}
 * <p>
 * TODO: Remove after the changes to {@link AbstractSaveableTableFormView} are merged upstream
 * 
 * @author Lorenzo Bettini - Initial contribution and API
 * @author Tim Neumann - use changed {@link AbstractSaveableTableFormView}
 *
 */
public class SaveableTableFormView extends AbstractSaveableTableFormView {

	@Inject
	private Configurator configurator;

	@Override
	protected URI createResourceURI() {
		return configurator.createResourceURI(this);
	}

	@Override
	protected EClass getEClass() {
		return configurator.getEClass(this);
	}

}
