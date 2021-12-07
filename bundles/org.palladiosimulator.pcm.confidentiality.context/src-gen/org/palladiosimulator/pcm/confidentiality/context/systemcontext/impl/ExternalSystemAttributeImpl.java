/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.ExternalSystemAttribute;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External System Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.ExternalSystemAttributeImpl#getExternalName <em>External Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalSystemAttributeImpl extends EnvironmentSubjectImpl implements ExternalSystemAttribute
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalSystemAttributeImpl()
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
		return SystemcontextPackage.Literals.EXTERNAL_SYSTEM_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalName()
	{
		return (String)eGet(SystemcontextPackage.Literals.EXTERNAL_SYSTEM_ATTRIBUTE__EXTERNAL_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalName(String newExternalName)
	{
		eSet(SystemcontextPackage.Literals.EXTERNAL_SYSTEM_ATTRIBUTE__EXTERNAL_NAME, newExternalName);
	}

} //ExternalSystemAttributeImpl
