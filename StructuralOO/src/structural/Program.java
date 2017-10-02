/**
 */
package structural;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structural.Program#getClasses <em>Classes</em>}</li>
 *   <li>{@link structural.Program#getMainMethod <em>Main Method</em>}</li>
 * </ul>
 *
 * @see structural.StructuralPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link structural.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see structural.StructuralPackage#getProgram_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<structural.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Main Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Method</em>' reference.
	 * @see #setMainMethod(Method)
	 * @see structural.StructuralPackage#getProgram_MainMethod()
	 * @model required="true"
	 * @generated
	 */
	Method getMainMethod();

	/**
	 * Sets the value of the '{@link structural.Program#getMainMethod <em>Main Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Method</em>' reference.
	 * @see #getMainMethod()
	 * @generated
	 */
	void setMainMethod(Method value);

} // Program
