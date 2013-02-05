
package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.device.DeviceOntology;

public class DeviceActivator implements ModuleActivator {

    private DeviceOntology ontD = new DeviceOntology();

    public void start(ModuleContext context) throws Exception {
	OntologyManagement.getInstance().register(ontD);
    }

    public void stop(ModuleContext context) throws Exception {
	OntologyManagement.getInstance().unregister(ontD);
    }
}	
