package org.universAAL.ontology.activityhub;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.ActivityHubOntology;

/**
 * Ontological enumeration of enuresis sensor events according
 * to ISO 11073 - Part 10471 (Indepentend living activity hub).
 * Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * Specific sensor events (from standard specification):
 * - enuresis detected
 * - no condition detected (optional)
 * 
 * @author Thomas Fuxreiter
 *
 */
public class EnuresisSensorEvent extends ManagedIndividual {
	public static final String MY_URI = ActivityHubOntology.NAMESPACE + 
	"EnuresisSensorEvent";

	public static final int ENURESIS_DETECTED = 0;
	public static final int NO_CONDITION_DETECTED = 1;

	private static final String[] names = { "enuresis_detected", 
		"no_condition_detected"};

	public static final EnuresisSensorEvent enuresis_detected = 
		new EnuresisSensorEvent(ENURESIS_DETECTED);
	public static final EnuresisSensorEvent no_condition_detected = 
		new EnuresisSensorEvent(NO_CONDITION_DETECTED);

	private int order = 0;

	public EnuresisSensorEvent(String uri) {
		super(uri);
	}

	private EnuresisSensorEvent(int order) {
		super(ActivityHubOntology.NAMESPACE + names[order]);
		this.order  = order;
	}

	public static EnuresisSensorEvent getEventByOrder(int order) {
		switch (order) {
		case ENURESIS_DETECTED:
			return enuresis_detected;
		case NO_CONDITION_DETECTED:
			return no_condition_detected;
		default:
			return null;
		}
	}

	public static final EnuresisSensorEvent valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(ActivityHubOntology.NAMESPACE))
			name = name.substring(ActivityHubOntology.NAMESPACE.length());

		for (int i = ENURESIS_DETECTED; i <= NO_CONDITION_DETECTED; i++)
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
		/*TODO call base method from ManagedIndividual?*/
		return true;
	}

	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}
}
