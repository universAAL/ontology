package org.universAAL.ontology.dependability;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.ontology.phThing.Device;

public class Sensor extends Device {
    public static final String MY_URI = DependabilityOntology.NAMESPACE
	    + "Sensor";
    public static final String PROP_SYMPTOM = DependabilityOntology.NAMESPACE
	    + "symptom";

    public Sensor() {
	super();
    }

    public Sensor(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	// TODO Implement or if for Device subclasses: remove
	return 0;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_SYMPTOM);
    }

    public Symptom getSymptom() {
	return (Symptom) getProperty(PROP_SYMPTOM);
    }

    public void setSymptom(Symptom newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SYMPTOM, newPropValue);
    }
}
