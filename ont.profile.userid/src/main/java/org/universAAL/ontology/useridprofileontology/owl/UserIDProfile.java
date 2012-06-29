/*******************************************************************************
 * Copyright 2011 Ericsson Nikola Tesla d.d.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.useridprofileontology.owl;

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
