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


public class UserRole extends ManagedIndividual implements PropertyPublisher {
	public static final String MY_URI;
	static {
		MY_URI = UserIdentificationProfile.PROFILING_NAMESPACE + "UserRole";
		register(UserRole.class);
	}
	// for example ... are these roles enumeration defined?
	public static final int ELDERLYUSER = 0;

	private static final String[] names = { "elderlyuser" };
	public static final UserRole elderlyuser = new UserRole(ELDERLYUSER);

	public static ManagedIndividual[] getEnumerationMembers() {
		return new ManagedIndividual[] { elderlyuser };
	}

	public static ManagedIndividual getIndividualByURI(String instanceURI) {
		return (instanceURI != null && instanceURI
				.startsWith(UserIdentificationProfile.PROFILING_NAMESPACE)) ? valueOf(instanceURI
				.substring(UserIdentificationProfile.PROFILING_NAMESPACE.length())) : null;
	}

	public static UserRole getUserRoleByOrder(int order) {
		switch (order) {
		case ELDERLYUSER:
			return elderlyuser;
		default:
			return null;
		}
	}

	public static String getRDFSComment() {
		return "The enum of user roles.";
	}

	public static String getRDFSLabel() {
		return "User Roles";
	}

	public static final UserRole valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(UserIdentificationProfile.PROFILING_NAMESPACE))
			name = name.substring(UserIdentificationProfile.PROFILING_NAMESPACE.length());

		for (int i = ELDERLYUSER; i <= ELDERLYUSER; i++)
			if (names[i].equals(name))
				return getUserRoleByOrder(i);

		return null;
	}

	private int order;

	private UserRole(int order) {
		super(UserIdentificationProfile.PROFILING_NAMESPACE + names[order]);
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