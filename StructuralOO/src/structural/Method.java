/**
 */
package structural;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structural.Method#getName <em>Name</em>}</li>
 *   <li>{@link structural.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link structural.Method#getAccessModifiers <em>Access Modifiers</em>}</li>
 *   <li>{@link structural.Method#getBelongToClass <em>Belong To Class</em>}</li>
 *   <li>{@link structural.Method#getVaribales <em>Varibales</em>}</li>
 * </ul>
 *
 * @see structural.StructuralPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see structural.StructuralPackage#getMethod_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structural.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structural.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see structural.DataTypes
	 * @see #setReturnType(DataTypes)
	 * @see structural.StructuralPackage#getMethod_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	DataTypes getReturnType();

	/**
	 * Sets the value of the '{@link structural.Method#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see structural.DataTypes
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataTypes value);

	/**
	 * Returns the value of the '<em><b>Access Modifiers</b></em>' attribute.
	 * The literals are from the enumeration {@link structural.AccessMod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Modifiers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Modifiers</em>' attribute.
	 * @see structural.AccessMod
	 * @see #setAccessModifiers(AccessMod)
	 * @see structural.StructuralPackage#getMethod_AccessModifiers()
	 * @model required="true"
	 * @generated
	 */
	AccessMod getAccessModifiers();

	/**
	 * Sets the value of the '{@link structural.Method#getAccessModifiers <em>Access Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifiers</em>' attribute.
	 * @see structural.AccessMod
	 * @see #getAccessModifiers()
	 * @generated
	 */
	void setAccessModifiers(AccessMod value);

	/**
	 * Returns the value of the '<em><b>Belong To Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belong To Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belong To Class</em>' reference.
	 * @see #setBelongToClass(structural.Class)
	 * @see structural.StructuralPackage#getMethod_BelongToClass()
	 * @model required="true"
	 * @generated
	 */
	structural.Class getBelongToClass();

	/**
	 * Sets the value of the '{@link structural.Method#getBelongToClass <em>Belong To Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belong To Class</em>' reference.
	 * @see #getBelongToClass()
	 * @generated
	 */
	void setBelongToClass(structural.Class value);

	/**
	 * Returns the value of the '<em><b>Varibales</b></em>' containment reference list.
	 * The list contents are of type {@link structural.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varibales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varibales</em>' containment reference list.
	 * @see structural.StructuralPackage#getMethod_Varibales()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVaribales();

} // Method
