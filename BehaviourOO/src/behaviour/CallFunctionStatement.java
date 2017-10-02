/**
 */
package behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Function Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.CallFunctionStatement#getArguments <em>Arguments</em>}</li>
 *   <li>{@link behaviour.CallFunctionStatement#getNameFunc <em>Name Func</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getCallFunctionStatement()
 * @model
 * @generated
 */
public interface CallFunctionStatement extends Statement {
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
	 * @see behaviour.BehaviourPackage#getCallFunctionStatement_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

	/**
	 * Returns the value of the '<em><b>Name Func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Func</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Func</em>' attribute.
	 * @see #setNameFunc(String)
	 * @see behaviour.BehaviourPackage#getCallFunctionStatement_NameFunc()
	 * @model required="true"
	 * @generated
	 */
	String getNameFunc();

	/**
	 * Sets the value of the '{@link behaviour.CallFunctionStatement#getNameFunc <em>Name Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Func</em>' attribute.
	 * @see #getNameFunc()
	 * @generated
	 */
	void setNameFunc(String value);

} // CallFunctionStatement
