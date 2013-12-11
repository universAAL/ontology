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
package org.universAAL.ontology;


import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.drools.Consequence;
import org.universAAL.ontology.drools.ConsequenceProperty;
import org.universAAL.ontology.drools.DroolsReasoning;
import org.universAAL.ontology.drools.Fact;
import org.universAAL.ontology.drools.FactProperty;
import org.universAAL.ontology.drools.Rule;

public class DroolsReasoningFactory implements ResourceFactory {

	public Resource createInstance(String classURI, String instanceURI,
			int factoryIndex) {
		switch (factoryIndex) {
		case 0:
			return new Consequence(instanceURI);
		case 1:
			return new Fact(instanceURI);
		case 2:
			return new Rule(instanceURI);
		case 3:
			return new FactProperty(instanceURI);
		case 4:
			return new ConsequenceProperty(instanceURI);
		case 5:
			return new DroolsReasoning(instanceURI);
		}
		return null;
	}
}
