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

public class TwoStageMicrowaveSettingValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "TwoStageMicrowaveSettingValue";
	public static final String PROPERTY_HAS_FIRST_STAGE_SETTING_VALUE = EchonetOntology.NAMESPACE + "hasFirstStageSettingValue";
	public static final String PROPERTY_HAS_SECOND_STAGE_SETTING_VALUE = EchonetOntology.NAMESPACE + "hasSecondStageSettingValue";

	public TwoStageMicrowaveSettingValue() {
		super();
	}
	public TwoStageMicrowaveSettingValue(String uri) {
		super(uri);
	}
	public TwoStageMicrowaveSettingValue(String uri, MeasuredValue firstStageValue,MeasuredValue secondStageValue ) {
		super(uri);
		setFirstStageSettingValue(firstStageValue);
		setSecondStageSettingValue(secondStageValue);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public MeasuredValue getFirstStageSettingValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_FIRST_STAGE_SETTING_VALUE);
	}
	public void setFirstStageSettingValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_FIRST_STAGE_SETTING_VALUE,msg);
	}
	public MeasuredValue getSecondStageSettingValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SECOND_STAGE_SETTING_VALUE);
	}
	public void setSecondStageSettingValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_SECOND_STAGE_SETTING_VALUE,msg);
	}

	public String getClassURI() {
		return MY_URI;
	}

}
