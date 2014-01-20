/*******************************************************************************
 * Copyright 2012 Universidad Politécnica de Madrid
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
package org.universAAL.ontology.disease.owl;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.ICD10CirculatorySystemDiseases.owl.AcuteRheumaticFever;
import org.universAAL.ontology.ICD10CirculatorySystemDiseases.owl.HeartFailure;
import org.universAAL.ontology.ICD10CirculatorySystemDiseases.owl.HypertensiveDisease;
import org.universAAL.ontology.ICD10CirculatorySystemDiseases.owl.IschemicHeartDisease;
import org.universAAL.ontology.ICD10CirculatorySystemDiseases.owl.OtherCirculatorySystemDisease;
import org.universAAL.ontology.ICD10Diseases.owl.CertainInfectiousParasiticDisease;
import org.universAAL.ontology.ICD10Diseases.owl.CirculatorySystemDisease;
import org.universAAL.ontology.ICD10Diseases.owl.DigestiveSystemDisease;
import org.universAAL.ontology.ICD10Diseases.owl.MentalDisorder;
import org.universAAL.ontology.ICD10Diseases.owl.Neoplasms;
import org.universAAL.ontology.ICD10Diseases.owl.NervousSystemDisease;
import org.universAAL.ontology.ICD10Diseases.owl.RespiratorySystemDisease;
import org.universAAL.ontology.disease.DiseaseFactory;
import org.universAAL.ontology.location.LocationOntology;

/**
 * @author AAL Studio
 */
public final class DiseaseOntology extends Ontology {

    private static DiseaseFactory factory = new DiseaseFactory();
    public static final String NAMESPACE = "http://ontology.universAAL.org/Disease.owl#";

    public DiseaseOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r.setResourceComment("This ontology defines the concept of 'Disease'");
	r.setResourceLabel("DiseaseOntology");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(LocationOntology.NAMESPACE);

	OntClassInfoSetup oci_DiseaseSeverityStatus;
	OntClassInfoSetup oci_DiseaseTimeEvolvingStatus;

	// ******* Enumeration classes of the ontology ******* //

	// load DiseaseSeverityStatus

	oci_DiseaseSeverityStatus = createNewAbstractOntClassInfo(DiseaseSeverityStatus.MY_URI);
	oci_DiseaseSeverityStatus
		.setResourceComment("This class defines the types of possible status stages of the disease: mild, seriously ill, chronic, critical, terminal.");
	oci_DiseaseSeverityStatus.setResourceLabel("StatusType");
	oci_DiseaseSeverityStatus.toEnumeration(new ManagedIndividual[] {
		DiseaseSeverityStatus.mild, DiseaseSeverityStatus.severe,
		DiseaseSeverityStatus.fatal });

	// load DiseaseTimeEvolvingStatus

	oci_DiseaseTimeEvolvingStatus = createNewAbstractOntClassInfo(DiseaseTimeEvolvingStatus.MY_URI);
	oci_DiseaseTimeEvolvingStatus
		.setResourceComment("This class defines the types of possible status stages of the disease: mild, seriously ill, chronic, critical, terminal.");
	oci_DiseaseTimeEvolvingStatus.setResourceLabel("StatusType");
	oci_DiseaseTimeEvolvingStatus.toEnumeration(new ManagedIndividual[] {
		DiseaseTimeEvolvingStatus.acute,
		DiseaseTimeEvolvingStatus.chronic });

	// ******* Declaration of regular classes of the ontology ******* //

	OntClassInfoSetup oci_Disease = createNewOntClassInfo(Disease.MY_URI,
		factory, 0);
	OntClassInfoSetup oci_Epidemiology = createNewOntClassInfo(
		Epidemiology.MY_URI, factory, 1);
	OntClassInfoSetup oci_Etiology = createNewOntClassInfo(Etiology.MY_URI,
		factory, 2);
	OntClassInfoSetup oci_Patogeny = createNewOntClassInfo(Patogeny.MY_URI,
		factory, 3);
	OntClassInfoSetup oci_Sympthom = createNewOntClassInfo(Sympthom.MY_URI,
		factory, 4);
	OntClassInfoSetup oci_Pronostic = createNewOntClassInfo(
		Pronostic.MY_URI, factory, 5);
	OntClassInfoSetup oci_Diagnostic = createNewOntClassInfo(
		Diagnostic.MY_URI, factory, 6);

