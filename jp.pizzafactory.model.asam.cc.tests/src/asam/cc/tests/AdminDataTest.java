/**
 */
package asam.cc.tests;

import asam.cc.AdminData;
import asam.cc.ContainerCatalogFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Admin Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdminDataTest extends ARObjectTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(AdminDataTest.class);
    }

    /**
     * Constructs a new Admin Data test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdminDataTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Admin Data test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected AdminData getFixture() {
        return (AdminData)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ContainerCatalogFactory.eINSTANCE.createAdminData());
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

} //AdminDataTest
