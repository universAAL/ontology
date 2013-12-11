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

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.DroolsReasoningOntology;

public class DroolsReasoning extends Service{
	
	public static final String MY_URI = DroolsReasoningOntology.NAMESPACE + "DroolsReasoningService";

	public static final String PROP_KNOWS_FACTS = DroolsReasoningOntology.NAMESPACE+"knowsFacts";
	public static final String PROP_KNOWS_RULES = DroolsReasoningOntology.NAMESPACE+"knowsRules";
	public static final String PROP_PRODUCES_CONSEQUENCES = DroolsReasoningOntology.NAMESPACE+"producesConsequences";
	//public static final String PROP_RECEIVES_CONTEXT_EVENTS = "receivesContextEvents";
	
	
	public DroolsReasoning(String instanceURI) {
		super(instanceURI);
	}


	public DroolsReasoning() {
		super();
	}

	  public String getClassURI(){
			return MY_URI;  
		  }

}
