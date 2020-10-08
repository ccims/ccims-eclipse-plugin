/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.gropius.ei.data.impl;

import de.unistuttgart.iste.gropius.ei.data.Component;
import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;
import de.unistuttgart.iste.gropius.ei.data.Developer;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.DeveloperImpl#getDevelopedComponents <em>Developed Components</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.DeveloperImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.DeveloperImpl#getAssignedIssues <em>Assigned Issues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeveloperImpl extends MinimalEObjectImpl.Container implements Developer {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2020 Tim Neumann";

    /**
     * The cached value of the '{@link #getDevelopedComponents() <em>Developed Components</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDevelopedComponents()
     * @generated
     * @ordered
     */
    protected EList<Component> developedComponents;

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
     * The cached value of the '{@link #getAssignedIssues() <em>Assigned Issues</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssignedIssues()
     * @generated
     * @ordered
     */
    protected EList<CrossComponentIssue> assignedIssues;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeveloperImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GropiusDataPackage.Literals.DEVELOPER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Component> getDevelopedComponents() {
        if (developedComponents == null) {
            developedComponents = new EObjectResolvingEList<Component>(Component.class, this, GropiusDataPackage.DEVELOPER__DEVELOPED_COMPONENTS);
        }
        return developedComponents;
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
            eNotify(new ENotificationImpl(this, Notification.SET, GropiusDataPackage.DEVELOPER__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<CrossComponentIssue> getAssignedIssues() {
        if (assignedIssues == null) {
            assignedIssues = new EObjectWithInverseResolvingEList.ManyInverse<CrossComponentIssue>(CrossComponentIssue.class, this, GropiusDataPackage.DEVELOPER__ASSIGNED_ISSUES, GropiusDataPackage.CROSS_COMPONENT_ISSUE__ASSIGNEES);
        }
        return assignedIssues;
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
            case GropiusDataPackage.DEVELOPER__ASSIGNED_ISSUES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedIssues()).basicAdd(otherEnd, msgs);
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
            case GropiusDataPackage.DEVELOPER__ASSIGNED_ISSUES:
                return ((InternalEList<?>)getAssignedIssues()).basicRemove(otherEnd, msgs);
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
            case GropiusDataPackage.DEVELOPER__DEVELOPED_COMPONENTS:
                return getDevelopedComponents();
            case GropiusDataPackage.DEVELOPER__NAME:
                return getName();
            case GropiusDataPackage.DEVELOPER__ASSIGNED_ISSUES:
                return getAssignedIssues();
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
            case GropiusDataPackage.DEVELOPER__DEVELOPED_COMPONENTS:
                getDevelopedComponents().clear();
                getDevelopedComponents().addAll((Collection<? extends Component>)newValue);
                return;
            case GropiusDataPackage.DEVELOPER__NAME:
                setName((String)newValue);
                return;
            case GropiusDataPackage.DEVELOPER__ASSIGNED_ISSUES:
                getAssignedIssues().clear();
                getAssignedIssues().addAll((Collection<? extends CrossComponentIssue>)newValue);
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
            case GropiusDataPackage.DEVELOPER__DEVELOPED_COMPONENTS:
                getDevelopedComponents().clear();
                return;
            case GropiusDataPackage.DEVELOPER__NAME:
                setName(NAME_EDEFAULT);
                return;
            case GropiusDataPackage.DEVELOPER__ASSIGNED_ISSUES:
                getAssignedIssues().clear();
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
            case GropiusDataPackage.DEVELOPER__DEVELOPED_COMPONENTS:
                return developedComponents != null && !developedComponents.isEmpty();
            case GropiusDataPackage.DEVELOPER__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case GropiusDataPackage.DEVELOPER__ASSIGNED_ISSUES:
                return assignedIssues != null && !assignedIssues.isEmpty();
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

} //DeveloperImpl
