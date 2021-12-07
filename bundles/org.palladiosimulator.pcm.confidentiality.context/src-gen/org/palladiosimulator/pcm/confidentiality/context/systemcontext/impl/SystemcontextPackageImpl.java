/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.UsagePackage;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.usage.impl.UsagePackageImpl;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attributes;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.ExternalSystemAttribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SimpleAttribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextFactory;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.XMLAttribute;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemcontextPackageImpl extends EPackageImpl implements SystemcontextPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEntityAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalSystemAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypesEEnum = null;

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
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemcontextPackageImpl()
	{
		super(eNS_URI, SystemcontextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SystemcontextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemcontextPackage init()
	{
		if (isInited) return (SystemcontextPackage)EPackage.Registry.INSTANCE.getEPackage(SystemcontextPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSystemcontextPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SystemcontextPackageImpl theSystemcontextPackage = registeredSystemcontextPackage instanceof SystemcontextPackageImpl ? (SystemcontextPackageImpl)registeredSystemcontextPackage : new SystemcontextPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(registeredPackage instanceof StructurePackageImpl ? registeredPackage : StructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UsagePackage.eNS_URI);
		UsagePackageImpl theUsagePackage = (UsagePackageImpl)(registeredPackage instanceof UsagePackageImpl ? registeredPackage : UsagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(registeredPackage instanceof PolicyPackageImpl ? registeredPackage : PolicyPackage.eINSTANCE);

		// Create package meta-data objects
		theSystemcontextPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theUsagePackage.createPackageContents();
		thePolicyPackage.createPackageContents();

		// Initialize created meta-data
		theSystemcontextPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theUsagePackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemcontextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemcontextPackage.eNS_URI, theSystemcontextPackage);
		return theSystemcontextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributes()
	{
		return attributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_Attribute()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute()
	{
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Attributevalue()
	{
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValue()
	{
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValue_Type()
	{
		return (EAttribute)attributeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValue_Values()
	{
		return (EAttribute)attributeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemEntityAttribute()
	{
		return systemEntityAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemEntityAttribute_ModelEntity()
	{
		return (EReference)systemEntityAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalSystemAttribute()
	{
		return externalSystemAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalSystemAttribute_ExternalName()
	{
		return (EAttribute)externalSystemAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAttribute()
	{
		return simpleAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLAttribute()
	{
		return xmlAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLAttribute_XmlString()
	{
		return (EAttribute)xmlAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentSubject()
	{
		return environmentSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentSubject_Environment()
	{
		return (EAttribute)environmentSubjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTypes()
	{
		return dataTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemcontextFactory getSystemcontextFactory()
	{
		return (SystemcontextFactory)getEFactoryInstance();
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
		attributesEClass = createEClass(ATTRIBUTES);
		createEReference(attributesEClass, ATTRIBUTES__ATTRIBUTE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTEVALUE);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);
		createEAttribute(attributeValueEClass, ATTRIBUTE_VALUE__TYPE);
		createEAttribute(attributeValueEClass, ATTRIBUTE_VALUE__VALUES);

		systemEntityAttributeEClass = createEClass(SYSTEM_ENTITY_ATTRIBUTE);
		createEReference(systemEntityAttributeEClass, SYSTEM_ENTITY_ATTRIBUTE__MODEL_ENTITY);

		externalSystemAttributeEClass = createEClass(EXTERNAL_SYSTEM_ATTRIBUTE);
		createEAttribute(externalSystemAttributeEClass, EXTERNAL_SYSTEM_ATTRIBUTE__EXTERNAL_NAME);

		simpleAttributeEClass = createEClass(SIMPLE_ATTRIBUTE);

		xmlAttributeEClass = createEClass(XML_ATTRIBUTE);
		createEAttribute(xmlAttributeEClass, XML_ATTRIBUTE__XML_STRING);

		environmentSubjectEClass = createEClass(ENVIRONMENT_SUBJECT);
		createEAttribute(environmentSubjectEClass, ENVIRONMENT_SUBJECT__ENVIRONMENT);

		// Create enums
		dataTypesEEnum = createEEnum(DATA_TYPES);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeEClass.getESuperTypes().add(theEntityPackage.getEntity());
		attributeValueEClass.getESuperTypes().add(theEntityPackage.getEntity());
		systemEntityAttributeEClass.getESuperTypes().add(this.getAttribute());
		externalSystemAttributeEClass.getESuperTypes().add(this.getEnvironmentSubject());
		simpleAttributeEClass.getESuperTypes().add(this.getEnvironmentSubject());
		xmlAttributeEClass.getESuperTypes().add(this.getAttribute());
		environmentSubjectEClass.getESuperTypes().add(this.getAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributes_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Attributevalue(), this.getAttributeValue(), null, "attributevalue", null, 1, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValue_Type(), this.getDataTypes(), "type", null, 1, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeValue_Values(), theEcorePackage.getEString(), "values", null, 1, -1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEntityAttributeEClass, SystemEntityAttribute.class, "SystemEntityAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemEntityAttribute_ModelEntity(), theEntityPackage.getEntity(), null, "modelEntity", null, 1, 1, SystemEntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalSystemAttributeEClass, ExternalSystemAttribute.class, "ExternalSystemAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalSystemAttribute_ExternalName(), theXMLTypePackage.getString(), "externalName", null, 1, 1, ExternalSystemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleAttributeEClass, SimpleAttribute.class, "SimpleAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlAttributeEClass, XMLAttribute.class, "XMLAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLAttribute_XmlString(), theXMLTypePackage.getString(), "xmlString", null, 1, 1, XMLAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentSubjectEClass, EnvironmentSubject.class, "EnvironmentSubject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentSubject_Environment(), ecorePackage.getEBoolean(), "environment", "false", 1, 1, EnvironmentSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypesEEnum, DataTypes.class, "DataTypes");
		addEEnumLiteral(dataTypesEEnum, DataTypes.STRING);
		addEEnumLiteral(dataTypesEEnum, DataTypes.BOOLEAN);
		addEEnumLiteral(dataTypesEEnum, DataTypes.INTEGER);
		addEEnumLiteral(dataTypesEEnum, DataTypes.DOUBLE);
		addEEnumLiteral(dataTypesEEnum, DataTypes.DATE);
	}

} //SystemcontextPackageImpl
