/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.LOverviewParagraph;
import asam.cc.MultiLanguageOverviewParagraph;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Language Overview Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.MultiLanguageOverviewParagraphImpl#getL2 <em>L2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiLanguageOverviewParagraphImpl extends ARObjectImpl implements MultiLanguageOverviewParagraph {
    /**
     * The cached value of the '{@link #getL2() <em>L2</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getL2()
     * @generated
     * @ordered
     */
    protected EList<LOverviewParagraph> l2;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MultiLanguageOverviewParagraphImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.MULTI_LANGUAGE_OVERVIEW_PARAGRAPH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LOverviewParagraph> getL2() {
        if (l2 == null) {
            l2 = new EObjectResolvingEList<LOverviewParagraph>(LOverviewParagraph.class, this, ContainerCatalogPackage.MULTI_LANGUAGE_OVERVIEW_PARAGRAPH__L2);
        }
        return l2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.MULTI_LANGUAGE_OVERVIEW_PARAGRAPH__L2:
                return getL2();
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
            case ContainerCatalogPackage.MULTI_LANGUAGE_OVERVIEW_PARAGRAPH__L2:
                getL2().clear();
                getL2().addAll((Collection<? extends LOverviewParagraph>)newValue);
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
            case ContainerCatalogPackage.MULTI_LANGUAGE_OVERVIEW_PARAGRAPH__L2:
                getL2().clear();
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
            case ContainerCatalogPackage.MULTI_LANGUAGE_OVERVIEW_PARAGRAPH__L2:
                return l2 != null && !l2.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //MultiLanguageOverviewParagraphImpl
