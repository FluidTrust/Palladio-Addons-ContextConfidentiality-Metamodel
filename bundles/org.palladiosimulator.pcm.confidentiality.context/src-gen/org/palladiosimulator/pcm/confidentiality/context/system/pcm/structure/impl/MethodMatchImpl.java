/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.impl.MatchImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodMatch;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodMatchImpl#getHierachy <em>Hierachy</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodMatchImpl#getMethodspecification <em>Methodspecification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodMatchImpl extends MatchImpl implements MethodMatch
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodMatchImpl()
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
		return StructurePackage.Literals.METHOD_MATCH;
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
	public MethodSpecification getMethodspecification()
	{
		return (MethodSpecification)eGet(StructurePackage.Literals.METHOD_MATCH__METHODSPECIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodspecification(MethodSpecification newMethodspecification)
	{
		eSet(StructurePackage.Literals.METHOD_MATCH__METHODSPECIFICATION, newMethodspecification);
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
				case StructurePackage.METHOD_MATCH__HIERACHY: return StructurePackage.HIERARCHICAL_CONTEXT__HIERACHY;
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
				case StructurePackage.HIERARCHICAL_CONTEXT__HIERACHY: return StructurePackage.METHOD_MATCH__HIERACHY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MethodMatchImpl
