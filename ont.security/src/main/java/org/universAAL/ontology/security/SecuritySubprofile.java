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

import org.universAAL.middleware.owl.Intersection;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.TypeURI;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.ontology.profile.SubProfile;
import org.universAAL.ontology.profile.User;

/**
 * Security Subprofile to store Credentials, Roles, AccessRights ...
 * @author amedrano
 *
 */
public class SecuritySubprofile extends SubProfile {


    public static final String MY_URI = SecurityOntology.NAMESPACE + "SecuritySubprofile";
    
    public static final String PROP_CREDENTIALS = SecurityOntology.NAMESPACE + "associatedCredentials";
    public static final String PROP_ROLES = SecurityOntology.NAMESPACE + "hasRoles";

	public static final String PROP_DELEGATED_FORMS = SecurityOntology.NAMESPACE + "hasDelegationForms";;
	    
	
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
	    else if (p != null){
		ArrayList a = new ArrayList();
		a.add(p);
		return a;
	    }
	    return Collections.emptyList();
	}
	
	public void addCredential(Resource cred){
	    if (cred == null)
		return;
	    Object p = getProperty(PROP_CREDENTIALS);
	    ArrayList a = new ArrayList();
	    if (p instanceof List){
		a.addAll((List)p);
	    } 
	    else if (p != null){
		a.add(p);
	    }
	    if (a.isEmpty()){
		changeProperty(PROP_CREDENTIALS, cred);
	    } else {
		a.add(cred);
		changeProperty(PROP_CREDENTIALS, a);
	    }
	}

	public void addrole(Role r) {
		if (r == null)
			return;
		Object p = getProperty(PROP_ROLES);
		ArrayList a = new ArrayList();
		if (p instanceof List){
			a.addAll((List)p);
		} 
		else if (p instanceof Role){
			a.add(p);
		}
		if (a.isEmpty()){
			changeProperty(PROP_ROLES, r);
		} else {
			a.add(r);
			changeProperty(PROP_ROLES, a);
		}

	}
	
	public List getRoles(){
	    Object p = getProperty(PROP_ROLES);
	    if (p instanceof List){
		return (List) p;
	    } 
	    else if (p instanceof Role){
		ArrayList a = new ArrayList();
		a.add(p);
		return a;
	    }
	    return Collections.emptyList();
	}
	
	
	/**
	 * Generate Skeleton Roles to be added when creating new SecuritySubProfiles.
	 */
	public void initialiseDefaultRolesForUser(User u){
		Role delegationRole = new Role();
		delegationRole.setResourceLabel("Delegation Role");
		delegationRole.setResourceComment("Enables managing Delegation Forms issued by user: " + u.getURI());
		AccessRight dar = new AccessRight();
		dar.addAccessType(AccessType.read); //already granted by default access
		dar.addAccessType(AccessType.change);
		dar.addAccessType(AccessType.add);
		dar.addAccessType(AccessType.remove);
		
		Intersection te = new Intersection();
		te.addType(new TypeURI(DelegationForm.MY_URI, false));
		te.addType(MergedRestriction.getFixedValueRestriction(DelegationForm.PROP_AUTHORISER, u));
		
		dar.setAccessTo(te);
		delegationRole.addAccessRight(dar);
		addrole(delegationRole);
	}
}
