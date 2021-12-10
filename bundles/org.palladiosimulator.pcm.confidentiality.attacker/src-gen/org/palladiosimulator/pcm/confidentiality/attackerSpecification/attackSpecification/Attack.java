/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getAttack()
 * @model abstract="true"
 * @generated
 */
public interface Attack extends Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model authentificatedDataType="org.eclipse.emf.ecore.xml.type.Boolean" authentificatedRequired="true"
	 * @generated
	 */
	boolean canExploit(Vulnerability vulnerability, boolean authentificated, AttackVector attackVector);

} // Attack
