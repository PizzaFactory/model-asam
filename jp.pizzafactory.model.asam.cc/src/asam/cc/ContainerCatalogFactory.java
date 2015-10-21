/**
 */
package asam.cc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see asam.cc.ContainerCatalogPackage
 * @generated
 */
public interface ContainerCatalogFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ContainerCatalogFactory eINSTANCE = asam.cc.impl.ContainerCatalogFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Catalog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Catalog</em>'.
     * @generated
     */
    Catalog createCatalog();

    /**
     * Returns a new object of class '<em>Admin Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Admin Data</em>'.
     * @generated
     */
    AdminData createAdminData();

    /**
     * Returns a new object of class '<em>Sdg</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sdg</em>'.
     * @generated
     */
    Sdg createSdg();

    /**
     * Returns a new object of class '<em>Sdg Caption</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sdg Caption</em>'.
     * @generated
     */
    SdgCaption createSdgCaption();

    /**
     * Returns a new object of class '<em>Sd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sd</em>'.
     * @generated
     */
    Sd createSd();

    /**
     * Returns a new object of class '<em>Sdf</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sdf</em>'.
     * @generated
     */
    Sdf createSdf();

    /**
     * Returns a new object of class '<em>Identifier</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identifier</em>'.
     * @generated
     */
    Identifier createIdentifier();

    /**
     * Returns a new object of class '<em>Short Name Fragment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Short Name Fragment</em>'.
     * @generated
     */
    ShortNameFragment createShortNameFragment();

    /**
     * Returns a new object of class '<em>Sdg Contents</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sdg Contents</em>'.
     * @generated
     */
    SdgContents createSdgContents();

    /**
     * Returns a new object of class '<em>Doc Revision</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Doc Revision</em>'.
     * @generated
     */
    DocRevision createDocRevision();

    /**
     * Returns a new object of class '<em>Modififaction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Modififaction</em>'.
     * @generated
     */
    Modififaction createModififaction();

    /**
     * Returns a new object of class '<em>Multi Language Overview Paragraph</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Multi Language Overview Paragraph</em>'.
     * @generated
     */
    MultiLanguageOverviewParagraph createMultiLanguageOverviewParagraph();

    /**
     * Returns a new object of class '<em>LOverview Paragraph</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LOverview Paragraph</em>'.
     * @generated
     */
    LOverviewParagraph createLOverviewParagraph();

    /**
     * Returns a new object of class '<em>Multi Language Plain Text</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Multi Language Plain Text</em>'.
     * @generated
     */
    MultiLanguagePlainText createMultiLanguagePlainText();

    /**
     * Returns a new object of class '<em>Ablock</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ablock</em>'.
     * @generated
     */
    Ablock createAblock();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ContainerCatalogPackage getContainerCatalogPackage();

} //ContainerCatalogFactory
