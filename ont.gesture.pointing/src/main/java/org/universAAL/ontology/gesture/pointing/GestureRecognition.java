/*
	Copyright 2007-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research

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
package org.universAAL.ontology.gesture.pointing;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Enumeration;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.ontology.profile.User;

/**
 * @author mtazari
 *
 */
public abstract class GestureRecognition extends ManagedIndividual {
	public static final String GESTURE_RECOGNITION_NAMESPACE = "http://ontology.persona.ima.igd.fhg.de/GestureRecognition.owl#";

	public static final String MY_URI = GESTURE_RECOGNITION_NAMESPACE + "GestureRecognition";
	public static final String PROP_SUBJECT_USER = GESTURE_RECOGNITION_NAMESPACE + "subjectUser";
	public static final String PROP_GESTURE_TYPE = GESTURE_RECOGNITION_NAMESPACE + "gestureType";

	public static final int GESTURE_TYPE_COMMAND = 0;
	public static final int GESTURE_TYPE_POINTING = 1;

	public static MergedRestriction getClassRestrictionsOnProperty(String propURI) {
		if (propURI == null)
			return null;

		if (propURI.equals(PROP_GESTURE_TYPE))
			return MergedRestriction.getAllValuesRestrictionWithCardinality(propURI,
					new Enumeration(new Integer[] { new Integer(0), new Integer(1) }), 1, 1);

		if (propURI.equals(PROP_SUBJECT_USER))
			return MergedRestriction.getAllValuesRestrictionWithCardinality(propURI, User.MY_URI, 1, 0);

		return null;// ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}

	public static String getRDFSComment() {
		return "Represents the info about recognized gestures of users.";
	}

	public static String getRDFSLabel() {
		return "Recognized Gesture";
	}

	public static String[] getStandardPropertyURIs() {
		return new String[] { PROP_GESTURE_TYPE, PROP_SUBJECT_USER };
	}

	public GestureRecognition() {
		super();
	}

	public GestureRecognition(int gestureType) {
		super();
		if (gestureType == GESTURE_TYPE_COMMAND || gestureType == GESTURE_TYPE_POINTING)
			props.put(PROP_GESTURE_TYPE, new Integer(gestureType));
		else
			throw new IllegalArgumentException("Illegal gesture type!");
	}

	/**
	 * Returns the non-negative int value of gesture type if it is set, -1
	 * otherwise.
	 */
	public int getGestureType() {
		Object o = props.get(PROP_GESTURE_TYPE);
		return (o instanceof Integer) ? ((Integer) o).intValue() : -1;
	}

	/**
	 * @see org.persona.ontology.ManagedIndividual#getPropSerializationType(java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_GESTURE_TYPE.equals(propURI) ? PROP_SERIALIZATION_FULL
				: PROP_SUBJECT_USER.equals(propURI) ? PROP_SERIALIZATION_REDUCED : PROP_SERIALIZATION_UNDEFINED;
	}

	public User getSubjectUser() {
		return (User) props.get(PROP_SUBJECT_USER);
	}

	public void setSubjectUser(User user) {
		if (user != null && !props.containsKey(PROP_SUBJECT_USER))
			props.put(PROP_SUBJECT_USER, user);
	}
}
