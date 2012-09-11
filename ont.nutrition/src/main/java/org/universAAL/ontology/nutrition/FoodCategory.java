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

public class FoodCategory extends ManagedIndividual {

	public static final String NAMESPACE = NutritionOntology.NAMESPACE;
	public static final String MY_URI = FoodCategory.NAMESPACE + "FoodCategory";

	//property list
	public static final String PROP_ID;				// Integer
    public static final String PROP_NAME;				// String
    
    
    static {
		// property names
    	PROP_ID 				= FoodCategory.NAMESPACE + "id";
    	PROP_NAME				= FoodCategory.NAMESPACE + "name";
    }

    public FoodCategory() { }
    public FoodCategory(String uri) { super(uri); }

    /*
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (propURI.equals(PROP_ID))
         return Restriction.getAllValuesRestrictionWithCardinality(propURI,
	         TypeMapper.getDatatypeURI(Integer.class), 1, 1);
        if (propURI.equals(PROP_NAME))
            return Restriction.getAllValuesRestrictionWithCardinality(propURI,
   	         TypeMapper.getDatatypeURI(String.class), 0, 1);
	    return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}
	*/

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
	
	// NAME
	public String getName() {
		String v = (String) props.get(PROP_NAME);
		return v;
	}
	
	public void setName(String name) {
		this.props.put(PROP_NAME, new String(name));
	}
	
	public String getClassURI() {
		return MY_URI;
	}
}