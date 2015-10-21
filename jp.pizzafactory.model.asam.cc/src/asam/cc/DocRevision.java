/**
 */
package asam.cc;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.DocRevision#getDate <em>Date</em>}</li>
 *   <li>{@link asam.cc.DocRevision#getIssuedBy <em>Issued By</em>}</li>
 *   <li>{@link asam.cc.DocRevision#getModification <em>Modification</em>}</li>
 *   <li>{@link asam.cc.DocRevision#getRevisionLabel <em>Revision Label</em>}</li>
 *   <li>{@link asam.cc.DocRevision#getRevisionLabelP1 <em>Revision Label P1</em>}</li>
 *   <li>{@link asam.cc.DocRevision#getRevisionLabelP2 <em>Revision Label P2</em>}</li>
 *   <li>{@link asam.cc.DocRevision#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getDocRevision()
 * @model
 * @generated
 */
public interface DocRevision extends ARObject {
    /**
     * Returns the value of the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date</em>' attribute.
     * @see #setDate(Date)
     * @see asam.cc.ContainerCatalogPackage#getDocRevision_Date()
     * @model required="true"
     * @generated
     */
    Date getDate();

    /**
     * Sets the value of the '{@link asam.cc.DocRevision#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date</em>' attribute.
     * @see #getDate()
     * @generated
     */
    void setDate(Date value);

    /**
     * Returns the value of the '<em><b>Issued By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issued By</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Issued By</em>' attribute.
     * @see #setIssuedBy(String)
     * @see asam.cc.ContainerCatalogPackage#getDocRevision_IssuedBy()
     * @model
     * @generated
     */
    String getIssuedBy();

    /**
     * Sets the value of the '{@link asam.cc.DocRevision#getIssuedBy <em>Issued By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Issued By</em>' attribute.
     * @see #getIssuedBy()
     * @generated
     */
    void setIssuedBy(String value);

    /**
     * Returns the value of the '<em><b>Modification</b></em>' reference list.
     * The list contents are of type {@link asam.cc.Modififaction}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modification</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modification</em>' reference list.
     * @see asam.cc.ContainerCatalogPackage#getDocRevision_Modification()
     * @model
     * @generated
     */
    EList<Modififaction> getModification();

    /**
     * Returns the value of the '<em><b>Revision Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Revision Label</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Revision Label</em>' attribute.
     * @see #setRevisionLabel(String)
     * @see asam.cc.ContainerCatalogPackage#getDocRevision_RevisionLabel()
     * @model dataType="asam.cc.RevisionLabelString"
     * @generated
     */
    String getRevisionLabel();

    /**
     * Sets the value of the '{@link asam.cc.DocRevision#getRevisionLabel <em>Revision Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Revision Label</em>' attribute.
     * @see #getRevisionLabel()
     * @generated
     */
    void setRevisionLabel(String value);

    /**
     * Returns the value of the '<em><b>Revision Label P1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Revision Label P1</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Revision Label P1</em>' attribute.
     * @see #setRevisionLabelP1(String)
     * @see asam.cc.ContainerCatalogPackage#getDocRevision_RevisionLabelP1()
     * @model dataType="asam.cc.RevisionLabelString"
     * @generated
     */
    String getRevisionLabelP1();

    /**
     * Sets the value of the '{@link asam.cc.DocRevision#getRevisionLabelP1 <em>Revision Label P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Revision Label P1</em>' attribute.
     * @see #getRevisionLabelP1()
     * @generated
     */
    void setRevisionLabelP1(String value);

    /**
     * Returns the value of the '<em><b>Revision Label P2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Revision Label P2</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Revision Label P2</em>' attribute.
     * @see #setRevisionLabelP2(String)
     * @see asam.cc.ContainerCatalogPackage#getDocRevision_RevisionLabelP2()
     * @model dataType="asam.cc.RevisionLabelString"
     * @generated
     */
    String getRevisionLabelP2();

    /**
     * Sets the value of the '{@link asam.cc.DocRevision#getRevisionLabelP2 <em>Revision Label P2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Revision Label P2</em>' attribute.
     * @see #getRevisionLabelP2()
     * @generated
     */
    void setRevisionLabelP2(String value);

    /**
     * Returns the value of the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>State</em>' attribute.
     * @see #setState(String)
     * @see asam.cc.ContainerCatalogPackage#getDocRevision_State()
     * @model dataType="asam.cc.NameToken"
     * @generated
     */
    String getState();

    /**
     * Sets the value of the '{@link asam.cc.DocRevision#getState <em>State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' attribute.
     * @see #getState()
     * @generated
     */
    void setState(String value);

} // DocRevision
