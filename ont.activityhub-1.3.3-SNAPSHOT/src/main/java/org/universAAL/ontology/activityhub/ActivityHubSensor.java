/**
 * 
 */
package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;
import org.universAAL.ontology.phThing.Sensor;

/**
 * Ontological representation of an activity hub sensor concept, to be extended
 * by different sensor types.
 * 
 * @author Thomas Fuxreiter
 * 
 */
public abstract class ActivityHubSensor extends Sensor {

    public static final String MY_URI = ActivityHubOntology.NAMESPACE
	    + "ActivityHubSensor";

    public static final String PROP_LASTEVENT = ActivityHubOntology.NAMESPACE
	    + "lastEvent";

    // doesn't work here!
    // private int MY_SENSOR_TYPE; //ActivityHubSensorType.ActivityHubSensor;
    /**
     * must be implemented in the child classes { return MY_SENSOR_TYPE; }
     */
    public abstract int getSensorType();

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

    /**
     * From Resource class: The properties denote the RDF triples of this
     * resource, realized as Hashtable. The RDF subject is this Resource itself,
     * the key of the Hashtable is the RDF predicate and the value of the
     * Hashtable is the RDF object, which can be a literal or another resource.
     * See {@link #setProperty(String propURI, Object value)} for more
     * information.
     */
    public void setMeasuredValue(ActivityHubSensorEvent event) {
	props.put(PROP_MEASURED_VALUE, event);
    }

    /* for testing return true */
    /* variables could be checked here */
    public boolean isWellFormed() {
	return true;
    }

    public ActivityHubSensor() {
	super();
    }

    public ActivityHubSensor(String uri) {
	super(uri);
    }

}
