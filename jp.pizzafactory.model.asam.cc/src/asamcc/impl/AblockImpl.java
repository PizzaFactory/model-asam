/**
 */
package asamcc.impl;

import asamcc.Ablock;
import asamcc.Container_catalogPackage;
import asamcc.Files;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ablock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asamcc.impl.AblockImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link asamcc.impl.AblockImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link asamcc.impl.AblockImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link asamcc.impl.AblockImpl#getFiles <em>Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AblockImpl extends MinimalEObjectImpl.Container implements Ablock {
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
     * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected static final String CATEGORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected String category = CATEGORY_EDEFAULT;

    /**
     * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected static final String DOMAIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected String domain = DOMAIN_EDEFAULT;

    /**
     * The cached value of the '{@link #getFiles() <em>Files</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFiles()
     * @generated
     * @ordered
     */
    protected Files files;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AblockImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Container_catalogPackage.Literals.ABLOCK;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Container_catalogPackage.ABLOCK__SHORT_NAME, oldShortName, shortName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCategory() {
        return category;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCategory(String newCategory) {
        String oldCategory = category;
        category = newCategory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Container_catalogPackage.ABLOCK__CATEGORY, oldCategory, category));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDomain(String newDomain) {
        String oldDomain = domain;
        domain = newDomain;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Container_catalogPackage.ABLOCK__DOMAIN, oldDomain, domain));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Files getFiles() {
        if (files != null && files.eIsProxy()) {
            InternalEObject oldFiles = (InternalEObject)files;
            files = (Files)eResolveProxy(oldFiles);
            if (files != oldFiles) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Container_catalogPackage.ABLOCK__FILES, oldFiles, files));
            }
        }
        return files;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Files basicGetFiles() {
        return files;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFiles(Files newFiles) {
        Files oldFiles = files;
        files = newFiles;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Container_catalogPackage.ABLOCK__FILES, oldFiles, files));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Container_catalogPackage.ABLOCK__SHORT_NAME:
                return getShortName();
            case Container_catalogPackage.ABLOCK__CATEGORY:
                return getCategory();
            case Container_catalogPackage.ABLOCK__DOMAIN:
                return getDomain();
            case Container_catalogPackage.ABLOCK__FILES:
                if (resolve) return getFiles();
                return basicGetFiles();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Container_catalogPackage.ABLOCK__SHORT_NAME:
                setShortName((String)newValue);
                return;
            case Container_catalogPackage.ABLOCK__CATEGORY:
                setCategory((String)newValue);
                return;
            case Container_catalogPackage.ABLOCK__DOMAIN:
                setDomain((String)newValue);
                return;
            case Container_catalogPackage.ABLOCK__FILES:
                setFiles((Files)newValue);
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
            case Container_catalogPackage.ABLOCK__SHORT_NAME:
                setShortName(SHORT_NAME_EDEFAULT);
                return;
            case Container_catalogPackage.ABLOCK__CATEGORY:
                setCategory(CATEGORY_EDEFAULT);
                return;
            case Container_catalogPackage.ABLOCK__DOMAIN:
                setDomain(DOMAIN_EDEFAULT);
                return;
            case Container_catalogPackage.ABLOCK__FILES:
                setFiles((Files)null);
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
            case Container_catalogPackage.ABLOCK__SHORT_NAME:
                return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
            case Container_catalogPackage.ABLOCK__CATEGORY:
                return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
            case Container_catalogPackage.ABLOCK__DOMAIN:
                return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
            case Container_catalogPackage.ABLOCK__FILES:
                return files != null;
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
        result.append(", category: ");
        result.append(category);
        result.append(", domain: ");
        result.append(domain);
        result.append(')');
        return result.toString();
    }

} //AblockImpl
