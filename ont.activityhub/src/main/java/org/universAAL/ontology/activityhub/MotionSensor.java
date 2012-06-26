/**
 * 
 */
package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;
import org.universAAL.ontology.activityhub.util.ActivityHubSensorType;

/**
 * Ontological representation of a motion sensor according to ISO 11073 - 
 * Part 10471 (Independent living activity hub), edition 2010-05-01
 * Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * Specific sensor events (from standard specification):
 * - motion detected
 * - motion detected delayed (optional)
 * - tamper detected (optional)
 * - no condition detected (optional)
 * 
 * TODO: Implement generic sensor properties flags for activity hub sensors
 * 
 * @author Thomas Fuxreiter
 */
public class MotionSensor extends ActivityHubSensor {

	public static final String MY_URI = ActivityHubOntology.NAMESPACE
    + "MotionSensor";

	public static final int MY_SENSOR_TYPE = ActivityHubSensorType.MotionSensor; 

	public MotionSensor() {
		//super();
	}

	public MotionSensor(String uri) {
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
	public void setMeasuredValue(MotionSensorEvent mse) {
		props.put(PROP_MEASURED_VALUE, mse);
	}
	
    public MotionSensorEvent getMeasuredvalue() {
    	return ((MotionSensorEvent) props.get(PROP_MEASURED_VALUE));
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
