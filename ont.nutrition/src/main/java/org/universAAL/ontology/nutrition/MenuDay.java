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

public class MenuDay extends ManagedIndividual {

	public static final String NAMESPACE = NutritionOntology.NAMESPACE;
	public static final String MY_URI = MenuDay.NAMESPACE + "MenuDay";

	//property list
	public static final String PROP_ID;					// Integer
    public static final String PROP_DAYOFWEEK;			// DayOfWeek
    public static final String PROP_MEALS;				// Meal
    
    static {
		// property names
    	PROP_ID 					= MenuDay.NAMESPACE + "id";
		PROP_DAYOFWEEK				= MenuDay.NAMESPACE + "dayOfWeek";
		PROP_MEALS 					= MenuDay.NAMESPACE + "hasMeals";
    }

    public MenuDay() { }
    public MenuDay(String uri) { super(uri); }

	public int getPropSerializationType(String propURI) {
		return ManagedIndividual.PROP_SERIALIZATION_FULL;
//		return PROP_SERIALIZATION_OPTIONAL;
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
	
	// MEALS
	public Meal[] getMeals() {
		Meal[] v = (Meal[]) props.get(PROP_MEALS);
		return v;
	}
	
	public void setMeals(Meal[] meals) {
		if (meals!=null)
			this.props.put(PROP_MEALS, meals);
	}
	
	public String getClassURI() {
		return MY_URI;
	}
	
	// DAY OF WEEK
	public DayOfWeek getDayOfWeek() {
		DayOfWeek v = (DayOfWeek)props.get(PROP_DAYOFWEEK);
		return v;
	}
	
	public void setDayOfWeek(int value) {
		this.props.put(PROP_DAYOFWEEK, DayOfWeek.getDaysOfWeekByOrder(value));
	}
	
	public void setDayOfWeek(DayOfWeek dc) {
		this.props.put(PROP_DAYOFWEEK, dc);
	}
	
}