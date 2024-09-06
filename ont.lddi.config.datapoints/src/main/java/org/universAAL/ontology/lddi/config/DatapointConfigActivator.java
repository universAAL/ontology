package org.universAAL.ontology.lddi.config;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.lddi.config.datapoints.*;


public class DatapointConfigActivator implements ModuleActivator {

  LDDIDatapointsOntology _dataOntology = new LDDIDatapointsOntology();


  public void start(ModuleContext mc) throws Exception {
    OntologyManagement.getInstance().register(mc, _dataOntology);
  }

  public void stop(ModuleContext mc) throws Exception {
    OntologyManagement.getInstance().unregister(mc, _dataOntology);
  }
}
