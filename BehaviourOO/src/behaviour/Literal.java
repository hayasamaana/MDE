/**
 */
package behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.Literal#getVlaue <em>Vlaue</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Expression {
	/**
	 * Returns the value of the '<em><b>Vlaue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vlaue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlaue</em>' attribute.
	 * @see #setVlaue(String)
	 * @see behaviour.BehaviourPackage#getLiteral_Vlaue()
	 * @model required="true"
	 * @generated
	 */
	String getVlaue();

	/**
	 * Sets the value of the '{@link behaviour.Literal#getVlaue <em>Vlaue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlaue</em>' attribute.
	 * @see #getVlaue()
	 * @generated
	 */
	void setVlaue(String value);

} // Literal
