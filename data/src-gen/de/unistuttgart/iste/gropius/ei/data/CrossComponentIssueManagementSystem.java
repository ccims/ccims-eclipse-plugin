/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.gropius.ei.data;

import java.net.URI;

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
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem#getManagedCroCoIssues <em>Managed Cro Co Issues</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem#getComponents <em>Components</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem#getLocationUri <em>Location Uri</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssueManagementSystem()
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
     * The list contents are of type {@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Managed Cro Co Issues</em>' containment reference list.
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssueManagementSystem_ManagedCroCoIssues()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<CrossComponentIssue> getManagedCroCoIssues();

    /**
     * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
     * The list contents are of type {@link de.unistuttgart.iste.gropius.ei.data.Label}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labels</em>' containment reference list.
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssueManagementSystem_Labels()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Label> getLabels();

    /**
     * Returns the value of the '<em><b>Developers</b></em>' containment reference list.
     * The list contents are of type {@link de.unistuttgart.iste.gropius.ei.data.Developer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Developers</em>' containment reference list.
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssueManagementSystem_Developers()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Developer> getDevelopers();

    /**
     * Returns the value of the '<em><b>Components</b></em>' containment reference list.
     * The list contents are of type {@link de.unistuttgart.iste.gropius.ei.data.Component}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Components</em>' containment reference list.
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssueManagementSystem_Components()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Component> getComponents();

    /**
     * Returns the value of the '<em><b>Location Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location Uri</em>' attribute.
     * @see #setLocationUri(URI)
     * @see de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage#getCrossComponentIssueManagementSystem_LocationUri()
     * @model dataType="de.unistuttgart.iste.gropius.ei.data.URI" required="true" ordered="false"
     * @generated
     */
    URI getLocationUri();

    /**
     * Sets the value of the '{@link de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem#getLocationUri <em>Location Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location Uri</em>' attribute.
     * @see #getLocationUri()
     * @generated
     */
    void setLocationUri(URI value);

} // CrossComponentIssueManagementSystem
