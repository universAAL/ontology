package org.universAAL.ontology.X73;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

public class BloodPressureDia extends MDSAttribute {
    public static final String MY_URI = X73Ontology.NAMESPACE
	    + "BloodPressureDia";

    public BloodPressureDia() {
	super();
    }

    public BloodPressureDia(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return super.getPropSerializationType(propURI);
    }

    public boolean isWellFormed() {
	return true;
    }
}
