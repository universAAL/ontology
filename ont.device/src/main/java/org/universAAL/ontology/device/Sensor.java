package org.universAAL.ontology.device;

public abstract class Sensor extends ValueDevice {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "Sensor";


  public Sensor () {
    super();
  }
  
  public Sensor (String uri) {
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
