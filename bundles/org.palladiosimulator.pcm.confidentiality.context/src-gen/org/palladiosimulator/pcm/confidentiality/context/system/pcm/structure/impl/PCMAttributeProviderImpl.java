/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider;
import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;
import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionRestriction;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Attribute Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.PCMAttributeProviderImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.PCMAttributeProviderImpl#getResourcecontainer <em>Resourcecontainer</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.PCMAttributeProviderImpl#getAssemblycontext <em>Assemblycontext</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.PCMAttributeProviderImpl#getLinkingresource <em>Linkingresource</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.PCMAttributeProviderImpl#getMethodspecification <em>Methodspecification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMAttributeProviderImpl extends EntityImpl implements PCMAttributeProvider
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMAttributeProviderImpl()
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
		return StructurePackage.Literals.PCM_ATTRIBUTE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageSpecification getAttribute()
	{
		return (UsageSpecification)eGet(SystemPackage.Literals.ATTRIBUTE_PROVIDER__ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(UsageSpecification newAttribute)
	{
		eSet(SystemPackage.Literals.ATTRIBUTE_PROVIDER__ATTRIBUTE, newAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer getResourcecontainer()
	{
		return (ResourceContainer)eGet(StructurePackage.Literals.PCM_ATTRIBUTE_PROVIDER__RESOURCECONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourcecontainer(ResourceContainer newResourcecontainer)
	{
		eSet(StructurePackage.Literals.PCM_ATTRIBUTE_PROVIDER__RESOURCECONTAINER, newResourcecontainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblycontext()
	{
		return (AssemblyContext)eGet(StructurePackage.Literals.PCM_ATTRIBUTE_PROVIDER__ASSEMBLYCONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblycontext(AssemblyContext newAssemblycontext)
	{
		eSet(StructurePackage.Literals.PCM_ATTRIBUTE_PROVIDER__ASSEMBLYCONTEXT, newAssemblycontext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkingResource getLinkingresource()
	{
		return (LinkingResource)eGet(StructurePackage.Literals.PCM_ATTRIBUTE_PROVIDER__LINKINGRESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkingresource(LinkingResource newLinkingresource)
	{
		eSet(StructurePackage.Literals.PCM_ATTRIBUTE_PROVIDER__LINKINGRESOURCE, newLinkingresource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionRestriction getMethodspecification()
	{
		return (ConnectionRestriction)eGet(StructurePackage.Literals.PCM_ATTRIBUTE_PROVIDER__METHODSPECIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodspecification(ConnectionRestriction newMethodspecification)
	{
		eSet(StructurePackage.Literals.PCM_ATTRIBUTE_PROVIDER__METHODSPECIFICATION, newMethodspecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == AttributeProvider.class)
		{
			switch (derivedFeatureID)
			{
				case StructurePackage.PCM_ATTRIBUTE_PROVIDER__ATTRIBUTE: return SystemPackage.ATTRIBUTE_PROVIDER__ATTRIBUTE;
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
		if (baseClass == AttributeProvider.class)
		{
			switch (baseFeatureID)
			{
				case SystemPackage.ATTRIBUTE_PROVIDER__ATTRIBUTE: return StructurePackage.PCM_ATTRIBUTE_PROVIDER__ATTRIBUTE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PCMAttributeProviderImpl
