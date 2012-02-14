package org.universaal.ontology.useridprofileontology.owl;

import org.universAAL.ontology.profile.SubProfile;

/**
 * @author eandgrg
 * 
 */
public class UserIDProfile extends SubProfile {
	public static final String MY_URI = UserIDProfileOntology.NAMESPACE
			+ "UserIDProfile";
	public static final String PROP_USERNAME = UserIDProfileOntology.NAMESPACE
			+ "USERNAME";
	public static final String PROP_PASSWORD = UserIDProfileOntology.NAMESPACE
			+ "PASSWORD";

	public UserIDProfile() {
		super();
	}

	public UserIDProfile(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		// TODO Implement or if for Device subclasses: remove
		return 0;
	}

	public boolean isWellFormed() {
		return true && props.containsKey(PROP_USERNAME)
				&& props.containsKey(PROP_PASSWORD);
	}

	public String getUSERNAME() {
		return (String) props.get(PROP_USERNAME);
	}

	public void setUSERNAME(String newPropValue) {
		if (newPropValue != null)
			props.put(PROP_USERNAME, newPropValue);
	}

	public String getPASSWORD() {
		return (String) props.get(PROP_PASSWORD);
	}

	public void setPASSWORD(String newPropValue) {
		if (newPropValue != null)
			props.put(PROP_PASSWORD, newPropValue);
	}
}
