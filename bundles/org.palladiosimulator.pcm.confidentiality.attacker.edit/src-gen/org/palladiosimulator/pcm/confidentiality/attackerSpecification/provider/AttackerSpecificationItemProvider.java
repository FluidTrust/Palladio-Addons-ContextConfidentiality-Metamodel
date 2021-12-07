/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackerSpecificationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerSpecificationItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addCategoryspecificationPropertyDescriptor(object);
			addSystemintegrationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Categoryspecification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryspecificationPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerSpecification_categoryspecification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerSpecification_categoryspecification_feature", "_UI_AttackerSpecification_type"),
				 AttackerPackage.Literals.ATTACKER_SPECIFICATION__CATEGORYSPECIFICATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Systemintegration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemintegrationPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerSpecification_systemintegration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerSpecification_systemintegration_feature", "_UI_AttackerSpecification_type"),
				 AttackerPackage.Literals.ATTACKER_SPECIFICATION__SYSTEMINTEGRATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(AttackerPackage.Literals.ATTACKER_SPECIFICATION__ATTACKERS);
			childrenFeatures.add(AttackerPackage.Literals.ATTACKER_SPECIFICATION__ATTACKS);
			childrenFeatures.add(AttackerPackage.Literals.ATTACKER_SPECIFICATION__VULNERABILITES);
			childrenFeatures.add(AttackerPackage.Literals.ATTACKER_SPECIFICATION__CATEGORYSPECIFICATION);
			childrenFeatures.add(AttackerPackage.Literals.ATTACKER_SPECIFICATION__SYSTEMINTEGRATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AttackerSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AttackerSpecification"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage()
	{
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return getString("_UI_AttackerSpecification_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(AttackerSpecification.class))
		{
			case AttackerPackage.ATTACKER_SPECIFICATION__ATTACKERS:
			case AttackerPackage.ATTACKER_SPECIFICATION__ATTACKS:
			case AttackerPackage.ATTACKER_SPECIFICATION__VULNERABILITES:
			case AttackerPackage.ATTACKER_SPECIFICATION__CATEGORYSPECIFICATION:
			case AttackerPackage.ATTACKER_SPECIFICATION__SYSTEMINTEGRATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AttackerPackage.Literals.ATTACKER_SPECIFICATION__ATTACKERS,
				 AttackerFactory.eINSTANCE.createAttackerContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AttackerPackage.Literals.ATTACKER_SPECIFICATION__ATTACKS,
				 AttackerFactory.eINSTANCE.createAttackContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AttackerPackage.Literals.ATTACKER_SPECIFICATION__VULNERABILITES,
				 AttackerFactory.eINSTANCE.createVulnerabilityContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AttackerPackage.Literals.ATTACKER_SPECIFICATION__CATEGORYSPECIFICATION,
				 AttackerFactory.eINSTANCE.createCategorySpecification()));

		newChildDescriptors.add
			(createChildParameter
				(AttackerPackage.Literals.ATTACKER_SPECIFICATION__SYSTEMINTEGRATION,
				 AttackerFactory.eINSTANCE.createAttackerSystemSpecificationContainer()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
