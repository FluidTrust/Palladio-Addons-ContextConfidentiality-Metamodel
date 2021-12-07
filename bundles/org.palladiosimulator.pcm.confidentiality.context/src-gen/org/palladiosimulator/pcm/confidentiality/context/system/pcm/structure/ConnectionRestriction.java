/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure;

import org.palladiosimulator.pcm.core.composition.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionRestriction#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getConnectionRestriction()
 * @model
 * @generated
 */
public interface ConnectionRestriction extends MethodSpecification
{
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getConnectionRestriction_Connector()
	 * @model required="true"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.ConnectionRestriction#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // ConnectionRestriction
