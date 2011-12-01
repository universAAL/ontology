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

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontological enumeration of the possible postures of a person that could be
 * recognized. Methods included in this class are the mandatory ones for
 * representing an ontological enumeration in Java classes for uAAL.
 * 
 * @author Folker
 * @author Carsten Stockloew
 */
public class UserPosture extends ManagedIndividual {
    public static final String POSTURE_NAMESPACE = "http://ontology.igd.fraunhofer.de/UserPosture.owl#";

    public static final String MY_URI = POSTURE_NAMESPACE + "UserPosture";

    public static final int UNKNOWN = 0;
    public static final int LYING = 1;
    public static final int SITTING = 2;
    public static final int STANDING = 3;

    private static final String[] names = { "unknown", "lying", "sitting",
	    "standing" };

    public static final UserPosture unknown = new UserPosture(UNKNOWN);
    public static final UserPosture lying = new UserPosture(LYING);
    public static final UserPosture sitting = new UserPosture(SITTING);
    public static final UserPosture standing = new UserPosture(STANDING);

    public static UserPosture getUserPostureByOrder(int order) {
	switch (order) {
	case UNKNOWN:
	    return unknown;
	case LYING:
	    return lying;
	case SITTING:
	    return sitting;
	case STANDING:
	    return standing;
	default:
	    return null;
	}
    }

    public static final UserPosture valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(POSTURE_NAMESPACE))
	    name = name.substring(POSTURE_NAMESPACE.length());

	for (int i = UNKNOWN; i <= STANDING; i++)
	    if (names[i].equals(name))
		return getUserPostureByOrder(i);

	return null;
    }

    private int order;

    private UserPosture(int order) {
	super(POSTURE_NAMESPACE + names[order]);
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
}
