/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.system.impl.UsageSpecificationImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage;

import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Usage Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.PCMUsageSpecificationImpl#getEntrylevelsystemcall <em>Entrylevelsystemcall</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.PCMUsageSpecificationImpl#getUsagescenario <em>Usagescenario</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.PCMUsageSpecificationImpl#isMissageUse <em>Missage Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMUsageSpecificationImpl extends UsageSpecificationImpl implements PCMUsageSpecification
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMUsageSpecificationImpl()
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
		return UsagePackage.Literals.PCM_USAGE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryLevelSystemCall getEntrylevelsystemcall()
	{
		return (EntryLevelSystemCall)eGet(UsagePackage.Literals.PCM_USAGE_SPECIFICATION__ENTRYLEVELSYSTEMCALL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntrylevelsystemcall(EntryLevelSystemCall newEntrylevelsystemcall)
	{
		eSet(UsagePackage.Literals.PCM_USAGE_SPECIFICATION__ENTRYLEVELSYSTEMCALL, newEntrylevelsystemcall);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenario getUsagescenario()
	{
		return (UsageScenario)eGet(UsagePackage.Literals.PCM_USAGE_SPECIFICATION__USAGESCENARIO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsagescenario(UsageScenario newUsagescenario)
	{
		eSet(UsagePackage.Literals.PCM_USAGE_SPECIFICATION__USAGESCENARIO, newUsagescenario);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMissageUse()
	{
		return (Boolean)eGet(UsagePackage.Literals.PCM_USAGE_SPECIFICATION__MISSAGE_USE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissageUse(boolean newMissageUse)
	{
		eSet(UsagePackage.Literals.PCM_USAGE_SPECIFICATION__MISSAGE_USE, newMissageUse);
	}

} //PCMUsageSpecificationImpl
