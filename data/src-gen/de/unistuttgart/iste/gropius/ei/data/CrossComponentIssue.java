/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.gropius.ei.data;

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
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue#getTitle <em>Title</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue#getTextBody <em>Text Body</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue#isIsOpen <em>Is Open</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue#getAssignees <em>Assignees</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue#getLinkedIssues <em>Linked Issues</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssue()
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
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssue_Title()
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue#getTitle <em>Title</em>}' attribute.
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
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssue_TextBody()
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     */
    String getTextBody();

    /**
     * Sets the value of the '{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue#getTextBody <em>Text Body</em>}' attribute.
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
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssue_IsOpen()
     * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isIsOpen();

    /**
     * Sets the value of the '{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue#isIsOpen <em>Is Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Open</em>' attribute.
     * @see #isIsOpen()
     * @generated
     */
    void setIsOpen(boolean value);

    /**
     * Returns the value of the '<em><b>Assignees</b></em>' reference list.
     * The list contents are of type {@link de.unistuttgart.iste.gropius.ei.data.Developer}.
     * It is bidirectional and its opposite is '{@link de.unistuttgart.iste.gropius.ei.data.Developer#getAssignedIssues <em>Assigned Issues</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignees</em>' reference list.
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssue_Assignees()
     * @see de.unistuttgart.iste.gropius.ei.data.Developer#getAssignedIssues
     * @model opposite="assignedIssues" ordered="false"
     * @generated
     */
    EList<Developer> getAssignees();

    /**
     * Returns the value of the '<em><b>Labels</b></em>' reference list.
     * The list contents are of type {@link de.unistuttgart.iste.gropius.ei.data.Label}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labels</em>' reference list.
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssue_Labels()
     * @model ordered="false"
     * @generated
     */
    EList<Label> getLabels();

    /**
     * Returns the value of the '<em><b>Linked Issues</b></em>' reference list.
     * The list contents are of type {@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Linked Issues</em>' reference list.
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssue_LinkedIssues()
     * @model ordered="false"
     * @generated
     */
    EList<CrossComponentIssue> getLinkedIssues();

    /**
     * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
     * The list contents are of type {@link de.unistuttgart.iste.gropius.ei.data.Location}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Locations</em>' containment reference list.
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssue_Locations()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Location> getLocations();

} // CrossComponentIssue
