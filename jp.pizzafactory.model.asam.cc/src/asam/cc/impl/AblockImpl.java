/**
 */
package asam.cc.impl;

import asam.cc.Ablock;
import asam.cc.ContainerCatalogPackage;
import java.net.URI;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ablock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.AblockImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link asam.cc.impl.AblockImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link asam.cc.impl.AblockImpl#getArefs <em>Arefs</em>}</li>
 *   <li>{@link asam.cc.impl.AblockImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link asam.cc.impl.AblockImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link asam.cc.impl.AblockImpl#getIntendedFileName <em>Intended File Name</em>}</li>
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
     * The cached value of the '{@link #getArefs() <em>Arefs</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArefs()
     * @generated
     * @ordered
     */
    protected Map.Entry<String, String> arefs;

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
     * The cached value of the '{@link #getFiles() <em>Files</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFiles()
     * @generated
     * @ordered
     */
    protected EList<String> files;

    /**
     * The default value of the '{@link #getIntendedFileName() <em>Intended File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntendedFileName()
     * @generated
     * @ordered
     */
    protected static final URI INTENDED_FILE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIntendedFileName() <em>Intended File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntendedFileName()
     * @generated
     * @ordered
     */
    protected URI intendedFileName = INTENDED_FILE_NAME_EDEFAULT;

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
        return ContainerCatalogPackage.Literals.ABLOCK;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.ABLOCK__SHORT_NAME, oldShortName, shortName));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.ABLOCK__CATEGORY, oldCategory, category));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public Map.Entry<String, String> getArefs() {
        if (arefs != null && ((EObject)arefs).eIsProxy()) {
            InternalEObject oldArefs = (InternalEObject)arefs;
            arefs = (Map.Entry<String, String>)eResolveProxy(oldArefs);
            if (arefs != oldArefs) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.ABLOCK__AREFS, oldArefs, arefs));
            }
        }
        return arefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<String, String> basicGetArefs() {
        return arefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArefs(Map.Entry<String, String> newArefs) {
        Map.Entry<String, String> oldArefs = arefs;
        arefs = newArefs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.ABLOCK__AREFS, oldArefs, arefs));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.ABLOCK__DOMAIN, oldDomain, domain));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getFiles() {
        if (files == null) {
            files = new EDataTypeUniqueEList<String>(String.class, this, ContainerCatalogPackage.ABLOCK__FILES);
        }
        return files;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public URI getIntendedFileName() {
        return intendedFileName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIntendedFileName(URI newIntendedFileName) {
        URI oldIntendedFileName = intendedFileName;
        intendedFileName = newIntendedFileName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.ABLOCK__INTENDED_FILE_NAME, oldIntendedFileName, intendedFileName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.ABLOCK__SHORT_NAME:
                return getShortName();
            case ContainerCatalogPackage.ABLOCK__CATEGORY:
                return getCategory();
            case ContainerCatalogPackage.ABLOCK__AREFS:
                if (resolve) return getArefs();
                return basicGetArefs();
            case ContainerCatalogPackage.ABLOCK__DOMAIN:
                return getDomain();
            case ContainerCatalogPackage.ABLOCK__FILES:
                return getFiles();
            case ContainerCatalogPackage.ABLOCK__INTENDED_FILE_NAME:
                return getIntendedFileName();
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
            case ContainerCatalogPackage.ABLOCK__SHORT_NAME:
                setShortName((String)newValue);
                return;
            case ContainerCatalogPackage.ABLOCK__CATEGORY:
                setCategory((String)newValue);
                return;
            case ContainerCatalogPackage.ABLOCK__AREFS:
                setArefs((Map.Entry<String, String>)newValue);
                return;
            case ContainerCatalogPackage.ABLOCK__DOMAIN:
                setDomain((String)newValue);
                return;
            case ContainerCatalogPackage.ABLOCK__FILES:
                getFiles().clear();
                getFiles().addAll((Collection<? extends String>)newValue);
                return;
            case ContainerCatalogPackage.ABLOCK__INTENDED_FILE_NAME:
                setIntendedFileName((URI)newValue);
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
            case ContainerCatalogPackage.ABLOCK__SHORT_NAME:
                setShortName(SHORT_NAME_EDEFAULT);
                return;
            case ContainerCatalogPackage.ABLOCK__CATEGORY:
                setCategory(CATEGORY_EDEFAULT);
                return;
            case ContainerCatalogPackage.ABLOCK__AREFS:
                setArefs((Map.Entry<String, String>)null);
                return;
            case ContainerCatalogPackage.ABLOCK__DOMAIN:
                setDomain(DOMAIN_EDEFAULT);
                return;
            case ContainerCatalogPackage.ABLOCK__FILES:
                getFiles().clear();
                return;
            case ContainerCatalogPackage.ABLOCK__INTENDED_FILE_NAME:
                setIntendedFileName(INTENDED_FILE_NAME_EDEFAULT);
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
            case ContainerCatalogPackage.ABLOCK__SHORT_NAME:
                return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
            case ContainerCatalogPackage.ABLOCK__CATEGORY:
                return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
            case ContainerCatalogPackage.ABLOCK__AREFS:
                return arefs != null;
            case ContainerCatalogPackage.ABLOCK__DOMAIN:
                return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
            case ContainerCatalogPackage.ABLOCK__FILES:
                return files != null && !files.isEmpty();
            case ContainerCatalogPackage.ABLOCK__INTENDED_FILE_NAME:
                return INTENDED_FILE_NAME_EDEFAULT == null ? intendedFileName != null : !INTENDED_FILE_NAME_EDEFAULT.equals(intendedFileName);
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
        result.append(", files: ");
        result.append(files);
        result.append(", intendedFileName: ");
        result.append(intendedFileName);
        result.append(')');
        return result.toString();
    }

} //AblockImpl
