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
package org.universAAL.ontology.echonet.audiovisualRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.TransferSettingValue;

public class NetworkCamera extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "NetworkCamera";
	public static final String PROPERTY_HAS_STILL_IMAGE_PHOTOGRAPHY_SETTING_ACCEPTANCE_STATUS = 
								EchonetOntology.NAMESPACE + "hasStillImagePhotographySettingAcceptanceStatus";
	public static final String PROPERTY_SET_STILL_IMAGE_PHOTOGRAPHY_SETTING =  EchonetOntology.NAMESPACE + "setStillImagePhotographySetting";
	public static final String PROPERTY_HAS_TRANSFER_SETTING= EchonetOntology.NAMESPACE + "hasTransferSetting";
	
	public TransferSettingValue getTransferSetting() {
		return (TransferSettingValue) getProperty(PROPERTY_HAS_TRANSFER_SETTING);	
	}
	public void setTransferSetting(TransferSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TRANSFER_SETTING, msg);	
	}
	public OperationStateSettingValue getStillImagePhotographySettingAcceptanceStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_STILL_IMAGE_PHOTOGRAPHY_SETTING_ACCEPTANCE_STATUS);	
	}
	public void setStillImagePhotographySettingAcceptanceStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_STILL_IMAGE_PHOTOGRAPHY_SETTING_ACCEPTANCE_STATUS, msg);	
	}

	
	
	public NetworkCamera() {
		super();
	}
	public NetworkCamera(String uri) {
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
