package org.universAAL.ontology.x73;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.X73Ontology;


public class AbsoluteTimeStamp extends ManagedIndividual {
  public static final String MY_URI = X73Ontology.NAMESPACE
    + "AbsoluteTimeStamp";
  public static final String PROP_YEAR = X73Ontology.NAMESPACE
    + "year";
  public static final String PROP_CENTURY = X73Ontology.NAMESPACE
    + "century";


  public AbsoluteTimeStamp () {
    super();
  }
  
  public AbsoluteTimeStamp (String uri) {
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
      && hasProperty(PROP_YEAR)
      && hasProperty(PROP_CENTURY);
  }

  public int getCentury() {
	Integer i = (Integer) getProperty(PROP_CENTURY);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setCentury(int newPropValue) {
      changeProperty(PROP_CENTURY, new Integer(newPropValue));
  }		

  public int getYear() {
	Integer i = (Integer) getProperty(PROP_YEAR);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setYear(int newPropValue) {
      changeProperty(PROP_YEAR, new Integer(newPropValue));
  }		
}
