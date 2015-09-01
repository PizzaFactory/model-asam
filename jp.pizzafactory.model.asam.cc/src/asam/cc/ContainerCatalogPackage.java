/**
 */
package asam.cc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see asam.cc.ContainerCatalogFactory
 * @model kind="package"
 * @generated
 */
public interface ContainerCatalogPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cc";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://pizzafactory.jp/asam/cc";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "jp.pizzafactory.asam.cc";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ContainerCatalogPackage eINSTANCE = asam.cc.impl.ContainerCatalogPackageImpl.init();

    /**
     * The meta object id for the '{@link asam.cc.impl.CatalogImpl <em>Catalog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.CatalogImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getCatalog()
     * @generated
     */
    int CATALOG = 0;

    /**
     * The feature id for the '<em><b>Short Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG__SHORT_NAME = 0;

    /**
     * The feature id for the '<em><b>ABlocks</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG__ABLOCKS = 1;

    /**
     * The number of structural features of the '<em>Catalog</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Catalog</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.AblockImpl <em>Ablock</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.AblockImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getAblock()
     * @generated
     */
    int ABLOCK = 1;

    /**
     * The feature id for the '<em><b>Short Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK__SHORT_NAME = 0;

    /**
     * The feature id for the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK__CATEGORY = 1;

    /**
     * The feature id for the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK__DOMAIN = 2;

    /**
     * The feature id for the '<em><b>Files</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK__FILES = 3;

    /**
     * The number of structural features of the '<em>Ablock</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Ablock</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.FilesImpl <em>Files</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.FilesImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getFiles()
     * @generated
     */
    int FILES = 2;

    /**
     * The feature id for the '<em><b>File</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILES__FILE = 0;

    /**
     * The number of structural features of the '<em>Files</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Files</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILES_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link asam.cc.Catalog <em>Catalog</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Catalog</em>'.
     * @see asam.cc.Catalog
     * @generated
     */
    EClass getCatalog();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Catalog#getShortName <em>Short Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Short Name</em>'.
     * @see asam.cc.Catalog#getShortName()
     * @see #getCatalog()
     * @generated
     */
    EAttribute getCatalog_ShortName();

    /**
     * Returns the meta object for the reference list '{@link asam.cc.Catalog#getABlocks <em>ABlocks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>ABlocks</em>'.
     * @see asam.cc.Catalog#getABlocks()
     * @see #getCatalog()
     * @generated
     */
    EReference getCatalog_ABlocks();

    /**
     * Returns the meta object for class '{@link asam.cc.Ablock <em>Ablock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ablock</em>'.
     * @see asam.cc.Ablock
     * @generated
     */
    EClass getAblock();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Ablock#getShortName <em>Short Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Short Name</em>'.
     * @see asam.cc.Ablock#getShortName()
     * @see #getAblock()
     * @generated
     */
    EAttribute getAblock_ShortName();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Ablock#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Category</em>'.
     * @see asam.cc.Ablock#getCategory()
     * @see #getAblock()
     * @generated
     */
    EAttribute getAblock_Category();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Ablock#getDomain <em>Domain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Domain</em>'.
     * @see asam.cc.Ablock#getDomain()
     * @see #getAblock()
     * @generated
     */
    EAttribute getAblock_Domain();

    /**
     * Returns the meta object for the reference '{@link asam.cc.Ablock#getFiles <em>Files</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Files</em>'.
     * @see asam.cc.Ablock#getFiles()
     * @see #getAblock()
     * @generated
     */
    EReference getAblock_Files();

    /**
     * Returns the meta object for class '{@link asam.cc.Files <em>Files</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Files</em>'.
     * @see asam.cc.Files
     * @generated
     */
    EClass getFiles();

    /**
     * Returns the meta object for the attribute list '{@link asam.cc.Files#getFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>File</em>'.
     * @see asam.cc.Files#getFile()
     * @see #getFiles()
     * @generated
     */
    EAttribute getFiles_File();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ContainerCatalogFactory getContainerCatalogFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link asam.cc.impl.CatalogImpl <em>Catalog</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.CatalogImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getCatalog()
         * @generated
         */
        EClass CATALOG = eINSTANCE.getCatalog();

        /**
         * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CATALOG__SHORT_NAME = eINSTANCE.getCatalog_ShortName();

        /**
         * The meta object literal for the '<em><b>ABlocks</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CATALOG__ABLOCKS = eINSTANCE.getCatalog_ABlocks();

        /**
         * The meta object literal for the '{@link asam.cc.impl.AblockImpl <em>Ablock</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.AblockImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getAblock()
         * @generated
         */
        EClass ABLOCK = eINSTANCE.getAblock();

        /**
         * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABLOCK__SHORT_NAME = eINSTANCE.getAblock_ShortName();

        /**
         * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABLOCK__CATEGORY = eINSTANCE.getAblock_Category();

        /**
         * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABLOCK__DOMAIN = eINSTANCE.getAblock_Domain();

        /**
         * The meta object literal for the '<em><b>Files</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABLOCK__FILES = eINSTANCE.getAblock_Files();

        /**
         * The meta object literal for the '{@link asam.cc.impl.FilesImpl <em>Files</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.FilesImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getFiles()
         * @generated
         */
        EClass FILES = eINSTANCE.getFiles();

        /**
         * The meta object literal for the '<em><b>File</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILES__FILE = eINSTANCE.getFiles_File();

    }

} //ContainerCatalogPackage
