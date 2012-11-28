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

public class Ingredient extends ManagedIndividual {

	public static final String NAMESPACE = NutritionOntology.NAMESPACE;
	public static final String MY_URI = Ingredient.NAMESPACE + "Ingredient";

	//property list
	public static final String PROP_ID;			// Integer
    public static final String PROP_FOOD;			// Food
    public static final String PROP_QUANTITY;  	// String
    public static final String PROP_MEASURE_UNIT;  // MeasureUnit
    
    static {
		// property names
    	PROP_ID 			= Ingredient.NAMESPACE + "id";
    	PROP_FOOD 			= Ingredient.NAMESPACE + "has_food";
		PROP_QUANTITY		= Ingredient.NAMESPACE + "quantity";
		PROP_MEASURE_UNIT	= Ingredient.NAMESPACE + "measure_unit";
    }

    public Ingredient() { }
    public Ingredient(String uri) { super(uri); }

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
	
	// FOOD
	public Food getFood() {
		Food v = (Food) props.get(PROP_FOOD);
		return v;
	}
	
	public void setFood(Food food) {
		if (food!=null)
		this.props.put(PROP_FOOD, food);
	}
	
	//QUANTITY
	public String getQuantity() {
		return (String) this.props.get(PROP_QUANTITY);
	}
	
	public void setQuantity(String quantity) {
		this.props.put(PROP_QUANTITY, quantity);
	}
	
	// MEASURE UNIT
	public MeasureUnit getMeasureUnit() {
		MeasureUnit v = (MeasureUnit) props.get(PROP_MEASURE_UNIT);
		return v;
	}
	
	public void setMeasureUnit(MeasureUnit measure) {
		this.props.put(PROP_MEASURE_UNIT, measure);
	}
	
	public String getClassURI() {
		return MY_URI;
	}
}