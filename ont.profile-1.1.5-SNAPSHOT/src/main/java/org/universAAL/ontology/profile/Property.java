package org.universAAL.ontology.profile;

import org.universAAL.middleware.owl.ManagedIndividual;

public class Property extends ManagedIndividual {
    public static final String MY_URI = ProfileOntology.NAMESPACE
	    + "HWProperty";

    public static final String PROP_PROPERTY_NAME = ProfileOntology.NAMESPACE
	    + "hasPropertyName";
    public static final String PROP_PROPERTY_VALUE = ProfileOntology.NAMESPACE
	    + "hasPropertyValue";

    protected Property() {
	super();
    }

    public Property(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public boolean isWellFormed() {
	return true;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

}
