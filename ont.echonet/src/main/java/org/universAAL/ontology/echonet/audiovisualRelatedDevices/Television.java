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
import org.universAAL.ontology.echonet.values.CharacterCodes;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.SupportedCharacterCodesValue;

public class Television extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Television";
	public static final String PROPERTY_HAS_DISPLAY_CONTROL_SETTING= EchonetOntology.NAMESPACE + "hasDisplayControlSetting";
	public static final String PROPERTY_HAS_CHARACTER_STRING_SETTING_ACCEPTANCE_STATUS= EchonetOntology.NAMESPACE + "hasCharacterSettingAcceptanceStatus";
	public static final String PROPERTY_HAS_SUPPORTED_CHARACTER_CODES= EchonetOntology.NAMESPACE + "hasSupportedCharacterCodes";
	public static final String PROPERTY_HAS_CHARACTER_STRING_TO_PRESENT_TO_USER= EchonetOntology.NAMESPACE + "hasCharacterStringToPresentToUser";
	public static final String PROPERTY_ACCEPTED_CHARACTER_STRING_LENGTH= EchonetOntology.NAMESPACE + "hasAcceptedCharacterStringLength";
	
	public MeasuredValue getAcceptedCharacterStringLength() {
		return (MeasuredValue) getProperty(PROPERTY_ACCEPTED_CHARACTER_STRING_LENGTH);	
	}
	public void setAcceptedCharacterStringLength(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_ACCEPTED_CHARACTER_STRING_LENGTH, msg);	
	}
	public CharacterCodes getCharacterStringToPresentToUser() {
		return (CharacterCodes) getProperty(PROPERTY_HAS_CHARACTER_STRING_TO_PRESENT_TO_USER);	
	}
	public void setCharacterStringToPresentToUser(CharacterCodes msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARACTER_STRING_TO_PRESENT_TO_USER, msg);	
	}
	public SupportedCharacterCodesValue getSupportedCharacterCodes() {
		return (SupportedCharacterCodesValue) getProperty(PROPERTY_HAS_SUPPORTED_CHARACTER_CODES);	
	}
	public void setSupportedCharacterCodes(SupportedCharacterCodesValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SUPPORTED_CHARACTER_CODES, msg);	
	}
	public OperationStateSettingValue getCharacterSettingAcceptanceStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_CHARACTER_STRING_SETTING_ACCEPTANCE_STATUS);	
	}
	public void setCharacterSettingAcceptanceStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARACTER_STRING_SETTING_ACCEPTANCE_STATUS, msg);	
	}
	public OperationStatusValue getDisplayControlSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_DISPLAY_CONTROL_SETTING);	
	}
	public void setDisplayControlSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISPLAY_CONTROL_SETTING, msg);	
	}

	
	
	public Television() {
		super();
	}
	public Television(String uri) {
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
