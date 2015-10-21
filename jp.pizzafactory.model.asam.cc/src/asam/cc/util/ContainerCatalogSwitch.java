/**
 */
package asam.cc.util;

import asam.cc.*;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see asam.cc.ContainerCatalogPackage
 * @generated
 */
public class ContainerCatalogSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ContainerCatalogPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerCatalogSwitch() {
        if (modelPackage == null) {
            modelPackage = ContainerCatalogPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ContainerCatalogPackage.CATALOG: {
                Catalog catalog = (Catalog)theEObject;
                T result = caseCatalog(catalog);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.ADMIN_DATA: {
                AdminData adminData = (AdminData)theEObject;
                T result = caseAdminData(adminData);
                if (result == null) result = caseARObject(adminData);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.SDG: {
                Sdg sdg = (Sdg)theEObject;
                T result = caseSdg(sdg);
                if (result == null) result = caseARObject(sdg);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.SDG_CAPTION: {
                SdgCaption sdgCaption = (SdgCaption)theEObject;
                T result = caseSdgCaption(sdgCaption);
                if (result == null) result = caseReferrable(sdgCaption);
                if (result == null) result = caseARObject(sdgCaption);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.SD: {
                Sd sd = (Sd)theEObject;
                T result = caseSd(sd);
                if (result == null) result = caseARObject(sd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.SDF: {
                Sdf sdf = (Sdf)theEObject;
                T result = caseSdf(sdf);
                if (result == null) result = caseARObject(sdf);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.REFERRABLE: {
                Referrable referrable = (Referrable)theEObject;
                T result = caseReferrable(referrable);
                if (result == null) result = caseARObject(referrable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.IDENTIFIER: {
                Identifier identifier = (Identifier)theEObject;
                T result = caseIdentifier(identifier);
                if (result == null) result = caseARObject(identifier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.SHORT_NAME_FRAGMENT: {
                ShortNameFragment shortNameFragment = (ShortNameFragment)theEObject;
                T result = caseShortNameFragment(shortNameFragment);
                if (result == null) result = caseARObject(shortNameFragment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.SDG_CONTENTS: {
                SdgContents sdgContents = (SdgContents)theEObject;
                T result = caseSdgContents(sdgContents);
                if (result == null) result = caseARObject(sdgContents);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.STRING_TO_STRING_MAP: {
                @SuppressWarnings("unchecked") Map.Entry<String, String> stringToStringMap = (Map.Entry<String, String>)theEObject;
                T result = caseStringToStringMap(stringToStringMap);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.DOC_REVISION: {
                DocRevision docRevision = (DocRevision)theEObject;
                T result = caseDocRevision(docRevision);
                if (result == null) result = caseARObject(docRevision);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.MODIFIFACTION: {
                Modififaction modififaction = (Modififaction)theEObject;
                T result = caseModififaction(modififaction);
                if (result == null) result = caseARObject(modififaction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.MULTI_LANGUAGE_OVERVIEW_PARAGRAPH: {
                MultiLanguageOverviewParagraph multiLanguageOverviewParagraph = (MultiLanguageOverviewParagraph)theEObject;
                T result = caseMultiLanguageOverviewParagraph(multiLanguageOverviewParagraph);
                if (result == null) result = caseARObject(multiLanguageOverviewParagraph);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.LOVERVIEW_PARAGRAPH: {
                LOverviewParagraph lOverviewParagraph = (LOverviewParagraph)theEObject;
                T result = caseLOverviewParagraph(lOverviewParagraph);
                if (result == null) result = caseARObject(lOverviewParagraph);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.MULTI_LANGUAGE_PLAIN_TEXT: {
                MultiLanguagePlainText multiLanguagePlainText = (MultiLanguagePlainText)theEObject;
                T result = caseMultiLanguagePlainText(multiLanguagePlainText);
                if (result == null) result = caseARObject(multiLanguagePlainText);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.AR_OBJECT: {
                ARObject arObject = (ARObject)theEObject;
                T result = caseARObject(arObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.ABLOCK: {
                Ablock ablock = (Ablock)theEObject;
                T result = caseAblock(ablock);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ContainerCatalogPackage.AREF: {
                @SuppressWarnings("unchecked") Map.Entry<String, String> aref = (Map.Entry<String, String>)theEObject;
                T result = caseAref(aref);
                if (result == null) result = caseStringToStringMap((Map.Entry<String, String>)aref);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Catalog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Catalog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCatalog(Catalog object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Admin Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Admin Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdminData(AdminData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sdg</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sdg</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSdg(Sdg object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sdg Caption</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sdg Caption</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSdgCaption(SdgCaption object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sd</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sd</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSd(Sd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sdf</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sdf</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSdf(Sdf object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferrable(Referrable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Short Name Fragment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Short Name Fragment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShortNameFragment(ShortNameFragment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sdg Contents</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sdg Contents</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSdgContents(SdgContents object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String To String Map</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String To String Map</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringToStringMap(Map.Entry<String, String> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Doc Revision</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Doc Revision</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocRevision(DocRevision object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Modififaction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Modififaction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModififaction(Modififaction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multi Language Overview Paragraph</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multi Language Overview Paragraph</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiLanguageOverviewParagraph(MultiLanguageOverviewParagraph object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LOverview Paragraph</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LOverview Paragraph</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLOverviewParagraph(LOverviewParagraph object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multi Language Plain Text</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multi Language Plain Text</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiLanguagePlainText(MultiLanguagePlainText object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>AR Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>AR Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseARObject(ARObject object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ablock</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ablock</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAblock(Ablock object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Aref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Aref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAref(Map.Entry<String, String> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ContainerCatalogSwitch
