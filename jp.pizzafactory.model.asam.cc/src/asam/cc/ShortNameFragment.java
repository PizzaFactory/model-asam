/**
 */
package asam.cc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Name Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.ShortNameFragment#getFragment <em>Fragment</em>}</li>
 *   <li>{@link asam.cc.ShortNameFragment#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getShortNameFragment()
 * @model
 * @generated
 */
public interface ShortNameFragment extends ARObject {
    /**
     * Returns the value of the '<em><b>Fragment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fragment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fragment</em>' reference.
     * @see #setFragment(Identifier)
     * @see asam.cc.ContainerCatalogPackage#getShortNameFragment_Fragment()
     * @model required="true"
     * @generated
     */
    Identifier getFragment();

    /**
     * Sets the value of the '{@link asam.cc.ShortNameFragment#getFragment <em>Fragment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fragment</em>' reference.
     * @see #getFragment()
     * @generated
     */
    void setFragment(Identifier value);

    /**
     * Returns the value of the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' attribute.
     * @see #setRole(String)
     * @see asam.cc.ContainerCatalogPackage#getShortNameFragment_Role()
     * @model required="true"
     * @generated
     */
    String getRole();

    /**
     * Sets the value of the '{@link asam.cc.ShortNameFragment#getRole <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' attribute.
     * @see #getRole()
     * @generated
     */
    void setRole(String value);

} // ShortNameFragment
