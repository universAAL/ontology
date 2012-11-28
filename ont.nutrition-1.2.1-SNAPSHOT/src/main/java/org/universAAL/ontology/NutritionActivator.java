/*
	Copyright 2011-2012 Itaca-TSB, http://www.tsb.upv.es
	Tecnologías para la Salud y el Bienestar 
	
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

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.nutrition.NutritionOntology;

//You need an NutritionActivator in your ontology bundle because it must be started...
public class NutritionActivator implements ModuleActivator {

    private NutritionOntology nutritionOntology = new NutritionOntology();

    public void start(ModuleContext context) throws Exception {
	System.out.println("Nutrition ontology starting");
	boolean res = OntologyManagement.getInstance().register(
		nutritionOntology);
	System.out.println("Nutri: ontology registered: " + res);
	System.out.println("Nutrition ontology started");
    }

    public void stop(ModuleContext arg0) throws Exception {
	System.out.println("Nutrition ontology bundle stopping");
	OntologyManagement.getInstance().unregister(nutritionOntology);
	System.out.println("Nutrition ontology bundle stopped");
    }
}
