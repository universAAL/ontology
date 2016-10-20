/*******************************************************************************
 * Copyright 2016 Universidad Politécnica de Madrid UPM
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
 * Any anonymizable resource should be subclass of this class to enable the anonymization service to encrypt the 
 * {@link Anonymizable#PROP_ANNONYMOUS_RESOURCE} property reference.
 * 
 * @author amedrano
 *
 */
public class Anonymizable extends ManagedIndividual {

	public static final String MY_URI = SecurityOntology.NAMESPACE + "Anonymizable";
	
	public  static final String PROP_ANNONYMOUS_RESOURCE = SecurityOntology.NAMESPACE + "anonymisedResource";

	/**
	 * 
	 */
	public Anonymizable() {
	}

	/**
	 * @param uri
	 */
	public Anonymizable(String uri) {
		super(uri);
	}

	/**{@inheritDoc} */
	public String getClassURI() {
		return MY_URI;
	}

	/**
	 * @param uriPrefix
	 * @param numProps
	 */
	public Anonymizable(String uriPrefix, int numProps) {
		super(uriPrefix, numProps);
	}

	/**{@inheritDoc} */
	public int getPropSerializationType(String arg0) {
		if (arg0.equals(PROP_ANNONYMOUS_RESOURCE)){
			return PROP_SERIALIZATION_FULL;
		}
		return PROP_SERIALIZATION_REDUCED;
	}

}
