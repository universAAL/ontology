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

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.DroolsReasoningOntology;
import org.universAAL.ontology.drools.FactProperty;



public class Fact extends ManagedIndividual {

  public static final String MY_URI;

  public static final String PROP_HAS_IDENTIFIER;
  public static final String PROP_HAS_PROPERTIES;
   
  
  // In this static block you set the URIs of your concept and its properties
  static {

	MY_URI = DroolsReasoningOntology.NAMESPACE + "Fact";
	
	PROP_HAS_IDENTIFIER = DroolsReasoningOntology.NAMESPACE + "hasFactID";	
	PROP_HAS_PROPERTIES = DroolsReasoningOntology.NAMESPACE + "hasFactProperty";
	
	
  }

  public Fact() {
  }

  public Fact(String uri) {
	super(uri);
  }

  public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	  //TODO
	return true;
  }

  public String getID() {
	return (String) props.get(PROP_HAS_IDENTIFIER);
  }

  public void setID(String str) {
	props.put(PROP_HAS_IDENTIFIER, str);
  }
  
  public FactProperty[] getProperties() {
		Object propList = props.get(PROP_HAS_PROPERTIES);
		if (propList instanceof List) {
			return (FactProperty[]) ((List) propList)
					.toArray(new FactProperty[0]);
		} else {
			List returnList = new ArrayList();
			if (propList != null){
				returnList.add((FactProperty) propList);
			}
			return (FactProperty[]) returnList
					.toArray(new FactProperty[0]);

		}
	}

	public void addProperty(String uri, String key, String value){
		Object propList = props.get(PROP_HAS_PROPERTIES);
		if (propList instanceof List){
			List auxList = (List)propList;
			auxList.add(new FactProperty(uri, key, value));
			props.put(PROP_HAS_PROPERTIES, auxList);
		}else if (propList == null){
			props.put(PROP_HAS_PROPERTIES, new FactProperty(uri, key, value));
		}else{		
			List auxList = new ArrayList();
			auxList.add((FactProperty)propList);
			auxList.add(new FactProperty(uri, key, value));
			props.put(PROP_HAS_PROPERTIES, auxList);		
		}
	}
  
	  public String getClassURI(){
			return MY_URI;  
		  }
	
}
