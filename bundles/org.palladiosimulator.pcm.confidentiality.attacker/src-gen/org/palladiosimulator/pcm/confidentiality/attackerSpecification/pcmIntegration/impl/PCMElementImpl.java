/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PCMElementImpl#getResourcecontainer <em>Resourcecontainer</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PCMElementImpl#getLinkingresource <em>Linkingresource</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PCMElementImpl#getCompositecomponent <em>Compositecomponent</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PCMElementImpl#getBasiccomponent <em>Basiccomponent</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PCMElementImpl#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PCMElementImpl#getMethodspecification <em>Methodspecification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMElementImpl extends EntityImpl implements PCMElement
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMElementImpl()
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
		return PcmIntegrationPackage.Literals.PCM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer getResourcecontainer()
	{
		return (ResourceContainer)eGet(PcmIntegrationPackage.Literals.PCM_ELEMENT__RESOURCECONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourcecontainer(ResourceContainer newResourcecontainer)
	{
		eSet(PcmIntegrationPackage.Literals.PCM_ELEMENT__RESOURCECONTAINER, newResourcecontainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkingResource getLinkingresource()
	{
		return (LinkingResource)eGet(PcmIntegrationPackage.Literals.PCM_ELEMENT__LINKINGRESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkingresource(LinkingResource newLinkingresource)
	{
		eSet(PcmIntegrationPackage.Literals.PCM_ELEMENT__LINKINGRESOURCE, newLinkingresource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeComponent getCompositecomponent()
	{
		return (CompositeComponent)eGet(PcmIntegrationPackage.Literals.PCM_ELEMENT__COMPOSITECOMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositecomponent(CompositeComponent newCompositecomponent)
	{
		eSet(PcmIntegrationPackage.Literals.PCM_ELEMENT__COMPOSITECOMPONENT, newCompositecomponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getBasiccomponent()
	{
		return (RepositoryComponent)eGet(PcmIntegrationPackage.Literals.PCM_ELEMENT__BASICCOMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasiccomponent(RepositoryComponent newBasiccomponent)
	{
		eSet(PcmIntegrationPackage.Literals.PCM_ELEMENT__BASICCOMPONENT, newBasiccomponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblycontext()
	{
		return (AssemblyContext)eGet(PcmIntegrationPackage.Literals.PCM_ELEMENT__ASSEMBLYCONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblycontext(AssemblyContext newAssemblycontext)
	{
		eSet(PcmIntegrationPackage.Literals.PCM_ELEMENT__ASSEMBLYCONTEXT, newAssemblycontext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodSpecification getMethodspecification()
	{
		return (MethodSpecification)eGet(PcmIntegrationPackage.Literals.PCM_ELEMENT__METHODSPECIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodspecification(MethodSpecification newMethodspecification)
	{
		eSet(PcmIntegrationPackage.Literals.PCM_ELEMENT__METHODSPECIFICATION, newMethodspecification);
	}

} //PCMElementImpl
