package org.universAAL.ontology.personalhealthdevice;

import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a blood pressure monitor.
 * 
 * @author Thomas Fuxreiter (foex@gmx.at)
 */
public class BloodPressureMonitor extends Device {

    public static final String MY_URI = PersonalHealthDeviceOntology.NAMESPACE
	    + "BloodPressureMonitor";

    public static final String PROP_HAS_MEASUREMENT = PersonalHealthDeviceOntology.NAMESPACE
	    + "hasMeasurement";

    public BloodPressureMonitor() {
	super();
    }

    public BloodPressureMonitor(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }
}
