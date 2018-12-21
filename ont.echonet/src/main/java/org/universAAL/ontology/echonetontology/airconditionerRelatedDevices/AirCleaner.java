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
package org.universAAL.ontology.echonetontology.airconditionerRelatedDevices;

import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.values.OccurenceStatusValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;

public class AirCleaner extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "AirCleaner";
	public static final String PROPERTY_HAS_FILTER_CHANGE_NOTICE = EchonetOntology.NAMESPACE +"hasFilterChangeNotice";
	public static final String PROPERTY_HAS_AIR_FLOW_RATE_SETTING = EchonetOntology.NAMESPACE + "hasAirFlowRateSetting";
	public static final String PROPERTY_HAS_SMOKE_DETECTION_STATUS = EchonetOntology.NAMESPACE + "hasSmokeDetectionStatus";
	public static final String PROPERTY_HAS_OPTICAL_CATALYST_OPERATION_SETTING = EchonetOntology.NAMESPACE + 
																				 "hasOpticalCatalystOperationSetting";
	public static final String PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS = EchonetOntology.NAMESPACE + "hasAirPollutionDetectionStatus";
	
	public OccurenceStatusValue getAirPollutionDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS);
	}
	public void setAirPollutionDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS, msg);
	}
	public OperationStatusValue getOpticalCatalystOperationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OPTICAL_CATALYST_OPERATION_SETTING);
	}
	public void setOpticalCatalystOperationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPTICAL_CATALYST_OPERATION_SETTING, msg);
	}
	public OccurenceStatusValue getSmokeDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_SMOKE_DETECTION_STATUS);	
	}
	public void setSmokeDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_SMOKE_DETECTION_STATUS,msg);	
	}
	public ThresholdLevelValue getAirFlowRateSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING);	
	}
	public void setAirFlowRateSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING, msg);	
	}
	public OccurenceStatusValue getFilterChangeNotice() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_FILTER_CHANGE_NOTICE);	
	}
	public void setFilterChangeNotice(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_FILTER_CHANGE_NOTICE,msg);	
	}

	public AirCleaner() {
		super();
	}
	public AirCleaner(String uri) {
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
