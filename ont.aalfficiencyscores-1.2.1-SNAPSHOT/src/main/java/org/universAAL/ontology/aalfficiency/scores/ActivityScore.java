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


public class ActivityScore extends ManagedIndividual {
  public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE
    + "ActivityScore";
  public static final String PROP_STEPS = AalfficiencyScoresOntology.NAMESPACE
    + "steps";
  public static final String PROP_CHALLENGE = AalfficiencyScoresOntology.NAMESPACE
    + "activityChallenge";
  public static final String PROP_TOTAL_ACTIVITY_SCORE = AalfficiencyScoresOntology.NAMESPACE
    + "totalActivityScore";
  public static final String PROP_KCAL = AalfficiencyScoresOntology.NAMESPACE
    + "kcal";
  public static final String PROP_TODAY_ACTIVITY_SCORE = AalfficiencyScoresOntology.NAMESPACE
    + "todayActivityScore";


  public ActivityScore () {
    super();
  }
  
  public ActivityScore (String uri) {
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
      && hasProperty(PROP_STEPS)
      && hasProperty(PROP_CHALLENGE)
      && hasProperty(PROP_TOTAL_ACTIVITY_SCORE)
      && hasProperty(PROP_KCAL)
      && hasProperty(PROP_TODAY_ACTIVITY_SCORE);
  }

  public int getTodayActivityScore() {
	Integer i = (Integer) getProperty(PROP_TODAY_ACTIVITY_SCORE);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setTodayActivityScore(int newPropValue) {
      changeProperty(PROP_TODAY_ACTIVITY_SCORE, new Integer(newPropValue));
  }		

  public int getTotalActivityScore() {
	Integer i = (Integer) getProperty(PROP_TOTAL_ACTIVITY_SCORE);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setTotalActivityScore(int newPropValue) {
      changeProperty(PROP_TOTAL_ACTIVITY_SCORE, new Integer(newPropValue));
  }		

  public int getSteps() {
	Integer i = (Integer) getProperty(PROP_STEPS);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setSteps(int newPropValue) {
      changeProperty(PROP_STEPS, new Integer(newPropValue));
  }		

  public int getKcal() {
	Integer i = (Integer) getProperty(PROP_KCAL);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setKcal(int newPropValue) {
      changeProperty(PROP_KCAL, new Integer(newPropValue));
  }		

  public Challenge getChallenge() {
    return (Challenge)getProperty(PROP_CHALLENGE);
  }		

  public void setChallenge(Challenge newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_CHALLENGE, newPropValue);
  }		
}
