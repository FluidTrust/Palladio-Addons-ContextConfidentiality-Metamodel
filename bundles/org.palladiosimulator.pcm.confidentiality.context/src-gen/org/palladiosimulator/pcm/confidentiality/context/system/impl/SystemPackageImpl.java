/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.impl;

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

import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

import org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.AttributeProvider;
import org.palladiosimulator.pcm.confidentiality.context.system.SystemFactory;
import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;
import org.palladiosimulator.pcm.confidentiality.context.system.SystemSpecificationContainer;
import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.UsagePackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemPackageImpl extends EPackageImpl implements SystemPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSpecificationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageSpecificationEClass = null;

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
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemPackageImpl()
	{
		super(eNS_URI, SystemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemPackage init()
	{
		if (isInited) return (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SystemPackageImpl theSystemPackage = registeredSystemPackage instanceof SystemPackageImpl ? (SystemPackageImpl)registeredSystemPackage : new SystemPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(registeredPackage instanceof StructurePackageImpl ? registeredPackage : StructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UsagePackage.eNS_URI);
		UsagePackageImpl theUsagePackage = (UsagePackageImpl)(registeredPackage instanceof UsagePackageImpl ? registeredPackage : UsagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(registeredPackage instanceof PolicyPackageImpl ? registeredPackage : PolicyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemcontextPackage.eNS_URI);
		SystemcontextPackageImpl theSystemcontextPackage = (SystemcontextPackageImpl)(registeredPackage instanceof SystemcontextPackageImpl ? registeredPackage : SystemcontextPackage.eINSTANCE);

		// Create package meta-data objects
		theSystemPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theUsagePackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theSystemcontextPackage.createPackageContents();

		// Initialize created meta-data
		theSystemPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theUsagePackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theSystemcontextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemPackage.eNS_URI, theSystemPackage);
		return theSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemSpecificationContainer()
	{
		return systemSpecificationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSpecificationContainer_Attributeprovider()
	{
		return (EReference)systemSpecificationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSpecificationContainer_Usagespecification()
	{
		return (EReference)systemSpecificationContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeProvider()
	{
		return attributeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeProvider_Attribute()
	{
		return (EReference)attributeProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageSpecification()
	{
		return usageSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsageSpecification_Attributevalue()
	{
		return (EReference)usageSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsageSpecification_Attribute()
	{
		return (EReference)usageSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFactory getSystemFactory()
	{
		return (SystemFactory)getEFactoryInstance();
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
		systemSpecificationContainerEClass = createEClass(SYSTEM_SPECIFICATION_CONTAINER);
		createEReference(systemSpecificationContainerEClass, SYSTEM_SPECIFICATION_CONTAINER__ATTRIBUTEPROVIDER);
		createEReference(systemSpecificationContainerEClass, SYSTEM_SPECIFICATION_CONTAINER__USAGESPECIFICATION);

		attributeProviderEClass = createEClass(ATTRIBUTE_PROVIDER);
		createEReference(attributeProviderEClass, ATTRIBUTE_PROVIDER__ATTRIBUTE);

		usageSpecificationEClass = createEClass(USAGE_SPECIFICATION);
		createEReference(usageSpecificationEClass, USAGE_SPECIFICATION__ATTRIBUTEVALUE);
		createEReference(usageSpecificationEClass, USAGE_SPECIFICATION__ATTRIBUTE);
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
		StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
		UsagePackage theUsagePackage = (UsagePackage)EPackage.Registry.INSTANCE.getEPackage(UsagePackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		SystemcontextPackage theSystemcontextPackage = (SystemcontextPackage)EPackage.Registry.INSTANCE.getEPackage(SystemcontextPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStructurePackage);
		getESubpackages().add(theUsagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemSpecificationContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());
		usageSpecificationEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(systemSpecificationContainerEClass, SystemSpecificationContainer.class, "SystemSpecificationContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemSpecificationContainer_Attributeprovider(), this.getAttributeProvider(), null, "attributeprovider", null, 0, -1, SystemSpecificationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemSpecificationContainer_Usagespecification(), this.getUsageSpecification(), null, "usagespecification", null, 0, -1, SystemSpecificationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeProviderEClass, AttributeProvider.class, "AttributeProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeProvider_Attribute(), this.getUsageSpecification(), null, "attribute", null, 1, 1, AttributeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageSpecificationEClass, UsageSpecification.class, "UsageSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsageSpecification_Attributevalue(), theSystemcontextPackage.getAttributeValue(), null, "attributevalue", null, 0, 1, UsageSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsageSpecification_Attribute(), theSystemcontextPackage.getAttribute(), null, "attribute", null, 1, 1, UsageSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SystemPackageImpl
