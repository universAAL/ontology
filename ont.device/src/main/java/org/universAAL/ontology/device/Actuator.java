package org.universAAL.ontology.device;

public abstract class Actuator extends ValueDevice {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "Actuator";


  public Actuator () {
    super();
  }
  
  public Actuator (String uri) {
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
