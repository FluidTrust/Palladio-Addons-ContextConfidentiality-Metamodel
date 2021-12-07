/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyFactory;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;
import org.palladiosimulator.pcm.confidentiality.context.policy.Rule;

import org.palladiosimulator.pcm.confidentiality.context.provider.ContextEditPlugin;

import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.confidentiality.context.policy.Rule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleItemProvider extends EntityItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleItemProvider(AdapterFactory adapterFactory)
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

			addPermitPropertyDescriptor(object);
			addConditionPropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Permit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPermitPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rule_permit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rule_permit_feature", "_UI_Rule_type"),
				 PolicyPackage.Literals.RULE__PERMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rule_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rule_condition_feature", "_UI_Rule_type"),
				 PolicyPackage.Literals.RULE__CONDITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rule_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rule_target_feature", "_UI_Rule_type"),
				 PolicyPackage.Literals.RULE__TARGET,
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
			childrenFeatures.add(PolicyPackage.Literals.RULE__CONDITION);
			childrenFeatures.add(PolicyPackage.Literals.RULE__TARGET);
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
	 * This returns Rule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Rule"));
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
		String label = ((Rule)object).getEntityName();
		return label == null || label.length() == 0 ?
			getString("_UI_Rule_type") :
			getString("_UI_Rule_type") + " " + label;
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

		switch (notification.getFeatureID(Rule.class))
		{
			case PolicyPackage.RULE__PERMIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PolicyPackage.RULE__CONDITION:
			case PolicyPackage.RULE__TARGET:
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
				(PolicyPackage.Literals.RULE__CONDITION,
				 PolicyFactory.eINSTANCE.createApply()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyPackage.Literals.RULE__CONDITION,
				 PolicyFactory.eINSTANCE.createAttributeSelector()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyPackage.Literals.RULE__CONDITION,
				 PolicyFactory.eINSTANCE.createFunctionReference()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyPackage.Literals.RULE__CONDITION,
				 PolicyFactory.eINSTANCE.createAttributeDesignator()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyPackage.Literals.RULE__CONDITION,
				 PolicyFactory.eINSTANCE.createXMLString()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyPackage.Literals.RULE__CONDITION,
				 PolicyFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyPackage.Literals.RULE__CONDITION,
				 PolicyFactory.eINSTANCE.createAttributeValueReference()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyPackage.Literals.RULE__CONDITION,
				 PolicyFactory.eINSTANCE.createSimpleAttributeCondition()));

		newChildDescriptors.add
			(createChildParameter
				(PolicyPackage.Literals.RULE__TARGET,
				 PolicyFactory.eINSTANCE.createAllOf()));
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
		return ContextEditPlugin.INSTANCE;
	}

}
