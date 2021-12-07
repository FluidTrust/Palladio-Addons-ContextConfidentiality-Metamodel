/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure;

import org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Attribute Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getResourcecontainer <em>Resourcecontainer</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getLinkingresource <em>Linkingresource</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getMethodspecification <em>Methodspecification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getPCMAttributeProvider()
 * @model
 * @generated
 */
public interface PCMAttributeProvider extends Entity, AttributeProvider
{
	/**
	 * Returns the value of the '<em><b>Resourcecontainer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourcecontainer</em>' reference.
	 * @see #setResourcecontainer(ResourceContainer)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getPCMAttributeProvider_Resourcecontainer()
	 * @model
	 * @generated
	 */
	ResourceContainer getResourcecontainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getResourcecontainer <em>Resourcecontainer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resourcecontainer</em>' reference.
	 * @see #getResourcecontainer()
	 * @generated
	 */
	void setResourcecontainer(ResourceContainer value);

	/**
	 * Returns the value of the '<em><b>Assemblycontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblycontext</em>' reference.
	 * @see #setAssemblycontext(AssemblyContext)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getPCMAttributeProvider_Assemblycontext()
	 * @model
	 * @generated
	 */
	AssemblyContext getAssemblycontext();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getAssemblycontext <em>Assemblycontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assemblycontext</em>' reference.
	 * @see #getAssemblycontext()
	 * @generated
	 */
	void setAssemblycontext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Linkingresource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkingresource</em>' reference.
	 * @see #setLinkingresource(LinkingResource)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getPCMAttributeProvider_Linkingresource()
	 * @model
	 * @generated
	 */
	LinkingResource getLinkingresource();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getLinkingresource <em>Linkingresource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkingresource</em>' reference.
	 * @see #getLinkingresource()
	 * @generated
	 */
	void setLinkingresource(LinkingResource value);

	/**
	 * Returns the value of the '<em><b>Methodspecification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodspecification</em>' reference.
	 * @see #setMethodspecification(ConnectionRestriction)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getPCMAttributeProvider_Methodspecification()
	 * @model
	 * @generated
	 */
	ConnectionRestriction getMethodspecification();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getMethodspecification <em>Methodspecification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodspecification</em>' reference.
	 * @see #getMethodspecification()
	 * @generated
	 */
	void setMethodspecification(ConnectionRestriction value);

} // PCMAttributeProvider
