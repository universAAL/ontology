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
 * Drools Rule.
 * 
 * @author mllorente
 * 
 */
public class Rule extends ManagedIndividual {

	public static final String MY_URI;

	public static final String PROP_HAS_IDENTIFIER;
	public static final String PROP_HAS_BODY;

	static {

		// The URI of your concept, which is the same name than the class
		MY_URI = DroolsReasoningOntology.NAMESPACE + "Rule";
		// Now declare the URIs of the properties. They must start with lower
		// case.
		PROP_HAS_IDENTIFIER = DroolsReasoningOntology.NAMESPACE + "hasRuleID";
		PROP_HAS_BODY = DroolsReasoningOntology.NAMESPACE + "hasRuleBODY";

	}

	public Rule() {
		super();
	}

	public Rule(String uri) {
		super(uri);
	}

	public Rule(String uri, String ID, String body) {
		super(uri);
		setId(ID);
		setBody(body);
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		// TODO
		return true;
	}

	public String getId() {
		return (String) props.get(PROP_HAS_IDENTIFIER);
	}

	public void setId(String str) {
		props.put(PROP_HAS_IDENTIFIER, str);
	}

	public String getBody() {
		return (String) props.get(PROP_HAS_BODY);
	}

	public void setBody(String str) {
		props.put(PROP_HAS_BODY, str);
	}

	public String getClassURI() {
		return MY_URI;
	}

}
