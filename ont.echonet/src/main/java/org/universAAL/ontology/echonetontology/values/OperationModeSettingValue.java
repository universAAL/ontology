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

public class OperationModeSettingValue extends ManagedIndividual{
	
public static final String MY_URI = EchonetOntology.NAMESPACE + "OperationModeSettingValue";
	private int order;
	public static final int NORMAL_OPERATION = 0;
	public static final int HIGH_SPEED_OPERATION = 1;
	public static final int SILENT_OPERATION = 2;
	public static final int STANDARD_MODE = 3;
	public static final int EXTRA_MODE = 4;
	public static final int AUTOMATIC_DIRECTION_CONTROL_MODE = 5;
	public static final int NON_AUTOMATIC_DIRECTION_CONTROL_MODE = 6;
	public static final int AUTOMATIC_VERTICAL_DIRECTION_CONTROL_MODE = 7;
	public static final int AUTOMATIC_HORIZONTAL_DIRECTION_CONTROL_MODE = 8;
	public static final int AUTOMATIC_MODE = 9;
	public static final int COOLING_MODE = 10;
	public static final int HEATING_MODE = 11;
	public static final int DEHUMIDIFICATION_MODE = 12;
	public static final int CIRCULATOR_MODE = 13;
	public static final int OTHER = 14;
	public static final int THROAT_DRY_PREVENTION_MODE = 15;
	public static final int QUIET_OPERATION_MODE = 16;
	public static final int SAVING_MODE = 17;
	public static final int ROOM_HEATING_ON_MODE = 18;
	public static final int ROOM_HEATING_OFF_MODE = 19;
	public static final int TIMER_MODE = 20;
	public static final int NO_SETTING = 21;
	public static final int OVER_COOL_PREVENTION_MODE = 22;
	public static final int VENTILATION_MODE = 23;
	public static final int PRE_WARM_MODE = 24;
	public static final int DRYER_MODE = 25;
	public static final int STOP = 26;
	public static final int MODEST_OPERATION_MODE = 27;
	public static final int HIGH_POWER_OPERATION_MODE = 28;
	public static final int RAPID_CHARGING_MODE = 29;
	public static final int CHARGING_MODE = 30;
	public static final int DISCHARGING_MODE = 31;
	public static final int STANDBY_MODE = 32;
	public static final int TEST_MODE = 33;
	public static final int RESTART_MODE = 34;
	public static final int RECALCULATION_MODE= 35;
	public static final int MAIN_LIGHTING_MODE = 36;
	public static final int NIGHT_LIGHTING_MODE = 37;
	public static final int COLOR_LIGHTING_MODE= 38;
	public static final int CITRIC_ACID_CLEANING_MODE= 39;
	public static final int QUICK_MODE= 40;
	public static final int MICROWAVE_HEATING_MODE= 41;
	public static final int DEFROSTING_MODE = 42;
	public static final int OVEN_MODE = 43;
	public static final int GRILL_MODE= 44;
	public static final int TOASTER_MODE= 45;
	public static final int FERMENTING_MODE= 46;
	public static final int STEWING_MODE= 47;
	public static final int STEAMING_MODE = 48;
	public static final int TWO_STAGE_MICROWAVE_HEATING = 49;
	public static final int CONVECTION_MODE= 50;
	public static final int HYBRID_MODE = 51;
	public static final int POWER_CONTROL_MODE = 52;
	public static final int DEEP_FRYING_MODE = 53;
	public static final int WATER_HEATING_MODE= 54;
	public static final int RICE_BOILING_MODE = 55;
	public static final int STIR_FRYING_MODE= 56;
	public static final int WASHING_MODE = 57;
	public static final int RINSING_MODE = 58;
	public static final int SPIN_DRYING_MODE= 59;
	public static final int SUSPENDED_MODE = 60;
	public static final int WORKING_CYCLE_STOPPED_COMPLETED= 61;
	public static final int NON_COOLING_MODE = 62;
	public static final int CONTINOUS_MODE = 63;
	public static final int INTERMITTENT_MODE = 64;

	
	
