/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodSpecificationImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodSpecificationImpl#getHierachy <em>Hierachy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MethodSpecificationImpl extends EntityImpl implements MethodSpecification
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSpecificationImpl()
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
		return StructurePackage.Literals.METHOD_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getSignature()
	{
		return (Signature)eGet(StructurePackage.Literals.METHOD_SPECIFICATION__SIGNATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(Signature newSignature)
	{
		eSet(StructurePackage.Literals.METHOD_SPECIFICATION__SIGNATURE, newSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<AssemblyContext> getHierachy()
	{
		return (List<AssemblyContext>)eGet(StructurePackage.Literals.METHOD_SPECIFICATION__HIERACHY, true);
	}

} //MethodSpecificationImpl
