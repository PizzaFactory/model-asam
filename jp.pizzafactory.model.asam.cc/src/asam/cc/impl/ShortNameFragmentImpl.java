/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.Identifier;
import asam.cc.ShortNameFragment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Short Name Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.ShortNameFragmentImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link asam.cc.impl.ShortNameFragmentImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShortNameFragmentImpl extends ARObjectImpl implements ShortNameFragment {
    /**
     * The cached value of the '{@link #getFragment() <em>Fragment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFragment()
     * @generated
     * @ordered
     */
    protected Identifier fragment;

    /**
     * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRole()
     * @generated
     * @ordered
     */
    protected static final String ROLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRole()
     * @generated
     * @ordered
     */
    protected String role = ROLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShortNameFragmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.SHORT_NAME_FRAGMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Identifier getFragment() {
        if (fragment != null && fragment.eIsProxy()) {
            InternalEObject oldFragment = (InternalEObject)fragment;
            fragment = (Identifier)eResolveProxy(oldFragment);
            if (fragment != oldFragment) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.SHORT_NAME_FRAGMENT__FRAGMENT, oldFragment, fragment));
            }
        }
        return fragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Identifier basicGetFragment() {
        return fragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFragment(Identifier newFragment) {
        Identifier oldFragment = fragment;
        fragment = newFragment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SHORT_NAME_FRAGMENT__FRAGMENT, oldFragment, fragment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRole() {
        return role;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRole(String newRole) {
        String oldRole = role;
        role = newRole;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SHORT_NAME_FRAGMENT__ROLE, oldRole, role));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.SHORT_NAME_FRAGMENT__FRAGMENT:
                if (resolve) return getFragment();
                return basicGetFragment();
            case ContainerCatalogPackage.SHORT_NAME_FRAGMENT__ROLE:
                return getRole();
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
            case ContainerCatalogPackage.SHORT_NAME_FRAGMENT__FRAGMENT:
                setFragment((Identifier)newValue);
                return;
            case ContainerCatalogPackage.SHORT_NAME_FRAGMENT__ROLE:
                setRole((String)newValue);
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
            case ContainerCatalogPackage.SHORT_NAME_FRAGMENT__FRAGMENT:
                setFragment((Identifier)null);
                return;
            case ContainerCatalogPackage.SHORT_NAME_FRAGMENT__ROLE:
                setRole(ROLE_EDEFAULT);
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
            case ContainerCatalogPackage.SHORT_NAME_FRAGMENT__FRAGMENT:
                return fragment != null;
            case ContainerCatalogPackage.SHORT_NAME_FRAGMENT__ROLE:
                return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
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
        result.append(" (role: ");
        result.append(role);
        result.append(')');
        return result.toString();
    }

} //ShortNameFragmentImpl
