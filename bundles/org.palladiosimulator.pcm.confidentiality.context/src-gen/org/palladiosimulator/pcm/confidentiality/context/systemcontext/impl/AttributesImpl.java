/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attributes;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.AttributesImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributesImpl extends CDOObjectImpl implements Attributes
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributesImpl()
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
		return SystemcontextPackage.Literals.ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Attribute> getAttribute()
	{
		return (List<Attribute>)eGet(SystemcontextPackage.Literals.ATTRIBUTES__ATTRIBUTE, true);
	}

} //AttributesImpl
