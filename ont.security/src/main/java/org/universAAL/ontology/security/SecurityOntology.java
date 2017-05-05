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
import org.universAAL.ontology.cryptographic.AsymmetricEncryption;
import org.universAAL.ontology.cryptographic.CryptographicOntology;
import org.universAAL.ontology.cryptographic.Digest;
import org.universAAL.ontology.cryptographic.KeyRing;
import org.universAAL.ontology.cryptographic.SignedResource;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.profile.ProfileOntology;
import org.universAAL.ontology.profile.SubProfile;
import org.universAAL.ontology.profile.User;
import org.universAAL.ontology.profile.UserProfile;

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
		addImport(CryptographicOntology.NAMESPACE);

//		OntClassInfoSetup oci_credentials = createNewAbstractOntClassInfo(Credentials.MY_URI);
		OntClassInfoSetup oci_credentials = createNewOntClassInfo(Credentials.MY_URI,factory,16);

		OntClassInfoSetup oci_session = createNewOntClassInfo(Session.MY_URI,factory,17);
		oci_session.addSuperClass(ManagedIndividual.MY_URI);
		
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
		
		OntClassInfoSetup oci_asset = createNewAbstractOntClassInfo(Asset.MY_URI);

		OntClassInfoSetup oci_accessType = createNewAbstractOntClassInfo(AccessType.MY_URI);

//		OntClassInfoSetup oci_anonymizable = createNewAbstractOntClassInfo(Anonymizable.MY_URI);
		OntClassInfoSetup oci_anonymizable = createNewOntClassInfo(Anonymizable.MY_URI, factory, 15);
		oci_anonymizable.addSuperClass(ManagedIndividual.MY_URI);
		oci_anonymizable.setResourceLabel("Anonymizable");
		oci_anonymizable.setResourceComment("Any anonymizable resource should be subclass of this class to enable the anonymization service to encrypt the property reference");
		oci_anonymizable.addObjectProperty(Anonymizable.PROP_ANNONYMOUS_RESOURCE).setFunctional();
		
		/*
		 * Extension of profiling ontology to automatically allow for subprofiles to be anonymizable
		 */
		OntClassInfoSetup oci_up = extendExistingOntClassInfo(UserProfile.MY_URI);
		oci_up.addSuperClass(Anonymizable.MY_URI);
		//((OntClassInfo)oci_up.getInfo()).getDeclaredProperty(UserProfile.PROP_HAS_SUB_PROFILE)
		
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
		OntClassInfoSetup oci_role = createNewOntClassInfo(Role.MY_URI, factory, 9);
		OntClassInfoSetup oci_AccessRight = createNewOntClassInfo(AccessRight.MY_URI, factory, 10);
		OntClassInfoSetup oci_authorizationService = createNewOntClassInfo(AuthorizationService.MY_URI, factory, 11);
		OntClassInfoSetup oci_delegationForm = createNewOntClassInfo(DelegationForm.MY_URI, factory,12);
		OntClassInfoSetup oci_roleMngService = createNewOntClassInfo(
				RoleManagementService.MY_URI, factory, 13);
		OntClassInfoSetup oci_anonymizationService = createNewOntClassInfo(AnonymizationService.MY_URI, factory, 14);
		

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

		oci_passwd.addObjectProperty(Password.PROP_PASSWORD_DIGEST)
				.setFunctional();
		oci_passwd.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						Password.PROP_PASSWORD_DIGEST,
						Digest.MY_URI, 0, 1));
		
		//OneTimePassword
		oci_otp.setResourceComment("A password that is valid for only one login session or transaction, on a computer system or other digital device.");
		oci_otp.setResourceLabel("One Time Password");
		oci_otp.addSuperClass(PossessionFactor.MY_URI);
		oci_otp.addSuperClass(Password.MY_URI);

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
		
		//keyring as credentials
		OntClassInfoSetup oci_keyring = extendExistingOntClassInfo(KeyRing.MY_URI);
		oci_keyring.addSuperClass(PossessionFactor.MY_URI);

		/*
		 * Authorisation
		 */
		
		//Asset
		oci_asset.addSuperClass(ManagedIndividual.MY_URI);
		oci_asset.setResourceLabel("Asset");
		oci_asset.setResourceComment("Mark a class or an instance as a security Asset to be access through the authorisation service");
		oci_asset.addObjectProperty(Asset.PROP_HAS_DEFAULT_ACCESS);
		oci_asset.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Asset.PROP_HAS_DEFAULT_ACCESS, AccessRight.MY_URI, 0, 1));
		
		//Role
		oci_role.addSuperClass(ManagedIndividual.MY_URI);
		oci_role.setResourceLabel("Role");
		oci_role.setResourceComment("Security role containing all the access rights to different Assets");
		oci_role.addObjectProperty(Role.PROP_SUB_ROLES);
		oci_role.addRestriction(MergedRestriction.getAllValuesRestriction(Role.PROP_SUB_ROLES,Role.MY_URI));
		oci_role.addObjectProperty(Role.PROP_HAS_ACCESS_RIGHTS);
		oci_role.addRestriction(MergedRestriction.getAllValuesRestriction(Role.PROP_HAS_ACCESS_RIGHTS, AccessRight.MY_URI));
		
		//Access Type
		oci_accessType.setResourceLabel("Access Type");
		oci_accessType.setResourceComment("The different Access Types, Read, Write (change or add), delete (remove).");
		oci_accessType.toEnumeration(new ManagedIndividual[]{
				AccessType.read,
				AccessType.change,
				AccessType.add,
				AccessType.remove});
		
		//Access Right
		oci_AccessRight.addSuperClass(ManagedIndividual.MY_URI);
		oci_AccessRight.setResourceLabel("Access Right");
		oci_AccessRight.setResourceComment("Access Right describes the type of access right to a specific (or generic) class (or instance) of Asset(s).");
		oci_AccessRight.addObjectProperty(AccessRight.PROP_ACCESS_TYPE);
		oci_AccessRight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AccessRight.PROP_ACCESS_TYPE, AccessType.MY_URI,1,4));
		oci_AccessRight.addObjectProperty(AccessRight.PROP_ACCESS_TO);
		//TODO PROP_ACCESS_TO should be restricted to a TypeExpression, which should be in turn relevant only to Asset type. Cardinality should be 1, 1.
		//oci_AccessRight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(AccessRight.PROP_ACCESS_TO, TypeExpression., 1, 1));
		
		/*
		 * Delegation
		 */
		oci_delegationForm.addSuperClass(SignedResource.MY_URI);
		oci_delegationForm.addSuperClass(Asset.MY_URI);
		oci_delegationForm.setResourceLabel("Delegation Form");
		oci_delegationForm.setResourceComment("Delegation Form is a SignedResource, signed by the Authoriser enabling the Delegate to perform some Competences in the form of Roles.");
		oci_delegationForm.addObjectProperty(DelegationForm.PROP_AUTHORISER);
		oci_delegationForm.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(DelegationForm.PROP_AUTHORISER, User.MY_URI, 1, 1));
		oci_delegationForm.addObjectProperty(DelegationForm.PROP_DELEGATE);
		oci_delegationForm.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(DelegationForm.PROP_DELEGATE, User.MY_URI, 1, 1));
		oci_delegationForm.addObjectProperty(DelegationForm.PROP_DELEGATED_COMPETENCES);
		oci_delegationForm.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(DelegationForm.PROP_DELEGATED_COMPETENCES, Role.MY_URI, 1, -1));
		//Default AccessRight on DelegationForm
