/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.LOverviewParagraph;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LOverview Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.LOverviewParagraphImpl#getRawText <em>Raw Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LOverviewParagraphImpl extends ARObjectImpl implements LOverviewParagraph {
    /**
     * The default value of the '{@link #getRawText() <em>Raw Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRawText()
     * @generated
     * @ordered
     */
    protected static final String RAW_TEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRawText() <em>Raw Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRawText()
     * @generated
     * @ordered
     */
    protected String rawText = RAW_TEXT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LOverviewParagraphImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.LOVERVIEW_PARAGRAPH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRawText() {
        return rawText;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRawText(String newRawText) {
        String oldRawText = rawText;
        rawText = newRawText;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.LOVERVIEW_PARAGRAPH__RAW_TEXT, oldRawText, rawText));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.LOVERVIEW_PARAGRAPH__RAW_TEXT:
                return getRawText();
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
            case ContainerCatalogPackage.LOVERVIEW_PARAGRAPH__RAW_TEXT:
                setRawText((String)newValue);
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
            case ContainerCatalogPackage.LOVERVIEW_PARAGRAPH__RAW_TEXT:
                setRawText(RAW_TEXT_EDEFAULT);
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
            case ContainerCatalogPackage.LOVERVIEW_PARAGRAPH__RAW_TEXT:
                return RAW_TEXT_EDEFAULT == null ? rawText != null : !RAW_TEXT_EDEFAULT.equals(rawText);
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
        result.append(" (rawText: ");
        result.append(rawText);
        result.append(')');
        return result.toString();
    }

} //LOverviewParagraphImpl
