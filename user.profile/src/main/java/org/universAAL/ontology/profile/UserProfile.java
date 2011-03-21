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

import org.universAAL.middleware.owl.Restriction;

/**
 * @author mfernandez
 * 
 */
// This class is empty; properties must be defined
public class UserProfile extends Profile {
    public static final String PROFILING_NAMESPACE = "http://ontology.persona.upm.es/UserProfile.owl#";
    public static final String MY_URI;

    public static final String PROP_USER_ID_PROFILE;

    static {
	MY_URI = PROFILING_NAMESPACE + "UserProfile";
	PROP_USER_ID_PROFILE = PROFILING_NAMESPACE + "userIdProfile";
	register(UserProfile.class);
    }

    // Set restrictions due to its properties
    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_USER_ID_PROFILE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    UserIdentificationProfile.MY_URI, 1, 1);

	return Profile.getClassRestrictionsOnProperty(propURI);
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_USER_ID_PROFILE.equals(propURI)
		&& o instanceof UserIdentificationProfile)
	    setUserIdentificationProfile((UserIdentificationProfile) o);
	else
	    super.setProperty(propURI, o);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = Profile.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i++] = PROP_USER_ID_PROFILE;
	return toReturn;
    }

    public static String getRDFSComment() {
	return "The class of a UserProfile.";
    }

    public static String getRDFSLabel() {
	return "UserProfile";
    }

    public UserProfile() {
	super();
    }

    public UserProfile(String uri) {
	super(uri);
    }

    public UserProfile(String uri, UserIdentificationProfile userIdProfile) {

	super(uri);
	if (userIdProfile == null)
	    throw new IllegalArgumentException();

	props.put(PROP_USER_ID_PROFILE, userIdProfile);

    }

    public UserIdentificationProfile getUserIdentificationProfile() {
	Object o = props.get(PROP_USER_ID_PROFILE);
	return (o == null) ? null : (UserIdentificationProfile) o;
    }

    public void setUserIdentificationProfile(
	    UserIdentificationProfile userIdProfile) {
	if (userIdProfile != null)
	    props.put(PROP_USER_ID_PROFILE, userIdProfile);

    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    // Later must be modified; properties (contained key) must be returned
    public boolean isWellFormed() {
	return props.containsKey(PROP_USER_ID_PROFILE);
    }

    public ProfileProperty[] getAllProperties() {
	return getStaticProperties();
    }

    public ProfileProperty[] getDynamicProperties() {
	ProfileProperty[] inherited = super.getDynamicProperties();
	ProfileProperty[] propArray = new ProfileProperty[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    propArray[i] = inherited[i++];
	}

	// propArray[i++] = new ProfileProperty("", PROP_THE_USER, "User");
	propArray[i++] = new ProfileProperty(
		((getUserIdentificationProfile() == null) ? new UserIdentificationProfile()
			: getUserIdentificationProfile()),
		PROP_USER_ID_PROFILE, "User Identification Profile", true);

	return propArray;
    }

    public ProfileProperty[] getStaticProperties() {
	ProfileProperty[] inherited = super.getStaticProperties();
	ProfileProperty[] propArray = new ProfileProperty[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    propArray[i] = inherited[i++];
	}

	propArray[i++] = new ProfileProperty(
		((getUserIdentificationProfile() == null) ? new UserIdentificationProfile()
			: getUserIdentificationProfile()),
		PROP_USER_ID_PROFILE, "User Identification Profile", true);
	return propArray;
    }

    /**
     * @return
     */
    public static UserProfile loadInstace() {
	UserProfile up = new UserProfile();
	up.setUserIdentificationProfile(UserIdentificationProfile
		.loadInstance());
	return up;
    }
}