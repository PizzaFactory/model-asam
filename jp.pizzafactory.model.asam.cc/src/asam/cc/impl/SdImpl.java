/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.Sd;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.SdImpl#getGid <em>Gid</em>}</li>
 *   <li>{@link asam.cc.impl.SdImpl#getValue <em>Value</em>}</li>
 *   <li>{@link asam.cc.impl.SdImpl#getXmlSpace <em>Xml Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SdImpl extends ARObjectImpl implements Sd {
    /**
     * The default value of the '{@link #getGid() <em>Gid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGid()
     * @generated
     * @ordered
     */
    protected static final String GID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGid() <em>Gid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGid()
     * @generated
     * @ordered
     */
    protected String gid = GID_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getXmlSpace() <em>Xml Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXmlSpace()
     * @generated
     * @ordered
     */
    protected static final String XML_SPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXmlSpace() <em>Xml Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXmlSpace()
     * @generated
     * @ordered
     */
    protected String xmlSpace = XML_SPACE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SdImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.SD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getGid() {
        return gid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGid(String newGid) {
        String oldGid = gid;
        gid = newGid;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SD__GID, oldGid, gid));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SD__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getXmlSpace() {
        return xmlSpace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXmlSpace(String newXmlSpace) {
        String oldXmlSpace = xmlSpace;
        xmlSpace = newXmlSpace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SD__XML_SPACE, oldXmlSpace, xmlSpace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.SD__GID:
                return getGid();
            case ContainerCatalogPackage.SD__VALUE:
                return getValue();
            case ContainerCatalogPackage.SD__XML_SPACE:
                return getXmlSpace();
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
            case ContainerCatalogPackage.SD__GID:
                setGid((String)newValue);
                return;
            case ContainerCatalogPackage.SD__VALUE:
                setValue((String)newValue);
                return;
            case ContainerCatalogPackage.SD__XML_SPACE:
                setXmlSpace((String)newValue);
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
            case ContainerCatalogPackage.SD__GID:
                setGid(GID_EDEFAULT);
                return;
            case ContainerCatalogPackage.SD__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case ContainerCatalogPackage.SD__XML_SPACE:
                setXmlSpace(XML_SPACE_EDEFAULT);
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
            case ContainerCatalogPackage.SD__GID:
                return GID_EDEFAULT == null ? gid != null : !GID_EDEFAULT.equals(gid);
            case ContainerCatalogPackage.SD__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case ContainerCatalogPackage.SD__XML_SPACE:
                return XML_SPACE_EDEFAULT == null ? xmlSpace != null : !XML_SPACE_EDEFAULT.equals(xmlSpace);
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
        result.append(" (gid: ");
        result.append(gid);
        result.append(", value: ");
        result.append(value);
        result.append(", xmlSpace: ");
        result.append(xmlSpace);
        result.append(')');
        return result.toString();
    }

} //SdImpl
