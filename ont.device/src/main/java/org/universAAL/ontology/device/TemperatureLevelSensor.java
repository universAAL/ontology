package org.universAAL.ontology.device;

public class TemperatureLevelSensor extends Sensor {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "TemperatureLevelSensor";
  public static final String PROP_HAS_VALUE = DeviceOntology.NAMESPACE
    + "hasValue";


  public TemperatureLevelSensor () {
    super();
  }
  
  public TemperatureLevelSensor (String uri) {
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

  public TemperatureLevelValue Value() {
    return (TemperatureLevelValue)getProperty(PROP_HAS_VALUE);
  }		

  public void Value(TemperatureLevelValue newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_HAS_VALUE, newPropValue);
  }		
}
