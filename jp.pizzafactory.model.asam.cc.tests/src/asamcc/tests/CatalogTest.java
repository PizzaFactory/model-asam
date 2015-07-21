/**
 */
package asamcc.tests;

import asamcc.Catalog;
import asamcc.Container_catalogFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogTest extends TestCase {

    /**
     * The fixture for this Catalog test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Catalog fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(CatalogTest.class);
    }

    /**
     * Constructs a new Catalog test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CatalogTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Catalog test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Catalog fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Catalog test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Catalog getFixture() {
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
        setFixture(Container_catalogFactory.eINSTANCE.createCatalog());
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

} //CatalogTest
