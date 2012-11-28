/*
	Copyright 2011-2012 TSB, http://www.tsbtecnologias.es
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
package org.universAAL.ontology.aalfficiency.scores;

import org.universAAL.middleware.owl.ManagedIndividual;


public class Advice extends ManagedIndividual {
  public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE
    + "Advice";
  public static final String PROP_TYPE = AalfficiencyScoresOntology.NAMESPACE
    + "type";
  public static final String PROP_TEXT = AalfficiencyScoresOntology.NAMESPACE
    + "text";


  public Advice () {
    super();
  }
  
  public Advice (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  public int getPropSerializationType(String arg0) {
	// TODO Implement or if for Device subclasses: remove 
	  return PROP_SERIALIZATION_FULL;
  }

  public boolean isWellFormed() {
	return true 
      && hasProperty(PROP_TYPE)
      && hasProperty(PROP_TEXT);
  }

  public String getAdviceType() {
    return (String)getProperty(PROP_TYPE);
  }		

  public void setAdviceType(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_TYPE, newPropValue);
  }		

  public String getText() {
    return (String)getProperty(PROP_TEXT);
  }		

  public void setText(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_TEXT, newPropValue);
  }		
}
