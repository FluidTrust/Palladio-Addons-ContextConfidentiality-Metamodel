/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemcontextFactoryImpl extends EFactoryImpl implements SystemcontextFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemcontextFactory init()
	{
		try
		{
			SystemcontextFactory theSystemcontextFactory = (SystemcontextFactory)EPackage.Registry.INSTANCE.getEFactory(SystemcontextPackage.eNS_URI);
			if (theSystemcontextFactory != null)
			{
				return theSystemcontextFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemcontextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemcontextFactoryImpl()
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
			case SystemcontextPackage.ATTRIBUTES: return (EObject)createAttributes();
			case SystemcontextPackage.ATTRIBUTE_VALUE: return createAttributeValue();
			case SystemcontextPackage.SYSTEM_ENTITY_ATTRIBUTE: return createSystemEntityAttribute();
			case SystemcontextPackage.EXTERNAL_SYSTEM_ATTRIBUTE: return createExternalSystemAttribute();
			case SystemcontextPackage.SIMPLE_ATTRIBUTE: return createSimpleAttribute();
			case SystemcontextPackage.XML_ATTRIBUTE: return createXMLAttribute();
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
			case SystemcontextPackage.DATA_TYPES:
				return createDataTypesFromString(eDataType, initialValue);
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
			case SystemcontextPackage.DATA_TYPES:
				return convertDataTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes createAttributes()
	{
		AttributesImpl attributes = new AttributesImpl();
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue createAttributeValue()
	{
		AttributeValueImpl attributeValue = new AttributeValueImpl();
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemEntityAttribute createSystemEntityAttribute()
	{
		SystemEntityAttributeImpl systemEntityAttribute = new SystemEntityAttributeImpl();
		return systemEntityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSystemAttribute createExternalSystemAttribute()
	{
		ExternalSystemAttributeImpl externalSystemAttribute = new ExternalSystemAttributeImpl();
		return externalSystemAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAttribute createSimpleAttribute()
	{
		SimpleAttributeImpl simpleAttribute = new SimpleAttributeImpl();
		return simpleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLAttribute createXMLAttribute()
	{
		XMLAttributeImpl xmlAttribute = new XMLAttributeImpl();
		return xmlAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes createDataTypesFromString(EDataType eDataType, String initialValue)
	{
		DataTypes result = DataTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypesToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemcontextPackage getSystemcontextPackage()
	{
		return (SystemcontextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemcontextPackage getPackage()
	{
		return SystemcontextPackage.eINSTANCE;
	}

} //SystemcontextFactoryImpl
