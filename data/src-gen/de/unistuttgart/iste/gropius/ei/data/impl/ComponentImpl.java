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

import de.unistuttgart.iste.gropius.ei.data.Component;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage;
import de.unistuttgart.iste.gropius.ei.data.Interface;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.ComponentImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.ComponentImpl#getConsumedInterfaces <em>Consumed Interfaces</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.ComponentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
    /**
     * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvidedInterfaces()
     * @generated
     * @ordered
     */
    protected EList<Interface> providedInterfaces;

    /**
     * The cached value of the '{@link #getConsumedInterfaces() <em>Consumed Interfaces</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumedInterfaces()
     * @generated
     * @ordered
     */
    protected EList<Interface> consumedInterfaces;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GropiusDataPackage.Literals.COMPONENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Interface> getProvidedInterfaces() {
        if (providedInterfaces == null) {
            providedInterfaces = new EObjectContainmentEList<Interface>(Interface.class, this, GropiusDataPackage.COMPONENT__PROVIDED_INTERFACES);
        }
        return providedInterfaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Interface> getConsumedInterfaces() {
        if (consumedInterfaces == null) {
            consumedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, GropiusDataPackage.COMPONENT__CONSUMED_INTERFACES);
        }
        return consumedInterfaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GropiusDataPackage.COMPONENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GropiusDataPackage.COMPONENT__PROVIDED_INTERFACES:
                return ((InternalEList<?>)getProvidedInterfaces()).basicRemove(otherEnd, msgs);
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
            case GropiusDataPackage.COMPONENT__PROVIDED_INTERFACES:
                return getProvidedInterfaces();
            case GropiusDataPackage.COMPONENT__CONSUMED_INTERFACES:
                return getConsumedInterfaces();
            case GropiusDataPackage.COMPONENT__NAME:
                return getName();
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
            case GropiusDataPackage.COMPONENT__PROVIDED_INTERFACES:
                getProvidedInterfaces().clear();
                getProvidedInterfaces().addAll((Collection<? extends Interface>)newValue);
                return;
            case GropiusDataPackage.COMPONENT__CONSUMED_INTERFACES:
                getConsumedInterfaces().clear();
                getConsumedInterfaces().addAll((Collection<? extends Interface>)newValue);
                return;
            case GropiusDataPackage.COMPONENT__NAME:
                setName((String)newValue);
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
            case GropiusDataPackage.COMPONENT__PROVIDED_INTERFACES:
                getProvidedInterfaces().clear();
                return;
            case GropiusDataPackage.COMPONENT__CONSUMED_INTERFACES:
                getConsumedInterfaces().clear();
                return;
            case GropiusDataPackage.COMPONENT__NAME:
                setName(NAME_EDEFAULT);
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
            case GropiusDataPackage.COMPONENT__PROVIDED_INTERFACES:
                return providedInterfaces != null && !providedInterfaces.isEmpty();
            case GropiusDataPackage.COMPONENT__CONSUMED_INTERFACES:
                return consumedInterfaces != null && !consumedInterfaces.isEmpty();
            case GropiusDataPackage.COMPONENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ComponentImpl
