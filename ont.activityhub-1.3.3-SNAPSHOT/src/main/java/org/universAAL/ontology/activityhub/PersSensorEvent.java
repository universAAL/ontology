package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;

/**
 * Ontological enumeration of PERS (personal emergency) sensor events according
 * to ISO 11073 - Part 10471 (Independent living activity hub). Methods included
 * in this class are the mandatory ones for representing an ontological concept
 * in Java classes for uAAL. Usually it includes getters and setters for most of
 * its properties.
 * 
 * Specific sensor events (from standard specification): - pers activated - no
 * condition detected (optional)
 * 
 * @author Thomas Fuxreiter
 * 
 */
public class PersSensorEvent extends ActivityHubSensorEvent {
    public static final String MY_URI = ActivityHubOntology.NAMESPACE
	    + "PersSensorEvent";

    public static final int PERS_ACTIVATED = 0;
    public static final int NO_CONDITION_DETECTED = 1;

    private static final String[] names = { "pers_activated",
	    "no_condition_detected" };

    public static final PersSensorEvent pers_activated = new PersSensorEvent(
	    PERS_ACTIVATED);
    public static final PersSensorEvent no_condition_detected = new PersSensorEvent(
	    NO_CONDITION_DETECTED);

    private int order = 0;

    public PersSensorEvent(String uri) {
	super(uri);
    }

    private PersSensorEvent(int order) {
	super(ActivityHubOntology.NAMESPACE + names[order]);
	this.order = order;
    }

    public static PersSensorEvent getEventByOrder(int order) {
	switch (order) {
	case PERS_ACTIVATED:
	    return pers_activated;
	case NO_CONDITION_DETECTED:
	    return no_condition_detected;
	default:
	    return null;
	}
    }

    public static final PersSensorEvent valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(ActivityHubOntology.NAMESPACE))
	    name = name.substring(ActivityHubOntology.NAMESPACE.length());

	for (int i = PERS_ACTIVATED; i <= NO_CONDITION_DETECTED; i++)
	    if (names[i].equals(name))
		return getEventByOrder(i);

	return null;
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	/* This class has no property */
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
