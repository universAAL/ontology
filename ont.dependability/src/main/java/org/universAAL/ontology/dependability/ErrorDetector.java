package org.universAAL.ontology.dependability;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;


public class ErrorDetector extends ManagedIndividual {
  public static final String MY_URI = DependabilityOntology.NAMESPACE
    + "ErrorDetector";
  public static final String PROP_FAULT = DependabilityOntology.NAMESPACE
    + "fault";
  public static final String PROP_SYMPTOM = DependabilityOntology.NAMESPACE
    + "symptom";


  public ErrorDetector () {
    super();
  }
  
  public ErrorDetector (String uri) {
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
      && hasProperty(PROP_FAULT)
      && hasProperty(PROP_SYMPTOM);
  }

  public Symptom getSymptom() {
    return (Symptom)getProperty(PROP_SYMPTOM);
  }		

  public void setSymptom(Symptom newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_SYMPTOM, newPropValue);
  }		

  public Fault getFault() {
    return (Fault)getProperty(PROP_FAULT);
  }		

  public void setFault(Fault newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_FAULT, newPropValue);
  }		
}
