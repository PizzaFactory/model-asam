/**
 */
package asam.cc.tests;

import asam.cc.ContainerCatalogFactory;
import asam.cc.ShortNameFragment;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Short Name Fragment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShortNameFragmentTest extends ARObjectTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ShortNameFragmentTest.class);
    }

    /**
     * Constructs a new Short Name Fragment test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ShortNameFragmentTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Short Name Fragment test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ShortNameFragment getFixture() {
        return (ShortNameFragment)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ContainerCatalogFactory.eINSTANCE.createShortNameFragment());
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

} //ShortNameFragmentTest
