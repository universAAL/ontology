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
import org.universAAL.ontology.echonetontology.values.OperationStateSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;

public class WasherDryer extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WasherDryer";
	public static final String PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "hasDoorCoverOpenCloseStatus";
	public static final String PROPERTY_HAS_WASHER_DRYER_SETTING= EchonetOntology.NAMESPACE + "hasWasherDryerSetting";
	public static final String PROPERTY_HAS_WASHER_DRYER_CYCLE_SETTING_1= EchonetOntology.NAMESPACE + "hasWasherDryerCycleSetting1";
	public static final String PROPERTY_HAS_WASHER_DRYER_CYCLE_SETTING_2= EchonetOntology.NAMESPACE + "hasWasherDryerCycleSetting2";
	public static final String PROPERTY_HAS_DRYING_CYCLE_SETTING= EchonetOntology.NAMESPACE + "hasWasherDryingCycleSetting";
	public static final String PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_1= EchonetOntology.NAMESPACE + "hasWasherDryerCycleOptionList1";
	public static final String PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_2= EchonetOntology.NAMESPACE + "hasWasherDryerCycleOptionList2";
	public static final String PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_3= EchonetOntology.NAMESPACE + "hasWasherDryerCycleOptionList3";
	public static final String PROPERTY_HAS_WATER_FLOW_SETTING= EchonetOntology.NAMESPACE + "hasWaterFlowSetting";
	public static final String PROPERTY_HAS_ROTATION_SPEED_FOR_SPIN_DRYING= EchonetOntology.NAMESPACE + "hasRotationSpeedForSpinDrying";
	public static final String PROPERTY_HAS_DEGREE_OF_DRYING_SETTING= EchonetOntology.NAMESPACE + "hasDegreeOfDryingSetting";
	public static final String PROPERTY_HAS_REMAINING_DRYING_TIME= EchonetOntology.NAMESPACE + "hasRemainingDryingTime";
	public static final String PROPERTY_HAS_REMAINING_WASHING_TIME= EchonetOntology.NAMESPACE + "hasRemainingWashingTime";
	public static final String PROPERTY_HAS_ELAPSED_TIME_ON_THE_ON_TIMER= EchonetOntology.NAMESPACE + "hasElapsedTimeOnTheONTimer";
	public static final String PROPERTY_HAS_PRESOAKING_TIME= EchonetOntology.NAMESPACE + "hasPreSoakingTime";
	public static final String PROPERTY_HAS_CURRENT_STAGE_OF_WASHER_DRYER_CYCLE= EchonetOntology.NAMESPACE + "hasCurrentStageOfWasherDryerCycle";
	public static final String PROPERTY_HAS_WATER_VOLUME_SETTING_1= EchonetOntology.NAMESPACE + "hasWaterVolumeSetting1";
	public static final String PROPERTY_HAS_WATER_VOLUME_SETTING_2= EchonetOntology.NAMESPACE + "hasWaterVolumeSetting2";
	public static final String PROPERTY_HAS_WATSHING_TIME_SETTING= EchonetOntology.NAMESPACE + "hasWashingTimeSetting";
	public static final String PROPERTY_HAS_NUMBER_OF_RINSING_TIMES= EchonetOntology.NAMESPACE + "hasNumberofRinsingTimes";
	public static final String PROPERTY_HAS_RINSING_PROCESS_SETTING= EchonetOntology.NAMESPACE + "hasRinsingProcessSetting";
	public static final String PROPERTY_HAS_SPIN_DRYING_TIME_SETTING= EchonetOntology.NAMESPACE + "hasSpinDryingTimeSetting";
	public static final String PROPERTY_HAS_DRYING_TIME_SETTING= EchonetOntology.NAMESPACE + "hasDryingTimeSetting";
	public static final String PROPERTY_HAS_WARM_WATER_SETTING= EchonetOntology.NAMESPACE + "hasWarmWaterSetting";
	public static final String PROPERTY_HAS_BATHTUB_WATER_RECYCLE_SETTING= EchonetOntology.NAMESPACE + "hasBathtubWaterRecycleSetting";
	public static final String PROPERTY_HAS_WRINKLING_MINIMIZATION_SETTING= EchonetOntology.NAMESPACE + "hasWrinklingMinimizationSetting";
	public static final String PROPERTY_HAS_TIME_TO_COMPLETE_WASHER_AND_DRYER_CYCLE= EchonetOntology.NAMESPACE + "hasTimeToCompleteWasherAndDryerCycle";
	public static final String PROPERTY_HAS_DOOR_COVER_LOCK_SETTING= EchonetOntology.NAMESPACE + "hasDoorCoverLockSetting";
	public static final String PROPERTY_HAS_WASHER_DRYER_CYCLE= EchonetOntology.NAMESPACE + "hasWasherAndDryerCycle";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "hasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING= EchonetOntology.NAMESPACE + "hasOnTimerSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "hasOnTimerSetting_RelativeTime";

	public OperationStateSettingValue getDoorCoverLockSetting() {
		return  (OperationStateSettingValue)getProperty(PROPERTY_HAS_DOOR_COVER_LOCK_SETTING);	
	}
	public void setDoorCoverLockSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_COVER_LOCK_SETTING, msg);	
	}
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
	public String getWasherAndDryerCycle() {
		return getProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE).toString();	
	}
	public void setWasherAndDryerCycle(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE, msg);	
	}
	public String getTimeToCompleteWasherAndDryerCycle() {
		return getProperty(PROPERTY_HAS_TIME_TO_COMPLETE_WASHER_AND_DRYER_CYCLE).toString();	
	}
	public void setTimeToCompleteWasherAndDryerCycle(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TIME_TO_COMPLETE_WASHER_AND_DRYER_CYCLE, msg);	
	}
	public OperationStatusValue getWrinklingMinimizationSetting() {
		return (OperationStatusValue)getProperty(PROPERTY_HAS_WRINKLING_MINIMIZATION_SETTING);	
	}
	public void setWrinklingMinimizationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WRINKLING_MINIMIZATION_SETTING, msg);	
	}
	public String getBathtubWaterRecycleSetting() {
		return getProperty(PROPERTY_HAS_BATHTUB_WATER_RECYCLE_SETTING).toString();	
	}
	public void setBathtubWaterRecycleSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHTUB_WATER_RECYCLE_SETTING, msg);	
	}
	public Integer getWarmWaterSetting() {
		return (Integer)getProperty(PROPERTY_HAS_WARM_WATER_SETTING);	
	}
	public void setWarmWaterSetting(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WARM_WATER_SETTING, msg);	
	}
	public String getDryingTimeSetting() {
		return getProperty(PROPERTY_HAS_DRYING_TIME_SETTING).toString();	
	}
	public void setDryingTimeSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DRYING_TIME_SETTING, msg);	
	}
	public String getSpinDryingTimeSetting() {
		return getProperty(PROPERTY_HAS_SPIN_DRYING_TIME_SETTING).toString();	
	}
	public void setSpinDryingTimeSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPIN_DRYING_TIME_SETTING, msg);	
	}
	public String getRinsingProcessSetting() {
		return getProperty(PROPERTY_HAS_RINSING_PROCESS_SETTING).toString();	
	}
	public void setRinsingProcessSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RINSING_PROCESS_SETTING, msg);	
	}
	public Integer getNumberofRinsingTimes() {
		return (Integer)getProperty(PROPERTY_HAS_NUMBER_OF_RINSING_TIMES);	
	}
	public void setNumberofRinsingTimes(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_RINSING_TIMES, msg);	
	}

	public String getWashingTimeSetting() {
		return getProperty(PROPERTY_HAS_WATSHING_TIME_SETTING).toString();	
	}
	public void setWashingTimeSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATSHING_TIME_SETTING, msg);	
	}

	public String getWaterVolumeSetting2() {
		return getProperty(PROPERTY_HAS_WATER_VOLUME_SETTING_2).toString();	
	}
	public void setWaterVolumeSetting2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_VOLUME_SETTING_2, msg);	
	}

	public String getWaterVolumeSetting1() {
		return getProperty(PROPERTY_HAS_WATER_VOLUME_SETTING_1).toString();	
	}
	public void setWaterVolumeSetting1(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_VOLUME_SETTING_1, msg);	
	}
	public String getCurrentStageOfWasherDryerCycle() {
		return getProperty(PROPERTY_HAS_CURRENT_STAGE_OF_WASHER_DRYER_CYCLE).toString();	
	}
	public void setCurrentStageOfWasherDryerCycle(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CURRENT_STAGE_OF_WASHER_DRYER_CYCLE, msg);	
	}
	public String getPreSoakingTime() {
		return getProperty(PROPERTY_HAS_PRESOAKING_TIME).toString();	
	}
	public void setPreSoakingTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_PRESOAKING_TIME, msg);	
	}
	public String getElapsedTimeOnTheONTimer() {
		return getProperty(PROPERTY_HAS_ELAPSED_TIME_ON_THE_ON_TIMER).toString();	
	}
	public void setElapsedTimeOnTheONTimer(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ELAPSED_TIME_ON_THE_ON_TIMER, msg);	
	}
	public String getRemainingWashingTime() {
		return getProperty(PROPERTY_HAS_REMAINING_WASHING_TIME).toString();	
	}
	public void setRemainingWashingTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_WASHING_TIME, msg);	
	}
	public String getRemainingDryingTime() {
		return getProperty(PROPERTY_HAS_REMAINING_DRYING_TIME).toString();	
	}
	public void setRemainingDryingTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_DRYING_TIME, msg);	
	}
	public String getDegreeOfDryingSetting() {
		return getProperty(PROPERTY_HAS_DEGREE_OF_DRYING_SETTING).toString();	
	}
	public void setDegreeOfDryingSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEGREE_OF_DRYING_SETTING, msg);	
	}
	public String getRotationSpeedForSpinDrying() {
		return getProperty(PROPERTY_HAS_ROTATION_SPEED_FOR_SPIN_DRYING).toString();	
	}
	public void setRotationSpeedForSpinDrying(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ROTATION_SPEED_FOR_SPIN_DRYING, msg);	
	}
	public String getWaterFlowSetting() {
		return getProperty(PROPERTY_HAS_WATER_FLOW_SETTING).toString();	
	}
	public void setWaterFlowSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_FLOW_SETTING, msg);	
	}
	public String getWasherDryerCycleOptionList3() {
		return getProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_3).toString();	
	}
	public void setWasherDryerCycleOptionList3(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_3, msg);	
	}
	public String getWasherDryerCycleOptionList2() {
		return getProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_2).toString();	
	}
	public void setWasherDryerCycleOptionList2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_2, msg);	
	}
	public String getWasherDryerCycleOptionList1() {
		return getProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_1).toString();	
	}
	public void setWasherDryerCycleOptionList1(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_1, msg);	
	}
	public String getWasherDryingCycleSetting() {
		return getProperty(PROPERTY_HAS_DRYING_CYCLE_SETTING).toString();	
	}
	public void setWasherDryingCycleSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DRYING_CYCLE_SETTING, msg);	
	}
	public String getWasherDryerCycleSetting2() {
		return getProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE_SETTING_2).toString();	
	}
	public void setWasherDryerCycleSetting2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE_SETTING_2, msg);	
	}
	public String getWasherDryerCycleSetting1() {
		return getProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE_SETTING_1).toString();	
	}
	public void setWasherDryerCycleSetting1(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WASHER_DRYER_CYCLE_SETTING_1, msg);	
	}
	public OperationStateSettingValue getWasherDryerSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_WASHER_DRYER_SETTING);	
	}
	public void setWasherDryerSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WASHER_DRYER_SETTING, msg);	
	}
	public OperationStateSettingValue getDoorCoverOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS);	
	}
	public void setDoorCoverOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS, msg);	
	}

	public WasherDryer() {
		super();
	}
	public WasherDryer(String uri) {
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
