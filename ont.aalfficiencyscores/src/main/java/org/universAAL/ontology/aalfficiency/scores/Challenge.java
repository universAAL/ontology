package org.universAAL.ontology.aalfficiency.scores;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;


public class Challenge extends ManagedIndividual {
  public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE
    + "Challenge";
  public static final String PROP_GOAL = AalfficiencyScoresOntology.NAMESPACE
    + "Goal";
  public static final String PROP_DESCRIPTION = AalfficiencyScoresOntology.NAMESPACE
    + "Description";


  public Challenge () {
    super();
  }
  
  public Challenge (String uri) {
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
      && hasProperty(PROP_GOAL)
      && hasProperty(PROP_DESCRIPTION);
  }

  public String getDescription() {
    return (String)getProperty(PROP_DESCRIPTION);
  }		

  public void setDescription(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_DESCRIPTION, newPropValue);
  }		

  public String getGoal() {
    return (String)getProperty(PROP_GOAL);
  }		

  public void setGoal(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_GOAL, newPropValue);
  }		
}
