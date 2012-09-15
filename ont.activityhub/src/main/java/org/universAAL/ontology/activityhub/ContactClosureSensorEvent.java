package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;

/**
 * Ontological enumeration of contact closure sensor events according to
 * ISO 11073 - Part 10471 (Indepentend living activity hub).
 * Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for uAAL. Usually it
 * includes getters and setters for most of its properties.
 * 
 * Specific sensor events (from standard specification):
 * - contact opened
 * - contact closed
 * - no condition detected (optional)
 *  
 * @author Thomas Fuxreiter
 *
 */
public class ContactClosureSensorEvent extends ActivityHubSensorEvent {
	public static final String MY_URI = ActivityHubOntology.NAMESPACE + 
	"ContactClosureSensorEvent";

	public static final int CONTACT_OPENED = 0;
	public static final int CONTACT_CLOSED = 1;
	public static final int NO_CONDITION_DETECTED = 2;

	private static final String[] names = { "contact_opened", "contact_closed",
		"no_condition_detected"};

	public static final ContactClosureSensorEvent contact_opened = 
		new ContactClosureSensorEvent(CONTACT_OPENED);
	public static final ContactClosureSensorEvent contact_closed = 
		new ContactClosureSensorEvent(CONTACT_CLOSED);
	public static final ContactClosureSensorEvent no_condition_detected = 
		new ContactClosureSensorEvent(NO_CONDITION_DETECTED);

	private int order = 0;

	public ContactClosureSensorEvent(String uri) {
		super(uri);
	}

	private ContactClosureSensorEvent(int order) {
		super(ActivityHubOntology.NAMESPACE + names[order]);
		this.order  = order;
	}

	public static ContactClosureSensorEvent getEventByOrder(int order) {
		switch (order) {
		case CONTACT_OPENED:
			return contact_opened;
		case CONTACT_CLOSED:
			return contact_closed;
		case NO_CONDITION_DETECTED:
			return no_condition_detected;
		default:
			return null;
		}
	}

	public static final ContactClosureSensorEvent valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(ActivityHubOntology.NAMESPACE))
			name = name.substring(ActivityHubOntology.NAMESPACE.length());

		for (int i = CONTACT_OPENED; i <= NO_CONDITION_DETECTED; i++)
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
