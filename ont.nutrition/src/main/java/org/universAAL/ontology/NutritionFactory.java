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

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.nutrition.Dish;
import org.universAAL.ontology.nutrition.Food;
import org.universAAL.ontology.nutrition.FoodCategory;
import org.universAAL.ontology.nutrition.FoodSubCategory;
import org.universAAL.ontology.nutrition.Ingredient;
import org.universAAL.ontology.nutrition.Meal;
import org.universAAL.ontology.nutrition.MenuDay;
import org.universAAL.ontology.nutrition.NutritionOntology;
import org.universAAL.ontology.nutrition.NutritionService;
import org.universAAL.ontology.nutrition.Recipe;
import org.universAAL.ontology.nutrition.ShoppingList;

/**
 * @author hecgamar
 * 
 */
public class NutritionFactory extends ResourceFactoryImpl {
	// private static final int NAMESPACE_LENGTH = LIGHTING_NAMESPACE.length();
	// private static final String PROP_ORIG_INDIVIDUAL = LIGHTING_NAMESPACE
	// + LightingFactory.class.hashCode();

	public NutritionFactory() {
	}
	
	public static final int FactoryIndex_NutritionService = 0;
	public static final int FactoryIndex_Recipe = 1;
	public static final int FactoryIndex_Food = 2;
	public static final int FactoryIndex_Dish = 3;
	public static final int FactoryIndex_MenuDay = 4;
	public static final int FactoryIndex_Ingredient = 5;
	public static final int FactoryIndex_ShoppingList = 6;
	public static final int FactoryIndex_Meal = 7;
	public static final int FactoryIndex_FoodSubCategory = 8;
	public static final int FactoryIndex_FoodCategory = 9;

	public Resource createInstance(String classURI, String instanceURI,
			int factoryIndex) {
		System.out.println("Nutri: createInstance: " + classURI + " "
				+ instanceURI);
		/*
		 * General comment for this implementation: we assume that this method
		 * is only called by the static method Resource.getResource() => we
		 * assume that the case of registered named resources is already handled
		 * there
		 */

		switch (factoryIndex) {
		case NutritionFactory.FactoryIndex_NutritionService:
			System.out.println("index: " + factoryIndex
					+ "Creating ontology instance for Nutrition Service");
			return new NutritionService(instanceURI);
		case NutritionFactory.FactoryIndex_Dish:
			System.out.println("index: " + factoryIndex
					+ "Creating ontology instance for Dish");
			return new Dish(instanceURI);
		case NutritionFactory.FactoryIndex_Food:
			System.out.println("index: " + factoryIndex
					+ "Creating ontology instance for Food");
			return new Food(instanceURI);
		case NutritionFactory.FactoryIndex_Ingredient:
			System.out.println("index: " + factoryIndex
					+ "Creating ontology instance for Ingredient");
			return new Ingredient(instanceURI);
		case NutritionFactory.FactoryIndex_Meal:
			System.out.println("index: " + factoryIndex
					+ "Creating ontology instance for Meal");
			return new Meal(instanceURI);
		case NutritionFactory.FactoryIndex_MenuDay:
			System.out.println("index: " + factoryIndex
					+ "Creating ontology instance for MenuDay");
			return new MenuDay(instanceURI);
		case NutritionFactory.FactoryIndex_Recipe:
			System.out.println("index: " + factoryIndex
					+ "Creating ontology instance for Recipe");
			return new Recipe(instanceURI);
		case NutritionFactory.FactoryIndex_ShoppingList:
			System.out.println("index: " + factoryIndex
					+ "Creating ontology instance for ShoppingList");
			return new ShoppingList(instanceURI);
		case NutritionFactory.FactoryIndex_FoodSubCategory:
			System.out.println("index: " + factoryIndex
					+ "Creating ontology instance for Foodsubacategory");
			return new FoodSubCategory(instanceURI);
		case NutritionFactory.FactoryIndex_FoodCategory:
			System.out.println("index: " + factoryIndex
					+ "Creating ontology instance for FoodCategory");
			return new FoodCategory(instanceURI);
		}
		System.out.println("Could not create ontology instance for index: "
				+ factoryIndex);

		// if (classURI == null || !classURI.startsWith(LIGHTING_NAMESPACE))
		// return null;
		// String className = classURI.substring(NAMESPACE_LENGTH);
		// if (className.equals("Beaming"))
		// return new Beaming(instanceURI);
		// if (className.equals("BeamingSource"))
		// return new BeamingSource(instanceURI);
		// if (className.equals("BlinkableBeaming"))
		// return new BlinkableBeaming(instanceURI);
		// if (className.equals("BlinkableBeamingSource"))
		// return new BlinkableBeamingSource(instanceURI);
		// if (className.equals("BlinkableLighting"))
		// return new BlinkableLighting(instanceURI);
		// if (className.equals("BlinkableLightSource"))
		// return new BlinkableLightSource(instanceURI);
		// if (className.equals("Lighting"))
		// return new Lighting(instanceURI);
		// if (className.equals("LightSource"))
		// return new LightSource(instanceURI);
		return null;
	}

