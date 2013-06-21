package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;

/**
 * Ontological enumeration of usage sensor events according to ISO 11073 - Part
 * 10471 (Independent living activity hub), edition 2010-05-01 Methods included
 * in this class are the mandatory ones for representing an ontological
 * enumeration in Java classes for uAAL.
 * 
 * Specific sensor events (from standard specification): - usage started //
 * bed/chair in - usage ended // bed/chair out - expected use start violation
 * (optional) // expected usage not started - expected use stop violation
 * (optional) // usage continued beyond expected usage end - absence violation
 * (optional) // absent for too long a period during expected usage - no
 * condition detected (optional)
 * 
 * @author Thomas Fuxreiter
 */
public class UsageSensorEvent extends ActivityHubSensorEvent {

    public static final String MY_URI = ActivityHubOntology.NAMESPACE
	    + "UsageSensorEvent";

    public static final int USAGE_STARTED = 0;
    public static final int USAGE_ENDED = 1;
    public static final int EXPECTED_USE_START_VIOLATION = 2;
    public static final int EXPECTED_USE_STOP_VIOLATION = 3;
    public static final int ABSENCE_VIOLATION = 4;
    public static final int NO_CONDITION_DETECTED = 5;

    private static final String[] names = { "usage_started", "usage_ended",
	    "expected_use_start_violation", "expected_use_stop_violation",
	    "absence_violation", "no_condition_detected" };

    public static final UsageSensorEvent usage_started = new UsageSensorEvent(
	    USAGE_STARTED);
    public static final UsageSensorEvent usage_ended = new UsageSensorEvent(
	    USAGE_ENDED);
    public static final UsageSensorEvent expected_use_start_violation = new UsageSensorEvent(
	    EXPECTED_USE_START_VIOLATION);
    public static final UsageSensorEvent expected_use_stop_violation = new UsageSensorEvent(
	    EXPECTED_USE_STOP_VIOLATION);
    public static final UsageSensorEvent absence_violation = new UsageSensorEvent(
	    ABSENCE_VIOLATION);
    public static final UsageSensorEvent no_condition_detected = new UsageSensorEvent(
	    NO_CONDITION_DETECTED);

    private int order = 0;

    public UsageSensorEvent(String uri) {
	super(uri);
    }

    private UsageSensorEvent(int order) {
	super(ActivityHubOntology.NAMESPACE + names[order]);
	this.order = order;
    }

    public static UsageSensorEvent getEventByOrder(int order) {
	switch (order) {
	case USAGE_STARTED:
	    return usage_started;
	case USAGE_ENDED:
	    return usage_ended;
	case EXPECTED_USE_START_VIOLATION:
	    return expected_use_start_violation;
	case EXPECTED_USE_STOP_VIOLATION:
	    return expected_use_stop_violation;
	case ABSENCE_VIOLATION:
	    return absence_violation;
	case NO_CONDITION_DETECTED:
	    return no_condition_detected;
	default:
	    return null;
	}
    }

    public static final UsageSensorEvent valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(ActivityHubOntology.NAMESPACE))
	    name = name.substring(ActivityHubOntology.NAMESPACE.length());

	for (int i = USAGE_STARTED; i <= NO_CONDITION_DETECTED; i++)
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
