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

public class KeroseneMeter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "KeroseneMetter";
	
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeKeroseneConsumptionAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeKeroseneConsumptionHistoricalData";
	
	public Float getMeasuredCummulativeKeroseneConsumptionHistoricalData() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA);	
	}
	public void setMeasuredCummulativeKeroseneConsumptionHistoricalData(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA, msg);	
	}
	public Float getMeasuredCummulativeKeroseneConsumptionAmount() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_AMOUNT);	
	}
	public void setMeasuredCummulativeKeroseneConsumptionAmount(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_AMOUNT, msg);	
	}

	
	public KeroseneMeter() {
		super();
	}
	public KeroseneMeter(String uri) {
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
