/**
 * 
 */
package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;
import org.universAAL.ontology.phThing.Sensor;

/**
 * Ontological representation of a usage sensor according to
 * ISO 11073 - Part 10471 (Indepentend living activity hub).
 * Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * Specific sensor events (from standard specification):
 * - usage started		// bed/chair in
 * - usage ended		// bed/chair out
 * - expected use start violation (optional)	// expected usage not started
 * - expected use stop violation (optional)		// usage continued beyond expected usage end
 * - absence violation (optional)				// absent for too long a period during expected usage
 * - no condition detected (optional)
 * 
 * TODO: Implement generic sensor properties flags for activity hub sensors
 * 
 * @author Thomas Fuxreiter
 */
public class UsageSensor extends Sensor {

	public static final String MY_URI = ActivityHubOntology.NAMESPACE
    + "UsageSensor";

	/**
	 * 
	 */
	public UsageSensor() {
		//super();
	}

	/**
	 * @param uri
	 */
	public UsageSensor(String uri) {
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
	public void setMeasuredValue(UsageSensorEvent event) {
		props.put(PROP_MEASURED_VALUE, event);
	}
	
    public UsageSensorEvent getMeasuredvalue() {
    	return ((UsageSensorEvent) props.get(PROP_MEASURED_VALUE));
    }
			
	/** 
	 * @see org.universAAL.ontology.phThing.Sensor#getClassURI()
	 * @return Ontology namespace for this class
	 */
	public String getClassURI() {
		return MY_URI;
	}

}
