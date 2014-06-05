/*
     Copyright 2010-2014 AIT Austrian Institute of Technology GmbH
	 http://www.ait.ac.at
     
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

package org.universAAL.ontology.activityhub;

import org.universAAL.ontology.ActivityHubOntology;

/**
 * Ontological enumeration of fall sensor events according to ISO 11073 - Part
 * 10471 (Independent living activity hub). Methods included in this class are
 * the mandatory ones for representing an ontological concept in Java classes
 * for uAAL. Usually it includes getters and setters for most of its properties.
 * 
 * Specific sensor events (from standard specification): - fall detected - no
 * condition detected (optional)
 * 
 * @author Thomas Fuxreiter
 * 
 */
public class FallSensorEvent extends ActivityHubSensorEvent {
    public static final String MY_URI = ActivityHubOntology.NAMESPACE
	    + "FallSensorEvent";

    public static final int FALL_DETECTED = 0;
    public static final int NO_CONDITION_DETECTED = 1;

    private static final String[] names = { "fall_detected",
	    "no_condition_detected" };

    public static final FallSensorEvent fall_detected = new FallSensorEvent(
	    FALL_DETECTED);
    public static final FallSensorEvent no_condition_detected = new FallSensorEvent(
	    NO_CONDITION_DETECTED);

    private int order = 0;

    public FallSensorEvent(String uri) {
	super(uri);
    }

    private FallSensorEvent(int order) {
	super(ActivityHubOntology.NAMESPACE + names[order]);
	this.order = order;
    }

    public static FallSensorEvent getEventByOrder(int order) {
	switch (order) {
	case FALL_DETECTED:
	    return fall_detected;
	case NO_CONDITION_DETECTED:
	    return no_condition_detected;
	default:
	    return null;
	}
    }

    public static final FallSensorEvent valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(ActivityHubOntology.NAMESPACE))
	    name = name.substring(ActivityHubOntology.NAMESPACE.length());

	for (int i = FALL_DETECTED; i <= NO_CONDITION_DETECTED; i++)
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
