/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es 
 Universidad Politénica de Madrid
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

package org.universaal.ontology.health.owl.services;

import org.universaal.ontology.health.owl.HealthOntology;

/**
 * This class describes the planned session management service, 
 * which consists of editing, creating and deleting a planned session.
 * Also, this service lists the planned sessions that composes a 
 * treatment planning.
 * @author mdelafuente
 * 
 * @navassoc - "PROP_MANAGES_SESSION" * PlannedSession
 * @navassoc - "PROP_ASSOCIATED_TREATMENT" 0,1 Treatment
 */
public class PlannedSessionManagementService extends HealthService{
	
	//NAMESPACE & PROPERTIES
	public static final String MY_URI = HealthOntology.NAMESPACE
	+ "SessionManagementService";

	public static final String PROP_MANAGES_SESSION = HealthOntology.NAMESPACE
	+ "managesSession";
	
	public static final String PROP_ASSOCIATED_TREATMENT = 
			HealthOntology.NAMESPACE + "plannedSessionsTreatment";
	
	//CONSTRUCTORS
	  public PlannedSessionManagementService() {
		  super();
	  }

	  public PlannedSessionManagementService(String uri) {
		  super(uri);
	  }

	  /** {@inheritDoc} */
	public String getClassURI() {
		  return MY_URI;
	  }

	  /** {@inheritDoc} */
	public int getPropSerializationType(String propURI) {
		  return PROP_MANAGES_SESSION.equals(propURI) ? PROP_SERIALIZATION_FULL : super
				  .getPropSerializationType(propURI);
	  }

	  /** {@inheritDoc} */
	public boolean isWellFormed() {
		  return true;
	  }
	
}