	private static final String[] names = {"normalMode", "highSpeedMode", "silentMode",
										   "standardMode","extraMode","automaticAirFlowDirectionControlMode", 
										   "nonAutomaticAirFlowDirectionControlMode", "automaticAirFlowVerticalDirectionMode", 
										   "automaticAirFlowHorizontalDirectionMode","automaticMode", "coolingMode", "heatingMode", 
										   "dehumidificationMode", "ciculatorMode", "other","throatDryPreventionMode", "quietOperationMode",
										   "powerSavingMode","roomHeatingOnMode","roomHeatingOffMode","timerMode","noSetting",
										   "overCoolPreventionMode","ventilationMode","preWarmMode","dryerMode","stop",
										   "modestOperationMode","highPowerOperationMode","rapidCharginMode","chargingMode",
										   "dischargingMode","standbyMode","testMode","restartMode","recalculationMode",
										   "mainLightingMode","nightLightingMode","colorLightingMode","citricAcidCleaningMode",
										   "quickMode","microwaveHeatingMode","defrostingMode","ovenMode","grillMode","toasterMode",
										   "fermentingMode","stewingMode","steamingMode","twoStageMicrowaveHeatingMode",
										   "convectionMode","hybridMode","powerControlMode","deepFryingMode","waterHeatingMode",
										   "riceBoilingMode","stirFryingMode","washingMode","rinsingMode","spinDryingMode","suspendedMode",
										   "workingCycleStoppedCompletedMode","nonCoolingMode","continousMode", "intermitentMode"};
	
