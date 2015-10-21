/**
 */
package asam.cc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modififaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.Modififaction#getChange <em>Change</em>}</li>
 *   <li>{@link asam.cc.Modififaction#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getModififaction()
 * @model
 * @generated
 */
public interface Modififaction extends ARObject {
    /**
     * Returns the value of the '<em><b>Change</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Change</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Change</em>' reference.
     * @see #setChange(MultiLanguageOverviewParagraph)
     * @see asam.cc.ContainerCatalogPackage#getModififaction_Change()
     * @model required="true"
     * @generated
     */
    MultiLanguageOverviewParagraph getChange();

    /**
     * Sets the value of the '{@link asam.cc.Modififaction#getChange <em>Change</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Change</em>' reference.
     * @see #getChange()
     * @generated
     */
    void setChange(MultiLanguageOverviewParagraph value);

    /**
     * Returns the value of the '<em><b>Reason</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reason</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reason</em>' reference.
     * @see #setReason(MultiLanguageOverviewParagraph)
     * @see asam.cc.ContainerCatalogPackage#getModififaction_Reason()
     * @model
     * @generated
     */
    MultiLanguageOverviewParagraph getReason();

    /**
     * Sets the value of the '{@link asam.cc.Modififaction#getReason <em>Reason</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reason</em>' reference.
     * @see #getReason()
     * @generated
     */
    void setReason(MultiLanguageOverviewParagraph value);

} // Modififaction
