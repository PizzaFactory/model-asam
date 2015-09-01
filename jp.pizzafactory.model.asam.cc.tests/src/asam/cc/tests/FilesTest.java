/**
 */
package asam.cc.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.junit.Test;

import asam.cc.ContainerCatalogFactory;
import asam.cc.Files;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Files</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilesTest extends TestCase {

    /**
     * The fixture for this Files test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Files fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(FilesTest.class);
    }

    /**
     * Constructs a new Files test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FilesTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Files test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Files fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Files test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Files getFixture() {
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
        setFixture(ContainerCatalogFactory.eINSTANCE.createFiles());
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
    public void testFile() {
        // TODO dummy
        assertTrue(true);
    }
} // FilesTest
