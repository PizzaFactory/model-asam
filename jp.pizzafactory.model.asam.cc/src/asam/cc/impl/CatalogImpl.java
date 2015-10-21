/**
 */
package asam.cc.impl;

import asam.cc.Ablock;
import asam.cc.AdminData;
import asam.cc.Catalog;
import asam.cc.ContainerCatalogPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.CatalogImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link asam.cc.impl.CatalogImpl#getABlocks <em>ABlocks</em>}</li>
 *   <li>{@link asam.cc.impl.CatalogImpl#getAdminData <em>Admin Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogImpl extends MinimalEObjectImpl.Container implements Catalog {
    /**
     * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortName()
     * @generated
     * @ordered
     */
    protected static final String SHORT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortName()
     * @generated
     * @ordered
     */
    protected String shortName = SHORT_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getABlocks() <em>ABlocks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getABlocks()
     * @generated
     * @ordered
     */
    protected EList<Ablock> aBlocks;

    /**
     * The cached value of the '{@link #getAdminData() <em>Admin Data</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdminData()
     * @generated
     * @ordered
     */
    protected AdminData adminData;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CatalogImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.CATALOG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setShortName(String newShortName) {
        String oldShortName = shortName;
        shortName = newShortName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.CATALOG__SHORT_NAME, oldShortName, shortName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Ablock> getABlocks() {
        if (aBlocks == null) {
            aBlocks = new EObjectResolvingEList<Ablock>(Ablock.class, this, ContainerCatalogPackage.CATALOG__ABLOCKS);
        }
        return aBlocks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdminData getAdminData() {
        if (adminData != null && adminData.eIsProxy()) {
            InternalEObject oldAdminData = (InternalEObject)adminData;
            adminData = (AdminData)eResolveProxy(oldAdminData);
            if (adminData != oldAdminData) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.CATALOG__ADMIN_DATA, oldAdminData, adminData));
            }
        }
        return adminData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdminData basicGetAdminData() {
        return adminData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAdminData(AdminData newAdminData) {
        AdminData oldAdminData = adminData;
        adminData = newAdminData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.CATALOG__ADMIN_DATA, oldAdminData, adminData));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.CATALOG__SHORT_NAME:
                return getShortName();
            case ContainerCatalogPackage.CATALOG__ABLOCKS:
                return getABlocks();
            case ContainerCatalogPackage.CATALOG__ADMIN_DATA:
                if (resolve) return getAdminData();
                return basicGetAdminData();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ContainerCatalogPackage.CATALOG__SHORT_NAME:
                setShortName((String)newValue);
                return;
            case ContainerCatalogPackage.CATALOG__ABLOCKS:
                getABlocks().clear();
                getABlocks().addAll((Collection<? extends Ablock>)newValue);
                return;
            case ContainerCatalogPackage.CATALOG__ADMIN_DATA:
                setAdminData((AdminData)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ContainerCatalogPackage.CATALOG__SHORT_NAME:
                setShortName(SHORT_NAME_EDEFAULT);
                return;
            case ContainerCatalogPackage.CATALOG__ABLOCKS:
                getABlocks().clear();
                return;
            case ContainerCatalogPackage.CATALOG__ADMIN_DATA:
                setAdminData((AdminData)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ContainerCatalogPackage.CATALOG__SHORT_NAME:
                return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
            case ContainerCatalogPackage.CATALOG__ABLOCKS:
                return aBlocks != null && !aBlocks.isEmpty();
            case ContainerCatalogPackage.CATALOG__ADMIN_DATA:
                return adminData != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (shortName: ");
        result.append(shortName);
        result.append(')');
        return result.toString();
    }

} //CatalogImpl
