package org.universAAL.ontology.dependability;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;


public class InternalCauseFault extends Fault {
  public static final String MY_URI = DependabilityOntology.NAMESPACE
    + "InternalCauseFault";


  public InternalCauseFault () {
    super();
  }
  
  public InternalCauseFault (String uri) {
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
