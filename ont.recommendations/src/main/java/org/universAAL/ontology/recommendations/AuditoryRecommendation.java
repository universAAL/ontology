/*******************************************************************************
 * Copyright 2013 Universidad PolitĂ©cnica de Madrid
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.recommendations;



/**
 * Ontological representation of AuditoryRecommendation in the recommendations ontology. 
 * Methods included in this class are the mandatory ones for representing an
 * ontological concept in Java classes for the universAAL platform. In addition
 * getters and setters for properties are included.
 * 
 * @author 
 * @author Generated by the OntologyUML2Java transformation of AAL Studio
 */
public class AuditoryRecommendation extends Recommendations {
  public static final String MY_URI = RecommendationsOntology.NAMESPACE
    + "AuditoryRecommendation";


  public AuditoryRecommendation () {
    super();
  }
  
  public AuditoryRecommendation (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  
  public int getPropSerializationType(String propURI) {

    return super.getPropSerializationType(propURI);
  } 

  public boolean isWellFormed() {
	return super.isWellFormed();
  }

	

}
