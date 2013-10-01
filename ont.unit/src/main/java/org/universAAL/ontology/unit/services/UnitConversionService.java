/*******************************************************************************
 * Copyright 2013 UPM - Universidad Politécnica de Madrid
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
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
