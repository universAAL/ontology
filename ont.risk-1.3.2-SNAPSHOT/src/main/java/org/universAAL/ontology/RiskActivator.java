package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.risk.RiskOntology;

public class RiskActivator implements ModuleActivator {
    private RiskOntology riskOntology = new RiskOntology();

    public void start(ModuleContext mc) throws Exception {
	OntologyManagement om = OntologyManagement.getInstance();
	om.register(mc, riskOntology);
    }

    public void stop(ModuleContext mc) throws Exception {
	OntologyManagement om = OntologyManagement.getInstance();
	om.unregister(mc, riskOntology);
    }

}
