package org.universAAL.ontology.dependability;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;


public class ValueFault extends Fault {
  public static final String MY_URI = DependabilityOntology.NAMESPACE
    + "ValueFault";
  public static final String PROP_VALUE = DependabilityOntology.NAMESPACE
    + "value";


  public ValueFault () {
    super();
  }
  
  public ValueFault (String uri) {
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
	return true 
      && hasProperty(PROP_VALUE);
  }

  public Double getValue() {
    return (Double)getProperty(PROP_VALUE);
  }		

  public void setValue(Double newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_VALUE, newPropValue);
  }		
}
