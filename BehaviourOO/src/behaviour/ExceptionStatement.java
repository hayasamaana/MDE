/**
 */
package behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.ExceptionStatement#getThrowsExpression <em>Throws Expression</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getExceptionStatement()
 * @model
 * @generated
 */
public interface ExceptionStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Throws Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throws Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws Expression</em>' containment reference.
	 * @see #setThrowsExpression(Expression)
	 * @see behaviour.BehaviourPackage#getExceptionStatement_ThrowsExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getThrowsExpression();

	/**
	 * Sets the value of the '{@link behaviour.ExceptionStatement#getThrowsExpression <em>Throws Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws Expression</em>' containment reference.
	 * @see #getThrowsExpression()
	 * @generated
	 */
	void setThrowsExpression(Expression value);

} // ExceptionStatement
