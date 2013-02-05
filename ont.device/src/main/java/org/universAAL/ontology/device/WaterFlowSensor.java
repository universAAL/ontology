package org.universAAL.ontology.device;

public class WaterFlowSensor extends Sensor {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "WaterFlowSensor";
  public static final String PROP_HAS_VALUE = DeviceOntology.NAMESPACE
	    + "hasValue";


  public WaterFlowSensor () {
    super();
  }
  
  public WaterFlowSensor (String uri) {
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
