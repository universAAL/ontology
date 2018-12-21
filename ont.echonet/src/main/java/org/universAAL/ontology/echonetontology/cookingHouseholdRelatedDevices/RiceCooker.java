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

public class RiceCooker extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "RiceCooker";
	public static final String PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "hasCoverOpenCloseStatus";
	public static final String PROPERTY_HAS_RICE_COOKING_STATUS= EchonetOntology.NAMESPACE + "hasRiceCookingStatus";
	public static final String PROPERTY_HAS_RICE_COOKING_CONTROL_SETTING= EchonetOntology.NAMESPACE + "hasRiceCookingControlSetting";
	public static final String PROPERTY_HAS_WARMER_SETTING= EchonetOntology.NAMESPACE + "hasWarmerSetting";
	public static final String PROPERTY_HAS_INNER_POT_REMOVAL_STATUS= EchonetOntology.NAMESPACE + "hasInnerPotRemovalStatus";	
	public static final String PROPERTY_HAS_COVER_REMOVAL_STATUS= EchonetOntology.NAMESPACE + "hasCoverRemovalStatus";	
	public static final String PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "hasRiceCookingReservationSetting";	
	public static final String PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_TIME= EchonetOntology.NAMESPACE + "hasRiceCookingReservationSettingTime";	
	public static final String PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "hasRiceCookingReservationSettingRelativeTime";	
	
	public String getRiceCookingReservationSettingRelativeTime() {
		return  getProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_RELATIVE_TIME).toString();	
	}
	public void setRiceCookingReservationSettingRelativeTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_RELATIVE_TIME, msg);	
	}
	public String getRiceCookingReservationSettingTime() {
		return  getProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_TIME).toString();	
	}
	public void setRiceCookingReservationSettingTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_TIME, msg);	
	}
	public OperationStatusValue getRiceCookingReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING);	
	}
	public void setRiceCookingReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING, msg);	
	}
	public OperationStatusValue getCoverRemovalStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_COVER_REMOVAL_STATUS);	
	}
	public void setCoverRemovalStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COVER_REMOVAL_STATUS, msg);	
	}
	public OperationStatusValue getInnerPotRemovalStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_INNER_POT_REMOVAL_STATUS);	
	}
	public void setInnerPotRemovalStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INNER_POT_REMOVAL_STATUS, msg);	
	}
	public OperationStatusValue getWarmerSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_WARMER_SETTING);	
	}
	public void setWarmerSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WARMER_SETTING, msg);	
	}
	public OperationStateSettingValue getRiceCookingControlSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_RICE_COOKING_CONTROL_SETTING);	
	}
	public void setRiceCookingControlSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RICE_COOKING_CONTROL_SETTING, msg);	
	}
	
	public OperationStatusValue getRiceCookingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_RICE_COOKING_STATUS);	
	}
	public void setRiceCookingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RICE_COOKING_STATUS, msg);	
	}
	public OperationStateSettingValue getCoverOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS);	
	}
	public void setCoverOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS, msg);	
	}
	
	public RiceCooker() {
		super();
	}
	public RiceCooker(String uri) {
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
