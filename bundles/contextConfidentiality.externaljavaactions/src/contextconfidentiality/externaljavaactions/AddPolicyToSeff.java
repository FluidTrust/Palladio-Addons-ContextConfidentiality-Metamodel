package contextconfidentiality.externaljavaactions;

import java.util.Collection;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;
import org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyFactoryImpl;
import org.palladiosimulator.pcm.confidentiality.profile.ProfileConstants;
import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

import contextconfidentiality.service.ApplyProfilesStereotypes;
import contextconfidentiality.service.OpenResourceDialog;
import contextconfidentiality.service.PolicyVisibility;
import contextconfidentiality.service.OpenResourceDialog.ResourceObject;


public class AddPolicyToSeff implements IExternalJavaAction {
	
	private static Logger logger = Logger.getLogger(AddExistingPolicyToSeff.class.getName());

	public AddPolicyToSeff() { }

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		for (EObject eObject : arg0) {
			return 	(StereotypeAPI.isStereotypeApplicable(eObject, ProfileConstants.STEREOTYPE_POLICY) 
					|| StereotypeAPI.isStereotypeApplied(eObject, ProfileConstants.STEREOTYPE_POLICY));
		}
		System.out.println("Applicable false");
		return false;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		ResourceDemandingSEFF seff = (ResourceDemandingSEFF) arg1.get("container");
		DSemanticDiagram seffDiagram = (DSemanticDiagram) arg1.get("containerView");
		
		Policy policy = PolicyFactoryImpl.init().createPolicy();
		
		ResourceObject confResourceObject = OpenResourceDialog.loadResource(seff, logger);
		ConfidentialAccessSpecification confRoot = (confResourceObject != null 
				&& confResourceObject.getRoot().getClass().getSimpleName()
				.contentEquals("ConfidentialAccessSpecificationImpl")) 
				? (ConfidentialAccessSpecification) confResourceObject.getRoot() : null;		
		
		if (confRoot != null) {
			confRoot.getPolicyContainer().getPolicies().add(policy);
			policy.setEntityName("Seff_Policy");
			
			ApplyProfilesStereotypes.applyProfilesStereotypes(arg0, seff, policy);
			
			Session session = SessionManager.INSTANCE.getExistingSession(
					seffDiagram.eResource().getURI());				
			session.save(new NullProgressMonitor());
			
			PolicyVisibility.showHideContainers(policy, seffDiagram);
			
			session.save(new NullProgressMonitor());
			logger.info("Created Policy Container");
		}
	}
}


