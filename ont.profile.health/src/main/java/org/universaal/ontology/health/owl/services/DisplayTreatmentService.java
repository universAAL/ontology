/*******************************************************************************
 * Copyright 2013 Universidad Politécnica de Madrid
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

import org.universAAL.middleware.service.owl.Service;
import org.universaal.ontology.health.owl.HealthOntology;

/**
 * Launch display of a treatment.
 * Service Profiles should specify the class of Treatment they are intended to.
 * The UI must be a Dialog and must be return as {@link DisplayTreatmentService#PROP_FORM_FOR_TREATMENT}
 * @author amedrano
 * 
 * @navassoc - "PROP_TREATMENT" 1 Treatment
 * @navassoc - "PROP_FORM_FOR_TREATMENT" 1 Form
 *
 */
public class DisplayTreatmentService extends Service {

	public static final String MY_URI = HealthOntology.NAMESPACE
			+ "DisplayTreatmentService";
	
	public static final String PROP_TREATMENT = HealthOntology.NAMESPACE
			+ "treatmentToBeDisplayed";
	
	public static final String PROP_FORM_FOR_TREATMENT = HealthOntology.NAMESPACE
			+ "formForTreatment";
	//CONSTRUCTORS
	public DisplayTreatmentService() {
		super();
	}

	public DisplayTreatmentService(String uri) {
		super(uri);
	}

	/** {@inheritDoc} */
	public String getClassURI() {
		return MY_URI;
	}

	
	/** {@inheritDoc} */
	public int getPropSerializationType(String propURI) {
		return PROP_TREATMENT.equals(propURI) 
				|| PROP_FORM_FOR_TREATMENT.equals(propURI)? PROP_SERIALIZATION_FULL : super
				.getPropSerializationType(propURI);
	}

	/** {@inheritDoc} */
	public boolean isWellFormed() {
		return true;
	}
}
