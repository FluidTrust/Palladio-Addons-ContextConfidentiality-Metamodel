/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl;

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

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

import org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.SystemPackage;

import org.palladiosimulator.pcm.confidentiality.context.system.impl.SystemPackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionRestriction;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.HierarchicalContext;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodMatch;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructureFactory;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.XMLMatch;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.UsagePackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.seff.SeffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructurePackageImpl extends EPackageImpl implements StructurePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmAttributeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hierarchicalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlMatchEClass = null;

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
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructurePackageImpl()
	{
		super(eNS_URI, StructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructurePackage init()
	{
		if (isInited) return (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStructurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StructurePackageImpl theStructurePackage = registeredStructurePackage instanceof StructurePackageImpl ? (StructurePackageImpl)registeredStructurePackage : new StructurePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl)(registeredPackage instanceof ContextPackageImpl ? registeredPackage : ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(registeredPackage instanceof SystemPackageImpl ? registeredPackage : SystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UsagePackage.eNS_URI);
		UsagePackageImpl theUsagePackage = (UsagePackageImpl)(registeredPackage instanceof UsagePackageImpl ? registeredPackage : UsagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(registeredPackage instanceof PolicyPackageImpl ? registeredPackage : PolicyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemcontextPackage.eNS_URI);
		SystemcontextPackageImpl theSystemcontextPackage = (SystemcontextPackageImpl)(registeredPackage instanceof SystemcontextPackageImpl ? registeredPackage : SystemcontextPackage.eINSTANCE);

		// Create package meta-data objects
		theStructurePackage.createPackageContents();
		theContextPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theUsagePackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theSystemcontextPackage.createPackageContents();

		// Initialize created meta-data
		theStructurePackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theUsagePackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theSystemcontextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructurePackage.eNS_URI, theStructurePackage);
		return theStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMAttributeProvider()
	{
		return pcmAttributeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMAttributeProvider_Resourcecontainer()
	{
		return (EReference)pcmAttributeProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMAttributeProvider_Assemblycontext()
	{
		return (EReference)pcmAttributeProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMAttributeProvider_Linkingresource()
	{
		return (EReference)pcmAttributeProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMAttributeProvider_Methodspecification()
	{
		return (EReference)pcmAttributeProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodSpecification()
	{
		return methodSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodSpecification_Signature()
	{
		return (EReference)methodSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodSpecification_Hierachy()
	{
		return (EReference)methodSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionRestriction()
	{
		return connectionRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionRestriction_Connector()
	{
		return (EReference)connectionRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRestriction()
	{
		return serviceRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRestriction_Assemblycontext()
	{
		return (EReference)serviceRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceRestriction_Service()
	{
		return (EReference)serviceRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityMatch()
	{
		return entityMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMatch_Entity()
	{
		return (EReference)entityMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMatch_Category()
	{
		return (EAttribute)entityMatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericMatch()
	{
		return genericMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericMatch_Attributevalue()
	{
		return (EReference)genericMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericMatch_Operation()
	{
		return (EAttribute)genericMatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericMatch_Category()
	{
		return (EAttribute)genericMatchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericMatch_MustBePresent()
	{
		return (EAttribute)genericMatchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodMatch()
	{
		return methodMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodMatch_Methodspecification()
	{
		return (EReference)methodMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHierarchicalContext()
	{
		return hierarchicalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchicalContext_Hierachy()
	{
		return (EReference)hierarchicalContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLMatch()
	{
		return xmlMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLMatch_XmlString()
	{
		return (EAttribute)xmlMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureFactory getStructureFactory()
	{
		return (StructureFactory)getEFactoryInstance();
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
		pcmAttributeProviderEClass = createEClass(PCM_ATTRIBUTE_PROVIDER);
		createEReference(pcmAttributeProviderEClass, PCM_ATTRIBUTE_PROVIDER__RESOURCECONTAINER);
		createEReference(pcmAttributeProviderEClass, PCM_ATTRIBUTE_PROVIDER__ASSEMBLYCONTEXT);
		createEReference(pcmAttributeProviderEClass, PCM_ATTRIBUTE_PROVIDER__LINKINGRESOURCE);
		createEReference(pcmAttributeProviderEClass, PCM_ATTRIBUTE_PROVIDER__METHODSPECIFICATION);

		methodSpecificationEClass = createEClass(METHOD_SPECIFICATION);
		createEReference(methodSpecificationEClass, METHOD_SPECIFICATION__SIGNATURE);
		createEReference(methodSpecificationEClass, METHOD_SPECIFICATION__HIERACHY);

		connectionRestrictionEClass = createEClass(CONNECTION_RESTRICTION);
		createEReference(connectionRestrictionEClass, CONNECTION_RESTRICTION__CONNECTOR);

		serviceRestrictionEClass = createEClass(SERVICE_RESTRICTION);
		createEReference(serviceRestrictionEClass, SERVICE_RESTRICTION__ASSEMBLYCONTEXT);
		createEReference(serviceRestrictionEClass, SERVICE_RESTRICTION__SERVICE);

		entityMatchEClass = createEClass(ENTITY_MATCH);
		createEReference(entityMatchEClass, ENTITY_MATCH__ENTITY);
		createEAttribute(entityMatchEClass, ENTITY_MATCH__CATEGORY);

		genericMatchEClass = createEClass(GENERIC_MATCH);
		createEReference(genericMatchEClass, GENERIC_MATCH__ATTRIBUTEVALUE);
		createEAttribute(genericMatchEClass, GENERIC_MATCH__OPERATION);
		createEAttribute(genericMatchEClass, GENERIC_MATCH__CATEGORY);
		createEAttribute(genericMatchEClass, GENERIC_MATCH__MUST_BE_PRESENT);

		methodMatchEClass = createEClass(METHOD_MATCH);
		createEReference(methodMatchEClass, METHOD_MATCH__METHODSPECIFICATION);

		hierarchicalContextEClass = createEClass(HIERARCHICAL_CONTEXT);
		createEReference(hierarchicalContextEClass, HIERARCHICAL_CONTEXT__HIERACHY);

		xmlMatchEClass = createEClass(XML_MATCH);
		createEAttribute(xmlMatchEClass, XML_MATCH__XML_STRING);
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
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		SeffPackage theSeffPackage = (SeffPackage)EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);
		PolicyPackage thePolicyPackage = (PolicyPackage)EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		SystemcontextPackage theSystemcontextPackage = (SystemcontextPackage)EPackage.Registry.INSTANCE.getEPackage(SystemcontextPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pcmAttributeProviderEClass.getESuperTypes().add(theEntityPackage.getEntity());
		pcmAttributeProviderEClass.getESuperTypes().add(theSystemPackage.getAttributeProvider());
		methodSpecificationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		connectionRestrictionEClass.getESuperTypes().add(this.getMethodSpecification());
		serviceRestrictionEClass.getESuperTypes().add(this.getMethodSpecification());
		entityMatchEClass.getESuperTypes().add(thePolicyPackage.getMatch());
		entityMatchEClass.getESuperTypes().add(this.getHierarchicalContext());
		genericMatchEClass.getESuperTypes().add(thePolicyPackage.getMatch());
		methodMatchEClass.getESuperTypes().add(thePolicyPackage.getMatch());
		methodMatchEClass.getESuperTypes().add(this.getHierarchicalContext());

		// Initialize classes and features; add operations and parameters
		initEClass(pcmAttributeProviderEClass, PCMAttributeProvider.class, "PCMAttributeProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMAttributeProvider_Resourcecontainer(), theResourceenvironmentPackage.getResourceContainer(), null, "resourcecontainer", null, 0, 1, PCMAttributeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMAttributeProvider_Assemblycontext(), theCompositionPackage.getAssemblyContext(), null, "assemblycontext", null, 0, 1, PCMAttributeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMAttributeProvider_Linkingresource(), theResourceenvironmentPackage.getLinkingResource(), null, "linkingresource", null, 0, 1, PCMAttributeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCMAttributeProvider_Methodspecification(), this.getConnectionRestriction(), null, "methodspecification", null, 0, 1, PCMAttributeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodSpecificationEClass, MethodSpecification.class, "MethodSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodSpecification_Signature(), theRepositoryPackage.getSignature(), null, "signature", null, 1, 1, MethodSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodSpecification_Hierachy(), theCompositionPackage.getAssemblyContext(), null, "hierachy", null, 0, -1, MethodSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionRestrictionEClass, ConnectionRestriction.class, "ConnectionRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionRestriction_Connector(), theCompositionPackage.getConnector(), null, "connector", null, 1, 1, ConnectionRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceRestrictionEClass, ServiceRestriction.class, "ServiceRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceRestriction_Assemblycontext(), theCompositionPackage.getAssemblyContext(), null, "assemblycontext", null, 1, 1, ServiceRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceRestriction_Service(), theSeffPackage.getResourceDemandingSEFF(), null, "service", null, 1, 1, ServiceRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityMatchEClass, EntityMatch.class, "EntityMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityMatch_Entity(), theEntityPackage.getEntity(), null, "entity", null, 1, 1, EntityMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityMatch_Category(), thePolicyPackage.getCategory(), "category", "RESOURCE", 0, 1, EntityMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericMatchEClass, GenericMatch.class, "GenericMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericMatch_Attributevalue(), theSystemcontextPackage.getAttributeValue(), null, "attributevalue", null, 1, 1, GenericMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericMatch_Operation(), thePolicyPackage.getOperations(), "operation", null, 1, 1, GenericMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericMatch_Category(), thePolicyPackage.getCategory(), "category", null, 0, 1, GenericMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericMatch_MustBePresent(), theXMLTypePackage.getBoolean(), "mustBePresent", null, 0, 1, GenericMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodMatchEClass, MethodMatch.class, "MethodMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodMatch_Methodspecification(), this.getMethodSpecification(), null, "methodspecification", null, 1, 1, MethodMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hierarchicalContextEClass, HierarchicalContext.class, "HierarchicalContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHierarchicalContext_Hierachy(), theCompositionPackage.getAssemblyContext(), null, "hierachy", null, 0, -1, HierarchicalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlMatchEClass, XMLMatch.class, "XMLMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLMatch_XmlString(), theXMLTypePackage.getString(), "xmlString", null, 0, 1, XMLMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StructurePackageImpl
