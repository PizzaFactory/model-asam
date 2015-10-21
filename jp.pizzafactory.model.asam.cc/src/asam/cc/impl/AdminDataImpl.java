/**
 */
package asam.cc.impl;

import asam.cc.AdminData;
import asam.cc.ContainerCatalogPackage;
import asam.cc.DocRevision;
import asam.cc.MultiLanguagePlainText;
import asam.cc.Sdg;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.AdminDataImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link asam.cc.impl.AdminDataImpl#getUsedLanguages <em>Used Languages</em>}</li>
 *   <li>{@link asam.cc.impl.AdminDataImpl#getDocRevision <em>Doc Revision</em>}</li>
 *   <li>{@link asam.cc.impl.AdminDataImpl#getSdg <em>Sdg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdminDataImpl extends ARObjectImpl implements AdminData {
    /**
     * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
    protected static final String LANGUAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
    protected String language = LANGUAGE_EDEFAULT;

    /**
     * The cached value of the '{@link #getUsedLanguages() <em>Used Languages</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsedLanguages()
     * @generated
     * @ordered
     */
    protected MultiLanguagePlainText usedLanguages;

    /**
     * The cached value of the '{@link #getDocRevision() <em>Doc Revision</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocRevision()
     * @generated
     * @ordered
     */
    protected EList<DocRevision> docRevision;

    /**
     * The cached value of the '{@link #getSdg() <em>Sdg</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSdg()
     * @generated
     * @ordered
     */
    protected EList<Sdg> sdg;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AdminDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.ADMIN_DATA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLanguage(String newLanguage) {
        String oldLanguage = language;
        language = newLanguage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.ADMIN_DATA__LANGUAGE, oldLanguage, language));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiLanguagePlainText getUsedLanguages() {
        if (usedLanguages != null && usedLanguages.eIsProxy()) {
            InternalEObject oldUsedLanguages = (InternalEObject)usedLanguages;
            usedLanguages = (MultiLanguagePlainText)eResolveProxy(oldUsedLanguages);
            if (usedLanguages != oldUsedLanguages) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerCatalogPackage.ADMIN_DATA__USED_LANGUAGES, oldUsedLanguages, usedLanguages));
            }
        }
        return usedLanguages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiLanguagePlainText basicGetUsedLanguages() {
        return usedLanguages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsedLanguages(MultiLanguagePlainText newUsedLanguages) {
        MultiLanguagePlainText oldUsedLanguages = usedLanguages;
        usedLanguages = newUsedLanguages;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.ADMIN_DATA__USED_LANGUAGES, oldUsedLanguages, usedLanguages));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DocRevision> getDocRevision() {
        if (docRevision == null) {
            docRevision = new EObjectResolvingEList<DocRevision>(DocRevision.class, this, ContainerCatalogPackage.ADMIN_DATA__DOC_REVISION);
        }
        return docRevision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Sdg> getSdg() {
        if (sdg == null) {
            sdg = new EObjectResolvingEList<Sdg>(Sdg.class, this, ContainerCatalogPackage.ADMIN_DATA__SDG);
        }
        return sdg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.ADMIN_DATA__LANGUAGE:
                return getLanguage();
            case ContainerCatalogPackage.ADMIN_DATA__USED_LANGUAGES:
                if (resolve) return getUsedLanguages();
                return basicGetUsedLanguages();
            case ContainerCatalogPackage.ADMIN_DATA__DOC_REVISION:
                return getDocRevision();
            case ContainerCatalogPackage.ADMIN_DATA__SDG:
                return getSdg();
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
            case ContainerCatalogPackage.ADMIN_DATA__LANGUAGE:
                setLanguage((String)newValue);
                return;
            case ContainerCatalogPackage.ADMIN_DATA__USED_LANGUAGES:
                setUsedLanguages((MultiLanguagePlainText)newValue);
                return;
            case ContainerCatalogPackage.ADMIN_DATA__DOC_REVISION:
                getDocRevision().clear();
                getDocRevision().addAll((Collection<? extends DocRevision>)newValue);
                return;
            case ContainerCatalogPackage.ADMIN_DATA__SDG:
                getSdg().clear();
                getSdg().addAll((Collection<? extends Sdg>)newValue);
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
            case ContainerCatalogPackage.ADMIN_DATA__LANGUAGE:
                setLanguage(LANGUAGE_EDEFAULT);
                return;
            case ContainerCatalogPackage.ADMIN_DATA__USED_LANGUAGES:
                setUsedLanguages((MultiLanguagePlainText)null);
                return;
            case ContainerCatalogPackage.ADMIN_DATA__DOC_REVISION:
                getDocRevision().clear();
                return;
            case ContainerCatalogPackage.ADMIN_DATA__SDG:
                getSdg().clear();
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
            case ContainerCatalogPackage.ADMIN_DATA__LANGUAGE:
                return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
            case ContainerCatalogPackage.ADMIN_DATA__USED_LANGUAGES:
                return usedLanguages != null;
            case ContainerCatalogPackage.ADMIN_DATA__DOC_REVISION:
                return docRevision != null && !docRevision.isEmpty();
            case ContainerCatalogPackage.ADMIN_DATA__SDG:
                return sdg != null && !sdg.isEmpty();
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
        result.append(" (language: ");
        result.append(language);
        result.append(')');
        return result.toString();
    }

} //AdminDataImpl
