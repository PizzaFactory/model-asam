/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.Sdf;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sdf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.SdfImpl#getGid <em>Gid</em>}</li>
 *   <li>{@link asam.cc.impl.SdfImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SdfImpl extends ARObjectImpl implements Sdf {
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
    protected static final double VALUE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected double value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SdfImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.SDF;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDF__GID, oldGid, gid));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(double newValue) {
        double oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDF__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.SDF__GID:
                return getGid();
            case ContainerCatalogPackage.SDF__VALUE:
                return getValue();
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
            case ContainerCatalogPackage.SDF__GID:
                setGid((String)newValue);
                return;
            case ContainerCatalogPackage.SDF__VALUE:
                setValue((Double)newValue);
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
            case ContainerCatalogPackage.SDF__GID:
                setGid(GID_EDEFAULT);
                return;
            case ContainerCatalogPackage.SDF__VALUE:
                setValue(VALUE_EDEFAULT);
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
            case ContainerCatalogPackage.SDF__GID:
                return GID_EDEFAULT == null ? gid != null : !GID_EDEFAULT.equals(gid);
            case ContainerCatalogPackage.SDF__VALUE:
                return value != VALUE_EDEFAULT;
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
        result.append(')');
        return result.toString();
    }

} //SdfImpl
