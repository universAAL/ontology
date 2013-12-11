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




//If you are making a concept that does not inherit from any other you just extend ManagedIndividual
//Otherwise you extend the concept class you inherit from
public class ConsequenceProperty extends ManagedIndividual {
  // Make sure you use the same namespace in all your domain ontology
  // You can declare the namespace in your root concept and later reuse it in
  // the rest of classes
  public static final String NAMESPACE;
  // MY URI is the URI of this concept. It is mandatory for all.
  public static final String MY_URI;
  // Now declare ALL properties that this concept defines
  public static final String PROP_HAS_KEY;
  public static final String PROP_HAS_VALUE;
  
  // In this static block you set the URIs of your concept and its properties
  static {
	// Namespaces must follow this format
	NAMESPACE = "http://ontology.universAAL.org/Drool.owl#";
	// The URI of your concept, which is the same name than the class
	MY_URI = ConsequenceProperty.NAMESPACE + "ConsequenceProperty";
	// Now declare the URIs of the properties. They must start with lower
	// case.
	PROP_HAS_KEY = ConsequenceProperty.NAMESPACE + "hasConsequenceKeyProperty";
	PROP_HAS_VALUE = ConsequenceProperty.NAMESPACE + "hasConsequenceValueProperty";
  }


  public ConsequenceProperty() {
	  super();
  }

  public ConsequenceProperty(String uri) {
	super(uri);
  }
  
  public ConsequenceProperty(String uri, String key, String value){
	  super(uri);
	  props.put(PROP_HAS_KEY, key);
	  props.put(PROP_HAS_VALUE, value);
  }

  public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	  //TODO
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
  
  public String getClassURI(){
		return MY_URI;  
	  }
  
}