//		AccessRight ddfar = new AccessRight(NAMESPACE+"defaultAllReadDelegationForm");
//		ddfar.addAccessType(AccessType.read);
//		TypeExpression te = new TypeURI(DelegationForm.MY_URI, false);
//		ddfar.setAccessTo(te);
//		oci_delegationForm.addRestriction(MergedRestriction.getFixedValueRestriction(Asset.PROP_HAS_DEFAULT_ACCESS, ddfar));
		
		/*
		 * Sessions
		 */
		
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
		oci_secProf.addSuperClass(Anonymizable.MY_URI);
		oci_secProf.addObjectProperty(SecuritySubprofile.PROP_CREDENTIALS);
		oci_secProf.addRestriction(MergedRestriction.getAllValuesRestriction(
				SecuritySubprofile.PROP_CREDENTIALS, Credentials.MY_URI));
		oci_secProf.addObjectProperty(SecuritySubprofile.PROP_ROLES);
		oci_secProf.addRestriction(MergedRestriction.getAllValuesRestriction(
				SecuritySubprofile.PROP_ROLES, Role.MY_URI));
		oci_secProf.addObjectProperty(SecuritySubprofile.PROP_DELEGATED_FORMS);
		oci_secProf.addRestriction(MergedRestriction.getAllValuesRestriction(
				SecuritySubprofile.PROP_DELEGATED_FORMS, DelegationForm.MY_URI));

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
				.setResourceComment("Service to Authenticate a User Given some credentials.");
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
		
		oci_roleMngService.setResourceComment("Service to Manage Roles and Access Rights within roles");
		oci_roleMngService.setResourceLabel("Role Management");
		oci_roleMngService.addSuperClass(Service.MY_URI);
		oci_roleMngService.addObjectProperty(RoleManagementService.PROP_ROLE);
		oci_roleMngService.addRestriction(MergedRestriction.getAllValuesRestriction(RoleManagementService.PROP_ROLE, Role.MY_URI));
		
		// Authorization Service
		oci_authorizationService.setResourceComment("Service to Authorise a User Given a specific acces to an Asset.");
		oci_authorizationService.setResourceLabel("Authorisation Service");
		oci_authorizationService.addSuperClass(Service.MY_URI);
		oci_authorizationService.addObjectProperty(AuthorizationService.PROP_CHALLENGER_USER);
		oci_authorizationService.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						AuthorizationService.PROP_CHALLENGER_USER,
						User.MY_URI, 0, 1));
		oci_authorizationService.addObjectProperty(AuthorizationService.PROP_ASSET_ACCESS);
		oci_authorizationService.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						AuthorizationService.PROP_ASSET_ACCESS,
						Asset.MY_URI, 1, 1));
		
		//Anonymization Service
		oci_anonymizationService.setResourceComment("Service To (de)anonymize references to objects");
		oci_anonymizationService.setResourceLabel("Anonymization Service");
		oci_anonymizationService.addSuperClass(Service.MY_URI);
		oci_anonymizationService.addObjectProperty(AnonymizationService.PROP_ANONYMIZABLE).setFunctional();
		oci_anonymizationService.addRestriction(MergedRestriction.getAllValuesRestriction(AnonymizationService.PROP_ANONYMIZABLE, Anonymizable.MY_URI));
		oci_anonymizationService.addObjectProperty(AnonymizationService.PROP_ASYMMETRIC_ENCRYPTION).setFunctional();
		oci_anonymizationService.addRestriction(MergedRestriction.getAllValuesRestriction(AnonymizationService.PROP_ASYMMETRIC_ENCRYPTION, AsymmetricEncryption.MY_URI));

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
