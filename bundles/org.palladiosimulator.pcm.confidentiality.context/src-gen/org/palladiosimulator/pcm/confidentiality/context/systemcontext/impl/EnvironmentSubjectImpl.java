/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.systemcontext.EnvironmentSubject;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.impl.EnvironmentSubjectImpl#isEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EnvironmentSubjectImpl extends AttributeImpl implements EnvironmentSubject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentSubjectImpl()
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
		return SystemcontextPackage.Literals.ENVIRONMENT_SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnvironment()
	{
		return (Boolean)eGet(SystemcontextPackage.Literals.ENVIRONMENT_SUBJECT__ENVIRONMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(boolean newEnvironment)
	{
		eSet(SystemcontextPackage.Literals.ENVIRONMENT_SUBJECT__ENVIRONMENT, newEnvironment);
	}

} //EnvironmentSubjectImpl
