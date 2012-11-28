package org.universAAL.ontology.dependability;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;


public class Fault extends ManagedIndividual {
  public static final String MY_URI = DependabilityOntology.NAMESPACE
    + "Fault";
  public static final String PROP_LOCATION = DependabilityOntology.NAMESPACE
    + "location";
  public static final String PROP_FAULT_DECISION = DependabilityOntology.NAMESPACE
    + "faultDecision";
  public static final String PROP_TIMESTAMP = DependabilityOntology.NAMESPACE
    + "timestamp";


  public Fault () {
    super();
  }
  
  public Fault (String uri) {
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
      && hasProperty(PROP_FAULT_DECISION)
      && hasProperty(PROP_TIMESTAMP);
  }

  public long getTimestamp() {
	Long l = (Long) getProperty(PROP_TIMESTAMP);
	return (l == null) ? 0 : l.longValue();
  }		

  public void setTimestamp(long newPropValue) {
      changeProperty(PROP_TIMESTAMP, new Long(newPropValue));
  }		

  public boolean isFaultDecision() {
	Boolean b = (Boolean) getProperty(PROP_FAULT_DECISION);
	return (b == null) ? false : b.booleanValue();
  }		

  public void setFaultDecision(boolean newPropValue) {
      changeProperty(PROP_FAULT_DECISION, new Boolean(newPropValue));
  }		

  public String getLocation() {
    return (String)getProperty(PROP_LOCATION);
  }		

  public void setLocation(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_LOCATION, newPropValue);
  }		
}
