package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.sysinfo.*;

public class SysinfoActivator implements ModuleActivator {

    SysinfoOntology _sysinfoOntology = new SysinfoOntology();

    public void start(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().register(mc, _sysinfoOntology);
    }

    public void stop(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().unregister(mc, _sysinfoOntology);
    }
}
