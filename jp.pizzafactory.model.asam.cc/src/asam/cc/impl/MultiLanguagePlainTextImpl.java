/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.MultiLanguagePlainText;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Language Plain Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.MultiLanguagePlainTextImpl#getL10 <em>L10</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiLanguagePlainTextImpl extends ARObjectImpl implements MultiLanguagePlainText {
    /**
     * The default value of the '{@link #getL10() <em>L10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getL10()
     * @generated
     * @ordered
     */
    protected static final String L10_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getL10() <em>L10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getL10()
     * @generated
     * @ordered
     */
    protected String l10 = L10_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MultiLanguagePlainTextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.MULTI_LANGUAGE_PLAIN_TEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getL10() {
        return l10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setL10(String newL10) {
        String oldL10 = l10;
        l10 = newL10;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.MULTI_LANGUAGE_PLAIN_TEXT__L10, oldL10, l10));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.MULTI_LANGUAGE_PLAIN_TEXT__L10:
                return getL10();
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
            case ContainerCatalogPackage.MULTI_LANGUAGE_PLAIN_TEXT__L10:
                setL10((String)newValue);
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
            case ContainerCatalogPackage.MULTI_LANGUAGE_PLAIN_TEXT__L10:
                setL10(L10_EDEFAULT);
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
            case ContainerCatalogPackage.MULTI_LANGUAGE_PLAIN_TEXT__L10:
                return L10_EDEFAULT == null ? l10 != null : !L10_EDEFAULT.equals(l10);
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
        result.append(" (l10: ");
        result.append(l10);
        result.append(')');
        return result.toString();
    }

} //MultiLanguagePlainTextImpl
