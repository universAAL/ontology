/*
	Copyright 2008-2010 SPIRIT, http://www.spirit-intl.com/
	SPIRIT S.A. E-BUSINESS AND COMMUNICATIONS ENGINEERING 
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
/**
 * 
 */
package org.universAAL.ontology.profile;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontological enumeration of the possible sleeping states of a person. Methods
 * included in this class are the mandatory ones for representing an ontological
 * enumeration in Java classes for uAAL.
 * 
 * @author Folker
 * 
 */
public class SleepingState extends ManagedIndividual implements EnumProperty {
    public static final String USER_STATE_NAMESPACE = "http://ontology.igd.fraunhofer.de/UserState.owl#";

    public static final String MY_URI;
    public static final String PROP_SLEEPING_STATE;
    static {
	MY_URI = USER_STATE_NAMESPACE + "SleepingState";
	PROP_SLEEPING_STATE = USER_STATE_NAMESPACE + "hasSleepintState";
	register(SleepingState.class);
    }

    public static final int UNKNOWN = 0;
    public static final int ASLEEP = 1;
    public static final int AWAKE = 2;
    public static final int PREPARED_TO_SLEEP = 3;
    public static final int SLEEPY = 4;

    private static final String[] names = { "unknown", "asleep", "awake",
	    "prepared_to_sleep", "sleepy" };

    public static final SleepingState unknown = new SleepingState(UNKNOWN);
    public static final SleepingState asleep = new SleepingState(ASLEEP);
    public static final SleepingState awake = new SleepingState(AWAKE);
    public static final SleepingState preparedToSleep = new SleepingState(
	    PREPARED_TO_SLEEP);
    public static final SleepingState sleepy = new SleepingState(SLEEPY);

    /**
     * Returns the list of all class members guaranteeing that no other members
     * will be created after a call to this method.
     */
    public static ManagedIndividual[] getEnumerationMembers() {
	return new ManagedIndividual[] { unknown, asleep, awake,
		preparedToSleep, sleepy };
    }

    /**
     * Returns the rating with the given URI.
     */
    public static ManagedIndividual getIndividualByURI(String instanceURI) {
	return (instanceURI != null && instanceURI
		.startsWith(USER_STATE_NAMESPACE)) ? valueOf(instanceURI
		.substring(USER_STATE_NAMESPACE.length())) : null;
    }

    public static SleepingState getSleepingStateByOrder(int order) {
	switch (order) {
	case UNKNOWN:
	    return unknown;
	case ASLEEP:
	    return asleep;
	case AWAKE:
	    return awake;
	case PREPARED_TO_SLEEP:
	    return preparedToSleep;
	case SLEEPY:
	    return sleepy;
	default:
	    return null;
	}
    }

    public static String getRDFSComment() {
	return "The class of possible states of the user in regard to sleeping.";
    }

    public static String getRDFSLabel() {
	return "Sleeping State";
    }

    public static final SleepingState valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(USER_STATE_NAMESPACE))
	    name = name.substring(USER_STATE_NAMESPACE.length());

	for (int i = UNKNOWN; i <= PREPARED_TO_SLEEP; i++)
	    if (names[i].equals(name))
		return getSleepingStateByOrder(i);

	return null;
    }

    private int order;

    private SleepingState(int order) {
	super(USER_STATE_NAMESPACE + names[order]);
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

    public void setProperty(String propURI, Object o) {
	// do nothing
    }

    public ProfileProperty[] getAllProperties() {
	return new ProfileProperty[0];
    }

    public ProfileProperty[] getDynamicProperties() {
	return new ProfileProperty[0];
    }

    public ProfileProperty[] getStaticProperties() {
	return new ProfileProperty[0];
    }

    public static SleepingState loadInstance() {
	return SleepingState.unknown;
    }

    public List getAllValues() {
	List l = new ArrayList();
	for (int i = 0; i < names.length; ++i) {
	    l.add(new Object[] { names[i],
		    SleepingState.getSleepingStateByOrder(i) });
	}
	return l;
    }
}
