/**
 */
package asam.cc.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.junit.Test;

import asam.cc.Ablock;
import asam.cc.ContainerCatalogFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ablock</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AblockTest extends TestCase {

    /**
     * The fixture for this Ablock test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Ablock fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(AblockTest.class);
    }

    /**
     * Constructs a new Ablock test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AblockTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Ablock test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Ablock fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Ablock test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Ablock getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ContainerCatalogFactory.eINSTANCE.createAblock());
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

    @Test
    public void testAblock() {
        assertTrue(true);
        // TODO dummy
    }
} // AblockTest
