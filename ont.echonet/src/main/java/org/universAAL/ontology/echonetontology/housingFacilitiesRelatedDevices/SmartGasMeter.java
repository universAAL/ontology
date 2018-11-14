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
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.TypeClassificationValue;

public class SmartGasMeter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "SmartGasMetter";
	public static final String PROPERTY_HAS_GAS_METTER_CLASSIFICATION_SETTING = EchonetOntology.NAMESPACE + "hasGasMetterClassificationSetting";
	public static final String PROPERTY_HAS_OWNER_CLASSIFICATION = EchonetOntology.NAMESPACE + "hasOwnerClassification";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeGasConsumption";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_UNIT = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeGasConsumptionUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeGasConsumptionHistoricalData";
	public static final String PROPERTY_HAS_DAY_TO_RETRIEVE_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "hasDayToRetrieveMeasuredCumulativeGasConsumptionHistoricalData";
	public static final String PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA = EchonetOntology.NAMESPACE + "hasDetectionOfAbnormalValueInMetterData";
	public static final String PROPERTY_HAS_SECURITY_DATA_INFORMATION = EchonetOntology.NAMESPACE + "hasSecurityDataInformation";
	public static final String PROPERTY_HAS_ID_NUMBER_SETTING = EchonetOntology.NAMESPACE + "hasIDNumberSetting";
	public static final String PROPERTY_VERIFICATION_EXPIRATION_INFORMATION= EchonetOntology.NAMESPACE + "hasVerificationExpirationInformation";
	public static final String PROPERTY_HAS_VALVE_CLOSURE_BY_THE_CENTER = EchonetOntology.NAMESPACE + "hasValveClosureByTheCenter";
	public static final String PROPERTY_HAS_PERMISSION_FROM_THE_CENTER_TO_REOPEN_VALUE_CLOSED_BY_THE_CENTER = EchonetOntology.NAMESPACE + "hasPermissionFromTheCenterToReopenTheValveClosedByTheCenter";
	public static final String PROPERTY_HAS_EMERGENCY_CLOSURE_OF_SHUTOFF_VALVE = EchonetOntology.NAMESPACE + "hasEmergencyClosureOfShutoffValve";
	public static final String PROPERTY_HAS_SHUTOFF_VALVE_STATUS = EchonetOntology.NAMESPACE + "hasShutoffValveStatus";
	public static final String PROPERTY_HAS_HISTORICAL_DATA_OF_SHUTOFF_REASONS = EchonetOntology.NAMESPACE + "hasHistoricalDataOfShutoffReasons";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeGasConsumptionInformationStringTimeIncluded";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeGasConsumptionHistoricalInformationStringTimeIncluded";
	
	
	public Float getMeasuredCumulativeGasConsumptionHistoricalInformationStringTimeIncluded() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED);	
	}
	public void setMeasuredCumulativeGasConsumptionHistoricalInformationStringTimeIncluded(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED, msg);	
	}
	public Float getMeasuredCumulativeGasConsumptionInformationStringTimeIncluded() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED);	
	}
	public void setMeasuredCumulativeGasConsumptionInformationStringTimeIncluded(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED, msg);	
	}
	public String getHistoricalDataOfShutoffReasons() {
		return  getProperty(PROPERTY_HAS_HISTORICAL_DATA_OF_SHUTOFF_REASONS).toString();	
	}
	public void setHistoricalDataOfShutoffReasons(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HISTORICAL_DATA_OF_SHUTOFF_REASONS, msg);	
	}
	
	public OperationStatusValue getShutoffValveStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_EMERGENCY_CLOSURE_OF_SHUTOFF_VALVE);	
	}
	public void setShutoffValveStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EMERGENCY_CLOSURE_OF_SHUTOFF_VALVE, msg);	
	}
	public OccurenceStatusValue getEmergencyClosureOfShutoffValve() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_EMERGENCY_CLOSURE_OF_SHUTOFF_VALVE);	
	}
	public void setEmergencyClosureOfShutoffValve(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EMERGENCY_CLOSURE_OF_SHUTOFF_VALVE, msg);	
	}
	
	public OperationStatusValue getPermissionFromTheCenterToReopenTheValveClosedByTheCenter() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_PERMISSION_FROM_THE_CENTER_TO_REOPEN_VALUE_CLOSED_BY_THE_CENTER);	
	}
	public void setPermissionFromTheCenterToReopenTheValveClosedByTheCenter(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_PERMISSION_FROM_THE_CENTER_TO_REOPEN_VALUE_CLOSED_BY_THE_CENTER, msg);	
	}
	public OperationStatusValue getValveClosureByTheCenter() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_VALVE_CLOSURE_BY_THE_CENTER);	
	}
	public void setValveClosureByTheCenter(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VALVE_CLOSURE_BY_THE_CENTER, msg);	
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
	public String getDayToRetrieveMeasuredCumulativeGasConsumptionHistoricalData() {
		return  getProperty(PROPERTY_HAS_DAY_TO_RETRIEVE_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA).toString();	
	}
	public void setDayToRetrieveMeasuredCumulativeGasConsumptionHistoricalData(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIEVE_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA, msg);	
	}
	public Float getMeasuredCumulativeGasConsumptionHistoricalData() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA);	
	}
	public void setMeasuredCumulativeGasConsumptionHistoricalData(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA, msg);	
	}
	public String getMeasuredCumulativeGasConsumptionUnit() {
		return  getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_UNIT).toString();	
	}
	public void setMeasuredCumulativeGasConsumptionUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_UNIT, msg);	
	}
	public Float getMeasuredCumulativeGasConsumption() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION);	
	}
	public void setMeasuredCumulativeGasConsumption(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION, msg);	
	}
	
	
	public TypeClassificationValue getOwnerClassification() {
		return (TypeClassificationValue) getProperty(PROPERTY_HAS_OWNER_CLASSIFICATION);	
	}
	public void setOwnerClassification(TypeClassificationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OWNER_CLASSIFICATION, msg);	
	}
	public TypeClassificationValue getGasMetterClassificationSetting() {
		return (TypeClassificationValue) getProperty(PROPERTY_HAS_GAS_METTER_CLASSIFICATION_SETTING);	
	}
	public void setGasMetterClassificationSetting(TypeClassificationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_GAS_METTER_CLASSIFICATION_SETTING, msg);	
	}


	
	public SmartGasMeter() {
		super();
	}
	public SmartGasMeter(String uri) {
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
