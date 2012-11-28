package org.universAAL.ontology.dependability;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;


public class TimingFault extends Fault {
  public static final String MY_URI = DependabilityOntology.NAMESPACE
    + "TimingFault";
  public static final String PROP_TIME_THRESHOLD = DependabilityOntology.NAMESPACE
    + "timeThreshold";


  public TimingFault () {
    super();
  }
  
  public TimingFault (String uri) {
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
      && hasProperty(PROP_TIME_THRESHOLD);
  }

  public Double getTimeThreshold() {
    return (Double)getProperty(PROP_TIME_THRESHOLD);
  }		

  public void setTimeThreshold(Double newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_TIME_THRESHOLD, newPropValue);
  }		
}
