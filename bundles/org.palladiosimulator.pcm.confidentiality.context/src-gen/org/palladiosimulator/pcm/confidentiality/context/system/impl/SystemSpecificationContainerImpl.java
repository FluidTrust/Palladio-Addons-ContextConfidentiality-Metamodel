/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider;
import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;
import org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer;
import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemSpecificationContainerImpl#getAttributeprovider <em>Attributeprovider</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemSpecificationContainerImpl#getUsagespecification <em>Usagespecification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemSpecificationContainerImpl extends EntityImpl implements SystemSpecificationContainer
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemSpecificationContainerImpl()
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
		return SystemPackage.Literals.SYSTEM_SPECIFICATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<AttributeProvider> getAttributeprovider()
	{
		return (List<AttributeProvider>)eGet(SystemPackage.Literals.SYSTEM_SPECIFICATION_CONTAINER__ATTRIBUTEPROVIDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<UsageSpecification> getUsagespecification()
	{
		return (List<UsageSpecification>)eGet(SystemPackage.Literals.SYSTEM_SPECIFICATION_CONTAINER__USAGESPECIFICATION, true);
	}

} //SystemSpecificationContainerImpl
