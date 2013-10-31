/*******************************************************************************
 * Copyright 2013 Universidad Politécnica de Madrid
 * Copyright 2013 Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
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

package org.universAAL.ontology.security;

import org.universAAL.middleware.service.owl.Service;

/**
 * Service Description for checking validity of {@link Session}s.
 * only the session manager should implement profiles for this service.
 * @author amedrano
 *
 */
public class SessionValidationService extends Service {


    public static final String MY_URI = SecurityOntology.NAMESPACE + "SessionService";
    public static final String PROP_DEVICE = SecurityOntology.NAMESPACE + "forDevice";
    public static final String PROP_USERS = SecurityOntology.NAMESPACE + "forUser";
    public static final String PROP_LOCATION = SecurityOntology.NAMESPACE + "forLocation";
    public static final String PROP_IS_VALID = SecurityOntology.NAMESPACE + "isvalid";
	
	/**
	 * Only for serializers.
	 */
	public SessionValidationService() {
	}

	/**
	 * @param uri
	 */
	public SessionValidationService(String uri) {
		super(uri);
	}


	/** {@ inheritDoc}	 */
	public String getClassURI() {
		return MY_URI;
	}

	/** {@ inheritDoc}	 */
	public boolean isWellFormed() {
		return super.isWellFormed();
	}

	/** {@ inheritDoc}	 */
	public int getPropSerializationType(String propURI) {
		if (propURI.equals(PROP_USERS)|| propURI.equals(PROP_DEVICE)
			|| propURI.equals(PROP_LOCATION)){
			return PROP_SERIALIZATION_FULL;
		}
		return PROP_SERIALIZATION_UNDEFINED;
	}

}
