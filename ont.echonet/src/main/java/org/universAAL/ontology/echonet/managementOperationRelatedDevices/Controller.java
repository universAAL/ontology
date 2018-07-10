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
package org.universAAL.ontology.echonet.managementOperationRelatedDevices;




import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.InstallationLocationValue;
import org.universAAL.ontology.echonet.values.LocationValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class Controller extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Controller";
	public static final String PROPERTY_HAS_CONTROLLER_ID= EchonetOntology.NAMESPACE + "hasControllerID";
	public static final String PROPERTY_HAS_NUMBER_OF_CONTROLLED_DEVICES= EchonetOntology.NAMESPACE + "hasNumberOfControlledDevices";
	public static final String PROPERTY_HAS_INDEX= EchonetOntology.NAMESPACE + "hasIndex";
	public static final String PROPERTY_HAS_DEVICE_ID= EchonetOntology.NAMESPACE + "hasDeviceID";
	public static final String PROPERTY_HAS_DEVICE_TYPE= EchonetOntology.NAMESPACE + "hasDeviceType";
	public static final String PROPERTY_HAS_DEVICE_NAME= EchonetOntology.NAMESPACE + "hasDeviceName";
	public static final String PROPERTY_HAS_CONNECTION_STATUS= EchonetOntology.NAMESPACE + "hasConnectionStatus";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_BUSINESS_CODE= EchonetOntology.NAMESPACE + "hasControlledDeviceBusinessCode";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_PRODUCT_CODE= EchonetOntology.NAMESPACE + "hasControlledDeviceProductCode";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_MANUFACTURER_DATE= EchonetOntology.NAMESPACE + "hasControlledDeviceManufacturerDateTimeValue";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_DATE= EchonetOntology.NAMESPACE + "hasControlledDeviceRegisteredInformationRenewalDateTimeValue";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_VERSION_INFORMATION= EchonetOntology.NAMESPACE + "hasControlledDeviceRegisteredInformationRenewalVersionInfor";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_INSTALLATION_LOCATION= EchonetOntology.NAMESPACE + "hasControlledDeviceInstallationLocation";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_FAULT_STATUS= EchonetOntology.NAMESPACE + "hasControlledDeviceFaultStatus";
	public static final String PROPERTY_HAS_INSTALLATION_LOCATION_ADDRESS= EchonetOntology.NAMESPACE + "hasInstallationLocationAddress";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_SET_PROPERTY_MAP= EchonetOntology.NAMESPACE + "hasControlledDeviceSetPropertyMap";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_GET_PROPERTY_MAP= EchonetOntology.NAMESPACE + "hasControlledDeviceGetPropertyMap";
	
	public String getControlledDeviceGetPropertyMap() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_GET_PROPERTY_MAP);	
	}
	public void setControlledDeviceGetPropertyMap(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_GET_PROPERTY_MAP, msg);	
	}
	public String getControlledDeviceSetPropertyMap() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_SET_PROPERTY_MAP);	
	}
	public void setControlledDeviceSetPropertyMap(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_SET_PROPERTY_MAP, msg);	
	}
	public LocationValue getInstallationLocationAddress() {
		return (LocationValue) getProperty(PROPERTY_HAS_INSTALLATION_LOCATION_ADDRESS);	
	}
	public void setInstallationLocationAddress(LocationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSTALLATION_LOCATION_ADDRESS, msg);	
	}
	public OccurenceStatusValue getControlledDeviceFaultStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_FAULT_STATUS);	
	}
	public void setControlledDeviceFaultStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_FAULT_STATUS, msg);	
	}
	public InstallationLocationValue getControlledDeviceInstallationLocation() {
		return (InstallationLocationValue) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_INSTALLATION_LOCATION);	
	}
	public void setControlledDeviceInstallationLocation(InstallationLocationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_INSTALLATION_LOCATION, msg);	
	}
	public String getControlledDeviceRegisteredInformationRenewalVersionInfor() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_VERSION_INFORMATION);	
	}
	public void setControlledDeviceRegisteredInformationRenewalVersionInfor(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_VERSION_INFORMATION, msg);	
	}
	public DateTimeValue getControlledDeviceRegisteredInformationRenewalDateTimeValue() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_DATE);	
	}
	public void setControlledDeviceRegisteredInformationRenewalDateTimeValue(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_DATE, msg);	
	}
	public DateTimeValue getControlledDeviceManufacturerDateTimeValue() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_MANUFACTURER_DATE);	
	}
	public void setControlledDeviceManufacturerDateTimeValue(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_MANUFACTURER_DATE, msg);	
	}
	public String getControlledDeviceProductCode() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_PRODUCT_CODE);	
	}
	public void setControlledDeviceProductCode(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_PRODUCT_CODE, msg);	
	}
	public String getControlledDeviceBusinessCode() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_BUSINESS_CODE);	
	}
	public void setControlledDeviceBusinessCode(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_BUSINESS_CODE, msg);	
	}
	public OperationStatusValue getConnectionStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_CONNECTION_STATUS);	
	}
	public void setConnectionStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONNECTION_STATUS, msg);	
	}
	public String getDeviceName() {
		return (String) getProperty(PROPERTY_HAS_DEVICE_NAME);	
	}
	public void setDeviceName(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEVICE_NAME, msg);	
	}
	public String getDeviceType() {
		return (String) getProperty(PROPERTY_HAS_DEVICE_TYPE);	
	}
	public void setDeviceType(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEVICE_TYPE, msg);	
	}
	public String getDeviceID() {
		return (String) getProperty(PROPERTY_HAS_DEVICE_ID);	
	}
	public void setDeviceID(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEVICE_ID, msg);	
	}
	public Integer getIndex() {
		return (Integer) getProperty(PROPERTY_HAS_INDEX);	
	}
	public void setIndex(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INDEX, msg);	
	}
	public Integer getNumberOfControlledDevices() {
		return (Integer) getProperty(PROPERTY_HAS_NUMBER_OF_CONTROLLED_DEVICES);	
	}
	public void setNumberOfControlledDevices(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_CONTROLLED_DEVICES, msg);	
	}
	public String getControllerID() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLER_ID);	
	}
	public void setControllerID(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLER_ID, msg);	
	}

	
	
	public Controller() {
		super();
	}
	public Controller(String uri) {
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
