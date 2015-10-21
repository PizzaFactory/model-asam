/**
 */
package asam.cc.util;

import asam.cc.*;
import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see asam.cc.ContainerCatalogPackage
 * @generated
 */
public class ContainerCatalogAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ContainerCatalogPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerCatalogAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ContainerCatalogPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContainerCatalogSwitch<Adapter> modelSwitch =
        new ContainerCatalogSwitch<Adapter>() {
            @Override
            public Adapter caseCatalog(Catalog object) {
                return createCatalogAdapter();
            }
            @Override
            public Adapter caseAdminData(AdminData object) {
                return createAdminDataAdapter();
            }
            @Override
            public Adapter caseSdg(Sdg object) {
                return createSdgAdapter();
            }
            @Override
            public Adapter caseSdgCaption(SdgCaption object) {
                return createSdgCaptionAdapter();
            }
            @Override
            public Adapter caseSd(Sd object) {
                return createSdAdapter();
            }
            @Override
            public Adapter caseSdf(Sdf object) {
                return createSdfAdapter();
            }
            @Override
            public Adapter caseReferrable(Referrable object) {
                return createReferrableAdapter();
            }
            @Override
            public Adapter caseIdentifier(Identifier object) {
                return createIdentifierAdapter();
            }
            @Override
            public Adapter caseShortNameFragment(ShortNameFragment object) {
                return createShortNameFragmentAdapter();
            }
            @Override
            public Adapter caseSdgContents(SdgContents object) {
                return createSdgContentsAdapter();
            }
            @Override
            public Adapter caseStringToStringMap(Map.Entry<String, String> object) {
                return createStringToStringMapAdapter();
            }
            @Override
            public Adapter caseDocRevision(DocRevision object) {
                return createDocRevisionAdapter();
            }
            @Override
            public Adapter caseModififaction(Modififaction object) {
                return createModififactionAdapter();
            }
            @Override
            public Adapter caseMultiLanguageOverviewParagraph(MultiLanguageOverviewParagraph object) {
                return createMultiLanguageOverviewParagraphAdapter();
            }
            @Override
            public Adapter caseLOverviewParagraph(LOverviewParagraph object) {
                return createLOverviewParagraphAdapter();
            }
            @Override
            public Adapter caseMultiLanguagePlainText(MultiLanguagePlainText object) {
                return createMultiLanguagePlainTextAdapter();
            }
            @Override
            public Adapter caseARObject(ARObject object) {
                return createARObjectAdapter();
            }
            @Override
            public Adapter caseAblock(Ablock object) {
                return createAblockAdapter();
            }
            @Override
            public Adapter caseAref(Map.Entry<String, String> object) {
                return createArefAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link asam.cc.Catalog <em>Catalog</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.Catalog
     * @generated
     */
    public Adapter createCatalogAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.AdminData <em>Admin Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.AdminData
     * @generated
     */
    public Adapter createAdminDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.Sdg <em>Sdg</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.Sdg
     * @generated
     */
    public Adapter createSdgAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.SdgCaption <em>Sdg Caption</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.SdgCaption
     * @generated
     */
    public Adapter createSdgCaptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.Sd <em>Sd</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.Sd
     * @generated
     */
    public Adapter createSdAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.Sdf <em>Sdf</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.Sdf
     * @generated
     */
    public Adapter createSdfAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.Referrable <em>Referrable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.Referrable
     * @generated
     */
    public Adapter createReferrableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.Identifier <em>Identifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.ShortNameFragment <em>Short Name Fragment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.ShortNameFragment
     * @generated
     */
    public Adapter createShortNameFragmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.SdgContents <em>Sdg Contents</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.SdgContents
     * @generated
     */
    public Adapter createSdgContentsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see java.util.Map.Entry
     * @generated
     */
    public Adapter createStringToStringMapAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.DocRevision <em>Doc Revision</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.DocRevision
     * @generated
     */
    public Adapter createDocRevisionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.Modififaction <em>Modififaction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.Modififaction
     * @generated
     */
    public Adapter createModififactionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.MultiLanguageOverviewParagraph <em>Multi Language Overview Paragraph</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.MultiLanguageOverviewParagraph
     * @generated
     */
    public Adapter createMultiLanguageOverviewParagraphAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.LOverviewParagraph <em>LOverview Paragraph</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.LOverviewParagraph
     * @generated
     */
    public Adapter createLOverviewParagraphAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.MultiLanguagePlainText <em>Multi Language Plain Text</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.MultiLanguagePlainText
     * @generated
     */
    public Adapter createMultiLanguagePlainTextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.ARObject <em>AR Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.ARObject
     * @generated
     */
    public Adapter createARObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link asam.cc.Ablock <em>Ablock</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see asam.cc.Ablock
     * @generated
     */
    public Adapter createAblockAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Aref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see java.util.Map.Entry
     * @generated
     */
    public Adapter createArefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ContainerCatalogAdapterFactory
