/**
 */
package asam.cc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.Catalog#getShortName <em>Short Name</em>}</li>
 *   <li>{@link asam.cc.Catalog#getABlocks <em>ABlocks</em>}</li>
 *   <li>{@link asam.cc.Catalog#getAdminData <em>Admin Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends EObject {
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
     * @see asam.cc.ContainerCatalogPackage#getCatalog_ShortName()
     * @model
     * @generated
     */
    String getShortName();

    /**
     * Sets the value of the '{@link asam.cc.Catalog#getShortName <em>Short Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short Name</em>' attribute.
     * @see #getShortName()
     * @generated
     */
    void setShortName(String value);

    /**
     * Returns the value of the '<em><b>ABlocks</b></em>' reference list.
     * The list contents are of type {@link asam.cc.Ablock}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ABlocks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ABlocks</em>' reference list.
     * @see asam.cc.ContainerCatalogPackage#getCatalog_ABlocks()
     * @model
     * @generated
     */
    EList<Ablock> getABlocks();

    /**
     * Returns the value of the '<em><b>Admin Data</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Admin Data</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Admin Data</em>' reference.
     * @see #setAdminData(AdminData)
     * @see asam.cc.ContainerCatalogPackage#getCatalog_AdminData()
     * @model
     * @generated
     */
    AdminData getAdminData();

    /**
     * Sets the value of the '{@link asam.cc.Catalog#getAdminData <em>Admin Data</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Admin Data</em>' reference.
     * @see #getAdminData()
     * @generated
     */
    void setAdminData(AdminData value);

} // Catalog
