/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.util;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage
 * @generated
 */
public class CcimsDatamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 Tim Neumann";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CcimsDatamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CcimsDatamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CcimsDatamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CcimsDatamodelSwitch<Adapter> modelSwitch =
		new CcimsDatamodelSwitch<Adapter>() {
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseCrossComponentIssue(CrossComponentIssue object) {
				return createCrossComponentIssueAdapter();
			}
			@Override
			public Adapter caseDeveloper(Developer object) {
				return createDeveloperAdapter();
			}
			@Override
			public Adapter caseIssue(Issue object) {
				return createIssueAdapter();
			}
			@Override
			public Adapter caseIssueManagementSystem(IssueManagementSystem object) {
				return createIssueManagementSystemAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseCrossComponentIssueManagementSystem(CrossComponentIssueManagementSystem object) {
				return createCrossComponentIssueManagementSystemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue <em>Cross Component Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue
	 * @generated
	 */
	public Adapter createCrossComponentIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer
	 * @generated
	 */
	public Adapter createDeveloperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue
	 * @generated
	 */
	public Adapter createIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem <em>Issue Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem
	 * @generated
	 */
	public Adapter createIssueManagementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem <em>Cross Component Issue Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem
	 * @generated
	 */
	public Adapter createCrossComponentIssueManagementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CcimsDatamodelAdapterFactory
