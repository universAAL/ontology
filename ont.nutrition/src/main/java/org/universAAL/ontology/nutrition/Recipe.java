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

/**
 * Ontological representation of a light source. Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author hecgamar
 * 
 */
public class Recipe extends ManagedIndividual {
	public static final String MY_URI = NutritionOntology.NAMESPACE + "Recipe";
	
	//properties
	public static final String PROP_ID = NutritionOntology.NAMESPACE
			+ "id"; //integer
	public static final String PROP_NAME = NutritionOntology.NAMESPACE
			+ "name"; //String
	public static final String PROP_PROCEDURE = NutritionOntology.NAMESPACE
			+ "procedure"; //String
	public static final String PROP_IS_FAVOURITE = NutritionOntology.NAMESPACE
			+ "isFavourite"; //Boolean
	public static final String PROP_PICTURE = NutritionOntology.NAMESPACE
			+ "picture"; // ¿?
	public static final String PROP_DISH_CATEGORY = NutritionOntology.NAMESPACE
			+ "dish_category"; // Enum
	public static final String PROP_INGREDIENTS = NutritionOntology.NAMESPACE
			+ "ingredients"; //Ingredient
	
	public Recipe() {
		super();
	}

	public Recipe(String uri) {
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
		/*
		return (PROP_AMBIENT_COVERAGE.equals(propURI) || PROP_PHYSICAL_LOCATION // PROP_SOURCE_LOCATION
				.equals(propURI)) ? PROP_SERIALIZATION_REDUCED
				: PROP_SERIALIZATION_FULL;
				*/
		return PROP_SERIALIZATION_OPTIONAL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.universAAL.middleware.owl.ManagedIndividual#isWellFormed()
	 */
	public boolean isWellFormed() {
		/*
		return props.containsKey(PROP_HAS_TYPE)
				&& props.containsKey(PROP_SOURCE_BRIGHTNESS)
				&& props.containsKey(PROP_PHYSICAL_LOCATION);
				*/
		return true;
	}
	
	/*
	 * GETTERS AND SETTERS
	 */
	// NAME
		public String getName() {
			String v = (String) props.get(PROP_NAME);
			return v;
		}
		
		public void setName(String name) {
			if (name!=null)
				this.props.put(PROP_NAME, name);
		}
		
		// PROCEDURE
		public String getProcedure() {
			String v = (String) props.get(PROP_PROCEDURE);
			return v;
		}
		
		public void setProcedure(String procedure) {
			if (procedure!=null)
				this.props.put(PROP_PROCEDURE, procedure);
		}
		
		// ID
		public int getID() {
			Integer v = (Integer) props.get(PROP_ID);
			return v.intValue();
		}
		
		public void setID(int id) {
			this.props.put(PROP_ID, new Integer(id));
		}
		
		// isFAVOURITE
		public boolean isFavourite() {
			Boolean v = (Boolean) props.get(PROP_IS_FAVOURITE);
			return v.booleanValue();
		}
		
		public void setFavourite(boolean value) {
			this.props.put(PROP_IS_FAVOURITE, new Boolean(value));
		}
		
		// DISH CATEGORY
		public DishCategory getDishCategory() {
			DishCategory v = (DishCategory)props.get(PROP_DISH_CATEGORY);
			return v;
		}
		
		public void setDishCategory(int value) {
			this.props.put(PROP_DISH_CATEGORY, DishCategory.getDishCategoriesByOrder(value));
		}
		
		public void setDishCategory(DishCategory dc) {
			this.props.put(PROP_DISH_CATEGORY, dc);
		}
		
		// INGREDIENTS
		public Ingredient[] getIngredients() {
			Ingredient[] i = (Ingredient[]) this.props.get(PROP_INGREDIENTS);
			return i;
		}
		
		public void setIngredients(Ingredient[] ingredients) {
			this.props.put(PROP_INGREDIENTS, ingredients);
		}
		

		// PICTURE
		public String getPicture() {
			String v = (String) props.get(PROP_PICTURE);
			return v;
		}
		
		public void setPicture(String pictureUrl) {
			if (pictureUrl!=null)
				this.props.put(PROP_PICTURE, pictureUrl);
		}
}
