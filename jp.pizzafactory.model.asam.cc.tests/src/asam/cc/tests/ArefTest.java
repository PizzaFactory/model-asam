/**
 */
package asam.cc.tests;

import asam.cc.ContainerCatalogFactory;
import asam.cc.ContainerCatalogPackage;

import java.util.Map;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArefTest extends StringToStringMapTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ArefTest.class);
    }

    /**
     * Constructs a new Aref test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArefTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Aref test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map.Entry<String, String> getFixture() {
        return (Map.Entry<String, String>)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    protected void setUp() throws Exception {
        setFixture((Map.Entry<String, String>)ContainerCatalogFactory.eINSTANCE.create(ContainerCatalogPackage.Literals.AREF));
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

} //ArefTest
