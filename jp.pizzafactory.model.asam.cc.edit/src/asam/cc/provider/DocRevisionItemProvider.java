/**
 */
package asam.cc.provider;


import asam.cc.ContainerCatalogPackage;
import asam.cc.DocRevision;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link asam.cc.DocRevision} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocRevisionItemProvider extends ARObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocRevisionItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addDatePropertyDescriptor(object);
            addIssuedByPropertyDescriptor(object);
            addModificationPropertyDescriptor(object);
            addRevisionLabelPropertyDescriptor(object);
            addRevisionLabelP1PropertyDescriptor(object);
            addRevisionLabelP2PropertyDescriptor(object);
            addStatePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocRevision_date_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocRevision_date_feature", "_UI_DocRevision_type"),
                 ContainerCatalogPackage.Literals.DOC_REVISION__DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Issued By feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIssuedByPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocRevision_issuedBy_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocRevision_issuedBy_feature", "_UI_DocRevision_type"),
                 ContainerCatalogPackage.Literals.DOC_REVISION__ISSUED_BY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Modification feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModificationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocRevision_modification_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocRevision_modification_feature", "_UI_DocRevision_type"),
                 ContainerCatalogPackage.Literals.DOC_REVISION__MODIFICATION,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Revision Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRevisionLabelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocRevision_revisionLabel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocRevision_revisionLabel_feature", "_UI_DocRevision_type"),
                 ContainerCatalogPackage.Literals.DOC_REVISION__REVISION_LABEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Revision Label P1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRevisionLabelP1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocRevision_revisionLabelP1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocRevision_revisionLabelP1_feature", "_UI_DocRevision_type"),
                 ContainerCatalogPackage.Literals.DOC_REVISION__REVISION_LABEL_P1,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Revision Label P2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRevisionLabelP2PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocRevision_revisionLabelP2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocRevision_revisionLabelP2_feature", "_UI_DocRevision_type"),
                 ContainerCatalogPackage.Literals.DOC_REVISION__REVISION_LABEL_P2,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the State feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocRevision_state_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocRevision_state_feature", "_UI_DocRevision_type"),
                 ContainerCatalogPackage.Literals.DOC_REVISION__STATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns DocRevision.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DocRevision"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((DocRevision)object).getChecksum();
        return label == null || label.length() == 0 ?
            getString("_UI_DocRevision_type") :
            getString("_UI_DocRevision_type") + " " + label;
    }
    

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(DocRevision.class)) {
            case ContainerCatalogPackage.DOC_REVISION__DATE:
            case ContainerCatalogPackage.DOC_REVISION__ISSUED_BY:
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL:
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P1:
            case ContainerCatalogPackage.DOC_REVISION__REVISION_LABEL_P2:
            case ContainerCatalogPackage.DOC_REVISION__STATE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
