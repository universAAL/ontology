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

public class Address extends ManagedIndividual implements PropertyPublisher {

    public static final String PROFILING_NAMESPACE = "http://ontology.anco.gr/Address.owl#";
    public static final String MY_URI;
    public static final String PROP_S_COUNTRY;
    public static final String PROP_S_STATE;
    public static final String PROP_S_CITY;
    public static final String PROP_S_PROVINCE;
    public static final String PROP_S_STREET;

    static {
	MY_URI = PROFILING_NAMESPACE + "Address";
	PROP_S_COUNTRY = PROFILING_NAMESPACE + "sCountry";
	PROP_S_STATE = PROFILING_NAMESPACE + "sState";
	PROP_S_CITY = PROFILING_NAMESPACE + "sCity";
	PROP_S_PROVINCE = PROFILING_NAMESPACE + "sProvince";
	PROP_S_STREET = PROFILING_NAMESPACE + "sStreet";
	register(Address.class);
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_S_CITY.equals(propURI) && o instanceof String)
	    setCity((String) o);
	else if (PROP_S_COUNTRY.equals(propURI) && o instanceof String)
	    setCountry((String) o);
	else if (PROP_S_STATE.equals(propURI) && o instanceof String)
	    setState((String) o);
	else if (PROP_S_PROVINCE.equals(propURI) && o instanceof String)
	    setProvince((String) o);
	else if (PROP_S_STREET.equals(propURI) && o instanceof String)
	    setStreet((String) o);
	else
	    super.setProperty(propURI, o);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_S_COUNTRY.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_STATE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_CITY.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_PROVINCE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_STREET.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	return new String[] { PROP_S_COUNTRY, PROP_S_STATE, PROP_S_CITY,
		PROP_S_PROVINCE, PROP_S_STREET };
    }

    public static String getRDFSComment() {
	return "The value of Address profile.";
    }

    public static String getRDFSLabel() {
	return "Personal AddressProfile";
    }

    public Address() {
	super();
    }

    public Address(String uri) {
	super(uri);
    }

    public Address(String uri, String country, String state, String city,
	    String province, String street) {
	super(uri);

	props.put(PROP_S_COUNTRY, country);
	props.put(PROP_S_STATE, state);
	props.put(PROP_S_CITY, city);
	props.put(PROP_S_PROVINCE, province);
	props.put(PROP_S_STREET, street);
    }

    public String getCountry() {
	Object o = props.get(PROP_S_COUNTRY);
	return (o == null ? null : (String) o);
    }

    public void setCountry(String country) {
	if (country != null)
	    props.put(PROP_S_COUNTRY, country);
    }

    public String getState() {
	Object o = props.get(PROP_S_STATE);
	return (o == null ? null : (String) o);
    }

    public void setState(String state) {
	if (state != null)
	    props.put(PROP_S_STATE, state);
    }

    public String getCity() {
	Object o = props.get(PROP_S_CITY);
	return (o == null ? null : (String) o);
    }

    public void setCity(String city) {
	if (city != null)
	    props.put(PROP_S_CITY, city);
    }

    public String getProvince() {
	Object o = props.get(PROP_S_PROVINCE);
	return (o == null ? null : (String) o);
    }

    public void setProvince(String province) {
	if (province != null)
	    props.put(PROP_S_PROVINCE, province);
    }

    public String getStreet() {
	Object o = props.get(PROP_S_STREET);
	return (o == null ? null : (String) o);
    }

    public void setStreet(String street) {
	if (street != null)
	    props.put(PROP_S_STREET, new Boolean(street));
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
	return props.containsKey(PROP_S_COUNTRY)
		&& props.containsKey(PROP_S_CITY);
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
	ProfileProperty[] pp = new ProfileProperty[5];

	pp[0] = new ProfileProperty((getCountry() == null ? "" : getCountry()),
		PROP_S_COUNTRY, "Country", true);
	pp[1] = new ProfileProperty((getState() == null ? "" : getState()),
		PROP_S_STATE, "State", true);
	pp[2] = new ProfileProperty((getCity() == null ? "" : getCity()),
		PROP_S_CITY, "City", true);
	pp[3] = new ProfileProperty(
		(getProvince() == null ? "" : getProvince()), PROP_S_PROVINCE,
		"Province", true);
	pp[4] = new ProfileProperty((getStreet() == null ? "" : getStreet()),
		PROP_S_STREET, "Street", true);

	return pp;
    }

    /**
     * @return
     */
    public static Address loadInstance() {
	return new Address();
    }
}
