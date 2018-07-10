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
package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class ClothesDryer extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ClothesDryer";
	public static final String PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "hasDoorCoverOpenCloseStatus";
	public static final String PROPERTY_HAS_DRYING_SETTING= EchonetOntology.NAMESPACE + "hasDryingSetting";
	public static final String PROPERTY_HAS_DRYING_STATUS= EchonetOntology.NAMESPACE + "hasDryingStatus";
	public static final String PROPERTY_HAS_DRYING_REMAINING_TIME= EchonetOntology.NAMESPACE + "hasDryingRemainingTime";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "hasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING= EchonetOntology.NAMESPACE + "hasOnTimerSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "hasOnTimerSetting_RelativeTime";

	
	public DateTimeValue getOnTimerSetting_RelativeTime() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setOnTimerSetting_RelativeTime(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public DateTimeValue getOnTimerSetting() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_ON_TIMER_SETTING);	
	}
	public void setOnTimerSetting(DateTimeValue msg) {
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
	public DateTimeValue getDryingRemainingTime() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_DRYING_REMAINING_TIME);	
	}
	public void setDryingRemainingTime(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DRYING_REMAINING_TIME, msg);	
	}
	public OperationModeSettingValue getDryingStatus() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_DRYING_STATUS);	
	}
	public void setDryingStatus(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DRYING_STATUS, msg);	
	}
	public OperationStateSettingValue getDryingSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DRYING_SETTING);	
	}
	public void setDryingSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DRYING_SETTING, msg);	
	}
	public OperationStateSettingValue getDoorCoverOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS);	
	}
	public void setDoorCoverOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS, msg);	
	}
	

	
	public ClothesDryer() {
		super();
	}
	public ClothesDryer(String uri) {
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
