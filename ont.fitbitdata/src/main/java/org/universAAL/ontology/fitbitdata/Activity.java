package org.universAAL.ontology.fitbitdata;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;


public class Activity extends ManagedIndividual {
  public static final String MY_URI = FitbitdataOntology.NAMESPACE
    + "Activity";
  public static final String PROP_STEPS = FitbitdataOntology.NAMESPACE
    + "steps";
  public static final String PROP_CALORIES = FitbitdataOntology.NAMESPACE
    + "calories";


  public Activity () {
    super();
  }
  
  public Activity (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	return true 
      && hasProperty(PROP_STEPS)
      && hasProperty(PROP_CALORIES);
  }

  public String getCalories() {
    return (String)getProperty(PROP_CALORIES);
  }		

  public void setCalories(String newPropValue) {
	  props.put(PROP_CALORIES, newPropValue);
  }		

  public String getSteps() {
    return (String)getProperty(PROP_STEPS);
  }		

  public void setSteps(String newPropValue) {
	  props.put(PROP_STEPS, newPropValue);
  }		
}
