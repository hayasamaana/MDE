/**
 */
package behaviour.impl;

import behaviour.BehaviourPackage;
import behaviour.Expression;
import behaviour.LoopStatement;
import behaviour.Statement;

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
 * An implementation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviour.impl.LoopStatementImpl#getLoopExpression <em>Loop Expression</em>}</li>
 *   <li>{@link behaviour.impl.LoopStatementImpl#getLoopBodyStatements <em>Loop Body Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopStatementImpl extends StatementImpl implements LoopStatement {
	/**
	 * The cached value of the '{@link #getLoopExpression() <em>Loop Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression loopExpression;

	/**
	 * The cached value of the '{@link #getLoopBodyStatements() <em>Loop Body Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopBodyStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> loopBodyStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.LOOP_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLoopExpression() {
		return loopExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopExpression(Expression newLoopExpression, NotificationChain msgs) {
		Expression oldLoopExpression = loopExpression;
		loopExpression = newLoopExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.LOOP_STATEMENT__LOOP_EXPRESSION, oldLoopExpression, newLoopExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopExpression(Expression newLoopExpression) {
		if (newLoopExpression != loopExpression) {
			NotificationChain msgs = null;
			if (loopExpression != null)
				msgs = ((InternalEObject)loopExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.LOOP_STATEMENT__LOOP_EXPRESSION, null, msgs);
			if (newLoopExpression != null)
				msgs = ((InternalEObject)newLoopExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.LOOP_STATEMENT__LOOP_EXPRESSION, null, msgs);
			msgs = basicSetLoopExpression(newLoopExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.LOOP_STATEMENT__LOOP_EXPRESSION, newLoopExpression, newLoopExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getLoopBodyStatements() {
		if (loopBodyStatements == null) {
			loopBodyStatements = new EObjectContainmentEList<Statement>(Statement.class, this, BehaviourPackage.LOOP_STATEMENT__LOOP_BODY_STATEMENTS);
		}
		return loopBodyStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.LOOP_STATEMENT__LOOP_EXPRESSION:
				return basicSetLoopExpression(null, msgs);
			case BehaviourPackage.LOOP_STATEMENT__LOOP_BODY_STATEMENTS:
				return ((InternalEList<?>)getLoopBodyStatements()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.LOOP_STATEMENT__LOOP_EXPRESSION:
				return getLoopExpression();
			case BehaviourPackage.LOOP_STATEMENT__LOOP_BODY_STATEMENTS:
				return getLoopBodyStatements();
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
			case BehaviourPackage.LOOP_STATEMENT__LOOP_EXPRESSION:
				setLoopExpression((Expression)newValue);
				return;
			case BehaviourPackage.LOOP_STATEMENT__LOOP_BODY_STATEMENTS:
				getLoopBodyStatements().clear();
				getLoopBodyStatements().addAll((Collection<? extends Statement>)newValue);
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
			case BehaviourPackage.LOOP_STATEMENT__LOOP_EXPRESSION:
				setLoopExpression((Expression)null);
				return;
			case BehaviourPackage.LOOP_STATEMENT__LOOP_BODY_STATEMENTS:
				getLoopBodyStatements().clear();
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
			case BehaviourPackage.LOOP_STATEMENT__LOOP_EXPRESSION:
				return loopExpression != null;
			case BehaviourPackage.LOOP_STATEMENT__LOOP_BODY_STATEMENTS:
				return loopBodyStatements != null && !loopBodyStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoopStatementImpl
