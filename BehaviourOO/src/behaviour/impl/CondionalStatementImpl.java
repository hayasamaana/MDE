/**
 */
package behaviour.impl;

import behaviour.BehaviourPackage;
import behaviour.CondionalStatement;
import behaviour.Expression;
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
 * An implementation of the model object '<em><b>Condional Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviour.impl.CondionalStatementImpl#getIfStatements <em>If Statements</em>}</li>
 *   <li>{@link behaviour.impl.CondionalStatementImpl#getElseStatements <em>Else Statements</em>}</li>
 *   <li>{@link behaviour.impl.CondionalStatementImpl#getIfExpression <em>If Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CondionalStatementImpl extends StatementImpl implements CondionalStatement {
	/**
	 * The cached value of the '{@link #getIfStatements() <em>If Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> ifStatements;

	/**
	 * The cached value of the '{@link #getElseStatements() <em>Else Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> elseStatements;

	/**
	 * The cached value of the '{@link #getIfExpression() <em>If Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression ifExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CondionalStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.CONDIONAL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getIfStatements() {
		if (ifStatements == null) {
			ifStatements = new EObjectContainmentEList<Statement>(Statement.class, this, BehaviourPackage.CONDIONAL_STATEMENT__IF_STATEMENTS);
		}
		return ifStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getElseStatements() {
		if (elseStatements == null) {
			elseStatements = new EObjectContainmentEList<Statement>(Statement.class, this, BehaviourPackage.CONDIONAL_STATEMENT__ELSE_STATEMENTS);
		}
		return elseStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIfExpression() {
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfExpression(Expression newIfExpression, NotificationChain msgs) {
		Expression oldIfExpression = ifExpression;
		ifExpression = newIfExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.CONDIONAL_STATEMENT__IF_EXPRESSION, oldIfExpression, newIfExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfExpression(Expression newIfExpression) {
		if (newIfExpression != ifExpression) {
			NotificationChain msgs = null;
			if (ifExpression != null)
				msgs = ((InternalEObject)ifExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.CONDIONAL_STATEMENT__IF_EXPRESSION, null, msgs);
			if (newIfExpression != null)
				msgs = ((InternalEObject)newIfExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.CONDIONAL_STATEMENT__IF_EXPRESSION, null, msgs);
			msgs = basicSetIfExpression(newIfExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CONDIONAL_STATEMENT__IF_EXPRESSION, newIfExpression, newIfExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.CONDIONAL_STATEMENT__IF_STATEMENTS:
				return ((InternalEList<?>)getIfStatements()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.CONDIONAL_STATEMENT__ELSE_STATEMENTS:
				return ((InternalEList<?>)getElseStatements()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.CONDIONAL_STATEMENT__IF_EXPRESSION:
				return basicSetIfExpression(null, msgs);
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
			case BehaviourPackage.CONDIONAL_STATEMENT__IF_STATEMENTS:
				return getIfStatements();
			case BehaviourPackage.CONDIONAL_STATEMENT__ELSE_STATEMENTS:
				return getElseStatements();
			case BehaviourPackage.CONDIONAL_STATEMENT__IF_EXPRESSION:
				return getIfExpression();
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
			case BehaviourPackage.CONDIONAL_STATEMENT__IF_STATEMENTS:
				getIfStatements().clear();
				getIfStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case BehaviourPackage.CONDIONAL_STATEMENT__ELSE_STATEMENTS:
				getElseStatements().clear();
				getElseStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case BehaviourPackage.CONDIONAL_STATEMENT__IF_EXPRESSION:
				setIfExpression((Expression)newValue);
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
			case BehaviourPackage.CONDIONAL_STATEMENT__IF_STATEMENTS:
				getIfStatements().clear();
				return;
			case BehaviourPackage.CONDIONAL_STATEMENT__ELSE_STATEMENTS:
				getElseStatements().clear();
				return;
			case BehaviourPackage.CONDIONAL_STATEMENT__IF_EXPRESSION:
				setIfExpression((Expression)null);
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
			case BehaviourPackage.CONDIONAL_STATEMENT__IF_STATEMENTS:
				return ifStatements != null && !ifStatements.isEmpty();
			case BehaviourPackage.CONDIONAL_STATEMENT__ELSE_STATEMENTS:
				return elseStatements != null && !elseStatements.isEmpty();
			case BehaviourPackage.CONDIONAL_STATEMENT__IF_EXPRESSION:
				return ifExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //CondionalStatementImpl
