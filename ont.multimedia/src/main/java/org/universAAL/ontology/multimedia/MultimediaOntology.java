/*	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
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
package org.universAAL.ontology.multimedia;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.MultimediaFactory;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;

/**
 * The Ontology.
 * 
 * @author Carsten Stockloew
 */

public final class MultimediaOntology extends Ontology {

    private static MultimediaFactory factory = new MultimediaFactory();

    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX
	    + "Multimedia.owl#";

    public MultimediaOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("Ontology for multimedia devices, displays and equipment.");
	r.setResourceLabel("Multimedia");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ServiceBusOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load TV
	oci = createNewOntClassInfo(TV.MY_URI, factory, 0);
	oci.setResourceComment("The class of all TVs.");
	oci.setResourceLabel("TV");
	oci.addSuperClass(Device.MY_URI);
	oci.addDatatypeProperty(TV.PROP_IS_ON_PROG).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(TV.PROP_IS_ON_PROG,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(TV.PROP_IS_ON_COMM).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(TV.PROP_IS_ON_COMM,
			TypeMapper.getDatatypeURI(Boolean.class), 1, 1));

	// load Stereoset
	oci = createNewOntClassInfo(Stereoset.MY_URI, factory, 1);
	oci.setResourceComment("The class of all Stereosets.");
	oci.setResourceLabel("Stereoset");
	oci.addSuperClass(Device.MY_URI);
	oci.addDatatypeProperty(Stereoset.PROP_IS_ON_PROG).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Stereoset.PROP_IS_ON_PROG, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
	oci.addDatatypeProperty(Stereoset.PROP_IS_ON_COMM).setFunctional();
	oci.addRestriction(MergedRestriction
		.getAllValuesRestrictionWithCardinality(
			Stereoset.PROP_IS_ON_COMM, TypeMapper
				.getDatatypeURI(Boolean.class), 1, 1));
    }
}
