/**
 */
package behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.LoopStatement#getLoopExpression <em>Loop Expression</em>}</li>
 *   <li>{@link behaviour.LoopStatement#getLoopBodyStatements <em>Loop Body Statements</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getLoopStatement()
 * @model
 * @generated
 */
public interface LoopStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Loop Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Expression</em>' containment reference.
	 * @see #setLoopExpression(Expression)
	 * @see behaviour.BehaviourPackage#getLoopStatement_LoopExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLoopExpression();

	/**
	 * Sets the value of the '{@link behaviour.LoopStatement#getLoopExpression <em>Loop Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Expression</em>' containment reference.
	 * @see #getLoopExpression()
	 * @generated
	 */
	void setLoopExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Loop Body Statements</b></em>' containment reference list.
	 * The list contents are of type {@link behaviour.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Body Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Body Statements</em>' containment reference list.
	 * @see behaviour.BehaviourPackage#getLoopStatement_LoopBodyStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getLoopBodyStatements();

} // LoopStatement
