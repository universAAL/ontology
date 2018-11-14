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
package org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;

public class GasMeter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "GasMetter";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeGasConsumptionAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_LOG = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeGasConsumptionLog";

	public Float getMeasuredCummulativeGasConsumptionLog() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_LOG);	
	}
	public void setMeasuredCummulativeGasConsumptionLog(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_LOG, msg);	
	}
	public Float getMeasuredCummulativeGasConsumptionAmount() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_AMOUNT);	
	}
	public void setMeasuredCummulativeGasConsumptionAmount(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_AMOUNT, msg);	
	}

	
	public GasMeter() {
		super();
	}
	public GasMeter(String uri) {
		super(uri);
	}
	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}
	

}
