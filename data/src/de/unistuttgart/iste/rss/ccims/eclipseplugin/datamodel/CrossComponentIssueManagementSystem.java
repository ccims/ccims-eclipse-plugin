/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Component Issue Management System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getManagedCroCoIssues <em>Managed Cro Co Issues</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getComponents <em>Components</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getLocationUri <em>Location Uri</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssueManagementSystem()
 * @model
 * @generated
 */
public interface CrossComponentIssueManagementSystem extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 Tim Neumann";

	/**
	 * Returns the value of the '<em><b>Managed Cro Co Issues</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Cro Co Issues</em>' containment reference list.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssueManagementSystem_ManagedCroCoIssues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CrossComponentIssue> getManagedCroCoIssues();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssueManagementSystem_Labels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Developers</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developers</em>' containment reference list.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssueManagementSystem_Developers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Developer> getDevelopers();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssueManagementSystem_Components()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Location Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Uri</em>' attribute.
	 * @see #setLocationUri(String)
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssueManagementSystem_LocationUri()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLocationUri();

	/**
	 * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem#getLocationUri <em>Location Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Uri</em>' attribute.
	 * @see #getLocationUri()
	 * @generated
	 */
	void setLocationUri(String value);

} // CrossComponentIssueManagementSystem
