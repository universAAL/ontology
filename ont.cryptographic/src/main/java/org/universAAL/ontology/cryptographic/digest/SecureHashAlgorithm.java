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
package org.universAAL.ontology.cryptographic.digest;

import org.universAAL.ontology.cryptographic.CryptographicOntology;
import org.universAAL.ontology.cryptographic.Digest;

/**
 * @author amedrano
 *
 */
public class SecureHashAlgorithm extends Digest {
	
	public static final String MY_URI = CryptographicOntology.NAMESPACE + "SecureHashAlgorithm";
	
	public static final SecureHashAlgorithm IND_SHA = new SecureHashAlgorithm(CryptographicOntology.NAMESPACE + "sha");
	public static final SecureHashAlgorithm IND_SHA256 = new SecureHashAlgorithm(CryptographicOntology.NAMESPACE + "sha-256");
	public static final SecureHashAlgorithm IND_SHA384 = new SecureHashAlgorithm(CryptographicOntology.NAMESPACE + "sha-384");
	public static final SecureHashAlgorithm IND_SHA512 = new SecureHashAlgorithm(CryptographicOntology.NAMESPACE + "sha-512");
	
	/**
	 * 
	 */
	public SecureHashAlgorithm() {
	}

	/**
	 * @param uri
	 */
	public SecureHashAlgorithm(String uri) {
		super(uri);
	}

	/**{@inheritDoc} */
	public String getClassURI() {
		return MY_URI;
	}

}
