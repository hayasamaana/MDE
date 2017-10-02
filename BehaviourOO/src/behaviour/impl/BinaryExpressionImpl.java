/**
 */
package behaviour.impl;

import behaviour.BehaviourPackage;
import behaviour.BinaryExpression;
import behaviour.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviour.impl.BinaryExpressionImpl#getLeftSideExpression <em>Left Side Expression</em>}</li>
 *   <li>{@link behaviour.impl.BinaryExpressionImpl#getRightSideExpression <em>Right Side Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The cached value of the '{@link #getLeftSideExpression() <em>Left Side Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSideExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression leftSideExpression;

	/**
	 * The cached value of the '{@link #getRightSideExpression() <em>Right Side Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSideExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression rightSideExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftSideExpression() {
		return leftSideExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftSideExpression(Expression newLeftSideExpression, NotificationChain msgs) {
		Expression oldLeftSideExpression = leftSideExpression;
		leftSideExpression = newLeftSideExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION, oldLeftSideExpression, newLeftSideExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSideExpression(Expression newLeftSideExpression) {
		if (newLeftSideExpression != leftSideExpression) {
			NotificationChain msgs = null;
			if (leftSideExpression != null)
				msgs = ((InternalEObject)leftSideExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION, null, msgs);
			if (newLeftSideExpression != null)
				msgs = ((InternalEObject)newLeftSideExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION, null, msgs);
			msgs = basicSetLeftSideExpression(newLeftSideExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION, newLeftSideExpression, newLeftSideExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightSideExpression() {
		return rightSideExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightSideExpression(Expression newRightSideExpression, NotificationChain msgs) {
		Expression oldRightSideExpression = rightSideExpression;
		rightSideExpression = newRightSideExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION, oldRightSideExpression, newRightSideExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSideExpression(Expression newRightSideExpression) {
		if (newRightSideExpression != rightSideExpression) {
			NotificationChain msgs = null;
			if (rightSideExpression != null)
				msgs = ((InternalEObject)rightSideExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION, null, msgs);
			if (newRightSideExpression != null)
				msgs = ((InternalEObject)newRightSideExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION, null, msgs);
			msgs = basicSetRightSideExpression(newRightSideExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION, newRightSideExpression, newRightSideExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION:
				return basicSetLeftSideExpression(null, msgs);
			case BehaviourPackage.BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION:
				return basicSetRightSideExpression(null, msgs);
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
			case BehaviourPackage.BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION:
				return getLeftSideExpression();
			case BehaviourPackage.BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION:
				return getRightSideExpression();
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
			case BehaviourPackage.BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION:
				setLeftSideExpression((Expression)newValue);
				return;
			case BehaviourPackage.BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION:
				setRightSideExpression((Expression)newValue);
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
			case BehaviourPackage.BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION:
				setLeftSideExpression((Expression)null);
				return;
			case BehaviourPackage.BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION:
				setRightSideExpression((Expression)null);
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
			case BehaviourPackage.BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION:
				return leftSideExpression != null;
			case BehaviourPackage.BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION:
				return rightSideExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryExpressionImpl
