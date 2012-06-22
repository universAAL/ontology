package org.universAAL.ontology.profile;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.ProfileOntology;

public class OntologyEntry extends ManagedIndividual {

    public static final String MY_URI = ProfileOntology.NAMESPACE
	    + "OntologyEntry";
    public static final String PROP_NAMESPACE = ProfileOntology.NAMESPACE
	    + "hasNamespace";
    public static final String PROP_ONTOLOGY_URI = ProfileOntology.NAMESPACE
	    + "hasOntologyURI";
    public static final String PROP_VERSION = ProfileOntology.NAMESPACE
	    + "hasOntVersion";

    protected OntologyEntry() {
	super();
    }

    public OntologyEntry(String uri) {
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