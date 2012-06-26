package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;

/**
 * Ontological enumeration of property exit sensor events according to
 * ISO 11073 - Part 10471 (Independent living activity hub).
 * Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * Specific sensor events (from standard specification):
 * - occupant exit property		// one or more people have departed via exit door
 * - exit door left open (optional)		// exit door remains open
 * - no condition detected (optional)
 *  
 * @author Thomas Fuxreiter
 *
 */
public class PropertyExitSensorEvent extends ActivityHubSensorEvent {
	public static final String MY_URI = ActivityHubOntology.NAMESPACE + 
	"PropertyExitSensorEvent";

	public static final int OCCUPANT_EXIT_PROPERTY = 0;
	public static final int EXIT_DOOR_LEFT_OPEN = 1;
	public static final int NO_CONDITION_DETECTED = 2;

	private static final String[] names = { "occupant_exit_property", 
		"exit_door_left_open", "no_condition_detected"};

	public static final PropertyExitSensorEvent occupant_exit_property = 
		new PropertyExitSensorEvent(OCCUPANT_EXIT_PROPERTY);
	public static final PropertyExitSensorEvent exit_door_left_open = 
		new PropertyExitSensorEvent(EXIT_DOOR_LEFT_OPEN);
	public static final PropertyExitSensorEvent no_condition_detected = 
		new PropertyExitSensorEvent(NO_CONDITION_DETECTED);

	private int order = 0;

	public PropertyExitSensorEvent(String uri) {
		super(uri);
	}

	private PropertyExitSensorEvent(int order) {
		super(ActivityHubOntology.NAMESPACE + names[order]);
		this.order  = order;
	}

	public static PropertyExitSensorEvent getEventByOrder(int order) {
		switch (order) {
		case OCCUPANT_EXIT_PROPERTY:
			return occupant_exit_property;
		case EXIT_DOOR_LEFT_OPEN:
			return exit_door_left_open;
		case NO_CONDITION_DETECTED:
			return no_condition_detected;
		default:
			return null;
		}
	}

	public static final PropertyExitSensorEvent valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(ActivityHubOntology.NAMESPACE))
			name = name.substring(ActivityHubOntology.NAMESPACE.length());

		for (int i = OCCUPANT_EXIT_PROPERTY; i <= NO_CONDITION_DETECTED; i++)
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
