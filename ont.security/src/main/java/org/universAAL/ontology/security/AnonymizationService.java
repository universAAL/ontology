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
 * Service Description for Authentication.
 * Authenticator mechanisms should provide profiles for this service
 * @author amedrano
 *
 */
public class AnonymizationService extends Service {


    public static final String MY_URI = SecurityOntology.NAMESPACE + "AnonymizationService";
    public static final String PROP_ANONYMIZABLE = SecurityOntology.NAMESPACE + "anonymizableResource";
    public static final String PROP_ASYMMETRIC_ENCRYPTION = SecurityOntology.NAMESPACE + "asymmetricEncryptionToUse";
	
	/**
	 * Only for serializers.
	 */
	public AnonymizationService() {
	    super();
	}

	/**
	 * @param uri
	 */
	public AnonymizationService(String uri) {
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
		if (propURI.equals(PROP_ANONYMIZABLE) || propURI.equals(PROP_ASYMMETRIC_ENCRYPTION)){
			return PROP_SERIALIZATION_FULL;
		}
		return super.getPropSerializationType(propURI);
	}

}
