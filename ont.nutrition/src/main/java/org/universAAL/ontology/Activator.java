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

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.nutrition.NutritionOntology;

//You need an Activator in your ontology bundle because it must be started...
public class Activator implements BundleActivator {

    static BundleContext context = null;

    NutritionOntology nutritionOntology = new NutritionOntology();

    public void start(BundleContext context) throws Exception {
    	System.out.println("Nutrition ontology starting");
		Activator.context = context;
		boolean res = OntologyManagement.getInstance().register(nutritionOntology);
		System.out.println("Nutri: ontology registered: "+res);
		System.out.println("Nutrition ontology started");
    }

    public void stop(BundleContext arg0) throws Exception {
    	System.out.println("Nutrition ontology bundle stopping");
	OntologyManagement.getInstance().unregister(nutritionOntology);
	System.out.println("Nutrition ontology bundle stopped");
    }
    
    /*
    public void start(BundleContext context) throws Exception {
		Activator.context = context;
		System.out.println("Nutrition ontology starting...");
		// Every class of the Nutrition ontology, order matters
		// enumerations first
		Class.forName(DishCategory.class.getName());
		Class.forName(FoodCategory.class.getName());
		Class.forName(FoodSubCategory.class.getName());
		Class.forName(DayOfWeek.class.getName());
		Class.forName(MealCategory.class.getName());
		
		// concepts
		Class.forName(Food.class.getName());
		Class.forName(MeasureUnit.class.getName());
		Class.forName(Ingredient.class.getName());
		Class.forName(ShoppingList.class.getName());
		Class.forName(Recipe.class.getName());
		Class.forName(Dish.class.getName());
		Class.forName(Meal.class.getName());
		Class.forName(MenuDay.class.getName());
		
		// service
		Class.forName(NutritionService.class.getName());
		
		System.out.println("Nutrition ontology started");
    }

    public void stop(BundleContext arg0) throws Exception {
	// You don´t need to do anything here...
    	System.out.println("Nutrition ontology bundle stop.");
    }
    */
}
