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
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/**
 * Multifactor type Credentials.
 * @author amedrano
 *
 */
public class MultifactorCredentials extends Credentials {


    public static final String MY_URI = SecurityOntology.NAMESPACE + "MultifactorCredentials";
    public static final String PROP_FACTORS = SecurityOntology.NAMESPACE
    	    + "FACTORS";
        
	
	/**
	 * Only for serializers.
	 */
	public MultifactorCredentials() {
	    super();
	}

	/**
	 * @param uri
	 */
	public MultifactorCredentials(String uri) {
		super(uri);
	}


	/** {@ inheritDoc}	 */
	public String getClassURI() {
		return MY_URI;
	}

	/** {@ inheritDoc}	 */
	public boolean isWellFormed() {
		return hasProperty(PROP_FACTORS) && super.isWellFormed();
	}

	/** {@ inheritDoc}	 */
	public int getPropSerializationType(String propURI) {
		if (propURI.equals(PROP_FACTORS)){
			return PROP_SERIALIZATION_FULL;
		}
		return PROP_SERIALIZATION_UNDEFINED;
	}
	
	public void addFactor(Factor f){
		Object fs = getProperty(PROP_FACTORS);
		if (fs == null){
			fs=f;
		}
		else if (fs instanceof Collection){
			((Collection)fs).add(fs);
		}
		else {
			List nfs = new ArrayList();
			nfs.add(fs);
			nfs.add(f);
			fs = nfs;
		}
		changeProperty(PROP_FACTORS, fs);
	}
	
	public List getFactors(){
		Object fs = getProperty(PROP_FACTORS);
		if (fs == null){
			return Collections.emptyList();
		}
		else if (fs instanceof List){
			return (List)fs;
		}
		else {
			List nfs = new ArrayList();
			nfs.add(fs);
			return nfs;
		}

	}
}
