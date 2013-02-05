package org.universAAL.ontology.device;

public class LightSensor extends Actuator {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "LightSensor";
  public static final String PROP_HAS_VALUE = DeviceOntology.NAMESPACE
    + "hasValue";


  public LightSensor () {
    super();
  }
  
  public LightSensor (String uri) {
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

  public int getHasValue() {
	Integer i = (Integer) getProperty(PROP_HAS_VALUE);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setHasValue(int newPropValue) {
      changeProperty(PROP_HAS_VALUE, new Integer(newPropValue));
  }		
}
