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
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;
import org.universAAL.ontology.echonetontology.values.TypeClassificationValue;

public class SmartKeroseneMeter extends EchonetSuperDevice{
	
	public static final String MY_URI = EchonetOntology.NAMESPACE + "SmartKeroseneMetter";
	public static final String PROPERTY_HAS_OWNER_CLASSIFICATION = EchonetOntology.NAMESPACE + "hasOwnerClassification";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeKeroseneConsumption";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_UNIT = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeKeroseneConsumptionUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeKeroseneConsumptionHistoricalData";
	public static final String PROPERTY_HAS_COLLECTION_DATE_SETTING_FOR_HISTORY_CUMULATIVE_KEROSENE_CONSUMPTION = EchonetOntology.NAMESPACE + "hasCollectionDataSettingForHistoryCumulativeKeroseneConsumption";
	public static final String PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA = EchonetOntology.NAMESPACE + "hasDetectionOfAbnormalValueInMetterData";
	public static final String PROPERTY_HAS_SECURITY_DATA_INFORMATION = EchonetOntology.NAMESPACE + "hasSecurityDataInformation";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL = EchonetOntology.NAMESPACE + "hasResidualVolumeControlWarningLevel";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1 = EchonetOntology.NAMESPACE + "hasResidualVolumeControlWarningLevel1";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2 = EchonetOntology.NAMESPACE + "hasResidualVolumeControlWarningLevel2";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3 = EchonetOntology.NAMESPACE + "hasResidualVolumeControlWarningLevel3";
	public static final String PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE = EchonetOntology.NAMESPACE + "hasSlightLeakTimerValue";
	public static final String PROPERTY_HAS_ID_NUMBER_SETTING = EchonetOntology.NAMESPACE + "hasIDNumberSetting";
	public static final String PROPERTY_VERIFICATION_EXPIRATION_INFORMATION= EchonetOntology.NAMESPACE + "hasVerificationExpirationInformation";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeKeroseneConsumptionInformationStringTimeIncluded";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeKeroseneConsumptionHistoricalInformationStringTimeIncluded";
	
	public String getMeasuredCumulativeKeroseneConsumptionUnit() {
		return  getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_UNIT).toString();	
	}
	public void setMeasuredCumulativeKeroseneConsumptionUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_UNIT, msg);	
	}
	public Float getMeasuredCumulativeKeroseneConsumptionHistoricalInformationStringTimeIncluded() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED);	
	}
	public void setMeasuredCumulativeKeroseneConsumptionHistoricalInformationStringTimeIncluded(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED, msg);	
	}
	public Float getMeasuredCumulativeKeroseneConsumptionInformationStringTimeIncluded() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED);	
	}
	public void setMeasuredCumulativeKeroseneConsumptionInformationStringTimeIncluded(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED, msg);	
	}
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
	public String getSlightLeakTimerValue() {
		return  getProperty(PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE).toString();	
	}
	public void setSlightLeakTimerValue(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE, msg);	
	}
	public Float getResidualVolumeControlWarningLevel3() {
		return (Float) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3);	
	}
	public void setResidualVolumeControlWarningLevel3(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3, msg);	
	}
	public Float getResidualVolumeControlWarningLevel2() {
		return (Float) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2);	
	}
	public void setResidualVolumeControlWarningLevel2(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2, msg);	
	}
	public Float getResidualVolumeControlWarningLevel1() {
		return (Float) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1);	
	}
	public void setResidualVolumeControlWarningLevel1(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1, msg);	
	}
	public ThresholdLevelValue getResidualVolumeControlWarningLevel() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL);	
	}
	public void setResidualVolumeControlWarningLevel(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL, msg);	
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
	public Float getCollectionDataSettingForHistoryCumulativeKeroseneConsumption() {
		return (Float) getProperty(PROPERTY_HAS_COLLECTION_DATE_SETTING_FOR_HISTORY_CUMULATIVE_KEROSENE_CONSUMPTION);	
	}
	public void setCollectionDataSettingForHistoryCumulativeKeroseneConsumption(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COLLECTION_DATE_SETTING_FOR_HISTORY_CUMULATIVE_KEROSENE_CONSUMPTION, msg);	
	}

	public Float getMeasuredCumulativeKeroseneConsumptionHistoricalData() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA);	
	}
	public void setMeasuredCumulativeKeroseneConsumptionHistoricalData(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA, msg);	
	}

	public Float getMeasuredCumulativeKeroseneConsumption() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION);	
	}
	public void setMeasuredCumulativeKeroseneConsumption(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION, msg);	
	}
	public TypeClassificationValue getOwnerClassification() {
		return (TypeClassificationValue) getProperty(PROPERTY_HAS_OWNER_CLASSIFICATION);	
	}
	public void setOwnerClassification(TypeClassificationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OWNER_CLASSIFICATION, msg);	
	}
	
	public SmartKeroseneMeter() {
		super();
	}
	public SmartKeroseneMeter(String uri) {
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
