/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextFactory
 * @model kind="package"
 * @generated
 */
public interface SystemcontextPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "systemcontext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/systemcontext/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "systemcontext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemcontextPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributesImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributeImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTEVALUE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributeValueImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__VALUES = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemEntityAttributeImpl <em>System Entity Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemEntityAttributeImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getSystemEntityAttribute()
	 * @generated
	 */
	int SYSTEM_ENTITY_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENTITY_ATTRIBUTE__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENTITY_ATTRIBUTE__ENTITY_NAME = ATTRIBUTE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENTITY_ATTRIBUTE__ATTRIBUTEVALUE = ATTRIBUTE__ATTRIBUTEVALUE;

	/**
	 * The feature id for the '<em><b>Model Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENTITY_ATTRIBUTE__MODEL_ENTITY = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Entity Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENTITY_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.EnvironmentSubjectImpl <em>Environment Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.EnvironmentSubjectImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getEnvironmentSubject()
	 * @generated
	 */
	int ENVIRONMENT_SUBJECT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SUBJECT__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SUBJECT__ENTITY_NAME = ATTRIBUTE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SUBJECT__ATTRIBUTEVALUE = ATTRIBUTE__ATTRIBUTEVALUE;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SUBJECT__ENVIRONMENT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Environment Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SUBJECT_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.ExternalSystemAttributeImpl <em>External System Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.ExternalSystemAttributeImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getExternalSystemAttribute()
	 * @generated
	 */
	int EXTERNAL_SYSTEM_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM_ATTRIBUTE__ID = ENVIRONMENT_SUBJECT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM_ATTRIBUTE__ENTITY_NAME = ENVIRONMENT_SUBJECT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM_ATTRIBUTE__ATTRIBUTEVALUE = ENVIRONMENT_SUBJECT__ATTRIBUTEVALUE;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM_ATTRIBUTE__ENVIRONMENT = ENVIRONMENT_SUBJECT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>External Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM_ATTRIBUTE__EXTERNAL_NAME = ENVIRONMENT_SUBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External System Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM_ATTRIBUTE_FEATURE_COUNT = ENVIRONMENT_SUBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SimpleAttributeImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getSimpleAttribute()
	 * @generated
	 */
	int SIMPLE_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__ID = ENVIRONMENT_SUBJECT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__ENTITY_NAME = ENVIRONMENT_SUBJECT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__ATTRIBUTEVALUE = ENVIRONMENT_SUBJECT__ATTRIBUTEVALUE;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__ENVIRONMENT = ENVIRONMENT_SUBJECT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Simple Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_FEATURE_COUNT = ENVIRONMENT_SUBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.XMLAttributeImpl <em>XML Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.XMLAttributeImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getXMLAttribute()
	 * @generated
	 */
	int XML_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE__ENTITY_NAME = ATTRIBUTE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE__ATTRIBUTEVALUE = ATTRIBUTE__ATTRIBUTEVALUE;

	/**
	 * The feature id for the '<em><b>Xml String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE__XML_STRING = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes <em>Data Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getDataTypes()
	 * @generated
	 */
	int DATA_TYPES = 8;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attributes
	 * @generated
	 */
	EClass getAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attributes#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attributes#getAttribute()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Attribute();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute#getAttributevalue <em>Attributevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributevalue</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute#getAttributevalue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attributevalue();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue#getType()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EAttribute getAttributeValue_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue#getValues()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EAttribute getAttributeValue_Values();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute <em>System Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Entity Attribute</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute
	 * @generated
	 */
	EClass getSystemEntityAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute#getModelEntity <em>Model Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Entity</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemEntityAttribute#getModelEntity()
	 * @see #getSystemEntityAttribute()
	 * @generated
	 */
	EReference getSystemEntityAttribute_ModelEntity();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.ExternalSystemAttribute <em>External System Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External System Attribute</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.ExternalSystemAttribute
	 * @generated
	 */
	EClass getExternalSystemAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.ExternalSystemAttribute#getExternalName <em>External Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Name</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.ExternalSystemAttribute#getExternalName()
	 * @see #getExternalSystemAttribute()
	 * @generated
	 */
	EAttribute getExternalSystemAttribute_ExternalName();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.SimpleAttribute <em>Simple Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Attribute</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SimpleAttribute
	 * @generated
	 */
	EClass getSimpleAttribute();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.XMLAttribute <em>XML Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Attribute</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.XMLAttribute
	 * @generated
	 */
	EClass getXMLAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.XMLAttribute#getXmlString <em>Xml String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml String</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.XMLAttribute#getXmlString()
	 * @see #getXMLAttribute()
	 * @generated
	 */
	EAttribute getXMLAttribute_XmlString();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject <em>Environment Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Subject</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject
	 * @generated
	 */
	EClass getEnvironmentSubject();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject#isEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject#isEnvironment()
	 * @see #getEnvironmentSubject()
	 * @generated
	 */
	EAttribute getEnvironmentSubject_Environment();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Types</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes
	 * @generated
	 */
	EEnum getDataTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemcontextFactory getSystemcontextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributesImpl <em>Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributesImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getAttributes()
		 * @generated
		 */
		EClass ATTRIBUTES = eINSTANCE.getAttributes();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__ATTRIBUTE = eINSTANCE.getAttributes_Attribute();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributeImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attributevalue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTEVALUE = eINSTANCE.getAttribute_Attributevalue();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributeValueImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE__TYPE = eINSTANCE.getAttributeValue_Type();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE__VALUES = eINSTANCE.getAttributeValue_Values();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemEntityAttributeImpl <em>System Entity Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemEntityAttributeImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getSystemEntityAttribute()
		 * @generated
		 */
		EClass SYSTEM_ENTITY_ATTRIBUTE = eINSTANCE.getSystemEntityAttribute();

		/**
		 * The meta object literal for the '<em><b>Model Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ENTITY_ATTRIBUTE__MODEL_ENTITY = eINSTANCE.getSystemEntityAttribute_ModelEntity();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.ExternalSystemAttributeImpl <em>External System Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.ExternalSystemAttributeImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getExternalSystemAttribute()
		 * @generated
		 */
		EClass EXTERNAL_SYSTEM_ATTRIBUTE = eINSTANCE.getExternalSystemAttribute();

		/**
		 * The meta object literal for the '<em><b>External Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_SYSTEM_ATTRIBUTE__EXTERNAL_NAME = eINSTANCE.getExternalSystemAttribute_ExternalName();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SimpleAttributeImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getSimpleAttribute()
		 * @generated
		 */
		EClass SIMPLE_ATTRIBUTE = eINSTANCE.getSimpleAttribute();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.XMLAttributeImpl <em>XML Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.XMLAttributeImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getXMLAttribute()
		 * @generated
		 */
		EClass XML_ATTRIBUTE = eINSTANCE.getXMLAttribute();

		/**
		 * The meta object literal for the '<em><b>Xml String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE__XML_STRING = eINSTANCE.getXMLAttribute_XmlString();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.EnvironmentSubjectImpl <em>Environment Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.EnvironmentSubjectImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getEnvironmentSubject()
		 * @generated
		 */
		EClass ENVIRONMENT_SUBJECT = eINSTANCE.getEnvironmentSubject();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_SUBJECT__ENVIRONMENT = eINSTANCE.getEnvironmentSubject_Environment();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes <em>Data Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes
		 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.SystemcontextPackageImpl#getDataTypes()
		 * @generated
		 */
		EEnum DATA_TYPES = eINSTANCE.getDataTypes();

	}

} //SystemcontextPackage
