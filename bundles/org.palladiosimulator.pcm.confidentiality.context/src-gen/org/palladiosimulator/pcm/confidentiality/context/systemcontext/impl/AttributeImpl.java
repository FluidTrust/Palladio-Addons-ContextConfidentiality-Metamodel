/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributeImpl#getAttributevalue <em>Attributevalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AttributeImpl extends EntityImpl implements Attribute
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl()
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
		return SystemcontextPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<AttributeValue> getAttributevalue()
	{
		return (List<AttributeValue>)eGet(SystemcontextPackage.Literals.ATTRIBUTE__ATTRIBUTEVALUE, true);
	}

} //AttributeImpl
