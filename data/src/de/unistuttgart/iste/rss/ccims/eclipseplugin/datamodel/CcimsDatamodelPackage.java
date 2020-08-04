/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CCIMS-Metamodel'"
 * @generated
 */
public interface CcimsDatamodelPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 Tim Neumann";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ccims.rss.iste.unistuttgart.de/eclipseplugin/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.unistuttgart.iste.rss.ccims.eclipseplugin.data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CcimsDatamodelPackage eINSTANCE = de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.ComponentImpl
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDED_INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Consumed Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONSUMED_INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.InterfaceImpl
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueImpl <em>Cross Component Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueImpl
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getCrossComponentIssue()
	 * @generated
	 */
	int CROSS_COMPONENT_ISSUE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Text Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE__TEXT_BODY = 1;

	/**
	 * The feature id for the '<em><b>Is Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE__IS_OPEN = 2;

	/**
	 * The feature id for the '<em><b>Assignees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE__ASSIGNEES = 3;

	/**
	 * The feature id for the '<em><b>Represented Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE__REPRESENTED_ISSUES = 4;

	/**
	 * The feature id for the '<em><b>Concerned Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE__CONCERNED_COMPONENTS = 5;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE__LABELS = 6;

	/**
	 * The feature id for the '<em><b>Linked Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE__LINKED_ISSUES = 7;

	/**
	 * The feature id for the '<em><b>Concerned Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE__CONCERNED_INTERFACE = 8;

	/**
	 * The number of structural features of the '<em>Cross Component Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Cross Component Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.DeveloperImpl <em>Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.DeveloperImpl
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getDeveloper()
	 * @generated
	 */
	int DEVELOPER = 3;

	/**
	 * The feature id for the '<em><b>Developed Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__DEVELOPED_COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Assigned Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__ASSIGNED_ISSUES = 2;

	/**
	 * The number of structural features of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueImpl
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Concerned Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CONCERNED_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ID = 2;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueManagementSystemImpl <em>Issue Management System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueManagementSystemImpl
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getIssueManagementSystem()
	 * @generated
	 */
	int ISSUE_MANAGEMENT_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MANAGEMENT_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Location Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI = 1;

	/**
	 * The feature id for the '<em><b>Stored Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES = 2;

	/**
	 * The number of structural features of the '<em>Issue Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MANAGEMENT_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Issue Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MANAGEMENT_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.LabelImpl
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueManagementSystemImpl <em>Cross Component Issue Management System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueManagementSystemImpl
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getCrossComponentIssueManagementSystem()
	 * @generated
	 */
	int CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Issue Root Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__ISSUE_ROOT_LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Managed Cro Co Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES = 1;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS = 2;

	/**
	 * The feature id for the '<em><b>Developers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS = 3;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS = 4;

	/**
	 * The feature id for the '<em><b>Location Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI = 5;

	/**
	 * The number of structural features of the '<em>Cross Component Issue Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Cross Component Issue Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Interfaces</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component#getProvidedInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ProvidedInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component#getConsumedInterfaces <em>Consumed Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumed Interfaces</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component#getConsumedInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ConsumedInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue <em>Cross Component Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Component Issue</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue
	 * @generated
	 */
	EClass getCrossComponentIssue();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getTitle()
	 * @see #getCrossComponentIssue()
	 * @generated
	 */
	EAttribute getCrossComponentIssue_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getTextBody <em>Text Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Body</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getTextBody()
	 * @see #getCrossComponentIssue()
	 * @generated
	 */
	EAttribute getCrossComponentIssue_TextBody();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#isIsOpen <em>Is Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Open</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#isIsOpen()
	 * @see #getCrossComponentIssue()
	 * @generated
	 */
	EAttribute getCrossComponentIssue_IsOpen();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getAssignees <em>Assignees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignees</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getAssignees()
	 * @see #getCrossComponentIssue()
	 * @generated
	 */
	EReference getCrossComponentIssue_Assignees();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getRepresentedIssues <em>Represented Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Represented Issues</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getRepresentedIssues()
	 * @see #getCrossComponentIssue()
	 * @generated
	 */
	EReference getCrossComponentIssue_RepresentedIssues();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getConcernedComponents <em>Concerned Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concerned Components</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getConcernedComponents()
	 * @see #getCrossComponentIssue()
	 * @generated
	 */
	EReference getCrossComponentIssue_ConcernedComponents();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labels</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getLabels()
	 * @see #getCrossComponentIssue()
	 * @generated
	 */
	EReference getCrossComponentIssue_Labels();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getLinkedIssues <em>Linked Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Issues</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getLinkedIssues()
	 * @see #getCrossComponentIssue()
	 * @generated
	 */
	EReference getCrossComponentIssue_LinkedIssues();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getConcernedInterface <em>Concerned Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concerned Interface</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getConcernedInterface()
	 * @see #getCrossComponentIssue()
	 * @generated
	 */
	EReference getCrossComponentIssue_ConcernedInterface();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Developer</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer
	 * @generated
	 */
	EClass getDeveloper();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getDevelopedComponents <em>Developed Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Developed Components</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getDevelopedComponents()
	 * @see #getDeveloper()
	 * @generated
	 */
	EReference getDeveloper_DevelopedComponents();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getName()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getAssignedIssues <em>Assigned Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Issues</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getAssignedIssues()
	 * @see #getDeveloper()
	 * @generated
	 */
	EReference getDeveloper_AssignedIssues();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the container reference '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Location</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getLocation()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Location();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getConcernedComponent <em>Concerned Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concerned Component</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getConcernedComponent()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_ConcernedComponent();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getId()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Id();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem <em>Issue Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Management System</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem
	 * @generated
	 */
	EClass getIssueManagementSystem();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getName()
	 * @see #getIssueManagementSystem()
	 * @generated
	 */
	EAttribute getIssueManagementSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getLocationUri <em>Location Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Uri</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getLocationUri()
	 * @see #getIssueManagementSystem()
	 * @generated
	 */
	EAttribute getIssueManagementSystem_LocationUri();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getStoredIssues <em>Stored Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stored Issues</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getStoredIssues()
	 * @see #getIssueManagementSystem()
	 * @generated
	 */
	EReference getIssueManagementSystem_StoredIssues();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label#getName()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Name();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem <em>Cross Component Issue Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Component Issue Management System</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem
	 * @generated
	 */
	EClass getCrossComponentIssueManagementSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getIssueRootLocations <em>Issue Root Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Root Locations</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getIssueRootLocations()
	 * @see #getCrossComponentIssueManagementSystem()
	 * @generated
	 */
	EReference getCrossComponentIssueManagementSystem_IssueRootLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getManagedCroCoIssues <em>Managed Cro Co Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managed Cro Co Issues</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getManagedCroCoIssues()
	 * @see #getCrossComponentIssueManagementSystem()
	 * @generated
	 */
	EReference getCrossComponentIssueManagementSystem_ManagedCroCoIssues();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getLabels()
	 * @see #getCrossComponentIssueManagementSystem()
	 * @generated
	 */
	EReference getCrossComponentIssueManagementSystem_Labels();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getDevelopers <em>Developers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Developers</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getDevelopers()
	 * @see #getCrossComponentIssueManagementSystem()
	 * @generated
	 */
	EReference getCrossComponentIssueManagementSystem_Developers();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getComponents()
	 * @see #getCrossComponentIssueManagementSystem()
	 * @generated
	 */
	EReference getCrossComponentIssueManagementSystem_Components();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getLocationUri <em>Location Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Uri</em>'.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getLocationUri()
	 * @see #getCrossComponentIssueManagementSystem()
	 * @generated
	 */
	EAttribute getCrossComponentIssueManagementSystem_LocationUri();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CcimsDatamodelFactory getCcimsDatamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.ComponentImpl
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDED_INTERFACES = eINSTANCE.getComponent_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Consumed Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONSUMED_INTERFACES = eINSTANCE.getComponent_ConsumedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.InterfaceImpl
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueImpl <em>Cross Component Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueImpl
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getCrossComponentIssue()
		 * @generated
		 */
		EClass CROSS_COMPONENT_ISSUE = eINSTANCE.getCrossComponentIssue();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_COMPONENT_ISSUE__TITLE = eINSTANCE.getCrossComponentIssue_Title();

		/**
		 * The meta object literal for the '<em><b>Text Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_COMPONENT_ISSUE__TEXT_BODY = eINSTANCE.getCrossComponentIssue_TextBody();

		/**
		 * The meta object literal for the '<em><b>Is Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_COMPONENT_ISSUE__IS_OPEN = eINSTANCE.getCrossComponentIssue_IsOpen();

		/**
		 * The meta object literal for the '<em><b>Assignees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_COMPONENT_ISSUE__ASSIGNEES = eINSTANCE.getCrossComponentIssue_Assignees();

		/**
		 * The meta object literal for the '<em><b>Represented Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_COMPONENT_ISSUE__REPRESENTED_ISSUES = eINSTANCE.getCrossComponentIssue_RepresentedIssues();

		/**
		 * The meta object literal for the '<em><b>Concerned Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_COMPONENT_ISSUE__CONCERNED_COMPONENTS = eINSTANCE.getCrossComponentIssue_ConcernedComponents();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_COMPONENT_ISSUE__LABELS = eINSTANCE.getCrossComponentIssue_Labels();

		/**
		 * The meta object literal for the '<em><b>Linked Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_COMPONENT_ISSUE__LINKED_ISSUES = eINSTANCE.getCrossComponentIssue_LinkedIssues();

		/**
		 * The meta object literal for the '<em><b>Concerned Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_COMPONENT_ISSUE__CONCERNED_INTERFACE = eINSTANCE.getCrossComponentIssue_ConcernedInterface();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.DeveloperImpl <em>Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.DeveloperImpl
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getDeveloper()
		 * @generated
		 */
		EClass DEVELOPER = eINSTANCE.getDeveloper();

		/**
		 * The meta object literal for the '<em><b>Developed Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPER__DEVELOPED_COMPONENTS = eINSTANCE.getDeveloper_DevelopedComponents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__NAME = eINSTANCE.getDeveloper_Name();

		/**
		 * The meta object literal for the '<em><b>Assigned Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPER__ASSIGNED_ISSUES = eINSTANCE.getDeveloper_AssignedIssues();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueImpl
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__LOCATION = eINSTANCE.getIssue_Location();

		/**
		 * The meta object literal for the '<em><b>Concerned Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CONCERNED_COMPONENT = eINSTANCE.getIssue_ConcernedComponent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__ID = eINSTANCE.getIssue_Id();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueManagementSystemImpl <em>Issue Management System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueManagementSystemImpl
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getIssueManagementSystem()
		 * @generated
		 */
		EClass ISSUE_MANAGEMENT_SYSTEM = eINSTANCE.getIssueManagementSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_MANAGEMENT_SYSTEM__NAME = eINSTANCE.getIssueManagementSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Location Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI = eINSTANCE.getIssueManagementSystem_LocationUri();

		/**
		 * The meta object literal for the '<em><b>Stored Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES = eINSTANCE.getIssueManagementSystem_StoredIssues();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.LabelImpl
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueManagementSystemImpl <em>Cross Component Issue Management System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueManagementSystemImpl
		 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CcimsDatamodelPackageImpl#getCrossComponentIssueManagementSystem()
		 * @generated
		 */
		EClass CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM = eINSTANCE.getCrossComponentIssueManagementSystem();

		/**
		 * The meta object literal for the '<em><b>Issue Root Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__ISSUE_ROOT_LOCATIONS = eINSTANCE.getCrossComponentIssueManagementSystem_IssueRootLocations();

		/**
		 * The meta object literal for the '<em><b>Managed Cro Co Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES = eINSTANCE.getCrossComponentIssueManagementSystem_ManagedCroCoIssues();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS = eINSTANCE.getCrossComponentIssueManagementSystem_Labels();

		/**
		 * The meta object literal for the '<em><b>Developers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS = eINSTANCE.getCrossComponentIssueManagementSystem_Developers();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS = eINSTANCE.getCrossComponentIssueManagementSystem_Components();

		/**
		 * The meta object literal for the '<em><b>Location Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI = eINSTANCE.getCrossComponentIssueManagementSystem_LocationUri();

	}

} //CcimsDatamodelPackage
