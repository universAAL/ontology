package org.universAAL.ontology.personalhealthdevice;

import org.universAAL.ontology.device.Sensor;
import org.universAAL.ontology.healthmeasurement.owl.BloodPressure;

public class BloodPressureSensor  extends Sensor{
    public static final String MY_URI = PersonalHealthDeviceOntology.NAMESPACE
	    + "BloodPressureSensor";

    public BloodPressureSensor() {
	super();
    }

    public BloodPressureSensor(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }
    
    public void setValue(BloodPressure bp){
	setProperty(PROP_HAS_VALUE, bp);
    }
    
    public BloodPressure getValue(){
	return (BloodPressure) getProperty(PROP_HAS_VALUE);
    }
    
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }
}
