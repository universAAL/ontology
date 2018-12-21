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
package org.universAAL.ontology.echonetontology.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonetontology.EchonetOntology;

public class OperationStatusValue extends ManagedIndividual {
	public static final String MY_URI = EchonetOntology.NAMESPACE + "OperationStatusValue";
	
	public static final int ON = 0;
	public static final int OFF = 1;
	public static final int AUTOMATIC_ON = 2;
	public static final int MANUAL_ON = 3;
	public static final int MANUAL_OFF = 4;
	public static final int AUTOMATIC = 5;
	public static final int NON_AUTOMATIC = 6;
	public static final int AUTOMATIC_USED = 7;
	public static final int NON_AUTOMATIC_USED = 8;
	public static final int NON_AUTOMATIC_STOPPED = 9;
	public static final int HEATING = 10;
	public static final int NOT_HEATING = 11;
	public static final int POSSIBLE = 12;
	public static final int NOT_POSSIBLE = 13;
	public static final int NORMAL = 14;
	public static final int ALARM = 15;
	public static final int INITIAL = 16;
	public static final int HEATING_SUSPENDED = 17;
	public static final int HEATING_CYCLE_COMPLETED = 18;
	public static final int SETTING = 19;
	public static final int PRE_HEATING = 20;
	public static final int PREHEAT_TEMPERATURE_MAINTENANCE = 21;
	public static final int HEATING_TEMPORILY_STOPPED = 22;
	public static final int NOT_SPECIFIED = 23;
	public static final int STOP = 24;
	public static final int COOKING = 25;
	public static final int STEAMING = 26;
	public static final int COOKING_COMPLETED = 27;
	public static final int REFRIGERATION = 28;
	public static final int FREEZING = 29;
	private static final String[] names = { "on", "off","automaticOn","manualOn","manualOff",
											"automatic","nonAutomatic","automaticUsed","nonAutomaticStopped",
											"nonAutomaticUsed","heating","notHeating","possible", "notPossible",
											"normal","alarm","initial","heatingSuspended","heatingCycleCompleted",
											"setting","preHeating","preheatTemperatureMaintenance","heatingTemporilyStopped",
											"notSpecified","stop","cooking","steaming","cookingCompleted","refrigeration",
											"freezing"};
	
	public static final OperationStatusValue On = new OperationStatusValue(ON);
	public static final OperationStatusValue Off = new OperationStatusValue(OFF);
	public static final OperationStatusValue AutomaticOn = new OperationStatusValue(AUTOMATIC_ON);
	public static final OperationStatusValue ManualOn = new OperationStatusValue(MANUAL_ON);
	public static final OperationStatusValue ManualOff = new OperationStatusValue(MANUAL_OFF);
	public static final OperationStatusValue Automatic = new OperationStatusValue(AUTOMATIC);
	public static final OperationStatusValue NonAutomatic = new OperationStatusValue(NON_AUTOMATIC);
	public static final OperationStatusValue AutomaticUsed = new OperationStatusValue(AUTOMATIC_USED);
	public static final OperationStatusValue NonAutomaticStopped = new OperationStatusValue(NON_AUTOMATIC_USED);
	public static final OperationStatusValue NonAutomaticUsed = new OperationStatusValue(NON_AUTOMATIC_STOPPED);
	public static final OperationStatusValue Heating = new OperationStatusValue(HEATING);
	public static final OperationStatusValue NotHeating = new OperationStatusValue(NOT_HEATING);
	public static final OperationStatusValue Possible = new OperationStatusValue(POSSIBLE);
	public static final OperationStatusValue NotPossible = new OperationStatusValue(NOT_POSSIBLE);
	public static final OperationStatusValue Normal = new OperationStatusValue(NORMAL);
	public static final OperationStatusValue Alarm = new OperationStatusValue(ALARM);
	public static final OperationStatusValue Initial = new OperationStatusValue(INITIAL);
	public static final OperationStatusValue HeatingSuspended = new OperationStatusValue(HEATING_SUSPENDED);
	public static final OperationStatusValue HeatingCycleCompleted = new OperationStatusValue(HEATING_CYCLE_COMPLETED);
	public static final OperationStatusValue Setting = new OperationStatusValue(SETTING);
	public static final OperationStatusValue PreHeating = new OperationStatusValue(PRE_HEATING);
	public static final OperationStatusValue PreheatTemperatureMaintenance = new OperationStatusValue(PREHEAT_TEMPERATURE_MAINTENANCE);
	public static final OperationStatusValue HeatingTemporilyStopped = new OperationStatusValue(HEATING_TEMPORILY_STOPPED);
	public static final OperationStatusValue NotSpecified = new OperationStatusValue(NOT_SPECIFIED);
	public static final OperationStatusValue Stop = new OperationStatusValue(STOP);
	public static final OperationStatusValue Cooking = new OperationStatusValue(COOKING);
	public static final OperationStatusValue Steaming = new OperationStatusValue(STEAMING);
	public static final OperationStatusValue CookingCompleted = new OperationStatusValue(COOKING_COMPLETED);
	public static final OperationStatusValue Refrigeration = new OperationStatusValue(REFRIGERATION);
	public static final OperationStatusValue Freezing = new OperationStatusValue(FREEZING);

	private int order;

	private OperationStatusValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static OperationStatusValue getOperationStatusValueByOrder(int order) {
		switch (order) {
		case ON:
			return On;
		case OFF:
			return Off;
		case AUTOMATIC_ON:
			return AutomaticOn;
		case MANUAL_ON:
			return ManualOn;
		case MANUAL_OFF:
			return ManualOff;
		case AUTOMATIC:
			return Automatic;
		case NON_AUTOMATIC:
			return NonAutomatic;
		case AUTOMATIC_USED:
			return AutomaticUsed;
		case NON_AUTOMATIC_USED:
			return NonAutomaticStopped;
		case NON_AUTOMATIC_STOPPED:
			return NonAutomaticUsed;
		case HEATING:
			return Heating;
		case NOT_HEATING:
			return NotHeating;
		case POSSIBLE:
			return Possible;
		case NOT_POSSIBLE:
			return NotPossible;	
		case NORMAL:
			return Normal;
		case ALARM:
			return Alarm;	
		case INITIAL:
			return Initial;
		case HEATING_SUSPENDED:
			return HeatingSuspended;
		case HEATING_CYCLE_COMPLETED:
			return HeatingCycleCompleted;
		case SETTING:
			return Setting;	
		case PRE_HEATING:
			return PreHeating;
		case PREHEAT_TEMPERATURE_MAINTENANCE:
			return PreheatTemperatureMaintenance;	
		case HEATING_TEMPORILY_STOPPED:
			return HeatingTemporilyStopped;	
		case NOT_SPECIFIED:
			return NotSpecified;	
		case STOP:
			return Stop;
		case COOKING:
			return Cooking;	
		case STEAMING:
			return Steaming;	
		case COOKING_COMPLETED:
			return CookingCompleted;	
		case REFRIGERATION:
			return Refrigeration;	
		case FREEZING:
			return Freezing;
		default:
			return null;
		}
	}

	public static final OperationStatusValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = ON; i <= FREEZING; i++)
			if (names[i].equals(name))
				return getOperationStatusValueByOrder(i);
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
