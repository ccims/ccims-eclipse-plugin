/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label;

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
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueManagementSystemImpl#getManagedCroCoIssues <em>Managed Cro Co Issues</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueManagementSystemImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueManagementSystemImpl#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueManagementSystemImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.CrossComponentIssueManagementSystemImpl#getLocationUri <em>Location Uri</em>}</li>
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
	protected static final String LOCATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationUri() <em>Location Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationUri()
	 * @generated
	 * @ordered
	 */
	protected String locationUri = LOCATION_URI_EDEFAULT;

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
		return CcimsDatamodelPackage.Literals.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossComponentIssue> getManagedCroCoIssues() {
		if (managedCroCoIssues == null) {
			managedCroCoIssues = new EObjectContainmentEList<CrossComponentIssue>(CrossComponentIssue.class, this, CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES);
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
			labels = new EObjectContainmentEList<Label>(Label.class, this, CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS);
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
			developers = new EObjectContainmentEList<Developer>(Developer.class, this, CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS);
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
			components = new EObjectContainmentEList<Component>(Component.class, this, CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationUri() {
		return locationUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationUri(String newLocationUri) {
		String oldLocationUri = locationUri;
		locationUri = newLocationUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI, oldLocationUri, locationUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES:
				return ((InternalEList<?>)getManagedCroCoIssues()).basicRemove(otherEnd, msgs);
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS:
				return ((InternalEList<?>)getDevelopers()).basicRemove(otherEnd, msgs);
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES:
				return getManagedCroCoIssues();
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS:
				return getLabels();
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS:
				return getDevelopers();
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS:
				return getComponents();
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
				return getLocationUri();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES:
				getManagedCroCoIssues().clear();
				getManagedCroCoIssues().addAll((Collection<? extends CrossComponentIssue>)newValue);
				return;
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS:
				getDevelopers().clear();
				getDevelopers().addAll((Collection<? extends Developer>)newValue);
				return;
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
				setLocationUri((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES:
				getManagedCroCoIssues().clear();
				return;
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS:
				getLabels().clear();
				return;
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS:
				getDevelopers().clear();
				return;
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS:
				getComponents().clear();
				return;
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
				setLocationUri(LOCATION_URI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES:
				return managedCroCoIssues != null && !managedCroCoIssues.isEmpty();
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS:
				return labels != null && !labels.isEmpty();
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS:
				return developers != null && !developers.isEmpty();
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS:
				return components != null && !components.isEmpty();
			case CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
				return LOCATION_URI_EDEFAULT == null ? locationUri != null : !LOCATION_URI_EDEFAULT.equals(locationUri);
		}
		return super.eIsSet(featureID);
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
