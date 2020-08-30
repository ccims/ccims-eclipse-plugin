/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.*;

import org.eclipse.emf.ecore.EClass;
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
public class CcimsDatamodelFactoryImpl extends EFactoryImpl implements CcimsDatamodelFactory {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2020 Tim Neumann";

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CcimsDatamodelFactory init() {
        try {
            CcimsDatamodelFactory theCcimsDatamodelFactory = (CcimsDatamodelFactory)EPackage.Registry.INSTANCE.getEFactory(CcimsDatamodelPackage.eNS_URI);
            if (theCcimsDatamodelFactory != null) {
                return theCcimsDatamodelFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CcimsDatamodelFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CcimsDatamodelFactoryImpl() {
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
            case CcimsDatamodelPackage.COMPONENT: return createComponent();
            case CcimsDatamodelPackage.INTERFACE: return createInterface();
            case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE: return createCrossComponentIssue();
            case CcimsDatamodelPackage.DEVELOPER: return createDeveloper();
            case CcimsDatamodelPackage.LABEL: return createLabel();
            case CcimsDatamodelPackage.LOCATION: return createLocation();
            case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM: return createCrossComponentIssueManagementSystem();
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
    @Override
    public CcimsDatamodelPackage getCcimsDatamodelPackage() {
        return (CcimsDatamodelPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CcimsDatamodelPackage getPackage() {
        return CcimsDatamodelPackage.eINSTANCE;
    }

} //CcimsDatamodelFactoryImpl
