package MyWizard;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;



public class RunWizard extends AbstractHandler{
	
	// automatically called when handler in extension point  set to RunWizard
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		IWorkbench wb = PlatformUI.getWorkbench(); 
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow(); 
		WizardDialog wDia = new WizardDialog(win.getShell(), new MyWizard());
		wDia.open();
		return null;
	}

	
	

}
