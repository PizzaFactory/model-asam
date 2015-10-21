/**
 */
package asam.cc.tests;

import asam.cc.ContainerCatalogFactory;
import asam.cc.Sdg;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sdg</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdgTest extends ARObjectTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SdgTest.class);
    }

    /**
     * Constructs a new Sdg test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SdgTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Sdg test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Sdg getFixture() {
        return (Sdg)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ContainerCatalogFactory.eINSTANCE.createSdg());
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

} //SdgTest
