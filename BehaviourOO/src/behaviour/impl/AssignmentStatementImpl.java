/**
 */
package behaviour.impl;

import behaviour.AssignmentStatement;
import behaviour.BehaviourPackage;
import behaviour.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviour.impl.AssignmentStatementImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link behaviour.impl.AssignmentStatementImpl#getAssignExpression <em>Assign Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentStatementImpl extends StatementImpl implements AssignmentStatement {
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
	 * The cached value of the '{@link #getAssignExpression() <em>Assign Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression assignExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.ASSIGNMENT_STATEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.ASSIGNMENT_STATEMENT__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAssignExpression() {
		return assignExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignExpression(Expression newAssignExpression, NotificationChain msgs) {
		Expression oldAssignExpression = assignExpression;
		assignExpression = newAssignExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.ASSIGNMENT_STATEMENT__ASSIGN_EXPRESSION, oldAssignExpression, newAssignExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignExpression(Expression newAssignExpression) {
		if (newAssignExpression != assignExpression) {
			NotificationChain msgs = null;
			if (assignExpression != null)
				msgs = ((InternalEObject)assignExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.ASSIGNMENT_STATEMENT__ASSIGN_EXPRESSION, null, msgs);
			if (newAssignExpression != null)
				msgs = ((InternalEObject)newAssignExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.ASSIGNMENT_STATEMENT__ASSIGN_EXPRESSION, null, msgs);
			msgs = basicSetAssignExpression(newAssignExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.ASSIGNMENT_STATEMENT__ASSIGN_EXPRESSION, newAssignExpression, newAssignExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.ASSIGNMENT_STATEMENT__ASSIGN_EXPRESSION:
				return basicSetAssignExpression(null, msgs);
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
			case BehaviourPackage.ASSIGNMENT_STATEMENT__VAR_NAME:
				return getVarName();
			case BehaviourPackage.ASSIGNMENT_STATEMENT__ASSIGN_EXPRESSION:
				return getAssignExpression();
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
			case BehaviourPackage.ASSIGNMENT_STATEMENT__VAR_NAME:
				setVarName((String)newValue);
				return;
			case BehaviourPackage.ASSIGNMENT_STATEMENT__ASSIGN_EXPRESSION:
				setAssignExpression((Expression)newValue);
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
			case BehaviourPackage.ASSIGNMENT_STATEMENT__VAR_NAME:
				setVarName(VAR_NAME_EDEFAULT);
				return;
			case BehaviourPackage.ASSIGNMENT_STATEMENT__ASSIGN_EXPRESSION:
				setAssignExpression((Expression)null);
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
			case BehaviourPackage.ASSIGNMENT_STATEMENT__VAR_NAME:
				return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
			case BehaviourPackage.ASSIGNMENT_STATEMENT__ASSIGN_EXPRESSION:
				return assignExpression != null;
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
		result.append(')');
		return result.toString();
	}

} //AssignmentStatementImpl
