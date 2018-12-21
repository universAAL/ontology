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
package org.universAAL.ontology.echonetontology.managementOperationRelatedDevices;




import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;

public class DREventController extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Controller";
	public static final String PROPERTY_HAS_BUSINESS_ID= EchonetOntology.NAMESPACE + "hasBusinessID";
	public static final String PROPERTY_HAS_DR_PROGRAM_TYPE= EchonetOntology.NAMESPACE + "hasDRProgramType";
	public static final String PROPERTY_HAS_DR_PROGRAM_ID= EchonetOntology.NAMESPACE + "hasDRProgramID";
	public static final String PROPERTY_HAS_CURRENT_VALID_EVENT_INFO= EchonetOntology.NAMESPACE + "hasCurrentValidEventInfo";
	public static final String PROPERTY_HAS_NEXT_VALID_EVENT_INFO= EchonetOntology.NAMESPACE + "hasNextValidEventInfo";
	public static final String PROPERTY_HAS_FUTURE_EVENT_INFO_NOTIFICATION_ID_LIST= EchonetOntology.NAMESPACE + "hasFutureEventInfoNotificationIDList";
	public static final String PROPERTY_HAS_PAST_EVENT_INFO_NOTIFICATION_ID_LIST= EchonetOntology.NAMESPACE + "hasPastEventInfoNotificationIDList";
	public static final String PROPERTY_HAS_NEWEST_RECEIVED_EVENT_NOTIFICATION_ID= EchonetOntology.NAMESPACE + "hasNewestReceivedEventNotificationID";
	public static final String PROPERTY_HAS_OLDEST_RECEIVED_EVENT_NOTIFICATION_ID= EchonetOntology.NAMESPACE + "hasOldestReceivedEventNotificationID";
	public static final String PROPERTY_HAS_NOTIFICATION_ID_DESIGNATION= EchonetOntology.NAMESPACE + "hasNotificationIDDesignation";
	public static final String PROPERTY_HAS_EVENT_INFO_ID_DESIGNATION= EchonetOntology.NAMESPACE + "hasEventInfoIDDesignation";
	public static final String PROPERTY_HAS_TARGET_DEVICE_INFO_LIST= EchonetOntology.NAMESPACE + "hasTargetDeviceInfoList";
	public static final String PROPERTY_HAS_EVENT_INFO= EchonetOntology.NAMESPACE + "hasEventInfo";
	public static final String PROPERTY_HAS_CONFIRM_OPT_INFO= EchonetOntology.NAMESPACE + "hasConfirmOptInfo";
	public static final String PROPERTY_HAS_CONFIRM_OPT_INFO_STATUS= EchonetOntology.NAMESPACE + "hasConfirmOptInfoStatus";
	
	
	public String getConfirmOptInfoStatus() {
		return  getProperty(PROPERTY_HAS_CONFIRM_OPT_INFO_STATUS).toString();	
	}
	public void setConfirmOptInfoStatus(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONFIRM_OPT_INFO_STATUS, msg);	
	}
	
	public String getConfirmOptInfo() {
		return  getProperty(PROPERTY_HAS_CONFIRM_OPT_INFO).toString();	
	}
	public void setConfirmOptInfo(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONFIRM_OPT_INFO, msg);	
	}
	public String getEventInfo() {
		return  getProperty(PROPERTY_HAS_EVENT_INFO).toString();	
	}
	public void setEventInfo(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EVENT_INFO, msg);	
	}
	
	public String getTargetDeviceInfoList() {
		return  getProperty(PROPERTY_HAS_TARGET_DEVICE_INFO_LIST).toString();	
	}
	public void setTargetDeviceInfoList(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TARGET_DEVICE_INFO_LIST, msg);	
	}
	
	public String getEventInfoIDDesignation() {
		return  getProperty(PROPERTY_HAS_EVENT_INFO_ID_DESIGNATION).toString();	
	}
	public void setEventInfoIDDesignation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EVENT_INFO_ID_DESIGNATION, msg);	
	}
	
	public Integer getNotificationIDDesignation() {
		return  (Integer)getProperty(PROPERTY_HAS_NOTIFICATION_ID_DESIGNATION);	
	}
	public void setNotificationIDDesignation(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NOTIFICATION_ID_DESIGNATION, msg);	
	}
	
	public String getOldestReceivedEventNotificationID() {
		return  getProperty(PROPERTY_HAS_OLDEST_RECEIVED_EVENT_NOTIFICATION_ID).toString();	
	}
	public void setOldestReceivedEventNotificationID(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OLDEST_RECEIVED_EVENT_NOTIFICATION_ID, msg);	
	}
	
	public String getNewestReceivedEventNotificationID() {
		return  getProperty(PROPERTY_HAS_NEWEST_RECEIVED_EVENT_NOTIFICATION_ID).toString();	
	}
	public void setNewestReceivedEventNotificationID(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NEWEST_RECEIVED_EVENT_NOTIFICATION_ID, msg);	
	}
	
	public String getPastEventInfoNotificationIDList() {
		return  getProperty(PROPERTY_HAS_PAST_EVENT_INFO_NOTIFICATION_ID_LIST).toString();	
	}
	public void setPastEventInfoNotificationIDList(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_PAST_EVENT_INFO_NOTIFICATION_ID_LIST, msg);	
	}
	public String getFutureEventInfoNotificationIDList() {
		return  getProperty(PROPERTY_HAS_FUTURE_EVENT_INFO_NOTIFICATION_ID_LIST).toString();	
	}
	public void setFutureEventInfoNotificationIDList(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FUTURE_EVENT_INFO_NOTIFICATION_ID_LIST, msg);	
	}
	public String getNextValidEventInfo() {
		return  getProperty(PROPERTY_HAS_NEXT_VALID_EVENT_INFO).toString();	
	}
	public void setNextValidEventInfo(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NEXT_VALID_EVENT_INFO, msg);	
	}
	public String getCurrentValidEventInfo() {
		return  getProperty(PROPERTY_HAS_CURRENT_VALID_EVENT_INFO).toString();	
	}
	public void setCurrentValidEventInfo(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CURRENT_VALID_EVENT_INFO, msg);	
	}
	public String getDRProgramID() {
		return  getProperty(PROPERTY_HAS_DR_PROGRAM_ID).toString();	
	}
	public void setDRProgramID(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DR_PROGRAM_ID, msg);	
	}
	public String getDRProgramType() {
		return  getProperty(PROPERTY_HAS_DR_PROGRAM_TYPE).toString();	
	}
	public void setDRProgramType(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DR_PROGRAM_TYPE, msg);	
	}
	public String getBusinessID() {
		return  getProperty(PROPERTY_HAS_BUSINESS_ID).toString();	
	}
	public void setBusinessID(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BUSINESS_ID, msg);	
	}

	
	
	public DREventController() {
		super();
	}
	public DREventController(String uri) {
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
