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

public class MountedAirRefreshingMethodValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MountedAirRefreshingMethodValue";
	public static final String PROPERTY_HAS_MINUS_ION_METHOD_MOUTING = EchonetOntology.NAMESPACE + "hasMinusIonMethodMounting";
	public static final String PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING = EchonetOntology.NAMESPACE + "hasClusterIonMethodMounting";

	public MountedAirRefreshingMethodValue() {
		super();
		setMinusIonMethodMounting(OperationStateSettingValue.UnMountedState);
		setClusterIonMethodMounting(OperationStateSettingValue.UnMountedState);
	}
	public MountedAirRefreshingMethodValue(String uri) {
		super(uri);
		setMinusIonMethodMounting(OperationStateSettingValue.UnMountedState);
		setClusterIonMethodMounting(OperationStateSettingValue.UnMountedState);
	}
	public MountedAirRefreshingMethodValue(String uri, OperationStateSettingValue minusIonMethodMouting,OperationStateSettingValue clusterIonMethodMouting ) {
		super(uri);
		setMinusIonMethodMounting(minusIonMethodMouting);
		setClusterIonMethodMounting(clusterIonMethodMouting);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public OperationStateSettingValue getMinusIonMethodMounting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_MINUS_ION_METHOD_MOUTING);
	}
	public void setMinusIonMethodMounting(OperationStateSettingValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MINUS_ION_METHOD_MOUTING,msg);
	}
	public OperationStateSettingValue getClusterIonMethodMounting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING);
	}
	public void setClusterIonMethodMounting(OperationStateSettingValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
