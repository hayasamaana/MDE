/**
 */
package behaviour.tests;

import behaviour.BehaviourFactory;
import behaviour.WriteLineStatement;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Write Line Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WriteLineStatementTest extends CallFunctionStatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WriteLineStatementTest.class);
	}

	/**
	 * Constructs a new Write Line Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteLineStatementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Write Line Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WriteLineStatement getFixture() {
		return (WriteLineStatement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourFactory.eINSTANCE.createWriteLineStatement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WriteLineStatementTest
