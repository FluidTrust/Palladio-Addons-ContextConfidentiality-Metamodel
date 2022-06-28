package org.palladiosimulator.pcm.confidentiality.context;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.confidentiality.context.confContextDSL.Include;
import org.palladiosimulator.pcm.confidentiality.context.confContextDSL.Model;

@SuppressWarnings("all")
public class ConfContextResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  public static final String INCLUDES = "includes";
  
  @Inject
  private ImportUriResolver uriResolver;
  
  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    boolean _xblockexpression = false;
    {
      if ((eObject instanceof Model)) {
        this.createEObjectDescriptionForModel(((Model)eObject), acceptor);
        return true;
      }
      EClass _eClass = eObject.eClass();
      EClass _allocation = AllocationPackage.eINSTANCE.getAllocation();
      boolean _tripleEquals = (_eClass == _allocation);
      if (_tripleEquals) {
        this.createEObjectDescriptionForAllocation(eObject, acceptor);
        return false;
      }
      _xblockexpression = super.createEObjectDescriptions(eObject, acceptor);
    }
    return _xblockexpression;
  }
  
  public void createEObjectDescriptionForModel(final Model model, final IAcceptor<IEObjectDescription> acceptor) {
    final ArrayList<Object> uris = CollectionLiterals.<Object>newArrayList();
    final Consumer<Include> _function = (Include it) -> {
      uris.add(this.uriResolver.apply(it));
    };
    model.getIncludes().forEach(_function);
    final HashMap<String, String> userData = new HashMap<String, String>();
    userData.put(ConfContextResourceDescriptionStrategy.INCLUDES, IterableExtensions.join(uris, ","));
    acceptor.accept(EObjectDescription.create(QualifiedName.create(model.eResource().getURI().toString()), model, userData));
  }
  
  protected void createEObjectDescriptionForAllocation(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    final Allocation allocation = ((Allocation) eObject);
    acceptor.accept(
      EObjectDescription.create(QualifiedName.create(this.getEResourceFileName(allocation.eResource())), allocation));
  }
  
  private String getEResourceFileName(final Resource eResource) {
    return eResource.getURI().lastSegment().substring(0, eResource.getURI().lastSegment().lastIndexOf("."));
  }
}
