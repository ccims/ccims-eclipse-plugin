/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location#getResourcePath <em>Resource Path</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location#getLine <em>Line</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location#getComponent <em>Component</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2020 Tim Neumann";

    /**
     * Returns the value of the '<em><b>Resource Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Path</em>' attribute.
     * @see #setResourcePath(String)
     * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getLocation_ResourcePath()
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     */
    String getResourcePath();

    /**
     * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location#getResourcePath <em>Resource Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Path</em>' attribute.
     * @see #getResourcePath()
     * @generated
     */
    void setResourcePath(String value);

    /**
     * Returns the value of the '<em><b>Line</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line</em>' attribute.
     * @see #setLine(int)
     * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getLocation_Line()
     * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
     * @generated
     */
    int getLine();

    /**
     * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location#getLine <em>Line</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line</em>' attribute.
     * @see #getLine()
     * @generated
     */
    void setLine(int value);

    /**
     * Returns the value of the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' reference.
     * @see #setComponent(Component)
     * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getLocation_Component()
     * @model required="true" ordered="false"
     * @generated
     */
    Component getComponent();

    /**
     * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location#getComponent <em>Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component</em>' reference.
     * @see #getComponent()
     * @generated
     */
    void setComponent(Component value);

    /**
     * Returns the value of the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface</em>' reference.
     * @see #setInterface(Interface)
     * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#getLocation_Interface()
     * @model ordered="false"
     * @generated
     */
    Interface getInterface();

    /**
     * Sets the value of the '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location#getInterface <em>Interface</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface</em>' reference.
     * @see #getInterface()
     * @generated
     */
    void setInterface(Interface value);

} // Location
