/**
 */
package structural.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import structural.AccessMod;
import structural.DataTypes;
import structural.Method;
import structural.StructuralPackage;
import structural.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structural.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link structural.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link structural.impl.MethodImpl#getAccessModifiers <em>Access Modifiers</em>}</li>
 *   <li>{@link structural.impl.MethodImpl#getBelongToClass <em>Belong To Class</em>}</li>
 *   <li>{@link structural.impl.MethodImpl#getVaribales <em>Varibales</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final DataTypes RETURN_TYPE_EDEFAULT = DataTypes.INTEGER;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected DataTypes returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessModifiers() <em>Access Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifiers()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMod ACCESS_MODIFIERS_EDEFAULT = AccessMod.PUBLIC;

	/**
	 * The cached value of the '{@link #getAccessModifiers() <em>Access Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifiers()
	 * @generated
	 * @ordered
	 */
	protected AccessMod accessModifiers = ACCESS_MODIFIERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBelongToClass() <em>Belong To Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongToClass()
	 * @generated
	 * @ordered
	 */
	protected structural.Class belongToClass;

	/**
	 * The cached value of the '{@link #getVaribales() <em>Varibales</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaribales()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> varibales;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(DataTypes newReturnType) {
		DataTypes oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMod getAccessModifiers() {
		return accessModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessModifiers(AccessMod newAccessModifiers) {
		AccessMod oldAccessModifiers = accessModifiers;
		accessModifiers = newAccessModifiers == null ? ACCESS_MODIFIERS_EDEFAULT : newAccessModifiers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.METHOD__ACCESS_MODIFIERS, oldAccessModifiers, accessModifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structural.Class getBelongToClass() {
		if (belongToClass != null && belongToClass.eIsProxy()) {
			InternalEObject oldBelongToClass = (InternalEObject)belongToClass;
			belongToClass = (structural.Class)eResolveProxy(oldBelongToClass);
			if (belongToClass != oldBelongToClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuralPackage.METHOD__BELONG_TO_CLASS, oldBelongToClass, belongToClass));
			}
		}
		return belongToClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structural.Class basicGetBelongToClass() {
		return belongToClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongToClass(structural.Class newBelongToClass) {
		structural.Class oldBelongToClass = belongToClass;
		belongToClass = newBelongToClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralPackage.METHOD__BELONG_TO_CLASS, oldBelongToClass, belongToClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVaribales() {
		if (varibales == null) {
			varibales = new EObjectResolvingEList<Variable>(Variable.class, this, StructuralPackage.METHOD__VARIBALES);
		}
		return varibales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuralPackage.METHOD__NAME:
				return getName();
			case StructuralPackage.METHOD__RETURN_TYPE:
				return getReturnType();
			case StructuralPackage.METHOD__ACCESS_MODIFIERS:
				return getAccessModifiers();
			case StructuralPackage.METHOD__BELONG_TO_CLASS:
				if (resolve) return getBelongToClass();
				return basicGetBelongToClass();
			case StructuralPackage.METHOD__VARIBALES:
				return getVaribales();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructuralPackage.METHOD__NAME:
				setName((String)newValue);
				return;
			case StructuralPackage.METHOD__RETURN_TYPE:
				setReturnType((DataTypes)newValue);
				return;
			case StructuralPackage.METHOD__ACCESS_MODIFIERS:
				setAccessModifiers((AccessMod)newValue);
				return;
			case StructuralPackage.METHOD__BELONG_TO_CLASS:
				setBelongToClass((structural.Class)newValue);
				return;
			case StructuralPackage.METHOD__VARIBALES:
				getVaribales().clear();
				getVaribales().addAll((Collection<? extends Variable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructuralPackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructuralPackage.METHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case StructuralPackage.METHOD__ACCESS_MODIFIERS:
				setAccessModifiers(ACCESS_MODIFIERS_EDEFAULT);
				return;
			case StructuralPackage.METHOD__BELONG_TO_CLASS:
				setBelongToClass((structural.Class)null);
				return;
			case StructuralPackage.METHOD__VARIBALES:
				getVaribales().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructuralPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructuralPackage.METHOD__RETURN_TYPE:
				return returnType != RETURN_TYPE_EDEFAULT;
			case StructuralPackage.METHOD__ACCESS_MODIFIERS:
				return accessModifiers != ACCESS_MODIFIERS_EDEFAULT;
			case StructuralPackage.METHOD__BELONG_TO_CLASS:
				return belongToClass != null;
			case StructuralPackage.METHOD__VARIBALES:
				return varibales != null && !varibales.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", accessModifiers: ");
		result.append(accessModifiers);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
