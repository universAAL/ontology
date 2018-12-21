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

public class OperationFunctionSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "OperationFuntionSettingValue";
	private int order;
	public static final int NO_SETTING = 0;
	public static final int CLOTHES_DRYER_FUNCTION = 1;
	public static final int CONDENSATION_SUPPRESSOR_FUNCTION = 2;
	public static final int MITE_MOLD_CONTROL_FUNCTION = 3;
	public static final int ACTIVE_DEFROSTING_FUNCTION = 4;
	public static final int OPEN = 5;
	public static final int CLOSE = 6;
	public static final int STOP = 7;
	public static final int CONTINOUS_SETTING = 8;
	public static final int ONE_TIME_SETTING = 9;
	public static final int SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_ACCEPTABLE = 10;
	public static final int INDEPENDENT = 11;
	public static final int SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_NOT_ACCEPTABLE = 12;
	public static final int TIMER_OFF = 13;
	public static final int TIMER_1_ON = 14;
	public static final int TIMER_2_ON = 15;
	public static final int TIME_AND_RELATIVE_TIME_BASED_RESERVATION_ON = 16;
	public static final int TIME_AND_RELATIVE_TIME_BASED_RESERVATION_OFF = 17;
	public static final int TIME_BASED_RESERVATION_ON = 18;
	public static final int RELATIVE_TIME_BASED_RESERVATION_ON = 19;
	public static final int HYBRID = 20;
	public static final int SYSTEM_LINKED = 21;
	public static final int FLUORESCENT_LIGHTS = 22;
	public static final int LED = 23;
	public static final int NO_LIGHTING = 24;
	public static final int NON_FLUOROCARBON_INVETER = 25;
	public static final int INVERTER = 26;
	public static final int BUILT_IN_TYPE = 27;
	public static final int SEPERATE_TYPE = 28;
	public static final int OTHERS = 29;
	public static final int NORMAL_SETTING = 30;
	public static final int THERMOSTAT_OVERRIDE_FUNCTION_ON = 31;
	public static final int THERMOSTAT_OVERRIDE_FUNCTION_OFF = 32;
	
	private static final String[] names = {"noSetting", "clothesDryerFunction", "condensationSuppressorFunction","miteMoldControlFunction","activeDefrostingFunction",
										   "open", "close", "stop", "continousSetting","oneTimeSetting",
										   "systemInterconnectedReservePowerFlowAcceptable","independent",
										   "systemInterconnectedReservePowerFlowNotAcceptable","timerOff","timer1_On","timer2_On",
										   "timeAndRelativeTimeBasedRevervationON", "timeAndRelativeTimeBasedRevervationOFF", 
										   "timeBasedRevervationON","relativeTimeBasedRevervationON","hybrid","systemLinked",
										   "fluorescentLight","led","noLight","nonFluorocarbonInverter","inverter","builtInType",
										   "seperateType","others","normalSetting", "thermostatOverrideFunctionON", 
										   "thermostatOverrideFunctionOFF"};
	
	public static final OperationFunctionSettingValue NoSetting = new OperationFunctionSettingValue(NO_SETTING);
	public static final OperationFunctionSettingValue ClothesDryerFunction = new OperationFunctionSettingValue(CLOTHES_DRYER_FUNCTION);
	public static final OperationFunctionSettingValue CondensationSuppressorFunction = new OperationFunctionSettingValue(CONDENSATION_SUPPRESSOR_FUNCTION);
	public static final OperationFunctionSettingValue MiteMoldControlFunction = new OperationFunctionSettingValue(MITE_MOLD_CONTROL_FUNCTION);
	public static final OperationFunctionSettingValue ActiveDefrostingFunction = new OperationFunctionSettingValue(ACTIVE_DEFROSTING_FUNCTION);
	public static final OperationFunctionSettingValue Open = new OperationFunctionSettingValue(OPEN);
	public static final OperationFunctionSettingValue Close = new OperationFunctionSettingValue(CLOSE);
	public static final OperationFunctionSettingValue Stop = new OperationFunctionSettingValue(STOP);
	public static final OperationFunctionSettingValue ContinousSetting = new OperationFunctionSettingValue(CONTINOUS_SETTING);
	public static final OperationFunctionSettingValue OneTimeSetting = new OperationFunctionSettingValue(ONE_TIME_SETTING);
	public static final OperationFunctionSettingValue SystemInterconnectedReservePowerFlowAcceptable = new OperationFunctionSettingValue(SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_ACCEPTABLE);
	public static final OperationFunctionSettingValue Independent = new OperationFunctionSettingValue(INDEPENDENT);
	public static final OperationFunctionSettingValue SystemInterconnectedReservePowerFlowNotAcceptable = new OperationFunctionSettingValue(SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_NOT_ACCEPTABLE);
	public static final OperationFunctionSettingValue TimerOff = new OperationFunctionSettingValue(TIMER_OFF);
	public static final OperationFunctionSettingValue Timer1_On = new OperationFunctionSettingValue(TIMER_1_ON);
	public static final OperationFunctionSettingValue Timer2_On = new OperationFunctionSettingValue(TIMER_2_ON);
	public static final OperationFunctionSettingValue TimeAndRelativeTimeBasedRevervationON = new OperationFunctionSettingValue(TIME_AND_RELATIVE_TIME_BASED_RESERVATION_ON);
	public static final OperationFunctionSettingValue TimeAndRelativeTimeBasedRevervationOFF = new OperationFunctionSettingValue(TIME_AND_RELATIVE_TIME_BASED_RESERVATION_OFF);
	public static final OperationFunctionSettingValue TimeBasedRevervationON = new OperationFunctionSettingValue(TIME_BASED_RESERVATION_ON);
	public static final OperationFunctionSettingValue RelativeTimeBasedRevervationON = new OperationFunctionSettingValue(RELATIVE_TIME_BASED_RESERVATION_ON);
	public static final OperationFunctionSettingValue Hybrid = new OperationFunctionSettingValue(HYBRID);
	public static final OperationFunctionSettingValue SystemLinked = new OperationFunctionSettingValue(SYSTEM_LINKED);
	public static final OperationFunctionSettingValue FluorescentLight = new OperationFunctionSettingValue(FLUORESCENT_LIGHTS);
	public static final OperationFunctionSettingValue Led = new OperationFunctionSettingValue(LED);
	public static final OperationFunctionSettingValue NoLight = new OperationFunctionSettingValue(NO_LIGHTING);
	public static final OperationFunctionSettingValue NonFluorocarbonInverter = new OperationFunctionSettingValue(NON_FLUOROCARBON_INVETER);
	public static final OperationFunctionSettingValue Inverter = new OperationFunctionSettingValue(INVERTER);
	public static final OperationFunctionSettingValue BuiltInType = new OperationFunctionSettingValue(BUILT_IN_TYPE);
	public static final OperationFunctionSettingValue SeperateType = new OperationFunctionSettingValue(SEPERATE_TYPE);
	public static final OperationFunctionSettingValue Others = new OperationFunctionSettingValue(OTHERS);
	public static final OperationFunctionSettingValue NormalSetting = new OperationFunctionSettingValue(NORMAL_SETTING);
	public static final OperationFunctionSettingValue ThermostatOverrideFunctionON = new OperationFunctionSettingValue(THERMOSTAT_OVERRIDE_FUNCTION_ON);
	public static final OperationFunctionSettingValue ThermostatOverrideFunctionOFF = new OperationFunctionSettingValue(THERMOSTAT_OVERRIDE_FUNCTION_OFF);




	
	private OperationFunctionSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static OperationFunctionSettingValue getAirconditionerSpecialFunctionSettingValueByOrder(int order) {
		switch (order) {
		case NO_SETTING:
			return NoSetting;
		case CLOTHES_DRYER_FUNCTION:
			return ClothesDryerFunction;
		case CONDENSATION_SUPPRESSOR_FUNCTION:
			return CondensationSuppressorFunction;
		case MITE_MOLD_CONTROL_FUNCTION:
			return MiteMoldControlFunction;
		case ACTIVE_DEFROSTING_FUNCTION:
			return ActiveDefrostingFunction;
		case OPEN:
			return Open;
		case CLOSE:
			return Close;
		case STOP:
			return Stop;
		case CONTINOUS_SETTING:
			return ContinousSetting;
		case ONE_TIME_SETTING:
			return OneTimeSetting;
		case SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_ACCEPTABLE:
			return SystemInterconnectedReservePowerFlowAcceptable;
		case INDEPENDENT:
			return Independent;
		case SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_NOT_ACCEPTABLE:
			return SystemInterconnectedReservePowerFlowNotAcceptable;
		case TIMER_OFF:
			return TimerOff;
		case TIMER_1_ON:
			return Timer1_On;
		case TIMER_2_ON:
			return Timer2_On;
		case TIME_AND_RELATIVE_TIME_BASED_RESERVATION_ON:
			return TimeAndRelativeTimeBasedRevervationON;
		case TIME_AND_RELATIVE_TIME_BASED_RESERVATION_OFF:
			return TimeAndRelativeTimeBasedRevervationOFF;
		case TIME_BASED_RESERVATION_ON:
			return TimeBasedRevervationON;
		case RELATIVE_TIME_BASED_RESERVATION_ON:
			return RelativeTimeBasedRevervationON;
		case HYBRID:
			return Hybrid;
		case SYSTEM_LINKED:
			return SystemLinked;
		case FLUORESCENT_LIGHTS:
			return FluorescentLight;
		case LED:
			return Led;
		case NON_FLUOROCARBON_INVETER:
			return NonFluorocarbonInverter;
		case INVERTER:
			return Inverter;
		case NO_LIGHTING:
			return NoLight;
		case SEPERATE_TYPE:
			return SeperateType;
		case BUILT_IN_TYPE:
			return BuiltInType;
		case OTHERS:
			return Others;
		case NORMAL_SETTING:
			return NormalSetting;
		case THERMOSTAT_OVERRIDE_FUNCTION_ON:
			return ThermostatOverrideFunctionON;
		case THERMOSTAT_OVERRIDE_FUNCTION_OFF:
			return ThermostatOverrideFunctionOFF;	
		default:
			return null;
		}
	}

	public static final OperationFunctionSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NO_SETTING; i <= THERMOSTAT_OVERRIDE_FUNCTION_OFF; i++)
			if (names[i].equals(name))
				return getAirconditionerSpecialFunctionSettingValueByOrder(i);
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
