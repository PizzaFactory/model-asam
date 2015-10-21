/**
 */
package asam.cc.impl;

import asam.cc.ARObject;
import asam.cc.Ablock;
import asam.cc.AdminData;
import asam.cc.Catalog;
import asam.cc.ContainerCatalogFactory;
import asam.cc.ContainerCatalogPackage;
import asam.cc.DocRevision;
import asam.cc.Identifier;
import asam.cc.LOverviewParagraph;
import asam.cc.Modififaction;
import asam.cc.MultiLanguageOverviewParagraph;
import asam.cc.MultiLanguagePlainText;
import asam.cc.Referrable;
import asam.cc.Sd;
import asam.cc.Sdf;
import asam.cc.Sdg;
import asam.cc.SdgCaption;
import asam.cc.SdgContents;
import asam.cc.ShortNameFragment;
import java.net.URL;
import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerCatalogPackageImpl extends EPackageImpl implements ContainerCatalogPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass catalogEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass adminDataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sdgEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sdgCaptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sdEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sdfEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referrableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass shortNameFragmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sdgContentsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringToStringMapEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass docRevisionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modififactionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiLanguageOverviewParagraphEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lOverviewParagraphEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiLanguagePlainTextEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ablockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType revisionLabelStringEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType lPlainTextEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType euriEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType nameTokenEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see asam.cc.ContainerCatalogPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ContainerCatalogPackageImpl() {
        super(eNS_URI, ContainerCatalogFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ContainerCatalogPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ContainerCatalogPackage init() {
        if (isInited) return (ContainerCatalogPackage)EPackage.Registry.INSTANCE.getEPackage(ContainerCatalogPackage.eNS_URI);

        // Obtain or create and register package
        ContainerCatalogPackageImpl theContainerCatalogPackage = (ContainerCatalogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContainerCatalogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContainerCatalogPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theContainerCatalogPackage.createPackageContents();

        // Initialize created meta-data
        theContainerCatalogPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theContainerCatalogPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ContainerCatalogPackage.eNS_URI, theContainerCatalogPackage);
        return theContainerCatalogPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCatalog() {
        return catalogEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCatalog_ShortName() {
        return (EAttribute)catalogEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCatalog_ABlocks() {
        return (EReference)catalogEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCatalog_AdminData() {
        return (EReference)catalogEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAdminData() {
        return adminDataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAdminData_Language() {
        return (EAttribute)adminDataEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAdminData_UsedLanguages() {
        return (EReference)adminDataEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAdminData_DocRevision() {
        return (EReference)adminDataEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAdminData_Sdg() {
        return (EReference)adminDataEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSdg() {
        return sdgEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSdg_Gid() {
        return (EAttribute)sdgEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSdg_SdgCaption() {
        return (EReference)sdgEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSdg_SdgCaptionRef() {
        return (EReference)sdgEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSdg_SdgContents() {
        return (EReference)sdgEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSdgCaption() {
        return sdgCaptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSdgCaption_Desc() {
        return (EReference)sdgCaptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSd() {
        return sdEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSd_Gid() {
        return (EAttribute)sdEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSd_Value() {
        return (EAttribute)sdEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSd_XmlSpace() {
        return (EAttribute)sdEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSdf() {
        return sdfEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSdf_Gid() {
        return (EAttribute)sdfEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSdf_Value() {
        return (EAttribute)sdfEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferrable() {
        return referrableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferrable_ShortName() {
        return (EReference)referrableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferrable_ShortNameFragment() {
        return (EReference)referrableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentifier() {
        return identifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentifier_NamePattern() {
        return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getShortNameFragment() {
        return shortNameFragmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getShortNameFragment_Fragment() {
        return (EReference)shortNameFragmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShortNameFragment_Role() {
        return (EAttribute)shortNameFragmentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSdgContents() {
        return sdgContentsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSdgContents_Sd() {
        return (EReference)sdgContentsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSdgContents_Sdf() {
        return (EReference)sdgContentsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSdgContents_Sdg() {
        return (EReference)sdgContentsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSdgContents_Sdx() {
        return (EReference)sdgContentsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSdgContents_Sdxf() {
        return (EReference)sdgContentsEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getNameToken() {
        return nameTokenEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStringToStringMap() {
        return stringToStringMapEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringToStringMap_Key() {
        return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringToStringMap_Value() {
        return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocRevision() {
        return docRevisionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocRevision_Date() {
        return (EAttribute)docRevisionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocRevision_IssuedBy() {
        return (EAttribute)docRevisionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocRevision_Modification() {
        return (EReference)docRevisionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocRevision_RevisionLabel() {
        return (EAttribute)docRevisionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocRevision_RevisionLabelP1() {
        return (EAttribute)docRevisionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocRevision_RevisionLabelP2() {
        return (EAttribute)docRevisionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocRevision_State() {
        return (EAttribute)docRevisionEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getRevisionLabelString() {
        return revisionLabelStringEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModififaction() {
        return modififactionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModififaction_Change() {
        return (EReference)modififactionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModififaction_Reason() {
        return (EReference)modififactionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMultiLanguageOverviewParagraph() {
        return multiLanguageOverviewParagraphEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMultiLanguageOverviewParagraph_L2() {
        return (EReference)multiLanguageOverviewParagraphEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLOverviewParagraph() {
        return lOverviewParagraphEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLOverviewParagraph_RawText() {
        return (EAttribute)lOverviewParagraphEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMultiLanguagePlainText() {
        return multiLanguagePlainTextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiLanguagePlainText_L10() {
        return (EAttribute)multiLanguagePlainTextEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getLPlainText() {
        return lPlainTextEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getEURI() {
        return euriEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getARObject() {
        return arObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getARObject_Checksum() {
        return (EAttribute)arObjectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getARObject_Timestamp() {
        return (EAttribute)arObjectEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAblock() {
        return ablockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAblock_ShortName() {
        return (EAttribute)ablockEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAblock_Category() {
        return (EAttribute)ablockEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAblock_Arefs() {
        return (EReference)ablockEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAblock_Domain() {
        return (EAttribute)ablockEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAblock_Files() {
        return (EAttribute)ablockEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAblock_IntendedFileName() {
        return (EAttribute)ablockEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAref() {
        return arefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerCatalogFactory getContainerCatalogFactory() {
        return (ContainerCatalogFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        catalogEClass = createEClass(CATALOG);
        createEAttribute(catalogEClass, CATALOG__SHORT_NAME);
        createEReference(catalogEClass, CATALOG__ABLOCKS);
        createEReference(catalogEClass, CATALOG__ADMIN_DATA);

        adminDataEClass = createEClass(ADMIN_DATA);
        createEAttribute(adminDataEClass, ADMIN_DATA__LANGUAGE);
        createEReference(adminDataEClass, ADMIN_DATA__USED_LANGUAGES);
        createEReference(adminDataEClass, ADMIN_DATA__DOC_REVISION);
        createEReference(adminDataEClass, ADMIN_DATA__SDG);

        sdgEClass = createEClass(SDG);
        createEAttribute(sdgEClass, SDG__GID);
        createEReference(sdgEClass, SDG__SDG_CAPTION);
        createEReference(sdgEClass, SDG__SDG_CAPTION_REF);
        createEReference(sdgEClass, SDG__SDG_CONTENTS);

        sdgCaptionEClass = createEClass(SDG_CAPTION);
        createEReference(sdgCaptionEClass, SDG_CAPTION__DESC);

        sdEClass = createEClass(SD);
        createEAttribute(sdEClass, SD__GID);
        createEAttribute(sdEClass, SD__VALUE);
        createEAttribute(sdEClass, SD__XML_SPACE);

        sdfEClass = createEClass(SDF);
        createEAttribute(sdfEClass, SDF__GID);
        createEAttribute(sdfEClass, SDF__VALUE);

        referrableEClass = createEClass(REFERRABLE);
        createEReference(referrableEClass, REFERRABLE__SHORT_NAME);
        createEReference(referrableEClass, REFERRABLE__SHORT_NAME_FRAGMENT);

        identifierEClass = createEClass(IDENTIFIER);
        createEAttribute(identifierEClass, IDENTIFIER__NAME_PATTERN);

        shortNameFragmentEClass = createEClass(SHORT_NAME_FRAGMENT);
        createEReference(shortNameFragmentEClass, SHORT_NAME_FRAGMENT__FRAGMENT);
        createEAttribute(shortNameFragmentEClass, SHORT_NAME_FRAGMENT__ROLE);

        sdgContentsEClass = createEClass(SDG_CONTENTS);
        createEReference(sdgContentsEClass, SDG_CONTENTS__SD);
        createEReference(sdgContentsEClass, SDG_CONTENTS__SDF);
        createEReference(sdgContentsEClass, SDG_CONTENTS__SDG);
        createEReference(sdgContentsEClass, SDG_CONTENTS__SDX);
        createEReference(sdgContentsEClass, SDG_CONTENTS__SDXF);

        stringToStringMapEClass = createEClass(STRING_TO_STRING_MAP);
        createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__KEY);
        createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__VALUE);

        docRevisionEClass = createEClass(DOC_REVISION);
        createEAttribute(docRevisionEClass, DOC_REVISION__DATE);
        createEAttribute(docRevisionEClass, DOC_REVISION__ISSUED_BY);
        createEReference(docRevisionEClass, DOC_REVISION__MODIFICATION);
        createEAttribute(docRevisionEClass, DOC_REVISION__REVISION_LABEL);
        createEAttribute(docRevisionEClass, DOC_REVISION__REVISION_LABEL_P1);
        createEAttribute(docRevisionEClass, DOC_REVISION__REVISION_LABEL_P2);
        createEAttribute(docRevisionEClass, DOC_REVISION__STATE);

        modififactionEClass = createEClass(MODIFIFACTION);
        createEReference(modififactionEClass, MODIFIFACTION__CHANGE);
        createEReference(modififactionEClass, MODIFIFACTION__REASON);

        multiLanguageOverviewParagraphEClass = createEClass(MULTI_LANGUAGE_OVERVIEW_PARAGRAPH);
        createEReference(multiLanguageOverviewParagraphEClass, MULTI_LANGUAGE_OVERVIEW_PARAGRAPH__L2);

        lOverviewParagraphEClass = createEClass(LOVERVIEW_PARAGRAPH);
        createEAttribute(lOverviewParagraphEClass, LOVERVIEW_PARAGRAPH__RAW_TEXT);

        multiLanguagePlainTextEClass = createEClass(MULTI_LANGUAGE_PLAIN_TEXT);
        createEAttribute(multiLanguagePlainTextEClass, MULTI_LANGUAGE_PLAIN_TEXT__L10);

        arObjectEClass = createEClass(AR_OBJECT);
        createEAttribute(arObjectEClass, AR_OBJECT__CHECKSUM);
        createEAttribute(arObjectEClass, AR_OBJECT__TIMESTAMP);

        ablockEClass = createEClass(ABLOCK);
        createEAttribute(ablockEClass, ABLOCK__SHORT_NAME);
        createEAttribute(ablockEClass, ABLOCK__CATEGORY);
        createEReference(ablockEClass, ABLOCK__AREFS);
        createEAttribute(ablockEClass, ABLOCK__DOMAIN);
        createEAttribute(ablockEClass, ABLOCK__FILES);
        createEAttribute(ablockEClass, ABLOCK__INTENDED_FILE_NAME);

        arefEClass = createEClass(AREF);

        // Create data types
        revisionLabelStringEDataType = createEDataType(REVISION_LABEL_STRING);
        lPlainTextEDataType = createEDataType(LPLAIN_TEXT);
        euriEDataType = createEDataType(EURI);
        nameTokenEDataType = createEDataType(NAME_TOKEN);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        adminDataEClass.getESuperTypes().add(this.getARObject());
        sdgEClass.getESuperTypes().add(this.getARObject());
        sdgCaptionEClass.getESuperTypes().add(this.getARObject());
        sdgCaptionEClass.getESuperTypes().add(this.getReferrable());
        sdEClass.getESuperTypes().add(this.getARObject());
        sdfEClass.getESuperTypes().add(this.getARObject());
        referrableEClass.getESuperTypes().add(this.getARObject());
        identifierEClass.getESuperTypes().add(this.getARObject());
        shortNameFragmentEClass.getESuperTypes().add(this.getARObject());
        sdgContentsEClass.getESuperTypes().add(this.getARObject());
        docRevisionEClass.getESuperTypes().add(this.getARObject());
        modififactionEClass.getESuperTypes().add(this.getARObject());
        multiLanguageOverviewParagraphEClass.getESuperTypes().add(this.getARObject());
        lOverviewParagraphEClass.getESuperTypes().add(this.getARObject());
        multiLanguagePlainTextEClass.getESuperTypes().add(this.getARObject());
        arefEClass.getESuperTypes().add(this.getStringToStringMap());

        // Initialize classes, features, and operations; add parameters
        initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCatalog_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCatalog_ABlocks(), this.getAblock(), null, "aBlocks", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCatalog_AdminData(), this.getAdminData(), null, "adminData", null, 0, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(adminDataEClass, AdminData.class, "AdminData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAdminData_Language(), ecorePackage.getEString(), "language", null, 0, 1, AdminData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAdminData_UsedLanguages(), this.getMultiLanguagePlainText(), null, "usedLanguages", null, 0, 1, AdminData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAdminData_DocRevision(), this.getDocRevision(), null, "docRevision", null, 0, -1, AdminData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAdminData_Sdg(), this.getSdg(), null, "sdg", null, 0, -1, AdminData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sdgEClass, Sdg.class, "Sdg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSdg_Gid(), this.getNameToken(), "gid", null, 0, 1, Sdg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSdg_SdgCaption(), this.getSdgCaption(), null, "sdgCaption", null, 0, 1, Sdg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSdg_SdgCaptionRef(), this.getSdgCaption(), null, "sdgCaptionRef", null, 0, 1, Sdg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSdg_SdgContents(), this.getSdgContents(), null, "sdgContents", null, 0, 1, Sdg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sdgCaptionEClass, SdgCaption.class, "SdgCaption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSdgCaption_Desc(), this.getMultiLanguageOverviewParagraph(), null, "desc", null, 0, 1, SdgCaption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sdEClass, Sd.class, "Sd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSd_Gid(), this.getNameToken(), "gid", null, 0, 1, Sd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSd_Value(), ecorePackage.getEString(), "value", null, 1, 1, Sd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSd_XmlSpace(), ecorePackage.getEString(), "xmlSpace", null, 0, 1, Sd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sdfEClass, Sdf.class, "Sdf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSdf_Gid(), this.getNameToken(), "gid", null, 0, 1, Sdf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSdf_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Sdf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referrableEClass, Referrable.class, "Referrable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReferrable_ShortName(), this.getIdentifier(), null, "shortName", null, 1, 1, Referrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getReferrable_ShortNameFragment(), this.getShortNameFragment(), null, "shortNameFragment", null, 0, -1, Referrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIdentifier_NamePattern(), ecorePackage.getEString(), "namePattern", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(shortNameFragmentEClass, ShortNameFragment.class, "ShortNameFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getShortNameFragment_Fragment(), this.getIdentifier(), null, "fragment", null, 1, 1, ShortNameFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShortNameFragment_Role(), ecorePackage.getEString(), "role", null, 1, 1, ShortNameFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sdgContentsEClass, SdgContents.class, "SdgContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSdgContents_Sd(), this.getSd(), null, "sd", null, 0, 1, SdgContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSdgContents_Sdf(), this.getSdf(), null, "sdf", null, 0, 1, SdgContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSdgContents_Sdg(), this.getSdg(), null, "sdg", null, 0, 1, SdgContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSdgContents_Sdx(), this.getReferrable(), null, "sdx", null, 0, 1, SdgContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSdgContents_Sdxf(), this.getReferrable(), null, "sdxf", null, 0, 1, SdgContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stringToStringMapEClass, Map.Entry.class, "StringToStringMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStringToStringMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStringToStringMap_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(docRevisionEClass, DocRevision.class, "DocRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocRevision_Date(), ecorePackage.getEDate(), "date", null, 1, 1, DocRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocRevision_IssuedBy(), ecorePackage.getEString(), "issuedBy", null, 0, 1, DocRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocRevision_Modification(), this.getModififaction(), null, "modification", null, 0, -1, DocRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocRevision_RevisionLabel(), this.getRevisionLabelString(), "revisionLabel", null, 0, 1, DocRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocRevision_RevisionLabelP1(), this.getRevisionLabelString(), "revisionLabelP1", null, 0, 1, DocRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocRevision_RevisionLabelP2(), this.getRevisionLabelString(), "revisionLabelP2", null, 0, 1, DocRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocRevision_State(), this.getNameToken(), "state", null, 0, 1, DocRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modififactionEClass, Modififaction.class, "Modififaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModififaction_Change(), this.getMultiLanguageOverviewParagraph(), null, "change", null, 1, 1, Modififaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModififaction_Reason(), this.getMultiLanguageOverviewParagraph(), null, "reason", null, 0, 1, Modififaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(multiLanguageOverviewParagraphEClass, MultiLanguageOverviewParagraph.class, "MultiLanguageOverviewParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMultiLanguageOverviewParagraph_L2(), this.getLOverviewParagraph(), null, "l2", null, 1, -1, MultiLanguageOverviewParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(lOverviewParagraphEClass, LOverviewParagraph.class, "LOverviewParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLOverviewParagraph_RawText(), ecorePackage.getEString(), "rawText", null, 0, 1, LOverviewParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(multiLanguagePlainTextEClass, MultiLanguagePlainText.class, "MultiLanguagePlainText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMultiLanguagePlainText_L10(), this.getLPlainText(), "l10", null, 0, 1, MultiLanguagePlainText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(arObjectEClass, ARObject.class, "ARObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getARObject_Checksum(), ecorePackage.getEString(), "checksum", null, 0, 1, ARObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getARObject_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, ARObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ablockEClass, Ablock.class, "Ablock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAblock_ShortName(), ecorePackage.getEString(), "shortName", null, 1, 1, Ablock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAblock_Category(), ecorePackage.getEString(), "category", null, 1, 1, Ablock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAblock_Arefs(), this.getAref(), null, "arefs", null, 0, 1, Ablock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAblock_Domain(), ecorePackage.getEString(), "domain", null, 1, 1, Ablock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAblock_Files(), ecorePackage.getEString(), "files", null, 1, -1, Ablock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAblock_IntendedFileName(), this.getEURI(), "intendedFileName", null, 0, 1, Ablock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(arefEClass, Map.Entry.class, "Aref", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

        // Initialize data types
        initEDataType(revisionLabelStringEDataType, String.class, "RevisionLabelString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(lPlainTextEDataType, String.class, "LPlainText", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(euriEDataType, URL.class, "EURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(nameTokenEDataType, String.class, "NameToken", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //ContainerCatalogPackageImpl
