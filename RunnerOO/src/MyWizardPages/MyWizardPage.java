package MyWizardPages;


import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;



public class MyWizardPage extends WizardPage {
	
	Composite container;
	private FileFieldEditor behvFile;
	private FileFieldEditor structuralFile;
	private DirectoryFieldEditor outputDirectory;
	private Combo languageChooser;
	
	public MyWizardPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
		setTitle(pageName);
		
	}
	

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		container=new Composite(parent, SWT.NULL);// required
		
		GridLayout layout=new GridLayout();
		container.setLayout(layout);
		
		
		behvFile=new FileFieldEditor("behav", "Choose Behaviuor Instance", container);
		structuralFile=new FileFieldEditor("structural", "Choose Structural Instance", container);
		outputDirectory=new DirectoryFieldEditor("dirout", "Choose Output Directory", container);
		languageChooser=new Combo(container, SWT.READ_ONLY);
		languageChooser.add("Java");
		languageChooser.add("C++");
		languageChooser.select(0);
		
		setControl(container);// required
		

	}

public String getLanguageChooser(){
	return languageChooser.getText();
	
}
	
public String getBehaviName(){
	return behvFile.getStringValue();
}
public String getStructuralName(){
	return structuralFile.getStringValue();
}

public String getDirectoryOutput(){
	return outputDirectory.getStringValue();
}
	
}


