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

// Enumerations can be used for giving value to a property that must have one 
// of a specific set of individual values.
// Currently only Enumerations "without meaning" are accepted, that is, 
// they are only represented by their type URI and individual URI. 
// They don´t have properties. Nevertheless, in theory it should be possible 
// to declare properties into enumerations, by merging them with the required 
// code of normal concepts (see MyConcept). However I have not checked it.
// All enumerations extend ManagedIndividual (I have not checked if it is 
// possible to extend other concepts or enumerations, but it seems possible)
public class MeasureUnit extends ManagedIndividual {
	//
	private static final String MY_NAMESPACE = NutritionOntology.NAMESPACE;
	// MY URI is the URI of this concept. It is mandatory for all.
	public static final String MY_URI = MY_NAMESPACE + "MeasureUnit";

	// These constants identify the possible values in your enumeration
	public static final int VALUE_MILLIGRAMS 	= 1;
	public static final int VALUE_GRAMS 		= 2;
	public static final int VALUE_KILOGRAMS 	= 3;
	public static final int VALUE_MILLILITERS	= 4;
	public static final int VALUE_LITERS 		= 5;
	public static final int VALUE_CUPS 			= 6;
	public static final int VALUE_TABLESPOONS 	= 7;
	public static final int VALUE_TEASPOONS 	= 8;
	public static final int VALUE_UNITS 		= 9;
	public static final int VALUE_HANDFULLS		= 10;

	// In instances (individuals) this has the value of one of the numeric
	// constants above
	private int order;

	// You have to give a name to each possible value. These names are used in
	// the URI of each individual (the possible values of the enumeration), so
	// they must follow the format for individual names: initial lower case,
	// without spaces (probably all in lower case, but must be confirmed)
	private static final String[] names = { "milligrams", "grams", "kilograms",
			"milliliters", "liters", "cups", "tablespoons", "teaspoons", "units", "handfulls" };

	// These are all the possible instances of your enumeration: the individuals
	public static final MeasureUnit MILLIGRAMS 		= new MeasureUnit(VALUE_MILLIGRAMS, 0);
	public static final MeasureUnit GRAMS 				= new MeasureUnit(VALUE_GRAMS, 1);
	public static final MeasureUnit KILOGRAMS 			= new MeasureUnit(VALUE_KILOGRAMS, 2);
	public static final MeasureUnit MILLILITERS 		= new MeasureUnit(VALUE_MILLILITERS, 3);
	public static final MeasureUnit LITERS 			= new MeasureUnit(VALUE_LITERS, 4);
	public static final MeasureUnit CUPS 				= new MeasureUnit(VALUE_CUPS, 5);
	public static final MeasureUnit TABLESPOONS 		= new MeasureUnit(VALUE_TABLESPOONS, 6);
	public static final MeasureUnit TEASPOONS 			= new MeasureUnit(VALUE_TEASPOONS, 7);
	public static final MeasureUnit UNITS 				= new MeasureUnit(VALUE_UNITS, 8);
	public static final MeasureUnit HANDFULLS 			= new MeasureUnit(VALUE_HANDFULLS, 9);

	// This methods returns the list of all class members guaranteeing that no
	// other members will be created after a call to this method.
	public static ManagedIndividual[] getEnumerationMembers() {
		return new ManagedIndividual[] { MILLIGRAMS, GRAMS, KILOGRAMS,
				LITERS, MILLILITERS, LITERS, CUPS, TABLESPOONS, TEASPOONS,
				UNITS, HANDFULLS};
	}

	// This method returns the individual of this enumeration that has the the
	// given URI.
	// DO NOT CHANGE THIS. Just copy it. It works like this for all
	// enumerations. (you have to change the namespace to your domain, though)
	public static ManagedIndividual getIndividualByURI(String instanceURI) {
		return (instanceURI != null && instanceURI.startsWith(MY_NAMESPACE)) ? valueOf(instanceURI
				.substring(MY_NAMESPACE.length()))
				: null;
	}

	// This is a helper method. You may choose not to include it, because it is
	// not used by the system. However it will surely be used by developers, so
	// its inclusion is recommended. It returns the matching individual of the
	// enumeration given its order (in the numeric constants)
	public static MeasureUnit getMeasureUnitByOrder(int order) {
		switch (order) {
		case VALUE_MILLIGRAMS:
			return MILLIGRAMS;
		case VALUE_GRAMS:
			return GRAMS;
		case VALUE_KILOGRAMS:
			return KILOGRAMS;
		case VALUE_MILLILITERS:
			return MILLILITERS;
		case VALUE_LITERS:
			return LITERS;
		case VALUE_CUPS:
			return CUPS;
		case VALUE_TABLESPOONS:
			return TABLESPOONS;
		case VALUE_TEASPOONS:
			return TEASPOONS;
		case VALUE_UNITS:
			return UNITS;
		case VALUE_HANDFULLS:
			return HANDFULLS;
		default:
			return null;
		}
	}

	// Returns the individual that matches the given name.
	public static final MeasureUnit valueOf(String name) {
		if (name == null)
			return null;

		// Remember to change the namespace to your domain...
		if (name.startsWith(MY_NAMESPACE))
			name = name.substring(MY_NAMESPACE.length());

		// Here you must use the first and last numeric constants you declared
		// at the beginning (lowest and highest numbers). Watch out! It is a
		// common mistake to forget to update the max constant in the 'for', for
		// instance if you add or reduce the amount of options...
		for (int i = VALUE_MILLIGRAMS; i <= VALUE_HANDFULLS; i++)
			if (names[i].equals(name))
				return getMeasureUnitByOrder(i);
		return null;
	}

	// This is used privately. Constructs an individual based on the given
	// numeric constant.
	private MeasureUnit(int value, int pos) {
		super(MY_NAMESPACE + names[pos]);
//		super(getReal(ord));
		this.order = pos;
	}

//	/*
//	 * Val es un valor cualquiera, hay que mapearlo al array
//	 */
//	private static String getReal(int val) {
//		return DishCategory.getDishCategoriesByOrder(val).name();
////		return names[val];
//	}
	
	public MeasureUnit() {
		// Basic constructor. In general it is empty.
	}

	public MeasureUnit(String uri) {
		super(uri);
		// This is the commonly used constructor. In general it is like this,
		// just a call to super. It should not be used by external developers...
	}

	// See MyConcept for an explanation of this method. In Enumerations it is
	// not relevant, although it must be present. (have to check if it works if
	// we include properties in enumerations)
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	// You don´t really need this for enumerations, but it won´t hurt if it
	// always returns true...
	public boolean isWellFormed() {
		return true;
	}

	// This is used in instances (individuals) to get their name
	public String name() {
		return names[order];
	}

	// This is used in instances (individuals) to get their numeric constant
	// (their order)
	public int ord() {
		return order;
	}

	// As commented above, currently enumerations do not support properties in
	// our code (I have to check this later). This method prevents anyone from
	// adding properties manually later to individuals.
	public void setProperty(String propURI, Object o) {
		// do nothing
	}

	public static MeasureUnit getUnitsByValue(String value) {
		if (value==null)
			return null;
		for (int i=0; i<MeasureUnit.names.length; i++) {
			if (MeasureUnit.names[i].compareTo(value)==0)
				return MeasureUnit.getMeasureUnitByOrder(i);
		}
		return null;
	}

	public String getClassURI() {
		return MY_URI;
	}
}
