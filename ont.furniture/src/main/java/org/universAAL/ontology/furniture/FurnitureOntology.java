/*
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
package org.universAAL.ontology.furniture;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.ontology.FurnitureFactory;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.phThing.PhysicalThing;

/**
 * 
 * @author Carsten Stockloew
 * 
 */
public class FurnitureOntology extends Ontology {

	private static FurnitureFactory factory = new FurnitureFactory();

	public static final String NAMESPACE = Resource.NAMESPACE_PREFIX + "Furniture.owl#";

	public FurnitureOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("An ontology for describing furnitures in a home envinment.");
		r.setResourceLabel("Furniture");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ServiceBusOntology.NAMESPACE);
		addImport(PhThingOntology.NAMESPACE);

		OntClassInfoSetup oci;

		// load FurnitureType
		oci = createNewAbstractOntClassInfo(FurnitureType.MY_URI);
		oci.setResourceComment("Describes the type of a furniture.");
		oci.setResourceLabel("Furniture Type");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		oci.toEnumeration(new ManagedIndividual[] { FurnitureType.Chair, FurnitureType.Table, FurnitureType.Shelf,
				FurnitureType.Locker, FurnitureType.Sofa, FurnitureType.Bed, FurnitureType.Other });

		// load Furniture
		oci = createNewOntClassInfo(Furniture.MY_URI, factory, 0);
		oci.setResourceComment("A furniture");
		oci.setResourceLabel("Furniture");
		oci.addSuperClass(PhysicalThing.MY_URI);
		oci.addObjectProperty(Furniture.PROP_FURNITURE_TYPE);
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Furniture.PROP_FURNITURE_TYPE,
				FurnitureType.MY_URI, 0, 1));
	}
}
