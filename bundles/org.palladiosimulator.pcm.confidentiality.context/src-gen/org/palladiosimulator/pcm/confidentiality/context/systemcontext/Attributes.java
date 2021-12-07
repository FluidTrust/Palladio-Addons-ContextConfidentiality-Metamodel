/**
 */
package org.palladiosimulator.pcm.confidentiality.context.systemcontext;

import java.util.List;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attributes#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getAttributes()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Attributes extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.systemcontext.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.systemcontext.SystemcontextPackage#getAttributes_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	List<Attribute> getAttribute();

} // Attributes
