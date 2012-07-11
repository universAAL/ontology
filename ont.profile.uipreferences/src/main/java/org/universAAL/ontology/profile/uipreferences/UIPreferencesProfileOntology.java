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
package org.universAAL.ontology.profile.uipreferences;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.ui.owl.Gender;
import org.universAAL.middleware.ui.owl.Modality;
import org.universAAL.middleware.ui.owl.PrivacyLevel;
import org.universAAL.middleware.ui.owl.UIBusOntology;
import org.universAAL.ontology.UIPreferencesProfileFactory;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.profile.AssistedPersonProfile;
import org.universAAL.ontology.profile.SubProfile;


/**
 * @author eandgrg
 *
 */
public final class UIPreferencesProfileOntology extends Ontology {

	private static UIPreferencesProfileFactory factory = new UIPreferencesProfileFactory();
	public static final String NAMESPACE = "http://ontology.universaal.org/UIPreferencesProfile.owl#";

	public static final String PROP_INTERACTION_PREF_PROFILE = AssistedPersonProfile.PROP_HAS_SUB_PROFILE
			+ "UIPreferences";

	public UIPreferencesProfileOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("User preferences related to user interaction");
		r.setResourceLabel("UIPreferencesProfile");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ServiceBusOntology.NAMESPACE);
		addImport(UIBusOntology.NAMESPACE);
		addImport(LocationOntology.NAMESPACE);

		// ******* Declaration of regular classes of the ontology ******* //
		OntClassInfoSetup oci_InteractionPreferencesProfile = createNewOntClassInfo(
				InteractionPreferencesProfile.MY_URI, factory, 0);

		// ******* Add content to regular classes of the ontology ******* //
		oci_InteractionPreferencesProfile.setResourceComment("");
		oci_InteractionPreferencesProfile
				.setResourceLabel("InteractionPreferencesProfile");
		oci_InteractionPreferencesProfile
				.addSuperClass(SubProfile.MY_URI);
		oci_InteractionPreferencesProfile.addDatatypeProperty(
				InteractionPreferencesProfile.PROP_INSENSIBLE_VOLUME_LEVEL)
				.setFunctional();
		oci_InteractionPreferencesProfile
				.addRestriction(MergedRestriction
						.getAllValuesRestrictionWithCardinality(
								InteractionPreferencesProfile.PROP_INSENSIBLE_VOLUME_LEVEL,
								TypeMapper.getDatatypeURI(Integer.class), 1, 1));

		oci_InteractionPreferencesProfile.addDatatypeProperty(
				InteractionPreferencesProfile.PROP_PERSONAL_VOLUME_LEVEL)
				.setFunctional();
		oci_InteractionPreferencesProfile
				.addRestriction(MergedRestriction
						.getAllValuesRestrictionWithCardinality(
								InteractionPreferencesProfile.PROP_PERSONAL_VOLUME_LEVEL,
								TypeMapper.getDatatypeURI(Integer.class), 1, 1));

		oci_InteractionPreferencesProfile.addDatatypeProperty(
				InteractionPreferencesProfile.PROP_INSENSIBLE_MAX_RESOLUTION_Y)
				.setFunctional();
		oci_InteractionPreferencesProfile
				.addRestriction(MergedRestriction
						.getAllValuesRestrictionWithCardinality(
								InteractionPreferencesProfile.PROP_INSENSIBLE_MAX_RESOLUTION_Y,
								TypeMapper.getDatatypeURI(Integer.class), 1, 1));

		oci_InteractionPreferencesProfile.addDatatypeProperty(
				InteractionPreferencesProfile.PROP_INSENSIBLE_MAX_RESOLUTION_X)
				.setFunctional();
		oci_InteractionPreferencesProfile
				.addRestriction(MergedRestriction
						.getAllValuesRestrictionWithCardinality(
								InteractionPreferencesProfile.PROP_INSENSIBLE_MAX_RESOLUTION_X,
								TypeMapper.getDatatypeURI(Integer.class), 1, 1));

		oci_InteractionPreferencesProfile
				.addObjectProperty(
						InteractionPreferencesProfile.PROP_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE)
				.setFunctional();
		oci_InteractionPreferencesProfile
				.addRestriction(MergedRestriction
						.getAllValuesRestrictionWithCardinality(
								InteractionPreferencesProfile.PROP_PRIVACY_LEVELS_MAPPED_TO_INSENSIBLE,
								PrivacyLevel.MY_URI,1, 1));

		oci_InteractionPreferencesProfile
				.addObjectProperty(
						InteractionPreferencesProfile.PROP_PRIVACY_LEVELS_MAPPED_TO_PERSONAL)
				.setFunctional();
		oci_InteractionPreferencesProfile
				.addRestriction(MergedRestriction
						.getAllValuesRestrictionWithCardinality(
								InteractionPreferencesProfile.PROP_PRIVACY_LEVELS_MAPPED_TO_PERSONAL,
								PrivacyLevel.MY_URI,1, 1));

		oci_InteractionPreferencesProfile.addDatatypeProperty(
				InteractionPreferencesProfile.PROP_PERSONAL_MIN_RESOLUTION_Y)
				.setFunctional();
		oci_InteractionPreferencesProfile
				.addRestriction(MergedRestriction
						.getAllValuesRestrictionWithCardinality(
								InteractionPreferencesProfile.PROP_PERSONAL_MIN_RESOLUTION_Y,
								TypeMapper.getDatatypeURI(Integer.class), 1, 1));

		oci_InteractionPreferencesProfile.addDatatypeProperty(
				InteractionPreferencesProfile.PROP_PERSONAL_MIN_RESOLUTION_X)
				.setFunctional();
		oci_InteractionPreferencesProfile
				.addRestriction(MergedRestriction
						.getAllValuesRestrictionWithCardinality(
								InteractionPreferencesProfile.PROP_PERSONAL_MIN_RESOLUTION_X,
								TypeMapper.getDatatypeURI(Integer.class), 1, 1));

		oci_InteractionPreferencesProfile.addObjectProperty(
				InteractionPreferencesProfile.PROP_INTERACTION_MODALITY)
				.setFunctional();
		oci_InteractionPreferencesProfile
				.addRestriction(MergedRestriction
						.getAllValuesRestrictionWithCardinality(
								InteractionPreferencesProfile.PROP_INTERACTION_MODALITY,
								Modality.MY_URI,1, 1));

		oci_InteractionPreferencesProfile.addObjectProperty(
				InteractionPreferencesProfile.PROP_VOICE_GENDER)
				.setFunctional();
		oci_InteractionPreferencesProfile.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						InteractionPreferencesProfile.PROP_VOICE_GENDER, Gender.MY_URI,1, 1));

		// Extend UserProfile
		OntClassInfoSetup oci = extendExistingOntClassInfo(AssistedPersonProfile.MY_URI);
		oci.addObjectProperty(PROP_INTERACTION_PREF_PROFILE).addSuperProperty(
				AssistedPersonProfile.PROP_HAS_SUB_PROFILE);
		oci.addRestriction(MergedRestriction
				.getAllValuesRestrictionWithCardinality(
						PROP_INTERACTION_PREF_PROFILE,
						InteractionPreferencesProfile.MY_URI, 0, 1));

	}
}