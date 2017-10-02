package MyWizard;

import org.eclipse.jface.wizard.Wizard;
import MyWizardPages.MyWizardPage;
import xtendcodegenerator.ToAnyLanguage;
import xtendcodegenerator.ToJava;
import runneroo.StartGeneration;

public class MyWizard extends Wizard {
	MyWizardPage mypage;
	
	public MyWizard() {
		// TODO Auto-generated constructor stub
		super();
		//setNeedsProgressMonitor(true);
	}
	
	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		//super.addPages();
		mypage=new MyWizardPage("Generate Code");
		addPage(mypage);
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		MyWizardPage _mypage=mypage;
		ToAnyLanguage runner = null;
		
		if(_mypage.getLanguageChooser()=="Java"){
			runner=new ToJava();
			
			
		}
		
		else if(_mypage.getLanguageChooser()=="C++"){
			
		}
		
		
		
		String s=runneroo.StartGeneration.GenerateCode(_mypage.getBehaviName(),_mypage.getStructuralName(),_mypage.getDirectoryOutput(),runner);
		return true;// to close dialoge
	}

}
