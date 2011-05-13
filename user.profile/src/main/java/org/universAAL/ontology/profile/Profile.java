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
package org.universAAL.ontology.profile;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;

/**
 * Ontological representation of a user root profile. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author mfernandez
 * 
 */

// This class is empty; properties must be defined
public class Profile extends ManagedIndividual implements PropertyPublisher {
    public static final String PROFILING_NAMESPACE = "http://ontology.persona.upm.es/Profile.owl#";
    public static final String MY_URI;
    // Define more parameters for userProfile

    static {
	MY_URI = PROFILING_NAMESPACE + "Profile";
	register(Profile.class);
    }

    // Set restrictions due to its properties
    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String getRDFSComment() {
	return "The class of a Profile.";
    }

    public static String getRDFSLabel() {
	return "Profile";
    }

    public Profile() {
	super();
    }

    public Profile(String uri) {
	super(uri);
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    // Later must be modified; properties (contained key) must be returned
    public boolean isWellFormed() {
	return true;
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
}