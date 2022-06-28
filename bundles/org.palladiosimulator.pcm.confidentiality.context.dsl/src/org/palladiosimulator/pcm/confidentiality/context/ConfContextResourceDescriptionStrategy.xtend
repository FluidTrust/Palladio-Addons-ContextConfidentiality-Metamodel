package org.palladiosimulator.pcm.confidentiality.context

import com.google.inject.Inject
import java.util.HashMap
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.scoping.impl.ImportUriResolver
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.emf.ecore.EObject
import org.palladiosimulator.pcm.confidentiality.context.confContextDSL.Model
import org.palladiosimulator.pcm.allocation.AllocationPackage
import org.palladiosimulator.pcm.allocation.Allocation
import org.eclipse.emf.ecore.resource.Resource

class ConfContextResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	public static final String INCLUDES = "includes"

	@Inject
	ImportUriResolver uriResolver

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if(eObject instanceof Model) {
			this.createEObjectDescriptionForModel(eObject, acceptor)
			return true
		}
		
		if (eObject.eClass === AllocationPackage.eINSTANCE.allocation) {
			createEObjectDescriptionForAllocation(eObject, acceptor)
			return false
		}
		
		super.createEObjectDescriptions(eObject, acceptor)
	}

	def void createEObjectDescriptionForModel(Model model, IAcceptor<IEObjectDescription> acceptor) {
		val uris = newArrayList()
		model.includes.forEach[uris.add(uriResolver.apply(it))]
		val userData = new HashMap<String, String>
		userData.put(INCLUDES, uris.join(","))
		acceptor.accept(EObjectDescription.create(QualifiedName.create(model.eResource.URI.toString), model, userData))
	}
	
	protected def createEObjectDescriptionForAllocation(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		val allocation = eObject as Allocation
		acceptor.accept(
			EObjectDescription.create(QualifiedName.create(getEResourceFileName(allocation.eResource)), allocation))
	}
	
	private def getEResourceFileName(Resource eResource) {
		eResource.URI.lastSegment.substring(0, eResource.URI.lastSegment.lastIndexOf("."))
	}
}