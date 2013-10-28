package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.aalfficiency.AalfficiencyOntology;

public class AalfficiencyActivator implements ModuleActivator {
    private AalfficiencyOntology aalfficiency = new AalfficiencyOntology();

    public void start(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().register(mc, aalfficiency);
    }

    public void stop(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().unregister(mc, aalfficiency);
    }
}