
package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.container.utils.LogUtils;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.X73.X73Ontology;


public class X73Activator implements ModuleActivator {

  X73Ontology x73ontology = new X73Ontology();
  
public void start(ModuleContext context) throws Exception {

//    LogUtils.logError(context, X73Activator.class, "start", 
//			 new Object[] {"***FUXI***: Ontologies before X73.ont registering"}, null);
//    String[] ontsa = OntologyManagement.getInstance().getOntoloyURIs();
//		for (int i = 0; i < ontsa.length; i++)
//			System.out.println("***Onts before***:" + ontsa[i]);
//    LogUtils.logError(context, X73Activator.class, "start", 
//    		ontsa
//	    	, null);

    
    OntologyManagement.getInstance().register(x73ontology);

    
//    LogUtils.logError(context, X73Activator.class, "start", 
//    		new Object[] {"***FUXI***: Ontologies after X73.ont registering"}
//	    	, null);
//    String[] ontsb = OntologyManagement.getInstance().getOntoloyURIs();
//    LogUtils.logError(context, X73Activator.class, "start", 
//    		ontsb
//	    	, null);
 }

  public void stop(ModuleContext context) throws Exception {
//	    LogUtils.logError(context, X73Activator.class, "start", 
//	    		new Object[] {"***FUXI***: X73.ont stopping..."}
//		    	, null);
	    OntologyManagement.getInstance().unregister(x73ontology);
  }
}