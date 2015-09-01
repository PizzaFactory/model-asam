/**
 */
package asam.cc.impl;

import asam.cc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerCatalogFactoryImpl extends EFactoryImpl implements ContainerCatalogFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ContainerCatalogFactory init() {
        try {
            ContainerCatalogFactory theContainerCatalogFactory = (ContainerCatalogFactory)EPackage.Registry.INSTANCE.getEFactory(ContainerCatalogPackage.eNS_URI);
            if (theContainerCatalogFactory != null) {
                return theContainerCatalogFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ContainerCatalogFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerCatalogFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ContainerCatalogPackage.CATALOG: return createCatalog();
            case ContainerCatalogPackage.ABLOCK: return createAblock();
            case ContainerCatalogPackage.FILES: return createFiles();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Catalog createCatalog() {
        CatalogImpl catalog = new CatalogImpl();
        return catalog;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Ablock createAblock() {
        AblockImpl ablock = new AblockImpl();
        return ablock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Files createFiles() {
        FilesImpl files = new FilesImpl();
        return files;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerCatalogPackage getContainerCatalogPackage() {
        return (ContainerCatalogPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ContainerCatalogPackage getPackage() {
        return ContainerCatalogPackage.eINSTANCE;
    }

} //ContainerCatalogFactoryImpl
