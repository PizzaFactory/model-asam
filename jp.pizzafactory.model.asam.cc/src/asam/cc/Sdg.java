/**
 */
package asam.cc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sdg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.Sdg#getGid <em>Gid</em>}</li>
 *   <li>{@link asam.cc.Sdg#getSdgCaption <em>Sdg Caption</em>}</li>
 *   <li>{@link asam.cc.Sdg#getSdgCaptionRef <em>Sdg Caption Ref</em>}</li>
 *   <li>{@link asam.cc.Sdg#getSdgContents <em>Sdg Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getSdg()
 * @model
 * @generated
 */
public interface Sdg extends ARObject {
    /**
     * Returns the value of the '<em><b>Gid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gid</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gid</em>' attribute.
     * @see #setGid(String)
     * @see asam.cc.ContainerCatalogPackage#getSdg_Gid()
     * @model dataType="asam.cc.NameToken"
     * @generated
     */
    String getGid();

    /**
     * Sets the value of the '{@link asam.cc.Sdg#getGid <em>Gid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gid</em>' attribute.
     * @see #getGid()
     * @generated
     */
    void setGid(String value);

    /**
     * Returns the value of the '<em><b>Sdg Caption</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sdg Caption</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sdg Caption</em>' reference.
     * @see #setSdgCaption(SdgCaption)
     * @see asam.cc.ContainerCatalogPackage#getSdg_SdgCaption()
     * @model
     * @generated
     */
    SdgCaption getSdgCaption();

    /**
     * Sets the value of the '{@link asam.cc.Sdg#getSdgCaption <em>Sdg Caption</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sdg Caption</em>' reference.
     * @see #getSdgCaption()
     * @generated
     */
    void setSdgCaption(SdgCaption value);

    /**
     * Returns the value of the '<em><b>Sdg Caption Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sdg Caption Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sdg Caption Ref</em>' reference.
     * @see #setSdgCaptionRef(SdgCaption)
     * @see asam.cc.ContainerCatalogPackage#getSdg_SdgCaptionRef()
     * @model
     * @generated
     */
    SdgCaption getSdgCaptionRef();

    /**
     * Sets the value of the '{@link asam.cc.Sdg#getSdgCaptionRef <em>Sdg Caption Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sdg Caption Ref</em>' reference.
     * @see #getSdgCaptionRef()
     * @generated
     */
    void setSdgCaptionRef(SdgCaption value);

    /**
     * Returns the value of the '<em><b>Sdg Contents</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sdg Contents</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sdg Contents</em>' reference.
     * @see #setSdgContents(SdgContents)
     * @see asam.cc.ContainerCatalogPackage#getSdg_SdgContents()
     * @model
     * @generated
     */
    SdgContents getSdgContents();

    /**
     * Sets the value of the '{@link asam.cc.Sdg#getSdgContents <em>Sdg Contents</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sdg Contents</em>' reference.
     * @see #getSdgContents()
     * @generated
     */
    void setSdgContents(SdgContents value);

} // Sdg
