/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Entity Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemEntityAttributeImpl#getModelEntity <em>Model Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemEntityAttributeImpl extends AttributeImpl implements SystemEntityAttribute
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemEntityAttributeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SystemcontextPackage.Literals.SYSTEM_ENTITY_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getModelEntity()
	{
		return (Entity)eGet(SystemcontextPackage.Literals.SYSTEM_ENTITY_ATTRIBUTE__MODEL_ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelEntity(Entity newModelEntity)
	{
		eSet(SystemcontextPackage.Literals.SYSTEM_ENTITY_ATTRIBUTE__MODEL_ENTITY, newModelEntity);
	}

} //SystemEntityAttributeImpl
