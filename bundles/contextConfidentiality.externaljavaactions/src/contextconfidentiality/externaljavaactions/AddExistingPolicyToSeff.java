package contextconfidentiality.externaljavaactions;

import java.util.Collection;
import java.util.Map;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;
import org.palladiosimulator.pcm.confidentiality.context.specification.SpecificationFactory;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

import contextconfidentiality.service.ApplyPolicyUtil;
import contextconfidentiality.service.OpenPolicyDialog;
import contextconfidentiality.service.OpenResourceDialog;
import contextconfidentiality.service.PolicyVisibility;
import contextconfidentiality.service.OpenResourceDialog.ResourceObject;
import java.util.logging.Logger;

public class AddExistingPolicyToSeff implements IExternalJavaAction {
	private static Logger logger = Logger.getLogger(AddExistingPolicyToSeff.class.getName());
	
	public AddExistingPolicyToSeff()  { } 

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		ResourceDemandingSEFF seff = (ResourceDemandingSEFF) arg1.get("container");
		DSemanticDiagram seffDiagram = (DSemanticDiagram) arg1.get("containerView");
	
		ResourceObject confResourceObject = OpenResourceDialog.loadResource(seff, logger);
		ConfidentialAccessSpecification confRoot = (confResourceObject != null 
				&& confResourceObject.getRoot().getClass().getSimpleName()
				.contentEquals("ConfidentialAccessSpecificationImpl")) 
				? (ConfidentialAccessSpecification) confResourceObject.getRoot() : null;
		
		//FIXME is now a list therefore the editor should also show a list
		EList <ContextSet> policyList = (confRoot != null) ? confRoot.getSetContainer().get(0).getPolicies() : null;
		ContextSet selectedPolicy = (policyList != null) 
				? (ContextSet) OpenPolicyDialog.loadPolicy(policyList) : null;
		
		if (selectedPolicy != null) {
			DAnalysisSession session = (DAnalysisSession) SessionManager.INSTANCE.getExistingSession(
					seffDiagram.eResource().getURI());	
						
			session.addSemanticResource(confResourceObject.getResource().getURI(), 
					new NullProgressMonitor());		
			session.save(new NullProgressMonitor());
			
			logger.info("Adding " + selectedPolicy.getEntityName() + " Policy to SEFF");
			
			ApplyPolicyUtil.createContextSeffSPecification(seff, selectedPolicy, confRoot);
			
									
			DialectManager.INSTANCE.refresh(seffDiagram, new NullProgressMonitor());
			
			PolicyVisibility.showHideContainers(selectedPolicy, seffDiagram);
			session.save(new NullProgressMonitor());
			refreshProject(seffDiagram);
			
			logger.info("Successfully added Policy to SEFF");
		} else {
			logger.warning("Couldn't add Policy to SEFF - please check if the correct "
					+ "Resource was selected (Type: ConfidentialAccessSpecificationImpl)");
		}
	}
	
	public void refreshProject(DSemanticDiagram seffDiagram) {		
		try {
			String projectName = seffDiagram.eResource().getURI().segment(1);
			IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = workspaceRoot.getProject(projectName);
			project.refreshLocal(IResource.DEPTH_ZERO, null);
	
		} catch (CoreException e) {
			logger.warning("Failed to refresh Project");
			e.printStackTrace();
		}
	}
}
