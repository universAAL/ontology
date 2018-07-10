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

public class MountedAirSelfCleaningMethodValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MountedAirSelfCleaningMethodValue";
	public static final String PROPERTY_HAS_OZONE_CLEANING_METHOD_MOUTING = EchonetOntology.NAMESPACE + "hasOzoneCleaningMethodMounting";
	public static final String PROPERTY_HAS_DRYING_METHOD_MOUTING = EchonetOntology.NAMESPACE + "hasDryingMethodMounting";

	public MountedAirSelfCleaningMethodValue() {
		super();
		setOzoneCleaningMethodMounting(OperationStateSettingValue.UnMountedState);
		setDryingMethodMounting(OperationStateSettingValue.UnMountedState);
	}
	public MountedAirSelfCleaningMethodValue(String uri) {
		super(uri);
		setOzoneCleaningMethodMounting(OperationStateSettingValue.UnMountedState);
		setDryingMethodMounting(OperationStateSettingValue.UnMountedState);
	}
	public MountedAirSelfCleaningMethodValue(String uri, OperationStateSettingValue ozoneCleaningMethodMouting,OperationStateSettingValue dryingMethodMouting ) {
		super(uri);
		setOzoneCleaningMethodMounting(ozoneCleaningMethodMouting);
		setDryingMethodMounting(dryingMethodMouting);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public OperationStateSettingValue getOzoneCleaningMethodMounting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_OZONE_CLEANING_METHOD_MOUTING);
	}
	public void setOzoneCleaningMethodMounting(OperationStateSettingValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_OZONE_CLEANING_METHOD_MOUTING,msg);
	}
	public OperationStateSettingValue getDryingMethodMounting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DRYING_METHOD_MOUTING);
	}
	public void setDryingMethodMounting(OperationStateSettingValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_DRYING_METHOD_MOUTING,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
