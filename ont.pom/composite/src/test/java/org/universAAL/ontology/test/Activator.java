package org.universAAL.ontology.test;

import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.owl.OntologyManagement;

public class Activator implements ModuleActivator {

	public static ModuleContext mc;

	public void start(ModuleContext mc) throws Exception {
		Activator.mc = mc;

		OntologyManagement om = OntologyManagement.getInstance();
		String uris[] = om.getOntoloyURIs();

		for (int i = 0; i < uris.length; i++) {
			System.out.println("-- Serializing ontology: " + i + ":\t" + uris[i]);
			OwlOWLCreator.doit(om.getOntology(uris[i]));
		}

		System.out.println("--DONE--");
	}

	public void stop(ModuleContext mc) throws Exception {
	}
}
