/**
 */
package behaviour.impl;

import behaviour.Behaviour;
import behaviour.BehaviourPackage;
import behaviour.Function;

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
 * An implementation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviour.impl.BehaviourImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link behaviour.impl.BehaviourImpl#getEntryFunction <em>Entry Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourImpl extends MinimalEObjectImpl.Container implements Behaviour {
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The cached value of the '{@link #getEntryFunction() <em>Entry Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryFunction()
	 * @generated
	 * @ordered
	 */
	protected Function entryFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this, BehaviourPackage.BEHAVIOUR__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getEntryFunction() {
		if (entryFunction != null && entryFunction.eIsProxy()) {
			InternalEObject oldEntryFunction = (InternalEObject)entryFunction;
			entryFunction = (Function)eResolveProxy(oldEntryFunction);
			if (entryFunction != oldEntryFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.BEHAVIOUR__ENTRY_FUNCTION, oldEntryFunction, entryFunction));
			}
		}
		return entryFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetEntryFunction() {
		return entryFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryFunction(Function newEntryFunction) {
		Function oldEntryFunction = entryFunction;
		entryFunction = newEntryFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.BEHAVIOUR__ENTRY_FUNCTION, oldEntryFunction, entryFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.BEHAVIOUR__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.BEHAVIOUR__FUNCTIONS:
				return getFunctions();
			case BehaviourPackage.BEHAVIOUR__ENTRY_FUNCTION:
				if (resolve) return getEntryFunction();
				return basicGetEntryFunction();
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
			case BehaviourPackage.BEHAVIOUR__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case BehaviourPackage.BEHAVIOUR__ENTRY_FUNCTION:
				setEntryFunction((Function)newValue);
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
			case BehaviourPackage.BEHAVIOUR__FUNCTIONS:
				getFunctions().clear();
				return;
			case BehaviourPackage.BEHAVIOUR__ENTRY_FUNCTION:
				setEntryFunction((Function)null);
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
			case BehaviourPackage.BEHAVIOUR__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case BehaviourPackage.BEHAVIOUR__ENTRY_FUNCTION:
				return entryFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviourImpl
