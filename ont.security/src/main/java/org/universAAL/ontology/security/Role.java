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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * @author amedrano
 *
 */
public class Role extends ManagedIndividual {
	 public static final String MY_URI = SecurityOntology.NAMESPACE + "Role";
	 public static final String PROP_SUB_ROLES = SecurityOntology.NAMESPACE + "includesRoles";
	 public static final String PROP_HAS_ACCESS_RIGHTS = SecurityOntology.NAMESPACE + "hasAccessRights";
	/**
	 * 
	 */
	public Role() {
	}

	/**
	 * @param uri
	 */
	public Role(String uri) {
		super(uri);
	}

	/**
	 * @param uriPrefix
	 * @param numProps
	 */
	public Role(String uriPrefix, int numProps) {
		super(uriPrefix, numProps);
	}

	/**{@inheritDoc} */
	public String getClassURI() {
		return MY_URI;
	}

	/**{@inheritDoc} */
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}
	
	public List getAllAccessRights(){
		return getAllAccessRights(new ArrayList());
	}

	private List getAllAccessRights(List visited){
		visited.add(this);
		ArrayList result = new ArrayList();
		
		Object directAR = getProperty(PROP_HAS_ACCESS_RIGHTS);
		if (directAR instanceof AccessRight){
			result.add(directAR);
		}
		if (directAR instanceof List){
			for (Iterator i = ((List) directAR).iterator(); i.hasNext();) {
				Object ar = (Object) i.next();
				result.add(ar);
			}
		}
		Object subRole = getProperty(PROP_SUB_ROLES);
		if (subRole instanceof Role && !visited.contains(subRole)){
			result.addAll(((Role)subRole).getAllAccessRights(visited));
		}
		if (subRole instanceof List){
			for (Iterator i = ((List) subRole).iterator(); i.hasNext();) {
				Object sr = (Object) i.next();
				if (!visited.contains(sr)) {
					result.addAll(((Role) sr).getAllAccessRights(visited));
				}
			}
		}
		
		return result;
	}
	
	public void addAccessRight(AccessRight ar){
		Object current = getProperty(PROP_HAS_ACCESS_RIGHTS);
		if (current == null){
			setProperty(PROP_HAS_ACCESS_RIGHTS, ar);
		}
		else if (current instanceof AccessRight){
			ArrayList nar = new ArrayList();
			nar.add(current);
			nar.add(ar);
			changeProperty(PROP_HAS_ACCESS_RIGHTS, nar);
		}
		else if (current instanceof List){
			((List) current).add(ar);
			changeProperty(PROP_HAS_ACCESS_RIGHTS, current);
		}
	}
	
	public void removeAccessRight(AccessRight ar) {
		Object current = getProperty(PROP_HAS_ACCESS_RIGHTS);
		if (current==null){
			return;
		}
		else if (current instanceof Role && current.equals(ar)){
			changeProperty(PROP_HAS_ACCESS_RIGHTS, null);
		}
		else if (current instanceof List){
			((List) current).remove(ar);
			changeProperty(PROP_HAS_ACCESS_RIGHTS, current);
		}
	}

	public void addSubRole(Role subrole){
		Object current = getProperty(PROP_SUB_ROLES);
		if (current==null){
			setProperty(PROP_SUB_ROLES, subrole);
		}
		else if (current instanceof Role){
			ArrayList nsr = new ArrayList();
			nsr.add(current);
			nsr.add(subrole);
			changeProperty(PROP_SUB_ROLES, nsr);
		}
		else if (current instanceof List){
			((List) current).add(subrole);
			changeProperty(PROP_SUB_ROLES, current);
		}
		
	}
	
	public void removeSubRole(Role subrole){
		Object current = getProperty(PROP_SUB_ROLES);
		if (current==null){
			return;
		}
		else if (current instanceof Role && current.equals(subrole)){
			changeProperty(PROP_SUB_ROLES, null);
		}
		else if (current instanceof List){
			((List) current).remove(subrole);
			changeProperty(PROP_SUB_ROLES, current);
		}
	}
}
