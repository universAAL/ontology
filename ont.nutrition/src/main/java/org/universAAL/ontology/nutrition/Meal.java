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

public class Meal extends ManagedIndividual {

	public static final String NAMESPACE = NutritionOntology.NAMESPACE;
	public static final String MY_URI = Meal.NAMESPACE + "Meal";

	//property list
	public static final String PROP_ID;					// Integer
    public static final String PROP_MEAL_CATEGORY;			// MealCategory
    public static final String PROP_DISHES;				// Dish
    
    static {
		// property names
    	PROP_ID 					= Meal.NAMESPACE + "id";
		PROP_MEAL_CATEGORY			= Meal.NAMESPACE + "mealCategory";
		PROP_DISHES 				= Meal.NAMESPACE + "hasDishes";
    }

    public Meal() { }
    public Meal(String uri) { super(uri); }

	public int getPropSerializationType(String propURI) {
		return ManagedIndividual.PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true;
	}
	
	/*
	 * GETTERS & SETTERS
	 */
	
	// ID
	public int getID() {
		Integer v = (Integer) props.get(PROP_ID);
		return v.intValue();
	}
	
	public void setID(int id) {
		this.props.put(PROP_ID, new Integer(id));
	}
	
	// DISHES
	public Dish[] getDishes() {
		Dish[] v = (Dish[]) props.get(PROP_DISHES);
		return v;
	}
	
	public void setDishes(Dish[] dishes) {
		if (dishes!=null)
			this.props.put(PROP_DISHES, dishes);
	}
	
	// MEAL CATEGORY
	public MealCategory getMealCategory() {
		MealCategory v = (MealCategory)props.get(PROP_MEAL_CATEGORY);
		return v;
	}
	
	public void setMealCategory(String value) {
		System.out.println("Set mealCat: "+value);
		this.props.put(PROP_MEAL_CATEGORY, MealCategory.getMealCategoryByValue(value));
	}
	
	public void setMealCategory(int value) {
		this.props.put(PROP_MEAL_CATEGORY, MealCategory.getMealCategoryByOrder(value));
	}
	
	public void setMealCategory(MealCategory dc) {
		this.props.put(PROP_MEAL_CATEGORY, dc);
	}
	
	public String getClassURI() {
		return MY_URI;
	}
}