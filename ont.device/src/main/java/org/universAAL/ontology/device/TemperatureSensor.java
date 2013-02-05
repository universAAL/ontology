package org.universAAL.ontology.device;

public class TemperatureSensor extends Sensor {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "TemperatureSensor";
  public static final String PROP_HAS_VALUE = DeviceOntology.NAMESPACE
    + "hasValue";


  public TemperatureSensor () {
    super();
  }
  
  public TemperatureSensor (String uri) {
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

  public float getHasValue() {
	Float f = (Float) getProperty(PROP_HAS_VALUE);
	return (f == null) ? 0 : f.floatValue();
  }		

  public void setHasValue(float newPropValue) {
      changeProperty(PROP_HAS_VALUE, new Float(newPropValue));
  }		
}
