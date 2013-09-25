/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es 
 * Universidad Politécnica de Madrid
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

import org.universAAL.ontology.health.owl.HealthProfileOntology;

/**
 * 
 * @author mdelafuente
 * 
 */
public class ProfileManagementService extends HealthService {

    // NAMESPACE & PROPERTIES
    public static final String MY_URI = HealthProfileOntology.NAMESPACE
	    + "HealthProfileManagementService";

    // CONSTRUCTORS
    public ProfileManagementService() {
	super();
    }

    public ProfileManagementService(String uri) {
	super(uri);
    }

    /** {@inheritDoc} */
    public String getClassURI() {
	return MY_URI;
    }

    /** {@inheritDoc} */
    public int getPropSerializationType(String propURI) {
	return PROP_ASSISTED_USER_PROFILE.equals(propURI) ? PROP_SERIALIZATION_FULL
		: super.getPropSerializationType(propURI);
    }

    /** {@inheritDoc} */
    public boolean isWellFormed() {
	return true;
    }
}
