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

import org.universAAL.middleware.owl.ManagedIndividual;

public class Dish extends ManagedIndividual {

	public static final String NAMESPACE = NutritionOntology.NAMESPACE;
	public static final String MY_URI = Dish.NAMESPACE + "Dish";

	// property list
	public static final String PROP_ID; // Integer
	public static final String PROP_NAME; // String
	public static final String PROP_CONTAINS_PROCEDURE; // Boolean
	public static final String PROP_CONTAINS_RECIPE; // Boolean
	public static final String PROP_PICTURE; // String
	public static final String PROP_DISH_CATEGORY; // DishCategory
	public static final String PROP_RECIPE; // Recipe

	static {
		// property names
		PROP_ID = Dish.NAMESPACE + "id";
		PROP_NAME = Dish.NAMESPACE + "name";
		PROP_PICTURE = Dish.NAMESPACE + "hasPicture";
		PROP_CONTAINS_PROCEDURE = Dish.NAMESPACE + "containsProcedure";
		PROP_CONTAINS_RECIPE = Dish.NAMESPACE + "containsRecipe";
		PROP_DISH_CATEGORY = Dish.NAMESPACE + "dishCategory";
		PROP_RECIPE = Dish.NAMESPACE + "hasRecipe";

	}

	public Dish() {
	}

	public Dish(String uri) {
		super(uri);
	}

	public int getPropSerializationType(String propURI) {
		return ManagedIndividual.PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}

	/*
	 * GETTERS & SETTERS
	 */

	// NAME
	public String getName() {
		String v = (String) props.get(PROP_NAME);
		return v;
	}

	public void setName(String name) {
		if (name != null)
			this.props.put(PROP_NAME, name);
	}

	// PROCEDURE
	public boolean getContainsProcedure() {
		Boolean v = (Boolean) props.get(PROP_CONTAINS_PROCEDURE);
		return v.booleanValue();
	}

	public void setProcedure(boolean contains_procedure) {
		this.props
				.put(PROP_CONTAINS_PROCEDURE, new Boolean(contains_procedure));
	}

	// ID
	public int getID() {
		Integer v = (Integer) props.get(PROP_ID);
		return v.intValue();
	}

	public void setID(int id) {
		this.props.put(PROP_ID, new Integer(id));
	}

	// CONTAINS_RECIPE
	public boolean getContainsRecipe() {
		Boolean v = (Boolean) props.get(PROP_CONTAINS_RECIPE);
		return v.booleanValue();
	}

	public void setContainsRecipe(boolean value) {
		this.props.put(PROP_CONTAINS_RECIPE, new Boolean(value));
	}

	// DISH CATEGORY
	public DishCategory getDishCategory() {
		DishCategory v = (DishCategory) props.get(PROP_DISH_CATEGORY);
		return v;
	}

	public void setDishCategory(int value) {
		this.props.put(PROP_DISH_CATEGORY,
				DishCategory.getDishCategoriesByOrder(value));
	}

	public void setDishCategory(DishCategory dc) {
		this.props.put(PROP_DISH_CATEGORY, dc);
	}

	// PICTURE
	public String getPicture() {
		String v = (String) props.get(PROP_PICTURE);
		return v;
	}

	public void setPicture(String pictureUrl) {
		if (pictureUrl != null)
			this.props.put(PROP_PICTURE, pictureUrl);
	}

	// RECIPE
	public Recipe getRecipe() {
		Recipe v = (Recipe) props.get(PROP_RECIPE);
		return v;
	}

	public void setRecipe(Recipe recipe) {
		if (recipe != null)
			this.props.put(PROP_RECIPE, recipe);
	}
	
	public String getClassURI() {
		return MY_URI;
	}
}