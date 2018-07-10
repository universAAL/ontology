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

public class SelectiveOpeningOperationSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "SelectiveOpeningOperationSettingValue";
	private int order;
	public static final int DEGREE_OF_SETTING_POSITION_OPEN = 0;
	public static final int OPERATION_TIME_SETTING_OPEN = 1;
	public static final int OPERATION_TIME_SETTING_CLOSE = 2;
	public static final int LOCAL_SETTING_POSITION = 3;
	public static final int SLIT_DEGREE_OF_OPENNING_SETTING = 4;
	private static final String[] names = {"degreeOfSettingPositionOpen", "operationTimeSettingValueOpen", 
										   "operationTimeSettingValueClose", "localSettingPosition","slitDegreeOfOpeningSetting"};
	
	public static final SelectiveOpeningOperationSettingValue DegreeOfSettingPositionOpen = new SelectiveOpeningOperationSettingValue(DEGREE_OF_SETTING_POSITION_OPEN);
	public static final SelectiveOpeningOperationSettingValue OperationTimeSettingValueOpen = new SelectiveOpeningOperationSettingValue(OPERATION_TIME_SETTING_OPEN);
	public static final SelectiveOpeningOperationSettingValue OperationTimeSettingValueClose = new SelectiveOpeningOperationSettingValue(OPERATION_TIME_SETTING_CLOSE);
	public static final SelectiveOpeningOperationSettingValue LocalSettingPosition = new SelectiveOpeningOperationSettingValue(LOCAL_SETTING_POSITION);
	public static final SelectiveOpeningOperationSettingValue SlitDegreeOfOpeningSetting = new SelectiveOpeningOperationSettingValue(SLIT_DEGREE_OF_OPENNING_SETTING);


	private SelectiveOpeningOperationSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static SelectiveOpeningOperationSettingValue getSelectiveOpeningOperationSettingValueByOrder(int order) {
		switch (order) {
		case DEGREE_OF_SETTING_POSITION_OPEN:
			return DegreeOfSettingPositionOpen;
		case OPERATION_TIME_SETTING_OPEN:
			return OperationTimeSettingValueOpen;
		case OPERATION_TIME_SETTING_CLOSE:
			return OperationTimeSettingValueClose;
		case LOCAL_SETTING_POSITION:
			return LocalSettingPosition;
		case SLIT_DEGREE_OF_OPENNING_SETTING:
			return SlitDegreeOfOpeningSetting;
		default:
			return null;
		}
	}

	public static final SelectiveOpeningOperationSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = DEGREE_OF_SETTING_POSITION_OPEN; i <= SLIT_DEGREE_OF_OPENNING_SETTING; i++)
			if (names[i].equals(name))
				return getSelectiveOpeningOperationSettingValueByOrder(i);
		return null;
	}

	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}

	public String getClassURI() {
		return MY_URI;
	}

}
