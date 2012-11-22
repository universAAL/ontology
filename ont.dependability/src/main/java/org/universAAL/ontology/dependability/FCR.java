package org.universAAL.ontology.dependability;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;


public class FCR extends ManagedIndividual {
  public static final String MY_URI = DependabilityOntology.NAMESPACE
    + "FCR";
  public static final String PROP_LOCATION = DependabilityOntology.NAMESPACE
    + "location";
  public static final String PROP_FAULT = DependabilityOntology.NAMESPACE
    + "fault";


  public FCR () {
    super();
  }
  
  public FCR (String uri) {
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
      && hasProperty(PROP_LOCATION)
      && hasProperty(PROP_FAULT);
  }

  public Fault getFault() {
    return (Fault)getProperty(PROP_FAULT);
  }		

  public void setFault(Fault newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_FAULT, newPropValue);
  }		

  public String getLocation() {
    return (String)getProperty(PROP_LOCATION);
  }		

  public void setLocation(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_LOCATION, newPropValue);
  }		
}
