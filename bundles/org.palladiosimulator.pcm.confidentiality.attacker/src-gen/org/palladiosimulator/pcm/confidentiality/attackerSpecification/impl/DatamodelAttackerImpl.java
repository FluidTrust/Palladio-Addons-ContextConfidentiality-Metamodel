/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datamodel Attacker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.DatamodelAttackerImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.DatamodelAttackerImpl#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.DatamodelAttackerImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.DatamodelAttackerImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatamodelAttackerImpl extends EntityImpl implements DatamodelAttacker {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatamodelAttackerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttackerPackage.Literals.DATAMODEL_ATTACKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		return (DataType) eGet(AttackerPackage.Literals.DATAMODEL_ATTACKER__DATA_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		eSet(AttackerPackage.Literals.DATAMODEL_ATTACKER__DATA_TYPE, newDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceName() {
		return (String) eGet(AttackerPackage.Literals.DATAMODEL_ATTACKER__REFERENCE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceName(String newReferenceName) {
		eSet(AttackerPackage.Literals.DATAMODEL_ATTACKER__REFERENCE_NAME, newReferenceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSource() {
		return (EObject) eGet(AttackerPackage.Literals.DATAMODEL_ATTACKER__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EObject newSource) {
		eSet(AttackerPackage.Literals.DATAMODEL_ATTACKER__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature getMethod() {
		return (OperationSignature) eGet(AttackerPackage.Literals.DATAMODEL_ATTACKER__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(OperationSignature newMethod) {
		eSet(AttackerPackage.Literals.DATAMODEL_ATTACKER__METHOD, newMethod);
	}

} //DatamodelAttackerImpl
