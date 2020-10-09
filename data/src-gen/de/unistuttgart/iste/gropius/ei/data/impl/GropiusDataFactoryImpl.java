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
package de.unistuttgart.iste.gropius.ei.data.impl;

import de.unistuttgart.iste.gropius.ei.data.*;

import java.net.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GropiusDataFactoryImpl extends EFactoryImpl implements GropiusDataFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static GropiusDataFactory init() {
        try {
            GropiusDataFactory theGropiusDataFactory = (GropiusDataFactory)EPackage.Registry.INSTANCE.getEFactory(GropiusDataPackage.eNS_URI);
            if (theGropiusDataFactory != null) {
                return theGropiusDataFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new GropiusDataFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GropiusDataFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case GropiusDataPackage.COMPONENT: return createComponent();
            case GropiusDataPackage.INTERFACE: return createInterface();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE: return createCrossComponentIssue();
            case GropiusDataPackage.DEVELOPER: return createDeveloper();
            case GropiusDataPackage.LABEL: return createLabel();
            case GropiusDataPackage.LOCATION: return createLocation();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM: return createCrossComponentIssueManagementSystem();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case GropiusDataPackage.URI:
                return createURIFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case GropiusDataPackage.URI:
                return convertURIToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Component createComponent() {
        ComponentImpl component = new ComponentImpl();
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Interface createInterface() {
        InterfaceImpl interface_ = new InterfaceImpl();
        return interface_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CrossComponentIssue createCrossComponentIssue() {
        CrossComponentIssueImpl crossComponentIssue = new CrossComponentIssueImpl();
        return crossComponentIssue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Developer createDeveloper() {
        DeveloperImpl developer = new DeveloperImpl();
        return developer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Label createLabel() {
        LabelImpl label = new LabelImpl();
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Location createLocation() {
        LocationImpl location = new LocationImpl();
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CrossComponentIssueManagementSystem createCrossComponentIssueManagementSystem() {
        CrossComponentIssueManagementSystemImpl crossComponentIssueManagementSystem = new CrossComponentIssueManagementSystemImpl();
        return crossComponentIssueManagementSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public URI createURIFromString(EDataType eDataType, String initialValue) {
        return (URI)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertURIToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GropiusDataPackage getGropiusDataPackage() {
        return (GropiusDataPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static GropiusDataPackage getPackage() {
        return GropiusDataPackage.eINSTANCE;
    }

} //GropiusDataFactoryImpl
