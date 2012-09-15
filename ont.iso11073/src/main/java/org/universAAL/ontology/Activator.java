
package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.owl.OntologyManagement;


public class Activator implements BundleActivator {

  static BundleContext context = null;
  
  X73Ontology _x73ontology = new X73Ontology();
  
  

  public void start(BundleContext context) throws Exception {
    Activator.context = context;
    
    OntologyManagement.getInstance().register(_x73ontology);
    
  }

  public void stop(BundleContext arg0) throws Exception {
    
    OntologyManagement.getInstance().unregister(_x73ontology);
    
  }
}	
