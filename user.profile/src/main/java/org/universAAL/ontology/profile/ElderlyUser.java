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
 * Ontological representation of the system user profile of a person. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for uAAL. Usually it includes getters and setters for
 * most of its properties.
 * 
 * @author mfernandez
 * 
 */
public class ElderlyUser extends User {

    public static final String PROFILING_NAMESPACE = "http://ontology.persona.upm.es/ElderlyUser.owl#";
    public static final String MY_URI;

    static {
	MY_URI = PROFILING_NAMESPACE + "ElderlyUser";
	register(ElderlyUser.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_HAS_PROFILE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    ElderlyProfile.MY_URI, 1, 1);
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static ElderlyUser loadInstance() {
	ElderlyUser eu = new ElderlyUser();
	eu.setProfile(ElderlyProfile.loadInstance());
	return eu;
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_HAS_PROFILE.equals(propURI) && o instanceof ElderlyProfile)
	    setProfile((ElderlyProfile) o);
	else
	    super.setProperty(propURI, o);
    }

    public static String RDFSComment() {

	return "The class of a ElderlyUser";
    }

    public static String getRDFSLabel() {
	return "ElderlyUser";
    }

    public ElderlyUser() {
	super();
    }

    public ElderlyUser(String uri) {
	super(uri);
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;

    }

    public boolean isWellFormed() {
	return props.containsKey(PROP_HAS_PROFILE);
    }

}
