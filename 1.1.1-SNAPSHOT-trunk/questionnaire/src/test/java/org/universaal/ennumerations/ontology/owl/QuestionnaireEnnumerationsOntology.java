/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es 
 Universidad Politécnica de Madrid
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

package org.universaal.ennumerations.ontology.owl;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.ontology.ProfileOntology;
import org.universaal.ennumerations.ontology.QuestionnaireEnummerationsOntologyFactory;
import org.universaal.ontology.QuestionnaireOntologyFactory;

public class QuestionnaireEnnumerationsOntology extends Ontology{

	private static  QuestionnaireEnummerationsOntologyFactory factory = new QuestionnaireEnummerationsOntologyFactory();
	public static final String NAMESPACE ="http://ontology.universaal.org/QuestionnaireEnnumerationsOntology#";

	public  QuestionnaireEnnumerationsOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("The ontology defining the most general concepts dealing with light sources and their control.");
		r.setResourceLabel("Lighting");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ProfileOntology.NAMESPACE);

		OntClassInfoSetup oci;

		// ******* Enumeration classes of the ontology ******* //

		// load Parts of day ennumeration
		oci = createNewAbstractOntClassInfo(PartsOfDay.MY_URI);
		oci.setResourceComment("");
		oci.setResourceLabel("PartsOfDay");
		oci.toEnumeration(new ManagedIndividual[] {
				PartsOfDay.inTheMorning, PartsOfDay.inTheAfternoon, PartsOfDay.inTheAfternoon});



	}
}
