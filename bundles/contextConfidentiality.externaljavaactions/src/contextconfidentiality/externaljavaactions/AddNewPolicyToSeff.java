package contextconfidentiality.externaljavaactions;

import java.util.Collection;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSetContainer;
import org.palladiosimulator.pcm.confidentiality.context.set.SetFactory;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

import contextconfidentiality.service.ApplyPolicyUtil;
import contextconfidentiality.service.PolicyVisibility;

/* 
 * Creates a new Policy within a SEFF Diagram.
 * But stereotype needs to already be applied and a Policy Container has to exist 
 */
public class AddNewPolicyToSeff implements IExternalJavaAction {
	
	private static Logger logger = Logger.getLogger(AddExistingPolicyToSeff.class.getName());

	public AddNewPolicyToSeff() { }
	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
	    return true;
		//return false;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		ResourceDemandingSEFF seff = (ResourceDemandingSEFF) arg1.get("container");
		DSemanticDiagram seffDiagram = (DSemanticDiagram) arg1.get("containerView");
		
		ContextSet policy = SetFactory.eINSTANCE.createContextSet();
		
		EList<DDiagramElement> diagramElements = seffDiagram.getOwnedDiagramElements();
		ContextSetContainer policyContainer = null;
		for (DDiagramElement element : diagramElements) {
			policyContainer = (element.getTarget().getClass().getSimpleName() //FIXME not using the ClassName but rather the Interface
					.contentEquals("PolicyContainerImpl")) ? (ContextSetContainer) element.getTarget() : null;
		}
		
		if (policyContainer != null) {	
			
			policyContainer.getPolicies().add(policy);	
			policy.setEntityName("Policy" + policy.getId());
			
			ApplyPolicyUtil.createContextSeffSPecification(seff, policy, (ConfidentialAccessSpecification) policyContainer.eContainer());
			
			
			Session session = SessionManager.INSTANCE.getExistingSession(
					seffDiagram.eResource().getURI());				
			session.save(new NullProgressMonitor());
			
			PolicyVisibility.showHideContainers(policy, seffDiagram);
			
			session.save(new NullProgressMonitor());
			logger.info("Created Policy Container");
		}
	}
}


