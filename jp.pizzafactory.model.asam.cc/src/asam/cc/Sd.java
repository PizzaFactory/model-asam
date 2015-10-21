/**
 */
package asam.cc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.Sd#getGid <em>Gid</em>}</li>
 *   <li>{@link asam.cc.Sd#getValue <em>Value</em>}</li>
 *   <li>{@link asam.cc.Sd#getXmlSpace <em>Xml Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getSd()
 * @model
 * @generated
 */
public interface Sd extends ARObject {
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
     * @see asam.cc.ContainerCatalogPackage#getSd_Gid()
     * @model dataType="asam.cc.NameToken"
     * @generated
     */
    String getGid();

    /**
     * Sets the value of the '{@link asam.cc.Sd#getGid <em>Gid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gid</em>' attribute.
     * @see #getGid()
     * @generated
     */
    void setGid(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see asam.cc.ContainerCatalogPackage#getSd_Value()
     * @model required="true"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link asam.cc.Sd#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Xml Space</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xml Space</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xml Space</em>' attribute.
     * @see #setXmlSpace(String)
     * @see asam.cc.ContainerCatalogPackage#getSd_XmlSpace()
     * @model
     * @generated
     */
    String getXmlSpace();

    /**
     * Sets the value of the '{@link asam.cc.Sd#getXmlSpace <em>Xml Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xml Space</em>' attribute.
     * @see #getXmlSpace()
     * @generated
     */
    void setXmlSpace(String value);

} // Sd