	OntClassInfoSetup oci_CertainInfectiousParasiticDisease = createNewOntClassInfo(
		CertainInfectiousParasiticDisease.MY_URI, factory, 7);
	OntClassInfoSetup oci_CirculatorySystemDisease = createNewOntClassInfo(
		CirculatorySystemDisease.MY_URI, factory, 8);
	OntClassInfoSetup oci_DigestiveSystemDisease = createNewOntClassInfo(
		DigestiveSystemDisease.MY_URI, factory, 9);
	OntClassInfoSetup oci_MentalDisorder = createNewOntClassInfo(
		MentalDisorder.MY_URI, factory, 10);
	OntClassInfoSetup oci_Neoplasms = createNewOntClassInfo(
		Neoplasms.MY_URI, factory, 11);
	OntClassInfoSetup oci_NervousSystemDisease = createNewOntClassInfo(
		NervousSystemDisease.MY_URI, factory, 12);
	OntClassInfoSetup oci_RespiratorySystemDisease = createNewOntClassInfo(
		RespiratorySystemDisease.MY_URI, factory, 13);

	OntClassInfoSetup oci_AcuteRheumaticFever = createNewOntClassInfo(
		AcuteRheumaticFever.MY_URI, factory, 14);
	OntClassInfoSetup oci_HeartFailure = createNewOntClassInfo(
		HeartFailure.MY_URI, factory, 15);
	OntClassInfoSetup oci_HypertensiveDisease = createNewOntClassInfo(
		HypertensiveDisease.MY_URI, factory, 16);
	OntClassInfoSetup oci_IschemicHeartDisease = createNewOntClassInfo(
		IschemicHeartDisease.MY_URI, factory, 17);
	OntClassInfoSetup oci_OtherCirculatorySystemDisease = createNewOntClassInfo(
		OtherCirculatorySystemDisease.MY_URI, factory, 18);

	// ******* Add content to regular classes of the ontology ******* //
	oci_Epidemiology.setResourceComment("");
	oci_Epidemiology.setResourceLabel("");
	oci_Epidemiology.addSuperClass(ManagedIndividual.MY_URI);

	oci_Epidemiology.setResourceComment("");
	oci_Epidemiology.setResourceLabel("Epidemiology");
	oci_Epidemiology.addSuperClass(ManagedIndividual.MY_URI);

	oci_Etiology.setResourceComment("");
	oci_Etiology.setResourceLabel("Etiology");
	oci_Etiology.addSuperClass(ManagedIndividual.MY_URI);

	oci_Patogeny.setResourceComment("");
	oci_Patogeny.setResourceLabel("Patogeny");
	oci_Patogeny.addSuperClass(ManagedIndividual.MY_URI);

	oci_Sympthom.setResourceComment("");
	oci_Sympthom.setResourceLabel("Sympthom");
	oci_Sympthom.addSuperClass(ManagedIndividual.MY_URI);

	oci_Pronostic.setResourceComment("");
	oci_Pronostic.setResourceLabel("Sympthom");
	oci_Pronostic.addSuperClass(ManagedIndividual.MY_URI);

	oci_Diagnostic.setResourceComment("");
	oci_Diagnostic.setResourceLabel("Sympthom");
	oci_Diagnostic.addSuperClass(ManagedIndividual.MY_URI);

	oci_Disease.setResourceComment("");
	oci_Disease.setResourceLabel("Disease");
	oci_Disease.addSuperClass(ManagedIndividual.MY_URI);

