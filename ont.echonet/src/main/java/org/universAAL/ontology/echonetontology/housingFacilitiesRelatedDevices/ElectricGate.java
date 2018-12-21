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
import org.universAAL.ontology.echonetontology.values.ElectricDeviceFaultDesciptionValue;
import org.universAAL.ontology.echonetontology.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStateSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.SelectiveOpeningOperationSettingValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;

public class ElectricGate extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricGate";
	public static final String PROPERTY_HAS_RECOVERABLE_FAULT_DESCRIPTION = EchonetOntology.NAMESPACE + "hasRecoverableFaultDescription";
	public static final String PROPERTY_HAS_TIMER_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasTimerOperationSetting";
	public static final String PROPERTY_HAS_OPENING_SPEED_SETTING = EchonetOntology.NAMESPACE + "hasOpeningSpeedSetting";
	public static final String PROPERTY_HAS_CLOSING_SPEED_SETTING = EchonetOntology.NAMESPACE + "hasClosingSpeedSetting";
	public static final String PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE = EchonetOntology.NAMESPACE + "hasOperationTimeSettingValue";
	public static final String PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasOpeningClosingOperationSetting";
	public static final String PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL = EchonetOntology.NAMESPACE + "hasDegreeOfOpeningLevel";
	public static final String PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING = EchonetOntology.NAMESPACE + "hasOpeningClosingSpeedSetting";
	public static final String PROPERTY_HAS_ELECTRIC_LOCK_SETTING = EchonetOntology.NAMESPACE + "hasElectricLockSetting";
	public static final String PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS = EchonetOntology.NAMESPACE + "hasRemoteOperationSettingStatus";
	public static final String PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasSelectiveOpeningOperationSetting";
	public static final String PROPERTY_HAS_OPEN_CLOSE_STATUS = EchonetOntology.NAMESPACE + "hasOpenCloseStatus";
	public static final String PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING = EchonetOntology.NAMESPACE + "hasOneTimeOpeningSpeedSetting";
	public static final String PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING = EchonetOntology.NAMESPACE + "hasOneTimeClosingSpeedSetting";
	
	public ThresholdLevelValue getOneTimeClosingSpeedSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING);	
	}
	public void setOneTimeClosingSpeedSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING, msg);	
	}
	public ThresholdLevelValue getOneTimeOpeningSpeedSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING);	
	}
	public void setOneTimeOpeningSpeedSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING, msg);	
	}
	public OperationStateSettingValue getOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_OPEN_CLOSE_STATUS);	
	}
	public void setOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPEN_CLOSE_STATUS, msg);	
	}
	public SelectiveOpeningOperationSettingValue getSelectiveOpeningOperationSetting() {
		return (SelectiveOpeningOperationSettingValue) getProperty(PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING);	
	}
	public void setSelectiveOpeningOperationSetting(SelectiveOpeningOperationSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING, msg);	
	}
	public OperationStatusValue getRemoteOperationSettingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS);	
	}
	public void setRemoteOperationSettingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS, msg);	
	}
	public OperationStatusValue getElectricLockSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ELECTRIC_LOCK_SETTING);	
	}
	public void setElectricLockSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ELECTRIC_LOCK_SETTING, msg);	
	}
	public ThresholdLevelValue getOpeningClosingSpeedSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING);	
	}
	public void setOpeningClosingSpeedSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING, msg);	
	}
	public Float getDegreeOfOpeningLevel() {
		return (Float) getProperty(PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL);	
	}
	public void setDegreeOfOpeningLevel(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL, msg);	
	}
	public OperationFunctionSettingValue getOpeningClosingOperationSetting() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING);	
	}
	public void setOpeningClosingOperationSetting(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING, msg);	
	}
	public Float getOperationTimeSettingValue() {
		return (Float) getProperty(PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE);	
	}
	public void setOperationTimeSettingValue(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE, msg);	
	}
	public ThresholdLevelValue getClosingSpeedSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_CLOSING_SPEED_SETTING);	
	}
	public void setClosingSpeedSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CLOSING_SPEED_SETTING, msg);	
	}
	public ThresholdLevelValue getOpeningSpeedSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_OPENING_SPEED_SETTING);	
	}
	public void setOpeningSpeedSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPENING_SPEED_SETTING, msg);	
	}
	public OperationStatusValue getTimerOperationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_TIMER_OPERATION_SETTING);	
	}
	public void setTimerOperationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TIMER_OPERATION_SETTING, msg);	
	}
	public ElectricDeviceFaultDesciptionValue getRecoverableFaultDescription() {
		return (ElectricDeviceFaultDesciptionValue) getProperty(PROPERTY_HAS_RECOVERABLE_FAULT_DESCRIPTION);	
	}
	public void setRecoverableFaultDescription(ElectricDeviceFaultDesciptionValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RECOVERABLE_FAULT_DESCRIPTION, msg);	
	}
	

	public ElectricGate() {
		super();
	}
	public ElectricGate(String uri) {
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
