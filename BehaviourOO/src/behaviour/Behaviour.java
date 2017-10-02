/**
 */
package behaviour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviour.Behaviour#getFunctions <em>Functions</em>}</li>
 *   <li>{@link behaviour.Behaviour#getEntryFunction <em>Entry Function</em>}</li>
 * </ul>
 *
 * @see behaviour.BehaviourPackage#getBehaviour()
 * @model
 * @generated
 */
public interface Behaviour extends EObject {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link behaviour.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see behaviour.BehaviourPackage#getBehaviour_Functions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Function> getFunctions();

	/**
	 * Returns the value of the '<em><b>Entry Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Function</em>' reference.
	 * @see #setEntryFunction(Function)
	 * @see behaviour.BehaviourPackage#getBehaviour_EntryFunction()
	 * @model required="true"
	 * @generated
	 */
	Function getEntryFunction();

	/**
	 * Sets the value of the '{@link behaviour.Behaviour#getEntryFunction <em>Entry Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Function</em>' reference.
	 * @see #getEntryFunction()
	 * @generated
	 */
	void setEntryFunction(Function value);

} // Behaviour
