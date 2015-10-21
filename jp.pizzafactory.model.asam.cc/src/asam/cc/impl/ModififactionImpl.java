/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.Modififaction;
import asam.cc.MultiLanguageOverviewParagraph;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modififaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.ModififactionImpl#getChange <em>Change</em>}</li>
 *   <li>{@link asam.cc.impl.ModififactionImpl#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModififactionImpl extends ARObjectImpl implements Modififaction {
    /**
     * The cached value of the '{@link #getChange() <em>Change</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChange()
     * @generated
     * @ordered
     */
    protected MultiLanguageOverviewParagraph change;

    /**
     * The cached value of the '{@link #getReason() <em>Reason</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReason()
     * @generated
     * @ordered
     */
    protected MultiLanguageOverviewParagraph reason;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModififactionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.MODIFIFACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiLanguageOverviewParagraph getChange() {
        if (change != null && change.eIsProxy()) {
            InternalEObject oldChange = (InternalEObject)change;
            change = (MultiLanguageOverviewParagraph)eResolveProxy(oldChange);
            if (change != oldChange) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.MODIFIFACTION__CHANGE, oldChange, change));
            }
        }
        return change;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiLanguageOverviewParagraph basicGetChange() {
        return change;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChange(MultiLanguageOverviewParagraph newChange) {
        MultiLanguageOverviewParagraph oldChange = change;
        change = newChange;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.MODIFIFACTION__CHANGE, oldChange, change));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiLanguageOverviewParagraph getReason() {
        if (reason != null && reason.eIsProxy()) {
            InternalEObject oldReason = (InternalEObject)reason;
            reason = (MultiLanguageOverviewParagraph)eResolveProxy(oldReason);
            if (reason != oldReason) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.MODIFIFACTION__REASON, oldReason, reason));
            }
        }
        return reason;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiLanguageOverviewParagraph basicGetReason() {
        return reason;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReason(MultiLanguageOverviewParagraph newReason) {
        MultiLanguageOverviewParagraph oldReason = reason;
        reason = newReason;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.MODIFIFACTION__REASON, oldReason, reason));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.MODIFIFACTION__CHANGE:
                if (resolve) return getChange();
                return basicGetChange();
            case ContainerCatalogPackage.MODIFIFACTION__REASON:
                if (resolve) return getReason();
                return basicGetReason();
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
            case ContainerCatalogPackage.MODIFIFACTION__CHANGE:
                setChange((MultiLanguageOverviewParagraph)newValue);
                return;
            case ContainerCatalogPackage.MODIFIFACTION__REASON:
                setReason((MultiLanguageOverviewParagraph)newValue);
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
            case ContainerCatalogPackage.MODIFIFACTION__CHANGE:
                setChange((MultiLanguageOverviewParagraph)null);
                return;
            case ContainerCatalogPackage.MODIFIFACTION__REASON:
                setReason((MultiLanguageOverviewParagraph)null);
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
            case ContainerCatalogPackage.MODIFIFACTION__CHANGE:
                return change != null;
            case ContainerCatalogPackage.MODIFIFACTION__REASON:
                return reason != null;
        }
        return super.eIsSet(featureID);
    }

} //ModififactionImpl
