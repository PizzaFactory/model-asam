/**
 */
package asam.cc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Language Overview Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asam.cc.MultiLanguageOverviewParagraph#getL2 <em>L2</em>}</li>
 * </ul>
 * </p>
 *
 * @see asam.cc.ContainerCatalogPackage#getMultiLanguageOverviewParagraph()
 * @model
 * @generated
 */
public interface MultiLanguageOverviewParagraph extends ARObject {
    /**
     * Returns the value of the '<em><b>L2</b></em>' reference list.
     * The list contents are of type {@link asam.cc.LOverviewParagraph}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>L2</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>L2</em>' reference list.
     * @see asam.cc.ContainerCatalogPackage#getMultiLanguageOverviewParagraph_L2()
     * @model required="true"
     * @generated
     */
    EList<LOverviewParagraph> getL2();

} // MultiLanguageOverviewParagraph
