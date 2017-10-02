/**
 */
package behaviour.impl;

import behaviour.BehaviourPackage;
import behaviour.DeclarationStatement;
import behaviour.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviour.impl.DeclarationStatementImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link behaviour.impl.DeclarationStatementImpl#getVarType <em>Var Type</em>}</li>
 *   <li>{@link behaviour.impl.DeclarationStatementImpl#getInitialExpression <em>Initial Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationStatementImpl extends StatementImpl implements DeclarationStatement {
	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarType() <em>Var Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarType()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarType() <em>Var Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarType()
	 * @generated
	 * @ordered
	 */
	protected String varType = VAR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialExpression() <em>Initial Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression initialExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.DECLARATION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.DECLARATION_STATEMENT__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarType() {
		return varType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarType(String newVarType) {
		String oldVarType = varType;
		varType = newVarType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.DECLARATION_STATEMENT__VAR_TYPE, oldVarType, varType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitialExpression() {
		return initialExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialExpression(Expression newInitialExpression, NotificationChain msgs) {
		Expression oldInitialExpression = initialExpression;
		initialExpression = newInitialExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.DECLARATION_STATEMENT__INITIAL_EXPRESSION, oldInitialExpression, newInitialExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialExpression(Expression newInitialExpression) {
		if (newInitialExpression != initialExpression) {
			NotificationChain msgs = null;
			if (initialExpression != null)
				msgs = ((InternalEObject)initialExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.DECLARATION_STATEMENT__INITIAL_EXPRESSION, null, msgs);
			if (newInitialExpression != null)
				msgs = ((InternalEObject)newInitialExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.DECLARATION_STATEMENT__INITIAL_EXPRESSION, null, msgs);
			msgs = basicSetInitialExpression(newInitialExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.DECLARATION_STATEMENT__INITIAL_EXPRESSION, newInitialExpression, newInitialExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.DECLARATION_STATEMENT__INITIAL_EXPRESSION:
				return basicSetInitialExpression(null, msgs);
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
			case BehaviourPackage.DECLARATION_STATEMENT__VAR_NAME:
				return getVarName();
			case BehaviourPackage.DECLARATION_STATEMENT__VAR_TYPE:
				return getVarType();
			case BehaviourPackage.DECLARATION_STATEMENT__INITIAL_EXPRESSION:
				return getInitialExpression();
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
			case BehaviourPackage.DECLARATION_STATEMENT__VAR_NAME:
				setVarName((String)newValue);
				return;
			case BehaviourPackage.DECLARATION_STATEMENT__VAR_TYPE:
				setVarType((String)newValue);
				return;
			case BehaviourPackage.DECLARATION_STATEMENT__INITIAL_EXPRESSION:
				setInitialExpression((Expression)newValue);
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
			case BehaviourPackage.DECLARATION_STATEMENT__VAR_NAME:
				setVarName(VAR_NAME_EDEFAULT);
				return;
			case BehaviourPackage.DECLARATION_STATEMENT__VAR_TYPE:
				setVarType(VAR_TYPE_EDEFAULT);
				return;
			case BehaviourPackage.DECLARATION_STATEMENT__INITIAL_EXPRESSION:
				setInitialExpression((Expression)null);
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
			case BehaviourPackage.DECLARATION_STATEMENT__VAR_NAME:
				return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
			case BehaviourPackage.DECLARATION_STATEMENT__VAR_TYPE:
				return VAR_TYPE_EDEFAULT == null ? varType != null : !VAR_TYPE_EDEFAULT.equals(varType);
			case BehaviourPackage.DECLARATION_STATEMENT__INITIAL_EXPRESSION:
				return initialExpression != null;
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
		result.append(" (varName: ");
		result.append(varName);
		result.append(", varType: ");
		result.append(varType);
		result.append(')');
		return result.toString();
	}

} //DeclarationStatementImpl
