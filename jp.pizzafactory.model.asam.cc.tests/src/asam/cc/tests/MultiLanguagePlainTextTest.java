/**
 */
package asam.cc.tests;

import asam.cc.ContainerCatalogFactory;
import asam.cc.MultiLanguagePlainText;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Language Plain Text</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiLanguagePlainTextTest extends ARObjectTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MultiLanguagePlainTextTest.class);
    }

    /**
     * Constructs a new Multi Language Plain Text test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiLanguagePlainTextTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Multi Language Plain Text test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected MultiLanguagePlainText getFixture() {
        return (MultiLanguagePlainText)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ContainerCatalogFactory.eINSTANCE.createMultiLanguagePlainText());
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

} //MultiLanguagePlainTextTest
