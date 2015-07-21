/**
 */
package asamcc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asamcc.Files#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see asamcc.Container_catalogPackage#getFiles()
 * @model
 * @generated
 */
public interface Files extends EObject {
    /**
     * Returns the value of the '<em><b>File</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File</em>' attribute list.
     * @see asamcc.Container_catalogPackage#getFiles_File()
     * @model
     * @generated
     */
    EList<String> getFile();

} // Files
