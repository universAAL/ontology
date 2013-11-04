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

import org.universAAL.middleware.xsd.util.Base64;

/**
 * User-Password type Credentials.
 * @author amedrano
 *
 */
public class UserPasswordCredentials extends Credentials {


    public static final String MY_URI = SecurityOntology.NAMESPACE + "UserPasswordCredentials";
    public static final String PROP_USERNAME = SecurityOntology.NAMESPACE
    	    + "username";
    public static final String PROP_PASSWORD = SecurityOntology.NAMESPACE
    	    + "password";
    public static final String PROP_PASSWORD_DIGEST = SecurityOntology.NAMESPACE
    	    + "passwordDigestAlgorithm";
        
	
	/**
	 * Only for serializers.
	 */
	public UserPasswordCredentials() {
	    super();
	}

	/**
	 * @param uri
	 */
	public UserPasswordCredentials(String uri) {
		super(uri);
	}


	/** {@ inheritDoc}	 */
	public String getClassURI() {
		return MY_URI;
	}

	/** {@ inheritDoc}	 */
	public boolean isWellFormed() {
		return hasProperty(PROP_PASSWORD)
				&& hasProperty(PROP_USERNAME)
				&& super.isWellFormed();
	}

	/** {@ inheritDoc}	 */
	public int getPropSerializationType(String propURI) {
		if (propURI.equals(PROP_PASSWORD)||propURI.equals(PROP_USERNAME)
			||propURI.equals(PROP_PASSWORD_DIGEST)){
			return PROP_SERIALIZATION_FULL;
		}
		return PROP_SERIALIZATION_UNDEFINED;
	}

	public String getUsername(){
		return (String) getProperty(PROP_USERNAME);
	}
	public Base64 getPassword(){
		return (Base64) getProperty(PROP_PASSWORD);
	}
	public String getDigestAlgorithm(){
		return (String) getProperty(PROP_PASSWORD_DIGEST);
	}
	
	public void setUsername(String value){
		if (value != null && !value.isEmpty()){
			changeProperty(PROP_USERNAME, value);
		}
	}
	
	public void setpassword(Base64 value){
		if (value != null ){
			changeProperty(PROP_PASSWORD, value);
		}
	}
	
	public void setDigestAlgorithm(String value){
		if (value != null ){
			changeProperty(PROP_PASSWORD_DIGEST, value);
		}
	}
	
}
