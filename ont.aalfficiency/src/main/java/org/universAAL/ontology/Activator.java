package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.uAALModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;

public class Activator implements uAALModuleActivator{
	static ModuleContext context = null;
	AalfficiencyOntology aalfficiency = new AalfficiencyOntology();
	
	public void start(ModuleContext arg0) throws Exception {
		Activator.context = arg0;
		OntologyManagement.getInstance().register(aalfficiency);
		
	}

	public void stop(ModuleContext arg0) throws Exception {
		OntologyManagement.getInstance().unregister(aalfficiency);
	}

}
