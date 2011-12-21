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
import org.universAAL.middleware.rdf.TypeMapper;

/**
 * Ontological representation of the social profile of a person. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for uAAL. Usually it includes getters and setters for
 * most of its properties.
 * 
 */
public class SocialProfile extends ManagedIndividual implements
	PropertyPublisher {

    public static final String PROFILING_NAMESPACE = "http://ontology.persona.ratio.it/SocialProfile.owl#";
    public static final String MY_URI;
    public static final String PROP_S_LIVE_ALONE;
    public static final String PROP_S_MAIN_CONTACT_ID;
    public static final String PROP_S_HOUSE_WORKER_ID;
    public static final String PROP_S_PHYCHO_STATE;

    static {
	MY_URI = PROFILING_NAMESPACE + "SocialProfile";
	PROP_S_HOUSE_WORKER_ID = PROFILING_NAMESPACE + "sHouseWorkerId";
	PROP_S_LIVE_ALONE = PROFILING_NAMESPACE + "sLiveAlone";
	PROP_S_MAIN_CONTACT_ID = PROFILING_NAMESPACE + "sMainContactId";
	PROP_S_PHYCHO_STATE = PROFILING_NAMESPACE + "sPhychoState";
	register(SocialProfile.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_S_HOUSE_WORKER_ID.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_S_LIVE_ALONE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Boolean.class), 1, 1);
	if (PROP_S_MAIN_CONTACT_ID.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_S_PHYCHO_STATE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_S_HOUSE_WORKER_ID.equals(propURI) && o instanceof Integer)
	    setHouseWorkerId((Integer) o);
	else if (PROP_S_LIVE_ALONE.equals(propURI) && o instanceof Boolean)
	    setLiveAlone((Boolean) o);
	else if (PROP_S_MAIN_CONTACT_ID.equals(propURI) && o instanceof Integer)
	    setsMainContactId((Integer) o);
	else if (PROP_S_PHYCHO_STATE.equals(propURI) && o instanceof String)
	    setPhychoState((String) o);
	else
	    super.setProperty(propURI, o);
    }

    public static String[] getStandardPropertyURIs() {
	return new String[] { PROP_S_HOUSE_WORKER_ID, PROP_S_LIVE_ALONE,
		PROP_S_MAIN_CONTACT_ID, PROP_S_PHYCHO_STATE };
    }

    public static String getRDFSComment() {
	return "The value of social profile.";
    }

    public static String getRDFSLabel() {
	return "Social Profile";
    }

    public SocialProfile() {
	super();
    }

    public SocialProfile(String uri) {
	super(uri);
    }

    public Integer getHouseWorkerId() {
	Object i = props.get(PROP_S_HOUSE_WORKER_ID);
	if (i instanceof Integer)
	    return (Integer) i;
	return new Integer(-1);
    }

    public void setHouseWorkerId(Integer sHouseWorkerId) {
	props.put(PROP_S_HOUSE_WORKER_ID, sHouseWorkerId);
    }

    public Boolean getLiveAlone() {
	Object o = props.get(PROP_S_LIVE_ALONE);
	return (o == null) ? new Boolean(false) : (Boolean) o;
    }

    public void setLiveAlone(Boolean sLiveAlone) {
	props.put(PROP_S_LIVE_ALONE, sLiveAlone);
    }

    public Integer getsMainContactId() {
	Object i = props.get(PROP_S_MAIN_CONTACT_ID);
	if (i instanceof Integer)
	    return (Integer) i;
	return new Integer(-1);
    }

    public void setsMainContactId(Integer sMainContactId) {
	props.put(PROP_S_MAIN_CONTACT_ID, sMainContactId);
    }

    public String getPhychoState() {
	Object o = props.get(PROP_S_PHYCHO_STATE);
	return (o == null) ? "" : (String) o;
    }

    public void setPhychoState(String sPhychoState) {
	props.put(PROP_S_PHYCHO_STATE, new String(sPhychoState));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.persona.ontology.ManagedIndividual#getPropSerializationType(java.
     * lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.persona.ontology.ManagedIndividual#isWellFormed()
     */
    public boolean isWellFormed() {
	return props.containsKey(PROP_S_HOUSE_WORKER_ID)
		&& props.containsKey(PROP_S_LIVE_ALONE)
		&& props.containsKey(PROP_S_MAIN_CONTACT_ID)
		&& props.containsKey(PROP_S_PHYCHO_STATE);
    }

    public ProfileProperty[] getAllProperties() {
	ProfileProperty[] staticProperties = getStaticProperties();
	ProfileProperty[] dynamicProperties = getDynamicProperties();

	int staticLength = staticProperties.length;
	int dynamicLength = dynamicProperties.length;
	int allLength = staticLength + dynamicLength;

	ProfileProperty[] allProperties = new ProfileProperty[allLength];

	for (int i = 0; i < staticLength; ++i) {
	    allProperties[i] = staticProperties[i];
	}
	for (int i = staticLength; i < allLength; ++i) {
	    allProperties[i] = dynamicProperties[staticLength - i];
	}

	return allProperties;
    }

    public ProfileProperty[] getDynamicProperties() {
	return new ProfileProperty[0];
    }

    public ProfileProperty[] getStaticProperties() {
	ProfileProperty[] ppArray = new ProfileProperty[4];

	ppArray[0] = new ProfileProperty((getHouseWorkerId()),
		PROP_S_HOUSE_WORKER_ID, "House worker ID", true);
	ppArray[1] = new ProfileProperty((getLiveAlone()), PROP_S_LIVE_ALONE,
		"Live alone?", true);
	ppArray[2] = new ProfileProperty((getsMainContactId()),
		PROP_S_MAIN_CONTACT_ID, "Main contact ID", true);
	ppArray[3] = new ProfileProperty(((getPhychoState() == null) ? ""
		: getPhychoState()), PROP_S_PHYCHO_STATE, "Phycho state", true);

	return ppArray;
    }

    /**
     * @return
     */
    public static SocialProfile loadInstance() {
	return new SocialProfile();
    }

}
