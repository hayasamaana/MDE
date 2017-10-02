/**
 */
package structural;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structural.Variable#getName <em>Name</em>}</li>
 *   <li>{@link structural.Variable#getType <em>Type</em>}</li>
 *   <li>{@link structural.Variable#getAccessModifier <em>Access Modifier</em>}</li>
 * </ul>
 *
 * @see structural.StructuralPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
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
	 * @see structural.StructuralPackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structural.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structural.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see structural.DataTypes
	 * @see #setType(DataTypes)
	 * @see structural.StructuralPackage#getVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	DataTypes getType();

	/**
	 * Sets the value of the '{@link structural.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see structural.DataTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypes value);

	/**
	 * Returns the value of the '<em><b>Access Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link structural.AccessMod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Modifier</em>' attribute.
	 * @see structural.AccessMod
	 * @see #setAccessModifier(AccessMod)
	 * @see structural.StructuralPackage#getVariable_AccessModifier()
	 * @model required="true"
	 * @generated
	 */
	AccessMod getAccessModifier();

	/**
	 * Sets the value of the '{@link structural.Variable#getAccessModifier <em>Access Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifier</em>' attribute.
	 * @see structural.AccessMod
	 * @see #getAccessModifier()
	 * @generated
	 */
	void setAccessModifier(AccessMod value);

} // Variable
