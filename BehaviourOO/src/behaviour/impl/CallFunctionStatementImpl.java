/**
 */
package behaviour.impl;

import behaviour.BehaviourPackage;
import behaviour.CallFunctionStatement;
import behaviour.Expression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Function Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviour.impl.CallFunctionStatementImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link behaviour.impl.CallFunctionStatementImpl#getNameFunc <em>Name Func</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallFunctionStatementImpl extends StatementImpl implements CallFunctionStatement {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arguments;

	/**
	 * The default value of the '{@link #getNameFunc() <em>Name Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFunc()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FUNC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameFunc() <em>Name Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFunc()
	 * @generated
	 * @ordered
	 */
	protected String nameFunc = NAME_FUNC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallFunctionStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.CALL_FUNCTION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Expression>(Expression.class, this, BehaviourPackage.CALL_FUNCTION_STATEMENT__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameFunc() {
		return nameFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameFunc(String newNameFunc) {
		String oldNameFunc = nameFunc;
		nameFunc = newNameFunc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CALL_FUNCTION_STATEMENT__NAME_FUNC, oldNameFunc, nameFunc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.CALL_FUNCTION_STATEMENT__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.CALL_FUNCTION_STATEMENT__ARGUMENTS:
				return getArguments();
			case BehaviourPackage.CALL_FUNCTION_STATEMENT__NAME_FUNC:
				return getNameFunc();
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
			case BehaviourPackage.CALL_FUNCTION_STATEMENT__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case BehaviourPackage.CALL_FUNCTION_STATEMENT__NAME_FUNC:
				setNameFunc((String)newValue);
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
			case BehaviourPackage.CALL_FUNCTION_STATEMENT__ARGUMENTS:
				getArguments().clear();
				return;
			case BehaviourPackage.CALL_FUNCTION_STATEMENT__NAME_FUNC:
				setNameFunc(NAME_FUNC_EDEFAULT);
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
			case BehaviourPackage.CALL_FUNCTION_STATEMENT__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case BehaviourPackage.CALL_FUNCTION_STATEMENT__NAME_FUNC:
				return NAME_FUNC_EDEFAULT == null ? nameFunc != null : !NAME_FUNC_EDEFAULT.equals(nameFunc);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nameFunc: ");
		result.append(nameFunc);
		result.append(')');
		return result.toString();
	}

} //CallFunctionStatementImpl
