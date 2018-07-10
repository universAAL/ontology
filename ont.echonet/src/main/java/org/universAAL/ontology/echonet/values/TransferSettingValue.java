/*******************************************************************************
 * Copyright 2018 PHAM Van Cu, Tan laboratory, Japan Advanced Institute of Science and Technology (JAIST),
 *  Japan as a part of the CARESSES project (http://www.caressesrobot.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class TransferSettingValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "TransferSettingValue";
	public static final String PROPERTY_HAS_TRANSFERING_METHOD= EchonetOntology.NAMESPACE + "hasTransferingMethod";
	public static final String PROPERTY_HAS_TRANSFERING_METHOD_STATUS = EchonetOntology.NAMESPACE + "hasTransferingMethodStatus";

	public OperationStatusValue getTransferingMethodStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_TRANSFERING_METHOD);
	}
	public void setTransferingMethodStatus(OperationStatusValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_TRANSFERING_METHOD,msg);
	}
	public TransferingMethods getTransferingMethod() {
		return (TransferingMethods) getProperty(PROPERTY_HAS_TRANSFERING_METHOD);
	}
	public void setTransferingMethod(TransferingMethods msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_TRANSFERING_METHOD,msg);
	}
	public TransferSettingValue() {
		super();
	}
	public TransferSettingValue(String uri) {
		super(uri);
		
	}
	public TransferSettingValue(String uri, TransferingMethods method,OperationStatusValue status ) {
		super(uri);
		setTransferingMethodStatus(status);
		setTransferingMethod(method);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public String getClassURI() {
		return MY_URI;
	}

}
