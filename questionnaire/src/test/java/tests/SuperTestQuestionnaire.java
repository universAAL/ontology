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
package tests;

import org.junit.Before;
import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.middleware.ui.owl.UIBusOntology;
import org.universAAL.ontology.ProfileOntology;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.PhThingOntology;
import org.universAAL.ontology.shape.ShapeOntology;
import org.universAAL.ontology.space.SpaceOntology;
import org.universaal.ennumerations.ontology.owl.QuestionnaireEnnumerationsOntology;
import org.universaal.ontology.owl.QuestionnaireOntology;

import junit.framework.TestCase;

public abstract class SuperTestQuestionnaire extends TestCase{
    
    static private boolean isAlreadyRegistered = false;

    public void registerAllOntologies(){
	if (!isAlreadyRegistered) {
	    OntologyManagement.getInstance().register(new DataRepOntology());
	    OntologyManagement.getInstance().register(new ServiceBusOntology ());
	    OntologyManagement.getInstance().register(new UIBusOntology());
	    OntologyManagement.getInstance().register(new LocationOntology());
	    OntologyManagement.getInstance().register(new ShapeOntology());
	    OntologyManagement.getInstance().register(new PhThingOntology());
	    OntologyManagement.getInstance().register(new SpaceOntology());
	    OntologyManagement.getInstance().register(new ProfileOntology());
	    OntologyManagement.getInstance().register(new QuestionnaireOntology());
	    OntologyManagement.getInstance().register(new QuestionnaireEnnumerationsOntology());
	    isAlreadyRegistered = true;
	}
    }
}
