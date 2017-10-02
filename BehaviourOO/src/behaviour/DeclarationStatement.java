/**
 */
package behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.DeclarationStatement#getVarName <em>Var Name</em>}</li>
 *   <li>{@link behaviour.DeclarationStatement#getVarType <em>Var Type</em>}</li>
 *   <li>{@link behaviour.DeclarationStatement#getInitialExpression <em>Initial Expression</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getDeclarationStatement()
 * @model
 * @generated
 */
public interface DeclarationStatement extends Statement {
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
	 * @see behaviour.BehaviourPackage#getDeclarationStatement_VarName()
	 * @model required="true"
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link behaviour.DeclarationStatement#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Var Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Type</em>' attribute.
	 * @see #setVarType(String)
	 * @see behaviour.BehaviourPackage#getDeclarationStatement_VarType()
	 * @model required="true"
	 * @generated
	 */
	String getVarType();

	/**
	 * Sets the value of the '{@link behaviour.DeclarationStatement#getVarType <em>Var Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Type</em>' attribute.
	 * @see #getVarType()
	 * @generated
	 */
	void setVarType(String value);

	/**
	 * Returns the value of the '<em><b>Initial Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Expression</em>' containment reference.
	 * @see #setInitialExpression(Expression)
	 * @see behaviour.BehaviourPackage#getDeclarationStatement_InitialExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitialExpression();

	/**
	 * Sets the value of the '{@link behaviour.DeclarationStatement#getInitialExpression <em>Initial Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Expression</em>' containment reference.
	 * @see #getInitialExpression()
	 * @generated
	 */
	void setInitialExpression(Expression value);

} // DeclarationStatement