	oci_Disease.addDatatypeProperty(Disease.PROP_NAME).setFunctional();
	oci_Disease.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Disease.PROP_NAME,
			TypeMapper.getDatatypeURI(String.class), 1, 1));

	oci_Disease.addObjectProperty(Disease.PROP_SYMPTHOMS);
	oci_Disease.addRestriction(MergedRestriction.getAllValuesRestriction(
		Disease.PROP_SYMPTHOMS, Sympthom.MY_URI));

	oci_Disease.addObjectProperty(Disease.PROP_DISEASE_STATUS)
		.setFunctional();
	oci_Disease.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Disease.PROP_DISEASE_STATUS,
			DiseaseSeverityStatus.MY_URI, 1, 1));

	oci_Disease.addObjectProperty(Disease.PROP_ETIOLOGY);
	oci_Disease.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Disease.PROP_ETIOLOGY,
			Etiology.MY_URI, 1, 1));

	oci_Disease.addObjectProperty(Disease.PROP_PATOGENY);
	oci_Disease.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Disease.PROP_PATOGENY,
			Patogeny.MY_URI, 1, 1));

	oci_Disease.addObjectProperty(Disease.PROP_EPIDEMIOLOGY);
	oci_Disease.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Disease.PROP_EPIDEMIOLOGY, Epidemiology.MY_URI, 1, 1));

	oci_Disease.addObjectProperty(Disease.PROP_DIAGNOSTIC);
	oci_Disease.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Disease.PROP_DIAGNOSTIC, Diagnostic.MY_URI, 1, 1));

	oci_Disease.addObjectProperty(Disease.PROP_PRONOSTIC);
	oci_Disease.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(Disease.PROP_PRONOSTIC,
			Pronostic.MY_URI, 1, 1));

	oci_Disease.addDatatypeProperty(Disease.PROP_CONTAGIOUS)
		.setFunctional();
	oci_Disease.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Disease.PROP_CONTAGIOUS, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));

	oci_CertainInfectiousParasiticDisease.setResourceComment("");
	oci_CertainInfectiousParasiticDisease.setResourceLabel("");
	oci_CertainInfectiousParasiticDisease.addSuperClass(Disease.MY_URI);

	oci_CirculatorySystemDisease.setResourceComment("");
	oci_CirculatorySystemDisease.setResourceLabel("");
	oci_CirculatorySystemDisease.addSuperClass(Disease.MY_URI);

	oci_DigestiveSystemDisease.setResourceComment("");
	oci_DigestiveSystemDisease.setResourceLabel("");
	oci_DigestiveSystemDisease.addSuperClass(Disease.MY_URI);

	oci_MentalDisorder.setResourceComment("");
	oci_MentalDisorder.setResourceLabel("");
	oci_MentalDisorder.addSuperClass(Disease.MY_URI);

	oci_Neoplasms.setResourceComment("");
	oci_Neoplasms.setResourceLabel("");
	oci_Neoplasms.addSuperClass(Disease.MY_URI);

	oci_NervousSystemDisease.setResourceComment("");
	oci_NervousSystemDisease.setResourceLabel("");
	oci_NervousSystemDisease.addSuperClass(Disease.MY_URI);

	oci_RespiratorySystemDisease.setResourceComment("");
	oci_RespiratorySystemDisease.setResourceLabel("");
	oci_RespiratorySystemDisease.addSuperClass(Disease.MY_URI);

	oci_AcuteRheumaticFever.setResourceComment("");
	oci_AcuteRheumaticFever.setResourceLabel("");
	oci_AcuteRheumaticFever.addSuperClass(CirculatorySystemDisease.MY_URI);

	oci_HypertensiveDisease.setResourceComment("");
	oci_HypertensiveDisease.setResourceLabel("");
	oci_HypertensiveDisease.addSuperClass(CirculatorySystemDisease.MY_URI);

	oci_IschemicHeartDisease.setResourceComment("");
	oci_IschemicHeartDisease.setResourceLabel("");
	oci_IschemicHeartDisease.addSuperClass(CirculatorySystemDisease.MY_URI);

	oci_OtherCirculatorySystemDisease.setResourceComment("");
	oci_OtherCirculatorySystemDisease.setResourceLabel("");
	oci_OtherCirculatorySystemDisease
		.addSuperClass(CirculatorySystemDisease.MY_URI);

	oci_HeartFailure.setResourceComment("");
	oci_HeartFailure.setResourceLabel("");
	oci_HeartFailure.addSuperClass(OtherCirculatorySystemDisease.MY_URI);
    }
}