	public Resource castAs(Resource r, String classURI) {
		/*
		 * General comment for this implementation: we assume that the
		 * non-static method Resource#castAs(String) will call this method
		 */
		System.out.println("Nutri: castAs: " + classURI);

		if (classURI == null
				|| !classURI.startsWith(NutritionOntology.NAMESPACE))
			return null;

		String target = classURI;
		// Object orig =
		// r.getProperty(PROP_ORIG_INDIVIDUAL);

		/*
		 * if (target.equals("Recipe")) if (r instanceof Beaming || r instanceof
		 * BlinkableBeaming) return r; else if (r instanceof BlinkableLighting
		 * && orig instanceof Beaming) return (Resource) orig; else return null;
		 * 
		 * if (target.equals("BeamingSource")) if (r instanceof BeamingSource ||
		 * r instanceof BlinkableBeamingSource) return r; else if (r instanceof
		 * BlinkableLightSource && orig instanceof BeamingSource) return
		 * (Resource) orig; else return null;
		 * 
		 * if (target.equals("BlinkableBeaming")) if (r instanceof
		 * BlinkableBeaming) return r; else if (r instanceof BlinkableLighting
		 * && orig instanceof BlinkableBeaming) return (Resource) orig; else
		 * return null;
		 * 
		 * if (target.equals("BlinkableBeamingSource")) if (r instanceof
		 * BlinkableBeamingSource) return r; else if (r instanceof
		 * BlinkableLightSource && orig instanceof BlinkableBeamingSource)
		 * return (Resource) orig; else return null;
		 * 
		 * if (target.equals("BlinkableLighting")) if (r instanceof
		 * BlinkableLighting) return r; else if (r instanceof BlinkableBeaming)
		 * { Resource result = new BlinkableLighting(r.getURI());
		 * r.copyTo(result); // method to be added to the Resource class
		 * result.setProperty(PROP_ORIG_INDIVIDUAL, r); return result; } else
		 * return null;
		 * 
		 * if (target.equals("BlinkableLightSource")) if (r instanceof
		 * BlinkableLightSource) return r; else if (r instanceof
		 * BlinkableBeamingSource) { Resource result = new
		 * BlinkableLightSource(r.getURI()); r.copyTo(result); // method to be
		 * added to the Resource class result.setProperty(PROP_ORIG_INDIVIDUAL,
		 * r); return result; } else return null;
		 * 
		 * if (target.equals("Lighting")) if (r instanceof Lighting) return r;
		 * else return null;
		 * 
		 * if (target.equals("LightSource")) if (r instanceof LightSource)
		 * return r; else return null;
		 */

		return null;
	}
}
