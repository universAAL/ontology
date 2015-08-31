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

import org.universAAL.middleware.owl.AllValuesFromRestriction;
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
	public static final String PROP_AUTHENTICATED = NAMESPACE
			+ "authenticatedTo";
	public static final String PROP_REVOKED = NAMESPACE + "deauthenticatedBy";

	public SecurityOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("The ontology defining the most general concepts dealing security.");
		r.setResourceLabel("Security");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ServiceBusOntology.NAMESPACE);
		addImport(LocationOntology.NAMESPACE);
		addImport(ProfileOntology.NAMESPACE);

		OntClassInfoSetup oci_credentials = createNewAbstractOntClassInfo(Credentials.MY_URI);
		OntClassInfoSetup oci_session = createNewAbstractOntClassInfo(Session.MY_URI);
		OntClassInfoSetup oci_Factor = createNewAbstractOntClassInfo(Factor.MY_URI);
		oci_Factor.addSuperClass(ManagedIndividual.MY_URI);
		OntClassInfoSetup oci_KnowledgeF = createNewAbstractOntClassInfo(KnowledgeFactor.MY_URI);
		oci_KnowledgeF.addSuperClass(Factor.MY_URI);
		oci_KnowledgeF
				.setResourceComment("the user is required to prove knowledge of a secret in order to authenticate, for example a password.");
		oci_KnowledgeF.setResourceLabel("Knowledge Factor");
		OntClassInfoSetup oci_PossessionF = createNewAbstractOntClassInfo(PossessionFactor.MY_URI);
		oci_PossessionF.addSuperClass(Factor.MY_URI);
		oci_PossessionF
				.setResourceComment("Possession factors ("
						+ "\"something only the user has\") have been used for authentication for " +
						"centuries, in the form of a key to a lock. The basic principle is that the " +
						"key embodies a secret which is shared between the lock and the key, and the same " +
						"principle underlies possession factor authentication in computer systems.");
		oci_PossessionF.setResourceLabel("Possession Factor");
		OntClassInfoSetup oci_InherenceF = createNewAbstractOntClassInfo(InherenceFactor.MY_URI);
		oci_InherenceF.addSuperClass(Factor.MY_URI);
		oci_InherenceF.setResourceComment("These are factors associated with the user, and are usually biometric methods," +
				" including fingerprint readers, retina scanners or voice recognition.");
		oci_InherenceF.setResourceLabel("Inherence Factor");

		OntClassInfoSetup oci_userPass = createNewOntClassInfo(
				UserPasswordCredentials.MY_URI, factory, 0);
		OntClassInfoSetup oci_devSession = createNewOntClassInfo(
				DeviceBoundSession.MY_URI, factory, 1);
		OntClassInfoSetup oci_locSession = createNewOntClassInfo(
				LocationBoundSession.MY_URI, factory, 2);
		OntClassInfoSetup oci_sessionService = createNewOntClassInfo(
				SessionManagementService.MY_URI, factory, 3);
		OntClassInfoSetup oci_authService = createNewOntClassInfo(
				AuthenticationService.MY_URI, factory, 4);
		OntClassInfoSetup oci_secProf = createNewOntClassInfo(
				SecuritySubprofile.MY_URI, factory, 5);
		OntClassInfoSetup oci_multFactorCred = createNewOntClassInfo(
				MultifactorCredentials.MY_URI, factory, 6);
		OntClassInfoSetup oci_passwd = createNewOntClassInfo(Password.MY_URI,
				factory, 7);
		OntClassInfoSetup oci_otp = createNewOntClassInfo(OneTimePassword.MY_URI,
				factory, 8);

		// Credentials
		oci_credentials.setResourceLabel("Credentials");
		oci_credentials
				.setResourceComment("The abstract concept of the required object to authenticate anyone.");
		oci_credentials.addSuperClass(ManagedIndividual.MY_URI);

		// Session
		oci_session.setResourceLabel("Session");
		oci_session
				.setResourceComment("Session indicates the validity of an authentication period and or place.");
		oci_session.addSuperClass(ManagedIndividual.MY_URI);
		oci_session.addObjectProperty(Session.PROP_BOUND_TO);
		oci_session.addInstance(Session.invalid);

		// MultiFactor Authentication
		oci_multFactorCred
				.setResourceComment("Authentication using more than one factor to achieve more confidence about the identity of the user");
		oci_multFactorCred.setResourceLabel("MultiFactorCredentials");
		oci_multFactorCred.addSuperClass(Credentials.MY_URI);

		oci_multFactorCred.addDatatypeProperty(
				MultifactorCredentials.PROP_FACTORS).setFunctional();
		oci_multFactorCred
				.addObjectProperty(MultifactorCredentials.PROP_FACTORS);
		oci_multFactorCred.addRestriction(MergedRestriction
				.getAllValuesRestriction(MultifactorCredentials.PROP_FACTORS,
						Factor.MY_URI));

		// Password
		oci_passwd
				.setResourceComment("Password factor. A password the user knows to be used in conjuntion with other factors to authenticate the user");
		oci_passwd.setResourceLabel("PasswordFactor");
		oci_passwd.addSuperClass(KnowledgeFactor.MY_URI);

		oci_passwd.addDatatypeProperty(Password.PROP_PASSWORD).setFunctional();
		oci_passwd.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(Password.PROP_PASSWORD,
						TypeMapper.getDatatypeURI(Base64Binary.class), 1, 1));

		oci_passwd.addDatatypeProperty(Password.PROP_PASSWORD_DIGEST)
				.setFunctional();
		oci_passwd.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Password.PROP_PASSWORD_DIGEST,
						TypeMapper.getDatatypeURI(String.class), 0, 1));
		
		//OneTimePassword
		oci_otp.setResourceComment("A password that is valid for only one login session or transaction, on a computer system or other digital device.");
		oci_otp.setResourceLabel("One Time Password");
		oci_passwd.addSuperClass(PossessionFactor.MY_URI);
		oci_passwd.addSuperClass(Password.MY_URI);
		
		
		// XXX Password Digest should be an ontological class?

		// UserPass
		oci_userPass.setResourceComment("Authentication by User password.");
		oci_userPass.setResourceLabel("UserPassword");
		oci_userPass.addSuperClass(Credentials.MY_URI);
		oci_userPass.addSuperClass(Password.MY_URI);
		oci_userPass.addDatatypeProperty(UserPasswordCredentials.PROP_USERNAME)
				.setFunctional();
		oci_userPass.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						UserPasswordCredentials.PROP_USERNAME,
						TypeMapper.getDatatypeURI(String.class), 1, 1));

		// DeviceBoundSession
		oci_devSession
				.setResourceComment("Session bounded to a single device.");
		oci_devSession.setResourceLabel("Device Session");
		oci_devSession.addSuperClass(Session.MY_URI);
		oci_devSession
				.addObjectProperty(DeviceBoundSession.PROP_BOUNDED_DEVICE)
				.addSuperProperty(Session.PROP_BOUND_TO);
		oci_devSession.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						DeviceBoundSession.PROP_BOUNDED_DEVICE, Device.MY_URI,
						1, 1));

		// LocationBoundSession
		oci_locSession
				.setResourceComment("Session bounded to a single location.");
		oci_locSession.setResourceLabel("Location Session");
		oci_locSession.addSuperClass(Session.MY_URI);
		oci_locSession.addObjectProperty(
				LocationBoundSession.PROP_BOUNDED_LOCATION).addSuperProperty(
				Session.PROP_BOUND_TO);
		oci_locSession.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						LocationBoundSession.PROP_BOUNDED_LOCATION,
						AbsLocation.MY_URI, 1, 1));

		// SecurityProfile
		oci_secProf
				.setResourceComment("Profile storing credentials, Roles, AcessRights and any security concept for a given profilable.");
		oci_secProf.setResourceLabel("Security Profile");
		oci_secProf.addSuperClass(SubProfile.MY_URI);
		oci_secProf.addObjectProperty(SecuritySubprofile.PROP_CREDENTIALS);
		oci_secProf.addRestriction(MergedRestriction.getAllValuesRestriction(
				SecuritySubprofile.PROP_CREDENTIALS, Credentials.MY_URI));

		/*
		 * Extensions provided
		 */
		// for user
		OntClassInfoSetup oci_user = extendExistingOntClassInfo(User.MY_URI);
		// USER.hasSession property
		oci_user.addObjectProperty(PROP_SESSION);
		oci_user.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(PROP_SESSION,
						Session.MY_URI, 0, 1));
		// USER.authenticatedTo
		oci_user.addObjectProperty(PROP_AUTHENTICATED);
		oci_user.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(PROP_AUTHENTICATED,
						Device.MY_URI, 0, 1));
		// USER.deauthenticatedby
		oci_user.addObjectProperty(PROP_REVOKED);
		oci_user.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(PROP_REVOKED,
						Device.MY_URI, 0, 1));

		/*
		 * Services
		 */
		// Authentication Service
		oci_authService
				.setResourceComment("Service to Athenticate a User Given some credentials.");
		oci_authService.setResourceLabel("Authentication Service");
		oci_authService.addSuperClass(Service.MY_URI);
		oci_authService
				.addObjectProperty(AuthenticationService.PROP_GIVEN_CREDENTIALS);
		oci_authService.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						AuthenticationService.PROP_GIVEN_CREDENTIALS,
						Credentials.MY_URI, 1, 1));
		oci_authService
				.addObjectProperty(AuthenticationService.PROP_AUTHENTICATED_USER);
		oci_authService.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						AuthenticationService.PROP_AUTHENTICATED_USER,
						User.MY_URI, 0, 1));

		// Session Service
		oci_sessionService
				.setResourceComment("Service to check the validity of sessions, or available sessions.");
		oci_sessionService.setResourceLabel("Session Service");
		oci_sessionService.addSuperClass(Service.MY_URI);
		oci_sessionService
				.addObjectProperty(SessionManagementService.PROP_USER);
		oci_sessionService.addRestriction(MergedRestriction
				.getAllValuesRestriction(SessionManagementService.PROP_USER,
						User.MY_URI));
		// add restrinction on ppath {SessionManagementService.PROP_USER,
		// User.PROP_HAS_SESSION}
		MergedRestriction res = new MergedRestriction(
				SessionManagementService.PROP_USER);
		res.addRestriction(new AllValuesFromRestriction(
				SessionManagementService.PROP_USER,
				new AllValuesFromRestriction(PROP_SESSION, Session.MY_URI)));
	}
}
