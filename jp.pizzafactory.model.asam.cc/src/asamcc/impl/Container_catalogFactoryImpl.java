/**
 */
package asamcc.impl;

import asamcc.*;

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
public class Container_catalogFactoryImpl extends EFactoryImpl implements Container_catalogFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Container_catalogFactory init() {
        try {
            Container_catalogFactory theContainer_catalogFactory = (Container_catalogFactory)EPackage.Registry.INSTANCE.getEFactory(Container_catalogPackage.eNS_URI);
            if (theContainer_catalogFactory != null) {
                return theContainer_catalogFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new Container_catalogFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Container_catalogFactoryImpl() {
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
            case Container_catalogPackage.CATALOG: return createCatalog();
            case Container_catalogPackage.ABLOCK: return createAblock();
            case Container_catalogPackage.FILES: return createFiles();
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
    public Container_catalogPackage getContainer_catalogPackage() {
        return (Container_catalogPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static Container_catalogPackage getPackage() {
        return Container_catalogPackage.eINSTANCE;
    }

} //Container_catalogFactoryImpl
