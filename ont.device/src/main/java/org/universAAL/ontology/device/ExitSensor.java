package org.universAAL.ontology.device;

public class ExitSensor extends Sensor {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "ExitSensor";
  public static final String PROP_HAS_VALUE = DeviceOntology.NAMESPACE
	    + "hasValue";


  public ExitSensor () {
    super();
  }
  
  public ExitSensor (String uri) {
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

  public ExitValue getExitValue() {
    return (ExitValue)getProperty(PROP_HAS_VALUE);
  }		

  public void setExitValue(ExitValue newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_HAS_VALUE, newPropValue);
  }		
}
