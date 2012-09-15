package org.universAAL.ontology.x73;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.X73Ontology;


public class MDSAttribute extends ManagedIndividual {
  public static final String MY_URI = X73Ontology.NAMESPACE
    + "MDSAttribute";


  public MDSAttribute () {
    super();
  }
  
  public MDSAttribute (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	// TODO Implement or if for Device subclasses: remove 
	return 0;
  }

  public boolean isWellFormed() {
	return true ;
  }
}
