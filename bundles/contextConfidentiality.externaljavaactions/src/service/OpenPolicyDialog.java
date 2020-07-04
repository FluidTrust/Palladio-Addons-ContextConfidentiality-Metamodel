package service;

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
 * Select Policy from Selected Resource 
 */
public class OpenPolicyDialog {
	public static EObject loadPolicyFromXMI(EList<Policy> policy_list) {	
		Shell shell = Display.getCurrent().getActiveShell(); 
		shell = getShell();
		shell.open();
	
		String[] dialog_policylist = new String[policy_list.size()];
		int index = 0;
    	for (Policy policy_: policy_list) {
    		dialog_policylist[index] = policy_.getEntityName() + "," + policy_.getId();
    		++index;
		}
		 				
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new LabelProvider());
		dialog.setTitle("Policy Selection");
		dialog.setMessage("Select a Policy (* = any string, ? = any char):");
		dialog.setElements(dialog_policylist);
		//dialog.open();
		
		
		if (dialog.open() == Dialog.OK) {
			Object[] chosenPolicy = dialog.getResult();
			String[] strChosenPolicy = (chosenPolicy[0].toString().split(","));
			
			for (Policy policy : policy_list) {
				if (policy.getId().contains(strChosenPolicy[1])) {
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
		  }
		  else {
		    return window.getShell();
		  }
		  return null;
	}
}
