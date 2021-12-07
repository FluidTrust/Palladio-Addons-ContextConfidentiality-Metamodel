/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

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
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructureFactory
 * @model kind="package"
 * @generated
 */
public interface StructurePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/specification/pcm/structure/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructurePackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.PCMAttributeProviderImpl <em>PCM Attribute Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.PCMAttributeProviderImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getPCMAttributeProvider()
	 * @generated
	 */
	int PCM_ATTRIBUTE_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ATTRIBUTE_PROVIDER__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ATTRIBUTE_PROVIDER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ATTRIBUTE_PROVIDER__ATTRIBUTE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resourcecontainer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ATTRIBUTE_PROVIDER__RESOURCECONTAINER = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assemblycontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ATTRIBUTE_PROVIDER__ASSEMBLYCONTEXT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Linkingresource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ATTRIBUTE_PROVIDER__LINKINGRESOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Methodspecification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ATTRIBUTE_PROVIDER__METHODSPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>PCM Attribute Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ATTRIBUTE_PROVIDER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodSpecificationImpl <em>Method Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodSpecificationImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getMethodSpecification()
	 * @generated
	 */
	int METHOD_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__SIGNATURE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hierachy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION__HIERACHY = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SPECIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.ConnectionRestrictionImpl <em>Connection Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.ConnectionRestrictionImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getConnectionRestriction()
	 * @generated
	 */
	int CONNECTION_RESTRICTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__ID = METHOD_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__ENTITY_NAME = METHOD_SPECIFICATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__SIGNATURE = METHOD_SPECIFICATION__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Hierachy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__HIERACHY = METHOD_SPECIFICATION__HIERACHY;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION__CONNECTOR = METHOD_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RESTRICTION_FEATURE_COUNT = METHOD_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.ServiceRestrictionImpl <em>Service Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.ServiceRestrictionImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getServiceRestriction()
	 * @generated
	 */
	int SERVICE_RESTRICTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESTRICTION__ID = METHOD_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESTRICTION__ENTITY_NAME = METHOD_SPECIFICATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESTRICTION__SIGNATURE = METHOD_SPECIFICATION__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Hierachy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESTRICTION__HIERACHY = METHOD_SPECIFICATION__HIERACHY;

	/**
	 * The feature id for the '<em><b>Assemblycontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESTRICTION__ASSEMBLYCONTEXT = METHOD_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESTRICTION__SERVICE = METHOD_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESTRICTION_FEATURE_COUNT = METHOD_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.EntityMatchImpl <em>Entity Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.EntityMatchImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getEntityMatch()
	 * @generated
	 */
	int ENTITY_MATCH = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MATCH__ID = PolicyPackage.MATCH__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MATCH__ENTITY_NAME = PolicyPackage.MATCH__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Hierachy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MATCH__HIERACHY = PolicyPackage.MATCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MATCH__ENTITY = PolicyPackage.MATCH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MATCH__CATEGORY = PolicyPackage.MATCH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MATCH_FEATURE_COUNT = PolicyPackage.MATCH_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.GenericMatchImpl <em>Generic Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.GenericMatchImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getGenericMatch()
	 * @generated
	 */
	int GENERIC_MATCH = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MATCH__ID = PolicyPackage.MATCH__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MATCH__ENTITY_NAME = PolicyPackage.MATCH__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Attributevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MATCH__ATTRIBUTEVALUE = PolicyPackage.MATCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MATCH__OPERATION = PolicyPackage.MATCH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MATCH__CATEGORY = PolicyPackage.MATCH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Must Be Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MATCH__MUST_BE_PRESENT = PolicyPackage.MATCH_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generic Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MATCH_FEATURE_COUNT = PolicyPackage.MATCH_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodMatchImpl <em>Method Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodMatchImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getMethodMatch()
	 * @generated
	 */
	int METHOD_MATCH = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MATCH__ID = PolicyPackage.MATCH__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MATCH__ENTITY_NAME = PolicyPackage.MATCH__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Hierachy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MATCH__HIERACHY = PolicyPackage.MATCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methodspecification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MATCH__METHODSPECIFICATION = PolicyPackage.MATCH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MATCH_FEATURE_COUNT = PolicyPackage.MATCH_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.HierarchicalContextImpl <em>Hierarchical Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.HierarchicalContextImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getHierarchicalContext()
	 * @generated
	 */
	int HIERARCHICAL_CONTEXT = 7;

	/**
	 * The feature id for the '<em><b>Hierachy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_CONTEXT__HIERACHY = 0;

	/**
	 * The number of structural features of the '<em>Hierarchical Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.XMLMatchImpl <em>XML Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.XMLMatchImpl
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getXMLMatch()
	 * @generated
	 */
	int XML_MATCH = 8;

	/**
	 * The feature id for the '<em><b>Xml String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_MATCH__XML_STRING = 0;

	/**
	 * The number of structural features of the '<em>XML Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_MATCH_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider <em>PCM Attribute Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Attribute Provider</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider
	 * @generated
	 */
	EClass getPCMAttributeProvider();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getResourcecontainer <em>Resourcecontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resourcecontainer</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getResourcecontainer()
	 * @see #getPCMAttributeProvider()
	 * @generated
	 */
	EReference getPCMAttributeProvider_Resourcecontainer();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getAssemblycontext <em>Assemblycontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assemblycontext</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getAssemblycontext()
	 * @see #getPCMAttributeProvider()
	 * @generated
	 */
	EReference getPCMAttributeProvider_Assemblycontext();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getLinkingresource <em>Linkingresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linkingresource</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getLinkingresource()
	 * @see #getPCMAttributeProvider()
	 * @generated
	 */
	EReference getPCMAttributeProvider_Linkingresource();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getMethodspecification <em>Methodspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Methodspecification</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.PCMAttributeProvider#getMethodspecification()
	 * @see #getPCMAttributeProvider()
	 * @generated
	 */
	EReference getPCMAttributeProvider_Methodspecification();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification <em>Method Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Specification</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification
	 * @generated
	 */
	EClass getMethodSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification#getSignature()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	EReference getMethodSpecification_Signature();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification#getHierachy <em>Hierachy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hierachy</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodSpecification#getHierachy()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	EReference getMethodSpecification_Hierachy();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionRestriction <em>Connection Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Restriction</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionRestriction
	 * @generated
	 */
	EClass getConnectionRestriction();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionRestriction#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionRestriction#getConnector()
	 * @see #getConnectionRestriction()
	 * @generated
	 */
	EReference getConnectionRestriction_Connector();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction <em>Service Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Restriction</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction
	 * @generated
	 */
	EClass getServiceRestriction();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction#getAssemblycontext <em>Assemblycontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assemblycontext</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction#getAssemblycontext()
	 * @see #getServiceRestriction()
	 * @generated
	 */
	EReference getServiceRestriction_Assemblycontext();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ServiceRestriction#getService()
	 * @see #getServiceRestriction()
	 * @generated
	 */
	EReference getServiceRestriction_Service();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch <em>Entity Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Match</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch
	 * @generated
	 */
	EClass getEntityMatch();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch#getEntity()
	 * @see #getEntityMatch()
	 * @generated
	 */
	EReference getEntityMatch_Entity();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.EntityMatch#getCategory()
	 * @see #getEntityMatch()
	 * @generated
	 */
	EAttribute getEntityMatch_Category();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch <em>Generic Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Match</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch
	 * @generated
	 */
	EClass getGenericMatch();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getAttributevalue <em>Attributevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributevalue</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getAttributevalue()
	 * @see #getGenericMatch()
	 * @generated
	 */
	EReference getGenericMatch_Attributevalue();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getOperation()
	 * @see #getGenericMatch()
	 * @generated
	 */
	EAttribute getGenericMatch_Operation();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#getCategory()
	 * @see #getGenericMatch()
	 * @generated
	 */
	EAttribute getGenericMatch_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#isMustBePresent <em>Must Be Present</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Be Present</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch#isMustBePresent()
	 * @see #getGenericMatch()
	 * @generated
	 */
	EAttribute getGenericMatch_MustBePresent();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodMatch <em>Method Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Match</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodMatch
	 * @generated
	 */
	EClass getMethodMatch();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodMatch#getMethodspecification <em>Methodspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Methodspecification</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.MethodMatch#getMethodspecification()
	 * @see #getMethodMatch()
	 * @generated
	 */
	EReference getMethodMatch_Methodspecification();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.HierarchicalContext <em>Hierarchical Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchical Context</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.HierarchicalContext
	 * @generated
	 */
	EClass getHierarchicalContext();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.HierarchicalContext#getHierachy <em>Hierachy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hierachy</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.HierarchicalContext#getHierachy()
	 * @see #getHierarchicalContext()
	 * @generated
	 */
	EReference getHierarchicalContext_Hierachy();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.XMLMatch <em>XML Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Match</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.XMLMatch
	 * @generated
	 */
	EClass getXMLMatch();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.XMLMatch#getXmlString <em>Xml String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml String</em>'.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.XMLMatch#getXmlString()
	 * @see #getXMLMatch()
	 * @generated
	 */
	EAttribute getXMLMatch_XmlString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructureFactory getStructureFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.PCMAttributeProviderImpl <em>PCM Attribute Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.PCMAttributeProviderImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getPCMAttributeProvider()
		 * @generated
		 */
		EClass PCM_ATTRIBUTE_PROVIDER = eINSTANCE.getPCMAttributeProvider();

		/**
		 * The meta object literal for the '<em><b>Resourcecontainer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ATTRIBUTE_PROVIDER__RESOURCECONTAINER = eINSTANCE.getPCMAttributeProvider_Resourcecontainer();

		/**
		 * The meta object literal for the '<em><b>Assemblycontext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ATTRIBUTE_PROVIDER__ASSEMBLYCONTEXT = eINSTANCE.getPCMAttributeProvider_Assemblycontext();

		/**
		 * The meta object literal for the '<em><b>Linkingresource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ATTRIBUTE_PROVIDER__LINKINGRESOURCE = eINSTANCE.getPCMAttributeProvider_Linkingresource();

		/**
		 * The meta object literal for the '<em><b>Methodspecification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ATTRIBUTE_PROVIDER__METHODSPECIFICATION = eINSTANCE.getPCMAttributeProvider_Methodspecification();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodSpecificationImpl <em>Method Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodSpecificationImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getMethodSpecification()
		 * @generated
		 */
		EClass METHOD_SPECIFICATION = eINSTANCE.getMethodSpecification();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_SPECIFICATION__SIGNATURE = eINSTANCE.getMethodSpecification_Signature();

		/**
		 * The meta object literal for the '<em><b>Hierachy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_SPECIFICATION__HIERACHY = eINSTANCE.getMethodSpecification_Hierachy();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.ConnectionRestrictionImpl <em>Connection Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.ConnectionRestrictionImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getConnectionRestriction()
		 * @generated
		 */
		EClass CONNECTION_RESTRICTION = eINSTANCE.getConnectionRestriction();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_RESTRICTION__CONNECTOR = eINSTANCE.getConnectionRestriction_Connector();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.ServiceRestrictionImpl <em>Service Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.ServiceRestrictionImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getServiceRestriction()
		 * @generated
		 */
		EClass SERVICE_RESTRICTION = eINSTANCE.getServiceRestriction();

		/**
		 * The meta object literal for the '<em><b>Assemblycontext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_RESTRICTION__ASSEMBLYCONTEXT = eINSTANCE.getServiceRestriction_Assemblycontext();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_RESTRICTION__SERVICE = eINSTANCE.getServiceRestriction_Service();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.EntityMatchImpl <em>Entity Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.EntityMatchImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getEntityMatch()
		 * @generated
		 */
		EClass ENTITY_MATCH = eINSTANCE.getEntityMatch();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MATCH__ENTITY = eINSTANCE.getEntityMatch_Entity();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MATCH__CATEGORY = eINSTANCE.getEntityMatch_Category();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.GenericMatchImpl <em>Generic Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.GenericMatchImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getGenericMatch()
		 * @generated
		 */
		EClass GENERIC_MATCH = eINSTANCE.getGenericMatch();

		/**
		 * The meta object literal for the '<em><b>Attributevalue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_MATCH__ATTRIBUTEVALUE = eINSTANCE.getGenericMatch_Attributevalue();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_MATCH__OPERATION = eINSTANCE.getGenericMatch_Operation();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_MATCH__CATEGORY = eINSTANCE.getGenericMatch_Category();

		/**
		 * The meta object literal for the '<em><b>Must Be Present</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_MATCH__MUST_BE_PRESENT = eINSTANCE.getGenericMatch_MustBePresent();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodMatchImpl <em>Method Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.MethodMatchImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getMethodMatch()
		 * @generated
		 */
		EClass METHOD_MATCH = eINSTANCE.getMethodMatch();

		/**
		 * The meta object literal for the '<em><b>Methodspecification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_MATCH__METHODSPECIFICATION = eINSTANCE.getMethodMatch_Methodspecification();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.HierarchicalContextImpl <em>Hierarchical Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.HierarchicalContextImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getHierarchicalContext()
		 * @generated
		 */
		EClass HIERARCHICAL_CONTEXT = eINSTANCE.getHierarchicalContext();

		/**
		 * The meta object literal for the '<em><b>Hierachy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHICAL_CONTEXT__HIERACHY = eINSTANCE.getHierarchicalContext_Hierachy();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.XMLMatchImpl <em>XML Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.XMLMatchImpl
		 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.StructurePackageImpl#getXMLMatch()
		 * @generated
		 */
		EClass XML_MATCH = eINSTANCE.getXMLMatch();

		/**
		 * The meta object literal for the '<em><b>Xml String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_MATCH__XML_STRING = eINSTANCE.getXMLMatch_XmlString();

	}

} //StructurePackage
