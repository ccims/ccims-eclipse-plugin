/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.gropius.ei.data.impl;

import de.unistuttgart.iste.gropius.ei.data.Component;
import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;
import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.gropius.ei.data.Developer;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage;
import de.unistuttgart.iste.gropius.ei.data.Label;

import java.net.URI;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Component Issue Management System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueManagementSystemImpl#getManagedCroCoIssues <em>Managed Cro Co Issues</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueManagementSystemImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueManagementSystemImpl#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueManagementSystemImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.CrossComponentIssueManagementSystemImpl#getLocationUri <em>Location Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossComponentIssueManagementSystemImpl extends MinimalEObjectImpl.Container implements CrossComponentIssueManagementSystem {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2020 Tim Neumann";

    /**
     * The cached value of the '{@link #getManagedCroCoIssues() <em>Managed Cro Co Issues</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManagedCroCoIssues()
     * @generated
     * @ordered
     */
    protected EList<CrossComponentIssue> managedCroCoIssues;

    /**
     * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabels()
     * @generated
     * @ordered
     */
    protected EList<Label> labels;

    /**
     * The cached value of the '{@link #getDevelopers() <em>Developers</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDevelopers()
     * @generated
     * @ordered
     */
    protected EList<Developer> developers;

    /**
     * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponents()
     * @generated
     * @ordered
     */
    protected EList<Component> components;

    /**
     * The default value of the '{@link #getLocationUri() <em>Location Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocationUri()
     * @generated
     * @ordered
     */
    protected static final URI LOCATION_URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocationUri() <em>Location Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocationUri()
     * @generated
     * @ordered
     */
    protected URI locationUri = LOCATION_URI_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CrossComponentIssueManagementSystemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GropiusDataPackage.Literals.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<CrossComponentIssue> getManagedCroCoIssues() {
        if (managedCroCoIssues == null) {
            managedCroCoIssues = new EObjectContainmentEList<CrossComponentIssue>(CrossComponentIssue.class, this, GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES);
        }
        return managedCroCoIssues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Label> getLabels() {
        if (labels == null) {
            labels = new EObjectContainmentEList<Label>(Label.class, this, GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS);
        }
        return labels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Developer> getDevelopers() {
        if (developers == null) {
            developers = new EObjectContainmentEList<Developer>(Developer.class, this, GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS);
        }
        return developers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Component> getComponents() {
        if (components == null) {
            components = new EObjectContainmentEList<Component>(Component.class, this, GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS);
        }
        return components;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public URI getLocationUri() {
        return locationUri;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLocationUri(URI newLocationUri) {
        URI oldLocationUri = locationUri;
        locationUri = newLocationUri;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI, oldLocationUri, locationUri));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES:
                return ((InternalEList<?>)getManagedCroCoIssues()).basicRemove(otherEnd, msgs);
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS:
                return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS:
                return ((InternalEList<?>)getDevelopers()).basicRemove(otherEnd, msgs);
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS:
                return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES:
                return getManagedCroCoIssues();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS:
                return getLabels();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS:
                return getDevelopers();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS:
                return getComponents();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
                return getLocationUri();
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
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES:
                getManagedCroCoIssues().clear();
                getManagedCroCoIssues().addAll((Collection<? extends CrossComponentIssue>)newValue);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS:
                getLabels().clear();
                getLabels().addAll((Collection<? extends Label>)newValue);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS:
                getDevelopers().clear();
                getDevelopers().addAll((Collection<? extends Developer>)newValue);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS:
                getComponents().clear();
                getComponents().addAll((Collection<? extends Component>)newValue);
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
                setLocationUri((URI)newValue);
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
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES:
                getManagedCroCoIssues().clear();
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS:
                getLabels().clear();
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS:
                getDevelopers().clear();
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS:
                getComponents().clear();
                return;
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
                setLocationUri(LOCATION_URI_EDEFAULT);
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
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES:
                return managedCroCoIssues != null && !managedCroCoIssues.isEmpty();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS:
                return labels != null && !labels.isEmpty();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS:
                return developers != null && !developers.isEmpty();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS:
                return components != null && !components.isEmpty();
            case GropiusDataPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
                return LOCATION_URI_EDEFAULT == null ? locationUri != null : !LOCATION_URI_EDEFAULT.equals(locationUri);
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
        result.append(" (locationUri: ");
        result.append(locationUri);
        result.append(')');
        return result.toString();
    }

} //CrossComponentIssueManagementSystemImpl
