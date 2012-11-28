package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.risk.RiskOntology;

public class RiskActivator implements ModuleActivator {
    private RiskOntology riskOntology = new RiskOntology();

    public void start(ModuleContext context) throws Exception {
	OntologyManagement om = OntologyManagement.getInstance();
	om.register(riskOntology);
    }

    public void stop(ModuleContext arg0) throws Exception {
	OntologyManagement om = OntologyManagement.getInstance();
	om.unregister(riskOntology);
    }

}
