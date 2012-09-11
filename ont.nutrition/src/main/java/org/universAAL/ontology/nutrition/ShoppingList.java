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

public class ShoppingList extends ManagedIndividual {

	public static final String NAMESPACE = NutritionOntology.NAMESPACE;
	public static final String MY_URI = ShoppingList.NAMESPACE + "ShoppingList";

	//property list
    public static final String PROP_ID;			// Integer
    public static final String PROP_DATEINTERVAL;			// String
    public static final String PROP_INGREDIENTS;	// Ingredient
    
    static {
		// property names
    	PROP_ID 			= ShoppingList.NAMESPACE + "id";
    	PROP_DATEINTERVAL 			= ShoppingList.NAMESPACE + "dateinterval";
		PROP_INGREDIENTS	= ShoppingList.NAMESPACE + "ingredient";
    }

    public ShoppingList() { }
    public ShoppingList(String uri) { super(uri); }

	public int getPropSerializationType(String propURI) {
		return ManagedIndividual.PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true;
	}
	
	/*
	 * GETTERS & SETTERS
	 */
	
	// DATE INTERVAL
	public String getDateInterval() {
		String v = (String) props.get(PROP_DATEINTERVAL);
		return v;
	}
	
	public void setDateInterval(String date) {
		if (date!=null)
			this.props.put(PROP_DATEINTERVAL, date);
	}
	
	// ID
	public int getID() {
		Integer v = (Integer) props.get(PROP_ID);
		return v.intValue();
	}
	
	public void setID(int id) {
		this.props.put(PROP_ID, new Integer(id));
	}
	
	// INGREDIENTS
	public Ingredient[] getIngredients() {
		Ingredient[] i = (Ingredient[]) this.props.get(PROP_INGREDIENTS);
		return i;
	}
	
	public void setIngredients(Ingredient[] ingredients) {
		this.props.put(PROP_INGREDIENTS, ingredients);
	}
	
	public String getClassURI() {
		return MY_URI;
	}

}