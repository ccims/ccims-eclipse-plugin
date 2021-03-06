/**
 * Copyright (C) 2020, Tim Neumann <neumantm@fius.informatik.uni-stuttgart.de>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.unistuttgart.iste.gropius.ei.data.impl;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;
import de.unistuttgart.iste.gropius.ei.data.Developer;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage;
import de.unistuttgart.iste.gropius.ei.data.Label;
import de.unistuttgart.iste.gropius.ei.data.Location;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Component Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueImpl#getTextBody <em>Text Body</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueImpl#isIsOpen <em>Is Open</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueImpl#getAssignees <em>Assignees</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueImpl#getLinkedIssues <em>Linked Issues</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossComponentIssueImpl extends MinimalEObjectImpl.Container implements CrossComponentIssue {
    /**
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected String title = TITLE_EDEFAULT;

    /**
     * The default value of the '{@link #getTextBody() <em>Text Body</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextBody()
     * @generated
     * @ordered
     */
    protected static final String TEXT_BODY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTextBody() <em>Text Body</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextBody()
     * @generated
     * @ordered
     */
    protected String textBody = TEXT_BODY_EDEFAULT;

    /**
     * The default value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOpen()
     * @generated
     * @ordered
     */
    protected static final boolean IS_OPEN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOpen()
     * @generated
     * @ordered
     */
    protected boolean isOpen = IS_OPEN_EDEFAULT;

    /**
     * The cached value of the '{@link #getAssignees() <em>Assignees</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssignees()
     * @generated
     * @ordered
     */
    protected EList<Developer> assignees;

    /**
     * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabels()
     * @generated
     * @ordered
     */
    protected EList<Label> labels;

    /**
     * The cached value of the '{@link #getLinkedIssues() <em>Linked Issues</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLinkedIssues()
     * @generated
     * @ordered
     */
    protected EList<CrossComponentIssue> linkedIssues;

    /**
     * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocations()
     * @generated
     * @ordered
     */
    protected EList<Location> locations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CrossComponentIssueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GropiusDataPackage.Literals.CROSS_COMPONENT_ISSUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTitle(String newTitle) {
        String oldTitle = title;
        title = newTitle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GropiusDataPackage.CROSS_COMPONENT_ISSUE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTextBody() {
        return textBody;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTextBody(String newTextBody) {
        String oldTextBody = textBody;
        textBody = newTextBody;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GropiusDataPackage.CROSS_COMPONENT_ISSUE__TEXT_BODY, oldTextBody, textBody));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsOpen() {
        return isOpen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsOpen(boolean newIsOpen) {
        boolean oldIsOpen = isOpen;
        isOpen = newIsOpen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GropiusDataPackage.CROSS_COMPONENT_ISSUE__IS_OPEN, oldIsOpen, isOpen));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Developer> getAssignees() {
        if (assignees == null) {
            assignees = new EObjectWithInverseResolvingEList.ManyInverse<Developer>(Developer.class, this, GropiusDataPackage.CROSS_COMPONENT_ISSUE__ASSIGNEES, GropiusDataPackage.DEVELOPER__ASSIGNED_ISSUES);
        }
        return assignees;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Label> getLabels() {
        if (labels == null) {
            labels = new EObjectResolvingEList<Label>(Label.class, this, GropiusDataPackage.CROSS_COMPONENT_ISSUE__LABELS);
        }
        return labels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<CrossComponentIssue> getLinkedIssues() {
        if (linkedIssues == null) {
            linkedIssues = new EObjectResolvingEList<CrossComponentIssue>(CrossComponentIssue.class, this, GropiusDataPackage.CROSS_COMPONENT_ISSUE__LINKED_ISSUES);
        }
        return linkedIssues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Location> getLocations() {
        if (locations == null) {
            locations = new EObjectContainmentEList<Location>(Location.class, this, GropiusDataPackage.CROSS_COMPONENT_ISSUE__LOCATIONS);
        }
        return locations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__ASSIGNEES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignees()).basicAdd(otherEnd, msgs);
            default:
                return super.eInverseAdd(otherEnd, featureID, msgs);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__ASSIGNEES:
                return ((InternalEList<?>)getAssignees()).basicRemove(otherEnd, msgs);
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LOCATIONS:
                return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
            default:
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__TITLE:
                return getTitle();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__TEXT_BODY:
                return getTextBody();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__IS_OPEN:
                return isIsOpen();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__ASSIGNEES:
                return getAssignees();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LABELS:
                return getLabels();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LINKED_ISSUES:
                return getLinkedIssues();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LOCATIONS:
                return getLocations();
            default:
                return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__TITLE:
                setTitle((String)newValue);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__TEXT_BODY:
                setTextBody((String)newValue);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__IS_OPEN:
                setIsOpen((Boolean)newValue);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__ASSIGNEES:
                getAssignees().clear();
                getAssignees().addAll((Collection<? extends Developer>)newValue);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LABELS:
                getLabels().clear();
                getLabels().addAll((Collection<? extends Label>)newValue);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LINKED_ISSUES:
                getLinkedIssues().clear();
                getLinkedIssues().addAll((Collection<? extends CrossComponentIssue>)newValue);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LOCATIONS:
                getLocations().clear();
                getLocations().addAll((Collection<? extends Location>)newValue);
                return;
            default:
                super.eSet(featureID, newValue);
                return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__TEXT_BODY:
                setTextBody(TEXT_BODY_EDEFAULT);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__IS_OPEN:
                setIsOpen(IS_OPEN_EDEFAULT);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__ASSIGNEES:
                getAssignees().clear();
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LABELS:
                getLabels().clear();
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LINKED_ISSUES:
                getLinkedIssues().clear();
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LOCATIONS:
                getLocations().clear();
                return;
            default:
                super.eUnset(featureID);
                return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__TEXT_BODY:
                return TEXT_BODY_EDEFAULT == null ? textBody != null : !TEXT_BODY_EDEFAULT.equals(textBody);
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__IS_OPEN:
                return isOpen != IS_OPEN_EDEFAULT;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__ASSIGNEES:
                return assignees != null && !assignees.isEmpty();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LABELS:
                return labels != null && !labels.isEmpty();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LINKED_ISSUES:
                return linkedIssues != null && !linkedIssues.isEmpty();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE__LOCATIONS:
                return locations != null && !locations.isEmpty();
            default:
                return super.eIsSet(featureID);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (title: ");
        result.append(title);
        result.append(", textBody: ");
        result.append(textBody);
        result.append(", isOpen: ");
        result.append(isOpen);
        result.append(')');
        return result.toString();
    }

} //CrossComponentIssueImpl
