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
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class LPGasMeter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "LPGasMetter";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_METERING_DATA_1 = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeGasConsumptionMeteringData1";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_METERING_DATA_2 = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeGasConsumptionMeteringData2";
	public static final String PROPERTY_HAS_ERROR_DETECTION_OF_METERING_DATA = EchonetOntology.NAMESPACE + "hasErrorDetectionOfMeteringData";
	public static final String PROPERTY_HAS_SECURITY_DATA_1 = EchonetOntology.NAMESPACE + "hasSecurityData1";
	public static final String PROPERTY_HAS_SECURITY_DATA_2 = EchonetOntology.NAMESPACE + "hasSecurityData2";
	public static final String PROPERTY_HAS_CENTER_VALUE_SHUTOFF_STATUS= EchonetOntology.NAMESPACE + "hasCenterValueShutOffStatus";
	public static final String PROPERTY_HAS_CENTER_VALUE_SHUTOFF_RECOVERY_PERMISSION_SETTING_STATUS= EchonetOntology.NAMESPACE + "hasCenterValueShutOffRecoveryPermissionSettingStatus";
	public static final String PROPERTY_HAS_EMERGENCY_VALUE_SHUTOFF_STATUS= EchonetOntology.NAMESPACE + "hasEmergencyValueShutOffStatus";
	public static final String PROPERTY_HAS_SHUTOFF_VALUE_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "hasShutOffValueOpenCloseStatus";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING= EchonetOntology.NAMESPACE + "hasResidualVolumeControlWarning";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1_VALUE= EchonetOntology.NAMESPACE + "hasResidualVolumeControlWarningLevel1Value";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2_VALUE= EchonetOntology.NAMESPACE + "hasResidualVolumeControlWarningLevel2Value";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3_VALUE= EchonetOntology.NAMESPACE + "hasResidualVolumeControlWarningLevel3Value";
	public static final String PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE_GAS_FLOW_CONTINUATION= EchonetOntology.NAMESPACE + "hasSlightLeakTimerValueGasFlowContinuation";
	public static final String PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE_WITHOUT_PRESSURE_INCREASE= EchonetOntology.NAMESPACE + "hasSlightLeakTimerValueWithoutPressureInscrease";
	public static final String PROPERTY_HAS_SHUTOFF_REASON_LOG= EchonetOntology.NAMESPACE + "hasShutOffReasonLog";
	public static final String PROPERTY_HAS_MAXIMUM_VALUE_OF_SUPPLY_PRESSURE_DATA= EchonetOntology.NAMESPACE + "hasMaximumValueOfSupplyPressureData";
	public static final String PROPERTY_HAS_MINIMUM_VALUE_OF_SUPPLY_PRESSURE_DATA= EchonetOntology.NAMESPACE + "hasMinimumValueOfSupplyPressureData";
	public static final String PROPERTY_HAS_CURRENT_VALUE_OF_SUPPLY_PRESSURE_DATA= EchonetOntology.NAMESPACE + "hasCurrentValueOfSupplyPressureData";
	public static final String PROPERTY_HAS_MAXIMUM_VALUE_OF_BLOCK_PRESSURE_DATA= EchonetOntology.NAMESPACE + "hasMaximumValueOfBlockPressureData";
	public static final String PROPERTY_HAS_MINIMUM_VALUE_OF_BLOCK_PRESSURE_DATA= EchonetOntology.NAMESPACE + "hasMinimumValueOfBlockPressureData";
	public static final String PROPERTY_HAS_CURRENT_VALUE_OF_BLOCK_PRESSURE_DATA= EchonetOntology.NAMESPACE + "hasCurrentValueOfBlockPressureData";
	public static final String PROPERTY_HAS_NUMBER_OF_BLOCK_SUPPLY_PRESSURE_ERROR_DAYS_TIMES= EchonetOntology.NAMESPACE + "hasNumberOfBlockSupplyPressureErrorDays_Time";
	public static final String PROPERTY_HAS_TEST_CALL_SETTING= EchonetOntology.NAMESPACE + "hasTestCallSetting";
	
	public OperationStatusValue getTestCallSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_TEST_CALL_SETTING);	
	}	
	public void setTestCallSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TEST_CALL_SETTING, msg);	
	}
	public String getNumberOfBlockSupplyPressureErrorDays_Time() {
		return (String) getProperty(PROPERTY_HAS_NUMBER_OF_BLOCK_SUPPLY_PRESSURE_ERROR_DAYS_TIMES);	
	}	
	public void setNumberOfBlockSupplyPressureErrorDays_Time(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_BLOCK_SUPPLY_PRESSURE_ERROR_DAYS_TIMES, msg);	
	}
	public MeasuredValue getCurrentValueOfBlockPressureData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CURRENT_VALUE_OF_BLOCK_PRESSURE_DATA);	
	}	
	public void setCurrentValueOfBlockPressureData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CURRENT_VALUE_OF_BLOCK_PRESSURE_DATA, msg);	
	}
	public MeasuredValue getMinimumValueOfBlockPressureData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MINIMUM_VALUE_OF_BLOCK_PRESSURE_DATA);	
	}	
	public void setMinimumValueOfBlockPressureData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_VALUE_OF_BLOCK_PRESSURE_DATA, msg);	
	}
	
	public MeasuredValue getMaximumValueOfBlockPressureData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MINIMUM_VALUE_OF_BLOCK_PRESSURE_DATA);	
	}	
	public void setMaximumValueOfBlockPressureData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_VALUE_OF_BLOCK_PRESSURE_DATA, msg);	
	}
	public MeasuredValue getCurrentValueOfSupplyPressureData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CURRENT_VALUE_OF_SUPPLY_PRESSURE_DATA);	
	}	
	public void setCurrentValueOfSupplyPressureData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CURRENT_VALUE_OF_SUPPLY_PRESSURE_DATA, msg);	
	}
	public MeasuredValue getMinimumValueOfSupplyPressureData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MINIMUM_VALUE_OF_SUPPLY_PRESSURE_DATA);	
	}	
	public void setMinimumValueOfSupplyPressureData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_VALUE_OF_SUPPLY_PRESSURE_DATA, msg);	
	}
	
	public MeasuredValue getMaximumValueOfSupplyPressureData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MAXIMUM_VALUE_OF_SUPPLY_PRESSURE_DATA);	
	}	
	public void setMaximumValueOfSupplyPressureData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MAXIMUM_VALUE_OF_SUPPLY_PRESSURE_DATA, msg);	
	}
	
	public String getShutOffReasonLog() {
		return (String) getProperty(PROPERTY_HAS_SHUTOFF_REASON_LOG);	
	}	
	public void setShutOffReasonLog(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SHUTOFF_REASON_LOG, msg);	
	}
	public MeasuredValue getSlightLeakTimerValueWithoutPressureInscrease() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE_WITHOUT_PRESSURE_INCREASE);	
	}
	public void setSlightLeakTimerValueWithoutPressureInscrease(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE_WITHOUT_PRESSURE_INCREASE, msg);	
	}
	public MeasuredValue getSlightLeakTimerValueGasFlowContinuation() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE_GAS_FLOW_CONTINUATION);	
	}
	public void setSlightLeakTimerValueGasFlowContinuation(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE_GAS_FLOW_CONTINUATION, msg);	
	}
	public MeasuredValue getResidualVolumeControlWarningLevel3Value() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3_VALUE);	
	}
	public void setResidualVolumeControlWarningLevel3Value(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3_VALUE, msg);	
	}
	public MeasuredValue getResidualVolumeControlWarningLevel2Value() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2_VALUE);	
	}
	public void setResidualVolumeControlWarningLevel2Value(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2_VALUE, msg);	
	}
	public MeasuredValue getResidualVolumeControlWarningLevel1Value() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1_VALUE);	
	}
	public void setResidualVolumeControlWarningLevel1Value(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1_VALUE, msg);	
	}
	public ThresholdLevelValue getResidualVolumeControlWarning() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING);	
	}
	public void setResidualVolumeControlWarning(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING, msg);	
	}
	public OperationStateSettingValue getShutOffValueOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_SHUTOFF_VALUE_OPEN_CLOSE_STATUS);	
	}
	public void setShutOffValueOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SHUTOFF_VALUE_OPEN_CLOSE_STATUS, msg);	
	}
	public OccurenceStatusValue getEmergencyValueShutOffStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_EMERGENCY_VALUE_SHUTOFF_STATUS);	
	}
	public void setEmergencyValueShutOffStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EMERGENCY_VALUE_SHUTOFF_STATUS, msg);	
	}
	public OperationStatusValue getCenterValueShutOffRecoveryPermissionSettingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_CENTER_VALUE_SHUTOFF_RECOVERY_PERMISSION_SETTING_STATUS);	
	}
	public void setCenterValueShutOffRecoveryPermissionSettingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CENTER_VALUE_SHUTOFF_RECOVERY_PERMISSION_SETTING_STATUS, msg);	
	}
	public OccurenceStatusValue getCenterValueShutOffStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_CENTER_VALUE_SHUTOFF_STATUS);	
	}
	public void setCenterValueShutOffStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CENTER_VALUE_SHUTOFF_STATUS, msg);	
	}
	public String getSecurityData2() {
		return (String) getProperty(PROPERTY_HAS_SECURITY_DATA_2);	
	}
	public void setSecurityData2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SECURITY_DATA_2, msg);	
	}
	public String getSecurityData1() {
		return (String) getProperty(PROPERTY_HAS_SECURITY_DATA_1);	
	}
	public void setSecurityData1(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SECURITY_DATA_1, msg);	
	}
	public OccurenceStatusValue getErrorDetectionOfMeteringData() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_ERROR_DETECTION_OF_METERING_DATA);	
	}
	public void setErrorDetectionOfMeteringData(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ERROR_DETECTION_OF_METERING_DATA, msg);	
	}
	public MeasuredValue getMeasuredCummulativeGasConsumptionMeteringData2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_METERING_DATA_2);	
	}
	public void setMeasuredCummulativeGasConsumptionMeteringData2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_METERING_DATA_2, msg);	
	}
	public MeasuredValue getMeasuredCummulativeGasConsumptionMeteringData1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_METERING_DATA_1);	
	}
	public void setMeasuredCummulativeGasConsumptionMeteringData1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_METERING_DATA_1, msg);	
	}



	
	public LPGasMeter() {
		super();
	}
	public LPGasMeter(String uri) {
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
