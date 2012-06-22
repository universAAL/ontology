package org.universAAL.ontology.profile;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.ProfileOntology;

public class ConnectionDetails extends ManagedIndividual {

    public static final String MY_URI = ProfileOntology.NAMESPACE
	    + "ConnectionDetails";

    public static final String PROP_HOST = ProfileOntology.NAMESPACE
	    + "hasHost";
    public static final String PROP_PORT = ProfileOntology.NAMESPACE
	    + "hasPort";
    public static final String PROP_URL = ProfileOntology.NAMESPACE + "hasURL";

    protected ConnectionDetails() {
	super();
    }

    public ConnectionDetails(String uri) {
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
