package org.universAAL.ontology.x73;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.X73Ontology;


public class WeighingScale extends MDS {
  public static final String MY_URI = X73Ontology.NAMESPACE
    + "WeighingScale";
  public static final String PROP_HAS_MEASURED_WEIGHT = X73Ontology.NAMESPACE
    + "hasMeasuredWeight";


  public WeighingScale () {
    super();
  }
  
  public WeighingScale (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  
  public int getPropSerializationType(String propURI) {
	return PROP_HAS_MEASURED_WEIGHT.equals(propURI) ? PROP_SERIALIZATION_FULL : 
		super.getPropSerializationType(propURI);
  }

  public boolean isWellFormed() {
	return true 
      && hasProperty(PROP_HAS_MEASURED_WEIGHT);
  }

  public BodyWeight getHasMeasuredWeight() {
    return (BodyWeight)getProperty(PROP_HAS_MEASURED_WEIGHT);
  }		

  public void setHasMeasuredWeight(BodyWeight newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_HAS_MEASURED_WEIGHT, newPropValue);
  }		
}
