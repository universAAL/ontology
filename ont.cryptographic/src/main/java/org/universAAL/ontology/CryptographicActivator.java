
package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.cryptographic.*;


public class CryptographicActivator implements ModuleActivator {

  CryptographicOntology _cryptographicOntology = new CryptographicOntology();


  public void start(ModuleContext mc) throws Exception {
    OntologyManagement.getInstance().register(mc, _cryptographicOntology);
  }

  public void stop(ModuleContext mc) throws Exception {
    OntologyManagement.getInstance().unregister(mc, _cryptographicOntology);
  }
}	
