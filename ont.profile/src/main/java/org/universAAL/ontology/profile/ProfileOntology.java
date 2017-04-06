/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	Copyright 2008-2014 Forschungszentrum Informatik FZI, http://www.fzi.de
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
	
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

import javax.xml.datatype.XMLGregorianCalendar;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.owl.PrivateResource;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.ProfileFactory;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.location.Place;
import org.universAAL.ontology.location.outdoor.City;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.phThing.PhysicalThing;
import org.universAAL.ontology.profile.service.ProfilingEditorService;
import org.universAAL.ontology.profile.service.ProfilingService;
import org.universAAL.ontology.vcard.*;

/**
 * The Ontology for Profiling.
 * 
 * @author Carsten Stockloew
 * @author Alvaro Fides
 */

public final class ProfileOntology extends Ontology {

    private static ProfileFactory factory = new ProfileFactory();

    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX
	    + "Profile.owl#";

    public static final int PROP = 0;
    public static final int REQ = 1;
    public static final int HWSUBPROF = 2;
    public static final int USER = 3;
    public static final int HRSUBPROF = 4;
    public static final int CONNDETAILS = 5;
    public static final int ONTENTRY = 6;
    public static final int AALAPPSUBPROF = 7;
    public static final int AALSERVPROF = 8;
    public static final int PERSONINFOSUBPROF = 9;
    public static final int AALSERV = 10;
    public static final int AALSPACEPROF = 11;
    public static final int USERPROF = 12;
    public static final int APPROF = 13;
    public static final int CAREPROF = 14;
    public static final int AALSPACE = 15;
    public static final int AP = 16;
    public static final int CARE = 17;
    public static final int PROFSERV = 18;
    public static final int PROFEDITSERV = 19;

