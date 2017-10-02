/**
 */
package behaviour;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behaviour.BehaviourPackage
 * @generated
 */
public interface BehaviourFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourFactory eINSTANCE = behaviour.impl.BehaviourFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behaviour</em>'.
	 * @generated
	 */
	Behaviour createBehaviour();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Condional Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condional Statement</em>'.
	 * @generated
	 */
	CondionalStatement createCondionalStatement();

	/**
	 * Returns a new object of class '<em>Loop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Statement</em>'.
	 * @generated
	 */
	LoopStatement createLoopStatement();

	/**
	 * Returns a new object of class '<em>Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Statement</em>'.
	 * @generated
	 */
	AssignmentStatement createAssignmentStatement();

	/**
	 * Returns a new object of class '<em>Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaration Statement</em>'.
	 * @generated
	 */
	DeclarationStatement createDeclarationStatement();

	/**
	 * Returns a new object of class '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Statement</em>'.
	 * @generated
	 */
	ReturnStatement createReturnStatement();

	/**
	 * Returns a new object of class '<em>Call Function Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Function Statement</em>'.
	 * @generated
	 */
	CallFunctionStatement createCallFunctionStatement();

	/**
	 * Returns a new object of class '<em>Try Catch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Try Catch Statement</em>'.
	 * @generated
	 */
	TryCatchStatement createTryCatchStatement();

	/**
	 * Returns a new object of class '<em>Exception Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Statement</em>'.
	 * @generated
	 */
	ExceptionStatement createExceptionStatement();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
	FunctionCall createFunctionCall();

	/**
	 * Returns a new object of class '<em>Read Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Line</em>'.
	 * @generated
	 */
	ReadLine createReadLine();

	/**
	 * Returns a new object of class '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus</em>'.
	 * @generated
	 */
	Plus createPlus();

	/**
	 * Returns a new object of class '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equals</em>'.
	 * @generated
	 */
	Equals createEquals();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviourPackage getBehaviourPackage();

} //BehaviourFactory
