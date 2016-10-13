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


/**
 * Location bound Session, a session that is only valid within a location.
 * @author amedrano
 *
 */
public class LocationBoundSession extends Session {


    public static final String MY_URI = SecurityOntology.NAMESPACE + "LocationBoundedSession";
    public static final String PROP_BOUNDED_LOCATION = SecurityOntology.NAMESPACE + "locationBound";
	
	/**
	 * Only for serializers.
	 */
	public LocationBoundSession() {
	    super();
	}

	/**
	 * @param uri
	 */
	public LocationBoundSession(String uri) {
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
		if (propURI.equals(PROP_BOUNDED_LOCATION)) {
			return PROP_SERIALIZATION_REDUCED;
		}
		return super.getPropSerializationType(propURI);
	}

}
