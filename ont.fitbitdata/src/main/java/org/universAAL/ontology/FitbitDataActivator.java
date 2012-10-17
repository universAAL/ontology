package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.uAALModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.fitbitdata.FitbitdataOntology;

public class FitbitDataActivator implements uAALModuleActivator{
    private FitbitdataOntology fitbit = new FitbitdataOntology();
	
	public void start(ModuleContext arg0) throws Exception {
		OntologyManagement.getInstance().register(fitbit);
	}

	public void stop(ModuleContext arg0) throws Exception {
		OntologyManagement.getInstance().unregister(fitbit);
	}
}
