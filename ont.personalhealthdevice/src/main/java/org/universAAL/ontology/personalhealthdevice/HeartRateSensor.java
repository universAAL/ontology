package org.universAAL.ontology.personalhealthdevice;

import org.universAAL.ontology.device.Sensor;
import org.universAAL.ontology.healthmeasurement.owl.HeartRate;

public class HeartRateSensor extends Sensor {
    public static final String MY_URI = PersonalHealthDeviceOntology.NAMESPACE
	    + "HeartRateSensor";

    public HeartRateSensor() {
	super();
    }

    public HeartRateSensor(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public void setValue(HeartRate hr) {
	setProperty(PROP_HAS_VALUE, hr);
    }

    public HeartRate getValue() {
	return (HeartRate) getProperty(PROP_HAS_VALUE);
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }
}
