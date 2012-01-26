/**
 * 
 */
package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;

/**
 * Ontological representation of a fall sensor according to ISO 11073 - 
 * Part 10471 (Indepentend living activity hub).
 * Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * Specific sensor events (from standard specification):
 * - fall detected
 * - no condition detected (optional)
 * 
 * TODO: Implement generic sensor properties flags for activity hub sensors
 * 
 * @author Thomas Fuxreiter
 */
public class FallSensor extends ActivityHubSensor {

	public static final String MY_URI = ActivityHubOntology.NAMESPACE
    + "FallSensor";

	/**
	 * 
	 */
	public FallSensor() {
		//super();
	}

	/**
	 * @param uri
	 */
	public FallSensor(String uri) {
		super(uri);
	}

    /**
     * From Resource class:
     * The properties denote the RDF triples of this resource, realized as
     * Hashtable. The RDF subject is this Resource itself, the key of the
     * Hashtable is the RDF predicate and the value of the Hashtable is the RDF
     * object, which can be a literal or another resource. See
     * {@link #setProperty(String propURI, Object value)} for more information.
     */	
	public void setMeasuredValue(FallSensorEvent event) {
		props.put(PROP_MEASURED_VALUE, event);
	}
	
    public FallSensorEvent getMeasuredvalue() {
    	return ((FallSensorEvent) props.get(PROP_MEASURED_VALUE));
    }
	
	/** 
	 * @see org.universAAL.ontology.phThing.Sensor#getClassURI()
	 * @return Ontology namespace for this class
	 */
	public String getClassURI() {
		return MY_URI;
	}

}
