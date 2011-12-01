/*	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute of Computer Graphics Research

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
package org.universAAL.ontology;

import javax.xml.datatype.XMLGregorianCalendar;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.ui.owl.AccessImpairment;
import org.universAAL.middleware.ui.owl.Gender;
import org.universAAL.middleware.ui.owl.Modality;
import org.universAAL.middleware.ui.owl.PrivacyLevel;
import org.universAAL.middleware.ui.owl.UIBusOntology;
import org.universAAL.ontology.phThing.PhysicalThing;
import org.universAAL.ontology.profile.Address;
import org.universAAL.ontology.profile.Astigmatism;
import org.universAAL.ontology.profile.ColorBlindness;
import org.universAAL.ontology.profile.ContactType;
import org.universAAL.ontology.profile.DiaryActivityProfile;
import org.universAAL.ontology.profile.DiaryNutritionalProfile;
import org.universAAL.ontology.profile.ElderlyProfile;
import org.universAAL.ontology.profile.ElderlyUser;
import org.universAAL.ontology.profile.ExerciseType;
import org.universAAL.ontology.profile.FarSightedness;
import org.universAAL.ontology.profile.HealthProfile;
import org.universAAL.ontology.profile.HearingImpairment;
import org.universAAL.ontology.profile.Illness;
import org.universAAL.ontology.profile.LightSensitivity;
import org.universAAL.ontology.profile.Medicine;
import org.universAAL.ontology.profile.NearSightedness;
import org.universAAL.ontology.profile.PersonalPreferenceProfile;
import org.universAAL.ontology.profile.PhysicalImpairment;
import org.universAAL.ontology.profile.Profile;
import org.universAAL.ontology.profile.PropertyBag;
import org.universAAL.ontology.profile.PropertyEntry;
import org.universAAL.ontology.profile.Sex;
import org.universAAL.ontology.profile.SightImpairment;
import org.universAAL.ontology.profile.SleepingState;
import org.universAAL.ontology.profile.SocialProfile;
import org.universAAL.ontology.profile.SpeakingImpairment;
import org.universAAL.ontology.profile.User;
import org.universAAL.ontology.profile.UserIdentificationProfile;
import org.universAAL.ontology.profile.UserPosture;
import org.universAAL.ontology.profile.UserProfile;
import org.universAAL.ontology.profile.UserRole;
import org.universAAL.ontology.profile.service.ProfilingEditorService;
import org.universAAL.ontology.profile.service.ProfilingService;

/**
 * The Ontology.
 * 
 * @author Carsten Stockloew
 */

public final class ProfileOntology extends Ontology {

    private static ProfileFactory factory = new ProfileFactory();

    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX
	    + "Profile.owl#";

