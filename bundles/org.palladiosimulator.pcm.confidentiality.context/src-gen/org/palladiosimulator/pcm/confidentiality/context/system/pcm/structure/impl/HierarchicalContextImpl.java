/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchical Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.HierarchicalContextImpl#getHierachy <em>Hierachy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HierarchicalContextImpl extends CDOObjectImpl implements HierarchicalContext
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchicalContextImpl()
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
		return StructurePackage.Literals.HIERARCHICAL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
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

} //HierarchicalContextImpl
