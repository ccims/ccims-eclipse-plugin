/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.gropius.ei.data.impl;

import de.unistuttgart.iste.gropius.ei.data.Component;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage;
import de.unistuttgart.iste.gropius.ei.data.Interface;
import de.unistuttgart.iste.gropius.ei.data.Location;

import java.net.URI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.LocationImpl#getResourcePath <em>Resource Path</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.LocationImpl#getLine <em>Line</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.LocationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.unistuttgart.iste.gropius.ei.data.impl.LocationImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2020 Tim Neumann";

    /**
     * The default value of the '{@link #getResourcePath() <em>Resource Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourcePath()
     * @generated
     * @ordered
     */
    protected static final URI RESOURCE_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResourcePath() <em>Resource Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourcePath()
     * @generated
     * @ordered
     */
    protected URI resourcePath = RESOURCE_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLine()
     * @generated
     * @ordered
     */
    protected static final int LINE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLine()
     * @generated
     * @ordered
     */
    protected int line = LINE_EDEFAULT;

    /**
     * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponent()
     * @generated
     * @ordered
     */
    protected Component component;

    /**
     * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterface()
     * @generated
     * @ordered
     */
    protected Interface interface_;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LocationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GropiusDataPackage.Literals.LOCATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public URI getResourcePath() {
        return resourcePath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResourcePath(URI newResourcePath) {
        URI oldResourcePath = resourcePath;
        resourcePath = newResourcePath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GropiusDataPackage.LOCATION__RESOURCE_PATH, oldResourcePath, resourcePath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getLine() {
        return line;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLine(int newLine) {
        int oldLine = line;
        line = newLine;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GropiusDataPackage.LOCATION__LINE, oldLine, line));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Component getComponent() {
        if (component != null && component.eIsProxy()) {
            InternalEObject oldComponent = (InternalEObject)component;
            component = (Component)eResolveProxy(oldComponent);
            if (component != oldComponent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusDataPackage.LOCATION__COMPONENT, oldComponent, component));
            }
        }
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component basicGetComponent() {
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setComponent(Component newComponent) {
        Component oldComponent = component;
        component = newComponent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GropiusDataPackage.LOCATION__COMPONENT, oldComponent, component));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Interface getInterface() {
        if (interface_ != null && interface_.eIsProxy()) {
            InternalEObject oldInterface = (InternalEObject)interface_;
            interface_ = (Interface)eResolveProxy(oldInterface);
            if (interface_ != oldInterface) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusDataPackage.LOCATION__INTERFACE, oldInterface, interface_));
            }
        }
        return interface_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface basicGetInterface() {
        return interface_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInterface(Interface newInterface) {
        Interface oldInterface = interface_;
        interface_ = newInterface;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GropiusDataPackage.LOCATION__INTERFACE, oldInterface, interface_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GropiusDataPackage.LOCATION__RESOURCE_PATH:
                return getResourcePath();
            case GropiusDataPackage.LOCATION__LINE:
                return getLine();
            case GropiusDataPackage.LOCATION__COMPONENT:
                if (resolve) return getComponent();
                return basicGetComponent();
            case GropiusDataPackage.LOCATION__INTERFACE:
                if (resolve) return getInterface();
                return basicGetInterface();
            default:
                return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case GropiusDataPackage.LOCATION__RESOURCE_PATH:
                setResourcePath((URI)newValue);
                return;
            case GropiusDataPackage.LOCATION__LINE:
                setLine((Integer)newValue);
                return;
            case GropiusDataPackage.LOCATION__COMPONENT:
                setComponent((Component)newValue);
                return;
            case GropiusDataPackage.LOCATION__INTERFACE:
                setInterface((Interface)newValue);
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
            case GropiusDataPackage.LOCATION__RESOURCE_PATH:
                setResourcePath(RESOURCE_PATH_EDEFAULT);
                return;
            case GropiusDataPackage.LOCATION__LINE:
                setLine(LINE_EDEFAULT);
                return;
            case GropiusDataPackage.LOCATION__COMPONENT:
                setComponent((Component)null);
                return;
            case GropiusDataPackage.LOCATION__INTERFACE:
                setInterface((Interface)null);
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
            case GropiusDataPackage.LOCATION__RESOURCE_PATH:
                return RESOURCE_PATH_EDEFAULT == null ? resourcePath != null : !RESOURCE_PATH_EDEFAULT.equals(resourcePath);
            case GropiusDataPackage.LOCATION__LINE:
                return line != LINE_EDEFAULT;
            case GropiusDataPackage.LOCATION__COMPONENT:
                return component != null;
            case GropiusDataPackage.LOCATION__INTERFACE:
                return interface_ != null;
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
        result.append(" (resourcePath: ");
        result.append(resourcePath);
        result.append(", line: ");
        result.append(line);
        result.append(')');
        return result.toString();
    }

} //LocationImpl
