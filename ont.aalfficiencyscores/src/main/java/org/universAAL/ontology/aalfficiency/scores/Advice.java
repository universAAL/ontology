package org.universAAL.ontology.aalfficiency.scores;

import org.universAAL.middleware.owl.ManagedIndividual;


public class Advice extends ManagedIndividual {
  public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE
    + "Advice";
  public static final String PROP_TYPE = AalfficiencyScoresOntology.NAMESPACE
    + "type";
  public static final String PROP_TEXT = AalfficiencyScoresOntology.NAMESPACE
    + "text";


  public Advice () {
    super();
  }
  
  public Advice (String uri) {
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
      && hasProperty(PROP_TYPE)
      && hasProperty(PROP_TEXT);
  }

  public String getAdviceType() {
    return (String)getProperty(PROP_TYPE);
  }		

  public void setAdviceType(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_TYPE, newPropValue);
  }		

  public String getText() {
    return (String)getProperty(PROP_TEXT);
  }		

  public void setText(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_TEXT, newPropValue);
  }		
}
