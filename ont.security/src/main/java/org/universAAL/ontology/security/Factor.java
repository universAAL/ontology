/*******************************************************************************
 * Copyright 2015 2011 Universidad Politécnica de Madrid
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

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * @author amedrano
 * 
 */
public abstract class Factor extends ManagedIndividual {
	public static final String MY_URI = SecurityOntology.NAMESPACE
			+ "Factor";

	/**
	 * Only for serializers.
	 */
	public Factor() {
		super();
	}

	/**
	 * @param uri
	 */
	public Factor(String uri) {
		super(uri);
	}

	/** {@ inheritDoc} */
	public String getClassURI() {
		return MY_URI;
	}

	/** {@ inheritDoc} */
	public boolean isWellFormed() {
		return true;
	}

	/** {@ inheritDoc} */
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_UNDEFINED;
	}

}
