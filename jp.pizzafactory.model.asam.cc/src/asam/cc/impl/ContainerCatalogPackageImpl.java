/**
 */
package asam.cc.impl;

import asam.cc.Ablock;
import asam.cc.Catalog;
import asam.cc.ContainerCatalogFactory;
import asam.cc.ContainerCatalogPackage;
import asam.cc.Files;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerCatalogPackageImpl extends EPackageImpl implements ContainerCatalogPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass catalogEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ablockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass filesEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see asam.cc.ContainerCatalogPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ContainerCatalogPackageImpl() {
        super(eNS_URI, ContainerCatalogFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ContainerCatalogPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ContainerCatalogPackage init() {
        if (isInited) return (ContainerCatalogPackage)EPackage.Registry.INSTANCE.getEPackage(ContainerCatalogPackage.eNS_URI);

        // Obtain or create and register package
        ContainerCatalogPackageImpl theContainerCatalogPackage = (ContainerCatalogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContainerCatalogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContainerCatalogPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theContainerCatalogPackage.createPackageContents();

        // Initialize created meta-data
        theContainerCatalogPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theContainerCatalogPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ContainerCatalogPackage.eNS_URI, theContainerCatalogPackage);
        return theContainerCatalogPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCatalog() {
        return catalogEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCatalog_ShortName() {
        return (EAttribute)catalogEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCatalog_ABlocks() {
        return (EReference)catalogEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAblock() {
        return ablockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAblock_ShortName() {
        return (EAttribute)ablockEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAblock_Category() {
        return (EAttribute)ablockEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAblock_Domain() {
        return (EAttribute)ablockEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAblock_Files() {
        return (EReference)ablockEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFiles() {
        return filesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFiles_File() {
        return (EAttribute)filesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerCatalogFactory getContainerCatalogFactory() {
        return (ContainerCatalogFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        catalogEClass = createEClass(CATALOG);
        createEAttribute(catalogEClass, CATALOG__SHORT_NAME);
        createEReference(catalogEClass, CATALOG__ABLOCKS);

        ablockEClass = createEClass(ABLOCK);
        createEAttribute(ablockEClass, ABLOCK__SHORT_NAME);
        createEAttribute(ablockEClass, ABLOCK__CATEGORY);
        createEAttribute(ablockEClass, ABLOCK__DOMAIN);
        createEReference(ablockEClass, ABLOCK__FILES);

        filesEClass = createEClass(FILES);
        createEAttribute(filesEClass, FILES__FILE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCatalog_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCatalog_ABlocks(), this.getAblock(), null, "aBlocks", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ablockEClass, Ablock.class, "Ablock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAblock_ShortName(), ecorePackage.getEString(), "shortName", null, 1, 1, Ablock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAblock_Category(), ecorePackage.getEString(), "category", null, 1, 1, Ablock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAblock_Domain(), ecorePackage.getEString(), "domain", null, 1, 1, Ablock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAblock_Files(), this.getFiles(), null, "files", null, 1, 1, Ablock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(filesEClass, Files.class, "Files", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFiles_File(), ecorePackage.getEString(), "file", null, 0, -1, Files.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ContainerCatalogPackageImpl
