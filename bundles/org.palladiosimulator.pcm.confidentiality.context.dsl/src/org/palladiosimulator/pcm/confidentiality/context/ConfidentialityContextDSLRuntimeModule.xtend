package org.palladiosimulator.pcm.confidentiality.context

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.palladiosimulator.pcm.confidentiality.context.scoping.ConfContextGlobalScopeProvider

class ConfidentialityContextDSLRuntimeModule extends AbstractConfidentialityContextDSLRuntimeModule {
	def Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		ConfContextResourceDescriptionStrategy
	}
	
	override Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		ConfContextGlobalScopeProvider
	}
}