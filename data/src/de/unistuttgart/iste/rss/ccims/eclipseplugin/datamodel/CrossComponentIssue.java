/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Component Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getTitle <em>Title</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getTextBody <em>Text Body</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#isIsOpen <em>Is Open</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getAssignees <em>Assignees</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getConcernedComponents <em>Concerned Components</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getLinkedIssues <em>Linked Issues</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getConcernedInterface <em>Concerned Interface</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssue()
 * @model
 * @generated
 */
public interface CrossComponentIssue extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 Tim Neumann";

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssue_Title()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Text Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Body</em>' attribute.
	 * @see #setTextBody(String)
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssue_TextBody()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTextBody();

	/**
	 * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getTextBody <em>Text Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Body</em>' attribute.
	 * @see #getTextBody()
	 * @generated
	 */
	void setTextBody(String value);

	/**
	 * Returns the value of the '<em><b>Is Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Open</em>' attribute.
	 * @see #setIsOpen(boolean)
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssue_IsOpen()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOpen();

	/**
	 * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#isIsOpen <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Open</em>' attribute.
	 * @see #isIsOpen()
	 * @generated
	 */
	void setIsOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Assignees</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer}.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getAssignedIssues <em>Assigned Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignees</em>' reference list.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssue_Assignees()
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer#getAssignedIssues
	 * @model opposite="assignedIssues" ordered="false"
	 * @generated
	 */
	EList<Developer> getAssignees();

	/**
	 * Returns the value of the '<em><b>Concerned Components</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerned Components</em>' reference list.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssue_ConcernedComponents()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Component> getConcernedComponents();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference list.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssue_Labels()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Linked Issues</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Issues</em>' reference list.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssue_LinkedIssues()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CrossComponentIssue> getLinkedIssues();

	/**
	 * Returns the value of the '<em><b>Concerned Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerned Interface</em>' reference.
	 * @see #setConcernedInterface(Interface)
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getCrossComponentIssue_ConcernedInterface()
	 * @model ordered="false"
	 * @generated
	 */
	Interface getConcernedInterface();

	/**
	 * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue#getConcernedInterface <em>Concerned Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerned Interface</em>' reference.
	 * @see #getConcernedInterface()
	 * @generated
	 */
	void setConcernedInterface(Interface value);

} // CrossComponentIssue
