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


public class ElectricityScore extends ManagedIndividual {
  public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE
    + "ElectricityScore";
  public static final String PROP_CHALLENGE = AalfficiencyScoresOntology.NAMESPACE
    + "electricityChallenge";
  public static final String PROP_TOTAL_ELECTRICITY_SCORE = AalfficiencyScoresOntology.NAMESPACE
    + "totalElectricityScore";
  public static final String PROP_TODAY_ELECTRICITY_SCORE = AalfficiencyScoresOntology.NAMESPACE
    + "todayElectricityScore";
  public static final String PROP_SAVING = AalfficiencyScoresOntology.NAMESPACE
    + "saving";


  public ElectricityScore () {
    super();
  }
  
  public ElectricityScore (String uri) {
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
      && hasProperty(PROP_CHALLENGE)
      && hasProperty(PROP_TOTAL_ELECTRICITY_SCORE)
      && hasProperty(PROP_TODAY_ELECTRICITY_SCORE)
      && hasProperty(PROP_SAVING);
  }

  public int getTodayElectricityScore() {
	Integer i = (Integer) getProperty(PROP_TODAY_ELECTRICITY_SCORE);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setTodayElectricityScore(int newPropValue) {
      changeProperty(PROP_TODAY_ELECTRICITY_SCORE, new Integer(newPropValue));
  }		

  public int getTotalElectricityScore() {
	Integer i = (Integer) getProperty(PROP_TOTAL_ELECTRICITY_SCORE);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setTotalElectricityScore(int newPropValue) {
      changeProperty(PROP_TOTAL_ELECTRICITY_SCORE, new Integer(newPropValue));
  }		

  public int getSaving() {
	Integer i = (Integer) getProperty(PROP_SAVING);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setSaving(int newPropValue) {
      changeProperty(PROP_SAVING, new Integer(newPropValue));
  }		

  public Challenge getChallenge() {
    return (Challenge)getProperty(PROP_CHALLENGE);
  }		

  public void setChallenge(Challenge newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_CHALLENGE, newPropValue);
  }		
}
