/**
 */
package asam.cc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referrable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.Referrable#getShortName <em>Short Name</em>}</li>
 *   <li>{@link asam.cc.Referrable#getShortNameFragment <em>Short Name Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getReferrable()
 * @model abstract="true"
 * @generated
 */
public interface Referrable extends ARObject {
    /**
     * Returns the value of the '<em><b>Short Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Short Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Short Name</em>' reference.
     * @see #setShortName(Identifier)
     * @see asam.cc.ContainerCatalogPackage#getReferrable_ShortName()
     * @model required="true"
     * @generated
     */
    Identifier getShortName();

    /**
     * Sets the value of the '{@link asam.cc.Referrable#getShortName <em>Short Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short Name</em>' reference.
     * @see #getShortName()
     * @generated
     */
    void setShortName(Identifier value);

    /**
     * Returns the value of the '<em><b>Short Name Fragment</b></em>' reference list.
     * The list contents are of type {@link asam.cc.ShortNameFragment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Short Name Fragment</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Short Name Fragment</em>' reference list.
     * @see asam.cc.ContainerCatalogPackage#getReferrable_ShortNameFragment()
     * @model
     * @generated
     */
    EList<ShortNameFragment> getShortNameFragment();

} // Referrable
