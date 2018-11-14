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
import org.universAAL.ontology.echonetontology.values.OccurenceStatusValue;
import org.universAAL.ontology.echonetontology.values.TypeClassificationValue;

public class WaterFlowMeter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WaterFlowmetter";
	public static final String PROPERTY_HAS_WATER_FLOW_METTER_CLASSIFICATION = EchonetOntology.NAMESPACE + "hasWaterFlowMetterClassification";
	public static final String PROPERTY_HAS_OWNER_CLASSIFICATION = EchonetOntology.NAMESPACE + "hasOwnerClassification";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeFlowingWaterAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_UNIT = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeFlowingWaterAmountUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeFlowingWaterAmountHistoricalData";
	public static final String PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA = EchonetOntology.NAMESPACE + "hasDetectionOfAbnormalValueInMetterData";
	public static final String PROPERTY_HAS_SECURITY_DATA_INFORMATION = EchonetOntology.NAMESPACE + "hasSecurityDataInformation";
	public static final String PROPERTY_HAS_ID_NUMBER_SETTING = EchonetOntology.NAMESPACE + "hasIDNumberSetting";
	public static final String PROPERTY_VERIFICATION_EXPIRATION_INFORMATION= EchonetOntology.NAMESPACE + "hasVerificationExpirationInformation";
	
	public String getVerificationExpirationInformation() {
		return  getProperty(PROPERTY_VERIFICATION_EXPIRATION_INFORMATION).toString();	
	}
	public void setVerificationExpirationInformation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_VERIFICATION_EXPIRATION_INFORMATION, msg);	
	}
	public String getIDNumberSetting() {
		return  getProperty(PROPERTY_HAS_ID_NUMBER_SETTING).toString();	
	}
	public void setIDNumberSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ID_NUMBER_SETTING, msg);	
	}
	public String getSecurityDataInformation() {
		return  getProperty(PROPERTY_HAS_SECURITY_DATA_INFORMATION).toString();	
	}
	public void setSecurityDataInformation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SECURITY_DATA_INFORMATION, msg);	
	}
	public OccurenceStatusValue getDetectionOfAbnormalValueInMetterData() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA);	
	}
	public void setDetectionOfAbnormalValueInMetterData(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA, msg);	
	}
	public Float getMeasuredCummulativeFlowingWaterAmountHistoricalData() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_HISTORICAL_DATA);	
	}
	public void setMeasuredCummulativeFlowingWaterAmountHistoricalData(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_HISTORICAL_DATA, msg);	
	}
	public String getMeasuredCummulativeFlowingWaterAmountUnit() {
		return  getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_UNIT).toString();	
	}
	public void setMeasuredCummulativeFlowingWaterAmountUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_UNIT, msg);	
	}
	public Float getMeasuredCummulativeFlowingWaterAmount() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT);	
	}
	public void setMeasuredCummulativeFlowingWaterAmount(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT, msg);	
	}
	public TypeClassificationValue getOwnerClassification() {
		return (TypeClassificationValue) getProperty(PROPERTY_HAS_OWNER_CLASSIFICATION);	
	}
	public void setOwnerClassification(TypeClassificationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OWNER_CLASSIFICATION, msg);	
	}
	public TypeClassificationValue getWaterFlowMetterClassification() {
		return (TypeClassificationValue) getProperty(PROPERTY_HAS_WATER_FLOW_METTER_CLASSIFICATION);	
	}
	public void setWaterFlowMetterClassification(TypeClassificationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_FLOW_METTER_CLASSIFICATION, msg);	
	}


	
	public WaterFlowMeter() {
		super();
	}
	public WaterFlowMeter(String uri) {
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
