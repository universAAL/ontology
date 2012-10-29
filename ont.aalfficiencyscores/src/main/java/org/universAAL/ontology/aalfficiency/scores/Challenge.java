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


public class Challenge extends ManagedIndividual {
  public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE
    + "Challenge";
  public static final String PROP_GOAL = AalfficiencyScoresOntology.NAMESPACE
    + "Goal";
  public static final String PROP_DESCRIPTION = AalfficiencyScoresOntology.NAMESPACE
    + "Description";


  public Challenge () {
    super();
  }
  
  public Challenge (String uri) {
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
      && hasProperty(PROP_GOAL)
      && hasProperty(PROP_DESCRIPTION);
  }

  public String getDescription() {
    return (String)getProperty(PROP_DESCRIPTION);
  }		

  public void setDescription(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_DESCRIPTION, newPropValue);
  }		

  public String getGoal() {
    return (String)getProperty(PROP_GOAL);
  }		

  public void setGoal(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_GOAL, newPropValue);
  }		
}