    public ProfileOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("The upper ontology defining the concepts representing"
			+ " the users of the system, the physical components of it,"
			+ " and their characteristics as profiles.");
	r.setResourceLabel("Profile");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);
	addImport(VCardOntology.NAMESPACE);

	OntClassInfoSetup oci;

	oci = extendExistingOntClassInfo(PhysicalThing.MY_URI);
	oci = extendExistingOntClassInfo(Place.MY_URI);
	oci = extendExistingOntClassInfo(ManagedIndividual.MY_URI);

	// Property
	oci = createNewOntClassInfo(Property.MY_URI, factory, PROP);
	oci
		.setResourceComment("A value-property pair for AAL Service Resources (Human, HW and App");
	oci.setResourceLabel("Property");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(Property.PROP_PROPERTY_NAME).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Property.PROP_PROPERTY_NAME, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(Property.PROP_PROPERTY_VALUE);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Property.PROP_PROPERTY_VALUE, TypeMapper
			.getDatatypeURI(String.class)));

	// Requirement
	oci = createNewOntClassInfo(Requirement.MY_URI, factory, REQ);
	oci
		.setResourceComment("A Hardware or Software requirement for an AAL Application");
	oci.setResourceLabel("Requirement");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(Requirement.PROP_ALL_VALUES_MATCH)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Requirement.PROP_ALL_VALUES_MATCH, TypeMapper
			.getDatatypeURI(Boolean.class)));
	oci.addDatatypeProperty(Requirement.PROP_FRAGMENT).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Requirement.PROP_FRAGMENT, TypeMapper
			.getDatatypeURI(Boolean.class)));
	oci.addDatatypeProperty(Requirement.PROP_INCOMPATIBLE).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Requirement.PROP_INCOMPATIBLE, TypeMapper
			.getDatatypeURI(Boolean.class)));
	oci.addDatatypeProperty(Requirement.PROP_MULTIPLE_SOLUTIONS_USEFUL)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Requirement.PROP_MULTIPLE_SOLUTIONS_USEFUL, TypeMapper
			.getDatatypeURI(Boolean.class)));
	oci.addDatatypeProperty(Requirement.PROP_OPTIONAL).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Requirement.PROP_OPTIONAL, TypeMapper
			.getDatatypeURI(Boolean.class)));
	oci.addDatatypeProperty(Requirement.PROP_REQ_NAME).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Requirement.PROP_REQ_NAME, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(Requirement.PROP_REQ_VALUES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Requirement.PROP_REQ_VALUES, TypeMapper
			.getDatatypeURI(String.class)));

	// SubProfile
	oci = createNewAbstractOntClassInfo(SubProfile.MY_URI);
	oci
		.setResourceComment("A SubProfile, for setting additional characteristics");
	oci.setResourceLabel("Sub Profile");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addSuperClass(PrivateResource.MY_URI);

	// HWSubProfile
	oci = createNewOntClassInfo(HWSubProfile.MY_URI, factory, HWSUBPROF);
	oci.setResourceComment("Profile representing any Hardware Resource");
	oci.setResourceLabel("Hardware Resource Profile");
	oci.addSuperClass(SubProfile.MY_URI);
	oci.addDatatypeProperty(HWSubProfile.PROP_HW_CATEGORY).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HWSubProfile.PROP_HW_CATEGORY, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HWSubProfile.PROP_HW_DESCRIPTION)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HWSubProfile.PROP_HW_DESCRIPTION, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HWSubProfile.PROP_HW_IDENTIFIER)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HWSubProfile.PROP_HW_IDENTIFIER, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HWSubProfile.PROP_HW_MANUFACTURER)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HWSubProfile.PROP_HW_MANUFACTURER, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HWSubProfile.PROP_HW_NAME).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HWSubProfile.PROP_HW_NAME, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HWSubProfile.PROP_HW_PICTURE_URL);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HWSubProfile.PROP_HW_PICTURE_URL, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addObjectProperty(HWSubProfile.PROP_HW_PROPERTIES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HWSubProfile.PROP_HW_PROPERTIES, Property.MY_URI));
	oci.addObjectProperty(HWSubProfile.PROP_HW_RELATED_DEVICES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HWSubProfile.PROP_HW_RELATED_DEVICES, Device.MY_URI));

	// Profile
	oci = createNewAbstractOntClassInfo(Profile.MY_URI);
	oci.setResourceComment("A Profile, for setting characteristics");
	oci.setResourceLabel("Profile");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addSuperClass(PrivateResource.MY_URI);
	oci.addObjectProperty(Profile.PROP_HAS_SUB_PROFILE).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Profile.PROP_HAS_SUB_PROFILE, SubProfile.MY_URI));

	// Gender
	oci = createNewAbstractOntClassInfo(Gender.MY_URI);
	oci
		.setResourceComment("Enumeration of Gender options for Personal Information Subprofile");
	oci.setResourceLabel("Gender");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.toEnumeration(new ManagedIndividual[] { Gender.male, Gender.female,
		Gender.partly_female_male, Gender.do_not_specify });

	// Personal Information Subprofile
	oci = createNewOntClassInfo(PersonalInformationSubprofile.MY_URI,
		factory, PERSONINFOSUBPROF);
	oci
		.setResourceComment("Personal information subprofile as described (mainly) in ETSI ES 202 746 and 642");
	oci.setResourceLabel("Personal Information Subprofile");
	oci.addSuperClass(SubProfile.MY_URI);
	oci.addDatatypeProperty(PersonalInformationSubprofile.PROP_VCARD_VERSION)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PersonalInformationSubprofile.PROP_VCARD_VERSION,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(PersonalInformationSubprofile.PROP_LAST_REVISION)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PersonalInformationSubprofile.PROP_LAST_REVISION,
			TypeMapper.getDatatypeURI(XMLGregorianCalendar.class),
			1, 1));
	oci.addDatatypeProperty(PersonalInformationSubprofile.PROP_NICKNAME)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PersonalInformationSubprofile.PROP_NICKNAME, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(PersonalInformationSubprofile.PROP_DISPLAY_NAME);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		PersonalInformationSubprofile.PROP_DISPLAY_NAME, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(PersonalInformationSubprofile.PROP_UCI_LABEL)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PersonalInformationSubprofile.PROP_UCI_LABEL,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(PersonalInformationSubprofile.PROP_UCI_ADDITIONAL_DATA);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		PersonalInformationSubprofile.PROP_UCI_ADDITIONAL_DATA,
		TypeMapper.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(PersonalInformationSubprofile.PROP_ABOUT_ME);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		PersonalInformationSubprofile.PROP_ABOUT_ME, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addObjectProperty(PersonalInformationSubprofile.PROP_BIRTHPLACE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PersonalInformationSubprofile.PROP_BIRTHPLACE,
			City.MY_URI, 1, 1));
	oci.addObjectProperty(PersonalInformationSubprofile.PROP_GENDER)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PersonalInformationSubprofile.PROP_GENDER,
			Gender.MY_URI, 1, 1));
	oci.addDatatypeProperty(VCard.PROP_BDAY).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(VCard.PROP_BDAY,
			TypeMapper.getDatatypeURI(XMLGregorianCalendar.class),
			1, 1));
	oci.addObjectProperty(VCard.PROP_EMAIL);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		VCard.PROP_EMAIL, Email.MY_URI));
	oci.addDatatypeProperty(VCard.PROP_FN).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(VCard.PROP_FN,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addObjectProperty(VCard.PROP_N).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(VCard.PROP_N,
			Name.MY_URI, 1, 1));
	oci.addObjectProperty(VCard.PROP_ORG);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		VCard.PROP_ORG, Organization.MY_URI));
	oci.addObjectProperty(VCard.PROP_PHOTO);
	oci.addObjectProperty(VCard.PROP_TEL);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		VCard.PROP_TEL, Tel.MY_URI));
	oci.addObjectProperty(VCard.PROP_URL);

	// UserProfile
	oci = createNewOntClassInfo(UserProfile.MY_URI, factory, USERPROF);
	oci.setResourceComment("Profile of a user");
	oci.setResourceLabel("User Profile");
	oci.addSuperClass(Profile.MY_URI);
	oci.addObjectProperty(UserProfile.PROP_HAS_PERSONAL_INFO_SUBPROFILE)
		.addSuperProperty(Profile.PROP_HAS_SUB_PROFILE);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserProfile.PROP_HAS_PERSONAL_INFO_SUBPROFILE,
			PersonalInformationSubprofile.MY_URI, 0, 1));

	// Profilable
	oci = createNewAbstractOntClassInfo(Profilable.MY_URI);
	oci.setResourceComment("Identifies concepts that can have profiles");
	oci.setResourceLabel("Profilable");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addSuperClass(PrivateResource.MY_URI);
	oci.addObjectProperty(Profilable.PROP_HAS_PROFILE);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		Profilable.PROP_HAS_PROFILE, Profile.MY_URI));

	// User
	oci = createNewOntClassInfo(User.MY_URI, factory, USER);
	oci.setResourceComment("A human user");
	oci.setResourceLabel("User");
	oci.addSuperClass(PhysicalThing.MY_URI);
	oci.addSuperClass(Profilable.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Profilable.PROP_HAS_PROFILE, UserProfile.MY_URI, 0, 1));

	// HRSubProfile
	oci = createNewOntClassInfo(HRSubProfile.MY_URI, factory, HRSUBPROF);
	oci.setResourceComment("Profile representing any Human Resource");
	oci.setResourceLabel("Human Resource Profile");
	oci.addSuperClass(SubProfile.MY_URI);
	oci.addDatatypeProperty(HRSubProfile.PROP_HR_CONTACT).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_CONTACT, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HRSubProfile.PROP_HR_DESCRIPTION)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_DESCRIPTION, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HRSubProfile.PROP_HR_EXPERIENCE)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_EXPERIENCE, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HRSubProfile.PROP_HR_INVOLVEMENT)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_INVOLVEMENT, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HRSubProfile.PROP_HR_QUALIFICATION)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_QUALIFICATION, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HRSubProfile.PROP_HR_TYPE).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_TYPE, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HRSubProfile.PROP_HR_CERTIFICATES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_CERTIFICATES, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HRSubProfile.PROP_HR_PAYMENT_INFO);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_PAYMENT_INFO, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HRSubProfile.PROP_HR_PROVIDER_USER_ID);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_PROVIDER_USER_ID, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(HRSubProfile.PROP_HR_SLA);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_SLA, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addObjectProperty(HRSubProfile.PROP_HR_PROPERTIES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_PROPERTIES, Property.MY_URI));
	oci.addObjectProperty(HRSubProfile.PROP_HR_RELATED_USERS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HRSubProfile.PROP_HR_RELATED_USERS, User.MY_URI));

	// ConnectionDetails
	oci = createNewOntClassInfo(ConnectionDetails.MY_URI, factory,
		CONNDETAILS);
	oci.setResourceComment("Network connection details");
	oci.setResourceLabel("Connection Details");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(ConnectionDetails.PROP_HOST).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ConnectionDetails.PROP_HOST, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(ConnectionDetails.PROP_PORT).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ConnectionDetails.PROP_PORT, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(ConnectionDetails.PROP_URL).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ConnectionDetails.PROP_URL, TypeMapper
			.getDatatypeURI(String.class)));

	// OntologyEntry
	oci = createNewOntClassInfo(OntologyEntry.MY_URI, factory, ONTENTRY);
	oci
		.setResourceComment("Ontology entry available in the space provided by an app");
	oci.setResourceLabel("Ontology Entry");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(OntologyEntry.PROP_NAMESPACE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			OntologyEntry.PROP_NAMESPACE, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(OntologyEntry.PROP_ONTOLOGY_URI)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			OntologyEntry.PROP_ONTOLOGY_URI, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(OntologyEntry.PROP_VERSION).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			OntologyEntry.PROP_VERSION, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

	// AALAppSubProfile
	oci = createNewOntClassInfo(AALAppSubProfile.MY_URI, factory,
		AALAPPSUBPROF);
	oci
		.setResourceComment("Profile of an AAL Application part of an AAL Service");
	oci.setResourceLabel("AAL Application Profile");
	oci.addSuperClass(SubProfile.MY_URI);
	oci.addDatatypeProperty(AALAppSubProfile.PROP_ARTIFACT_DESCRIPTION)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AALAppSubProfile.PROP_ARTIFACT_DESCRIPTION, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(AALAppSubProfile.PROP_ARTIFACT_FILE_URL)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALAppSubProfile.PROP_ARTIFACT_FILE_URL, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(AALAppSubProfile.PROP_ARTIFACT_GROUP_ID)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AALAppSubProfile.PROP_ARTIFACT_GROUP_ID, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(AALAppSubProfile.PROP_ARTIFACT_ID)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AALAppSubProfile.PROP_ARTIFACT_ID, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(AALAppSubProfile.PROP_ARTIFACT_VERSION)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AALAppSubProfile.PROP_ARTIFACT_VERSION, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(AALAppSubProfile.PROP_DEVELOPER_USER_ID)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALAppSubProfile.PROP_DEVELOPER_USER_ID, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addObjectProperty(AALAppSubProfile.PROP_HARDWARE_REQUIREMENTS);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestriction(
			AALAppSubProfile.PROP_HARDWARE_REQUIREMENTS,
			Requirement.MY_URI));
	oci.addDatatypeProperty(AALAppSubProfile.PROP_IS_FREE).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALAppSubProfile.PROP_IS_FREE, TypeMapper
			.getDatatypeURI(Boolean.class)));
	oci.addDatatypeProperty(AALAppSubProfile.PROP_MAVEN_DESCRIPTOR)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			AALAppSubProfile.PROP_MAVEN_DESCRIPTOR, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(AALAppSubProfile.PROP_SOFTWARE_LICENSE);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALAppSubProfile.PROP_SOFTWARE_LICENSE, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(AALAppSubProfile.PROP_SOFTWARE_REQUIREMENTS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALAppSubProfile.PROP_SOFTWARE_REQUIREMENTS, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addObjectProperty(AALAppSubProfile.PROP_APP_PROPERTIES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALAppSubProfile.PROP_APP_PROPERTIES, Property.MY_URI));
	oci.addObjectProperty(AALAppSubProfile.PROP_REALIZED_ONTOLOGIES);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestriction(
			AALAppSubProfile.PROP_REALIZED_ONTOLOGIES,
			OntologyEntry.MY_URI));

	// AALServiceProfile
	oci = createNewOntClassInfo(AALServiceProfile.MY_URI, factory,
		AALSERVPROF);
	oci.setResourceComment("Profile of a AAL service");
	oci.setResourceLabel("AAL Service Profile");
	oci.addSuperClass(Profile.MY_URI);
	oci.addObjectProperty(AALServiceProfile.PROP_APPLICATION_SUBPROFILE)
		.addSuperProperty(Profile.PROP_HAS_SUB_PROFILE);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALServiceProfile.PROP_APPLICATION_SUBPROFILE,
		AALAppSubProfile.MY_URI));
	oci.addObjectProperty(AALServiceProfile.PROP_HARDWARE_SUBPROFILE)
		.addSuperProperty(Profile.PROP_HAS_SUB_PROFILE);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestriction(
			AALServiceProfile.PROP_HARDWARE_SUBPROFILE,
			HWSubProfile.MY_URI));
	oci.addObjectProperty(AALServiceProfile.PROP_HUMAN_RESOURCE_SUBPROFILE)
		.addSuperProperty(Profile.PROP_HAS_SUB_PROFILE);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALServiceProfile.PROP_HUMAN_RESOURCE_SUBPROFILE,
		HRSubProfile.MY_URI));
	oci.addDatatypeProperty(AALServiceProfile.PROP_CERTIFICATE);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALServiceProfile.PROP_CERTIFICATE, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(AALServiceProfile.PROP_CHARGING_MODEL)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALServiceProfile.PROP_CHARGING_MODEL, TypeMapper
			.getDatatypeURI(Integer.class)));
	oci.addDatatypeProperty(AALServiceProfile.PROP_DESCRIPTION)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALServiceProfile.PROP_DESCRIPTION, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(AALServiceProfile.PROP_PAYMENT_MODEL)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALServiceProfile.PROP_PAYMENT_MODEL, TypeMapper
			.getDatatypeURI(Integer.class)));
	oci.addDatatypeProperty(AALServiceProfile.PROP_PRICE).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALServiceProfile.PROP_PRICE, TypeMapper
			.getDatatypeURI(Float.class)));
	oci.addDatatypeProperty(AALServiceProfile.PROP_SERVICE_PROVIDER_ID)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALServiceProfile.PROP_SERVICE_PROVIDER_ID, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addDatatypeProperty(AALServiceProfile.PROP_SLA).setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALServiceProfile.PROP_SLA, TypeMapper
			.getDatatypeURI(String.class)));
	oci.addObjectProperty(AALServiceProfile.PROP_SERVICE_OWNER);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALServiceProfile.PROP_SERVICE_OWNER, User.MY_URI));

	// AALService
	oci = createNewOntClassInfo(AALService.MY_URI, factory, AALSERV);
	oci.setResourceComment("An AAL Service");
	oci.setResourceLabel("AAL Service");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addSuperClass(Profilable.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Profilable.PROP_HAS_PROFILE, AALServiceProfile.MY_URI,
			0, 1));

	// AALSpaceProfile
	oci = createNewOntClassInfo(AALSpaceProfile.MY_URI, factory,
		AALSPACEPROF);
	oci.setResourceComment("Profile of a AAL space");
	oci.setResourceLabel("AAL Space Profile");
	oci.addSuperClass(Profile.MY_URI);
	oci.addObjectProperty(AALSpaceProfile.PROP_INSTALLED_HARDWARE);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALSpaceProfile.PROP_INSTALLED_HARDWARE, Device.MY_URI));
	oci.addObjectProperty(AALSpaceProfile.PROP_INSTALLED_SERVICES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALSpaceProfile.PROP_INSTALLED_SERVICES, AALService.MY_URI));
	oci.addObjectProperty(AALSpaceProfile.PROP_SPACE_CONNECTION_DETAILS)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALSpaceProfile.PROP_SPACE_CONNECTION_DETAILS,
		ConnectionDetails.MY_URI));
	oci.addObjectProperty(AALSpaceProfile.PROP_USTORE_CONNECTION_DETAILS)
		.setFunctional();
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALSpaceProfile.PROP_USTORE_CONNECTION_DETAILS,
		ConnectionDetails.MY_URI));
	oci.addObjectProperty(AALSpaceProfile.PROP_INSTALLED_ONTOLOGIES);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestriction(
			AALSpaceProfile.PROP_INSTALLED_ONTOLOGIES,
			OntologyEntry.MY_URI));
	oci.addObjectProperty(AALSpaceProfile.PROP_SPACE_OWNER);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		AALSpaceProfile.PROP_SPACE_OWNER, User.MY_URI));

	// APProfile
	oci = createNewOntClassInfo(AssistedPersonProfile.MY_URI, factory,
		APPROF);
	oci.setResourceComment("Profile of an assisted person");
	oci.setResourceLabel("Assisted Person Profile");
	oci.addSuperClass(UserProfile.MY_URI);

	// CaregiverProfile
	oci = createNewOntClassInfo(CaregiverProfile.MY_URI, factory, CAREPROF);
	oci.setResourceComment("Profile of caregiver to the assisted person");
	oci.setResourceLabel("Caregiver Profile");
	oci.addSuperClass(UserProfile.MY_URI);

	// AALSpace
	oci = createNewOntClassInfo(AALSpace.MY_URI, factory, AALSPACE);
	oci.setResourceComment("An AAL Space");
	oci.setResourceLabel("AAL Space");
	oci.addSuperClass(Place.MY_URI);
	oci.addSuperClass(Profilable.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Profilable.PROP_HAS_PROFILE, AALSpaceProfile.MY_URI, 0,
			1));

	// AP
	oci = createNewOntClassInfo(AssistedPerson.MY_URI, factory, AP);
	oci
		.setResourceComment("The assisted person that is the end user of the system");
	oci.setResourceLabel("Assisted Person");
	oci.addSuperClass(User.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Profilable.PROP_HAS_PROFILE,
			AssistedPersonProfile.MY_URI, 0, 1));

	// Caregiver
	oci = createNewOntClassInfo(Caregiver.MY_URI, factory, CARE);
	oci.setResourceComment("Caregiver to the assisted person");
	oci.setResourceLabel("Caregiver");
	oci.addSuperClass(User.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Profilable.PROP_HAS_PROFILE, CaregiverProfile.MY_URI,
			0, 1));

	// load ProfilingService
	oci = createNewOntClassInfo(ProfilingService.MY_URI, factory, PROFSERV);
	oci.setResourceComment("The class of services controling Profiling.");
	oci.setResourceLabel("Profiling Service Controller");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(ProfilingService.PROP_CONTROLS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ProfilingService.PROP_CONTROLS, Profilable.MY_URI));

	// load ProfilingEditorService
	oci = createNewOntClassInfo(ProfilingEditorService.MY_URI, factory,
		PROFEDITSERV);
	oci
		.setResourceComment("The class of services controling Profile Editor.");
	oci.setResourceLabel("Profile Editor Service Controller");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(ProfilingEditorService.PROP_CONTROLS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ProfilingEditorService.PROP_CONTROLS, Profilable.MY_URI));
    }
}
