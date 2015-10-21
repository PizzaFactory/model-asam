/**
 */
package asam.cc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.Identifier#getNamePattern <em>Name Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends ARObject {
    /**
     * Returns the value of the '<em><b>Name Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name Pattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name Pattern</em>' attribute.
     * @see #setNamePattern(String)
     * @see asam.cc.ContainerCatalogPackage#getIdentifier_NamePattern()
     * @model
     * @generated
     */
    String getNamePattern();

    /**
     * Sets the value of the '{@link asam.cc.Identifier#getNamePattern <em>Name Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name Pattern</em>' attribute.
     * @see #getNamePattern()
     * @generated
     */
    void setNamePattern(String value);

} // Identifier
