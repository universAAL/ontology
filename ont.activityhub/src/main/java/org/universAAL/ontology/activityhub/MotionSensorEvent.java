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
 * Ontological enumeration of motion sensor events according to ISO 11073 - Part
 * 10471 (Independent living activity hub), edition 2010-05-01 Methods included
 * in this class are the mandatory ones for representing an ontological
 * enumeration in Java classes for uAAL.
 * 
 * Specific sensor events (from standard specification): - motion detected -
 * motion detected delayed (optional) - tamper detected (optional) - no
 * condition detected (optional)
 * 
 * TODO: the standard says: "the tamper flag may be additionally set at any
 * time" means together with a motion-detected or motion-detected-delayed event.
 * 
 * @author Thomas Fuxreiter
 */
public class MotionSensorEvent extends ActivityHubSensorEvent {

	public static final String MY_URI = ActivityHubOntology.NAMESPACE + "MotionSensorEvent";

	public static final int MOTION_DETECTED = 0;
	public static final int MOTION_DETECTED_DELAYED = 1;
	public static final int TAMPER_DETECTED = 2;
	public static final int NO_CONDITION_DETECTED = 3;

	private static final String[] names = { "motion_detected", "motion_detected_delayed", "tamper_detected",
			"no_condition_detected" };

	public static final MotionSensorEvent motion_detected = new MotionSensorEvent(MOTION_DETECTED);
	public static final MotionSensorEvent motion_detected_delayed = new MotionSensorEvent(MOTION_DETECTED_DELAYED);
	public static final MotionSensorEvent tamper_detected = new MotionSensorEvent(TAMPER_DETECTED);
	public static final MotionSensorEvent no_condition_detected = new MotionSensorEvent(NO_CONDITION_DETECTED);

	private int order = 0;

	public MotionSensorEvent(String uri) {
		super(uri);
	}

	private MotionSensorEvent(int order) {
		super(ActivityHubOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static MotionSensorEvent getEventByOrder(int order) {
		switch (order) {
		case MOTION_DETECTED:
			return motion_detected;
		case MOTION_DETECTED_DELAYED:
			return motion_detected_delayed;
		case TAMPER_DETECTED:
			return tamper_detected;
		case NO_CONDITION_DETECTED:
			return no_condition_detected;
		default:
			return null;
		}
	}

	public static final MotionSensorEvent valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(ActivityHubOntology.NAMESPACE))
			name = name.substring(ActivityHubOntology.NAMESPACE.length());

		for (int i = MOTION_DETECTED; i <= NO_CONDITION_DETECTED; i++)
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
