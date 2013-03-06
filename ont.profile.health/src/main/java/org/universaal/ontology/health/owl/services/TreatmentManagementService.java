/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es 
 * Universidad Politécnica de Madrid
 * 
 *	OCO Source Materials
 *	� Copyright IBM Corp. 2011
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
 * This class describes the treatment management service, 
 * which consists of editing, creating and deleting a treatment.
 * Also, this service lists the treatments associated to the 
 * health profile of an assisted person.
 * 
 * @author mdelafuente
 * @author roni
 * 
 * @navassoc - "PROP_MANAGES_TREATMENT" * Treatment
 * @navassoc - "PROP_TIMESTAMP_FROM" 0,1 Long
 * @navassoc - "PROP_TIMESTAMP_TO" 0,1 Long
 */
public class TreatmentManagementService extends HealthService{

	//NAMESPACE & PROPERTIES
	public static final String MY_URI = HealthOntology.NAMESPACE
	+ "TreatmentManagementService";

	public static final String PROP_MANAGES_TREATMENT = HealthOntology.NAMESPACE
	+ "managesTreatments";

	// Filtering between timestamps
	public static final String PROP_TIMESTAMP_FROM =  HealthOntology.NAMESPACE
			+ "listsTreatmentsTimestampFrom";
	public static final String PROP_TIMESTAMP_TO =  HealthOntology.NAMESPACE
			+ "listsTreatmentsTimestampTo";


	
    //CONSTRUCTORS
	public TreatmentManagementService() {
		super();
	}

	public TreatmentManagementService(String uri) {
		super(uri);
	}

	/** {@inheritDoc} */
	public String getClassURI() {
		return MY_URI;
	}

	/** {@inheritDoc} */
	public int getPropSerializationType(String propURI) {
		return  PROP_MANAGES_TREATMENT.equals(propURI) 
		 ? PROP_SERIALIZATION_FULL : super
				.getPropSerializationType(propURI);
	}

	/** {@inheritDoc} */
	public boolean isWellFormed() {
		return true;
	}
}
