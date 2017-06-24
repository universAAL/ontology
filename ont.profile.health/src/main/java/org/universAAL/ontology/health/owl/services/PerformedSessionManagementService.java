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

package org.universAAL.ontology.health.owl.services;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.ontology.health.owl.HealthProfileOntology;

/**
 * This class describes the performed session management service, which consists
 * of storing a performed session and listing the sessions associated to the
 * health profile performed by the assisted person.
 *
 * @author mdelafuente
 * @author roni
 *
 */
public class PerformedSessionManagementService extends HealthService {

	// NAMESPACE & PROPERTIES
	public static final String MY_URI = HealthProfileOntology.NAMESPACE + "SessionManagementService";

	public static final String PROP_MANAGES_SESSION = HealthProfileOntology.NAMESPACE + "managesSession";
	public static final String PROP_ASSOCIATED_TREATMENT = HealthProfileOntology.NAMESPACE + "sessionsTreatment";

	public static final String PROP_TIMESTAMP_FROM = HealthProfileOntology.NAMESPACE + "sessionsFrom";
	public static final String PROP_TIMESTAMP_TO = HealthProfileOntology.NAMESPACE + "sessionsTo";

	// CONSTRUCTORS
	public PerformedSessionManagementService() {
		super();
	}

	public PerformedSessionManagementService(String uri) {
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
		if (PROP_MANAGES_SESSION.equals(propURI) || PROP_ASSOCIATED_TREATMENT.equals(propURI)
				|| PROP_TIMESTAMP_FROM.equals(propURI) || PROP_TIMESTAMP_TO.equals(propURI))
			return Resource.PROP_SERIALIZATION_FULL;
		return super.getPropSerializationType(propURI);
	}

	public boolean isWellFormed() {
		return true;
	}
}
