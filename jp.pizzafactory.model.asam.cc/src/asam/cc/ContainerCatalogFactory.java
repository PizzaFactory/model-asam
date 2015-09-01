/**
 */
package asam.cc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see asam.cc.ContainerCatalogPackage
 * @generated
 */
public interface ContainerCatalogFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ContainerCatalogFactory eINSTANCE = asam.cc.impl.ContainerCatalogFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Catalog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Catalog</em>'.
     * @generated
     */
    Catalog createCatalog();

    /**
     * Returns a new object of class '<em>Ablock</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ablock</em>'.
     * @generated
     */
    Ablock createAblock();

    /**
     * Returns a new object of class '<em>Files</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Files</em>'.
     * @generated
     */
    Files createFiles();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ContainerCatalogPackage getContainerCatalogPackage();

} //ContainerCatalogFactory
