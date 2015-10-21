/**
 */
package asam.cc.tests;

import asam.cc.ContainerCatalogFactory;
import asam.cc.SdgContents;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sdg Contents</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdgContentsTest extends ARObjectTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SdgContentsTest.class);
    }

    /**
     * Constructs a new Sdg Contents test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SdgContentsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Sdg Contents test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected SdgContents getFixture() {
        return (SdgContents)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ContainerCatalogFactory.eINSTANCE.createSdgContents());
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

} //SdgContentsTest
