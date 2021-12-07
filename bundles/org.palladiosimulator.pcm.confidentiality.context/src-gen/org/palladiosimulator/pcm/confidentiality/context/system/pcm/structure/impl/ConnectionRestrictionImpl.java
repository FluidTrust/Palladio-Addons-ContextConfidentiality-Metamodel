/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionRestriction;
import org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage;

import org.palladiosimulator.pcm.core.composition.Connector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.impl.ConnectionRestrictionImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionRestrictionImpl extends MethodSpecificationImpl implements ConnectionRestriction
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionRestrictionImpl()
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
		return StructurePackage.Literals.CONNECTION_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector()
	{
		return (Connector)eGet(StructurePackage.Literals.CONNECTION_RESTRICTION__CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector)
	{
		eSet(StructurePackage.Literals.CONNECTION_RESTRICTION__CONNECTOR, newConnector);
	}

} //ConnectionRestrictionImpl
