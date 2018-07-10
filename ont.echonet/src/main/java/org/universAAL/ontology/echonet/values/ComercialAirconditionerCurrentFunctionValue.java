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

public class ComercialAirconditionerCurrentFunctionValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ComercialAirconditionerCurrentFunction";
	public static final String PROPERTY_HAS_AUTOMATIC_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "hasAutomaticOperationModeSetting";
	public static final String PROPERTY_HAS_FUNCTION = EchonetOntology.NAMESPACE + "hasFunction";

	public ComercialAirconditionerCurrentFunctionValue() {
		super();
	}
	public ComercialAirconditionerCurrentFunctionValue(String uri) {
		super(uri);
	}
	public ComercialAirconditionerCurrentFunctionValue(String uri, OccurenceStatusValue automaticMode,OperationModeSettingValue operationMode ) {
		super(uri);
		setAutomaticOperationModeSetting(automaticMode);
		setCurrentFunctionHasFunction(operationMode);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public OccurenceStatusValue getAutomaticOperationModeSetting() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_OPERATION_MODE_SETTING);
	}
	public void setAutomaticOperationModeSetting(OccurenceStatusValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_AUTOMATIC_OPERATION_MODE_SETTING,msg);
	}
	public OperationModeSettingValue getCurrentFunctionHasFunction() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_FUNCTION);
	}
	public void setCurrentFunctionHasFunction(OperationModeSettingValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_FUNCTION,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
