/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.DataTypes;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributeValueImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributeValueImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeValueImpl extends EntityImpl implements AttributeValue
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SystemcontextPackage.Literals.ATTRIBUTE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes getType()
	{
		return (DataTypes)eGet(SystemcontextPackage.Literals.ATTRIBUTE_VALUE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataTypes newType)
	{
		eSet(SystemcontextPackage.Literals.ATTRIBUTE_VALUE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<String> getValues()
	{
		return (List<String>)eGet(SystemcontextPackage.Literals.ATTRIBUTE_VALUE__VALUES, true);
	}

} //AttributeValueImpl
