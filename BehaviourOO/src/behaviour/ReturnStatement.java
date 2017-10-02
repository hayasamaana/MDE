/**
 */
package behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.ReturnStatement#getReturnExpression <em>Return Expression</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getReturnStatement()
 * @model
 * @generated
 */
public interface ReturnStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Return Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Expression</em>' containment reference.
	 * @see #setReturnExpression(Expression)
	 * @see behaviour.BehaviourPackage#getReturnStatement_ReturnExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getReturnExpression();

	/**
	 * Sets the value of the '{@link behaviour.ReturnStatement#getReturnExpression <em>Return Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Expression</em>' containment reference.
	 * @see #getReturnExpression()
	 * @generated
	 */
	void setReturnExpression(Expression value);

} // ReturnStatement
