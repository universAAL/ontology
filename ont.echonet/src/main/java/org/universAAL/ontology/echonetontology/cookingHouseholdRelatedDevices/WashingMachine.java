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
package org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices;



import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStateSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;

public class WashingMachine extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WashingMachine";
	public static final String PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "hasDoorCoverOpenCloseStatus";
	public static final String PROPERTY_HAS_WASHING_MACHINE_SETTING= EchonetOntology.NAMESPACE + "hasWashingMachineSetting";
	public static final String PROPERTY_HAS_CURRENT_STAGE_OF_WASHING_CYCLE= EchonetOntology.NAMESPACE + "hasCurrentStageOfWashingCycle";
	public static final String PROPERTY_HAS_REMAINING_TIME_TO_COMPLETE_WASHING_CYCLE= EchonetOntology.NAMESPACE + "hasRemainingTimeToCompleteWashingCycle";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "hasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING= EchonetOntology.NAMESPACE + "hasOnTimerSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "hasOnTimerSetting_RelativeTime";

	
	public String getOnTimerSetting_RelativeTime() {
		return  getProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).toString();	
	}
	public void setOnTimerSetting_RelativeTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public String getOnTimerSetting() {
		return  getProperty(PROPERTY_HAS_ON_TIMER_SETTING).toString();	
	}
	public void setOnTimerSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING, msg);	
	}
	public OperationStatusValue getOnTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING);	
	}
	public void setOnTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING, msg);	
	}	
	public String getRemainingTimeToCompleteWashingCycle() {
		return  getProperty(PROPERTY_HAS_REMAINING_TIME_TO_COMPLETE_WASHING_CYCLE).toString();	
	}
	public void setRemainingTimeToCompleteWashingCycle(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_TIME_TO_COMPLETE_WASHING_CYCLE, msg);	
	}
	public OperationModeSettingValue getCurrentStageOfWashingCycle() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_CURRENT_STAGE_OF_WASHING_CYCLE);	
	}
	public void setCurrentStageOfWashingCycle(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CURRENT_STAGE_OF_WASHING_CYCLE, msg);	
	}
	public OperationStateSettingValue getWashingMachineSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_WASHING_MACHINE_SETTING);	
	}
	public void setWashingMachineSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WASHING_MACHINE_SETTING, msg);	
	}
	public OperationStateSettingValue getDoorCoverOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS);	
	}
	public void setDoorCoverOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS, msg);	
	}
	

	
	public WashingMachine() {
		super();
	}
	public WashingMachine(String uri) {
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
