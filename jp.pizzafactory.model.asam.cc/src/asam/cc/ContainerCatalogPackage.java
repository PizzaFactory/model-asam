/**
 */
package asam.cc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see asam.cc.ContainerCatalogFactory
 * @model kind="package"
 * @generated
 */
public interface ContainerCatalogPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cc";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://pizzafactory.jp/asam/cc";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "jp.pizzafactory.asam.cc";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ContainerCatalogPackage eINSTANCE = asam.cc.impl.ContainerCatalogPackageImpl.init();

    /**
     * The meta object id for the '{@link asam.cc.impl.CatalogImpl <em>Catalog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.CatalogImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getCatalog()
     * @generated
     */
    int CATALOG = 0;

    /**
     * The feature id for the '<em><b>Short Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG__SHORT_NAME = 0;

    /**
     * The feature id for the '<em><b>ABlocks</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG__ABLOCKS = 1;

    /**
     * The feature id for the '<em><b>Admin Data</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG__ADMIN_DATA = 2;

    /**
     * The number of structural features of the '<em>Catalog</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Catalog</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.ARObjectImpl <em>AR Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.ARObjectImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getARObject()
     * @generated
     */
    int AR_OBJECT = 16;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AR_OBJECT__CHECKSUM = 0;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AR_OBJECT__TIMESTAMP = 1;

    /**
     * The number of structural features of the '<em>AR Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AR_OBJECT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>AR Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AR_OBJECT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.AdminDataImpl <em>Admin Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.AdminDataImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getAdminData()
     * @generated
     */
    int ADMIN_DATA = 1;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN_DATA__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN_DATA__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN_DATA__LANGUAGE = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Used Languages</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN_DATA__USED_LANGUAGES = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Doc Revision</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN_DATA__DOC_REVISION = AR_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sdg</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN_DATA__SDG = AR_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Admin Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN_DATA_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Admin Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN_DATA_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.SdgImpl <em>Sdg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.SdgImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getSdg()
     * @generated
     */
    int SDG = 2;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Gid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG__GID = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sdg Caption</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG__SDG_CAPTION = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sdg Caption Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG__SDG_CAPTION_REF = AR_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sdg Contents</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG__SDG_CONTENTS = AR_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Sdg</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Sdg</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.SdgCaptionImpl <em>Sdg Caption</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.SdgCaptionImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getSdgCaption()
     * @generated
     */
    int SDG_CAPTION = 3;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CAPTION__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CAPTION__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Short Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CAPTION__SHORT_NAME = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Short Name Fragment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CAPTION__SHORT_NAME_FRAGMENT = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Desc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CAPTION__DESC = AR_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Sdg Caption</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CAPTION_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Sdg Caption</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CAPTION_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.SdImpl <em>Sd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.SdImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getSd()
     * @generated
     */
    int SD = 4;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SD__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SD__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Gid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SD__GID = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SD__VALUE = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Xml Space</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SD__XML_SPACE = AR_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Sd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SD_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Sd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SD_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.SdfImpl <em>Sdf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.SdfImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getSdf()
     * @generated
     */
    int SDF = 5;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDF__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDF__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Gid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDF__GID = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDF__VALUE = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Sdf</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDF_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Sdf</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDF_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.ReferrableImpl <em>Referrable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.ReferrableImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getReferrable()
     * @generated
     */
    int REFERRABLE = 6;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRABLE__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRABLE__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Short Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRABLE__SHORT_NAME = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Short Name Fragment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRABLE__SHORT_NAME_FRAGMENT = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Referrable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRABLE_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Referrable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRABLE_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.IdentifierImpl <em>Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.IdentifierImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getIdentifier()
     * @generated
     */
    int IDENTIFIER = 7;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Name Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER__NAME_PATTERN = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Identifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Identifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.ShortNameFragmentImpl <em>Short Name Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.ShortNameFragmentImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getShortNameFragment()
     * @generated
     */
    int SHORT_NAME_FRAGMENT = 8;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT_NAME_FRAGMENT__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT_NAME_FRAGMENT__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Fragment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT_NAME_FRAGMENT__FRAGMENT = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT_NAME_FRAGMENT__ROLE = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Short Name Fragment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT_NAME_FRAGMENT_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Short Name Fragment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT_NAME_FRAGMENT_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.SdgContentsImpl <em>Sdg Contents</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.SdgContentsImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getSdgContents()
     * @generated
     */
    int SDG_CONTENTS = 9;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CONTENTS__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CONTENTS__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Sd</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CONTENTS__SD = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sdf</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CONTENTS__SDF = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sdg</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CONTENTS__SDG = AR_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sdx</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CONTENTS__SDX = AR_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Sdxf</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CONTENTS__SDXF = AR_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Sdg Contents</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CONTENTS_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Sdg Contents</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDG_CONTENTS_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Name Token</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getNameToken()
     * @generated
     */
    int NAME_TOKEN = 22;

    /**
     * The meta object id for the '{@link asam.cc.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.StringToStringMapImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getStringToStringMap()
     * @generated
     */
    int STRING_TO_STRING_MAP = 10;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TO_STRING_MAP__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TO_STRING_MAP__VALUE = 1;

    /**
     * The number of structural features of the '<em>String To String Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>String To String Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TO_STRING_MAP_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.DocRevisionImpl <em>Doc Revision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.DocRevisionImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getDocRevision()
     * @generated
     */
    int DOC_REVISION = 11;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_REVISION__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_REVISION__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_REVISION__DATE = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Issued By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_REVISION__ISSUED_BY = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Modification</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_REVISION__MODIFICATION = AR_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Revision Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_REVISION__REVISION_LABEL = AR_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Revision Label P1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_REVISION__REVISION_LABEL_P1 = AR_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Revision Label P2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_REVISION__REVISION_LABEL_P2 = AR_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_REVISION__STATE = AR_OBJECT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Doc Revision</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_REVISION_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Doc Revision</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_REVISION_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Revision Label String</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getRevisionLabelString()
     * @generated
     */
    int REVISION_LABEL_STRING = 19;

    /**
     * The meta object id for the '{@link asam.cc.impl.ModififactionImpl <em>Modififaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.ModififactionImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getModififaction()
     * @generated
     */
    int MODIFIFACTION = 12;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFIFACTION__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFIFACTION__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Change</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFIFACTION__CHANGE = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Reason</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFIFACTION__REASON = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Modififaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFIFACTION_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Modififaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFIFACTION_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.MultiLanguageOverviewParagraphImpl <em>Multi Language Overview Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.MultiLanguageOverviewParagraphImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getMultiLanguageOverviewParagraph()
     * @generated
     */
    int MULTI_LANGUAGE_OVERVIEW_PARAGRAPH = 13;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_LANGUAGE_OVERVIEW_PARAGRAPH__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_LANGUAGE_OVERVIEW_PARAGRAPH__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>L2</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_LANGUAGE_OVERVIEW_PARAGRAPH__L2 = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Multi Language Overview Paragraph</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_LANGUAGE_OVERVIEW_PARAGRAPH_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Multi Language Overview Paragraph</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_LANGUAGE_OVERVIEW_PARAGRAPH_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.LOverviewParagraphImpl <em>LOverview Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.LOverviewParagraphImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getLOverviewParagraph()
     * @generated
     */
    int LOVERVIEW_PARAGRAPH = 14;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOVERVIEW_PARAGRAPH__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOVERVIEW_PARAGRAPH__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Raw Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOVERVIEW_PARAGRAPH__RAW_TEXT = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>LOverview Paragraph</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOVERVIEW_PARAGRAPH_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>LOverview Paragraph</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOVERVIEW_PARAGRAPH_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.MultiLanguagePlainTextImpl <em>Multi Language Plain Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.MultiLanguagePlainTextImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getMultiLanguagePlainText()
     * @generated
     */
    int MULTI_LANGUAGE_PLAIN_TEXT = 15;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_LANGUAGE_PLAIN_TEXT__CHECKSUM = AR_OBJECT__CHECKSUM;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_LANGUAGE_PLAIN_TEXT__TIMESTAMP = AR_OBJECT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>L10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_LANGUAGE_PLAIN_TEXT__L10 = AR_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Multi Language Plain Text</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_LANGUAGE_PLAIN_TEXT_FEATURE_COUNT = AR_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Multi Language Plain Text</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_LANGUAGE_PLAIN_TEXT_OPERATION_COUNT = AR_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>LPlain Text</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getLPlainText()
     * @generated
     */
    int LPLAIN_TEXT = 20;

    /**
     * The meta object id for the '<em>EURI</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.net.URI
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getEURI()
     * @generated
     */
    int EURI = 21;

    /**
     * The meta object id for the '{@link asam.cc.impl.AblockImpl <em>Ablock</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.AblockImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getAblock()
     * @generated
     */
    int ABLOCK = 17;

    /**
     * The feature id for the '<em><b>Short Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK__SHORT_NAME = 0;

    /**
     * The feature id for the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK__CATEGORY = 1;

    /**
     * The feature id for the '<em><b>Arefs</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK__AREFS = 2;

    /**
     * The feature id for the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK__DOMAIN = 3;

    /**
     * The feature id for the '<em><b>Files</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK__FILES = 4;

    /**
     * The feature id for the '<em><b>Intended File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK__INTENDED_FILE_NAME = 5;

    /**
     * The number of structural features of the '<em>Ablock</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Ablock</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABLOCK_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link asam.cc.impl.ArefImpl <em>Aref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see asam.cc.impl.ArefImpl
     * @see asam.cc.impl.ContainerCatalogPackageImpl#getAref()
     * @generated
     */
    int AREF = 18;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AREF__KEY = STRING_TO_STRING_MAP__KEY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AREF__VALUE = STRING_TO_STRING_MAP__VALUE;

    /**
     * The number of structural features of the '<em>Aref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AREF_FEATURE_COUNT = STRING_TO_STRING_MAP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Aref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AREF_OPERATION_COUNT = STRING_TO_STRING_MAP_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link asam.cc.Catalog <em>Catalog</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Catalog</em>'.
     * @see asam.cc.Catalog
     * @generated
     */
    EClass getCatalog();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Catalog#getShortName <em>Short Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Short Name</em>'.
     * @see asam.cc.Catalog#getShortName()
     * @see #getCatalog()
     * @generated
     */
    EAttribute getCatalog_ShortName();

    /**
     * Returns the meta object for the reference list '{@link asam.cc.Catalog#getABlocks <em>ABlocks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>ABlocks</em>'.
     * @see asam.cc.Catalog#getABlocks()
     * @see #getCatalog()
     * @generated
     */
    EReference getCatalog_ABlocks();

    /**
     * Returns the meta object for the reference '{@link asam.cc.Catalog#getAdminData <em>Admin Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Admin Data</em>'.
     * @see asam.cc.Catalog#getAdminData()
     * @see #getCatalog()
     * @generated
     */
    EReference getCatalog_AdminData();

    /**
     * Returns the meta object for class '{@link asam.cc.AdminData <em>Admin Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Admin Data</em>'.
     * @see asam.cc.AdminData
     * @generated
     */
    EClass getAdminData();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.AdminData#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Language</em>'.
     * @see asam.cc.AdminData#getLanguage()
     * @see #getAdminData()
     * @generated
     */
    EAttribute getAdminData_Language();

    /**
     * Returns the meta object for the reference '{@link asam.cc.AdminData#getUsedLanguages <em>Used Languages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Used Languages</em>'.
     * @see asam.cc.AdminData#getUsedLanguages()
     * @see #getAdminData()
     * @generated
     */
    EReference getAdminData_UsedLanguages();

    /**
     * Returns the meta object for the reference list '{@link asam.cc.AdminData#getDocRevision <em>Doc Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Doc Revision</em>'.
     * @see asam.cc.AdminData#getDocRevision()
     * @see #getAdminData()
     * @generated
     */
    EReference getAdminData_DocRevision();

    /**
     * Returns the meta object for the reference list '{@link asam.cc.AdminData#getSdg <em>Sdg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sdg</em>'.
     * @see asam.cc.AdminData#getSdg()
     * @see #getAdminData()
     * @generated
     */
    EReference getAdminData_Sdg();

    /**
     * Returns the meta object for class '{@link asam.cc.Sdg <em>Sdg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sdg</em>'.
     * @see asam.cc.Sdg
     * @generated
     */
    EClass getSdg();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Sdg#getGid <em>Gid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gid</em>'.
     * @see asam.cc.Sdg#getGid()
     * @see #getSdg()
     * @generated
     */
    EAttribute getSdg_Gid();

    /**
     * Returns the meta object for the reference '{@link asam.cc.Sdg#getSdgCaption <em>Sdg Caption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sdg Caption</em>'.
     * @see asam.cc.Sdg#getSdgCaption()
     * @see #getSdg()
     * @generated
     */
    EReference getSdg_SdgCaption();

    /**
     * Returns the meta object for the reference '{@link asam.cc.Sdg#getSdgCaptionRef <em>Sdg Caption Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sdg Caption Ref</em>'.
     * @see asam.cc.Sdg#getSdgCaptionRef()
     * @see #getSdg()
     * @generated
     */
    EReference getSdg_SdgCaptionRef();

    /**
     * Returns the meta object for the reference '{@link asam.cc.Sdg#getSdgContents <em>Sdg Contents</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sdg Contents</em>'.
     * @see asam.cc.Sdg#getSdgContents()
     * @see #getSdg()
     * @generated
     */
    EReference getSdg_SdgContents();

    /**
     * Returns the meta object for class '{@link asam.cc.SdgCaption <em>Sdg Caption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sdg Caption</em>'.
     * @see asam.cc.SdgCaption
     * @generated
     */
    EClass getSdgCaption();

    /**
     * Returns the meta object for the reference '{@link asam.cc.SdgCaption#getDesc <em>Desc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Desc</em>'.
     * @see asam.cc.SdgCaption#getDesc()
     * @see #getSdgCaption()
     * @generated
     */
    EReference getSdgCaption_Desc();

    /**
     * Returns the meta object for class '{@link asam.cc.Sd <em>Sd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sd</em>'.
     * @see asam.cc.Sd
     * @generated
     */
    EClass getSd();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Sd#getGid <em>Gid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gid</em>'.
     * @see asam.cc.Sd#getGid()
     * @see #getSd()
     * @generated
     */
    EAttribute getSd_Gid();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Sd#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see asam.cc.Sd#getValue()
     * @see #getSd()
     * @generated
     */
    EAttribute getSd_Value();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Sd#getXmlSpace <em>Xml Space</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xml Space</em>'.
     * @see asam.cc.Sd#getXmlSpace()
     * @see #getSd()
     * @generated
     */
    EAttribute getSd_XmlSpace();

    /**
     * Returns the meta object for class '{@link asam.cc.Sdf <em>Sdf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sdf</em>'.
     * @see asam.cc.Sdf
     * @generated
     */
    EClass getSdf();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Sdf#getGid <em>Gid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gid</em>'.
     * @see asam.cc.Sdf#getGid()
     * @see #getSdf()
     * @generated
     */
    EAttribute getSdf_Gid();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Sdf#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see asam.cc.Sdf#getValue()
     * @see #getSdf()
     * @generated
     */
    EAttribute getSdf_Value();

    /**
     * Returns the meta object for class '{@link asam.cc.Referrable <em>Referrable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Referrable</em>'.
     * @see asam.cc.Referrable
     * @generated
     */
    EClass getReferrable();

    /**
     * Returns the meta object for the reference '{@link asam.cc.Referrable#getShortName <em>Short Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Short Name</em>'.
     * @see asam.cc.Referrable#getShortName()
     * @see #getReferrable()
     * @generated
     */
    EReference getReferrable_ShortName();

    /**
     * Returns the meta object for the reference list '{@link asam.cc.Referrable#getShortNameFragment <em>Short Name Fragment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Short Name Fragment</em>'.
     * @see asam.cc.Referrable#getShortNameFragment()
     * @see #getReferrable()
     * @generated
     */
    EReference getReferrable_ShortNameFragment();

    /**
     * Returns the meta object for class '{@link asam.cc.Identifier <em>Identifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identifier</em>'.
     * @see asam.cc.Identifier
     * @generated
     */
    EClass getIdentifier();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Identifier#getNamePattern <em>Name Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Pattern</em>'.
     * @see asam.cc.Identifier#getNamePattern()
     * @see #getIdentifier()
     * @generated
     */
    EAttribute getIdentifier_NamePattern();

    /**
     * Returns the meta object for class '{@link asam.cc.ShortNameFragment <em>Short Name Fragment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Short Name Fragment</em>'.
     * @see asam.cc.ShortNameFragment
     * @generated
     */
    EClass getShortNameFragment();

    /**
     * Returns the meta object for the reference '{@link asam.cc.ShortNameFragment#getFragment <em>Fragment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Fragment</em>'.
     * @see asam.cc.ShortNameFragment#getFragment()
     * @see #getShortNameFragment()
     * @generated
     */
    EReference getShortNameFragment_Fragment();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.ShortNameFragment#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Role</em>'.
     * @see asam.cc.ShortNameFragment#getRole()
     * @see #getShortNameFragment()
     * @generated
     */
    EAttribute getShortNameFragment_Role();

    /**
     * Returns the meta object for class '{@link asam.cc.SdgContents <em>Sdg Contents</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sdg Contents</em>'.
     * @see asam.cc.SdgContents
     * @generated
     */
    EClass getSdgContents();

    /**
     * Returns the meta object for the reference '{@link asam.cc.SdgContents#getSd <em>Sd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sd</em>'.
     * @see asam.cc.SdgContents#getSd()
     * @see #getSdgContents()
     * @generated
     */
    EReference getSdgContents_Sd();

    /**
     * Returns the meta object for the reference '{@link asam.cc.SdgContents#getSdf <em>Sdf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sdf</em>'.
     * @see asam.cc.SdgContents#getSdf()
     * @see #getSdgContents()
     * @generated
     */
    EReference getSdgContents_Sdf();

    /**
     * Returns the meta object for the reference '{@link asam.cc.SdgContents#getSdg <em>Sdg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sdg</em>'.
     * @see asam.cc.SdgContents#getSdg()
     * @see #getSdgContents()
     * @generated
     */
    EReference getSdgContents_Sdg();

    /**
     * Returns the meta object for the reference '{@link asam.cc.SdgContents#getSdx <em>Sdx</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sdx</em>'.
     * @see asam.cc.SdgContents#getSdx()
     * @see #getSdgContents()
     * @generated
     */
    EReference getSdgContents_Sdx();

    /**
     * Returns the meta object for the reference '{@link asam.cc.SdgContents#getSdxf <em>Sdxf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sdxf</em>'.
     * @see asam.cc.SdgContents#getSdxf()
     * @see #getSdgContents()
     * @generated
     */
    EReference getSdgContents_Sdxf();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Name Token</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Name Token</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getNameToken();

    /**
     * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String To String Map</em>'.
     * @see java.util.Map.Entry
     * @model keyDataType="org.eclipse.emf.ecore.EString"
     *        valueDataType="org.eclipse.emf.ecore.EString"
     * @generated
     */
    EClass getStringToStringMap();

    /**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see java.util.Map.Entry
     * @see #getStringToStringMap()
     * @generated
     */
    EAttribute getStringToStringMap_Key();

    /**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see java.util.Map.Entry
     * @see #getStringToStringMap()
     * @generated
     */
    EAttribute getStringToStringMap_Value();

    /**
     * Returns the meta object for class '{@link asam.cc.DocRevision <em>Doc Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Doc Revision</em>'.
     * @see asam.cc.DocRevision
     * @generated
     */
    EClass getDocRevision();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.DocRevision#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see asam.cc.DocRevision#getDate()
     * @see #getDocRevision()
     * @generated
     */
    EAttribute getDocRevision_Date();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.DocRevision#getIssuedBy <em>Issued By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Issued By</em>'.
     * @see asam.cc.DocRevision#getIssuedBy()
     * @see #getDocRevision()
     * @generated
     */
    EAttribute getDocRevision_IssuedBy();

    /**
     * Returns the meta object for the reference list '{@link asam.cc.DocRevision#getModification <em>Modification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Modification</em>'.
     * @see asam.cc.DocRevision#getModification()
     * @see #getDocRevision()
     * @generated
     */
    EReference getDocRevision_Modification();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.DocRevision#getRevisionLabel <em>Revision Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision Label</em>'.
     * @see asam.cc.DocRevision#getRevisionLabel()
     * @see #getDocRevision()
     * @generated
     */
    EAttribute getDocRevision_RevisionLabel();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.DocRevision#getRevisionLabelP1 <em>Revision Label P1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision Label P1</em>'.
     * @see asam.cc.DocRevision#getRevisionLabelP1()
     * @see #getDocRevision()
     * @generated
     */
    EAttribute getDocRevision_RevisionLabelP1();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.DocRevision#getRevisionLabelP2 <em>Revision Label P2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision Label P2</em>'.
     * @see asam.cc.DocRevision#getRevisionLabelP2()
     * @see #getDocRevision()
     * @generated
     */
    EAttribute getDocRevision_RevisionLabelP2();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.DocRevision#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>State</em>'.
     * @see asam.cc.DocRevision#getState()
     * @see #getDocRevision()
     * @generated
     */
    EAttribute getDocRevision_State();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Revision Label String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Revision Label String</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getRevisionLabelString();

    /**
     * Returns the meta object for class '{@link asam.cc.Modififaction <em>Modififaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Modififaction</em>'.
     * @see asam.cc.Modififaction
     * @generated
     */
    EClass getModififaction();

    /**
     * Returns the meta object for the reference '{@link asam.cc.Modififaction#getChange <em>Change</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Change</em>'.
     * @see asam.cc.Modififaction#getChange()
     * @see #getModififaction()
     * @generated
     */
    EReference getModififaction_Change();

    /**
     * Returns the meta object for the reference '{@link asam.cc.Modififaction#getReason <em>Reason</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Reason</em>'.
     * @see asam.cc.Modififaction#getReason()
     * @see #getModififaction()
     * @generated
     */
    EReference getModififaction_Reason();

    /**
     * Returns the meta object for class '{@link asam.cc.MultiLanguageOverviewParagraph <em>Multi Language Overview Paragraph</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multi Language Overview Paragraph</em>'.
     * @see asam.cc.MultiLanguageOverviewParagraph
     * @generated
     */
    EClass getMultiLanguageOverviewParagraph();

    /**
     * Returns the meta object for the reference list '{@link asam.cc.MultiLanguageOverviewParagraph#getL2 <em>L2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>L2</em>'.
     * @see asam.cc.MultiLanguageOverviewParagraph#getL2()
     * @see #getMultiLanguageOverviewParagraph()
     * @generated
     */
    EReference getMultiLanguageOverviewParagraph_L2();

    /**
     * Returns the meta object for class '{@link asam.cc.LOverviewParagraph <em>LOverview Paragraph</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LOverview Paragraph</em>'.
     * @see asam.cc.LOverviewParagraph
     * @generated
     */
    EClass getLOverviewParagraph();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.LOverviewParagraph#getRawText <em>Raw Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Raw Text</em>'.
     * @see asam.cc.LOverviewParagraph#getRawText()
     * @see #getLOverviewParagraph()
     * @generated
     */
    EAttribute getLOverviewParagraph_RawText();

    /**
     * Returns the meta object for class '{@link asam.cc.MultiLanguagePlainText <em>Multi Language Plain Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multi Language Plain Text</em>'.
     * @see asam.cc.MultiLanguagePlainText
     * @generated
     */
    EClass getMultiLanguagePlainText();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.MultiLanguagePlainText#getL10 <em>L10</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>L10</em>'.
     * @see asam.cc.MultiLanguagePlainText#getL10()
     * @see #getMultiLanguagePlainText()
     * @generated
     */
    EAttribute getMultiLanguagePlainText_L10();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>LPlain Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>LPlain Text</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getLPlainText();

    /**
     * Returns the meta object for data type '{@link java.net.URI <em>EURI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>EURI</em>'.
     * @see java.net.URI
     * @model instanceClass="java.net.URI"
     * @generated
     */
    EDataType getEURI();

    /**
     * Returns the meta object for class '{@link asam.cc.ARObject <em>AR Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>AR Object</em>'.
     * @see asam.cc.ARObject
     * @generated
     */
    EClass getARObject();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.ARObject#getChecksum <em>Checksum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Checksum</em>'.
     * @see asam.cc.ARObject#getChecksum()
     * @see #getARObject()
     * @generated
     */
    EAttribute getARObject_Checksum();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.ARObject#getTimestamp <em>Timestamp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timestamp</em>'.
     * @see asam.cc.ARObject#getTimestamp()
     * @see #getARObject()
     * @generated
     */
    EAttribute getARObject_Timestamp();

    /**
     * Returns the meta object for class '{@link asam.cc.Ablock <em>Ablock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ablock</em>'.
     * @see asam.cc.Ablock
     * @generated
     */
    EClass getAblock();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Ablock#getShortName <em>Short Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Short Name</em>'.
     * @see asam.cc.Ablock#getShortName()
     * @see #getAblock()
     * @generated
     */
    EAttribute getAblock_ShortName();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Ablock#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Category</em>'.
     * @see asam.cc.Ablock#getCategory()
     * @see #getAblock()
     * @generated
     */
    EAttribute getAblock_Category();

    /**
     * Returns the meta object for the reference '{@link asam.cc.Ablock#getArefs <em>Arefs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Arefs</em>'.
     * @see asam.cc.Ablock#getArefs()
     * @see #getAblock()
     * @generated
     */
    EReference getAblock_Arefs();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Ablock#getDomain <em>Domain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Domain</em>'.
     * @see asam.cc.Ablock#getDomain()
     * @see #getAblock()
     * @generated
     */
    EAttribute getAblock_Domain();

    /**
     * Returns the meta object for the attribute list '{@link asam.cc.Ablock#getFiles <em>Files</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Files</em>'.
     * @see asam.cc.Ablock#getFiles()
     * @see #getAblock()
     * @generated
     */
    EAttribute getAblock_Files();

    /**
     * Returns the meta object for the attribute '{@link asam.cc.Ablock#getIntendedFileName <em>Intended File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intended File Name</em>'.
     * @see asam.cc.Ablock#getIntendedFileName()
     * @see #getAblock()
     * @generated
     */
    EAttribute getAblock_IntendedFileName();

    /**
     * Returns the meta object for class '{@link java.util.Map.Entry <em>Aref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Aref</em>'.
     * @see java.util.Map.Entry
     * @model features="" superTypes="asam.cc.StringToStringMap"
     * @generated
     */
    EClass getAref();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ContainerCatalogFactory getContainerCatalogFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link asam.cc.impl.CatalogImpl <em>Catalog</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.CatalogImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getCatalog()
         * @generated
         */
        EClass CATALOG = eINSTANCE.getCatalog();

        /**
         * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CATALOG__SHORT_NAME = eINSTANCE.getCatalog_ShortName();

        /**
         * The meta object literal for the '<em><b>ABlocks</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CATALOG__ABLOCKS = eINSTANCE.getCatalog_ABlocks();

        /**
         * The meta object literal for the '<em><b>Admin Data</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CATALOG__ADMIN_DATA = eINSTANCE.getCatalog_AdminData();

        /**
         * The meta object literal for the '{@link asam.cc.impl.AdminDataImpl <em>Admin Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.AdminDataImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getAdminData()
         * @generated
         */
        EClass ADMIN_DATA = eINSTANCE.getAdminData();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ADMIN_DATA__LANGUAGE = eINSTANCE.getAdminData_Language();

        /**
         * The meta object literal for the '<em><b>Used Languages</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADMIN_DATA__USED_LANGUAGES = eINSTANCE.getAdminData_UsedLanguages();

        /**
         * The meta object literal for the '<em><b>Doc Revision</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADMIN_DATA__DOC_REVISION = eINSTANCE.getAdminData_DocRevision();

        /**
         * The meta object literal for the '<em><b>Sdg</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADMIN_DATA__SDG = eINSTANCE.getAdminData_Sdg();

        /**
         * The meta object literal for the '{@link asam.cc.impl.SdgImpl <em>Sdg</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.SdgImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getSdg()
         * @generated
         */
        EClass SDG = eINSTANCE.getSdg();

        /**
         * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SDG__GID = eINSTANCE.getSdg_Gid();

        /**
         * The meta object literal for the '<em><b>Sdg Caption</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SDG__SDG_CAPTION = eINSTANCE.getSdg_SdgCaption();

        /**
         * The meta object literal for the '<em><b>Sdg Caption Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SDG__SDG_CAPTION_REF = eINSTANCE.getSdg_SdgCaptionRef();

        /**
         * The meta object literal for the '<em><b>Sdg Contents</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SDG__SDG_CONTENTS = eINSTANCE.getSdg_SdgContents();

        /**
         * The meta object literal for the '{@link asam.cc.impl.SdgCaptionImpl <em>Sdg Caption</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.SdgCaptionImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getSdgCaption()
         * @generated
         */
        EClass SDG_CAPTION = eINSTANCE.getSdgCaption();

        /**
         * The meta object literal for the '<em><b>Desc</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SDG_CAPTION__DESC = eINSTANCE.getSdgCaption_Desc();

        /**
         * The meta object literal for the '{@link asam.cc.impl.SdImpl <em>Sd</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.SdImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getSd()
         * @generated
         */
        EClass SD = eINSTANCE.getSd();

        /**
         * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SD__GID = eINSTANCE.getSd_Gid();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SD__VALUE = eINSTANCE.getSd_Value();

        /**
         * The meta object literal for the '<em><b>Xml Space</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SD__XML_SPACE = eINSTANCE.getSd_XmlSpace();

        /**
         * The meta object literal for the '{@link asam.cc.impl.SdfImpl <em>Sdf</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.SdfImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getSdf()
         * @generated
         */
        EClass SDF = eINSTANCE.getSdf();

        /**
         * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SDF__GID = eINSTANCE.getSdf_Gid();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SDF__VALUE = eINSTANCE.getSdf_Value();

        /**
         * The meta object literal for the '{@link asam.cc.impl.ReferrableImpl <em>Referrable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.ReferrableImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getReferrable()
         * @generated
         */
        EClass REFERRABLE = eINSTANCE.getReferrable();

        /**
         * The meta object literal for the '<em><b>Short Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERRABLE__SHORT_NAME = eINSTANCE.getReferrable_ShortName();

        /**
         * The meta object literal for the '<em><b>Short Name Fragment</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERRABLE__SHORT_NAME_FRAGMENT = eINSTANCE.getReferrable_ShortNameFragment();

        /**
         * The meta object literal for the '{@link asam.cc.impl.IdentifierImpl <em>Identifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.IdentifierImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getIdentifier()
         * @generated
         */
        EClass IDENTIFIER = eINSTANCE.getIdentifier();

        /**
         * The meta object literal for the '<em><b>Name Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTIFIER__NAME_PATTERN = eINSTANCE.getIdentifier_NamePattern();

        /**
         * The meta object literal for the '{@link asam.cc.impl.ShortNameFragmentImpl <em>Short Name Fragment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.ShortNameFragmentImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getShortNameFragment()
         * @generated
         */
        EClass SHORT_NAME_FRAGMENT = eINSTANCE.getShortNameFragment();

        /**
         * The meta object literal for the '<em><b>Fragment</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SHORT_NAME_FRAGMENT__FRAGMENT = eINSTANCE.getShortNameFragment_Fragment();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHORT_NAME_FRAGMENT__ROLE = eINSTANCE.getShortNameFragment_Role();

        /**
         * The meta object literal for the '{@link asam.cc.impl.SdgContentsImpl <em>Sdg Contents</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.SdgContentsImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getSdgContents()
         * @generated
         */
        EClass SDG_CONTENTS = eINSTANCE.getSdgContents();

        /**
         * The meta object literal for the '<em><b>Sd</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SDG_CONTENTS__SD = eINSTANCE.getSdgContents_Sd();

        /**
         * The meta object literal for the '<em><b>Sdf</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SDG_CONTENTS__SDF = eINSTANCE.getSdgContents_Sdf();

        /**
         * The meta object literal for the '<em><b>Sdg</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SDG_CONTENTS__SDG = eINSTANCE.getSdgContents_Sdg();

        /**
         * The meta object literal for the '<em><b>Sdx</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SDG_CONTENTS__SDX = eINSTANCE.getSdgContents_Sdx();

        /**
         * The meta object literal for the '<em><b>Sdxf</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SDG_CONTENTS__SDXF = eINSTANCE.getSdgContents_Sdxf();

        /**
         * The meta object literal for the '<em>Name Token</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getNameToken()
         * @generated
         */
        EDataType NAME_TOKEN = eINSTANCE.getNameToken();

        /**
         * The meta object literal for the '{@link asam.cc.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.StringToStringMapImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getStringToStringMap()
         * @generated
         */
        EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

        /**
         * The meta object literal for the '{@link asam.cc.impl.DocRevisionImpl <em>Doc Revision</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.DocRevisionImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getDocRevision()
         * @generated
         */
        EClass DOC_REVISION = eINSTANCE.getDocRevision();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC_REVISION__DATE = eINSTANCE.getDocRevision_Date();

        /**
         * The meta object literal for the '<em><b>Issued By</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC_REVISION__ISSUED_BY = eINSTANCE.getDocRevision_IssuedBy();

        /**
         * The meta object literal for the '<em><b>Modification</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOC_REVISION__MODIFICATION = eINSTANCE.getDocRevision_Modification();

        /**
         * The meta object literal for the '<em><b>Revision Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC_REVISION__REVISION_LABEL = eINSTANCE.getDocRevision_RevisionLabel();

        /**
         * The meta object literal for the '<em><b>Revision Label P1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC_REVISION__REVISION_LABEL_P1 = eINSTANCE.getDocRevision_RevisionLabelP1();

        /**
         * The meta object literal for the '<em><b>Revision Label P2</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC_REVISION__REVISION_LABEL_P2 = eINSTANCE.getDocRevision_RevisionLabelP2();

        /**
         * The meta object literal for the '<em><b>State</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC_REVISION__STATE = eINSTANCE.getDocRevision_State();

        /**
         * The meta object literal for the '<em>Revision Label String</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getRevisionLabelString()
         * @generated
         */
        EDataType REVISION_LABEL_STRING = eINSTANCE.getRevisionLabelString();

        /**
         * The meta object literal for the '{@link asam.cc.impl.ModififactionImpl <em>Modififaction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.ModififactionImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getModififaction()
         * @generated
         */
        EClass MODIFIFACTION = eINSTANCE.getModififaction();

        /**
         * The meta object literal for the '<em><b>Change</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODIFIFACTION__CHANGE = eINSTANCE.getModififaction_Change();

        /**
         * The meta object literal for the '<em><b>Reason</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODIFIFACTION__REASON = eINSTANCE.getModififaction_Reason();

        /**
         * The meta object literal for the '{@link asam.cc.impl.MultiLanguageOverviewParagraphImpl <em>Multi Language Overview Paragraph</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.MultiLanguageOverviewParagraphImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getMultiLanguageOverviewParagraph()
         * @generated
         */
        EClass MULTI_LANGUAGE_OVERVIEW_PARAGRAPH = eINSTANCE.getMultiLanguageOverviewParagraph();

        /**
         * The meta object literal for the '<em><b>L2</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MULTI_LANGUAGE_OVERVIEW_PARAGRAPH__L2 = eINSTANCE.getMultiLanguageOverviewParagraph_L2();

        /**
         * The meta object literal for the '{@link asam.cc.impl.LOverviewParagraphImpl <em>LOverview Paragraph</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.LOverviewParagraphImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getLOverviewParagraph()
         * @generated
         */
        EClass LOVERVIEW_PARAGRAPH = eINSTANCE.getLOverviewParagraph();

        /**
         * The meta object literal for the '<em><b>Raw Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOVERVIEW_PARAGRAPH__RAW_TEXT = eINSTANCE.getLOverviewParagraph_RawText();

        /**
         * The meta object literal for the '{@link asam.cc.impl.MultiLanguagePlainTextImpl <em>Multi Language Plain Text</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.MultiLanguagePlainTextImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getMultiLanguagePlainText()
         * @generated
         */
        EClass MULTI_LANGUAGE_PLAIN_TEXT = eINSTANCE.getMultiLanguagePlainText();

        /**
         * The meta object literal for the '<em><b>L10</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MULTI_LANGUAGE_PLAIN_TEXT__L10 = eINSTANCE.getMultiLanguagePlainText_L10();

        /**
         * The meta object literal for the '<em>LPlain Text</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getLPlainText()
         * @generated
         */
        EDataType LPLAIN_TEXT = eINSTANCE.getLPlainText();

        /**
         * The meta object literal for the '<em>EURI</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.net.URI
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getEURI()
         * @generated
         */
        EDataType EURI = eINSTANCE.getEURI();

        /**
         * The meta object literal for the '{@link asam.cc.impl.ARObjectImpl <em>AR Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.ARObjectImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getARObject()
         * @generated
         */
        EClass AR_OBJECT = eINSTANCE.getARObject();

        /**
         * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AR_OBJECT__CHECKSUM = eINSTANCE.getARObject_Checksum();

        /**
         * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AR_OBJECT__TIMESTAMP = eINSTANCE.getARObject_Timestamp();

        /**
         * The meta object literal for the '{@link asam.cc.impl.AblockImpl <em>Ablock</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.AblockImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getAblock()
         * @generated
         */
        EClass ABLOCK = eINSTANCE.getAblock();

        /**
         * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABLOCK__SHORT_NAME = eINSTANCE.getAblock_ShortName();

        /**
         * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABLOCK__CATEGORY = eINSTANCE.getAblock_Category();

        /**
         * The meta object literal for the '<em><b>Arefs</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABLOCK__AREFS = eINSTANCE.getAblock_Arefs();

        /**
         * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABLOCK__DOMAIN = eINSTANCE.getAblock_Domain();

        /**
         * The meta object literal for the '<em><b>Files</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABLOCK__FILES = eINSTANCE.getAblock_Files();

        /**
         * The meta object literal for the '<em><b>Intended File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABLOCK__INTENDED_FILE_NAME = eINSTANCE.getAblock_IntendedFileName();

        /**
         * The meta object literal for the '{@link asam.cc.impl.ArefImpl <em>Aref</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see asam.cc.impl.ArefImpl
         * @see asam.cc.impl.ContainerCatalogPackageImpl#getAref()
         * @generated
         */
        EClass AREF = eINSTANCE.getAref();

    }

} //ContainerCatalogPackage
