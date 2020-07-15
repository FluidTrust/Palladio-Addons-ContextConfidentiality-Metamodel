package contextconfidentiality.service;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.api.helper.graphicalfilters.HideFilterHelper;
import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;

/* Only show selected Policy --> hide unselected Policies */
public class PolicyVisibility {
	public static void showHideContainers(Policy chosenPolicy, DSemanticDiagram diagram) {
		
		EList<DDiagramElementContainer> containers = diagram.getContainers();
		
		for (DDiagramElementContainer container : containers) {
			EList<DDiagramElement> elements = container.getElements();
			
			for (DDiagramElement element: elements) {			
				EList<EObject> elementCrossReferences = element.eCrossReferences();
				
				for (EObject crossReference : elementCrossReferences) {					
					
					Policy policyCrossReference = (crossReference.getClass().getSimpleName().
							contentEquals("PolicyImpl")) ? ((Policy) crossReference) : null;
					
					if (policyCrossReference != null 
							&& !policyCrossReference.getId().contains(chosenPolicy.getId())) {
						HideFilterHelper.INSTANCE.hide(element);
						
					} else if (policyCrossReference != null 
							&& policyCrossReference.getId().contains(chosenPolicy.getId())) {
						HideFilterHelper.INSTANCE.reveal(element);
					}
				}
			}
		}
	}
}
