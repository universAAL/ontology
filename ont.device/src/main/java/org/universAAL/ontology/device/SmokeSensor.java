package org.universAAL.ontology.device;

public class SmokeSensor extends EnvironmentSensor {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "SmokeSensor";


  public SmokeSensor () {
    super();
  }
  
  public SmokeSensor (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	return true ;
  }
}
