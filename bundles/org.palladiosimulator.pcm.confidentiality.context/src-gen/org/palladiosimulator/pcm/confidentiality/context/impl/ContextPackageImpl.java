/**
 */
package org.palladiosimulator.pcm.confidentiality.context.impl;

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

import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.ContextFactory;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

import org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;

import org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.UsagePackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextPackageImpl extends EPackageImpl implements ContextPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidentialAccessSpecificationEClass = null;

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
	 * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContextPackageImpl()
	{
		super(eNS_URI, ContextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContextPackage init()
	{
		if (isInited) return (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContextPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContextPackageImpl theContextPackage = registeredContextPackage instanceof ContextPackageImpl ? (ContextPackageImpl)registeredContextPackage : new ContextPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(registeredPackage instanceof SystemPackageImpl ? registeredPackage : SystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(registeredPackage instanceof StructurePackageImpl ? registeredPackage : StructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UsagePackage.eNS_URI);
		UsagePackageImpl theUsagePackage = (UsagePackageImpl)(registeredPackage instanceof UsagePackageImpl ? registeredPackage : UsagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(registeredPackage instanceof PolicyPackageImpl ? registeredPackage : PolicyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemcontextPackage.eNS_URI);
		SystemcontextPackageImpl theSystemcontextPackage = (SystemcontextPackageImpl)(registeredPackage instanceof SystemcontextPackageImpl ? registeredPackage : SystemcontextPackage.eINSTANCE);

		// Create package meta-data objects
		theContextPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theUsagePackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theSystemcontextPackage.createPackageContents();

		// Initialize created meta-data
		theContextPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theUsagePackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theSystemcontextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContextPackage.eNS_URI, theContextPackage);
		return theContextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfidentialAccessSpecification()
	{
		return confidentialAccessSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialAccessSpecification_Pcmspecificationcontainer()
	{
		return (EReference)confidentialAccessSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialAccessSpecification_Policyset()
	{
		return (EReference)confidentialAccessSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidentialAccessSpecification_Attributes()
	{
		return (EReference)confidentialAccessSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextFactory getContextFactory()
	{
		return (ContextFactory)getEFactoryInstance();
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
		confidentialAccessSpecificationEClass = createEClass(CONFIDENTIAL_ACCESS_SPECIFICATION);
		createEReference(confidentialAccessSpecificationEClass, CONFIDENTIAL_ACCESS_SPECIFICATION__PCMSPECIFICATIONCONTAINER);
		createEReference(confidentialAccessSpecificationEClass, CONFIDENTIAL_ACCESS_SPECIFICATION__POLICYSET);
		createEReference(confidentialAccessSpecificationEClass, CONFIDENTIAL_ACCESS_SPECIFICATION__ATTRIBUTES);
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
		PolicyPackage thePolicyPackage = (PolicyPackage)EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		SystemcontextPackage theSystemcontextPackage = (SystemcontextPackage)EPackage.Registry.INSTANCE.getEPackage(SystemcontextPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSystemPackage);
		getESubpackages().add(thePolicyPackage);
		getESubpackages().add(theSystemcontextPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(confidentialAccessSpecificationEClass, ConfidentialAccessSpecification.class, "ConfidentialAccessSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfidentialAccessSpecification_Pcmspecificationcontainer(), theSystemPackage.getSystemSpecificationContainer(), null, "pcmspecificationcontainer", null, 1, 1, ConfidentialAccessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfidentialAccessSpecification_Policyset(), thePolicyPackage.getPolicySet(), null, "policyset", null, 0, 1, ConfidentialAccessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfidentialAccessSpecification_Attributes(), theSystemcontextPackage.getAttributes(), null, "attributes", null, 0, 1, ConfidentialAccessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ContextPackageImpl
