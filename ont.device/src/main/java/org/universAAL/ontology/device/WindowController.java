package org.universAAL.ontology.device;

public class WindowController extends Actuator {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "WindowController";
  public static final String PROP_HAS_VALUE = DeviceOntology.NAMESPACE
	    + "hasValue";


  public WindowController () {
    super();
  }
  
  public WindowController (String uri) {
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
      && hasProperty(PROP_HAS_VALUE);
  }

  public StatusValue getValue() {
    return (StatusValue)getProperty(PROP_HAS_VALUE);
  }		

  public void setValue(StatusValue newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_HAS_VALUE, newPropValue);
  }		
}
