package contextconfidentiality.service;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;


/* 
 * Select Policy from Chosen Resource 
 */
public class OpenPolicyDialog {
	public static EObject loadPolicy(EList<Policy> policyList) {	
		Shell shell = Display.getCurrent().getActiveShell(); 
		shell = getShell();
		shell.open();
	
		String[] dialogElementList = new String[policyList.size()];
		int index = 0;
		for (Policy policy : policyList) {
    		dialogElementList[index] = policy.getEntityName() + "," + policy.getId();
    		++index;
		}
		 				
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new LabelProvider());
		dialog.setTitle("Policy Selection");
		dialog.setMessage("Select a Policy (* = any string, ? = any char):");
		dialog.setElements(dialogElementList);
		
		if (dialog.open() == Dialog.OK) {
			Object[] selectedElement = dialog.getResult();
			String[] selectedElementList = (selectedElement[0].toString().split(","));
			
			for (Policy policy : policyList) {
				if (policy.getId().contains(selectedElementList[1])) {
					return policy;
				}
			}
		}
		return null;
	}
			
	private static Shell getShell() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		  if (window == null) {
		    IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
		    if (windows.length > 0) {
		       return windows[0].getShell();
		    }
		  } else {
		    return window.getShell();
		  }
		  return null;
	}
}
