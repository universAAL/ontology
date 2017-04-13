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
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.health.owl.HealthProfileOntology;

/**
 * @author amedrano
 * @author roni
 * 
 */
public class HealthService extends Service {

    // NAMESPACE & PROPERTIES
    public static final String MY_URI = HealthProfileOntology.NAMESPACE
	    + "HealthService";

    public static final String PROP_ASSISTED_USER = HealthProfileOntology.NAMESPACE
	    + "assistedPerson";

    public static final String PROP_ASSISTED_USER_PROFILE = HealthProfileOntology.NAMESPACE
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

    public int getPropSerializationType(String propURI) {
	if (PROP_ASSISTED_USER.equals(propURI) || PROP_ASSISTED_USER_PROFILE.equals(propURI))
	    return Resource.PROP_SERIALIZATION_FULL;
	return super.getPropSerializationType(propURI);
    }
}
