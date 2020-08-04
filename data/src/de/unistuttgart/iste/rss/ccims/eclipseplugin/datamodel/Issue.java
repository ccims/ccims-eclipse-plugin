/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getLocation <em>Location</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getConcernedComponent <em>Concerned Component</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 Tim Neumann";

	/**
	 * Returns the value of the '<em><b>Location</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getStoredIssues <em>Stored Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' container reference.
	 * @see #setLocation(IssueManagementSystem)
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getIssue_Location()
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem#getStoredIssues
	 * @model opposite="storedIssues" required="true" transient="false" ordered="false"
	 * @generated
	 */
	IssueManagementSystem getLocation();

	/**
	 * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getLocation <em>Location</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' container reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(IssueManagementSystem value);

	/**
	 * Returns the value of the '<em><b>Concerned Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerned Component</em>' reference.
	 * @see #setConcernedComponent(Component)
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getIssue_ConcernedComponent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getConcernedComponent();

	/**
	 * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getConcernedComponent <em>Concerned Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerned Component</em>' reference.
	 * @see #getConcernedComponent()
	 * @generated
	 */
	void setConcernedComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getIssue_Id()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Issue
