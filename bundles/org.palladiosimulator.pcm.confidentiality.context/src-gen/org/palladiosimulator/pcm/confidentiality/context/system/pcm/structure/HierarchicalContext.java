/**
 */
package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure;

import java.util.List;

import org.eclipse.emf.cdo.CDOObject;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchical Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.HierarchicalContext#getHierachy <em>Hierachy</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getHierarchicalContext()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface HierarchicalContext extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Hierachy</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.composition.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierachy</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.StructurePackage#getHierarchicalContext_Hierachy()
	 * @model
	 * @generated
	 */
	List<AssemblyContext> getHierachy();

} // HierarchicalContext
