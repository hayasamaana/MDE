/**
 */
package behaviour.tests;

import behaviour.BehaviourFactory;
import behaviour.ReadLineStatement;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Read Line Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReadLineStatementTest extends CallFunctionStatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReadLineStatementTest.class);
	}

	/**
	 * Constructs a new Read Line Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLineStatementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Read Line Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReadLineStatement getFixture() {
		return (ReadLineStatement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourFactory.eINSTANCE.createReadLineStatement());
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

} //ReadLineStatementTest
