/**
 */
package asam.cc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sdf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.Sdf#getGid <em>Gid</em>}</li>
 *   <li>{@link asam.cc.Sdf#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getSdf()
 * @model
 * @generated
 */
public interface Sdf extends ARObject {
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
     * @see asam.cc.ContainerCatalogPackage#getSdf_Gid()
     * @model dataType="asam.cc.NameToken"
     * @generated
     */
    String getGid();

    /**
     * Sets the value of the '{@link asam.cc.Sdf#getGid <em>Gid</em>}' attribute.
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
     * @see #setValue(double)
     * @see asam.cc.ContainerCatalogPackage#getSdf_Value()
     * @model
     * @generated
     */
    double getValue();

    /**
     * Sets the value of the '{@link asam.cc.Sdf#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(double value);

} // Sdf
