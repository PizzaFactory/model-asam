/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.Sdg;
import asam.cc.SdgCaption;
import asam.cc.SdgContents;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sdg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.SdgImpl#getGid <em>Gid</em>}</li>
 *   <li>{@link asam.cc.impl.SdgImpl#getSdgCaption <em>Sdg Caption</em>}</li>
 *   <li>{@link asam.cc.impl.SdgImpl#getSdgCaptionRef <em>Sdg Caption Ref</em>}</li>
 *   <li>{@link asam.cc.impl.SdgImpl#getSdgContents <em>Sdg Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SdgImpl extends ARObjectImpl implements Sdg {
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
     * The cached value of the '{@link #getSdgCaption() <em>Sdg Caption</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSdgCaption()
     * @generated
     * @ordered
     */
    protected SdgCaption sdgCaption;

    /**
     * The cached value of the '{@link #getSdgCaptionRef() <em>Sdg Caption Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSdgCaptionRef()
     * @generated
     * @ordered
     */
    protected SdgCaption sdgCaptionRef;

    /**
     * The cached value of the '{@link #getSdgContents() <em>Sdg Contents</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSdgContents()
     * @generated
     * @ordered
     */
    protected SdgContents sdgContents;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SdgImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.SDG;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDG__GID, oldGid, gid));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SdgCaption getSdgCaption() {
        if (sdgCaption != null && sdgCaption.eIsProxy()) {
            InternalEObject oldSdgCaption = (InternalEObject)sdgCaption;
            sdgCaption = (SdgCaption)eResolveProxy(oldSdgCaption);
            if (sdgCaption != oldSdgCaption) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.SDG__SDG_CAPTION, oldSdgCaption, sdgCaption));
            }
        }
        return sdgCaption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SdgCaption basicGetSdgCaption() {
        return sdgCaption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSdgCaption(SdgCaption newSdgCaption) {
        SdgCaption oldSdgCaption = sdgCaption;
        sdgCaption = newSdgCaption;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDG__SDG_CAPTION, oldSdgCaption, sdgCaption));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SdgCaption getSdgCaptionRef() {
        if (sdgCaptionRef != null && sdgCaptionRef.eIsProxy()) {
            InternalEObject oldSdgCaptionRef = (InternalEObject)sdgCaptionRef;
            sdgCaptionRef = (SdgCaption)eResolveProxy(oldSdgCaptionRef);
            if (sdgCaptionRef != oldSdgCaptionRef) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.SDG__SDG_CAPTION_REF, oldSdgCaptionRef, sdgCaptionRef));
            }
        }
        return sdgCaptionRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SdgCaption basicGetSdgCaptionRef() {
        return sdgCaptionRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSdgCaptionRef(SdgCaption newSdgCaptionRef) {
        SdgCaption oldSdgCaptionRef = sdgCaptionRef;
        sdgCaptionRef = newSdgCaptionRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDG__SDG_CAPTION_REF, oldSdgCaptionRef, sdgCaptionRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SdgContents getSdgContents() {
        if (sdgContents != null && sdgContents.eIsProxy()) {
            InternalEObject oldSdgContents = (InternalEObject)sdgContents;
            sdgContents = (SdgContents)eResolveProxy(oldSdgContents);
            if (sdgContents != oldSdgContents) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.SDG__SDG_CONTENTS, oldSdgContents, sdgContents));
            }
        }
        return sdgContents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SdgContents basicGetSdgContents() {
        return sdgContents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSdgContents(SdgContents newSdgContents) {
        SdgContents oldSdgContents = sdgContents;
        sdgContents = newSdgContents;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.SDG__SDG_CONTENTS, oldSdgContents, sdgContents));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.SDG__GID:
                return getGid();
            case ContainerCatalogPackage.SDG__SDG_CAPTION:
                if (resolve) return getSdgCaption();
                return basicGetSdgCaption();
            case ContainerCatalogPackage.SDG__SDG_CAPTION_REF:
                if (resolve) return getSdgCaptionRef();
                return basicGetSdgCaptionRef();
            case ContainerCatalogPackage.SDG__SDG_CONTENTS:
                if (resolve) return getSdgContents();
                return basicGetSdgContents();
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
            case ContainerCatalogPackage.SDG__GID:
                setGid((String)newValue);
                return;
            case ContainerCatalogPackage.SDG__SDG_CAPTION:
                setSdgCaption((SdgCaption)newValue);
                return;
            case ContainerCatalogPackage.SDG__SDG_CAPTION_REF:
                setSdgCaptionRef((SdgCaption)newValue);
                return;
            case ContainerCatalogPackage.SDG__SDG_CONTENTS:
                setSdgContents((SdgContents)newValue);
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
            case ContainerCatalogPackage.SDG__GID:
                setGid(GID_EDEFAULT);
                return;
            case ContainerCatalogPackage.SDG__SDG_CAPTION:
                setSdgCaption((SdgCaption)null);
                return;
            case ContainerCatalogPackage.SDG__SDG_CAPTION_REF:
                setSdgCaptionRef((SdgCaption)null);
                return;
            case ContainerCatalogPackage.SDG__SDG_CONTENTS:
                setSdgContents((SdgContents)null);
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
            case ContainerCatalogPackage.SDG__GID:
                return GID_EDEFAULT == null ? gid != null : !GID_EDEFAULT.equals(gid);
            case ContainerCatalogPackage.SDG__SDG_CAPTION:
                return sdgCaption != null;
            case ContainerCatalogPackage.SDG__SDG_CAPTION_REF:
                return sdgCaptionRef != null;
            case ContainerCatalogPackage.SDG__SDG_CONTENTS:
                return sdgContents != null;
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
        result.append(')');
        return result.toString();
    }

} //SdgImpl
