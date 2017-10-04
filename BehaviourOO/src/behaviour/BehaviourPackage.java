/**
 */
package behaviour;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see behaviour.BehaviourFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.najah.org/behaviour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourPackage eINSTANCE = behaviour.impl.BehaviourPackageImpl.init();

	/**
	 * The meta object id for the '{@link behaviour.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.BehaviourImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__FUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Entry Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__ENTRY_FUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.FunctionImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Function Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FUNCTION_BODY = 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.StatementImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.CondionalStatementImpl <em>Condional Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.CondionalStatementImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getCondionalStatement()
	 * @generated
	 */
	int CONDIONAL_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>If Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDIONAL_STATEMENT__IF_STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDIONAL_STATEMENT__ELSE_STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDIONAL_STATEMENT__IF_EXPRESSION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDIONAL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDIONAL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.LoopStatementImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getLoopStatement()
	 * @generated
	 */
	int LOOP_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Loop Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__LOOP_EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Body Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__LOOP_BODY_STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.AssignmentStatementImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getAssignmentStatement()
	 * @generated
	 */
	int ASSIGNMENT_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__VAR_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assign Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__ASSIGN_EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.DeclarationStatementImpl <em>Declaration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.DeclarationStatementImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getDeclarationStatement()
	 * @generated
	 */
	int DECLARATION_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_STATEMENT__VAR_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_STATEMENT__VAR_TYPE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_STATEMENT__INITIAL_EXPRESSION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.ReturnStatementImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Return Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__RETURN_EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.CallFunctionStatementImpl <em>Call Function Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.CallFunctionStatementImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getCallFunctionStatement()
	 * @generated
	 */
	int CALL_FUNCTION_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION_STATEMENT__ARGUMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION_STATEMENT__NAME_FUNC = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Function Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Call Function Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.TryCatchStatementImpl <em>Try Catch Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.TryCatchStatementImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getTryCatchStatement()
	 * @generated
	 */
	int TRY_CATCH_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Try Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CATCH_STATEMENT__TRY_STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CATCH_STATEMENT__CATCH_STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Try Catch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CATCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Try Catch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CATCH_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.ExceptionStatementImpl <em>Exception Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.ExceptionStatementImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getExceptionStatement()
	 * @generated
	 */
	int EXCEPTION_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Throws Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_STATEMENT__THROWS_EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exception Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exception Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.ExpressionImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 11;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.LiteralImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 12;

	/**
	 * The feature id for the '<em><b>Vlaue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VLAUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.VariableImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 13;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VAR_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.FunctionCallImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 14;

	/**
	 * The feature id for the '<em><b>Func Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNC_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.ReadLineImpl <em>Read Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.ReadLineImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getReadLine()
	 * @generated
	 */
	int READ_LINE = 15;

	/**
	 * The number of structural features of the '<em>Read Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.BinaryExpressionImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Left Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.ArithmeticOperationImpl <em>Arithmetic Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.ArithmeticOperationImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getArithmeticOperation()
	 * @generated
	 */
	int ARITHMETIC_OPERATION = 17;

	/**
	 * The feature id for the '<em><b>Left Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION__LEFT_SIDE_EXPRESSION = BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION__RIGHT_SIDE_EXPRESSION = BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.ComparisonOperatorImpl <em>Comparison Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.ComparisonOperatorImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 18;

	/**
	 * The feature id for the '<em><b>Left Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR__LEFT_SIDE_EXPRESSION = BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR__RIGHT_SIDE_EXPRESSION = BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.PlusImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 19;

	/**
	 * The feature id for the '<em><b>Left Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT_SIDE_EXPRESSION = ARITHMETIC_OPERATION__LEFT_SIDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT_SIDE_EXPRESSION = ARITHMETIC_OPERATION__RIGHT_SIDE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = ARITHMETIC_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = ARITHMETIC_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.EqualsImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 20;

	/**
	 * The feature id for the '<em><b>Left Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__LEFT_SIDE_EXPRESSION = COMPARISON_OPERATOR__LEFT_SIDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Side Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__RIGHT_SIDE_EXPRESSION = COMPARISON_OPERATOR__RIGHT_SIDE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link behaviour.impl.WriteLineStatementImpl <em>Write Line Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.WriteLineStatementImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getWriteLineStatement()
	 * @generated
	 */
	int WRITE_LINE_STATEMENT = 21;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINE_STATEMENT__ARGUMENTS = CALL_FUNCTION_STATEMENT__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Name Func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINE_STATEMENT__NAME_FUNC = CALL_FUNCTION_STATEMENT__NAME_FUNC;

	/**
	 * The number of structural features of the '<em>Write Line Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINE_STATEMENT_FEATURE_COUNT = CALL_FUNCTION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Write Line Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINE_STATEMENT_OPERATION_COUNT = CALL_FUNCTION_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviour.impl.ReadLineStatementImpl <em>Read Line Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviour.impl.ReadLineStatementImpl
	 * @see behaviour.impl.BehaviourPackageImpl#getReadLineStatement()
	 * @generated
	 */
	int READ_LINE_STATEMENT = 22;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_STATEMENT__ARGUMENTS = CALL_FUNCTION_STATEMENT__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Name Func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_STATEMENT__NAME_FUNC = CALL_FUNCTION_STATEMENT__NAME_FUNC;

	/**
	 * The number of structural features of the '<em>Read Line Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_STATEMENT_FEATURE_COUNT = CALL_FUNCTION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Line Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_STATEMENT_OPERATION_COUNT = CALL_FUNCTION_STATEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link behaviour.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see behaviour.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviour.Behaviour#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see behaviour.Behaviour#getFunctions()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_Functions();

	/**
	 * Returns the meta object for the reference '{@link behaviour.Behaviour#getEntryFunction <em>Entry Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Function</em>'.
	 * @see behaviour.Behaviour#getEntryFunction()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_EntryFunction();

	/**
	 * Returns the meta object for class '{@link behaviour.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see behaviour.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link behaviour.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviour.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviour.Function#getFunctionBody <em>Function Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Body</em>'.
	 * @see behaviour.Function#getFunctionBody()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_FunctionBody();

	/**
	 * Returns the meta object for class '{@link behaviour.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see behaviour.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link behaviour.CondionalStatement <em>Condional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condional Statement</em>'.
	 * @see behaviour.CondionalStatement
	 * @generated
	 */
	EClass getCondionalStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviour.CondionalStatement#getIfStatements <em>If Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Statements</em>'.
	 * @see behaviour.CondionalStatement#getIfStatements()
	 * @see #getCondionalStatement()
	 * @generated
	 */
	EReference getCondionalStatement_IfStatements();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviour.CondionalStatement#getElseStatements <em>Else Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Statements</em>'.
	 * @see behaviour.CondionalStatement#getElseStatements()
	 * @see #getCondionalStatement()
	 * @generated
	 */
	EReference getCondionalStatement_ElseStatements();

	/**
	 * Returns the meta object for the containment reference '{@link behaviour.CondionalStatement#getIfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Expression</em>'.
	 * @see behaviour.CondionalStatement#getIfExpression()
	 * @see #getCondionalStatement()
	 * @generated
	 */
	EReference getCondionalStatement_IfExpression();

	/**
	 * Returns the meta object for class '{@link behaviour.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Statement</em>'.
	 * @see behaviour.LoopStatement
	 * @generated
	 */
	EClass getLoopStatement();

	/**
	 * Returns the meta object for the containment reference '{@link behaviour.LoopStatement#getLoopExpression <em>Loop Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Expression</em>'.
	 * @see behaviour.LoopStatement#getLoopExpression()
	 * @see #getLoopStatement()
	 * @generated
	 */
	EReference getLoopStatement_LoopExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviour.LoopStatement#getLoopBodyStatements <em>Loop Body Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Body Statements</em>'.
	 * @see behaviour.LoopStatement#getLoopBodyStatements()
	 * @see #getLoopStatement()
	 * @generated
	 */
	EReference getLoopStatement_LoopBodyStatements();

	/**
	 * Returns the meta object for class '{@link behaviour.AssignmentStatement <em>Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Statement</em>'.
	 * @see behaviour.AssignmentStatement
	 * @generated
	 */
	EClass getAssignmentStatement();

	/**
	 * Returns the meta object for the attribute '{@link behaviour.AssignmentStatement#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see behaviour.AssignmentStatement#getVarName()
	 * @see #getAssignmentStatement()
	 * @generated
	 */
	EAttribute getAssignmentStatement_VarName();

	/**
	 * Returns the meta object for the containment reference '{@link behaviour.AssignmentStatement#getAssignExpression <em>Assign Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign Expression</em>'.
	 * @see behaviour.AssignmentStatement#getAssignExpression()
	 * @see #getAssignmentStatement()
	 * @generated
	 */
	EReference getAssignmentStatement_AssignExpression();

	/**
	 * Returns the meta object for class '{@link behaviour.DeclarationStatement <em>Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration Statement</em>'.
	 * @see behaviour.DeclarationStatement
	 * @generated
	 */
	EClass getDeclarationStatement();

	/**
	 * Returns the meta object for the attribute '{@link behaviour.DeclarationStatement#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see behaviour.DeclarationStatement#getVarName()
	 * @see #getDeclarationStatement()
	 * @generated
	 */
	EAttribute getDeclarationStatement_VarName();

	/**
	 * Returns the meta object for the attribute '{@link behaviour.DeclarationStatement#getVarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Type</em>'.
	 * @see behaviour.DeclarationStatement#getVarType()
	 * @see #getDeclarationStatement()
	 * @generated
	 */
	EAttribute getDeclarationStatement_VarType();

	/**
	 * Returns the meta object for the containment reference '{@link behaviour.DeclarationStatement#getInitialExpression <em>Initial Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Expression</em>'.
	 * @see behaviour.DeclarationStatement#getInitialExpression()
	 * @see #getDeclarationStatement()
	 * @generated
	 */
	EReference getDeclarationStatement_InitialExpression();

	/**
	 * Returns the meta object for class '{@link behaviour.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see behaviour.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link behaviour.ReturnStatement#getReturnExpression <em>Return Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Expression</em>'.
	 * @see behaviour.ReturnStatement#getReturnExpression()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_ReturnExpression();

	/**
	 * Returns the meta object for class '{@link behaviour.CallFunctionStatement <em>Call Function Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Function Statement</em>'.
	 * @see behaviour.CallFunctionStatement
	 * @generated
	 */
	EClass getCallFunctionStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviour.CallFunctionStatement#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see behaviour.CallFunctionStatement#getArguments()
	 * @see #getCallFunctionStatement()
	 * @generated
	 */
	EReference getCallFunctionStatement_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link behaviour.CallFunctionStatement#getNameFunc <em>Name Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Func</em>'.
	 * @see behaviour.CallFunctionStatement#getNameFunc()
	 * @see #getCallFunctionStatement()
	 * @generated
	 */
	EAttribute getCallFunctionStatement_NameFunc();

	/**
	 * Returns the meta object for class '{@link behaviour.TryCatchStatement <em>Try Catch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Catch Statement</em>'.
	 * @see behaviour.TryCatchStatement
	 * @generated
	 */
	EClass getTryCatchStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviour.TryCatchStatement#getTryStatements <em>Try Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Try Statements</em>'.
	 * @see behaviour.TryCatchStatement#getTryStatements()
	 * @see #getTryCatchStatement()
	 * @generated
	 */
	EReference getTryCatchStatement_TryStatements();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviour.TryCatchStatement#getCatchStatements <em>Catch Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch Statements</em>'.
	 * @see behaviour.TryCatchStatement#getCatchStatements()
	 * @see #getTryCatchStatement()
	 * @generated
	 */
	EReference getTryCatchStatement_CatchStatements();

	/**
	 * Returns the meta object for class '{@link behaviour.ExceptionStatement <em>Exception Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Statement</em>'.
	 * @see behaviour.ExceptionStatement
	 * @generated
	 */
	EClass getExceptionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link behaviour.ExceptionStatement#getThrowsExpression <em>Throws Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throws Expression</em>'.
	 * @see behaviour.ExceptionStatement#getThrowsExpression()
	 * @see #getExceptionStatement()
	 * @generated
	 */
	EReference getExceptionStatement_ThrowsExpression();

	/**
	 * Returns the meta object for class '{@link behaviour.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see behaviour.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link behaviour.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see behaviour.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link behaviour.Literal#getVlaue <em>Vlaue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vlaue</em>'.
	 * @see behaviour.Literal#getVlaue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Vlaue();

	/**
	 * Returns the meta object for class '{@link behaviour.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see behaviour.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link behaviour.Variable#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see behaviour.Variable#getVarName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_VarName();

	/**
	 * Returns the meta object for class '{@link behaviour.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see behaviour.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link behaviour.FunctionCall#getFuncName <em>Func Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Func Name</em>'.
	 * @see behaviour.FunctionCall#getFuncName()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_FuncName();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviour.FunctionCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see behaviour.FunctionCall#getArguments()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Arguments();

	/**
	 * Returns the meta object for class '{@link behaviour.ReadLine <em>Read Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Line</em>'.
	 * @see behaviour.ReadLine
	 * @generated
	 */
	EClass getReadLine();

	/**
	 * Returns the meta object for class '{@link behaviour.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see behaviour.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link behaviour.BinaryExpression#getLeftSideExpression <em>Left Side Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Side Expression</em>'.
	 * @see behaviour.BinaryExpression#getLeftSideExpression()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftSideExpression();

	/**
	 * Returns the meta object for the containment reference '{@link behaviour.BinaryExpression#getRightSideExpression <em>Right Side Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Side Expression</em>'.
	 * @see behaviour.BinaryExpression#getRightSideExpression()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightSideExpression();

	/**
	 * Returns the meta object for class '{@link behaviour.ArithmeticOperation <em>Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operation</em>'.
	 * @see behaviour.ArithmeticOperation
	 * @generated
	 */
	EClass getArithmeticOperation();

	/**
	 * Returns the meta object for class '{@link behaviour.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Operator</em>'.
	 * @see behaviour.ComparisonOperator
	 * @generated
	 */
	EClass getComparisonOperator();

	/**
	 * Returns the meta object for class '{@link behaviour.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see behaviour.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link behaviour.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see behaviour.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for class '{@link behaviour.WriteLineStatement <em>Write Line Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Line Statement</em>'.
	 * @see behaviour.WriteLineStatement
	 * @generated
	 */
	EClass getWriteLineStatement();

	/**
	 * Returns the meta object for class '{@link behaviour.ReadLineStatement <em>Read Line Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Line Statement</em>'.
	 * @see behaviour.ReadLineStatement
	 * @generated
	 */
	EClass getReadLineStatement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourFactory getBehaviourFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link behaviour.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.BehaviourImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__FUNCTIONS = eINSTANCE.getBehaviour_Functions();

		/**
		 * The meta object literal for the '<em><b>Entry Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__ENTRY_FUNCTION = eINSTANCE.getBehaviour_EntryFunction();

		/**
		 * The meta object literal for the '{@link behaviour.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.FunctionImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Function Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FUNCTION_BODY = eINSTANCE.getFunction_FunctionBody();

		/**
		 * The meta object literal for the '{@link behaviour.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.StatementImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link behaviour.impl.CondionalStatementImpl <em>Condional Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.CondionalStatementImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getCondionalStatement()
		 * @generated
		 */
		EClass CONDIONAL_STATEMENT = eINSTANCE.getCondionalStatement();

		/**
		 * The meta object literal for the '<em><b>If Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDIONAL_STATEMENT__IF_STATEMENTS = eINSTANCE.getCondionalStatement_IfStatements();

		/**
		 * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDIONAL_STATEMENT__ELSE_STATEMENTS = eINSTANCE.getCondionalStatement_ElseStatements();

		/**
		 * The meta object literal for the '<em><b>If Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDIONAL_STATEMENT__IF_EXPRESSION = eINSTANCE.getCondionalStatement_IfExpression();

		/**
		 * The meta object literal for the '{@link behaviour.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.LoopStatementImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getLoopStatement()
		 * @generated
		 */
		EClass LOOP_STATEMENT = eINSTANCE.getLoopStatement();

		/**
		 * The meta object literal for the '<em><b>Loop Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_STATEMENT__LOOP_EXPRESSION = eINSTANCE.getLoopStatement_LoopExpression();

		/**
		 * The meta object literal for the '<em><b>Loop Body Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_STATEMENT__LOOP_BODY_STATEMENTS = eINSTANCE.getLoopStatement_LoopBodyStatements();

		/**
		 * The meta object literal for the '{@link behaviour.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.AssignmentStatementImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getAssignmentStatement()
		 * @generated
		 */
		EClass ASSIGNMENT_STATEMENT = eINSTANCE.getAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_STATEMENT__VAR_NAME = eINSTANCE.getAssignmentStatement_VarName();

		/**
		 * The meta object literal for the '<em><b>Assign Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_STATEMENT__ASSIGN_EXPRESSION = eINSTANCE.getAssignmentStatement_AssignExpression();

		/**
		 * The meta object literal for the '{@link behaviour.impl.DeclarationStatementImpl <em>Declaration Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.DeclarationStatementImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getDeclarationStatement()
		 * @generated
		 */
		EClass DECLARATION_STATEMENT = eINSTANCE.getDeclarationStatement();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION_STATEMENT__VAR_NAME = eINSTANCE.getDeclarationStatement_VarName();

		/**
		 * The meta object literal for the '<em><b>Var Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION_STATEMENT__VAR_TYPE = eINSTANCE.getDeclarationStatement_VarType();

		/**
		 * The meta object literal for the '<em><b>Initial Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION_STATEMENT__INITIAL_EXPRESSION = eINSTANCE.getDeclarationStatement_InitialExpression();

		/**
		 * The meta object literal for the '{@link behaviour.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.ReturnStatementImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Return Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__RETURN_EXPRESSION = eINSTANCE.getReturnStatement_ReturnExpression();

		/**
		 * The meta object literal for the '{@link behaviour.impl.CallFunctionStatementImpl <em>Call Function Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.CallFunctionStatementImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getCallFunctionStatement()
		 * @generated
		 */
		EClass CALL_FUNCTION_STATEMENT = eINSTANCE.getCallFunctionStatement();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_FUNCTION_STATEMENT__ARGUMENTS = eINSTANCE.getCallFunctionStatement_Arguments();

		/**
		 * The meta object literal for the '<em><b>Name Func</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_FUNCTION_STATEMENT__NAME_FUNC = eINSTANCE.getCallFunctionStatement_NameFunc();

		/**
		 * The meta object literal for the '{@link behaviour.impl.TryCatchStatementImpl <em>Try Catch Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.TryCatchStatementImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getTryCatchStatement()
		 * @generated
		 */
		EClass TRY_CATCH_STATEMENT = eINSTANCE.getTryCatchStatement();

		/**
		 * The meta object literal for the '<em><b>Try Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_CATCH_STATEMENT__TRY_STATEMENTS = eINSTANCE.getTryCatchStatement_TryStatements();

		/**
		 * The meta object literal for the '<em><b>Catch Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_CATCH_STATEMENT__CATCH_STATEMENTS = eINSTANCE.getTryCatchStatement_CatchStatements();

		/**
		 * The meta object literal for the '{@link behaviour.impl.ExceptionStatementImpl <em>Exception Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.ExceptionStatementImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getExceptionStatement()
		 * @generated
		 */
		EClass EXCEPTION_STATEMENT = eINSTANCE.getExceptionStatement();

		/**
		 * The meta object literal for the '<em><b>Throws Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_STATEMENT__THROWS_EXPRESSION = eINSTANCE.getExceptionStatement_ThrowsExpression();

		/**
		 * The meta object literal for the '{@link behaviour.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.ExpressionImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link behaviour.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.LiteralImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Vlaue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VLAUE = eINSTANCE.getLiteral_Vlaue();

		/**
		 * The meta object literal for the '{@link behaviour.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.VariableImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VAR_NAME = eINSTANCE.getVariable_VarName();

		/**
		 * The meta object literal for the '{@link behaviour.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.FunctionCallImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Func Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__FUNC_NAME = eINSTANCE.getFunctionCall_FuncName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__ARGUMENTS = eINSTANCE.getFunctionCall_Arguments();

		/**
		 * The meta object literal for the '{@link behaviour.impl.ReadLineImpl <em>Read Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.ReadLineImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getReadLine()
		 * @generated
		 */
		EClass READ_LINE = eINSTANCE.getReadLine();

		/**
		 * The meta object literal for the '{@link behaviour.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.BinaryExpressionImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left Side Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT_SIDE_EXPRESSION = eINSTANCE.getBinaryExpression_LeftSideExpression();

		/**
		 * The meta object literal for the '<em><b>Right Side Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT_SIDE_EXPRESSION = eINSTANCE.getBinaryExpression_RightSideExpression();

		/**
		 * The meta object literal for the '{@link behaviour.impl.ArithmeticOperationImpl <em>Arithmetic Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.ArithmeticOperationImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getArithmeticOperation()
		 * @generated
		 */
		EClass ARITHMETIC_OPERATION = eINSTANCE.getArithmeticOperation();

		/**
		 * The meta object literal for the '{@link behaviour.impl.ComparisonOperatorImpl <em>Comparison Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.ComparisonOperatorImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EClass COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link behaviour.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.PlusImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link behaviour.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.EqualsImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '{@link behaviour.impl.WriteLineStatementImpl <em>Write Line Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.WriteLineStatementImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getWriteLineStatement()
		 * @generated
		 */
		EClass WRITE_LINE_STATEMENT = eINSTANCE.getWriteLineStatement();

		/**
		 * The meta object literal for the '{@link behaviour.impl.ReadLineStatementImpl <em>Read Line Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviour.impl.ReadLineStatementImpl
		 * @see behaviour.impl.BehaviourPackageImpl#getReadLineStatement()
		 * @generated
		 */
		EClass READ_LINE_STATEMENT = eINSTANCE.getReadLineStatement();

	}

} //BehaviourPackage
