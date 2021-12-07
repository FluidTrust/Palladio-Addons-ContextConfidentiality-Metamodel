/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getServiceRestriction()
 * @model
 * @generated
 */
public interface ServiceRestriction extends MethodSpecification
{
	/**
	 * Returns the value of the '<em><b>Assemblycontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblycontext</em>' reference.
	 * @see #setAssemblycontext(AssemblyContext)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getServiceRestriction_Assemblycontext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAssemblycontext();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction#getAssemblycontext <em>Assemblycontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assemblycontext</em>' reference.
	 * @see #getAssemblycontext()
	 * @generated
	 */
	void setAssemblycontext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(ResourceDemandingSEFF)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getServiceRestriction_Service()
	 * @model required="true"
	 * @generated
	 */
	ResourceDemandingSEFF getService();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ResourceDemandingSEFF value);

} // ServiceRestriction
