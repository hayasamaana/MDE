/**
 */
package behaviour.impl;

import behaviour.BehaviourPackage;
import behaviour.Statement;
import behaviour.TryCatchStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Catch Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviour.impl.TryCatchStatementImpl#getTryStatements <em>Try Statements</em>}</li>
 *   <li>{@link behaviour.impl.TryCatchStatementImpl#getCatchStatements <em>Catch Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryCatchStatementImpl extends StatementImpl implements TryCatchStatement {
	/**
	 * The cached value of the '{@link #getTryStatements() <em>Try Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTryStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> tryStatements;

	/**
	 * The cached value of the '{@link #getCatchStatements() <em>Catch Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> catchStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryCatchStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.TRY_CATCH_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getTryStatements() {
		if (tryStatements == null) {
			tryStatements = new EObjectContainmentEList<Statement>(Statement.class, this, BehaviourPackage.TRY_CATCH_STATEMENT__TRY_STATEMENTS);
		}
		return tryStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getCatchStatements() {
		if (catchStatements == null) {
			catchStatements = new EObjectContainmentEList<Statement>(Statement.class, this, BehaviourPackage.TRY_CATCH_STATEMENT__CATCH_STATEMENTS);
		}
		return catchStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.TRY_CATCH_STATEMENT__TRY_STATEMENTS:
				return ((InternalEList<?>)getTryStatements()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.TRY_CATCH_STATEMENT__CATCH_STATEMENTS:
				return ((InternalEList<?>)getCatchStatements()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.TRY_CATCH_STATEMENT__TRY_STATEMENTS:
				return getTryStatements();
			case BehaviourPackage.TRY_CATCH_STATEMENT__CATCH_STATEMENTS:
				return getCatchStatements();
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
			case BehaviourPackage.TRY_CATCH_STATEMENT__TRY_STATEMENTS:
				getTryStatements().clear();
				getTryStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case BehaviourPackage.TRY_CATCH_STATEMENT__CATCH_STATEMENTS:
				getCatchStatements().clear();
				getCatchStatements().addAll((Collection<? extends Statement>)newValue);
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
			case BehaviourPackage.TRY_CATCH_STATEMENT__TRY_STATEMENTS:
				getTryStatements().clear();
				return;
			case BehaviourPackage.TRY_CATCH_STATEMENT__CATCH_STATEMENTS:
				getCatchStatements().clear();
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
			case BehaviourPackage.TRY_CATCH_STATEMENT__TRY_STATEMENTS:
				return tryStatements != null && !tryStatements.isEmpty();
			case BehaviourPackage.TRY_CATCH_STATEMENT__CATCH_STATEMENTS:
				return catchStatements != null && !catchStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TryCatchStatementImpl
