/**
 */
package asam.cc.impl;

import asam.cc.ARObject;
import asam.cc.ContainerCatalogPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AR Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.ARObjectImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link asam.cc.impl.ARObjectImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ARObjectImpl extends MinimalEObjectImpl.Container implements ARObject {
    /**
     * The default value of the '{@link #getChecksum() <em>Checksum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChecksum()
     * @generated
     * @ordered
     */
    protected static final String CHECKSUM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getChecksum() <em>Checksum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChecksum()
     * @generated
     * @ordered
     */
    protected String checksum = CHECKSUM_EDEFAULT;

    /**
     * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimestamp()
     * @generated
     * @ordered
     */
    protected static final Date TIMESTAMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimestamp()
     * @generated
     * @ordered
     */
    protected Date timestamp = TIMESTAMP_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ARObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.AR_OBJECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChecksum(String newChecksum) {
        String oldChecksum = checksum;
        checksum = newChecksum;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.AR_OBJECT__CHECKSUM, oldChecksum, checksum));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimestamp(Date newTimestamp) {
        Date oldTimestamp = timestamp;
        timestamp = newTimestamp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.AR_OBJECT__TIMESTAMP, oldTimestamp, timestamp));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.AR_OBJECT__CHECKSUM:
                return getChecksum();
            case ContainerCatalogPackage.AR_OBJECT__TIMESTAMP:
                return getTimestamp();
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
            case ContainerCatalogPackage.AR_OBJECT__CHECKSUM:
                setChecksum((String)newValue);
                return;
            case ContainerCatalogPackage.AR_OBJECT__TIMESTAMP:
                setTimestamp((Date)newValue);
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
            case ContainerCatalogPackage.AR_OBJECT__CHECKSUM:
                setChecksum(CHECKSUM_EDEFAULT);
                return;
            case ContainerCatalogPackage.AR_OBJECT__TIMESTAMP:
                setTimestamp(TIMESTAMP_EDEFAULT);
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
            case ContainerCatalogPackage.AR_OBJECT__CHECKSUM:
                return CHECKSUM_EDEFAULT == null ? checksum != null : !CHECKSUM_EDEFAULT.equals(checksum);
            case ContainerCatalogPackage.AR_OBJECT__TIMESTAMP:
                return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
        result.append(" (checksum: ");
        result.append(checksum);
        result.append(", timestamp: ");
        result.append(timestamp);
        result.append(')');
        return result.toString();
    }

} //ARObjectImpl