	public static final OperationModeSettingValue NormalMode = new OperationModeSettingValue(NORMAL_OPERATION);
	public static final OperationModeSettingValue HighSpeedMode = new OperationModeSettingValue(HIGH_SPEED_OPERATION);
	public static final OperationModeSettingValue SilentMode = new OperationModeSettingValue(SILENT_OPERATION);
	public static final OperationModeSettingValue StandardMode = new OperationModeSettingValue(STANDARD_MODE);
	public static final OperationModeSettingValue ExtraMode = new OperationModeSettingValue(EXTRA_MODE);
	public static final OperationModeSettingValue AutomaticAirFlowDirectionControlMode = new OperationModeSettingValue(AUTOMATIC_DIRECTION_CONTROL_MODE);
	public static final OperationModeSettingValue NonAutomaticAirFlowDirectionControlMode = new OperationModeSettingValue(NON_AUTOMATIC_DIRECTION_CONTROL_MODE);
	public static final OperationModeSettingValue AutomaticAirFlowVerticalDirectionMode = new OperationModeSettingValue(AUTOMATIC_VERTICAL_DIRECTION_CONTROL_MODE);
	public static final OperationModeSettingValue AutomaticAirFlowHorizontalDirectionMode = new OperationModeSettingValue(AUTOMATIC_HORIZONTAL_DIRECTION_CONTROL_MODE);
	public static final OperationModeSettingValue AutomaticMode = new OperationModeSettingValue(AUTOMATIC_MODE);
	public static final OperationModeSettingValue CoolingMode = new OperationModeSettingValue(COOLING_MODE);
	public static final OperationModeSettingValue HeatingMode = new OperationModeSettingValue(HEATING_MODE);
	public static final OperationModeSettingValue DehumidificationMode = new OperationModeSettingValue(DEHUMIDIFICATION_MODE);
	public static final OperationModeSettingValue CiculatorMode = new OperationModeSettingValue(CIRCULATOR_MODE);
	public static final OperationModeSettingValue Other = new OperationModeSettingValue(OTHER);
	public static final OperationModeSettingValue ThroatDryPreventionMode = new OperationModeSettingValue(THROAT_DRY_PREVENTION_MODE);
	public static final OperationModeSettingValue QuietOperationMode = new OperationModeSettingValue(QUIET_OPERATION_MODE);
	public static final OperationModeSettingValue PowerSavingMode = new OperationModeSettingValue(SAVING_MODE);
	public static final OperationModeSettingValue RoomHeatingOnMode = new OperationModeSettingValue(ROOM_HEATING_ON_MODE);
	public static final OperationModeSettingValue RoomHeatingOffMode = new OperationModeSettingValue(ROOM_HEATING_OFF_MODE);
	public static final OperationModeSettingValue TimerMode= new OperationModeSettingValue(TIMER_MODE);
	public static final OperationModeSettingValue NoSetting = new OperationModeSettingValue(NO_SETTING);
	public static final OperationModeSettingValue OverCoolPreventionMode = new OperationModeSettingValue(OVER_COOL_PREVENTION_MODE);
	public static final OperationModeSettingValue VentilationMode = new OperationModeSettingValue(VENTILATION_MODE);
	public static final OperationModeSettingValue PreWarmMode= new OperationModeSettingValue(PRE_WARM_MODE);
	public static final OperationModeSettingValue DryerMode = new OperationModeSettingValue(NO_SETTING);
	public static final OperationModeSettingValue Stop = new OperationModeSettingValue(OVER_COOL_PREVENTION_MODE);
	public static final OperationModeSettingValue ModestOperationMode = new OperationModeSettingValue(MODEST_OPERATION_MODE);
	public static final OperationModeSettingValue HighPowerOperationMode = new OperationModeSettingValue(HIGH_POWER_OPERATION_MODE);
	public static final OperationModeSettingValue RapidCharginMode = new OperationModeSettingValue(RAPID_CHARGING_MODE);
	public static final OperationModeSettingValue ChargingMode = new OperationModeSettingValue(CHARGING_MODE);
	public static final OperationModeSettingValue DischargingMode = new OperationModeSettingValue(CHARGING_MODE);
	public static final OperationModeSettingValue StandbyMode = new OperationModeSettingValue(STANDBY_MODE);
	public static final OperationModeSettingValue TestMode = new OperationModeSettingValue(STANDBY_MODE);
	public static final OperationModeSettingValue RestartMode = new OperationModeSettingValue(RESTART_MODE);
	public static final OperationModeSettingValue RecalculationMode = new OperationModeSettingValue(RECALCULATION_MODE);
	public static final OperationModeSettingValue MainLightingMode = new OperationModeSettingValue(MAIN_LIGHTING_MODE);
	public static final OperationModeSettingValue NightLightingMode = new OperationModeSettingValue(NIGHT_LIGHTING_MODE);
	public static final OperationModeSettingValue ColorLightingMode = new OperationModeSettingValue(COLOR_LIGHTING_MODE);
	public static final OperationModeSettingValue CitricAcidCleaningMode = new OperationModeSettingValue(CITRIC_ACID_CLEANING_MODE);
	public static final OperationModeSettingValue QuickMode = new OperationModeSettingValue(QUICK_MODE);
	public static final OperationModeSettingValue MicrowaveHeatingMode = new OperationModeSettingValue(MICROWAVE_HEATING_MODE);
	public static final OperationModeSettingValue DefrostingMode = new OperationModeSettingValue(DEFROSTING_MODE);
	public static final OperationModeSettingValue OvenMode = new OperationModeSettingValue(OVEN_MODE);
	public static final OperationModeSettingValue GrillMode = new OperationModeSettingValue(GRILL_MODE);
	public static final OperationModeSettingValue ToasterMode = new OperationModeSettingValue(TOASTER_MODE);
	public static final OperationModeSettingValue FermentingMode = new OperationModeSettingValue(FERMENTING_MODE);
	public static final OperationModeSettingValue StewingMode = new OperationModeSettingValue(STEWING_MODE);
	public static final OperationModeSettingValue SteamingMode = new OperationModeSettingValue(STEAMING_MODE);
	public static final OperationModeSettingValue TwoStageMicrowaveHeatingMode = new OperationModeSettingValue(TWO_STAGE_MICROWAVE_HEATING);
	public static final OperationModeSettingValue ConvectionMode = new OperationModeSettingValue(CONVECTION_MODE);
	public static final OperationModeSettingValue HybridMode = new OperationModeSettingValue(HYBRID_MODE);
	public static final OperationModeSettingValue PowerControlMode = new OperationModeSettingValue(POWER_CONTROL_MODE);
	public static final OperationModeSettingValue DeepFryingMode = new OperationModeSettingValue(DEEP_FRYING_MODE);
	public static final OperationModeSettingValue WaterHeatingMode = new OperationModeSettingValue(WATER_HEATING_MODE);
	public static final OperationModeSettingValue RiceBoilingMode = new OperationModeSettingValue(RICE_BOILING_MODE);
	public static final OperationModeSettingValue StirFryingMode = new OperationModeSettingValue(STIR_FRYING_MODE);
	public static final OperationModeSettingValue WashingMode = new OperationModeSettingValue(WASHING_MODE);
	public static final OperationModeSettingValue RinsingMode = new OperationModeSettingValue(RINSING_MODE);
	public static final OperationModeSettingValue SpinDryingMode = new OperationModeSettingValue(SPIN_DRYING_MODE);
	public static final OperationModeSettingValue SuspendedMode = new OperationModeSettingValue(SUSPENDED_MODE);
	public static final OperationModeSettingValue WorkingCycleStoppedCompletedMode = new OperationModeSettingValue(WORKING_CYCLE_STOPPED_COMPLETED);
	public static final OperationModeSettingValue NonCoolingMode = new OperationModeSettingValue(NON_COOLING_MODE);
	public static final OperationModeSettingValue ContinousMode = new OperationModeSettingValue(CONTINOUS_MODE);
	public static final OperationModeSettingValue IntermitentMode = new OperationModeSettingValue(INTERMITTENT_MODE);

	



