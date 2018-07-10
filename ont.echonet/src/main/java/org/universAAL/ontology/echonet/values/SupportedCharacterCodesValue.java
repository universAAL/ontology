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
package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class SupportedCharacterCodesValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "SupportedCharacterCodesValue";
	public static final String PROPERTY_HAS_CHARACTER_CODE = EchonetOntology.NAMESPACE + "hasCharacterCodes";
	public static final String PROPERTY_HAS_SUPPORTED_NOT_SUPPORTED_STATE = EchonetOntology.NAMESPACE + "hasSupportedNotSupportedState";

	public CharacterCodes getCharacterCodes() {
		return (CharacterCodes) getProperty(PROPERTY_HAS_CHARACTER_CODE);	
	}
	public void setCharacterCodes(CharacterCodes msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARACTER_CODE, msg);	
	}	
	public OperationStateSettingValue getSupportedNotSupportedState() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_SUPPORTED_NOT_SUPPORTED_STATE);	
	}
	public void setSupportedNotSupportedState(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SUPPORTED_NOT_SUPPORTED_STATE, msg);	
	}
	public SupportedCharacterCodesValue() {
		super();
	}
	public SupportedCharacterCodesValue(String uri) {
		super(uri);
	}
	public SupportedCharacterCodesValue(String uri, CharacterCodes codes,OperationStateSettingValue supportedState ) {
		super(uri);
		setCharacterCodes(codes);
		setSupportedNotSupportedState(supportedState);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public String getClassURI() {
		return MY_URI;
	}

}
