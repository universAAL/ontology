package org.universAAL.ontology.device;

public class DosageSensor extends Sensor {
  public static final String MY_URI = DeviceOntology.NAMESPACE
    + "DosageSensor";
  public static final String PROP_HAS_VALUE = DeviceOntology.NAMESPACE
	    + "hasValue";


  public DosageSensor () {
    super();
  }
  
  public DosageSensor (String uri) {
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

  public DosageValue getDosageValue() {
    return (DosageValue)getProperty(PROP_HAS_VALUE);
  }		

  public void setDosageValue(DosageValue newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_HAS_VALUE, newPropValue);
  }		
}
