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

import org.universAAL.middleware.service.owl.Service;
import org.universaal.ontology.health.owl.HealthOntology;

/**
 * @author amedrano
 * @author roni
 * 
 * @navassoc - "PROP_ASSISTED_USER" 1 AssistedPerson
 * @navassoc - "PROP_ASSISTED_USER_PROFILE" 1 HealthProfile
 */
public abstract class HealthService extends Service {

    // NAMESPACE & PROPERTIES
    public static final String MY_URI = HealthOntology.NAMESPACE
	    + "HealthService";

    public static final String PROP_ASSISTED_USER = HealthOntology.NAMESPACE
	    + "assistedPerson";

    public static final String PROP_ASSISTED_USER_PROFILE = HealthOntology.NAMESPACE
	    + "healthProfile";

    // CONSTRUCTORS
    public HealthService() {
	super();
    }

    public HealthService(String uri) {
	super(uri);
    }

    /** {@inheritDoc} */
    public String getClassURI() {
	return MY_URI;
    }

    /** {@inheritDoc} */
    public boolean isWellFormed() {
	return true;
    }

}
