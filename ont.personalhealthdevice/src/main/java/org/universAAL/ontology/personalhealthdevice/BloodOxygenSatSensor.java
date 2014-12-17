package org.universAAL.ontology.personalhealthdevice;

import org.universAAL.ontology.device.Sensor;
import org.universAAL.ontology.healthmeasurement.owl.BloodOxygenSaturation;

public class BloodOxygenSatSensor extends Sensor{
    public static final String MY_URI = PersonalHealthDeviceOntology.NAMESPACE
	    + "BloodOxygenSatSensor";

    public BloodOxygenSatSensor() {
	super();
    }

    public BloodOxygenSatSensor(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }
    
    public void setValue(BloodOxygenSaturation sat){
	setProperty(PROP_HAS_VALUE, sat);
    }
    
    public BloodOxygenSaturation getValue(){
	return (BloodOxygenSaturation) getProperty(PROP_HAS_VALUE);
    }
    
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }
}
