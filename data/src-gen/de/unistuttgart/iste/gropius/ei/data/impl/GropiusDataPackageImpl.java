/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.gropius.ei.data.impl;

import de.unistuttgart.iste.gropius.ei.data.Component;
import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;
import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.gropius.ei.data.Developer;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataFactory;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage;
import de.unistuttgart.iste.gropius.ei.data.Interface;
import de.unistuttgart.iste.gropius.ei.data.Label;
import de.unistuttgart.iste.gropius.ei.data.Location;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GropiusDataPackageImpl extends EPackageImpl implements GropiusDataPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2020 Tim Neumann";

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass componentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass crossComponentIssueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass developerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass labelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass locationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass crossComponentIssueManagementSystemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType uriEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private GropiusDataPackageImpl() {
        super(eNS_URI, GropiusDataFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link GropiusDataPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static GropiusDataPackage init() {
        if (isInited) return (GropiusDataPackage)EPackage.Registry.INSTANCE.getEPackage(GropiusDataPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredGropiusDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        GropiusDataPackageImpl theGropiusDataPackage = registeredGropiusDataPackage instanceof GropiusDataPackageImpl ? (GropiusDataPackageImpl)registeredGropiusDataPackage : new GropiusDataPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        TypesPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theGropiusDataPackage.createPackageContents();

        // Initialize created meta-data
        theGropiusDataPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theGropiusDataPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(GropiusDataPackage.eNS_URI, theGropiusDataPackage);
        return theGropiusDataPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getComponent() {
        return componentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getComponent_ProvidedInterfaces() {
        return (EReference)componentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getComponent_ConsumedInterfaces() {
        return (EReference)componentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getComponent_Name() {
        return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInterface() {
        return interfaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getInterface_Name() {
        return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCrossComponentIssue() {
        return crossComponentIssueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCrossComponentIssue_Title() {
        return (EAttribute)crossComponentIssueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCrossComponentIssue_TextBody() {
        return (EAttribute)crossComponentIssueEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCrossComponentIssue_IsOpen() {
        return (EAttribute)crossComponentIssueEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCrossComponentIssue_Assignees() {
        return (EReference)crossComponentIssueEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCrossComponentIssue_Labels() {
        return (EReference)crossComponentIssueEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCrossComponentIssue_LinkedIssues() {
        return (EReference)crossComponentIssueEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCrossComponentIssue_Locations() {
        return (EReference)crossComponentIssueEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDeveloper() {
        return developerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDeveloper_DevelopedComponents() {
        return (EReference)developerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDeveloper_Name() {
        return (EAttribute)developerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDeveloper_AssignedIssues() {
        return (EReference)developerEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLabel() {
        return labelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLabel_Name() {
        return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLocation() {
        return locationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLocation_ResourcePath() {
        return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLocation_Line() {
        return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLocation_Component() {
        return (EReference)locationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLocation_Interface() {
        return (EReference)locationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCrossComponentIssueManagementSystem() {
        return crossComponentIssueManagementSystemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCrossComponentIssueManagementSystem_ManagedCroCoIssues() {
        return (EReference)crossComponentIssueManagementSystemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCrossComponentIssueManagementSystem_Labels() {
        return (EReference)crossComponentIssueManagementSystemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCrossComponentIssueManagementSystem_Developers() {
        return (EReference)crossComponentIssueManagementSystemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCrossComponentIssueManagementSystem_Components() {
        return (EReference)crossComponentIssueManagementSystemEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCrossComponentIssueManagementSystem_LocationUri() {
        return (EAttribute)crossComponentIssueManagementSystemEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getURI() {
        return uriEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GropiusDataFactory getGropiusDataFactory() {
        return (GropiusDataFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        componentEClass = createEClass(COMPONENT);
        createEReference(componentEClass, COMPONENT__PROVIDED_INTERFACES);
        createEReference(componentEClass, COMPONENT__CONSUMED_INTERFACES);
        createEAttribute(componentEClass, COMPONENT__NAME);

        interfaceEClass = createEClass(INTERFACE);
        createEAttribute(interfaceEClass, INTERFACE__NAME);

        crossComponentIssueEClass = createEClass(CROSS_COMPONENT_ISSUE);
        createEAttribute(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__TITLE);
        createEAttribute(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__TEXT_BODY);
        createEAttribute(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__IS_OPEN);
        createEReference(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__ASSIGNEES);
        createEReference(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__LABELS);
        createEReference(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__LINKED_ISSUES);
        createEReference(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__LOCATIONS);

        developerEClass = createEClass(DEVELOPER);
        createEReference(developerEClass, DEVELOPER__DEVELOPED_COMPONENTS);
        createEAttribute(developerEClass, DEVELOPER__NAME);
        createEReference(developerEClass, DEVELOPER__ASSIGNED_ISSUES);

        labelEClass = createEClass(LABEL);
        createEAttribute(labelEClass, LABEL__NAME);

        locationEClass = createEClass(LOCATION);
        createEAttribute(locationEClass, LOCATION__RESOURCE_PATH);
        createEAttribute(locationEClass, LOCATION__LINE);
        createEReference(locationEClass, LOCATION__COMPONENT);
        createEReference(locationEClass, LOCATION__INTERFACE);

        crossComponentIssueManagementSystemEClass = createEClass(CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM);
        createEReference(crossComponentIssueManagementSystemEClass, CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES);
        createEReference(crossComponentIssueManagementSystemEClass, CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS);
        createEReference(crossComponentIssueManagementSystemEClass, CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS);
        createEReference(crossComponentIssueManagementSystemEClass, CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS);
        createEAttribute(crossComponentIssueManagementSystemEClass, CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI);

        // Create data types
        uriEDataType = createEDataType(URI);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComponent_ProvidedInterfaces(), this.getInterface(), null, "providedInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getComponent_ConsumedInterfaces(), this.getInterface(), null, "consumedInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getComponent_Name(), theTypesPackage.getString(), "name", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInterface_Name(), theTypesPackage.getString(), "name", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(crossComponentIssueEClass, CrossComponentIssue.class, "CrossComponentIssue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCrossComponentIssue_Title(), theTypesPackage.getString(), "title", null, 1, 1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getCrossComponentIssue_TextBody(), theTypesPackage.getString(), "textBody", null, 1, 1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getCrossComponentIssue_IsOpen(), theTypesPackage.getBoolean(), "isOpen", null, 1, 1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCrossComponentIssue_Assignees(), this.getDeveloper(), this.getDeveloper_AssignedIssues(), "assignees", null, 0, -1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCrossComponentIssue_Labels(), this.getLabel(), null, "labels", null, 0, -1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCrossComponentIssue_LinkedIssues(), this.getCrossComponentIssue(), null, "linkedIssues", null, 0, -1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCrossComponentIssue_Locations(), this.getLocation(), null, "locations", null, 0, -1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(developerEClass, Developer.class, "Developer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDeveloper_DevelopedComponents(), this.getComponent(), null, "developedComponents", null, 1, -1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getDeveloper_Name(), theTypesPackage.getString(), "name", null, 1, 1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getDeveloper_AssignedIssues(), this.getCrossComponentIssue(), this.getCrossComponentIssue_Assignees(), "assignedIssues", null, 0, -1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLabel_Name(), theTypesPackage.getString(), "name", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLocation_ResourcePath(), this.getURI(), "resourcePath", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getLocation_Line(), theTypesPackage.getInteger(), "line", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getLocation_Component(), this.getComponent(), null, "component", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getLocation_Interface(), this.getInterface(), null, "interface", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(crossComponentIssueManagementSystemEClass, CrossComponentIssueManagementSystem.class, "CrossComponentIssueManagementSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCrossComponentIssueManagementSystem_ManagedCroCoIssues(), this.getCrossComponentIssue(), null, "managedCroCoIssues", null, 0, -1, CrossComponentIssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCrossComponentIssueManagementSystem_Labels(), this.getLabel(), null, "labels", null, 0, -1, CrossComponentIssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCrossComponentIssueManagementSystem_Developers(), this.getDeveloper(), null, "developers", null, 0, -1, CrossComponentIssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCrossComponentIssueManagementSystem_Components(), this.getComponent(), null, "components", null, 0, -1, CrossComponentIssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getCrossComponentIssueManagementSystem_LocationUri(), this.getURI(), "locationUri", null, 1, 1, CrossComponentIssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Initialize data types
        initEDataType(uriEDataType, java.net.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.eclipse.org/uml2/2.0.0/UML
        createUMLAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createUMLAnnotations() {
        String source = "http://www.eclipse.org/uml2/2.0.0/UML";
        addAnnotation
          (this,
           source,
           new String[] {
               "originalName", "ccims-datamodel"
           });
    }

} //GropiusDataPackageImpl
