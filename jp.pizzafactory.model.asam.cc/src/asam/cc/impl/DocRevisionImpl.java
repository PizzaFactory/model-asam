/**
 */
package asam.cc.impl;

import asam.cc.ContainerCatalogPackage;
import asam.cc.DocRevision;
import asam.cc.Modififaction;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asam.cc.impl.DocRevisionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link asam.cc.impl.DocRevisionImpl#getIssuedBy <em>Issued By</em>}</li>
 *   <li>{@link asam.cc.impl.DocRevisionImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link asam.cc.impl.DocRevisionImpl#getRevisionLabel <em>Revision Label</em>}</li>
 *   <li>{@link asam.cc.impl.DocRevisionImpl#getRevisionLabelP1 <em>Revision Label P1</em>}</li>
 *   <li>{@link asam.cc.impl.DocRevisionImpl#getRevisionLabelP2 <em>Revision Label P2</em>}</li>
 *   <li>{@link asam.cc.impl.DocRevisionImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocRevisionImpl extends ARObjectImpl implements DocRevision {
    /**
     * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected static final Date DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected Date date = DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getIssuedBy() <em>Issued By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuedBy()
     * @generated
     * @ordered
     */
    protected static final String ISSUED_BY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIssuedBy() <em>Issued By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuedBy()
     * @generated
     * @ordered
     */
    protected String issuedBy = ISSUED_BY_EDEFAULT;

    /**
     * The cached value of the '{@link #getModification() <em>Modification</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModification()
     * @generated
     * @ordered
     */
    protected EList<Modififaction> modification;

    /**
     * The default value of the '{@link #getRevisionLabel() <em>Revision Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevisionLabel()
     * @generated
     * @ordered
     */
    protected static final String REVISION_LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRevisionLabel() <em>Revision Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevisionLabel()
     * @generated
     * @ordered
     */
    protected String revisionLabel = REVISION_LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getRevisionLabelP1() <em>Revision Label P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevisionLabelP1()
     * @generated
     * @ordered
     */
    protected static final String REVISION_LABEL_P1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRevisionLabelP1() <em>Revision Label P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevisionLabelP1()
     * @generated
     * @ordered
     */
    protected String revisionLabelP1 = REVISION_LABEL_P1_EDEFAULT;

    /**
     * The default value of the '{@link #getRevisionLabelP2() <em>Revision Label P2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevisionLabelP2()
     * @generated
     * @ordered
     */
    protected static final String REVISION_LABEL_P2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRevisionLabelP2() <em>Revision Label P2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevisionLabelP2()
     * @generated
     * @ordered
     */
    protected String revisionLabelP2 = REVISION_LABEL_P2_EDEFAULT;

    /**
     * The default value of the '{@link #getState() <em>State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getState()
     * @generated
     * @ordered
     */
    protected static final String STATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getState() <em>State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getState()
     * @generated
     * @ordered
     */
    protected String state = STATE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocRevisionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainerCatalogPackage.Literals.DOC_REVISION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDate(Date newDate) {
        Date oldDate = date;
        date = newDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.DOC_REVISION__DATE, oldDate, date));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIssuedBy() {
        return issuedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIssuedBy(String newIssuedBy) {
        String oldIssuedBy = issuedBy;
        issuedBy = newIssuedBy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.DOC_REVISION__ISSUED_BY, oldIssuedBy, issuedBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Modififaction> getModification() {
        if (modification == null) {
            modification = new EObjectResolvingEList<Modififaction>(Modififaction.class, this, ContainerCatalogPackage.DOC_REVISION__MODIFICATION);
        }
        return modification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRevisionLabel() {
        return revisionLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRevisionLabel(String newRevisionLabel) {
        String oldRevisionLabel = revisionLabel;
        revisionLabel = newRevisionLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL, oldRevisionLabel, revisionLabel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRevisionLabelP1() {
        return revisionLabelP1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRevisionLabelP1(String newRevisionLabelP1) {
        String oldRevisionLabelP1 = revisionLabelP1;
        revisionLabelP1 = newRevisionLabelP1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P1, oldRevisionLabelP1, revisionLabelP1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRevisionLabelP2() {
        return revisionLabelP2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRevisionLabelP2(String newRevisionLabelP2) {
        String oldRevisionLabelP2 = revisionLabelP2;
        revisionLabelP2 = newRevisionLabelP2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P2, oldRevisionLabelP2, revisionLabelP2));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getState() {
        return state;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setState(String newState) {
        String oldState = state;
        state = newState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainerCatalogPackage.DOC_REVISION__STATE, oldState, state));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ContainerCatalogPackage.DOC_REVISION__DATE:
                return getDate();
            case ContainerCatalogPackage.DOC_REVISION__ISSUED_BY:
                return getIssuedBy();
            case ContainerCatalogPackage.DOC_REVISION__MODIFICATION:
                return getModification();
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL:
                return getRevisionLabel();
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P1:
                return getRevisionLabelP1();
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P2:
                return getRevisionLabelP2();
            case ContainerCatalogPackage.DOC_REVISION__STATE:
                return getState();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ContainerCatalogPackage.DOC_REVISION__DATE:
                setDate((Date)newValue);
                return;
            case ContainerCatalogPackage.DOC_REVISION__ISSUED_BY:
                setIssuedBy((String)newValue);
                return;
            case ContainerCatalogPackage.DOC_REVISION__MODIFICATION:
                getModification().clear();
                getModification().addAll((Collection<? extends Modififaction>)newValue);
                return;
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL:
                setRevisionLabel((String)newValue);
                return;
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P1:
                setRevisionLabelP1((String)newValue);
                return;
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P2:
                setRevisionLabelP2((String)newValue);
                return;
            case ContainerCatalogPackage.DOC_REVISION__STATE:
                setState((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ContainerCatalogPackage.DOC_REVISION__DATE:
                setDate(DATE_EDEFAULT);
                return;
            case ContainerCatalogPackage.DOC_REVISION__ISSUED_BY:
                setIssuedBy(ISSUED_BY_EDEFAULT);
                return;
            case ContainerCatalogPackage.DOC_REVISION__MODIFICATION:
                getModification().clear();
                return;
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL:
                setRevisionLabel(REVISION_LABEL_EDEFAULT);
                return;
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P1:
                setRevisionLabelP1(REVISION_LABEL_P1_EDEFAULT);
                return;
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P2:
                setRevisionLabelP2(REVISION_LABEL_P2_EDEFAULT);
                return;
            case ContainerCatalogPackage.DOC_REVISION__STATE:
                setState(STATE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ContainerCatalogPackage.DOC_REVISION__DATE:
                return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
            case ContainerCatalogPackage.DOC_REVISION__ISSUED_BY:
                return ISSUED_BY_EDEFAULT == null ? issuedBy != null : !ISSUED_BY_EDEFAULT.equals(issuedBy);
            case ContainerCatalogPackage.DOC_REVISION__MODIFICATION:
                return modification != null && !modification.isEmpty();
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL:
                return REVISION_LABEL_EDEFAULT == null ? revisionLabel != null : !REVISION_LABEL_EDEFAULT.equals(revisionLabel);
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P1:
                return REVISION_LABEL_P1_EDEFAULT == null ? revisionLabelP1 != null : !REVISION_LABEL_P1_EDEFAULT.equals(revisionLabelP1);
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P2:
                return REVISION_LABEL_P2_EDEFAULT == null ? revisionLabelP2 != null : !REVISION_LABEL_P2_EDEFAULT.equals(revisionLabelP2);
            case ContainerCatalogPackage.DOC_REVISION__STATE:
                return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (date: ");
        result.append(date);
        result.append(", issuedBy: ");
        result.append(issuedBy);
        result.append(", revisionLabel: ");
        result.append(revisionLabel);
        result.append(", revisionLabelP1: ");
        result.append(revisionLabelP1);
        result.append(", revisionLabelP2: ");
        result.append(revisionLabelP2);
        result.append(", state: ");
        result.append(state);
        result.append(')');
        return result.toString();
    }

} //DocRevisionImpl
