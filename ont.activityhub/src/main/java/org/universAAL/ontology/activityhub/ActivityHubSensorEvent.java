package org.universAAL.ontology.activityhub;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.ActivityHubOntology;

/**
 * Intermediate concept. Base class for all SensorEvent classes.
 * 
 * @author Thomas Fuxreiter (foex@gmx.at)
 */
public abstract class ActivityHubSensorEvent extends ManagedIndividual {

    public static final String MY_URI = ActivityHubOntology.NAMESPACE
	    + "ActivityHubSensorEvent";

    public ActivityHubSensorEvent() {
	super();
    }

    public ActivityHubSensorEvent(String uri) {
	super(uri);
    }

    /* MUST be defined! otherwise the URI of the parent class is returned */
    public String getClassURI() {
	return MY_URI;
    }

    /* following 2 methods SHOULD be overwritten */

    /*
     * defines which part of this concept is serialized e.g. only parts of this
     * concept should be passed
     */
    public int getPropSerializationType(String propURI) {
	/*
	 * set OPTIONAL if the properties can be ignored or the class has no
	 * property set FULL if there are properties here set to FULL for all
	 * deriving classes
	 */
	return PROP_SERIALIZATION_FULL;
    }

    /* for testing return true */
    /* variables could be checked here */
    public boolean isWellFormed() {
	return true;
    }

    // public abstract ActivityHubSensorEvent getEventByOrder(int order);

}
