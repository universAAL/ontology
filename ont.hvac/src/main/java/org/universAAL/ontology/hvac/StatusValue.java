/*
	Copyright 2015 UPM, http://www.upm.es/
Universidad Politécnica de Madrid
 */
package org.universAAL.ontology.hvac;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * @author Ricardo
 * Description: Indicates the state of things
 */
public class StatusValue extends ManagedIndividual {
    public static final String MY_URI = HvacOntology.NAMESPACE
	    + "StatusValue";

    public static final int ACTIVATED = 0;
    public static final int NOT_ACTIVATED = 1;
    public static final int NO_CONDITION = 2;

    private static final String[] names = { "Activated", "NotActivated",
	    "NoCondition" };

    public static final StatusValue Activated = new StatusValue(ACTIVATED);
    public static final StatusValue NotActivated = new StatusValue(NOT_ACTIVATED);
    public static final StatusValue NoCondition = new StatusValue(NO_CONDITION);

    private int order;

    private StatusValue(int order) {
	super(HvacOntology.NAMESPACE + names[order]);
	this.order = order;
    }

    public int getPropSerializationType(String propURI) {
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

    public String getClassURI() {
	return MY_URI;
    }

    public static StatusValue getStatusValueByOrder(int order) {
	switch (order) {
	case ACTIVATED:
	    return Activated;
	case NOT_ACTIVATED:
	    return NotActivated;
	case NO_CONDITION:
	    return NoCondition;
	default:
	    return null;
	}
    }

    public static final StatusValue valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(HvacOntology.NAMESPACE))
	    name = name.substring(HvacOntology.NAMESPACE.length());

	for (int i = ACTIVATED; i <= NO_CONDITION; i++)
	    if (names[i].equals(name))
		return getStatusValueByOrder(i);

	return null;
    }
}
