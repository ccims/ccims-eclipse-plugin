/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getDevelopedComponents <em>Developed Components</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getAssignedIssues <em>Assigned Issues</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getDeveloper()
 * @model
 * @generated
 */
public interface Developer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 Tim Neumann";

	/**
	 * Returns the value of the '<em><b>Developed Components</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developed Components</em>' reference list.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getDeveloper_DevelopedComponents()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Component> getDevelopedComponents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getDeveloper_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assigned Issues</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue}.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getAssignees <em>Assignees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Issues</em>' reference list.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getDeveloper_AssignedIssues()
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getAssignees
	 * @model opposite="assignees" ordered="false"
	 * @generated
	 */
	EList<CrossComponentIssue> getAssignedIssues();

} // Developer
