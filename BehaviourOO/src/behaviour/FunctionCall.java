/**
 */
package behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.FunctionCall#getFuncName <em>Func Name</em>}</li>
 *   <li>{@link behaviour.FunctionCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Func Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Name</em>' attribute.
	 * @see #setFuncName(String)
	 * @see behaviour.BehaviourPackage#getFunctionCall_FuncName()
	 * @model required="true"
	 * @generated
	 */
	String getFuncName();

	/**
	 * Sets the value of the '{@link behaviour.FunctionCall#getFuncName <em>Func Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func Name</em>' attribute.
	 * @see #getFuncName()
	 * @generated
	 */
	void setFuncName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link behaviour.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see behaviour.BehaviourPackage#getFunctionCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

} // FunctionCall
