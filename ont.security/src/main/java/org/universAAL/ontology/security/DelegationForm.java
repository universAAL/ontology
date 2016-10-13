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
import java.util.List;

import org.universAAL.middleware.owl.TypeExpression;
import org.universAAL.middleware.owl.TypeURI;
import org.universAAL.ontology.cryptographic.SignedResource;

/**
 * Delegation Form is a {@link SignedResource}, signed by the {@link DelegationForm#PROP_AUTHORISER Authoriser}
 * enabling the {@link DelegationForm#PROP_DELEGATE Delegate} to perform some {@link DelegationForm#PROP_DELEGATED_COMPETENCES Competences}
 * in the form of {@link Role Roles}.
 * <BR>
 * {@link DelegationForm}s should be checked when performing Authorisation queries.
 * <BR>
 * The {@link SignedResource#PROP_SIGNED_RESOURCE} property of {@link DelegationForm} should be self pointing (references the self instance).
 * @author amedrano
 *
 */
public class DelegationForm extends SignedResource {

	 public static final String MY_URI = SecurityOntology.NAMESPACE + "DelegationForm";
	 public static final String PROP_AUTHORISER = SecurityOntology.NAMESPACE + "authoriser";
	 public static final String PROP_DELEGATE = SecurityOntology.NAMESPACE + "delegate";
	 public static final String PROP_DELEGATED_COMPETENCES = SecurityOntology.NAMESPACE + "competences";


	/**
	 * 
	 */
	public DelegationForm() {
	}

	/**
	 * @param uri
	 */
	public DelegationForm(String uri) {
		super(uri);
		//addDefaultAccessRight(); //TODO: how to enforce this by default without breaking the Ont.create?
	}

	/**{@inheritDoc} */
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}
	
	private void addDefaultAccessRight(){
		AccessRight ddfar = new AccessRight(SecurityOntology.NAMESPACE+"defaultAllReadDelegationForm");
		ddfar.addAccessType(AccessType.read);
		TypeExpression te = new TypeURI(DelegationForm.MY_URI, false);
		ddfar.setAccessTo(te);
		setProperty(Asset.PROP_HAS_DEFAULT_ACCESS, ddfar);
	}
	

	/**{@inheritDoc} */
	public String getClassURI() {
		return MY_URI;
	}
	
	public void addCompetenceRole(Role role){
		Object current = getProperty(PROP_DELEGATED_COMPETENCES);
		if (current==null){
			setProperty(PROP_DELEGATED_COMPETENCES, role);
		}
		else if (current instanceof Role){
			ArrayList nsr = new ArrayList();
			nsr.add(current);
			nsr.add(role);
			changeProperty(PROP_DELEGATED_COMPETENCES, nsr);
		}
		else if (current instanceof List){
			((List) current).add(role);
			changeProperty(PROP_DELEGATED_COMPETENCES, current);
		}
		
	}
}
