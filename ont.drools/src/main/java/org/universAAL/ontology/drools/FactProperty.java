/*
	Copyright 2008-2014 TSB, http://www.tsbtecnologias.es
	TSB - Tecnologías para la Salud y el Bienestar
	
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
package org.universAAL.ontology.drools;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.DroolsReasoningOntology;

/**
 * Key-Value pair defining a fact property.
 * 
 * @author mllorente
 * 
 */
public class FactProperty extends ManagedIndividual {

	// MY URI is the URI of this concept. It is mandatory for all.
	public static final String MY_URI;

	public static final String PROP_HAS_KEY;
	public static final String PROP_HAS_VALUE;

	// In this static block you set the URIs of your concept and its properties
	static {

		// The URI of your concept, which is the same name than the class
		MY_URI = DroolsReasoningOntology.NAMESPACE + "FactProperty";
		// Now declare the URIs of the properties. They must start with lower
		// case.
		PROP_HAS_KEY = DroolsReasoningOntology.NAMESPACE + "hasFactKeyProperty";
		PROP_HAS_VALUE = DroolsReasoningOntology.NAMESPACE
				+ "hasFactValueProperty";

	}

	public FactProperty() {
		super();
	}

	public FactProperty(String uri) {
		super(uri);
	}

	public FactProperty(String uri, String key, String value) {
		super(uri);
		props.put(PROP_HAS_KEY, key);
		props.put(PROP_HAS_VALUE, value);
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		// TODO
		return true;
	}

	public String getKey() {
		return (String) props.get(PROP_HAS_KEY);
	}

	public void setKey(String str) {
		props.put(PROP_HAS_KEY, str);
	}

	public String getValue() {
		return (String) props.get(PROP_HAS_VALUE);
	}

	public void setValue(String str) {
		props.put(PROP_HAS_VALUE, str);
	}

	public String getClassURI() {
		return MY_URI;
	}

}
