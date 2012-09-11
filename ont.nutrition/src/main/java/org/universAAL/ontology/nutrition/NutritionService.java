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

package org.universAAL.ontology.nutrition;

import org.universAAL.middleware.service.owl.Service;

/**
 * Ontological service that handles nutrition. Methods included in this class
 * are the mandatory ones for representing an ontological service in Java
 * classes for uAAL.
 * 
 * @author hecgamar
 * 
 */
public class NutritionService extends Service {
	public static final String MY_URI = NutritionOntology.NAMESPACE
			+ "NutritionService";
	/**
	 * Obtains a Recipe given its ID (int)
	 */
	public static final String SERVICE_GET_RECIPE = NutritionOntology.NAMESPACE
			+ "getRecipe";
	public static final String SERVICE_GET_RECIPE_OUTPUT = NutritionOntology.NAMESPACE
			+ "getRecipeOutput";
	public static final String SERVICE_GET_RECIPE_INPUT = NutritionOntology.NAMESPACE
			+ "recipeID";

	/**
	 * Obtains today's Nutritional Menu
	 */
	public static final String SERVICE_GET_TODAY_MENUDAY = NutritionOntology.NAMESPACE
			+ "getTodayMenu";
	public static final String SERVICE_GET_TODAY_MENU_OUTPUT = NutritionOntology.NAMESPACE
			+ "getMenuDayOutput";
//	public static final String SERVICE_GET_TODAY_MENU_INPUT = NutritionOntology.NAMESPACE
//			+ "menuDayID";

	/**
	 * Used to access a Recipe
	 */
	public static final String PROP_OBTAINS_RECIPE = NutritionOntology.NAMESPACE
			+ "obtainsRecipe";
	/**
	 * Used to access a Menu
	 */
	public static final String PROP_OBTAINS_MENU = NutritionOntology.NAMESPACE
			+ "obtainsMenuDay";

	public NutritionService() {
		super();
	}

	public NutritionService(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
	 * (java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
//		if (PROP_OBTAINS_RECIPE.equals(propURI)) 
//			return PROP_SERIALIZATION_FULL;
//		if (PROP_OBTAINS_MENU.equals(propURI)) 
//			return PROP_SERIALIZATION_FULL;
//		return super.getPropSerializationType(propURI);
	}

	public boolean isWellFormed() {
		return true;
	}

}
