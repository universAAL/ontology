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

public class AlarmStatusValue extends ManagedIndividual {
	public static final String MY_URI = EchonetOntology.NAMESPACE + "AlarmStatusValue";
	
	public static final int NO_ALARM = 0;
	public static final int OUT_OF_HOT_WATER = 1;
	public static final int WATER_LEAKING = 2;
	public static final int WATER_FRONZEN = 3;
	public static final int BREAK_OPENED = 4;
	public static final int DOOR_OPENED = 5;
	public static final int MANUAL_UNLOCKED = 6;
	public static final int TAMPERED = 7;
	// Alarm operation status

	private static final String[] names = { "noAlarm", "outOfHotWater","waterLeaking","waterFrozen","breakOpened","doorOpened",
											"manualUnlocked","tampered"};
	
	public static final AlarmStatusValue NoAlarm = new AlarmStatusValue(NO_ALARM);
	public static final AlarmStatusValue OutOfHotWater = new AlarmStatusValue(OUT_OF_HOT_WATER);
	public static final AlarmStatusValue WaterLeaking = new AlarmStatusValue(WATER_LEAKING);
	public static final AlarmStatusValue WaterFrozen = new AlarmStatusValue(WATER_FRONZEN);
	public static final AlarmStatusValue BreakOpened = new AlarmStatusValue(BREAK_OPENED);
	public static final AlarmStatusValue DoorOpened = new AlarmStatusValue(DOOR_OPENED);
	public static final AlarmStatusValue ManualUnlocked = new AlarmStatusValue(MANUAL_UNLOCKED);
	public static final AlarmStatusValue Tampered = new AlarmStatusValue(TAMPERED);

	private int order;

	private AlarmStatusValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static AlarmStatusValue getAlarmStatusValueByOrder(int order) {
		switch (order) {
		case NO_ALARM:
			return NoAlarm;
		case OUT_OF_HOT_WATER:
			return OutOfHotWater;
		case WATER_LEAKING:
			return WaterLeaking;
		case WATER_FRONZEN:
			return WaterFrozen;
		case BREAK_OPENED:
			return BreakOpened;
		case DOOR_OPENED:
			return DoorOpened;
		case MANUAL_UNLOCKED:
			return ManualUnlocked;
		case TAMPERED:
			return Tampered;
		default:
			return null;
		}
	}

	public static final AlarmStatusValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NO_ALARM; i <= TAMPERED; i++)
			if (names[i].equals(name))
				return getAlarmStatusValueByOrder(i);
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
