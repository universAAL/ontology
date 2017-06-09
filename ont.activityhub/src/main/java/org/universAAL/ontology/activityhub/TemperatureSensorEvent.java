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
 * Ontological enumeration of temperature sensor events according to ISO 11073 -
 * Part 10471 (Independent living activity hub), edition 2010-05-01 Methods
 * included in this class are the mandatory ones for representing an ontological
 * enumeration in Java classes for uAAL.
 * 
 * Specific sensor events (from standard specification): - high temperature
 * detected - low temperature detected - rate of change too fast (optional) - no
 * condition detected (optional)
 * 
 * @author Thomas Fuxreiter
 */
public class TemperatureSensorEvent extends ActivityHubSensorEvent {

	public static final String MY_URI = ActivityHubOntology.NAMESPACE + "TemperatureSensorEvent";

	public static final int HIGH_TEMPERATURE_DETECTED = 0;
	public static final int LOW_TEMPERATURE_DETECTED = 1;
	public static final int RATE_OF_CHANGE_TOO_FAST = 2;
	public static final int NO_CONDITION_DETECTED = 3;

	private static final String[] names = { "high_temperature_detected", "low_temperature_detected",
			"rate_of_change_too_fast", "no_condition_detected" };

	public static final TemperatureSensorEvent high_temperature_detected = new TemperatureSensorEvent(
			HIGH_TEMPERATURE_DETECTED);
	public static final TemperatureSensorEvent low_temperature_detected = new TemperatureSensorEvent(
			LOW_TEMPERATURE_DETECTED);
	public static final TemperatureSensorEvent rate_of_change_too_fast = new TemperatureSensorEvent(
			RATE_OF_CHANGE_TOO_FAST);
	public static final TemperatureSensorEvent no_condition_detected = new TemperatureSensorEvent(
			NO_CONDITION_DETECTED);

	private int order = 0;

	public TemperatureSensorEvent(String uri) {
		super(uri);
	}

	private TemperatureSensorEvent(int order) {
		super(ActivityHubOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static TemperatureSensorEvent getEventByOrder(int order) {
		switch (order) {
		case HIGH_TEMPERATURE_DETECTED:
			return high_temperature_detected;
		case LOW_TEMPERATURE_DETECTED:
			return low_temperature_detected;
		case RATE_OF_CHANGE_TOO_FAST:
			return rate_of_change_too_fast;
		case NO_CONDITION_DETECTED:
			return no_condition_detected;
		default:
			return null;
		}
	}

	public static final TemperatureSensorEvent valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(ActivityHubOntology.NAMESPACE))
			name = name.substring(ActivityHubOntology.NAMESPACE.length());

		for (int i = HIGH_TEMPERATURE_DETECTED; i <= NO_CONDITION_DETECTED; i++)
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
