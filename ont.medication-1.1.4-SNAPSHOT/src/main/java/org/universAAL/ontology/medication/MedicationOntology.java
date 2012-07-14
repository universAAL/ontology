/*	Copyright 2008-2010 Fraunhofer IGD, http://www.igd.fraunhofer.de
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
package org.universAAL.ontology.medication;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.ontology.MedicationFactory;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.phThing.PhysicalContainer;
import org.universAAL.ontology.phThing.PhysicalThing;

/**
 * The Ontology.
 * 
 * @author Carsten Stockloew
 */

public final class MedicationOntology extends Ontology {

    private static MedicationFactory factory = new MedicationFactory();

    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX
	    + "Medication.owl#";

    public MedicationOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("The upper ontology defining the most general concepts from the medication realm. ");
	r.setResourceLabel("Medication");
	addImport(DataRepOntology.NAMESPACE);
	addImport(PhThingOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load DrugPackage
	oci = createNewOntClassInfo(DrugPackage.MY_URI, factory, 0);
	oci.setResourceComment("The package of a medication drug");
	oci.setResourceLabel("Drug Package");
	oci.addSuperClass(PhysicalThing.MY_URI);

	// load PillDispenser
	oci = createNewOntClassInfo(PillDispenser.MY_URI, factory, 1);
	oci
		.setResourceComment("An automatic pill dispenser, container of drug packages");
	oci.setResourceLabel("Pill Dispenser");
	oci.addSuperClass(PhysicalContainer.MY_URI);
    }
}
