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

import org.universAAL.middleware.xsd.Base64Binary;
import org.universAAL.ontology.cryptographic.Digest;

/**
 * @author amedrano
 *
 */
public class Password extends KnowledgeFactor {

    public static final String MY_URI = SecurityOntology.NAMESPACE + "InherenceFactor";
    public static final String PROP_PASSWORD = SecurityOntology.NAMESPACE
    	    + "password";
    public static final String PROP_PASSWORD_DIGEST = SecurityOntology.NAMESPACE
    	    + "passwordDigestAlgorithm";
	
	/**
	 * Only for serializers.
	 */
	public Password() {
	    super();
	}

	/**
	 * @param uri
	 */
	public Password(String uri) {
		super(uri);
	}

	/** {@ inheritDoc}	 */
	public String getClassURI() {
		return MY_URI;
	}

	/** {@ inheritDoc}	 */
	public boolean isWellFormed() {
		return hasProperty(PROP_PASSWORD)
				&& super.isWellFormed();
	}

	/** {@ inheritDoc}	 */
	public int getPropSerializationType(String propURI) {
		if (propURI.equals(PROP_PASSWORD)
			||propURI.equals(PROP_PASSWORD_DIGEST)){
			return PROP_SERIALIZATION_FULL;
		}
		return PROP_SERIALIZATION_UNDEFINED;
	}
	
	public Base64Binary getPassword(){
		return (Base64Binary) getProperty(PROP_PASSWORD);
	}
	public Digest getDigestAlgorithm(){
		return (Digest) getProperty(PROP_PASSWORD_DIGEST);
	}
	
	public void setpassword(Base64Binary value){
		if (value != null ){
			changeProperty(PROP_PASSWORD, value);
		}
	}
	
	public void setDigestAlgorithm(Digest value){
		if (value != null ){
			changeProperty(PROP_PASSWORD_DIGEST, value);
		}
	}
}