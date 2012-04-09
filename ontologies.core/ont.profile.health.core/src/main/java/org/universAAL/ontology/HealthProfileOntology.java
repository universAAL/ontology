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

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.ui.owl.AccessImpairment;
import org.universAAL.middleware.ui.owl.UIBusOntology;
import org.universAAL.ontology.profile.AssistedPersonProfile;
import org.universAAL.ontology.profile.SubProfile;
import org.universAAL.ontology.profile.health.HealthProfile;
import org.universAAL.ontology.profile.health.Illness;
import org.universAAL.ontology.profile.health.Medicine;

/**
 * The Ontology.
 * 
 * @author Carsten Stockloew
 */

public final class HealthProfileOntology extends Ontology {

    private static HealthProfileFactory factory = new HealthProfileFactory();

    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX
	    + "Profile.owl#";

    public static final String PROP_HEALTH_PROFILE = AssistedPersonProfile.PROP_HAS_SUB_PROFILE
	    + "Health";

    public HealthProfileOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("The ontology defining a health profile.");
	r.setResourceLabel("HealthProfile");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ProfileOntology.NAMESPACE);
	addImport(UIBusOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load Illness
	oci = createNewOntClassInfo(Illness.MY_URI, factory, 1);
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
			Illness.PROP_S_CHOLESTEROL,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_HYPERTENSION).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_HYPERTENSION,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_DIGESTION_PROB).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_DIGESTION_PROB,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_ALLERGY).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Illness.PROP_S_ALLERGY,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_ARTERIOPATHY).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_ARTERIOPATHY,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_DIABETES).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_DIABETES,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_ISCHEMIC_CARDIOPATHY)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_ISCHEMIC_CARDIOPATHY,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_DEMENTIA).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_DEMENTIA,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_MALNUTRITION).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_MALNUTRITION,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_OSTEOPOROSIS).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_OSTEOPOROSIS,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_OVERWEIGHT).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_OVERWEIGHT,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Illness.PROP_S_METABOLIC_SYNDROME)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Illness.PROP_S_METABOLIC_SYNDROME,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));

	// load Medicine
	oci = createNewOntClassInfo(Medicine.MY_URI, factory, 2);
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
			Medicine.PROP_S_QUANTITY,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));

	// load HealthProfile
	oci = createNewOntClassInfo(HealthProfile.MY_URI, factory, 0);
	oci.setResourceComment("The value of health profile.");
	oci.setResourceLabel("Health Profile");
	oci.addSuperClass(SubProfile.MY_URI);
	oci.addDatatypeProperty(HealthProfile.PROP_S_AGE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_AGE,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_DOCTOR_REFERENCE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_DOCTOR_REFERENCE,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_NUTRITIONAL_REFERENCE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_NUTRITIONAL_REFERENCE,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_SOCIAL_CARE_CENTER)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_SOCIAL_CARE_CENTER,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_HOSPITAL).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_HOSPITAL,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_HEIGHT).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_HEIGHT,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_ALCOHOL).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_ALCOHOL,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_TOBACCO).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_TOBACCO,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_DRUGS).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_S_DRUGS,
			TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addDatatypeProperty(HealthProfile.PROP_S_RECOMMENDED_WEIGHT)
		.setFunctional();
	oci.addRestriction(MergedRestriction

	.getAllValuesRestrictionWithCardinality(
		HealthProfile.PROP_S_RECOMMENDED_WEIGHT,
		TypeMapper.getDatatypeURI(Integer.class), 1, 1));
	oci.addObjectProperty(HealthProfile.PROP_HAS_ILLNESS).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_HAS_ILLNESS, Illness.MY_URI, 1, 1));
	oci.addObjectProperty(HealthProfile.PROP_HAS_DISABILITY);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		HealthProfile.PROP_HAS_DISABILITY, AccessImpairment.MY_URI));
	oci.addObjectProperty(HealthProfile.PROP_HAS_MEDICINE).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			HealthProfile.PROP_HAS_MEDICINE, Medicine.MY_URI, 1, 1));

	// Extend UserProfile
	oci = extendExistingOntClassInfo(AssistedPersonProfile.MY_URI);
	oci.addObjectProperty(PROP_HEALTH_PROFILE).addSuperProperty(
		AssistedPersonProfile.PROP_HAS_SUB_PROFILE);
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(PROP_HEALTH_PROFILE,
			HealthProfile.MY_URI, 0, 1));
    }
}
