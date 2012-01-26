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
public class ActivityHubSensor extends Sensor {

	public static final String MY_URI = ActivityHubOntology.NAMESPACE
    + "ActivityHubSensor";

	public ActivityHubSensor() {
		super();
	}

	public ActivityHubSensor(String uri) {
		super(uri);
	}
	
	/** 
	 * @see org.universAAL.ontology.phThing.Sensor#getClassURI()
	 * @return Ontology namespace for this class
	 */
	public String getClassURI() {
		return MY_URI;
	}	
	
}
