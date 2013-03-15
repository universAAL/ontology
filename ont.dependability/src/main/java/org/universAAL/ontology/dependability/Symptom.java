package org.universAAL.ontology.dependability;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

public class Symptom extends ManagedIndividual {
    public static final String MY_URI = DependabilityOntology.NAMESPACE
	    + "Symptom";
    public static final String PROP_ERROR_DETECTOR = DependabilityOntology.NAMESPACE
	    + "errorDetector";

    public Symptom() {
	super();
    }

    public Symptom(String uri) {
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
	return true && hasProperty(PROP_ERROR_DETECTOR);
    }

    public ErrorDetector getErrorDetector() {
	return (ErrorDetector) getProperty(PROP_ERROR_DETECTOR);
    }

    public void setErrorDetector(ErrorDetector newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_ERROR_DETECTOR, newPropValue);
    }
}
