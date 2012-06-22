package org.universAAL.ontology.profile;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.ProfileOntology;

public class Requirement extends ManagedIndividual {

    public static final String MY_URI = ProfileOntology.NAMESPACE
	    + "Requirement";

    public static final String PROP_ALL_VALUES_MATCH = ProfileOntology.NAMESPACE
	    + "allValuesMatch";
    public static final String PROP_FRAGMENT = ProfileOntology.NAMESPACE
	    + "isFragment";
    public static final String PROP_INCOMPATIBLE = ProfileOntology.NAMESPACE
	    + "isIncompatible";
    public static final String PROP_MULTIPLE_SOLUTIONS_USEFUL = ProfileOntology.NAMESPACE
	    + "multipleSolutionsUseful";
    public static final String PROP_REQ_NAME = ProfileOntology.NAMESPACE
	    + "hasReqName";
    public static final String PROP_OPTIONAL = ProfileOntology.NAMESPACE
	    + "isOptional";
    public static final String PROP_REQ_VALUES = ProfileOntology.NAMESPACE
	    + "hasReqValues";

    protected Requirement() {
	super();
    }

    public Requirement(String uri) {
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
