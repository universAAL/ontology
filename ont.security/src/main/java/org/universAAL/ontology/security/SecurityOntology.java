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
package org.universAAL.ontology.security;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.supply.AbsLocation;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.xsd.Base64Binary;
import org.universAAL.ontology.SecurityFactory;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.profile.ProfileOntology;
import org.universAAL.ontology.profile.SubProfile;
import org.universAAL.ontology.profile.User;

/**
 * @author eandgrg
 * 
 */
public final class SecurityOntology extends Ontology {

    private static SecurityFactory factory = new SecurityFactory();
    public static final String NAMESPACE = "http://ontology.universAAL.org/Security.owl#";

    public static final String PROP_SESSION = NAMESPACE + "hasSession";
    public static final String PROP_AUTHENTICATED = NAMESPACE + "authenticatedTo";
    public static final String PROP_REVOKED = NAMESPACE + "deauthenticatedBy";
    

    public SecurityOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("The ontology defining the most general concepts dealing security.");
	r.setResourceLabel("Security");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);
	addImport(ProfileOntology.NAMESPACE);

	OntClassInfoSetup oci_credentials = createNewAbstractOntClassInfo(Credentials.MY_URI);
	OntClassInfoSetup oci_session = createNewAbstractOntClassInfo(Session.MY_URI);
	
	OntClassInfoSetup oci_userPass = createNewOntClassInfo(UserPasswordCredentials.MY_URI, factory, 0);
	OntClassInfoSetup oci_devSession = createNewOntClassInfo(DeviceBoundSession.MY_URI, factory, 1);
	OntClassInfoSetup oci_locSession = createNewOntClassInfo(LocationBoundSession.MY_URI, factory, 2);
	OntClassInfoSetup oci_sessionService = createNewOntClassInfo(SessionManagementService.MY_URI, factory, 3);
	OntClassInfoSetup oci_authService = createNewOntClassInfo(AuthenticationService.MY_URI, factory, 4);	
	OntClassInfoSetup oci_secProf = createNewOntClassInfo(SecuritySubprofile.MY_URI, factory, 5);	
	
	// Credentials
	oci_credentials.setResourceLabel("Credentials");
	oci_credentials.setResourceComment("The abstract concept of the required object to authenticate anyone.");
	oci_credentials.addSuperClass(ManagedIndividual.MY_URI);
	
	// Sesssion
	oci_session.setResourceLabel("Session");
	oci_session.setResourceComment("Session indicates the validity of an authentication period and or place.");
	oci_session.addSuperClass(ManagedIndividual.MY_URI);
	oci_session.addObjectProperty(Session.PROP_BOUND_TO);
	oci_session.addInstance(Session.invalid);

	// UserPass
	oci_userPass.setResourceComment("Authentication by User password.");
	oci_userPass.setResourceLabel("UserPassword");
	oci_userPass.addSuperClass(Credentials.MY_URI);
	oci_userPass.addDatatypeProperty(UserPasswordCredentials.PROP_USERNAME).setFunctional();
	oci_userPass.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserPasswordCredentials.PROP_USERNAME, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

	oci_userPass.addDatatypeProperty(UserPasswordCredentials.PROP_PASSWORD).setFunctional();
	oci_userPass.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserPasswordCredentials.PROP_PASSWORD, TypeMapper
				.getDatatypeURI(Base64Binary.class), 1, 1));
	
	oci_userPass.addDatatypeProperty(UserPasswordCredentials.PROP_PASSWORD_DIGEST).setFunctional();
	oci_userPass.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserPasswordCredentials.PROP_PASSWORD_DIGEST, TypeMapper
				.getDatatypeURI(String.class), 0, 1));
	//XXX Password Digest should be an ontological class?
	
	// DeviceBoundSession
	oci_devSession.setResourceComment("Session bounded to a single device.");
	oci_devSession.setResourceLabel("Device Session");
	oci_devSession.addSuperClass(Session.MY_URI);
	oci_devSession.addObjectProperty(DeviceBoundSession.PROP_BOUNDED_DEVICE).addSuperProperty(Session.PROP_BOUND_TO);
	oci_devSession.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(DeviceBoundSession.PROP_BOUNDED_DEVICE, Device.MY_URI, 1, 1));
	
	// LocationBoundSession
	oci_locSession.setResourceComment("Session bounded to a single location.");
	oci_locSession.setResourceLabel("Location Session");
	oci_locSession.addSuperClass(Session.MY_URI);
	oci_locSession.addObjectProperty(LocationBoundSession.PROP_BOUNDED_LOCATION).addSuperProperty(Session.PROP_BOUND_TO);
	oci_locSession.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(LocationBoundSession.PROP_BOUNDED_LOCATION, AbsLocation.MY_URI, 1, 1));

	// SecurityProfile
	oci_secProf.setResourceComment("Profile storing credentials, Roles, AcessRights and any security concept for a given profilable.");
	oci_secProf.setResourceLabel("Security Profile");
	oci_secProf.addSuperClass(SubProfile.MY_URI);
	oci_secProf.addObjectProperty(SecuritySubprofile.PROP_CREDENTIALS);
	oci_secProf.addRestriction(MergedRestriction.getAllValuesRestriction(SecuritySubprofile.PROP_CREDENTIALS, Credentials.MY_URI));

	
	/*
	 * Extensions provided
	 */
	// for user
	OntClassInfoSetup oci_user = extendExistingOntClassInfo(User.MY_URI);
	// USER.hasSession property
	oci_user.addObjectProperty(PROP_SESSION);
	oci_user.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PROP_SESSION, Session.MY_URI, 0, 1));
	//USER.authenticatedTo
	oci_user.addObjectProperty(PROP_AUTHENTICATED);
	oci_user.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PROP_AUTHENTICATED, Device.MY_URI, 0, 1));
	//USER.deauthenticatedby
	oci_user.addObjectProperty(PROP_REVOKED);
	oci_user.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(PROP_REVOKED, Device.MY_URI, 0, 1));
	
	
	/*
	 * Services
	 */
	//Authentication Service
	oci_authService.setResourceComment("Service to Athenticate a User Given some credentials.");
	oci_authService.setResourceLabel("Authentication Service");
	oci_authService.addSuperClass(Service.MY_URI);
	oci_authService.addObjectProperty(AuthenticationService.PROP_GIVEN_CREDENTIALS);
	oci_authService.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AuthenticationService.PROP_GIVEN_CREDENTIALS, Credentials.MY_URI, 1, 1));
	oci_authService.addObjectProperty(AuthenticationService.PROP_AUTHENTICATED_USER);
	oci_authService.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AuthenticationService.PROP_AUTHENTICATED_USER, User.MY_URI, 0, 1));
	
	//Session Service
	oci_sessionService.setResourceComment("Service to check the validity of sessions, or available sessions.");
	oci_sessionService.setResourceLabel("Session Service");
	oci_sessionService.addSuperClass(Service.MY_URI);
	oci_sessionService.addObjectProperty(SessionManagementService.PROP_VALIDATES);
	oci_sessionService.addRestriction(MergedRestriction.getAllValuesRestriction(SessionManagementService.PROP_VALIDATES, Session.MY_URI));
    }
}
