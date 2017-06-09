package org.universAAL.ontology.healthmeasurement.owl;

public class BloodOxygenSaturation extends HealthMeasurement {
	public static final String MY_URI = HealthMeasurementOntology.NAMESPACE + "BloodOxygenSaturation";

	public BloodOxygenSaturation() {
		super();
	}

	public BloodOxygenSaturation(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true;
	}
}
