/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueImpl#getConcernedComponent <em>Concerned Component</em>}</li>
 *   <li>{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl.IssueImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends MinimalEObjectImpl.Container implements Issue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 Tim Neumann";

	/**
	 * The cached value of the '{@link #getConcernedComponent() <em>Concerned Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernedComponent()
	 * @generated
	 * @ordered
	 */
	protected Component concernedComponent;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CcimsDatamodelPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueManagementSystem getLocation() {
		if (eContainerFeatureID() != CcimsDatamodelPackage.ISSUE__LOCATION) return null;
		return (IssueManagementSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(IssueManagementSystem newLocation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLocation, CcimsDatamodelPackage.ISSUE__LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(IssueManagementSystem newLocation) {
		if (newLocation != eInternalContainer() || (eContainerFeatureID() != CcimsDatamodelPackage.ISSUE__LOCATION && newLocation != null)) {
			if (EcoreUtil.isAncestor(this, newLocation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES, IssueManagementSystem.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcimsDatamodelPackage.ISSUE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getConcernedComponent() {
		if (concernedComponent != null && concernedComponent.eIsProxy()) {
			InternalEObject oldConcernedComponent = (InternalEObject)concernedComponent;
			concernedComponent = (Component)eResolveProxy(oldConcernedComponent);
			if (concernedComponent != oldConcernedComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CcimsDatamodelPackage.ISSUE__CONCERNED_COMPONENT, oldConcernedComponent, concernedComponent));
			}
		}
		return concernedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetConcernedComponent() {
		return concernedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConcernedComponent(Component newConcernedComponent) {
		Component oldConcernedComponent = concernedComponent;
		concernedComponent = newConcernedComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcimsDatamodelPackage.ISSUE__CONCERNED_COMPONENT, oldConcernedComponent, concernedComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcimsDatamodelPackage.ISSUE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CcimsDatamodelPackage.ISSUE__LOCATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocation((IssueManagementSystem)otherEnd, msgs);
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
			case CcimsDatamodelPackage.ISSUE__LOCATION:
				return basicSetLocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CcimsDatamodelPackage.ISSUE__LOCATION:
				return eInternalContainer().eInverseRemove(this, CcimsDatamodelPackage.ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES, IssueManagementSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CcimsDatamodelPackage.ISSUE__LOCATION:
				return getLocation();
			case CcimsDatamodelPackage.ISSUE__CONCERNED_COMPONENT:
				if (resolve) return getConcernedComponent();
				return basicGetConcernedComponent();
			case CcimsDatamodelPackage.ISSUE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CcimsDatamodelPackage.ISSUE__LOCATION:
				setLocation((IssueManagementSystem)newValue);
				return;
			case CcimsDatamodelPackage.ISSUE__CONCERNED_COMPONENT:
				setConcernedComponent((Component)newValue);
				return;
			case CcimsDatamodelPackage.ISSUE__ID:
				setId((Integer)newValue);
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
			case CcimsDatamodelPackage.ISSUE__LOCATION:
				setLocation((IssueManagementSystem)null);
				return;
			case CcimsDatamodelPackage.ISSUE__CONCERNED_COMPONENT:
				setConcernedComponent((Component)null);
				return;
			case CcimsDatamodelPackage.ISSUE__ID:
				setId(ID_EDEFAULT);
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
			case CcimsDatamodelPackage.ISSUE__LOCATION:
				return getLocation() != null;
			case CcimsDatamodelPackage.ISSUE__CONCERNED_COMPONENT:
				return concernedComponent != null;
			case CcimsDatamodelPackage.ISSUE__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
