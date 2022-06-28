package org.palladiosimulator.pcm.confidentiality.context;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.palladiosimulator.pcm.confidentiality.context.scoping.ConfContextGlobalScopeProvider;

@SuppressWarnings("all")
public class ConfidentialityContextDSLRuntimeModule extends AbstractConfidentialityContextDSLRuntimeModule {
  public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
    return ConfContextResourceDescriptionStrategy.class;
  }
  
  @Override
  public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
    return ConfContextGlobalScopeProvider.class;
  }
}
