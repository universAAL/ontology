/**
 * 
 */
package org.universAAL.ontology.unit.services;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.unit.UnitOntology;

/**
 * @author amedrano
 *
 */
public class UnitConversionService extends Service {
	
	public static final String MY_URI = UnitOntology.NAMESPACE + "UnitConversionService";
    public static final String PROP_FROM_UNIT = UnitOntology.NAMESPACE
	    + "fromUnit";
    public static final String PROP_TO_UNIT = UnitOntology.NAMESPACE
    	    + "toUnit";
    public static final String PROP_FROM_PREFIX = UnitOntology.NAMESPACE
    	    + "ValueInFromUnit";
    public static final String PROP_TO_PREFIX = UnitOntology.NAMESPACE
    	    + "valueInToUnit";
    public static final String PROP_FROM_VALUE = UnitOntology.NAMESPACE
    	    + "ValueInFromUnit";
    public static final String PROP_TO_VALUE = UnitOntology.NAMESPACE
    	    + "valueInToUnit";

	/**
	 * 
	 */
	public UnitConversionService() {
	}

	/**
	 * @param uri
	 */
	public UnitConversionService(String uri) {
		super(uri);
	}
	
	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true;
	}
}
