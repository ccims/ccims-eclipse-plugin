/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Management System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueManagementSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueManagementSystemImpl#getLocationUri <em>Location Uri</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueManagementSystemImpl#getStoredIssues <em>Stored Issues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueManagementSystemImpl extends MinimalEObjectImpl.Container implements IssueManagementSystem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 Tim Neumann";

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
	 * The cached value of the '{@link #getStoredIssues() <em>Stored Issues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> storedIssues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueManagementSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CcimsDatamodelPackage.Literals.ISSUE_MANAGEMENT_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI, oldLocationUri, locationUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Issue> getStoredIssues() {
		if (storedIssues == null) {
			storedIssues = new EObjectContainmentWithInverseEList<Issue>(Issue.class, this, CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES, CcimsDatamodelPackage.ISSUE__LOCATION);
		}
		return storedIssues;
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
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStoredIssues()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES:
				return ((InternalEList<?>)getStoredIssues()).basicRemove(otherEnd, msgs);
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
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__NAME:
				return getName();
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
				return getLocationUri();
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES:
				return getStoredIssues();
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
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
				setLocationUri((String)newValue);
				return;
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES:
				getStoredIssues().clear();
				getStoredIssues().addAll((Collection<? extends Issue>)newValue);
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
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
				setLocationUri(LOCATION_URI_EDEFAULT);
				return;
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES:
				getStoredIssues().clear();
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
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI:
				return LOCATION_URI_EDEFAULT == null ? locationUri != null : !LOCATION_URI_EDEFAULT.equals(locationUri);
			case CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES:
				return storedIssues != null && !storedIssues.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", locationUri: ");
		result.append(locationUri);
		result.append(')');
		return result.toString();
	}

} //IssueManagementSystemImpl
