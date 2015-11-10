/**
 */
package asam.cc.impl;

import asam.cc.*;
import java.net.URI;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerCatalogFactoryImpl extends EFactoryImpl implements ContainerCatalogFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ContainerCatalogFactory init() {
        try {
            ContainerCatalogFactory theContainerCatalogFactory = (ContainerCatalogFactory)EPackage.Registry.INSTANCE.getEFactory(ContainerCatalogPackage.eNS_URI);
            if (theContainerCatalogFactory != null) {
                return theContainerCatalogFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ContainerCatalogFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerCatalogFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ContainerCatalogPackage.CATALOG: return createCatalog();
            case ContainerCatalogPackage.ADMIN_DATA: return createAdminData();
            case ContainerCatalogPackage.SDG: return createSdg();
            case ContainerCatalogPackage.SDG_CAPTION: return createSdgCaption();
            case ContainerCatalogPackage.SD: return createSd();
            case ContainerCatalogPackage.SDF: return createSdf();
            case ContainerCatalogPackage.IDENTIFIER: return createIdentifier();
            case ContainerCatalogPackage.SHORT_NAME_FRAGMENT: return createShortNameFragment();
            case ContainerCatalogPackage.SDG_CONTENTS: return createSdgContents();
            case ContainerCatalogPackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
            case ContainerCatalogPackage.DOC_REVISION: return createDocRevision();
            case ContainerCatalogPackage.MODIFIFACTION: return createModififaction();
            case ContainerCatalogPackage.MULTI_LANGUAGE_OVERVIEW_PARAGRAPH: return createMultiLanguageOverviewParagraph();
            case ContainerCatalogPackage.LOVERVIEW_PARAGRAPH: return createLOverviewParagraph();
            case ContainerCatalogPackage.MULTI_LANGUAGE_PLAIN_TEXT: return createMultiLanguagePlainText();
            case ContainerCatalogPackage.ABLOCK: return createAblock();
            case ContainerCatalogPackage.AREF: return (EObject)createAref();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ContainerCatalogPackage.REVISION_LABEL_STRING:
                return createRevisionLabelStringFromString(eDataType, initialValue);
            case ContainerCatalogPackage.LPLAIN_TEXT:
                return createLPlainTextFromString(eDataType, initialValue);
            case ContainerCatalogPackage.EURI:
                return createEURIFromString(eDataType, initialValue);
            case ContainerCatalogPackage.NAME_TOKEN:
                return createNameTokenFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ContainerCatalogPackage.REVISION_LABEL_STRING:
                return convertRevisionLabelStringToString(eDataType, instanceValue);
            case ContainerCatalogPackage.LPLAIN_TEXT:
                return convertLPlainTextToString(eDataType, instanceValue);
            case ContainerCatalogPackage.EURI:
                return convertEURIToString(eDataType, instanceValue);
            case ContainerCatalogPackage.NAME_TOKEN:
                return convertNameTokenToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Catalog createCatalog() {
        CatalogImpl catalog = new CatalogImpl();
        return catalog;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdminData createAdminData() {
        AdminDataImpl adminData = new AdminDataImpl();
        return adminData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sdg createSdg() {
        SdgImpl sdg = new SdgImpl();
        return sdg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SdgCaption createSdgCaption() {
        SdgCaptionImpl sdgCaption = new SdgCaptionImpl();
        return sdgCaption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sd createSd() {
        SdImpl sd = new SdImpl();
        return sd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sdf createSdf() {
        SdfImpl sdf = new SdfImpl();
        return sdf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Identifier createIdentifier() {
        IdentifierImpl identifier = new IdentifierImpl();
        return identifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ShortNameFragment createShortNameFragment() {
        ShortNameFragmentImpl shortNameFragment = new ShortNameFragmentImpl();
        return shortNameFragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SdgContents createSdgContents() {
        SdgContentsImpl sdgContents = new SdgContentsImpl();
        return sdgContents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<String, String> createStringToStringMap() {
        StringToStringMapImpl stringToStringMap = new StringToStringMapImpl();
        return stringToStringMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocRevision createDocRevision() {
        DocRevisionImpl docRevision = new DocRevisionImpl();
        return docRevision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Modififaction createModififaction() {
        ModififactionImpl modififaction = new ModififactionImpl();
        return modififaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiLanguageOverviewParagraph createMultiLanguageOverviewParagraph() {
        MultiLanguageOverviewParagraphImpl multiLanguageOverviewParagraph = new MultiLanguageOverviewParagraphImpl();
        return multiLanguageOverviewParagraph;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LOverviewParagraph createLOverviewParagraph() {
        LOverviewParagraphImpl lOverviewParagraph = new LOverviewParagraphImpl();
        return lOverviewParagraph;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiLanguagePlainText createMultiLanguagePlainText() {
        MultiLanguagePlainTextImpl multiLanguagePlainText = new MultiLanguagePlainTextImpl();
        return multiLanguagePlainText;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Ablock createAblock() {
        AblockImpl ablock = new AblockImpl();
        return ablock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<String, String> createAref() {
        ArefImpl aref = new ArefImpl();
        return aref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createRevisionLabelStringFromString(EDataType eDataType, String initialValue) {
        return (String)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRevisionLabelStringToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createLPlainTextFromString(EDataType eDataType, String initialValue) {
        return (String)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLPlainTextToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public URI createEURIFromString(EDataType eDataType, String initialValue) {
        return (URI)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEURIToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createNameTokenFromString(EDataType eDataType, String initialValue) {
        return (String)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNameTokenToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerCatalogPackage getContainerCatalogPackage() {
        return (ContainerCatalogPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ContainerCatalogPackage getPackage() {
        return ContainerCatalogPackage.eINSTANCE;
    }

} //ContainerCatalogFactoryImpl
