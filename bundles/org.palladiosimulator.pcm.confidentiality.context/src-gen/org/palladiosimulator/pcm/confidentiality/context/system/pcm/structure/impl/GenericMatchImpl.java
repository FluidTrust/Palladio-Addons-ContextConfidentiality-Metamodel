/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.policy.Category;
import org.palladiosimulator.pcm.confidentiality.context.policy.Operations;

import org.palladiosimulator.pcm.confidentiality.context.policy.impl.MatchImpl;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.GenericMatch;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.GenericMatchImpl#getAttributevalue <em>Attributevalue</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.GenericMatchImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.GenericMatchImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.GenericMatchImpl#isMustBePresent <em>Must Be Present</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericMatchImpl extends MatchImpl implements GenericMatch
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericMatchImpl()
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
		return StructurePackage.Literals.GENERIC_MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue getAttributevalue()
	{
		return (AttributeValue)eGet(StructurePackage.Literals.GENERIC_MATCH__ATTRIBUTEVALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributevalue(AttributeValue newAttributevalue)
	{
		eSet(StructurePackage.Literals.GENERIC_MATCH__ATTRIBUTEVALUE, newAttributevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operations getOperation()
	{
		return (Operations)eGet(StructurePackage.Literals.GENERIC_MATCH__OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operations newOperation)
	{
		eSet(StructurePackage.Literals.GENERIC_MATCH__OPERATION, newOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory()
	{
		return (Category)eGet(StructurePackage.Literals.GENERIC_MATCH__CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory)
	{
		eSet(StructurePackage.Literals.GENERIC_MATCH__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustBePresent()
	{
		return (Boolean)eGet(StructurePackage.Literals.GENERIC_MATCH__MUST_BE_PRESENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustBePresent(boolean newMustBePresent)
	{
		eSet(StructurePackage.Literals.GENERIC_MATCH__MUST_BE_PRESENT, newMustBePresent);
	}

} //GenericMatchImpl
