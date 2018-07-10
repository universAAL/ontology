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

public class InputSourceSettingValue extends ManagedIndividual{

	protected InputSourceSettingValue(String uri) {
		super(uri);
	}
	public static final String MY_URI = EchonetOntology.NAMESPACE + "InputSourceSettingValue";
	
	public static final int BUILT_INTO_TUNER = 0;
	public static final int BUILT_INTO_OPTICAL_DISK = 1;
	public static final int BUILT_INTO_MD = 2;
	public static final int BUILT_INTO_CASSETTLE = 3;
	public static final int EXTERNAL_INPUT_ANALOG_DIGITAL_INPUT_TERMINAL = 4;
	public static final int EXTERNAL_INPUT_HDMI = 5;
	public static final int EXTERNAL_INPUT_USB = 6;
	public static final int BUILT_IN_MEMORY_CARD_SLOT = 7;
	public static final int BUILT_IN_MEMORY_STORAGE = 8;
	public static final int DEDICATED_TERMINAL_FOR_PORTABLE_PLAYER = 9;
	public static final int NETWORK_RELATED_INPUT = 10;
	public static final int EQUIPMENT_UNIQUE_AREA =11;
	public static final int PROHIBITED = 12;
	public static final int NOT_SET = 13;
	private static final String[] names = { "builtIntoTuner", "builtIntoOpticalDisk","builtIntoMD","builtIntoCassettle",
											"externalInputAnalogDigitalInputTerminal","externalInputHDMI","externalInputUSB",
											"builtInMemoryCardSlot","builtInMemoryStorage","dedicatedTerminalForPortablePlayer",
											"networkRelatedInput","equipmentUniqueArea","prohibited","notSet"};
	
	public static final InputSourceSettingValue BuiltIntoTuner = new InputSourceSettingValue(BUILT_INTO_TUNER);
	public static final InputSourceSettingValue BuiltIntoOpticalDisk = new InputSourceSettingValue(BUILT_INTO_OPTICAL_DISK);
	public static final InputSourceSettingValue BuiltIntoMD = new InputSourceSettingValue(BUILT_INTO_MD);
	public static final InputSourceSettingValue BuiltIntoCassettle = new InputSourceSettingValue(BUILT_INTO_CASSETTLE);
	public static final InputSourceSettingValue ExternalInputAnalogDigitalInputTerminal = new InputSourceSettingValue(EXTERNAL_INPUT_ANALOG_DIGITAL_INPUT_TERMINAL);
	public static final InputSourceSettingValue ExternalInputHDMI = new InputSourceSettingValue(EXTERNAL_INPUT_HDMI);
	public static final InputSourceSettingValue ExternalInputUSB = new InputSourceSettingValue(EXTERNAL_INPUT_USB);
	public static final InputSourceSettingValue BuiltInMemoryCardSlot = new InputSourceSettingValue(BUILT_IN_MEMORY_CARD_SLOT);
	public static final InputSourceSettingValue BuiltInMemoryStorage = new InputSourceSettingValue(BUILT_IN_MEMORY_STORAGE);
	public static final InputSourceSettingValue DedicatedTerminalForPortablePlayer = new InputSourceSettingValue(DEDICATED_TERMINAL_FOR_PORTABLE_PLAYER);	
	public static final InputSourceSettingValue NetworkRelatedInput = new InputSourceSettingValue(NETWORK_RELATED_INPUT);
	public static final InputSourceSettingValue EquipmentUniqueArea = new InputSourceSettingValue(EQUIPMENT_UNIQUE_AREA);
	public static final InputSourceSettingValue Prohibited = new InputSourceSettingValue(PROHIBITED);
	public static final InputSourceSettingValue NotSet = new InputSourceSettingValue(NOT_SET);
	private int order;

	private InputSourceSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static InputSourceSettingValue getInputSourceSettingValueByOrder(int order) {
		switch (order) {
		case BUILT_INTO_TUNER:
			return BuiltIntoTuner;
		case BUILT_INTO_OPTICAL_DISK:
			return BuiltIntoOpticalDisk;
		case BUILT_INTO_MD:
			return BuiltIntoMD;
		case BUILT_INTO_CASSETTLE:
			return BuiltIntoCassettle;
		case EXTERNAL_INPUT_ANALOG_DIGITAL_INPUT_TERMINAL:
			return ExternalInputAnalogDigitalInputTerminal;		
		case EXTERNAL_INPUT_HDMI:
			return ExternalInputHDMI;
		case EXTERNAL_INPUT_USB:
			return ExternalInputUSB;
		case BUILT_IN_MEMORY_CARD_SLOT:
			return BuiltInMemoryCardSlot;
		case BUILT_IN_MEMORY_STORAGE:
			return BuiltInMemoryStorage;
		case DEDICATED_TERMINAL_FOR_PORTABLE_PLAYER:
			return DedicatedTerminalForPortablePlayer;		
		case NETWORK_RELATED_INPUT:
			return NetworkRelatedInput;
		case EQUIPMENT_UNIQUE_AREA:
			return EquipmentUniqueArea;
		case PROHIBITED:
			return Prohibited;
		case NOT_SET:
			return NotSet;
		default:
			return null;
		}
	}

	public static final InputSourceSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = BUILT_INTO_TUNER; i <= NOT_SET; i++)
			if (names[i].equals(name))
				return getInputSourceSettingValueByOrder(i);
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
