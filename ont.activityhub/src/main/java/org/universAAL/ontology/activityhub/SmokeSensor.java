/**
 * 
 */
package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;
import org.universAAL.ontology.activityhub.util.ActivityHubSensorType;

/**
 * Ontological representation of a smoke sensor according to ISO 11073 - 
 * Part 10471 (Independent living activity hub).
 * Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * Specific sensor events (from standard specification):
 * - condition detected
 * - no condition detected (optional)
 * 
 * TODO: Implement generic sensor properties flags for activity hub sensors
 * 
 * NOTE: In the standard specification this sensor is a specialization of 
 * "environmental sensor", besides co-, water- and gas sensor.
 * 
 * @author Thomas Fuxreiter
 */
public class SmokeSensor extends ActivityHubSensor {

	public static final String MY_URI = ActivityHubOntology.NAMESPACE
    + "SmokeSensor";

	public static final int MY_SENSOR_TYPE = ActivityHubSensorType.SmokeSensor; 

	/**
	 * 
	 */
	public SmokeSensor() {
		//super();
	}

	/**
	 * @param uri
	 */
	public SmokeSensor(String uri) {
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
	public void setMeasuredValue(EnvironmentalSensorEvent ese) {
		props.put(PROP_MEASURED_VALUE, ese);
	}
	
    public EnvironmentalSensorEvent getMeasuredvalue() {
    	return ((EnvironmentalSensorEvent) props.get(PROP_MEASURED_VALUE));
    }
		
	/** 
	 * @see org.universAAL.ontology.phThing.Sensor#getClassURI()
	 * @return Ontology namespace for this class
	 */
	public String getClassURI() {
		return MY_URI;
	}
	
	public int getPropSerializationType(String propURI) {
		return PROP_MEASURED_VALUE.equals(propURI) ? PROP_SERIALIZATION_FULL : 
			super.getPropSerializationType(propURI);	
	}

	public boolean isWellFormed() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.universAAL.ontology.activityhub.ActivityHubSensor#getSensorType()
	 */
	public int getSensorType() {
		return MY_SENSOR_TYPE;
	}
}
