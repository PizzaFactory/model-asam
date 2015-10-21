/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.Referrable;
import asam.cc.Sd;
import asam.cc.Sdf;
import asam.cc.Sdg;
import asam.cc.SdgContents;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sdg Contents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.SdgContentsImpl#getSd <em>Sd</em>}</li>
 *   <li>{@link asam.cc.impl.SdgContentsImpl#getSdf <em>Sdf</em>}</li>
 *   <li>{@link asam.cc.impl.SdgContentsImpl#getSdg <em>Sdg</em>}</li>
 *   <li>{@link asam.cc.impl.SdgContentsImpl#getSdx <em>Sdx</em>}</li>
 *   <li>{@link asam.cc.impl.SdgContentsImpl#getSdxf <em>Sdxf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SdgContentsImpl extends ARObjectImpl implements SdgContents {
    /**
     * The cached value of the '{@link #getSd() <em>Sd</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSd()
     * @generated
     * @ordered
     */
    protected Sd sd;

    /**
     * The cached value of the '{@link #getSdf() <em>Sdf</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSdf()
     * @generated
     * @ordered
     */
    protected Sdf sdf;

    /**
     * The cached value of the '{@link #getSdg() <em>Sdg</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSdg()
     * @generated
     * @ordered
     */
    protected Sdg sdg;

    /**
     * The cached value of the '{@link #getSdx() <em>Sdx</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSdx()
     * @generated
     * @ordered
     */
    protected Referrable sdx;

    /**
     * The cached value of the '{@link #getSdxf() <em>Sdxf</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSdxf()
     * @generated
     * @ordered
     */
    protected Referrable sdxf;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SdgContentsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.SDG_CONTENTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sd getSd() {
        if (sd != null && sd.eIsProxy()) {
            InternalEObject oldSd = (InternalEObject)sd;
            sd = (Sd)eResolveProxy(oldSd);
            if (sd != oldSd) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.SDG_CONTENTS__SD, oldSd, sd));
            }
        }
        return sd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sd basicGetSd() {
        return sd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSd(Sd newSd) {
        Sd oldSd = sd;
        sd = newSd;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDG_CONTENTS__SD, oldSd, sd));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sdf getSdf() {
        if (sdf != null && sdf.eIsProxy()) {
            InternalEObject oldSdf = (InternalEObject)sdf;
            sdf = (Sdf)eResolveProxy(oldSdf);
            if (sdf != oldSdf) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.SDG_CONTENTS__SDF, oldSdf, sdf));
            }
        }
        return sdf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sdf basicGetSdf() {
        return sdf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSdf(Sdf newSdf) {
        Sdf oldSdf = sdf;
        sdf = newSdf;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDG_CONTENTS__SDF, oldSdf, sdf));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sdg getSdg() {
        if (sdg != null && sdg.eIsProxy()) {
            InternalEObject oldSdg = (InternalEObject)sdg;
            sdg = (Sdg)eResolveProxy(oldSdg);
            if (sdg != oldSdg) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.SDG_CONTENTS__SDG, oldSdg, sdg));
            }
        }
        return sdg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sdg basicGetSdg() {
        return sdg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSdg(Sdg newSdg) {
        Sdg oldSdg = sdg;
        sdg = newSdg;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDG_CONTENTS__SDG, oldSdg, sdg));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Referrable getSdx() {
        if (sdx != null && sdx.eIsProxy()) {
            InternalEObject oldSdx = (InternalEObject)sdx;
            sdx = (Referrable)eResolveProxy(oldSdx);
            if (sdx != oldSdx) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.SDG_CONTENTS__SDX, oldSdx, sdx));
            }
        }
        return sdx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Referrable basicGetSdx() {
        return sdx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSdx(Referrable newSdx) {
        Referrable oldSdx = sdx;
        sdx = newSdx;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDG_CONTENTS__SDX, oldSdx, sdx));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Referrable getSdxf() {
        if (sdxf != null && sdxf.eIsProxy()) {
            InternalEObject oldSdxf = (InternalEObject)sdxf;
            sdxf = (Referrable)eResolveProxy(oldSdxf);
            if (sdxf != oldSdxf) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.SDG_CONTENTS__SDXF, oldSdxf, sdxf));
            }
        }
        return sdxf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Referrable basicGetSdxf() {
        return sdxf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSdxf(Referrable newSdxf) {
        Referrable oldSdxf = sdxf;
        sdxf = newSdxf;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDG_CONTENTS__SDXF, oldSdxf, sdxf));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.SDG_CONTENTS__SD:
                if (resolve) return getSd();
                return basicGetSd();
            case ContainerCatalogPackage.SDG_CONTENTS__SDF:
                if (resolve) return getSdf();
                return basicGetSdf();
            case ContainerCatalogPackage.SDG_CONTENTS__SDG:
                if (resolve) return getSdg();
                return basicGetSdg();
            case ContainerCatalogPackage.SDG_CONTENTS__SDX:
                if (resolve) return getSdx();
                return basicGetSdx();
            case ContainerCatalogPackage.SDG_CONTENTS__SDXF:
                if (resolve) return getSdxf();
                return basicGetSdxf();
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
            case ContainerCatalogPackage.SDG_CONTENTS__SD:
                setSd((Sd)newValue);
                return;
            case ContainerCatalogPackage.SDG_CONTENTS__SDF:
                setSdf((Sdf)newValue);
                return;
            case ContainerCatalogPackage.SDG_CONTENTS__SDG:
                setSdg((Sdg)newValue);
                return;
            case ContainerCatalogPackage.SDG_CONTENTS__SDX:
                setSdx((Referrable)newValue);
                return;
            case ContainerCatalogPackage.SDG_CONTENTS__SDXF:
                setSdxf((Referrable)newValue);
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
            case ContainerCatalogPackage.SDG_CONTENTS__SD:
                setSd((Sd)null);
                return;
            case ContainerCatalogPackage.SDG_CONTENTS__SDF:
                setSdf((Sdf)null);
                return;
            case ContainerCatalogPackage.SDG_CONTENTS__SDG:
                setSdg((Sdg)null);
                return;
            case ContainerCatalogPackage.SDG_CONTENTS__SDX:
                setSdx((Referrable)null);
                return;
            case ContainerCatalogPackage.SDG_CONTENTS__SDXF:
                setSdxf((Referrable)null);
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
            case ContainerCatalogPackage.SDG_CONTENTS__SD:
                return sd != null;
            case ContainerCatalogPackage.SDG_CONTENTS__SDF:
                return sdf != null;
            case ContainerCatalogPackage.SDG_CONTENTS__SDG:
                return sdg != null;
            case ContainerCatalogPackage.SDG_CONTENTS__SDX:
                return sdx != null;
            case ContainerCatalogPackage.SDG_CONTENTS__SDXF:
                return sdxf != null;
        }
        return super.eIsSet(featureID);
    }

} //SdgContentsImpl