	private OperationModeSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static OperationModeSettingValue getOperationModeSettingValueByOrder(int order) {
		switch (order) {
		case NORMAL_OPERATION:
			return NormalMode;
		case HIGH_SPEED_OPERATION:
			return HighSpeedMode;
		case SILENT_OPERATION:
			return SilentMode;
		case STANDARD_MODE:
			return StandardMode;
		case EXTRA_MODE:
			return ExtraMode;
		case AUTOMATIC_DIRECTION_CONTROL_MODE:
			return AutomaticAirFlowDirectionControlMode;
		case NON_AUTOMATIC_DIRECTION_CONTROL_MODE:
			return NonAutomaticAirFlowDirectionControlMode;
		case AUTOMATIC_VERTICAL_DIRECTION_CONTROL_MODE:
			return AutomaticAirFlowVerticalDirectionMode;
		case AUTOMATIC_HORIZONTAL_DIRECTION_CONTROL_MODE:
			return AutomaticAirFlowHorizontalDirectionMode;
		case AUTOMATIC_MODE:
			return AutomaticMode;
		case COOLING_MODE:
			return CoolingMode;
		case HEATING_MODE:
			return HeatingMode;
		case DEHUMIDIFICATION_MODE:
			return DehumidificationMode;
		case CIRCULATOR_MODE:
			return CiculatorMode;
		case OTHER:
			return Other;
		case THROAT_DRY_PREVENTION_MODE:
			return ThroatDryPreventionMode;
		case QUIET_OPERATION_MODE:
			return QuietOperationMode;
		case SAVING_MODE:
			return PowerSavingMode;
		case ROOM_HEATING_ON_MODE:
			return RoomHeatingOnMode;
		case ROOM_HEATING_OFF_MODE:
			return RoomHeatingOffMode;
		case TIMER_MODE:
			return TimerMode;
		case NO_SETTING:
			return NoSetting;
		case OVER_COOL_PREVENTION_MODE:
			return OverCoolPreventionMode;
		case VENTILATION_MODE:
			return VentilationMode;
		case PRE_WARM_MODE:
			return PreWarmMode;
		case DRYER_MODE:
			return DryerMode;
		case STOP:
			return Stop;
		case MODEST_OPERATION_MODE:
			return ModestOperationMode;
		case HIGH_POWER_OPERATION_MODE:
			return HighPowerOperationMode;
		case RAPID_CHARGING_MODE:
			return RapidCharginMode;
		case CHARGING_MODE:
			return ChargingMode;
		case DISCHARGING_MODE:
			return DischargingMode;
		case STANDBY_MODE:
			return StandbyMode;
		case TEST_MODE:
			return TestMode;
		case RESTART_MODE:
			return RestartMode;
		case RECALCULATION_MODE:
			return RecalculationMode;
		case MAIN_LIGHTING_MODE:
			return MainLightingMode;
		case NIGHT_LIGHTING_MODE:
			return NightLightingMode;
		case COLOR_LIGHTING_MODE:
			return ColorLightingMode;
		case CITRIC_ACID_CLEANING_MODE:
			return CitricAcidCleaningMode;
		case QUICK_MODE:
			return QuickMode;
		case MICROWAVE_HEATING_MODE:
			return MicrowaveHeatingMode;
		case DEFROSTING_MODE:
			return DefrostingMode;
		case OVEN_MODE:
			return OvenMode;
		case GRILL_MODE:
			return GrillMode;
		case TOASTER_MODE:
			return ToasterMode;
		case FERMENTING_MODE:
			return FermentingMode;
		case STEWING_MODE:
			return StewingMode;
		case STEAMING_MODE:
			return SteamingMode;
		case TWO_STAGE_MICROWAVE_HEATING:
			return TwoStageMicrowaveHeatingMode;
		case CONVECTION_MODE:
			return ConvectionMode;
		case HYBRID_MODE:
			return HybridMode;
		case POWER_CONTROL_MODE:
			return PowerControlMode;
		case DEEP_FRYING_MODE:
			return DeepFryingMode;
		case WATER_HEATING_MODE:
			return WaterHeatingMode;
		case RICE_BOILING_MODE:
			return RiceBoilingMode;
		case STIR_FRYING_MODE:
			return StirFryingMode;
		case WASHING_MODE:
			return WashingMode;
		case RINSING_MODE:
			return RinsingMode;
		case SPIN_DRYING_MODE:
			return SpinDryingMode;
		case SUSPENDED_MODE:
			return SuspendedMode;
		case WORKING_CYCLE_STOPPED_COMPLETED:
			return WorkingCycleStoppedCompletedMode;
		case NON_COOLING_MODE:
			return NonCoolingMode;	
		case CONTINOUS_MODE:
			return ContinousMode;
		case INTERMITTENT_MODE:
			return IntermitentMode;	
		default:
			return null;
		}
	}

	public static final OperationModeSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NORMAL_OPERATION; i <= INTERMITTENT_MODE; i++)
			if (names[i].equals(name))
				return getOperationModeSettingValueByOrder(i);
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
