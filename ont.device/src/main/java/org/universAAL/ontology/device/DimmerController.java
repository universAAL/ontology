package org.universAAL.ontology.device;

public class DimmerController extends Actuator {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "DimmerController";
  public static final String PROP_HAS_VALUE = DeviceOntology.NAMESPACE
    + "hasValue";


  public DimmerController () {
    super();
  }
  
  public DimmerController (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	return 0;
  }

  public boolean isWellFormed() {
	return true 
      && hasProperty(PROP_HAS_VALUE);
  }

  public int getHasValue() {
	Integer i = (Integer) getProperty(PROP_HAS_VALUE);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setHasValue(int newPropValue) {
      changeProperty(PROP_HAS_VALUE, new Integer(newPropValue));
  }		
}
