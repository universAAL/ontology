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
package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;


import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;
import org.universAAL.ontology.echonet.values.TypeClassificationValue;

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
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeKeroseneConsumptionInformationDateTimeValueTimeIncluded";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeKeroseneConsumptionHistoricalInformationDateTimeValueTimeIncluded";
	
	public String getMeasuredCumulativeKeroseneConsumptionUnit() {
		return (String) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_UNIT);	
	}
	public void setMeasuredCumulativeKeroseneConsumptionUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_UNIT, msg);	
	}
	public MeasuredValue getMeasuredCumulativeKeroseneConsumptionHistoricalInformationDateTimeValueTimeIncluded() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED);	
	}
	public void setMeasuredCumulativeKeroseneConsumptionHistoricalInformationDateTimeValueTimeIncluded(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED, msg);	
	}
	public MeasuredValue getMeasuredCumulativeKeroseneConsumptionInformationDateTimeValueTimeIncluded() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED);	
	}
	public void setMeasuredCumulativeKeroseneConsumptionInformationDateTimeValueTimeIncluded(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED, msg);	
	}
	public DateTimeValue getVerificationExpirationInformation() {
		return (DateTimeValue) getProperty(PROPERTY_VERIFICATION_EXPIRATION_INFORMATION);	
	}
	public void setVerificationExpirationInformation(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_VERIFICATION_EXPIRATION_INFORMATION, msg);	
	}
	public String getIDNumberSetting() {
		return (String) getProperty(PROPERTY_HAS_ID_NUMBER_SETTING);	
	}
	public void setIDNumberSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ID_NUMBER_SETTING, msg);	
	}
	public DateTimeValue getSlightLeakTimerValue() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE);	
	}
	public void setSlightLeakTimerValue(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE, msg);	
	}
	public MeasuredValue getResidualVolumeControlWarningLevel3() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3);	
	}
	public void setResidualVolumeControlWarningLevel3(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3, msg);	
	}
	public MeasuredValue getResidualVolumeControlWarningLevel2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2);	
	}
	public void setResidualVolumeControlWarningLevel2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2, msg);	
	}
	public MeasuredValue getResidualVolumeControlWarningLevel1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1);	
	}
	public void setResidualVolumeControlWarningLevel1(MeasuredValue msg) {
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
		return (String) getProperty(PROPERTY_HAS_SECURITY_DATA_INFORMATION);	
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
	public MeasuredValue getCollectionDataSettingForHistoryCumulativeKeroseneConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_COLLECTION_DATE_SETTING_FOR_HISTORY_CUMULATIVE_KEROSENE_CONSUMPTION);	
	}
	public void setCollectionDataSettingForHistoryCumulativeKeroseneConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COLLECTION_DATE_SETTING_FOR_HISTORY_CUMULATIVE_KEROSENE_CONSUMPTION, msg);	
	}

	public MeasuredValue getMeasuredCumulativeKeroseneConsumptionHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA);	
	}
	public void setMeasuredCumulativeKeroseneConsumptionHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA, msg);	
	}

	public MeasuredValue getMeasuredCumulativeKeroseneConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION);	
	}
	public void setMeasuredCumulativeKeroseneConsumption(MeasuredValue msg) {
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
