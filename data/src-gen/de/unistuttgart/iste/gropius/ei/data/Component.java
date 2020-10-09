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
package de.unistuttgart.iste.gropius.ei.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.Component#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.Component#getConsumedInterfaces <em>Consumed Interfaces</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.Component#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
    /**
     * Returns the value of the '<em><b>Provided Interfaces</b></em>' containment reference list.
     * The list contents are of type {@link de.unistuttgart.iste.gropius.ei.data.Interface}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provided Interfaces</em>' containment reference list.
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getComponent_ProvidedInterfaces()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Interface> getProvidedInterfaces();

    /**
     * Returns the value of the '<em><b>Consumed Interfaces</b></em>' reference list.
     * The list contents are of type {@link de.unistuttgart.iste.gropius.ei.data.Interface}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consumed Interfaces</em>' reference list.
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getComponent_ConsumedInterfaces()
     * @model ordered="false"
     * @generated
     */
    EList<Interface> getConsumedInterfaces();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getComponent_Name()
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.unistuttgart.iste.gropius.ei.data.Component#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Component
