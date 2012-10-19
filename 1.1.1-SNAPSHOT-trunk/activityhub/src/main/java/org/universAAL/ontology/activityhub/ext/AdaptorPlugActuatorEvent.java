package org.universAAL.ontology.activityhub.ext;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.ActivityHubOntology;

/**
 * Ontological enumeration of adaptor plug actuator events.
 * This device is currently not covered by the ISO 11073 standard
 * in part 10471 (Indepentend living activity hub).
 * This class is an independent extension to the standard.
 * 
 * Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * Specific actuator actions:
 * - power on
 * - power off
 * 
 * @author Thomas Fuxreiter
 */
public class AdaptorPlugActuatorEvent extends ManagedIndividual {
	public static final String MY_URI = ActivityHubOntology.NAMESPACE + 
	"AdaptorPlugActuatorEvent";

	public static final int POWER_ON = 0;
	public static final int POWER_OFF = 1;
	
	private static final String[] names = { "power_on", "power_off"};
	
	public static final AdaptorPlugActuatorEvent power_on = 
		new AdaptorPlugActuatorEvent(POWER_ON);
	public static final AdaptorPlugActuatorEvent power_off = 
		new AdaptorPlugActuatorEvent(POWER_OFF);
	
	private int order = 0;

	public AdaptorPlugActuatorEvent(String uri) {
		super(uri);
	}
	
	private AdaptorPlugActuatorEvent(int order) {
		super(ActivityHubOntology.NAMESPACE + names[order]);
		this.order  = order;
	}

	public static AdaptorPlugActuatorEvent getEventByOrder(int order) {
		switch (order) {
		case POWER_ON:
			return power_on;
		case POWER_OFF:
			return power_off;
		default:
			return null;
		}
	}

	public static final AdaptorPlugActuatorEvent valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(ActivityHubOntology.NAMESPACE))
			name = name.substring(ActivityHubOntology.NAMESPACE.length());

		for (int i = POWER_ON; i <= POWER_OFF; i++)
			if (names[i].equals(name))
				return getEventByOrder(i);

		return null;
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		/*This class has no property*/
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}

	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}

}
