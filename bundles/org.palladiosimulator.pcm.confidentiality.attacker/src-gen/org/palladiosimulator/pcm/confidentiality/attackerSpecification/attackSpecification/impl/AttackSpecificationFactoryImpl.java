/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackSpecificationFactoryImpl extends EFactoryImpl implements AttackSpecificationFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttackSpecificationFactory init()
	{
		try
		{
			AttackSpecificationFactory theAttackSpecificationFactory = (AttackSpecificationFactory)EPackage.Registry.INSTANCE.getEFactory(AttackSpecificationPackage.eNS_URI);
			if (theAttackSpecificationFactory != null)
			{
				return theAttackSpecificationFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AttackSpecificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackSpecificationFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case AttackSpecificationPackage.CVE_VULNERABILITY: return createCVEVulnerability();
			case AttackSpecificationPackage.CWEID: return createCWEID();
			case AttackSpecificationPackage.CWE_ATTACK: return createCWEAttack();
			case AttackSpecificationPackage.CVE_ATTACK: return createCVEAttack();
			case AttackSpecificationPackage.CVEID: return createCVEID();
			case AttackSpecificationPackage.CWE_VULNERABILITY: return createCWEVulnerability();
			case AttackSpecificationPackage.ROLE: return createRole();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case AttackSpecificationPackage.ATTACK_VECTOR:
				return createAttackVectorFromString(eDataType, initialValue);
			case AttackSpecificationPackage.PRIVILEGES:
				return createPrivilegesFromString(eDataType, initialValue);
			case AttackSpecificationPackage.CONFIDENTIALITY_IMPACT:
				return createConfidentialityImpactFromString(eDataType, initialValue);
			case AttackSpecificationPackage.INTEGRITY_IMPACT:
				return createIntegrityImpactFromString(eDataType, initialValue);
			case AttackSpecificationPackage.AVAILABILITY_IMPACT:
				return createAvailabilityImpactFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case AttackSpecificationPackage.ATTACK_VECTOR:
				return convertAttackVectorToString(eDataType, instanceValue);
			case AttackSpecificationPackage.PRIVILEGES:
				return convertPrivilegesToString(eDataType, instanceValue);
			case AttackSpecificationPackage.CONFIDENTIALITY_IMPACT:
				return convertConfidentialityImpactToString(eDataType, instanceValue);
			case AttackSpecificationPackage.INTEGRITY_IMPACT:
				return convertIntegrityImpactToString(eDataType, instanceValue);
			case AttackSpecificationPackage.AVAILABILITY_IMPACT:
				return convertAvailabilityImpactToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVEVulnerability createCVEVulnerability()
	{
		CVEVulnerabilityImpl cveVulnerability = new CVEVulnerabilityImpl();
		return cveVulnerability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWEID createCWEID()
	{
		CWEIDImpl cweid = new CWEIDImpl();
		return cweid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWEAttack createCWEAttack()
	{
		CWEAttackImpl cweAttack = new CWEAttackImpl();
		return cweAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVEAttack createCVEAttack()
	{
		CVEAttackImpl cveAttack = new CVEAttackImpl();
		return cveAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVEID createCVEID()
	{
		CVEIDImpl cveid = new CVEIDImpl();
		return cveid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWEVulnerability createCWEVulnerability()
	{
		CWEVulnerabilityImpl cweVulnerability = new CWEVulnerabilityImpl();
		return cweVulnerability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole()
	{
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackVector createAttackVectorFromString(EDataType eDataType, String initialValue)
	{
		AttackVector result = AttackVector.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttackVectorToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Privileges createPrivilegesFromString(EDataType eDataType, String initialValue)
	{
		Privileges result = Privileges.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrivilegesToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialityImpact createConfidentialityImpactFromString(EDataType eDataType, String initialValue)
	{
		ConfidentialityImpact result = ConfidentialityImpact.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityImpactToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityImpact createIntegrityImpactFromString(EDataType eDataType, String initialValue)
	{
		IntegrityImpact result = IntegrityImpact.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegrityImpactToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityImpact createAvailabilityImpactFromString(EDataType eDataType, String initialValue)
	{
		AvailabilityImpact result = AvailabilityImpact.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvailabilityImpactToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackSpecificationPackage getAttackSpecificationPackage()
	{
		return (AttackSpecificationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AttackSpecificationPackage getPackage()
	{
		return AttackSpecificationPackage.eINSTANCE;
	}

} //AttackSpecificationFactoryImpl
