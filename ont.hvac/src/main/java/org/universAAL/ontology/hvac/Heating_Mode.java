/*
	Copyright 2015 UPM, http://www.upm.es/
Universidad Politécnica de Madrid
 */

package org.universAAL.ontology.hvac;

/**
 * @author Ricardo
 * Description: Heating_Mode is a type of HVAC mode only for Heating in which user can find three modes.
 */
public class Heating_Mode extends Mode {
    public static final String MY_URI = HvacOntology.NAMESPACE + "Heating_Mode";
    /**
     * @author Ricardo
     * Description: 
     * NonAutomatic: its a mode in which the user sets the temperature that wants.
     * SleepMode: its an automatic mode that turn off the hvac system after a few hours .
     * WinterMode: its a mode that blows hot air insted of cold air.
     */
    public static final int NONAUTOMATIC = 0;
    public static final int SLEEPMODE = 1;
    public static final int WINTERMODE = 2;

    private static final String[] names = { "NonAutomatic", "SleepMode",
	    "WinterMode" };

    public static final Heating_Mode NonAutomatic = new Heating_Mode(NONAUTOMATIC);
    public static final Heating_Mode SleepMode = new Heating_Mode(SLEEPMODE);
    public static final Heating_Mode winterMode = new Heating_Mode(WINTERMODE);

    private int order;

    private Heating_Mode(int order) {
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

    public static Heating_Mode getHeating_ModeByOrder(int order) {
	switch (order) {
	case NONAUTOMATIC:
	    return NonAutomatic;
	case SLEEPMODE:
	    return SleepMode;
	case WINTERMODE:
	    return winterMode;
	default:
	    return null;
	}
    }

    public static final Heating_Mode valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(HvacOntology.NAMESPACE))
	    name = name.substring(HvacOntology.NAMESPACE.length());

	for (int i = NONAUTOMATIC; i <= WINTERMODE; i++)
	    if (names[i].equals(name))
		return getHeating_ModeByOrder(i);

	return null;
    }
}