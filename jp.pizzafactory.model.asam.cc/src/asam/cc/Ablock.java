/**
 */
package asam.cc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ablock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.Ablock#getShortName <em>Short Name</em>}</li>
 *   <li>{@link asam.cc.Ablock#getCategory <em>Category</em>}</li>
 *   <li>{@link asam.cc.Ablock#getDomain <em>Domain</em>}</li>
 *   <li>{@link asam.cc.Ablock#getFiles <em>Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getAblock()
 * @model
 * @generated
 */
public interface Ablock extends EObject {
    /**
     * Returns the value of the '<em><b>Short Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Short Name</em>' attribute.
     * @see #setShortName(String)
     * @see asam.cc.ContainerCatalogPackage#getAblock_ShortName()
     * @model required="true"
     * @generated
     */
    String getShortName();

    /**
     * Sets the value of the '{@link asam.cc.Ablock#getShortName <em>Short Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short Name</em>' attribute.
     * @see #getShortName()
     * @generated
     */
    void setShortName(String value);

    /**
     * Returns the value of the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category</em>' attribute.
     * @see #setCategory(String)
     * @see asam.cc.ContainerCatalogPackage#getAblock_Category()
     * @model required="true"
     * @generated
     */
    String getCategory();

    /**
     * Sets the value of the '{@link asam.cc.Ablock#getCategory <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Category</em>' attribute.
     * @see #getCategory()
     * @generated
     */
    void setCategory(String value);

    /**
     * Returns the value of the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Domain</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Domain</em>' attribute.
     * @see #setDomain(String)
     * @see asam.cc.ContainerCatalogPackage#getAblock_Domain()
     * @model required="true"
     * @generated
     */
    String getDomain();

    /**
     * Sets the value of the '{@link asam.cc.Ablock#getDomain <em>Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Domain</em>' attribute.
     * @see #getDomain()
     * @generated
     */
    void setDomain(String value);

    /**
     * Returns the value of the '<em><b>Files</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Files</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Files</em>' reference.
     * @see #setFiles(Files)
     * @see asam.cc.ContainerCatalogPackage#getAblock_Files()
     * @model required="true"
     * @generated
     */
    Files getFiles();

    /**
     * Sets the value of the '{@link asam.cc.Ablock#getFiles <em>Files</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Files</em>' reference.
     * @see #getFiles()
     * @generated
     */
    void setFiles(Files value);

} // Ablock
