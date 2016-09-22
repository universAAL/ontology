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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.universAAL.ontology.profile.SubProfile;

/**
 * Security Subprofile to store Credentials, Roles, AccessRights ...
 * @author amedrano
 *
 */
public class SecuritySubprofile extends SubProfile {


    public static final String MY_URI = SecurityOntology.NAMESPACE + "SecuritySubprofile";
    
    public static final String PROP_CREDENTIALS = SecurityOntology.NAMESPACE + "associatedCredentials";
    public static final String PROP_ROLES = SecurityOntology.NAMESPACE + "hasRoles";
	    
	
	/**
	 * Only for serializers.
	 */
	public SecuritySubprofile() {
	    super();
	}

	/**
	 * @param uri
	 */
	public SecuritySubprofile(String uri) {
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

	public List getCredentials(){
	    Object p = getProperty(PROP_CREDENTIALS);
	    if (p instanceof List){
		return (List) p;
	    } 
	    else if (p instanceof Credentials){
		ArrayList a = new ArrayList();
		a.add(p);
		return a;
	    }
	    return Collections.emptyList();
	}
	
	public void addCredential(Credentials cred){
	    if (cred == null)
		return;
	    Object p = getProperty(PROP_CREDENTIALS);
	    ArrayList a = new ArrayList();
	    if (p instanceof List){
		a.addAll((List)p);
	    } 
	    else if (p instanceof Credentials){
		a.add(p);
	    }
	    if (a.isEmpty()){
		changeProperty(PROP_CREDENTIALS, cred);
	    } else {
		a.add(cred);
		changeProperty(PROP_CREDENTIALS, a);
	    }
	}
	
}
