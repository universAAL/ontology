package org.universAAL.ontology.personalhealthdevice;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.measurement.Measurement;

/**
 * Ontological representation of a blood pressure measurement (systolic,
 * diastolic pressure and heart rate).
 * 
 * @author Thomas Fuxreiter (foex@gmx.at)
 */
public class BloodPressureMeasurement extends ManagedIndividual {

    public static final String MY_URI = PersonalHealthDeviceOntology.NAMESPACE
	    + "BloodPressureMeasurement";

    /** systolic blood pressure */
    public static final String PROP_HAS_MEASURED_BPSYS = PersonalHealthDeviceOntology.NAMESPACE
	    + "hasMeasuredBPSys";

    /** diastolic blood pressure */
    public static final String PROP_HAS_MEASURED_BPDIA = PersonalHealthDeviceOntology.NAMESPACE
	    + "hasMeasuredBPDia";

    /** heart rate */
    public static final String PROP_HAS_MEASURED_HEARTRATE = PersonalHealthDeviceOntology.NAMESPACE
	    + "hasMeasuredHeartRate";

    public BloodPressureMeasurement() {
	super();
    }

    public BloodPressureMeasurement(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public void setMeasuredBPSys(Measurement m) {
	props.put(PROP_HAS_MEASURED_BPSYS, m);
    }

    public Measurement getMeasuredBPSys() {
	return ((Measurement) props.get(PROP_HAS_MEASURED_BPSYS));
    }

    public void setMeasuredBPDia(Measurement m) {
	props.put(PROP_HAS_MEASURED_BPDIA, m);
    }

    public Measurement getMeasuredBPDia() {
	return ((Measurement) props.get(PROP_HAS_MEASURED_BPDIA));
    }

    public void setMeasuredHeartRate(Measurement m) {
	props.put(PROP_HAS_MEASURED_HEARTRATE, m);
    }

    public Measurement getMeasuredHeartRate() {
	return ((Measurement) props.get(PROP_HAS_MEASURED_HEARTRATE));
    }
}
