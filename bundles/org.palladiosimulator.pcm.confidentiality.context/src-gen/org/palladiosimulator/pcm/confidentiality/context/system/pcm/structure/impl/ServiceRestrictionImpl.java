/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.ServiceRestrictionImpl#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.ServiceRestrictionImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceRestrictionImpl extends MethodSpecificationImpl implements ServiceRestriction
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRestrictionImpl()
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
		return StructurePackage.Literals.SERVICE_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblycontext()
	{
		return (AssemblyContext)eGet(StructurePackage.Literals.SERVICE_RESTRICTION__ASSEMBLYCONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblycontext(AssemblyContext newAssemblycontext)
	{
		eSet(StructurePackage.Literals.SERVICE_RESTRICTION__ASSEMBLYCONTEXT, newAssemblycontext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDemandingSEFF getService()
	{
		return (ResourceDemandingSEFF)eGet(StructurePackage.Literals.SERVICE_RESTRICTION__SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(ResourceDemandingSEFF newService)
	{
		eSet(StructurePackage.Literals.SERVICE_RESTRICTION__SERVICE, newService);
	}

} //ServiceRestrictionImpl
