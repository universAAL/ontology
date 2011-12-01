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

import org.universAAL.ontology.phThing.PhysicalThing;

/**
 * Ontological representation of a person that is a user of the system. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for uAAL. Usually it includes getters and setters for
 * most of its properties.
 * 
 * @author mfernandez
 * @author Carsten Stockloew
 */
public class User extends PhysicalThing {
    public static final String PROFILING_NAMESPACE = "http://ontology.persona.upm.es/User.owl#";
    public static final String MY_URI;
    public static final String PROP_HAS_PROFILE;
    public static final String PROP_HAS_PROPERTY_BAG;
    public static final String PROP_USERNAME;
    public static final String PROP_PASSWORD;
    public static final String PROP_USER_POSTURE;
    public static final String PROP_SLEEPING_STATE;

    static {
	MY_URI = PROFILING_NAMESPACE + "User";
	PROP_HAS_PROFILE = PROFILING_NAMESPACE + "hasProfile";
	PROP_HAS_PROPERTY_BAG = PROFILING_NAMESPACE + "hasPropertyMap";
	PROP_USERNAME = PROFILING_NAMESPACE + "username";
	PROP_PASSWORD = PROFILING_NAMESPACE + "password";
	PROP_USER_POSTURE = UserPosture.POSTURE_NAMESPACE + "hasPosture";
	PROP_SLEEPING_STATE = SleepingState.USER_STATE_NAMESPACE
		+ "hasSleepintState";
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_HAS_PROFILE.equals(propURI) && o instanceof UserProfile)
	    setProfile((UserProfile) o);
	else if (PROP_USER_POSTURE.equals(propURI) && o instanceof UserPosture)
	    setPosture((UserPosture) o);
	else if (PROP_HAS_PROPERTY_BAG.equals(propURI)
		&& o instanceof PropertyBag)
	    setPropertyBag((PropertyBag) o);
	else if (PROP_USERNAME.equals(propURI) && o instanceof String)
	    setUsername((String) o);
	else if (PROP_PASSWORD.equals(propURI) && o instanceof String)
	    setPassword((String) o);
	else
	    super.setProperty(propURI, o);
    }

    public User() {
	super();
    }

    public User(String uri) {
	super(uri);
    }

    public User(String uri, UserProfile hasProfile) throws Exception {
	super(uri);
	if (hasProfile == null)
	    throw new Exception();
	props.put(PROP_HAS_PROFILE, hasProfile);

    }

    public UserPosture getPosture() {
	return (UserPosture) props.get(PROP_USER_POSTURE);
    }

    public void setPosture(UserPosture p) {
	if (p != null)
	    props.put(PROP_USER_POSTURE, p);
    }

    public UserProfile getProfile() {
	return (UserProfile) props.get(PROP_HAS_PROFILE);
    }

    public void setProfile(UserProfile userProfile) {
	if (userProfile != null)
	    props.put(PROP_HAS_PROFILE, userProfile);
    }

    public SleepingState getSleepingState() {
	return (SleepingState) props.get(PROP_SLEEPING_STATE);
    }

    public void setSleepingState(SleepingState ss) {
	if (ss != null)
	    props.put(PROP_SLEEPING_STATE, ss);
    }

    public PropertyBag getPropertyBag() {
	Object o = props.get(PROP_HAS_PROPERTY_BAG);
	return (o instanceof PropertyBag) ? (PropertyBag) o : null;
    }

    public void setPropertyBag(PropertyBag bag) {
	if (bag == null)
	    return;

	props.put(PROP_HAS_PROPERTY_BAG, bag);
    }

    public void setUsername(String username) {
	if (username == null)
	    return;

	props.put(PROP_USERNAME, username);
    }

    public String getUsername() {
	Object o = props.get(PROP_USERNAME);

	return (o instanceof String) ? (String) o : null;
    }

    public void setPassword(String password) {
	if (password == null)
	    return;

	props.put(PROP_PASSWORD, password);
    }

    public String getPassword() {
	Object o = props.get(PROP_PASSWORD);
	return (o instanceof String) ? (String) o : null;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return props.containsKey(PROP_HAS_PROFILE);
    }
}
