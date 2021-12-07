/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getResourcecontainer <em>Resourcecontainer</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getLinkingresource <em>Linkingresource</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getCompositecomponent <em>Compositecomponent</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getBasiccomponent <em>Basiccomponent</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getMethodspecification <em>Methodspecification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getPCMElement()
 * @model
 * @generated
 */
public interface PCMElement extends Entity
{
	/**
	 * Returns the value of the '<em><b>Resourcecontainer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourcecontainer</em>' reference.
	 * @see #setResourcecontainer(ResourceContainer)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getPCMElement_Resourcecontainer()
	 * @model
	 * @generated
	 */
	ResourceContainer getResourcecontainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getResourcecontainer <em>Resourcecontainer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resourcecontainer</em>' reference.
	 * @see #getResourcecontainer()
	 * @generated
	 */
	void setResourcecontainer(ResourceContainer value);

	/**
	 * Returns the value of the '<em><b>Linkingresource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkingresource</em>' reference.
	 * @see #setLinkingresource(LinkingResource)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getPCMElement_Linkingresource()
	 * @model
	 * @generated
	 */
	LinkingResource getLinkingresource();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getLinkingresource <em>Linkingresource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkingresource</em>' reference.
	 * @see #getLinkingresource()
	 * @generated
	 */
	void setLinkingresource(LinkingResource value);

	/**
	 * Returns the value of the '<em><b>Compositecomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositecomponent</em>' reference.
	 * @see #setCompositecomponent(CompositeComponent)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getPCMElement_Compositecomponent()
	 * @model
	 * @generated
	 */
	CompositeComponent getCompositecomponent();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getCompositecomponent <em>Compositecomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compositecomponent</em>' reference.
	 * @see #getCompositecomponent()
	 * @generated
	 */
	void setCompositecomponent(CompositeComponent value);

	/**
	 * Returns the value of the '<em><b>Basiccomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basiccomponent</em>' reference.
	 * @see #setBasiccomponent(RepositoryComponent)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getPCMElement_Basiccomponent()
	 * @model
	 * @generated
	 */
	RepositoryComponent getBasiccomponent();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getBasiccomponent <em>Basiccomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basiccomponent</em>' reference.
	 * @see #getBasiccomponent()
	 * @generated
	 */
	void setBasiccomponent(RepositoryComponent value);

	/**
	 * Returns the value of the '<em><b>Assemblycontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblycontext</em>' reference.
	 * @see #setAssemblycontext(AssemblyContext)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getPCMElement_Assemblycontext()
	 * @model
	 * @generated
	 */
	AssemblyContext getAssemblycontext();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getAssemblycontext <em>Assemblycontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assemblycontext</em>' reference.
	 * @see #getAssemblycontext()
	 * @generated
	 */
	void setAssemblycontext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Methodspecification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodspecification</em>' containment reference.
	 * @see #setMethodspecification(MethodSpecification)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getPCMElement_Methodspecification()
	 * @model containment="true"
	 * @generated
	 */
	MethodSpecification getMethodspecification();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement#getMethodspecification <em>Methodspecification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodspecification</em>' containment reference.
	 * @see #getMethodspecification()
	 * @generated
	 */
	void setMethodspecification(MethodSpecification value);

} // PCMElement
