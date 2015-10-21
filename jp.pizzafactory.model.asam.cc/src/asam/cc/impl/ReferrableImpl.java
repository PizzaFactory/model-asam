/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.Identifier;
import asam.cc.Referrable;
import asam.cc.ShortNameFragment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referrable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.ReferrableImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link asam.cc.impl.ReferrableImpl#getShortNameFragment <em>Short Name Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReferrableImpl extends ARObjectImpl implements Referrable {
    /**
     * The cached value of the '{@link #getShortName() <em>Short Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortName()
     * @generated
     * @ordered
     */
    protected Identifier shortName;

    /**
     * The cached value of the '{@link #getShortNameFragment() <em>Short Name Fragment</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortNameFragment()
     * @generated
     * @ordered
     */
    protected EList<ShortNameFragment> shortNameFragment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferrableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.REFERRABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Identifier getShortName() {
        if (shortName != null && shortName.eIsProxy()) {
            InternalEObject oldShortName = (InternalEObject)shortName;
            shortName = (Identifier)eResolveProxy(oldShortName);
            if (shortName != oldShortName) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.REFERRABLE__SHORT_NAME, oldShortName, shortName));
            }
        }
        return shortName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Identifier basicGetShortName() {
        return shortName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setShortName(Identifier newShortName) {
        Identifier oldShortName = shortName;
        shortName = newShortName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.REFERRABLE__SHORT_NAME, oldShortName, shortName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ShortNameFragment> getShortNameFragment() {
        if (shortNameFragment == null) {
            shortNameFragment = new EObjectResolvingEList<ShortNameFragment>(ShortNameFragment.class, this, ContainerCatalogPackage.REFERRABLE__SHORT_NAME_FRAGMENT);
        }
        return shortNameFragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.REFERRABLE__SHORT_NAME:
                if (resolve) return getShortName();
                return basicGetShortName();
            case ContainerCatalogPackage.REFERRABLE__SHORT_NAME_FRAGMENT:
                return getShortNameFragment();
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
            case ContainerCatalogPackage.REFERRABLE__SHORT_NAME:
                setShortName((Identifier)newValue);
                return;
            case ContainerCatalogPackage.REFERRABLE__SHORT_NAME_FRAGMENT:
                getShortNameFragment().clear();
                getShortNameFragment().addAll((Collection<? extends ShortNameFragment>)newValue);
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
            case ContainerCatalogPackage.REFERRABLE__SHORT_NAME:
                setShortName((Identifier)null);
                return;
            case ContainerCatalogPackage.REFERRABLE__SHORT_NAME_FRAGMENT:
                getShortNameFragment().clear();
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
            case ContainerCatalogPackage.REFERRABLE__SHORT_NAME:
                return shortName != null;
            case ContainerCatalogPackage.REFERRABLE__SHORT_NAME_FRAGMENT:
                return shortNameFragment != null && !shortNameFragment.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ReferrableImpl
