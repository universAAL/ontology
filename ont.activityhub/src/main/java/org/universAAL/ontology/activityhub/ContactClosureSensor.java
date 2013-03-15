/**
 * 
 */
package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;
import org.universAAL.ontology.activityhub.util.ActivityHubSensorType;

/**
 * Ontological representation of a contact closure sensor according to ISO 11073
 * - Part 10471 (Independent living activity hub). Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * Specific sensor events (from standard specification): - contact opened -
 * contact closed - no condition detected (optional)
 * 
 * TODO: Implement generic sensor properties flags for activity hub sensors
 * 
 * @author Thomas Fuxreiter
 */
public class ContactClosureSensor extends ActivityHubSensor {

    public static final String MY_URI = ActivityHubOntology.NAMESPACE
	    + "ContactClosureSensor";

    public static final int MY_SENSOR_TYPE = ActivityHubSensorType.ContactClosureSensor;

    /**
	 * 
	 */
    public ContactClosureSensor() {
	// super();
    }

    /**
     * @param uri
     */
    public ContactClosureSensor(String uri) {
	super(uri);
    }

    /**
     * From Resource class: The properties denote the RDF triples of this
     * resource, realized as Hashtable. The RDF subject is this Resource itself,
     * the key of the Hashtable is the RDF predicate and the value of the
     * Hashtable is the RDF object, which can be a literal or another resource.
     * See {@link #setProperty(String propURI, Object value)} for more
     * information.
     */
    public void setMeasuredValue(ContactClosureSensorEvent event) {
	props.put(PROP_MEASURED_VALUE, event);
    }

    public ContactClosureSensorEvent getMeasuredvalue() {
	return ((ContactClosureSensorEvent) props.get(PROP_MEASURED_VALUE));
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_MEASURED_VALUE.equals(propURI) ? PROP_SERIALIZATION_FULL
		: super.getPropSerializationType(propURI);
    }

    public boolean isWellFormed() {
	return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.universAAL.ontology.activityhub.ActivityHubSensor#getSensorType()
     */
    public int getSensorType() {
	return MY_SENSOR_TYPE;
    }
}
