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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage
 * @generated
 */
public interface GropiusDataFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    GropiusDataFactory eINSTANCE = de.unistuttgart.iste.gropius.ei.data.impl.GropiusDataFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Component</em>'.
     * @generated
     */
    Component createComponent();

    /**
     * Returns a new object of class '<em>Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface</em>'.
     * @generated
     */
    Interface createInterface();

    /**
     * Returns a new object of class '<em>Cross Component Issue</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cross Component Issue</em>'.
     * @generated
     */
    CrossComponentIssue createCrossComponentIssue();

    /**
     * Returns a new object of class '<em>Developer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Developer</em>'.
     * @generated
     */
    Developer createDeveloper();

    /**
     * Returns a new object of class '<em>Label</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Label</em>'.
     * @generated
     */
    Label createLabel();

    /**
     * Returns a new object of class '<em>Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Location</em>'.
     * @generated
     */
    Location createLocation();

    /**
     * Returns a new object of class '<em>Cross Component Issue Management System</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cross Component Issue Management System</em>'.
     * @generated
     */
    CrossComponentIssueManagementSystem createCrossComponentIssueManagementSystem();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    GropiusDataPackage getGropiusDataPackage();

} //GropiusDataFactory
