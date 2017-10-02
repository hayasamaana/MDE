/**
 */
package behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.BinaryExpression#getLeftSideExpression <em>Left Side Expression</em>}</li>
 *   <li>{@link behaviour.BinaryExpression#getRightSideExpression <em>Right Side Expression</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getBinaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Side Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Side Expression</em>' containment reference.
	 * @see #setLeftSideExpression(Expression)
	 * @see behaviour.BehaviourPackage#getBinaryExpression_LeftSideExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftSideExpression();

	/**
	 * Sets the value of the '{@link behaviour.BinaryExpression#getLeftSideExpression <em>Left Side Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Side Expression</em>' containment reference.
	 * @see #getLeftSideExpression()
	 * @generated
	 */
	void setLeftSideExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Side Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Side Expression</em>' containment reference.
	 * @see #setRightSideExpression(Expression)
	 * @see behaviour.BehaviourPackage#getBinaryExpression_RightSideExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightSideExpression();

	/**
	 * Sets the value of the '{@link behaviour.BinaryExpression#getRightSideExpression <em>Right Side Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Side Expression</em>' containment reference.
	 * @see #getRightSideExpression()
	 * @generated
	 */
	void setRightSideExpression(Expression value);

} // BinaryExpression
