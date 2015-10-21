/**
 */
package asam.cc.tests;

import asam.cc.ContainerCatalogFactory;
import asam.cc.ContainerCatalogPackage;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String To String Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringToStringMapTest extends TestCase {

    /**
     * The fixture for this String To String Map test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Map.Entry<String, String> fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(StringToStringMapTest.class);
    }

    /**
     * Constructs a new String To String Map test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringToStringMapTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this String To String Map test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Map.Entry<String, String> fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this String To String Map test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Map.Entry<String, String> getFixture() {
        return fixture;
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
        setFixture((Map.Entry<String, String>)ContainerCatalogFactory.eINSTANCE.create(ContainerCatalogPackage.Literals.STRING_TO_STRING_MAP));
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

} //StringToStringMapTest
