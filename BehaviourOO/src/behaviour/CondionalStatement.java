/**
 */
package behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.CondionalStatement#getIfStatements <em>If Statements</em>}</li>
 *   <li>{@link behaviour.CondionalStatement#getElseStatements <em>Else Statements</em>}</li>
 *   <li>{@link behaviour.CondionalStatement#getIfExpression <em>If Expression</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getCondionalStatement()
 * @model
 * @generated
 */
public interface CondionalStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>If Statements</b></em>' containment reference list.
	 * The list contents are of type {@link behaviour.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Statements</em>' containment reference list.
	 * @see behaviour.BehaviourPackage#getCondionalStatement_IfStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getIfStatements();

	/**
	 * Returns the value of the '<em><b>Else Statements</b></em>' containment reference list.
	 * The list contents are of type {@link behaviour.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statements</em>' containment reference list.
	 * @see behaviour.BehaviourPackage#getCondionalStatement_ElseStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getElseStatements();

	/**
	 * Returns the value of the '<em><b>If Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Expression</em>' containment reference.
	 * @see #setIfExpression(Expression)
	 * @see behaviour.BehaviourPackage#getCondionalStatement_IfExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getIfExpression();

	/**
	 * Sets the value of the '{@link behaviour.CondionalStatement#getIfExpression <em>If Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Expression</em>' containment reference.
	 * @see #getIfExpression()
	 * @generated
	 */
	void setIfExpression(Expression value);

} // CondionalStatement
