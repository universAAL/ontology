package org.universAAL.ontology.risk;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.uAALModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.RiskOntology;

public class Activator implements uAALModuleActivator {
    RiskOntology riskOntology = new RiskOntology();

    public void start(ModuleContext context) throws Exception {
	OntologyManagement om = OntologyManagement.getInstance();
	om.register(riskOntology);
    }

    public void stop(ModuleContext arg0) throws Exception {
	OntologyManagement om = OntologyManagement.getInstance();
	om.unregister(riskOntology);
    }

}
