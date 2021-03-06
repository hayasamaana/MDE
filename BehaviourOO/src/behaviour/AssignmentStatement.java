/**
 */
package behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.AssignmentStatement#getVarName <em>Var Name</em>}</li>
 *   <li>{@link behaviour.AssignmentStatement#getAssignExpression <em>Assign Expression</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getAssignmentStatement()
 * @model
 * @generated
 */
public interface AssignmentStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see behaviour.BehaviourPackage#getAssignmentStatement_VarName()
	 * @model required="true"
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link behaviour.AssignmentStatement#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Assign Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Expression</em>' containment reference.
	 * @see #setAssignExpression(Expression)
	 * @see behaviour.BehaviourPackage#getAssignmentStatement_AssignExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAssignExpression();

	/**
	 * Sets the value of the '{@link behaviour.AssignmentStatement#getAssignExpression <em>Assign Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign Expression</em>' containment reference.
	 * @see #getAssignExpression()
	 * @generated
	 */
	void setAssignExpression(Expression value);

} // AssignmentStatement