    public ProfileOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("The upper ontology defining the concepts representing the users of the system, the physical components of it, and their characteristics as profiles.");
	r.setResourceLabel("Profile");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(UIBusOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load Profile
	oci = createNewOntClassInfo(Profile.MY_URI, factory, 0);
	oci.setResourceComment("The class of a Profile.");
	oci.setResourceLabel("Profile");
	oci.addSuperClass(ManagedIndividual.MY_URI);

	// load SightImpairment
	oci = createNewOntClassInfo(SightImpairment.MY_URI, factory, 1);
	oci
		.setResourceComment("Represents the level of the user's difficulty in seeing GUI-based system output.");
	oci.setResourceLabel("Sight Impairment");
	oci.addSuperClass(AccessImpairment.MY_URI);

	// load FarSightedness
	oci = createNewOntClassInfo(FarSightedness.MY_URI, factory, 2);
	oci
		.setResourceComment("Represents the level of the user's farsightedness.");
	oci.setResourceLabel("Farsightedness");
	oci.addSuperClass(SightImpairment.MY_URI);

	// load SpeakingImpairment
	oci = createNewOntClassInfo(SpeakingImpairment.MY_URI, factory, 3);
	oci
		.setResourceComment("Represents the level of the user's difficulty in speaking.");
	oci.setResourceLabel("Speaking Impairment");
	oci.addSuperClass(AccessImpairment.MY_URI);

	// load HearingImpairment
	oci = createNewOntClassInfo(HearingImpairment.MY_URI, factory, 4);
	oci
		.setResourceComment("Represents the level of the user's difficulty in hearing voice-based system output.");
	oci.setResourceLabel("Hearing Impairment");
	oci.addSuperClass(AccessImpairment.MY_URI);

	// load ColorBlindness
	oci = createNewOntClassInfo(ColorBlindness.MY_URI, factory, 5);
	oci
		.setResourceComment("Represents the level of the user's color-blindness.");
	oci.setResourceLabel("ColorBlindness");
	oci.addSuperClass(SightImpairment.MY_URI);

	// load NearSightedness
	oci = createNewOntClassInfo(NearSightedness.MY_URI, factory, 6);
	oci
		.setResourceComment("Represents the level of the user's nearsightedness.");
	oci.setResourceLabel("Nearsightedness");
	oci.addSuperClass(SightImpairment.MY_URI);

	// load ContactType
	oci = createNewAbstractOntClassInfo(ContactType.MY_URI);
	oci.setResourceComment("The enum of contact type.");
	oci.setResourceLabel("Contact Type");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.toEnumeration(new ManagedIndividual[] {});

	// load Sex
	oci = createNewAbstractOntClassInfo(Sex.MY_URI);
	oci.setResourceComment("The enum of sex.");
	oci.setResourceLabel("Sex");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.toEnumeration(new ManagedIndividual[] { Sex.male, Sex.female });

	// load Astigmatism
	oci = createNewOntClassInfo(Astigmatism.MY_URI, factory, 7);
	oci
		.setResourceComment("Represents the level of the user's astigmatism.");
	oci.setResourceLabel("Astigmatism");
	oci.addSuperClass(SightImpairment.MY_URI);

	// load PhysicalImpairment
	oci = createNewOntClassInfo(PhysicalImpairment.MY_URI, factory, 8);
	oci
		.setResourceComment("Represents the level of the user's difficulty in providing input by the hands, e.g. in using maus and keyboard.");
	oci.setResourceLabel("Physical Impairment");
	oci.addSuperClass(AccessImpairment.MY_URI);

	// load LightSensitivity
	oci = createNewOntClassInfo(LightSensitivity.MY_URI, factory, 9);
	oci
		.setResourceComment("Represents the level of the user's light-sensitivity.");
	oci.setResourceLabel("LightSensitivity");
	oci.addSuperClass(SightImpairment.MY_URI);

	// load UserPosture
	oci = createNewAbstractOntClassInfo(UserPosture.MY_URI);
	oci.setResourceComment("The class of possible user postures.");
	oci.setResourceLabel("User Posture");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.toEnumeration(new ManagedIndividual[] { UserPosture.unknown,
		UserPosture.lying, UserPosture.sitting, UserPosture.standing });

	// load ExerciseType
	oci = createNewAbstractOntClassInfo(ExerciseType.MY_URI);
	oci.setResourceComment("The enum of Exercise type.");
	oci.setResourceLabel("Exercise Type");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.toEnumeration(new ManagedIndividual[] { ExerciseType.sedentary,
		ExerciseType.moderate, ExerciseType.active });

	// load UserRole
	oci = createNewAbstractOntClassInfo(UserRole.MY_URI);
	oci.setResourceComment("The enum of user roles.");
	oci.setResourceLabel("User Roles");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.toEnumeration(new ManagedIndividual[] { UserRole.elderlyuser });

	// load Illness
	oci = createNewOntClassInfo(Illness.MY_URI, factory, 10);
	oci.setResourceComment("The type of illness.");
	oci.setResourceLabel("Illness");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(Illness.PROP_S_ANEMIA).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Illness.PROP_S_ANEMIA,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_ASTHMA).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Illness.PROP_S_ASTHMA,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_CANCER).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Illness.PROP_S_CANCER,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_CHOLESTEROL).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_CHOLESTEROL, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_HYPERTENSION).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_HYPERTENSION, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_DIGESTION_PROB).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_DIGESTION_PROB, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_ALLERGY).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Illness.PROP_S_ALLERGY,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_ARTERIOPATHY).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_ARTERIOPATHY, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_DIABETES).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_DIABETES, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_ISCHEMIC_CARDIOPATHY)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_ISCHEMIC_CARDIOPATHY, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_DEMENTIA).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_DEMENTIA, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_MALNUTRITION).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_MALNUTRITION, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_OSTEOPOROSIS).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_OSTEOPOROSIS, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_OVERWEIGHT).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_OVERWEIGHT, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_METABOLIC_SYNDROME)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_METABOLIC_SYNDROME, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));

	// load Medicine
	oci = createNewOntClassInfo(Medicine.MY_URI, factory, 11);
	oci.setResourceComment("The value of Medicine.");
	oci.setResourceLabel("Medicine");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(Medicine.PROP_S_NAME).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Medicine.PROP_S_NAME,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(Medicine.PROP_S_QUANTITY).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Medicine.PROP_S_QUANTITY, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	// load Address
	oci = createNewOntClassInfo(Address.MY_URI, factory, 12);
	oci.setResourceComment("The value of Address profile.");
	oci.setResourceLabel("Personal AddressProfile");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(Address.PROP_S_COUNTRY).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Address.PROP_S_COUNTRY,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(Address.PROP_S_STATE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Address.PROP_S_STATE,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(Address.PROP_S_CITY).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Address.PROP_S_CITY,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(Address.PROP_S_PROVINCE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Address.PROP_S_PROVINCE, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(Address.PROP_S_STREET).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Address.PROP_S_STREET,
			TypeMapper.getDatatypeURI(String.class), 1, 1));

	// load HealthProfile
	oci = createNewOntClassInfo(HealthProfile.MY_URI, factory, 13);
	oci.setResourceComment("The value of health profile.");
	oci.setResourceLabel("Health Profile");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(HealthProfile.PROP_S_AGE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_AGE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_DOCTOR_REFERENCE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_DOCTOR_REFERENCE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_NUTRITIONAL_REFERENCE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_NUTRITIONAL_REFERENCE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_SOCIAL_CARE_CENTER)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_SOCIAL_CARE_CENTER, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_HOSPITAL).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_HOSPITAL, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_HEIGHT).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_HEIGHT, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_ALCOHOL).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_ALCOHOL, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_TOBACCO).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_TOBACCO, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_DRUGS).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_DRUGS, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_RECOMMENDED_WEIGHT)
		.setFunctional();
	oci.addRestriction(MergedRestriction

	.getAllValuesRestrictionWithCardinality(
		HealthProfile.PROP_S_RECOMMENDED_WEIGHT, TypeMapper
			.getDatatypeURI(Integer.class), 1, 1));
	oci.addObjectProperty(HealthProfile.PROP_HAS_ILLNESS).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_HAS_ILLNESS, Illness.MY_URI, 1, 1));
	oci.addObjectProperty(HealthProfile.PROP_HAS_DISABILITY);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HealthProfile.PROP_HAS_DISABILITY, AccessImpairment.MY_URI));
	oci.addObjectProperty(HealthProfile.PROP_HAS_MEDICINE).setFunctional();
	oci
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				HealthProfile.PROP_HAS_MEDICINE,
				Medicine.MY_URI, 1, 1));

	// load SleepingState
	oci = createNewAbstractOntClassInfo(SleepingState.MY_URI);
	oci
		.setResourceComment("The class of possible states of the user in regard to sleeping.");
	oci.setResourceLabel("Sleeping State");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.toEnumeration(new ManagedIndividual[] { SleepingState.unknown,
		SleepingState.asleep, SleepingState.awake,
		SleepingState.preparedToSleep, SleepingState.sleepy });

	// load PropertyEntry
	oci = createNewOntClassInfo(PropertyEntry.MY_URI, factory, 14);
	oci
		.setResourceComment("The root of the whole class hierarchy in the uAAL ontology.");
	oci.setResourceLabel("Property Definition");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(PropertyEntry.PROP_IS_LITERAL).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PropertyEntry.PROP_IS_LITERAL, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(PropertyEntry.PROP_PATH);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		PropertyEntry.PROP_PATH, TypeMapper
			.getDatatypeURI(String.class)));

	// load PropertyBag
	oci = createNewOntClassInfo(PropertyBag.MY_URI, factory, 15);
	oci
		.setResourceComment("The root of the whole class hierarchy in the uAAL ontology.");
	oci.setResourceLabel("PropertyMap");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addObjectProperty(PropertyBag.PROP_HAS_PROPERTY_ENTRY);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		PropertyBag.PROP_HAS_PROPERTY_ENTRY, PropertyEntry.MY_URI));

	// load DiaryNutritionalProfile
	oci = createNewOntClassInfo(DiaryNutritionalProfile.MY_URI, factory, 16);
	oci.setResourceComment("The value of diary nutritional profile.");
	oci.setResourceLabel("Diary Nutritional Profile");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(DiaryNutritionalProfile.PROP_D_CALORIES)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DiaryNutritionalProfile.PROP_D_CALORIES, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(DiaryNutritionalProfile.PROP_D_MEAL)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DiaryNutritionalProfile.PROP_D_MEAL, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));

	// load UserIdentificationProfile
	oci = createNewOntClassInfo(UserIdentificationProfile.MY_URI, factory,
		18);
	oci.setResourceComment("The class of the User Identification Profile");
	oci.setResourceLabel("User Identification Profile");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(UserIdentificationProfile.PROP_S_USER_ID)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_USER_ID, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(UserIdentificationProfile.PROP_S_NAME)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_NAME, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(UserIdentificationProfile.PROP_S_SURNAME)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_SURNAME, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(UserIdentificationProfile.PROP_S_AGE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_AGE, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(UserIdentificationProfile.PROP_S_EMAIL)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_EMAIL, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci
		.addDatatypeProperty(
			UserIdentificationProfile.PROP_S_HOME_TELEPHONE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_HOME_TELEPHONE,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(
		UserIdentificationProfile.PROP_S_OFFICE_TELEPHONE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_OFFICE_TELEPHONE,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(
		UserIdentificationProfile.PROP_S_MOBILE_TELEPHONE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_MOBILE_TELEPHONE,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addObjectProperty(UserIdentificationProfile.PROP_S_GENDER)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_GENDER, Sex.MY_URI, 1,
			1));
	oci.addDatatypeProperty(UserIdentificationProfile.PROP_S_NATIONALITY)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_NATIONALITY,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(
		UserIdentificationProfile.PROP_S_PREFERRED_LANGUAGE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_PREFERRED_LANGUAGE,
			TypeMapper.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(UserIdentificationProfile.PROP_S_USER_ROLE_ID)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_USER_ROLE_ID,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addObjectProperty(UserIdentificationProfile.PROP_S_USER_ROLE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_USER_ROLE,
			UserRole.MY_URI, 1, 1));
	oci.addObjectProperty(UserIdentificationProfile.PROP_S_ADDRESS)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_S_ADDRESS,
			Address.MY_URI, 1, 1));
	oci.addDatatypeProperty(UserIdentificationProfile.PROP_D_USER_IP)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserIdentificationProfile.PROP_D_USER_IP, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

	// load UserProfile
	oci = createNewOntClassInfo(UserProfile.MY_URI, factory, 19);
	oci.setResourceComment("The class of a UserProfile.");
	oci.setResourceLabel("UserProfile");
	oci.addSuperClass(Profile.MY_URI);
	oci.addObjectProperty(UserProfile.PROP_USER_ID_PROFILE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			UserProfile.PROP_USER_ID_PROFILE,
			UserIdentificationProfile.MY_URI, 1, 1));
	
	// load User
	oci = createNewOntClassInfo(User.MY_URI, factory, 17);
	oci.setResourceComment("The root class for users.");
	oci.setResourceLabel("User");
	oci.addSuperClass(PhysicalThing.MY_URI);
	oci.addObjectProperty(User.PROP_HAS_PROFILE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(User.PROP_HAS_PROFILE,
			UserProfile.MY_URI, 1, 1));
	oci.addObjectProperty(User.PROP_HAS_PROPERTY_BAG);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			User.PROP_HAS_PROPERTY_BAG, PropertyBag.MY_URI, 0, 1));
	oci.addDatatypeProperty(User.PROP_USERNAME);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(User.PROP_USERNAME,
			TypeMapper.getDatatypeURI(String.class), 0, 1));
	oci.addDatatypeProperty(User.PROP_PASSWORD);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(User.PROP_PASSWORD,
			TypeMapper.getDatatypeURI(String.class), 0, 1));
	oci.addObjectProperty(User.PROP_USER_POSTURE);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(User.PROP_USER_POSTURE,
			UserPosture.MY_URI, 0, 1));
	oci.addObjectProperty(User.PROP_SLEEPING_STATE);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			User.PROP_SLEEPING_STATE, SleepingState.MY_URI, 0, 1));

	// load SocialProfile
	oci = createNewOntClassInfo(SocialProfile.MY_URI, factory, 20);
	oci.setResourceComment("The value of social profile.");
	oci.setResourceLabel("Social Profile");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addDatatypeProperty(SocialProfile.PROP_S_LIVE_ALONE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SocialProfile.PROP_S_LIVE_ALONE, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(SocialProfile.PROP_S_MAIN_CONTACT_ID)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SocialProfile.PROP_S_MAIN_CONTACT_ID, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(SocialProfile.PROP_S_HOUSE_WORKER_ID)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SocialProfile.PROP_S_HOUSE_WORKER_ID, TypeMapper
				.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(SocialProfile.PROP_S_PHYCHO_STATE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			SocialProfile.PROP_S_PHYCHO_STATE, TypeMapper
				.getDatatypeURI(String.class), 1, 1));

	// load DiaryActivityProfile
	oci = createNewOntClassInfo(DiaryActivityProfile.MY_URI, factory, 21);
	oci.setResourceComment("The list of activity profile.");
	oci.setResourceLabel("Diary Activity Profile");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addObjectProperty(DiaryActivityProfile.PROP_S_EXERCISE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DiaryActivityProfile.PROP_S_EXERCISE,
			ExerciseType.MY_URI, 1, 1));
	oci.addDatatypeProperty(DiaryActivityProfile.PROP_S_BREAKFAST_TIME)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DiaryActivityProfile.PROP_S_BREAKFAST_TIME, TypeMapper
				.getDatatypeURI(XMLGregorianCalendar.class), 1,
			1));
	oci.addDatatypeProperty(DiaryActivityProfile.PROP_S_LAUNCH_TIME)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DiaryActivityProfile.PROP_S_LAUNCH_TIME, TypeMapper
				.getDatatypeURI(XMLGregorianCalendar.class), 1,
			1));
	oci.addDatatypeProperty(DiaryActivityProfile.PROP_S_DINNER_TIME)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DiaryActivityProfile.PROP_S_DINNER_TIME, TypeMapper
				.getDatatypeURI(XMLGregorianCalendar.class), 1,
			1));
	oci.addDatatypeProperty(DiaryActivityProfile.PROP_S_RECOM_ACTIVITY)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DiaryActivityProfile.PROP_S_RECOM_ACTIVITY, TypeMapper
				.getDatatypeURI(String.class), 1, 1));
	oci.addDatatypeProperty(DiaryActivityProfile.PROP_D_GET_UP)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DiaryActivityProfile.PROP_D_GET_UP, TypeMapper
				.getDatatypeURI(XMLGregorianCalendar.class), 1,
			1));
	oci.addDatatypeProperty(DiaryActivityProfile.PROP_D_BED_TIME)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DiaryActivityProfile.PROP_D_BED_TIME, TypeMapper
				.getDatatypeURI(XMLGregorianCalendar.class), 1,
			1));
	oci.addDatatypeProperty(DiaryActivityProfile.PROP_D_DIARY_ACTIVITIES)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			DiaryActivityProfile.PROP_D_DIARY_ACTIVITIES,
			TypeMapper.getDatatypeURI(String.class), 1, 1));

	// load PersonalPreferenceProfile
	oci = createNewOntClassInfo(PersonalPreferenceProfile.MY_URI, factory,
		22);
	oci.setResourceComment("The value of personal preferences profile.");
	oci.setResourceLabel("Personal Preferences Profile");
	oci.addSuperClass(ManagedIndividual.MY_URI);
	oci.addObjectProperty(
		PersonalPreferenceProfile.PROP_D_INTERACTION_MODALITY)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PersonalPreferenceProfile.PROP_D_INTERACTION_MODALITY,
			Modality.MY_URI, 1, 1));
	oci.addObjectProperty(PersonalPreferenceProfile.PROP_D_VOICE_GENDER)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PersonalPreferenceProfile.PROP_D_VOICE_GENDER,
			Gender.MY_URI, 1, 1));
	oci.addDatatypeProperty(
		PersonalPreferenceProfile.PROP_D_INSENSIBLE_VOLUME_LEVEL)
		.setFunctional();
	oci
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				PersonalPreferenceProfile.PROP_D_INSENSIBLE_VOLUME_LEVEL,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(
		PersonalPreferenceProfile.PROP_D_PERSONAL_VOLUME_LEVEL)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			PersonalPreferenceProfile.PROP_D_PERSONAL_VOLUME_LEVEL,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(
		PersonalPreferenceProfile.PROP_D_INSENSIBLE_MAX_RESOLUTION_X)
		.setFunctional();
	oci
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				PersonalPreferenceProfile.PROP_D_INSENSIBLE_MAX_RESOLUTION_X,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(
		PersonalPreferenceProfile.PROP_D_INSENSIBLE_MAX_RESOLUTION_Y)
		.setFunctional();
	oci
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				PersonalPreferenceProfile.PROP_D_INSENSIBLE_MAX_RESOLUTION_Y,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(
		PersonalPreferenceProfile.PROP_D_PERSONAL_MIN_RESOLUTION_X)
		.setFunctional();
	oci
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				PersonalPreferenceProfile.PROP_D_PERSONAL_MIN_RESOLUTION_X,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(
		PersonalPreferenceProfile.PROP_D_PERSONAL_MIN_RESOLUTION_Y)
		.setFunctional();
	oci
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				PersonalPreferenceProfile.PROP_D_PERSONAL_MIN_RESOLUTION_Y,
				TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci
		.addObjectProperty(PersonalPreferenceProfile.PROP_D_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE);
	oci
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				PersonalPreferenceProfile.PROP_D_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE,
				PrivacyLevel.MY_URI, 0, 1));
	oci
		.addObjectProperty(PersonalPreferenceProfile.PROP_D_PRIVACY_LEVELS_MAPPED_TO_PERSONAL);
	oci
		.addRestriction(MergedRestriction
			.getAllValuesRestrictionWithCardinality(
				PersonalPreferenceProfile.PROP_D_PRIVACY_LEVELS_MAPPED_TO_PERSONAL,
				PrivacyLevel.MY_URI, 0, 1));

	// load ElderlyProfile
	oci = createNewOntClassInfo(ElderlyProfile.MY_URI, factory, 23);
	oci.setResourceComment("The class of Elderly Profile.");
	oci.setResourceLabel("Elderly Profiles");
	oci.addSuperClass(UserProfile.MY_URI);
	oci.addObjectProperty(ElderlyProfile.PROP_SOCIAL_PROFILE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ElderlyProfile.PROP_SOCIAL_PROFILE,
			SocialProfile.MY_URI, 1, 1));
	oci.addObjectProperty(ElderlyProfile.PROP_HEALTH_PROFILE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ElderlyProfile.PROP_HEALTH_PROFILE,
			HealthProfile.MY_URI, 1, 1));
	oci.addObjectProperty(ElderlyProfile.PROP_DIARY_ACTIVITY_PROFILE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ElderlyProfile.PROP_DIARY_ACTIVITY_PROFILE,
			DiaryActivityProfile.MY_URI, 1, 1));
	oci.addObjectProperty(ElderlyProfile.PROP_DIARY_NUTR_PROFILE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ElderlyProfile.PROP_DIARY_NUTR_PROFILE,
			DiaryNutritionalProfile.MY_URI, 1, 1));
	oci.addObjectProperty(ElderlyProfile.PROP_PERS_PREF_PROFILE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ElderlyProfile.PROP_PERS_PREF_PROFILE,
			PersonalPreferenceProfile.MY_URI, 1, 1));

	// load ElderlyUser
	oci = createNewOntClassInfo(ElderlyUser.MY_URI, factory, 24);
	oci.setResourceComment("The class of a ElderlyUser");
	oci.setResourceLabel("ElderlyUser");
	oci.addSuperClass(User.MY_URI);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(User.PROP_HAS_PROFILE,
			ElderlyProfile.MY_URI, 1, 1));

	// load ProfilingService
	oci = createNewOntClassInfo(ProfilingService.MY_URI, factory, 25);
	oci.setResourceComment("The class of services controling Profiling.");
	oci.setResourceLabel("Profiling Service Controller");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(ProfilingService.PROP_CONTROLS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ProfilingService.PROP_CONTROLS, User.MY_URI));

	// load ProfilingEditorService
	oci = createNewOntClassInfo(ProfilingEditorService.MY_URI, factory, 26);
	oci
		.setResourceComment("The class of services controling Profile Editor.");
	oci.setResourceLabel("Profile Editor Service Controller");
	oci.addSuperClass(Service.MY_URI);
	oci.addObjectProperty(ProfilingEditorService.PROP_CONTROLS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ProfilingEditorService.PROP_CONTROLS, User.MY_URI));
    }
}
