package runneroo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import behaviour.Behaviour;
import behaviour.*;

import structural.Program;
import structural.StructuralFactory;
import structural.StructuralPackage;
import xtendcodegenerator.ToAnyLanguage;
import xtendcodegenerator.ToJava;

public class StartGeneration {
	
	
	public static String GenerateCode(String behaviPath, String structuralPath, String directoryOutput,
			ToAnyLanguage xtendrunner) {
		// TODO Auto-generated method stub
		IPath behvPath=new Path(behaviPath);
		Behaviour behvInstance=loadBahaviourInstance(behvPath);
		
		IPath structPath=new Path(structuralPath);
		Program programInstance=loadProgram(structPath);
	   String s = null;
        
		/* Set the transformation runner to default if not specified */
	   
		if(xtendrunner == null)
		{
			
			xtendrunner = new ToJava() ;
			
						
		}
		
		/* Check if transformation is ready to run */
		if (behvInstance != null && programInstance != null){
	
          
			s = xtendrunner.runCodeGenerator(behvInstance,programInstance);
			 System.out.print(s);
		}
		/* Print transformation result to file */
		if (s != null) {
			java.nio.file.Path path = java.nio.file.Paths.get(directoryOutput, programInstance.getMainMethod().getBelongToClass().getName().concat(xtendrunner.getEndFile()));
			System.out.println(path.toString());
			
			try {
				WriteToFile(s, path);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(s);
		}
		
		return null;
	}

	static void WriteToFile(String text, java.nio.file.Path filePath) throws IOException
	{
		BufferedWriter output = null;
		try {
			java.io.File outfile = new java.io.File(filePath.toString());
			output = new BufferedWriter(new FileWriter(outfile));
			output.write(text);
			System.out.println(outfile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (output != null) {
				output.close();
			}
		}
	}


	private static Program loadProgram(IPath structPath) {
		// TODO Auto-generated method stub
		// Create a resource set.
				ResourceSet resourceSet = new ResourceSetImpl();

				// Register the default resource factory -- only needed for stand-alone!
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
						.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
				
				StructuralPackage strucpkg=StructuralPackage.eINSTANCE;
				// Get the URI of the model file.
				URI fileURI = URI.createFileURI(structPath.makeAbsolute().toString());

				// Demand load the resource for this file, here the actual loading is
				// done.
				Resource resource = resourceSet.getResource(fileURI, true);
				// get model elements from the resource
				// note: get(0) might be dangerous. why?
				EObject myModelObject = resource.getContents().get(0);

				// Do something with the model
				if (myModelObject instanceof Program) {
					return (Program) myModelObject;
				}

				
		return null;
	}

	private static Behaviour loadBahaviourInstance(IPath behvPath) {
		// TODO Auto-generated method stub
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	
		BehaviourPackage behaviourPkg=BehaviourPackage.eINSTANCE;
		
		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(behvPath.makeAbsolute().toString());

		// Demand load the resource for this file, here the actual loading is
		// done.
		Resource resource = resourceSet.getResource(fileURI, true);
		// get model elements from the resource
		// note: get(0) might be dangerous. why?
		EObject myModelObject = resource.getContents().get(0);

		// Do something with the model
		if (myModelObject instanceof Behaviour) {
			return (Behaviour) myModelObject;
		}
		return null;
	}

}
