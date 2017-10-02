/**
 */
package behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Catch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.TryCatchStatement#getTryStatements <em>Try Statements</em>}</li>
 *   <li>{@link behaviour.TryCatchStatement#getCatchStatements <em>Catch Statements</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getTryCatchStatement()
 * @model
 * @generated
 */
public interface TryCatchStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Try Statements</b></em>' containment reference list.
	 * The list contents are of type {@link behaviour.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Try Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Try Statements</em>' containment reference list.
	 * @see behaviour.BehaviourPackage#getTryCatchStatement_TryStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getTryStatements();

	/**
	 * Returns the value of the '<em><b>Catch Statements</b></em>' containment reference list.
	 * The list contents are of type {@link behaviour.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Statements</em>' containment reference list.
	 * @see behaviour.BehaviourPackage#getTryCatchStatement_CatchStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getCatchStatements();

} // TryCatchStatement
