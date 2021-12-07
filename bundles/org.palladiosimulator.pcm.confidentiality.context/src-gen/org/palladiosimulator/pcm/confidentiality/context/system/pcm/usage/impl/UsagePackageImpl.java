/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

import org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;

import org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.PCMUsageSpecification;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsageFactory;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsagePackageImpl extends EPackageImpl implements UsagePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmUsageSpecificationEClass = null;

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
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UsagePackageImpl()
	{
		super(eNS_URI, UsageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UsagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UsagePackage init()
	{
		if (isInited) return (UsagePackage)EPackage.Registry.INSTANCE.getEPackage(UsagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUsagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UsagePackageImpl theUsagePackage = registeredUsagePackage instanceof UsagePackageImpl ? (UsagePackageImpl)registeredUsagePackage : new UsagePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl)(registeredPackage instanceof ContextPackageImpl ? registeredPackage : ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(registeredPackage instanceof SystemPackageImpl ? registeredPackage : SystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(registeredPackage instanceof StructurePackageImpl ? registeredPackage : StructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(registeredPackage instanceof PolicyPackageImpl ? registeredPackage : PolicyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemcontextPackage.eNS_URI);
		SystemcontextPackageImpl theSystemcontextPackage = (SystemcontextPackageImpl)(registeredPackage instanceof SystemcontextPackageImpl ? registeredPackage : SystemcontextPackage.eINSTANCE);

		// Create package meta-data objects
		theUsagePackage.createPackageContents();
		theContextPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theSystemcontextPackage.createPackageContents();

		// Initialize created meta-data
		theUsagePackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theSystemcontextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUsagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UsagePackage.eNS_URI, theUsagePackage);
		return theUsagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMUsageSpecification()
	{
		return pcmUsageSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMUsageSpecification_Entrylevelsystemcall()
	{
		return (EReference)pcmUsageSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMUsageSpecification_Usagescenario()
	{
		return (EReference)pcmUsageSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCMUsageSpecification_MissageUse()
	{
		return (EAttribute)pcmUsageSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageFactory getUsageFactory()
	{
		return (UsageFactory)getEFactoryInstance();
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
		pcmUsageSpecificationEClass = createEClass(PCM_USAGE_SPECIFICATION);
		createEReference(pcmUsageSpecificationEClass, PCM_USAGE_SPECIFICATION__ENTRYLEVELSYSTEMCALL);
		createEReference(pcmUsageSpecificationEClass, PCM_USAGE_SPECIFICATION__USAGESCENARIO);
		createEAttribute(pcmUsageSpecificationEClass, PCM_USAGE_SPECIFICATION__MISSAGE_USE);
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
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pcmUsageSpecificationEClass.getESuperTypes().add(theSystemPackage.getUsageSpecification());

		// Initialize classes and features; add operations and parameters
		initEClass(pcmUsageSpecificationEClass, PCMUsageSpecification.class, "PCMUsageSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMUsageSpecification_Entrylevelsystemcall(), theUsagemodelPackage.getEntryLevelSystemCall(), null, "entrylevelsystemcall", null, 0, 1, PCMUsageSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMUsageSpecification_Usagescenario(), theUsagemodelPackage.getUsageScenario(), null, "usagescenario", null, 0, 1, PCMUsageSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCMUsageSpecification_MissageUse(), theEcorePackage.getEBoolean(), "missageUse", null, 0, 1, PCMUsageSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //UsagePackageImpl
