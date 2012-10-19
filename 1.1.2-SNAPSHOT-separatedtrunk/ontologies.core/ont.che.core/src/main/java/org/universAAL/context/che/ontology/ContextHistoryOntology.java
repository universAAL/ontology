/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	
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
package org.universAAL.context.che.ontology;

import javax.xml.datatype.Duration;

import org.universAAL.middleware.context.owl.ContextProvider;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.LongRestriction;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;

/**
 * Ontology main class that defines the ontology concepts.
 * 
 * @author alfiva
 * 
 */
public class ContextHistoryOntology extends Ontology {

    /**
     * Factory for serialization.
     */
    private static ContextHistoryFactory factory = new ContextHistoryFactory();

    /**
     * Ontology domain namespace.
     */
    public static final String NAMESPACE = "http://ontology.universAAL.org/ContextHistory.owl#";

    /**
     * Main constructor.
     * 
     * @param ontURI
     *            Domain namespace
     */
    public ContextHistoryOntology(String ontURI) {
	super(ontURI);
    }

    /**
     * Constructor that automatically sets namespace.
     */
    public ContextHistoryOntology() {
	super(NAMESPACE);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.universAAL.middleware.owl.Ontology#create()
     */
    public void create() {
	Resource r = getInfo();
	r.setResourceComment("The ontology defining the CHE concepts and services");
	r.setResourceLabel("CHE");
	addImport(DataRepOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load ContextEvent______________
	oci = createNewOntClassInfo(ContextEvent.MY_URI, factory, 0);
	oci.setResourceComment("Replicates ContextEvent as a ManagedIndividual");
	oci.setResourceLabel("Context Event (CHE)");
	oci.addSuperClass(ManagedIndividual.MY_URI);

	oci.addObjectProperty(ContextEvent.PROP_RDF_SUBJECT).setFunctional();
	// oci.addRestriction(MergedRestriction
	// .getAllValuesRestrictionWithCardinality(
	// ContextEvent.PROP_RDF_SUBJECT, Resource.MY_URI, 0, 1));

	oci.addObjectProperty(ContextEvent.PROP_RDF_PREDICATE).setFunctional();
	// oci.addRestriction(MergedRestriction
	// .getAllValuesRestrictionWithCardinality(
	// ContextEvent.PROP_RDF_PREDICATE, Property.MY_URI, 0, 1));

	oci.addObjectProperty(ContextEvent.PROP_RDF_OBJECT).setFunctional();
	// oci.addRestriction(MergedRestriction
	// .getAllValuesRestrictionWithCardinality(
	// ContextEvent.PROP_RDF_OBJECT, Resource.MY_URI, 0, 1));

	oci.addDatatypeProperty(ContextEvent.PROP_CONTEXT_TIMESTAMP)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ContextEvent.PROP_CONTEXT_TIMESTAMP,
			TypeMapper.getDatatypeURI(Long.class), 0, 1));

	oci.addDatatypeProperty(ContextEvent.PROP_CONTEXT_EXPIRATION_TIME)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ContextEvent.PROP_CONTEXT_EXPIRATION_TIME,
			TypeMapper.getDatatypeURI(Long.class), 0, 1));

	oci.addDatatypeProperty(ContextEvent.PROP_CONTEXT_CONFIDENCE)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ContextEvent.PROP_CONTEXT_CONFIDENCE,
			new LongRestriction(Long.valueOf(0), true, Long
				.valueOf(100), true), 0, 1));

	oci.addDatatypeProperty(ContextEvent.PROP_CONTEXT_PROVIDER)
		.setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			ContextEvent.PROP_CONTEXT_PROVIDER,
			ContextProvider.MY_URI, 0, 1));

	// load ContextHistoryService_________
	oci = createNewOntClassInfo(ContextHistoryService.MY_URI, factory, 1);
	oci.setResourceComment("The class of services managing Context Events in CHE");
	oci.setResourceLabel("Context History Services");
	oci.addSuperClass(Service.MY_URI);

	oci.addObjectProperty(ContextHistoryService.PROP_MANAGES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ContextHistoryService.PROP_MANAGES, ContextEvent.MY_URI));

	oci.addObjectProperty(ContextHistoryService.PROP_PROCESSES);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ContextHistoryService.PROP_PROCESSES,
		TypeMapper.getDatatypeURI(String.class)));

	oci.addObjectProperty(ContextHistoryService.PROP_TIMESTAMP_FROM);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ContextHistoryService.PROP_TIMESTAMP_FROM,
		TypeMapper.getDatatypeURI(Long.class)));

	oci.addObjectProperty(ContextHistoryService.PROP_TIMESTAMP_TO);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ContextHistoryService.PROP_TIMESTAMP_TO,
		TypeMapper.getDatatypeURI(Long.class)));

	oci.addObjectProperty(ContextHistoryService.PROP_DURATION_FROM);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ContextHistoryService.PROP_DURATION_FROM,
		TypeMapper.getDatatypeURI(Duration.class)));

	oci.addObjectProperty(ContextHistoryService.PROP_DURATION_TO);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ContextHistoryService.PROP_DURATION_TO,
		TypeMapper.getDatatypeURI(Duration.class)));

	oci.addObjectProperty(ContextHistoryService.PROP_RETURNS);
	oci.addRestriction(MergedRestriction.getAllValuesRestriction(
		ContextHistoryService.PROP_RETURNS,
		TypeMapper.getDatatypeURI(String.class)));
//
//	// Load ProvidedServices
//	oci = createNewOntClassInfo(ContextHistoryServices.MY_URI, factory, 2);
//	oci.setResourceComment("The specific services provided by CHE itself");
//	oci.setResourceLabel("Context History Services");
//	oci.addSuperClass(ContextHistoryService.MY_URI);

    }

}
