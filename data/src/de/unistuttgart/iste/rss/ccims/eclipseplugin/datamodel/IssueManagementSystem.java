/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Management System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getLocationUri <em>Location Uri</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getStoredIssues <em>Stored Issues</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getIssueManagementSystem()
 * @model
 * @generated
 */
public interface IssueManagementSystem extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 Tim Neumann";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getIssueManagementSystem_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Uri</em>' attribute.
	 * @see #setLocationUri(String)
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getIssueManagementSystem_LocationUri()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLocationUri();

	/**
	 * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getLocationUri <em>Location Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Uri</em>' attribute.
	 * @see #getLocationUri()
	 * @generated
	 */
	void setLocationUri(String value);

	/**
	 * Returns the value of the '<em><b>Stored Issues</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue}.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored Issues</em>' containment reference list.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getIssueManagementSystem_StoredIssues()
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getLocation
	 * @model opposite="location" containment="true" ordered="false"
	 * @generated
	 */
	EList<Issue> getStoredIssues();

} // IssueManagementSystem
