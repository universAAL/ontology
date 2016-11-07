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
import java.util.Collection;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.TypeExpression;
import org.universAAL.middleware.rdf.ClosedCollection;
import org.universAAL.middleware.rdf.Resource;

/**
 * @author amedrano
 *
 */
public class AccessRight extends ManagedIndividual {
	 public static final String MY_URI = SecurityOntology.NAMESPACE + "AccessRight";
	 public static final String PROP_ACCESS_TYPE = SecurityOntology.NAMESPACE + "hasAccessType";
	 public static final String PROP_ACCESS_TO = SecurityOntology.NAMESPACE + "hasAccessTo";

	/**
	 * 
	 */
	public AccessRight() {
	}

	/**
	 * @param uri
	 */
	public AccessRight(String uri) {
		super(uri);
	}

	/**
	 * @param uriPrefix
	 * @param numProps
	 */
	public AccessRight(String uriPrefix, int numProps) {
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
	
	/** {@inheritDoc} */
	public boolean setProperty(String propURI, Object value) {
		if (propURI.equals(PROP_ACCESS_TO) && value != null){
			((Resource)value).literal();
		}
		return super.setProperty(propURI, value);
	}

	public void addAccessType(AccessType at){
		ClosedCollection cc = new ClosedCollection();
		Object o = getProperty(PROP_ACCESS_TYPE);
		if (o == null){
			cc.add(at);
		}else if (o instanceof ClosedCollection){
			cc.addAll((ClosedCollection) o);
			cc.add(at);
		}
		changeProperty(PROP_ACCESS_TYPE, cc);
	}
	
	public void removeAccessType(AccessType at){
		Object o = getProperty(PROP_ACCESS_TYPE);
		if (o != null){
			((ClosedCollection) o).remove(at);
			changeProperty(PROP_ACCESS_TYPE, o);
		}
	}

	public void setAccessTo(TypeExpression te){
		changeProperty(PROP_ACCESS_TO, te);
	}
	
}
