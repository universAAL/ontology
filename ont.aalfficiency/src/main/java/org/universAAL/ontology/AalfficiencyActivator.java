package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.uAALModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.aalfficiency.AalfficiencyOntology;

public class AalfficiencyActivator implements uAALModuleActivator{
    private AalfficiencyOntology aalfficiency = new AalfficiencyOntology();
	
	public void start(ModuleContext arg0) throws Exception {
		OntologyManagement.getInstance().register(aalfficiency);
	}

	public void stop(ModuleContext arg0) throws Exception {
		OntologyManagement.getInstance().unregister(aalfficiency);
	}
}
