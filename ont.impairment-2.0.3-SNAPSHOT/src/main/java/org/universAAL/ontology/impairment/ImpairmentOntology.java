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
package org.universAAL.ontology.impairment;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.ui.owl.AccessImpairment;
import org.universAAL.middleware.ui.owl.UIBusOntology;
import org.universAAL.ontology.ImpairmentFactory;

/**
 * The Ontology.
 * 
 * @author Carsten Stockloew
 */

public final class ImpairmentOntology extends Ontology {

    private static ImpairmentFactory factory = new ImpairmentFactory();

    public static final String NAMESPACE = Resource.uAAL_NAMESPACE_PREFIX
	    + "Impairment.owl#";

    public ImpairmentOntology() {
	super(NAMESPACE);
    }

    public void create() {
	Resource r = getInfo();
	r
		.setResourceComment("The ontology describing Impairment a user may have.");
	r.setResourceLabel("Impairment");
	addImport(DataRepOntology.NAMESPACE);
	addImport(ImpairmentOntology.NAMESPACE);
	addImport(UIBusOntology.NAMESPACE);

	OntClassInfoSetup oci;

	// load SightImpairment
	oci = createNewOntClassInfo(SightImpairment.MY_URI, factory, 0);
	oci
		.setResourceComment("Represents the level of the user's difficulty in seeing GUI-based system output.");
	oci.setResourceLabel("Sight Impairment");
	oci.addSuperClass(AccessImpairment.MY_URI);

	// load FarSightedness
	oci = createNewOntClassInfo(FarSightedness.MY_URI, factory, 1);
	oci
		.setResourceComment("Represents the level of the user's farsightedness.");
	oci.setResourceLabel("Farsightedness");
	oci.addSuperClass(SightImpairment.MY_URI);

	// load SpeakingImpairment
	oci = createNewOntClassInfo(SpeakingImpairment.MY_URI, factory, 2);
	oci
		.setResourceComment("Represents the level of the user's difficulty in speaking.");
	oci.setResourceLabel("Speaking Impairment");
	oci.addSuperClass(AccessImpairment.MY_URI);

	// load HearingImpairment
	oci = createNewOntClassInfo(HearingImpairment.MY_URI, factory, 3);
	oci
		.setResourceComment("Represents the level of the user's difficulty in hearing voice-based system output.");
	oci.setResourceLabel("Hearing Impairment");
	oci.addSuperClass(AccessImpairment.MY_URI);

	// load ColorBlindness
	oci = createNewOntClassInfo(ColorBlindness.MY_URI, factory, 4);
	oci
		.setResourceComment("Represents the level of the user's color-blindness.");
	oci.setResourceLabel("ColorBlindness");
	oci.addSuperClass(SightImpairment.MY_URI);

	// load NearSightedness
	oci = createNewOntClassInfo(NearSightedness.MY_URI, factory, 5);
	oci
		.setResourceComment("Represents the level of the user's nearsightedness.");
	oci.setResourceLabel("Nearsightedness");
	oci.addSuperClass(SightImpairment.MY_URI);

	// load Astigmatism
	oci = createNewOntClassInfo(Astigmatism.MY_URI, factory, 6);
	oci
		.setResourceComment("Represents the level of the user's astigmatism.");
	oci.setResourceLabel("Astigmatism");
	oci.addSuperClass(SightImpairment.MY_URI);

	// load PhysicalImpairment
	oci = createNewOntClassInfo(PhysicalImpairment.MY_URI, factory, 7);
	oci
		.setResourceComment("Represents the level of the user's difficulty in providing input by the hands, e.g. in using maus and keyboard.");
	oci.setResourceLabel("Physical Impairment");
	oci.addSuperClass(AccessImpairment.MY_URI);

	// load LightSensitivity
	oci = createNewOntClassInfo(LightSensitivity.MY_URI, factory, 8);
	oci
		.setResourceComment("Represents the level of the user's light-sensitivity.");
	oci.setResourceLabel("LightSensitivity");
	oci.addSuperClass(SightImpairment.MY_URI);

    }
}
