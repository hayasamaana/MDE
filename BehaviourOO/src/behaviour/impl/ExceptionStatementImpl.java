/**
 */
package behaviour.impl;

import behaviour.BehaviourPackage;
import behaviour.ExceptionStatement;
import behaviour.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviour.impl.ExceptionStatementImpl#getThrowsExpression <em>Throws Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionStatementImpl extends StatementImpl implements ExceptionStatement {
	/**
	 * The cached value of the '{@link #getThrowsExpression() <em>Throws Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrowsExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression throwsExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.EXCEPTION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getThrowsExpression() {
		return throwsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrowsExpression(Expression newThrowsExpression, NotificationChain msgs) {
		Expression oldThrowsExpression = throwsExpression;
		throwsExpression = newThrowsExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.EXCEPTION_STATEMENT__THROWS_EXPRESSION, oldThrowsExpression, newThrowsExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrowsExpression(Expression newThrowsExpression) {
		if (newThrowsExpression != throwsExpression) {
			NotificationChain msgs = null;
			if (throwsExpression != null)
				msgs = ((InternalEObject)throwsExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.EXCEPTION_STATEMENT__THROWS_EXPRESSION, null, msgs);
			if (newThrowsExpression != null)
				msgs = ((InternalEObject)newThrowsExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.EXCEPTION_STATEMENT__THROWS_EXPRESSION, null, msgs);
			msgs = basicSetThrowsExpression(newThrowsExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.EXCEPTION_STATEMENT__THROWS_EXPRESSION, newThrowsExpression, newThrowsExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.EXCEPTION_STATEMENT__THROWS_EXPRESSION:
				return basicSetThrowsExpression(null, msgs);
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
			case BehaviourPackage.EXCEPTION_STATEMENT__THROWS_EXPRESSION:
				return getThrowsExpression();
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
			case BehaviourPackage.EXCEPTION_STATEMENT__THROWS_EXPRESSION:
				setThrowsExpression((Expression)newValue);
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
			case BehaviourPackage.EXCEPTION_STATEMENT__THROWS_EXPRESSION:
				setThrowsExpression((Expression)null);
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
			case BehaviourPackage.EXCEPTION_STATEMENT__THROWS_EXPRESSION:
				return throwsExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ExceptionStatementImpl
