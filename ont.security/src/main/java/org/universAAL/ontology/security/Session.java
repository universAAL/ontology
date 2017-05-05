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

import javax.xml.datatype.XMLGregorianCalendar;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Upper Session concept.
 * @author amedrano
 *
 */
public class Session extends ManagedIndividual {


    public static final String MY_URI = SecurityOntology.NAMESPACE + "Session";
    public static final String PROP_EXPIRATION = SecurityOntology.NAMESPACE
    	    + "validUntil";
    public static final String PROP_BOUND_TO = SecurityOntology.NAMESPACE
    	    + "boundTo";
    
    public static final String INSTANCE_INVALID_SESSION = SecurityOntology.NAMESPACE + "invalidSession";
    public static ManagedIndividual invalid = new Session(INSTANCE_INVALID_SESSION);
	/**
	 * Only for serializers.
	 */
	public Session() {
	    super();
	}

	/**
	 * @param uri
	 */
	public Session(String uri) {
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
		return PROP_SERIALIZATION_FULL;
	}

	public XMLGregorianCalendar getExpirationDate(){
		return (XMLGregorianCalendar) getProperty(PROP_EXPIRATION); 
	}
	
	public void setExpiration(XMLGregorianCalendar date){
		if (date != null) {
			changeProperty(PROP_EXPIRATION, date);
		}
	}
	
}
