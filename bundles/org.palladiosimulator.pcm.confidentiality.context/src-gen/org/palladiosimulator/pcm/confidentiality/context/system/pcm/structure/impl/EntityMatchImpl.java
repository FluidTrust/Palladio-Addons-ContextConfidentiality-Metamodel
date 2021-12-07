/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.Category;

import org.palladiosimulator.pcm.confidentiality.context.policy.impl.MatchImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.EntityMatchImpl#getHierachy <em>Hierachy</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.EntityMatchImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.EntityMatchImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityMatchImpl extends MatchImpl implements EntityMatch
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityMatchImpl()
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
		return StructurePackage.Literals.ENTITY_MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<AssemblyContext> getHierachy()
	{
		return (List<AssemblyContext>)eGet(StructurePackage.Literals.HIERARCHICAL_CONTEXT__HIERACHY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity()
	{
		return (Entity)eGet(StructurePackage.Literals.ENTITY_MATCH__ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity)
	{
		eSet(StructurePackage.Literals.ENTITY_MATCH__ENTITY, newEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory()
	{
		return (Category)eGet(StructurePackage.Literals.ENTITY_MATCH__CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory)
	{
		eSet(StructurePackage.Literals.ENTITY_MATCH__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == HierarchicalContext.class)
		{
			switch (derivedFeatureID)
			{
				case StructurePackage.ENTITY_MATCH__HIERACHY: return StructurePackage.HIERARCHICAL_CONTEXT__HIERACHY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == HierarchicalContext.class)
		{
			switch (baseFeatureID)
			{
				case StructurePackage.HIERARCHICAL_CONTEXT__HIERACHY: return StructurePackage.ENTITY_MATCH__HIERACHY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntityMatchImpl
