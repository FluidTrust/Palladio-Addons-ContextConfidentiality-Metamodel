/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CWEID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getCweID <em>Cwe ID</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getChildren <em>Children</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getParents <em>Parents</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getCWEID()
 * @model
 * @generated
 */
public interface CWEID extends AttackCategory {
	/**
	 * Returns the value of the '<em><b>Cwe ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cwe ID</em>' attribute.
	 * @see #setCweID(int)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getCWEID_CweID()
	 * @model
	 * @generated
	 */
	int getCweID();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getCweID <em>Cwe ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cwe ID</em>' attribute.
	 * @see #getCweID()
	 * @generated
	 */
	void setCweID(int value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID}.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getCWEID_Children()
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getParents
	 * @model opposite="parents"
	 * @generated
	 */
	EList<CWEID> getChildren();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID}.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getCWEID_Parents()
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.CWEID#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	EList<CWEID> getParents();

} // CWEID
