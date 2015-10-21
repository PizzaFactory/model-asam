/**
 */
package asam.cc;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AR Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.ARObject#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link asam.cc.ARObject#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getARObject()
 * @model abstract="true"
 * @generated
 */
public interface ARObject extends EObject {
    /**
     * Returns the value of the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Checksum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Checksum</em>' attribute.
     * @see #setChecksum(String)
     * @see asam.cc.ContainerCatalogPackage#getARObject_Checksum()
     * @model
     * @generated
     */
    String getChecksum();

    /**
     * Sets the value of the '{@link asam.cc.ARObject#getChecksum <em>Checksum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Checksum</em>' attribute.
     * @see #getChecksum()
     * @generated
     */
    void setChecksum(String value);

    /**
     * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timestamp</em>' attribute.
     * @see #setTimestamp(Date)
     * @see asam.cc.ContainerCatalogPackage#getARObject_Timestamp()
     * @model
     * @generated
     */
    Date getTimestamp();

    /**
     * Sets the value of the '{@link asam.cc.ARObject#getTimestamp <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timestamp</em>' attribute.
     * @see #getTimestamp()
     * @generated
     */
    void setTimestamp(Date value);

} // ARObject
