/**
 */
package asam.cc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sdg Caption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.SdgCaption#getDesc <em>Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getSdgCaption()
 * @model
 * @generated
 */
public interface SdgCaption extends ARObject, Referrable {
    /**
     * Returns the value of the '<em><b>Desc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Desc</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Desc</em>' reference.
     * @see #setDesc(MultiLanguageOverviewParagraph)
     * @see asam.cc.ContainerCatalogPackage#getSdgCaption_Desc()
     * @model
     * @generated
     */
    MultiLanguageOverviewParagraph getDesc();

    /**
     * Sets the value of the '{@link asam.cc.SdgCaption#getDesc <em>Desc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Desc</em>' reference.
     * @see #getDesc()
     * @generated
     */
    void setDesc(MultiLanguageOverviewParagraph value);

} // SdgCaption
