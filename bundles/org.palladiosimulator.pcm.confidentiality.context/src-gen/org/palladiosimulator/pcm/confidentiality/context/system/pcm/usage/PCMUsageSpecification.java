/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage;

import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Usage Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#getEntrylevelsystemcall <em>Entrylevelsystemcall</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#getUsagescenario <em>Usagescenario</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#isMissageUse <em>Missage Use</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage#getPCMUsageSpecification()
 * @model
 * @generated
 */
public interface PCMUsageSpecification extends UsageSpecification
{
	/**
	 * Returns the value of the '<em><b>Entrylevelsystemcall</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrylevelsystemcall</em>' reference.
	 * @see #setEntrylevelsystemcall(EntryLevelSystemCall)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage#getPCMUsageSpecification_Entrylevelsystemcall()
	 * @model
	 * @generated
	 */
	EntryLevelSystemCall getEntrylevelsystemcall();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#getEntrylevelsystemcall <em>Entrylevelsystemcall</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrylevelsystemcall</em>' reference.
	 * @see #getEntrylevelsystemcall()
	 * @generated
	 */
	void setEntrylevelsystemcall(EntryLevelSystemCall value);

	/**
	 * Returns the value of the '<em><b>Usagescenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usagescenario</em>' reference.
	 * @see #setUsagescenario(UsageScenario)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage#getPCMUsageSpecification_Usagescenario()
	 * @model
	 * @generated
	 */
	UsageScenario getUsagescenario();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#getUsagescenario <em>Usagescenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usagescenario</em>' reference.
	 * @see #getUsagescenario()
	 * @generated
	 */
	void setUsagescenario(UsageScenario value);

	/**
	 * Returns the value of the '<em><b>Missage Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missage Use</em>' attribute.
	 * @see #setMissageUse(boolean)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage#getPCMUsageSpecification_MissageUse()
	 * @model
	 * @generated
	 */
	boolean isMissageUse();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification#isMissageUse <em>Missage Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missage Use</em>' attribute.
	 * @see #isMissageUse()
	 * @generated
	 */
	void setMissageUse(boolean value);

} // PCMUsageSpecification
