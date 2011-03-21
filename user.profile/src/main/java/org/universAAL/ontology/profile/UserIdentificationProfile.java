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

public class UserIdentificationProfile extends ManagedIndividual implements
	PropertyPublisher {
    public static final String PROFILING_NAMESPACE = "http://ontology.persona.anco.gr/UserIdentificationProfile.owl#";
    public static final String MY_URI;
    // static properties
    public static final String PROP_S_USER_ID;
    public static final String PROP_S_NAME;
    public static final String PROP_S_SURNAME;
    public static final String PROP_S_AGE;
    public static final String PROP_S_EMAIL;
    public static final String PROP_S_HOME_TELEPHONE;
    public static final String PROP_S_OFFICE_TELEPHONE;
    public static final String PROP_S_MOBILE_TELEPHONE;
    public static final String PROP_S_GENDER;
    public static final String PROP_S_NATIONALITY;
    public static final String PROP_S_PREFERRED_LANGUAGE;
    public static final String PROP_S_USER_ROLE_ID;
    public static final String PROP_S_USER_ROLE;
    public static final String PROP_S_ADDRESS;

    public static final String PROP_D_USER_IP;

    static {
	MY_URI = PROFILING_NAMESPACE + "UserIdentificationProfile";
	// static properties
	PROP_S_AGE = PROFILING_NAMESPACE + "age";
	PROP_S_EMAIL = PROFILING_NAMESPACE + "email";
	PROP_S_HOME_TELEPHONE = PROFILING_NAMESPACE + "homeTelephone";
	PROP_S_MOBILE_TELEPHONE = PROFILING_NAMESPACE + "mobileTelephone";
	PROP_S_NAME = PROFILING_NAMESPACE + "name";
	PROP_S_NATIONALITY = PROFILING_NAMESPACE + "nationality";
	PROP_D_USER_IP = PROFILING_NAMESPACE + "userIP";
	PROP_S_OFFICE_TELEPHONE = PROFILING_NAMESPACE + "officeTelephone";
	PROP_S_PREFERRED_LANGUAGE = PROFILING_NAMESPACE + "preferredLanguage";
	PROP_S_GENDER = PROFILING_NAMESPACE + "sex";
	PROP_S_SURNAME = PROFILING_NAMESPACE + "surname";
	PROP_S_USER_ID = PROFILING_NAMESPACE + "userID";
	PROP_S_USER_ROLE_ID = PROFILING_NAMESPACE + "userRoleID";
	PROP_S_USER_ROLE = PROFILING_NAMESPACE + "userRole";
	PROP_S_ADDRESS = PROFILING_NAMESPACE + "address";

	register(UserIdentificationProfile.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (propURI == null)
	    return null;
	// Should we use Cardinality(MAX,MIN)= (1,1) for the required
	// single-value properties such as a compulsory field in a XFORM and
	// (1,0) for optional?
	// or Semantically the property must exist so Cardinality(MAX,MIN) =
	// (1,1) and the property may be just null value in reality
	if (PROP_S_EMAIL.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_HOME_TELEPHONE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_MOBILE_TELEPHONE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_NAME.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_NATIONALITY.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_D_USER_IP.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_OFFICE_TELEPHONE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_SURNAME.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_PREFERRED_LANGUAGE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(String.class), 1, 1);
	if (PROP_S_AGE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_S_USER_ID.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_S_USER_ROLE_ID.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Integer.class), 1, 1);
	if (PROP_S_USER_ROLE.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(UserRole.class), 1, 1);
	if (PROP_S_GENDER.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    TypeMapper.getDatatypeURI(Sex.class), 1, 1);
	if (PROP_S_ADDRESS.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    Address.MY_URI, 1, 1);
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_S_USER_ROLE_ID.equals(propURI) && o instanceof Integer)
	    setUserRoleID((Integer) o);
	else if (PROP_S_AGE.equals(propURI) && o instanceof Integer)
	    setAge((Integer) o);
	else if (PROP_S_USER_ID.equals(propURI) && o instanceof Integer)
	    setUserID((Integer) o);
	else if (PROP_S_EMAIL.equals(propURI) && o instanceof String)
	    setEmail((String) o);
	else if (PROP_S_HOME_TELEPHONE.equals(propURI) && o instanceof String)
	    setHomeTelephone((String) o);
	else if (PROP_S_MOBILE_TELEPHONE.equals(propURI) && o instanceof String)
	    setMobileTelephone((String) o);
	else if (PROP_S_NAME.equals(propURI) && o instanceof String)
	    setName((String) o);
	else if (PROP_S_NATIONALITY.equals(propURI) && o instanceof String)
	    setNationality((String) o);
	else if (PROP_D_USER_IP.equals(propURI) && o instanceof String)
	    setUserIP((String) o);
	else if (PROP_S_OFFICE_TELEPHONE.equals(propURI) && o instanceof String)
	    setOfficeTelephone((String) o);
	else if (PROP_S_SURNAME.equals(propURI) && o instanceof String)
	    setSurname((String) o);
	else if (PROP_S_PREFERRED_LANGUAGE.equals(propURI)
		&& o instanceof String)
	    setPreferredLanuage((String) o);
	else if (PROP_S_USER_ROLE.equals(propURI) && o instanceof UserRole)
	    setUserRole((UserRole) o);
	else if (PROP_S_GENDER.equals(propURI) && o instanceof Sex)
	    setGender((Sex) o);

    }

    public static String[] getStandardPropertyURIs() {
	return new String[] { PROP_S_AGE, PROP_S_EMAIL, PROP_S_HOME_TELEPHONE,
		PROP_S_MOBILE_TELEPHONE, PROP_S_NAME, PROP_S_NATIONALITY,
		PROP_D_USER_IP, PROP_S_OFFICE_TELEPHONE,
		PROP_S_PREFERRED_LANGUAGE, PROP_S_GENDER, PROP_S_SURNAME,
		PROP_S_USER_ID, PROP_S_USER_ROLE_ID, PROP_S_USER_ROLE,
		PROP_S_ADDRESS };
    }

    public static String RDFSComment() {
	return "The class of the User Identification Profile";
    }

    public static String getRDFSLabel() {
	return "User Identification Profile";
    }

    public UserIdentificationProfile() {
	super();
    }

    public UserIdentificationProfile(String uri) {
	super(uri);
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true;
    }

    // getMethods
    public Integer getAge() {
	Object i = props.get(PROP_S_AGE);
	if (i instanceof Integer)
	    return (Integer) i;
	return new Integer(-1);
	// return ((Integer) i).intValue();
	// return -1;
    }

    public String getEmail() {
	return (String) props.get(PROP_S_EMAIL);
    }

    public String getHomeTelephone() {
	Object o = props.get(PROP_S_HOME_TELEPHONE);
	return (o == null) ? "" : (String) o;
    }

    public String getMobileTelephone() {
	Object o = props.get(PROP_S_MOBILE_TELEPHONE);
	return (o == null) ? "" : (String) o;
    }

    public String getName() {
	Object o = props.get(PROP_S_NAME);
	return (o == null) ? "" : (String) o;
    }

    public String getNationality() {
	Object o = props.get(PROP_S_NATIONALITY);
	return (o == null) ? "" : (String) o;
    }

    public String getUserIP() {
	Object o = props.get(PROP_D_USER_IP);
	return (o == null) ? "" : (String) o;
    }

    public String getOfficeTelephone() {
	Object o = props.get(PROP_S_OFFICE_TELEPHONE);
	return (o == null) ? "" : (String) o;
    }

    public String getPreferredLanguage() {
	Object o = props.get(PROP_S_PREFERRED_LANGUAGE);
	return (o == null) ? "" : (String) o;
    }

    public Sex getGender() {
	Object o = props.get(PROP_S_GENDER);
	return (o == null) ? null : (Sex) o;
    }

    public String getSurname() {
	Object o = props.get(PROP_S_SURNAME);
	return (o == null) ? "" : (String) o;
    }

    public Integer getUserID() {
	Object i = props.get(PROP_S_USER_ID);
	if (i instanceof Integer)
	    return (Integer) i;
	return new Integer(-1);
	// return ((Integer) i).intValue();
	// return -1;
    }

    public Integer getUserRoleID() {
	Object i = props.get(PROP_S_USER_ROLE_ID);
	if (i instanceof Integer)
	    return (Integer) i;
	return new Integer(-1);
	// return ((Integer) i).intValue();
	// return -1;
    }

    public UserRole getUserRole() {
	Object o = props.get(PROP_S_USER_ROLE);
	return (o == null) ? null : (UserRole) o;
    }

    public Address getAddress() {
	Object o = props.get(PROP_S_ADDRESS);
	return (o == null) ? null : (Address) o;
    }

    // set Methods
    public void setAddress(Address address) {
	if (address != null)
	    props.put(PROP_S_ADDRESS, address);
    }

    public void setAge(Integer age) {
	props.put(PROP_S_AGE, age);
    }

    public void setEmail(String email) {
	if (email != null)
	    props.put(PROP_S_EMAIL, email);
    }

    public void setHomeTelephone(String homeTelephone) {
	if (homeTelephone != null)
	    props.put(PROP_S_HOME_TELEPHONE, homeTelephone);
    }

    public void setMobileTelephone(String mobileTelephone) {
	if (mobileTelephone != null)
	    props.put(PROP_S_MOBILE_TELEPHONE, mobileTelephone);
    }

    public void setName(String name) {
	if (name != null)
	    props.put(PROP_S_NAME, name);
    }

    public void setNationality(String nationality) {
	if (nationality != null)
	    props.put(PROP_S_NATIONALITY, nationality);
    }

    public void setUserIP(String userIP) {
	if (userIP != null)
	    props.put(PROP_D_USER_IP, userIP);
    }

    public void setOfficeTelephone(String officeTelephone) {
	if (officeTelephone != null)
	    props.put(PROP_S_OFFICE_TELEPHONE, officeTelephone);
    }

    public void setPreferredLanuage(String preferredLanguage) {
	if (preferredLanguage != null)
	    props.put(PROP_S_PREFERRED_LANGUAGE, preferredLanguage);
    }

    public void setGender(Sex gender) {
	if (gender != null)
	    props.put(PROP_S_GENDER, gender);
    }

    public void setSurname(String surname) {
	if (surname != null)
	    props.put(PROP_S_SURNAME, surname);
    }

    public void setUserID(Integer userID) {
	props.put(PROP_S_USER_ID, userID);
    }

    public void setUserRoleID(Integer userRoleID) {
	props.put(PROP_S_USER_ROLE_ID, userRoleID);
    }

    public void setUserRole(UserRole userRole) {
	if (userRole != null)
	    props.put(PROP_S_USER_ROLE, userRole);
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
	ProfileProperty[] propArray = new ProfileProperty[1];
	propArray[0] = new ProfileProperty(((getUserIP() == null) ? ""
		: getUserIP()), PROP_D_USER_IP, "User IP Address", false);

	return propArray;
    }

    public ProfileProperty[] getStaticProperties() {
	ProfileProperty[] propArray = new ProfileProperty[13];
	propArray[0] = new ProfileProperty(getUserID(), PROP_S_USER_ID,
		"User ID", true);
	propArray[1] = new ProfileProperty(((getName() == null) ? ""
		: getName()), PROP_S_NAME, "Name", true);
	propArray[2] = new ProfileProperty(((getSurname() == null) ? ""
		: getSurname()), PROP_S_SURNAME, "Surname", true);
	propArray[3] = new ProfileProperty(getAge(), PROP_S_AGE, "Age", true);
	propArray[4] = new ProfileProperty(((getEmail() == null) ? ""
		: getEmail()), PROP_S_EMAIL, "E-mail", true);
	propArray[5] = new ProfileProperty(((getHomeTelephone() == null) ? ""
		: getHomeTelephone()), PROP_S_HOME_TELEPHONE, "Home telephone",
		true);
	propArray[6] = new ProfileProperty(((getOfficeTelephone() == null) ? ""
		: getOfficeTelephone()), PROP_S_OFFICE_TELEPHONE,
		"Office telephone", true);
	propArray[7] = new ProfileProperty(((getMobileTelephone() == null) ? ""
		: getMobileTelephone()), PROP_S_MOBILE_TELEPHONE,
		"Mobile telephone", true);
	// propArray[8] = new ProfileProperty(
	// ((getGender() == null) ? Sex.getGenderByOrder(0) : getGender()),
	// PROP_S_GENDER, "Gneder", true);
	propArray[8] = new ProfileProperty(Sex.female, PROP_S_GENDER, "Gender",
		true);
	propArray[9] = new ProfileProperty(((getNationality() == null) ? ""
		: getNationality()), PROP_S_NATIONALITY, "Nationality", true);
	propArray[10] = new ProfileProperty(
		((getPreferredLanguage() == null) ? "" : getPreferredLanguage()),
		PROP_S_PREFERRED_LANGUAGE, "Preferred language", true);
	propArray[11] = new ProfileProperty(getUserRoleID(),
		PROP_S_USER_ROLE_ID, "User role ID", true);
	propArray[12] = new ProfileProperty(((getUserRole() == null) ? UserRole
		.getUserRoleByOrder(0) : getUserRole()), PROP_S_USER_ROLE,
		"User role", true);

	return propArray;
    }

    /**
     * @return
     */
    public static UserIdentificationProfile loadInstance() {
	UserIdentificationProfile uiProfile = new UserIdentificationProfile();
	uiProfile.setAddress(Address.loadInstance());
	return uiProfile;
    }
}
