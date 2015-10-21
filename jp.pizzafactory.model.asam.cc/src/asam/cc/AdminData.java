/**
 */
package asam.cc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.AdminData#getLanguage <em>Language</em>}</li>
 *   <li>{@link asam.cc.AdminData#getUsedLanguages <em>Used Languages</em>}</li>
 *   <li>{@link asam.cc.AdminData#getDocRevision <em>Doc Revision</em>}</li>
 *   <li>{@link asam.cc.AdminData#getSdg <em>Sdg</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getAdminData()
 * @model
 * @generated
 */
public interface AdminData extends ARObject {
    /**
     * Returns the value of the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Language</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Language</em>' attribute.
     * @see #setLanguage(String)
     * @see asam.cc.ContainerCatalogPackage#getAdminData_Language()
     * @model
     * @generated
     */
    String getLanguage();

    /**
     * Sets the value of the '{@link asam.cc.AdminData#getLanguage <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' attribute.
     * @see #getLanguage()
     * @generated
     */
    void setLanguage(String value);

    /**
     * Returns the value of the '<em><b>Used Languages</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Used Languages</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Used Languages</em>' reference.
     * @see #setUsedLanguages(MultiLanguagePlainText)
     * @see asam.cc.ContainerCatalogPackage#getAdminData_UsedLanguages()
     * @model
     * @generated
     */
    MultiLanguagePlainText getUsedLanguages();

    /**
     * Sets the value of the '{@link asam.cc.AdminData#getUsedLanguages <em>Used Languages</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Used Languages</em>' reference.
     * @see #getUsedLanguages()
     * @generated
     */
    void setUsedLanguages(MultiLanguagePlainText value);

    /**
     * Returns the value of the '<em><b>Doc Revision</b></em>' reference list.
     * The list contents are of type {@link asam.cc.DocRevision}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Doc Revision</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Doc Revision</em>' reference list.
     * @see asam.cc.ContainerCatalogPackage#getAdminData_DocRevision()
     * @model
     * @generated
     */
    EList<DocRevision> getDocRevision();

    /**
     * Returns the value of the '<em><b>Sdg</b></em>' reference list.
     * The list contents are of type {@link asam.cc.Sdg}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sdg</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sdg</em>' reference list.
     * @see asam.cc.ContainerCatalogPackage#getAdminData_Sdg()
     * @model
     * @generated
     */
    EList<Sdg> getSdg();

} // AdminData
