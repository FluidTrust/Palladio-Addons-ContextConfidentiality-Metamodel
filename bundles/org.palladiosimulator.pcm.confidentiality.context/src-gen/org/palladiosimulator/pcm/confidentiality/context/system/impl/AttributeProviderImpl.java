/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider;
import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;
import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.impl.AttributeProviderImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AttributeProviderImpl extends CDOObjectImpl implements AttributeProvider
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeProviderImpl()
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
		return SystemPackage.Literals.ATTRIBUTE_PROVIDER;
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

} //AttributeProviderImpl
