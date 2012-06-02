/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es 
 Universidad Politécnica de Madrid
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package org.universaal.ontology.owl;

import org.universAAL.middleware.service.owl.Service;

/**
 * This class describes the service given by the 
 * questionnaire ontology. 
 * Given a questionnaire to a user we get an
 * answered questionnaire.
 * @author mdelafuente
 *
 */
public class QuestionnaireService extends Service{

//NAMESPACE & PROPERTIES
	  public static final String MY_URI = QuestionnaireOntology.NAMESPACE
	    + "QuestionnaireService";

	  public static final String PROP_PROPOSED_QUESTIONNAIRE =  QuestionnaireOntology.NAMESPACE
	    + "proposedQuestionnaire";
	  public static final String PROP_TARGET_USER =  QuestionnaireOntology.NAMESPACE
	    + "targetUser";
	  public static final String PROP_GENERATES_ANSWERED_QUESTIONNAIRE =  QuestionnaireOntology.NAMESPACE
	    + "generatesAnsweredQuestionnaire";
	
//CONSTRUCTORS
	  public QuestionnaireService() {
		  super();
	  }

	  public QuestionnaireService(String uri) {
		  super(uri);
	  }

	  public String getClassURI() {
		  return MY_URI;
	  }

	  /*
	   * (non-Javadoc)
	   * 
	   * @see
	   * org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
	   * (java.lang.String)
	   */
	  public int getPropSerializationType(String propURI) {
		  return  PROP_TARGET_USER.equals(propURI) ||
		  PROP_GENERATES_ANSWERED_QUESTIONNAIRE.equals(propURI) ||
		  PROP_PROPOSED_QUESTIONNAIRE.equals(propURI) ? PROP_SERIALIZATION_FULL : super
				  .getPropSerializationType(propURI);
	  }

	  public boolean isWellFormed() {
		  return true;
	  }
}
