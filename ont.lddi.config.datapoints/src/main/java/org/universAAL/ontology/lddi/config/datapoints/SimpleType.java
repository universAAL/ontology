/**
 * 
 */
package org.universAAL.ontology.lddi.config.datapoints;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * @author mtazari
 *
 */
public class SimpleType extends ManagedIndividual {

	// class uri
	public static final String MY_URI = LDDIDatapointsOntology.NAMESPACE + "SimpleType";

	// The order number of the possible values in this enumeration
	public static final int ANY_URI = 0;
	public static final int BOOLEAN = 1;
	public static final int DATE_TIME = 2;
	public static final int DOUBLE = 3;
	public static final int DURATION = 4;
	public static final int FLOAT = 5;
	public static final int INT = 6;
	public static final int LANGUAGE = 7;
	public static final int LONG = 8;
	public static final int STRING = 9;

	// the names of possible values in the order of the above constants
	private static final String[] names = { "anyURI", "boolean", "dateTime", "double", "duration", "float", "int", "language", "long", "string" };

	// the possible values themselves
	public static final SimpleType anyURI = new SimpleType(ANY_URI);
	public static final SimpleType t_boolean = new SimpleType(BOOLEAN);
	public static final SimpleType dateTime = new SimpleType(DATE_TIME);
	public static final SimpleType t_double = new SimpleType(DOUBLE);
	public static final SimpleType duration = new SimpleType(DURATION);
	public static final SimpleType t_float = new SimpleType(FLOAT);
	public static final SimpleType t_int = new SimpleType(INT);
	public static final SimpleType language = new SimpleType(LANGUAGE);
	public static final SimpleType t_long = new SimpleType(LONG);
	public static final SimpleType string = new SimpleType(STRING);

	// This methods returns the list of all class members 
	public static ManagedIndividual[] allTypes() {
		return new SimpleType[] { anyURI, t_boolean, dateTime, t_double, duration, t_float, t_int, language, t_long, string };
	}
	
	public static SimpleType getTypeByOrder(int order) {
		switch (order) {
		case ANY_URI: return anyURI;
		case BOOLEAN: return t_boolean;
		case DATE_TIME: return dateTime;
		case DOUBLE: return t_double;
		case DURATION: return duration;
		case FLOAT: return t_float;
		case INT: return t_int;
		case LANGUAGE: return language;
		case LONG: return t_long;
		case STRING: return string;
		default: return null;
		}
	}
	
	public static SimpleType valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(LDDIDatapointsOntology.NAMESPACE))
			name = name.substring(LDDIDatapointsOntology.NAMESPACE.length());

		for (int i = 0; i < names.length; i++)
			if (names[i].equals(name))
				return getTypeByOrder(i);
		return null;
	}

	// the order number of this instance
	private int order;

	// private constructor to forbid creation of instances outside this class
	private SimpleType(int order) {
		super(LDDIDatapointsOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	// private constructor to forbid creation of instances outside this class
	private SimpleType() {
		// Enumerations cannot be instantiated by other than themselves. This
		// constructor must be empty to prevent this.
	}

	// as there are no standard props, the serialization of any externally added props should be optional
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	// not needed really for enumerations, but it won�t hurt if it
	// always returns true...
	public boolean isWellFormed() {
		return true;
	}

	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}
}
