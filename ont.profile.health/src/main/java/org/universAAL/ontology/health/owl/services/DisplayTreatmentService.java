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
package org.universAAL.ontology.health.owl.services;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.health.owl.HealthProfileOntology;

/**
 * Launch display of a treatment. Involved User must be set, this user is the
 * one behind the UI. Affected user will be the user for which health profile
 * the operation is meant. <br>
 * Typical profiles:
 * <ul>
 * <li>filterInput {@link DisplayTreatmentService#PROP_AFFECTED_USER}, addEffect
 * {@link DisplayTreatmentService#PROP_TREATMENT} <br>
 * show the form for a new treatment for the affected user (form is shown to
 * involveduser).
 * <li>filterInput {@link DisplayTreatmentService#PROP_AFFECTED_USER},
 * changeEffect {@link DisplayTreatmentService#PROP_TREATMENT} <br>
 * show the form for editing treatment for the affected user (form is shown to
 * involveduser).
 * <li>filterInput {@link DisplayTreatmentService#PROP_AFFECTED_USER},
 * removeEffect {@link DisplayTreatmentService#PROP_TREATMENT} <br>
 * show the form before removing the treatment for the affected user (form is
 * shown to involveduser). used as confirmation for deletion.
 * <li>filterInput {@link DisplayTreatmentService#PROP_AFFECTED_USER} <br>
 * show the form with the list of treatments for the affected User (form is
 * shown to involveduser). health.ui.client should be the only component
 * implementing this profile.
 * </ul>
 *
 * @author amedrano
 *
 */
public class DisplayTreatmentService extends Service {

	public static final String MY_URI = HealthProfileOntology.NAMESPACE + "DisplayTreatmentService";

	public static final String PROP_AFFECTED_USER = HealthProfileOntology.NAMESPACE + "targetUser";

	public static final String PROP_TREATMENT = HealthProfileOntology.NAMESPACE + "treatmentToBeDisplayed";

	// CONSTRUCTORS
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
		if (PROP_AFFECTED_USER.equals(propURI) || PROP_TREATMENT.equals(propURI))
			return Resource.PROP_SERIALIZATION_FULL;
		return super.getPropSerializationType(propURI);
	}

	/** {@inheritDoc} */
	public boolean isWellFormed() {
		return true;
	}
}
