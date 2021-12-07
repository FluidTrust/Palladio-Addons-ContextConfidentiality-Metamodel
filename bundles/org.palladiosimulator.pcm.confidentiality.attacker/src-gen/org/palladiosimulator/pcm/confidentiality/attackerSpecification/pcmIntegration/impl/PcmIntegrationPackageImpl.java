/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.impl.AttackSpecificationPackageImpl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerPackageImpl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.NonGlobalCommunication;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationFactory;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.RoleSystemIntegration;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.SystemIntegration;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.VulnerabilitySystemIntegration;

import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmIntegrationPackageImpl extends EPackageImpl implements PcmIntegrationPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerabilitySystemIntegrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSystemIntegrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemIntegrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonGlobalCommunicationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PcmIntegrationPackageImpl()
	{
		super(eNS_URI, PcmIntegrationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PcmIntegrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PcmIntegrationPackage init()
	{
		if (isInited) return (PcmIntegrationPackage)EPackage.Registry.INSTANCE.getEPackage(PcmIntegrationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPcmIntegrationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PcmIntegrationPackageImpl thePcmIntegrationPackage = registeredPcmIntegrationPackage instanceof PcmIntegrationPackageImpl ? (PcmIntegrationPackageImpl)registeredPcmIntegrationPackage : new PcmIntegrationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ContextPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AttackerPackage.eNS_URI);
		AttackerPackageImpl theAttackerPackage = (AttackerPackageImpl)(registeredPackage instanceof AttackerPackageImpl ? registeredPackage : AttackerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AttackSpecificationPackage.eNS_URI);
		AttackSpecificationPackageImpl theAttackSpecificationPackage = (AttackSpecificationPackageImpl)(registeredPackage instanceof AttackSpecificationPackageImpl ? registeredPackage : AttackSpecificationPackage.eINSTANCE);

		// Create package meta-data objects
		thePcmIntegrationPackage.createPackageContents();
		theAttackerPackage.createPackageContents();
		theAttackSpecificationPackage.createPackageContents();

		// Initialize created meta-data
		thePcmIntegrationPackage.initializePackageContents();
		theAttackerPackage.initializePackageContents();
		theAttackSpecificationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePcmIntegrationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PcmIntegrationPackage.eNS_URI, thePcmIntegrationPackage);
		return thePcmIntegrationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVulnerabilitySystemIntegration()
	{
		return vulnerabilitySystemIntegrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVulnerabilitySystemIntegration_Vulnerability()
	{
		return (EReference)vulnerabilitySystemIntegrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMElement()
	{
		return pcmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMElement_Resourcecontainer()
	{
		return (EReference)pcmElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMElement_Linkingresource()
	{
		return (EReference)pcmElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMElement_Compositecomponent()
	{
		return (EReference)pcmElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMElement_Basiccomponent()
	{
		return (EReference)pcmElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMElement_Assemblycontext()
	{
		return (EReference)pcmElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMElement_Methodspecification()
	{
		return (EReference)pcmElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSystemIntegration()
	{
		return roleSystemIntegrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleSystemIntegration_Role()
	{
		return (EReference)roleSystemIntegrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemIntegration()
	{
		return systemIntegrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemIntegration_Pcmelement()
	{
		return (EReference)systemIntegrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonGlobalCommunication()
	{
		return nonGlobalCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmIntegrationFactory getPcmIntegrationFactory()
	{
		return (PcmIntegrationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vulnerabilitySystemIntegrationEClass = createEClass(VULNERABILITY_SYSTEM_INTEGRATION);
		createEReference(vulnerabilitySystemIntegrationEClass, VULNERABILITY_SYSTEM_INTEGRATION__VULNERABILITY);

		pcmElementEClass = createEClass(PCM_ELEMENT);
		createEReference(pcmElementEClass, PCM_ELEMENT__RESOURCECONTAINER);
		createEReference(pcmElementEClass, PCM_ELEMENT__LINKINGRESOURCE);
		createEReference(pcmElementEClass, PCM_ELEMENT__COMPOSITECOMPONENT);
		createEReference(pcmElementEClass, PCM_ELEMENT__BASICCOMPONENT);
		createEReference(pcmElementEClass, PCM_ELEMENT__ASSEMBLYCONTEXT);
		createEReference(pcmElementEClass, PCM_ELEMENT__METHODSPECIFICATION);

		roleSystemIntegrationEClass = createEClass(ROLE_SYSTEM_INTEGRATION);
		createEReference(roleSystemIntegrationEClass, ROLE_SYSTEM_INTEGRATION__ROLE);

		systemIntegrationEClass = createEClass(SYSTEM_INTEGRATION);
		createEReference(systemIntegrationEClass, SYSTEM_INTEGRATION__PCMELEMENT);

		nonGlobalCommunicationEClass = createEClass(NON_GLOBAL_COMMUNICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		AttackSpecificationPackage theAttackSpecificationPackage = (AttackSpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(AttackSpecificationPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vulnerabilitySystemIntegrationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		vulnerabilitySystemIntegrationEClass.getESuperTypes().add(this.getSystemIntegration());
		pcmElementEClass.getESuperTypes().add(theEntityPackage.getEntity());
		roleSystemIntegrationEClass.getESuperTypes().add(this.getSystemIntegration());
		systemIntegrationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		nonGlobalCommunicationEClass.getESuperTypes().add(this.getSystemIntegration());

		// Initialize classes and features; add operations and parameters
		initEClass(vulnerabilitySystemIntegrationEClass, VulnerabilitySystemIntegration.class, "VulnerabilitySystemIntegration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVulnerabilitySystemIntegration_Vulnerability(), theAttackSpecificationPackage.getVulnerability(), null, "vulnerability", null, 1, 1, VulnerabilitySystemIntegration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmElementEClass, PCMElement.class, "PCMElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMElement_Resourcecontainer(), theResourceenvironmentPackage.getResourceContainer(), null, "resourcecontainer", null, 0, 1, PCMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMElement_Linkingresource(), theResourceenvironmentPackage.getLinkingResource(), null, "linkingresource", null, 0, 1, PCMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMElement_Compositecomponent(), theRepositoryPackage.getCompositeComponent(), null, "compositecomponent", null, 0, 1, PCMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMElement_Basiccomponent(), theRepositoryPackage.getRepositoryComponent(), null, "basiccomponent", null, 0, 1, PCMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMElement_Assemblycontext(), theCompositionPackage.getAssemblyContext(), null, "assemblycontext", null, 0, 1, PCMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMElement_Methodspecification(), theStructurePackage.getMethodSpecification(), null, "methodspecification", null, 0, 1, PCMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleSystemIntegrationEClass, RoleSystemIntegration.class, "RoleSystemIntegration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleSystemIntegration_Role(), theAttackSpecificationPackage.getRole(), null, "role", null, 1, 1, RoleSystemIntegration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemIntegrationEClass, SystemIntegration.class, "SystemIntegration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemIntegration_Pcmelement(), this.getPCMElement(), null, "pcmelement", null, 1, 1, SystemIntegration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonGlobalCommunicationEClass, NonGlobalCommunication.class, "NonGlobalCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //PcmIntegrationPackageImpl
