/**
 * 
 */
package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;
import org.universAAL.ontology.phThing.Sensor;

/**
 * Ontological representation of an activity hub sensor concept,
 * to be extended by different sensor types.
 * 
 * @author Thomas Fuxreiter
 *
 */
public abstract class ActivityHubSensor extends Sensor {

	/* MUST be defined! otherwise the URI of the parent class is returned */
	public String getClassURI() {
		return MY_URI;
	}	

	/* following 2 methods SHOULD be overwritten */

	/* defines which part of this concept is serialized 
	 * e.g. only parts of this concept should be passed */
	public int getPropSerializationType(String propURI) {
		/* set OPTIONAL if the properties can be ignored or the class has no property
		 * set FULL if there are properties 
		 * here set to FULL for all deriving classes */
		return PROP_SERIALIZATION_FULL;
	}

	/* for testing return true */
	/* variables could be checked here */
	public boolean isWellFormed() {
		return true;
	}

	
	public static final String MY_URI = ActivityHubOntology.NAMESPACE
    + "ActivityHubSensor";

	public ActivityHubSensor() {
		super();
	}

	public ActivityHubSensor(String uri) {
		super(uri);
	}
	
}
