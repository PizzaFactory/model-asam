/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.Identifier;
import asam.cc.MultiLanguageOverviewParagraph;
import asam.cc.Referrable;
import asam.cc.SdgCaption;
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
 * An implementation of the model object '<em><b>Sdg Caption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.SdgCaptionImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link asam.cc.impl.SdgCaptionImpl#getShortNameFragment <em>Short Name Fragment</em>}</li>
 *   <li>{@link asam.cc.impl.SdgCaptionImpl#getDesc <em>Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SdgCaptionImpl extends ARObjectImpl implements SdgCaption {
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
     * The cached value of the '{@link #getDesc() <em>Desc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDesc()
     * @generated
     * @ordered
     */
    protected MultiLanguageOverviewParagraph desc;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SdgCaptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.SDG_CAPTION;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME, oldShortName, shortName));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME, oldShortName, shortName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ShortNameFragment> getShortNameFragment() {
        if (shortNameFragment == null) {
            shortNameFragment = new EObjectResolvingEList<ShortNameFragment>(ShortNameFragment.class, this, ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME_FRAGMENT);
        }
        return shortNameFragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiLanguageOverviewParagraph getDesc() {
        if (desc != null && desc.eIsProxy()) {
            InternalEObject oldDesc = (InternalEObject)desc;
            desc = (MultiLanguageOverviewParagraph)eResolveProxy(oldDesc);
            if (desc != oldDesc) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.SDG_CAPTION__DESC, oldDesc, desc));
            }
        }
        return desc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiLanguageOverviewParagraph basicGetDesc() {
        return desc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDesc(MultiLanguageOverviewParagraph newDesc) {
        MultiLanguageOverviewParagraph oldDesc = desc;
        desc = newDesc;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDG_CAPTION__DESC, oldDesc, desc));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME:
                if (resolve) return getShortName();
                return basicGetShortName();
            case ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME_FRAGMENT:
                return getShortNameFragment();
            case ContainerCatalogPackage.SDG_CAPTION__DESC:
                if (resolve) return getDesc();
                return basicGetDesc();
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
            case ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME:
                setShortName((Identifier)newValue);
                return;
            case ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME_FRAGMENT:
                getShortNameFragment().clear();
                getShortNameFragment().addAll((Collection<? extends ShortNameFragment>)newValue);
                return;
            case ContainerCatalogPackage.SDG_CAPTION__DESC:
                setDesc((MultiLanguageOverviewParagraph)newValue);
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
            case ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME:
                setShortName((Identifier)null);
                return;
            case ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME_FRAGMENT:
                getShortNameFragment().clear();
                return;
            case ContainerCatalogPackage.SDG_CAPTION__DESC:
                setDesc((MultiLanguageOverviewParagraph)null);
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
            case ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME:
                return shortName != null;
            case ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME_FRAGMENT:
                return shortNameFragment != null && !shortNameFragment.isEmpty();
            case ContainerCatalogPackage.SDG_CAPTION__DESC:
                return desc != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Referrable.class) {
            switch (derivedFeatureID) {
                case ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME: return ContainerCatalogPackage.REFERRABLE__SHORT_NAME;
                case ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME_FRAGMENT: return ContainerCatalogPackage.REFERRABLE__SHORT_NAME_FRAGMENT;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Referrable.class) {
            switch (baseFeatureID) {
                case ContainerCatalogPackage.REFERRABLE__SHORT_NAME: return ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME;
                case ContainerCatalogPackage.REFERRABLE__SHORT_NAME_FRAGMENT: return ContainerCatalogPackage.SDG_CAPTION__SHORT_NAME_FRAGMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //SdgCaptionImpl
