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
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.airconditionerRelatedDevices.AirCleaner;
import org.universAAL.ontology.echonetontology.airconditionerRelatedDevices.AirConditionerVentilationFan;
import org.universAAL.ontology.echonetontology.airconditionerRelatedDevices.ElectricHeater;
import org.universAAL.ontology.echonetontology.airconditionerRelatedDevices.ElectricStorageHeater;
import org.universAAL.ontology.echonetontology.airconditionerRelatedDevices.FanHeater;
import org.universAAL.ontology.echonetontology.airconditionerRelatedDevices.HomeAirConditioner;
import org.universAAL.ontology.echonetontology.airconditionerRelatedDevices.Humidifier;
import org.universAAL.ontology.echonetontology.airconditionerRelatedDevices.PackageTypeCommercialAirConditionerIndoorUnit;
import org.universAAL.ontology.echonetontology.airconditionerRelatedDevices.PackageTypeCommercialAirConditionerOutdoorUnit;
import org.universAAL.ontology.echonetontology.airconditionerRelatedDevices.VentilationFan;
import org.universAAL.ontology.echonetontology.audiovisualRelatedDevices.Audio;
import org.universAAL.ontology.echonetontology.audiovisualRelatedDevices.Display;
import org.universAAL.ontology.echonetontology.audiovisualRelatedDevices.NetworkCamera;
import org.universAAL.ontology.echonetontology.audiovisualRelatedDevices.Television;
import org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices.ClothesDryer;
import org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices.CombinationMicrowaveOven;
import org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices.CommercialShowcase;
import org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices.CommercialShowcaseOutdoorUnit;
import org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices.CookingHeater;
import org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices.ElectricHotWaterPot;
import org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices.Refrigerator;
import org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices.RiceCooker;
import org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices.WasherDryer;
import org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices.WashingMachine;
import org.universAAL.ontology.echonetontology.healthRelatedDevices.WeighingMachine;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.BathRoomHeaterDryer;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.Buzzer;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.ColdHotWaterHeatSourceEquipment;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.ElectricBlind;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.ElectricGate;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.ElectricLock;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.ElectricRainSlidingShutter;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.ElectricShutter;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.ElectricSlidingDoor;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.ElectricToiletSeat;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.ElectricVehicleChargerDischager;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.ElectricWindow;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.EngineCogeneration;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.ExtendedLightingSystem;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.FloorHeater;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.FuelCell;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.GardenSprinkler;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.GasMeter;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.GeneralLighting;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.HighVoltageSmartElectricEnergy;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.HouseHoldSmallWindTurbinePowerGeneration;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.HouseHoldSolarPowerGeneration;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.InstantaneousWaterHeater;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.KeroseneMeter;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.LPGasMeter;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.LightingSystem;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.LowVoltageSmartElectricEnergy;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.MonoFunctionLighting;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.PowerDistributionBoardMetering;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.SmartGasMeter;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.SmartKeroseneMeter;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.StorageBattery;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.VehicleCharger;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.WaterFlowMeter;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.WaterHeater;
import org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices.WattHourMeter;
import org.universAAL.ontology.echonetontology.managementOperationRelatedDevices.Controller;
import org.universAAL.ontology.echonetontology.managementOperationRelatedDevices.DREventController;
import org.universAAL.ontology.echonetontology.managementOperationRelatedDevices.ParallelProcessingCombinationTypePowerControl;
import org.universAAL.ontology.echonetontology.managementOperationRelatedDevices.Switch;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.ActivityMountSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.AirPollutionSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.AirPressureSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.AirSpeedSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.BathHeatingStatusSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.BathWaterLevelSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.BedPresenceSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.CO2Sensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.CallSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.CondensationSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.CrimePreventionSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.CurrentValueSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.EarthquakeSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.ElectricEnergySensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.ElectricLeakSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.EmergencyButton;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.FireSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.FirstAidSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.FlameSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.GasLeakSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.GasSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.HumanBodyLocationSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.HumanDetectionSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.HumiditySensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.IlluminanceSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.MailingSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.MicromotionSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.OdorSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.OpenCloseSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.OxygenSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.PassageSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.PressureSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.RainSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.SmokeSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.SnowSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.SoundSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.TemperatureSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.VOCSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.VisitorSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.WaterFlowRateSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.WaterLeakSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.WaterLevelSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.WaterOverflowSensor;
import org.universAAL.ontology.echonetontology.sensorRelatedDevices.WeightSensor;

/**
 * @author Pham Van Cu
 */
public class EchonetFactory implements ResourceFactory {
	// private static final int NAMESPACE_LENGTH = LIGHTING_NAMESPACE.length();
	// private static final String PROP_ORIG_INDIVIDUAL = LIGHTING_NAMESPACE
	// + LightingFactory.class.hashCode();
	
	public static final int ACTIVITY_AMOUNT_SENSOR = 0;
	public static final int AIR_POLLUTION_SENSOR = 1;
	public static final int AIR_PRESSURE_SENSOR = 2;
	public static final int BATH_HEATING_STATUS_SENSOR = 3;
	public static final int BATH_WATER_LEVEL_SENSOR = 4;
	public static final int BED_PRESENCE_SENSOR = 5;
	public static final int CALL_SENSOR = 6;
	public static final int CO2_SENSOR = 7;
	public static final int CONDENSATION_SENSOR = 8;
	public static final int CRIME_PREVENTION_SENSOR = 9;
	public static final int CURRENT_VALUE_SENSOR = 10;
	public static final int EARTHQUAKE_SENSOR = 11;
	public static final int ELECTRIC_ENERGY_SENSOR = 12;
	public static final int ELECTRIC_LEAK_SENSOR = 13;
	public static final int EMERGENCY_BUTTON = 14;
	public static final int FIRE_SENSOR = 15;
	public static final int FIRST_AID_SENSOR = 16;
	public static final int FLAME_SENSOR = 17;
	public static final int GAS_LEAK_SENSOR = 18;
	public static final int GAS_SENSOR = 19;
	public static final int HUMAN_BODY_LOCATION_SENSOR = 20;
	public static final int HUMAN_DETECTION_SENSOR = 21;
	public static final int HUMIDITY_SENSOR = 22;
	public static final int ILLUMINANCE_SENSOR = 23;
	public static final int MAILING_SENSOR = 24;
	public static final int MICROMOTION_SENSOR = 25;
	public static final int ODOR_SENSOR = 26;
	public static final int OPEN_CLOSE_SENSOR = 27;
	public static final int OXYGEN_SENSOR = 28;
	public static final int PASSAGE_SENSOR = 29;
	public static final int PRESSURE_SENSOR = 30;
	public static final int RAIN_SENSOR = 31;
	public static final int SMOKE_SENSOR = 32;
	public static final int SOUND_SENSOR = 33;
	public static final int TEMPERATURE_SENSOR = 34;
	public static final int VISITOR_SENSOR = 35;
	public static final int VOC_SENSOR = 36;
	public static final int WATER_FLOW_RATE_SENSOR = 37;
	public static final int WATER_LEAK_SENSOR = 38;
	public static final int WATER_LEVEL_SENSOR = 39;
	public static final int WATER_OVER_FLOW_SENSOR = 40;
	public static final int WEIGHT_SENSOR = 41;
	public static final int AIR_SPEED_SENSOR = 42;
	public static final int SNOW_SENSOR = 43;
	public static final int AIR_CLEANER = 44;
	public static final int AIR_CONDITIONER_VENTILATION_FAN = 45;
	public static final int ELECTRIC_HEATER = 46;
	public static final int ELECTRIC_STORAGE_HEATER = 47;
	public static final int FAN_HEATER = 48;
	public static final int HOME_AIR_CONDITIONER = 49;
	public static final int HUMIDIFIER = 50;
	public static final int PACKAGE_TYPE_COMMERCIAL_AIR_CONDITIONER_INDOOR_UNIT = 51;
	public static final int PACKAGE_TYPE_COMMERCIAL_AIR_CONDITIONER_OUTDOOR_UNIT = 52;
	public static final int VENTILATION_FAN = 53;
	public static final int BATH_ROOM_HEATER_DRYER = 54;
	public static final int BUZZER = 55;
	public static final int COLD_HOT_WATER_HEAT_SOURCE_EQUIPMENT = 56;
	public static final int ELECTRIC_BLIND = 57;
	public static final int ELECTRIC_GATE = 58;
	public static final int ELECTRIC_LOCK = 59;
	public static final int ELECTRIC_RAIN_SLIDING_SHUTTER = 60;
	public static final int ELECTRIC_SHUTTER = 61;
	public static final int ELECTRIC_SLIDING_DOOR = 62;
	public static final int ELECTRIC_TOILET_SEAT = 63;
	public static final int ELECTRIC_VEHICLE_CHARGER_DISCHAGER = 64;
	public static final int ELECTRIC_WINDOW = 65;
	public static final int ENGINE_COGENERATION = 66;
	public static final int FLOOR_HEATER = 67;
	public static final int FUEL_CELL = 68;
	public static final int GARDEN_SPRINKLER = 69;
	public static final int GAS_METER = 70;
	public static final int GENERAL_LIGHTING = 71;
	public static final int HIGH_VOLTAGE_SMART_ELECTRIC_ENERGY = 72;
	public static final int HOUSE_HOLD_SMALL_WIND_TURBINE_POWER_GENERATION = 73;
	public static final int HOUSE_HOLD_SOLAR_POWER_GENERATION = 74;
	public static final int INSTANTANEOUS_WATER_HEATER = 75;
	public static final int KEROSENE_METER = 76;
	public static final int LIGHTING_SYSTEM = 77;
	public static final int LOW_VOLTAGE_SMART_ELECTRIC_ENERGY = 78;
	public static final int LP_GAS_METER = 79;
	public static final int MONO_FUNCTION_LIGHTING = 80;
	public static final int POWER_DISTRIBUTION_BOARD_METERING = 81;
	public static final int SMART_GAS_METER = 82;
	public static final int SMART_KEROSENE_METER = 83;
	public static final int STORAGE_BATTERY = 84;
	public static final int VEHICLE_CHARGER = 85;
	public static final int WATER_FLOW_METER = 86;
	public static final int WATER_HEATER = 87;
	public static final int WATT_HOUR_METER = 88;
	public static final int CLOTHES_DRYER = 89;
	public static final int COMBINATION_MICROWAVE_OVEN = 90;
	public static final int COMMERCIAL_SHOWCASE = 91;
	public static final int COMMERCIAL_SHOWCASE_OUTDOOR_UNIT = 92;
	public static final int COOKING_HEATER = 93;
	public static final int ELECTRIC_HOT_WATER_POT = 94;
	public static final int REFRIGERATOR = 95;
	public static final int RICE_COOKER = 96;
	public static final int WASHER_DRYER = 97;
	public static final int WASHING_MACHINE = 98;
	public static final int WEIGHING_MACHINE = 99;
	public static final int CONTROLLER = 100;
	public static final int PARALLEL_PROCESSING_COMBINATION_TYPE_POWER_CONTROL = 101;
	public static final int SWITCH = 102;
	public static final int AUDIO = 103;
	public static final int DISPLAY = 104;
	public static final int NETWORK_CAMERA = 105;
	public static final int TELEVISION = 106;
	public static final int EXTENDED_LIGHTING_SYSTEM = 107;
	public static final int ECHONET_SUPER_DEVICE = 108;
	public static final int DR_CONTROLLER = 109;
	

	
	public EchonetFactory() {
	}

	public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

		switch (factoryIndex) {
			case ECHONET_SUPER_DEVICE:
				return new EchonetSuperDevice(instanceURI);
		//Sensor device
			case ACTIVITY_AMOUNT_SENSOR:
				return new ActivityMountSensor(instanceURI);
			case AIR_POLLUTION_SENSOR:
				return new AirPollutionSensor(instanceURI);
			case AIR_PRESSURE_SENSOR:
				return new AirPressureSensor(instanceURI);
			case AIR_SPEED_SENSOR:
				return new AirSpeedSensor(instanceURI);
			case BATH_HEATING_STATUS_SENSOR:
				return new BathHeatingStatusSensor(instanceURI);
			case BATH_WATER_LEVEL_SENSOR:
				return new BathWaterLevelSensor(instanceURI);
			case BED_PRESENCE_SENSOR:
				return new BedPresenceSensor(instanceURI);
			case CALL_SENSOR:
				return new CallSensor(instanceURI);
			case CO2_SENSOR:
				return new CO2Sensor(instanceURI);
			case CONDENSATION_SENSOR:
				return new CondensationSensor(instanceURI);
			case CRIME_PREVENTION_SENSOR:
				return new CrimePreventionSensor(instanceURI);
			case CURRENT_VALUE_SENSOR:
				return new CurrentValueSensor(instanceURI);
			case EARTHQUAKE_SENSOR:
				return new EarthquakeSensor(instanceURI);
			case ELECTRIC_ENERGY_SENSOR:
				return new ElectricEnergySensor(instanceURI);		
			case ELECTRIC_LEAK_SENSOR:
				return new ElectricLeakSensor(instanceURI);
			case EMERGENCY_BUTTON:
				return new EmergencyButton(instanceURI);
			case FIRE_SENSOR:
				return new FireSensor(instanceURI);
			case FIRST_AID_SENSOR:
				return new FirstAidSensor(instanceURI);
			case FLAME_SENSOR:
				return new FlameSensor(instanceURI);
			case GAS_LEAK_SENSOR:
				return new GasLeakSensor(instanceURI);
			case GAS_SENSOR:
				return new GasSensor(instanceURI);
			case HUMAN_BODY_LOCATION_SENSOR:
				return new HumanBodyLocationSensor(instanceURI);
			case HUMAN_DETECTION_SENSOR:
				return new HumanDetectionSensor(instanceURI);
			case HUMIDITY_SENSOR:
				return new HumiditySensor(instanceURI);
			case ILLUMINANCE_SENSOR:
				return new IlluminanceSensor(instanceURI);
			case MAILING_SENSOR:
				return new MailingSensor(instanceURI);
			case MICROMOTION_SENSOR:
				return new MicromotionSensor(instanceURI);
			case ODOR_SENSOR:
				return new OdorSensor(instanceURI);
			case OPEN_CLOSE_SENSOR:
				return new OpenCloseSensor(instanceURI);
			case OXYGEN_SENSOR:
				return new OxygenSensor(instanceURI);
			case PASSAGE_SENSOR:
				return new PassageSensor(instanceURI);
			case PRESSURE_SENSOR:
				return new PressureSensor(instanceURI);	
			case RAIN_SENSOR:
				return new RainSensor(instanceURI);
			case SMOKE_SENSOR:
				return new SmokeSensor(instanceURI);
			case SOUND_SENSOR:
				return new SoundSensor(instanceURI);
			case TEMPERATURE_SENSOR:
				return new TemperatureSensor(instanceURI);
			case VISITOR_SENSOR:
				return new VisitorSensor(instanceURI);
			case VOC_SENSOR:
				return new VOCSensor(instanceURI);
			case WATER_FLOW_RATE_SENSOR:
				return new WaterFlowRateSensor(instanceURI);
			case WATER_LEAK_SENSOR:
				return new WaterLeakSensor(instanceURI);
			case WATER_LEVEL_SENSOR:
				return new WaterLevelSensor(instanceURI);
			case WATER_OVER_FLOW_SENSOR:
				return new WaterOverflowSensor(instanceURI);
			case WEIGHT_SENSOR:
				return new WeightSensor(instanceURI);
			case SNOW_SENSOR:
				return new SnowSensor(instanceURI);			
		//Airconditioner Related Devices
			case AIR_CLEANER:
				return new AirCleaner(instanceURI);
			case AIR_CONDITIONER_VENTILATION_FAN:
				return new AirConditionerVentilationFan(instanceURI);
			case ELECTRIC_HEATER:
				return new ElectricHeater(instanceURI);
			case ELECTRIC_STORAGE_HEATER:
				return new ElectricStorageHeater(instanceURI);
			case FAN_HEATER:
				return new FanHeater(instanceURI);
			case HOME_AIR_CONDITIONER:
				return new HomeAirConditioner(instanceURI);
			case HUMIDIFIER:
				return new Humidifier(instanceURI);
			case PACKAGE_TYPE_COMMERCIAL_AIR_CONDITIONER_INDOOR_UNIT:
				return new PackageTypeCommercialAirConditionerIndoorUnit(instanceURI);
			case PACKAGE_TYPE_COMMERCIAL_AIR_CONDITIONER_OUTDOOR_UNIT:
				return new PackageTypeCommercialAirConditionerOutdoorUnit(instanceURI);
			case VENTILATION_FAN:
				return new VentilationFan(instanceURI);
				//Housing facilities Related devices	
			case BATH_ROOM_HEATER_DRYER:
				return new BathRoomHeaterDryer(instanceURI);
			case BUZZER:
				return new Buzzer(instanceURI);
			case COLD_HOT_WATER_HEAT_SOURCE_EQUIPMENT:
				return new ColdHotWaterHeatSourceEquipment(instanceURI);
			case ELECTRIC_BLIND:
				return new ElectricBlind(instanceURI);
			case ELECTRIC_GATE:
				return new ElectricGate(instanceURI);
			case ELECTRIC_LOCK:
				return new ElectricLock(instanceURI);
			case ELECTRIC_RAIN_SLIDING_SHUTTER:
				return new ElectricRainSlidingShutter(instanceURI);
			case ELECTRIC_SHUTTER:
				return new ElectricShutter(instanceURI);
			case ELECTRIC_SLIDING_DOOR:
				return new ElectricSlidingDoor(instanceURI);
			case ELECTRIC_TOILET_SEAT:
				return new ElectricToiletSeat(instanceURI);
			case ELECTRIC_VEHICLE_CHARGER_DISCHAGER:
				return new ElectricVehicleChargerDischager(instanceURI);
			case ELECTRIC_WINDOW:
				return new ElectricWindow(instanceURI);
			case ENGINE_COGENERATION:
				return new EngineCogeneration(instanceURI);
			case FLOOR_HEATER:
				return new FloorHeater(instanceURI);
			case FUEL_CELL:
				return new FuelCell(instanceURI);
			case GARDEN_SPRINKLER:
				return new GardenSprinkler(instanceURI);
			case GAS_METER:
				return new GasMeter(instanceURI);
			case GENERAL_LIGHTING:
				return new GeneralLighting(instanceURI);
			case HIGH_VOLTAGE_SMART_ELECTRIC_ENERGY:
				return new HighVoltageSmartElectricEnergy(instanceURI);
			case HOUSE_HOLD_SMALL_WIND_TURBINE_POWER_GENERATION:
				return new HouseHoldSmallWindTurbinePowerGeneration(instanceURI);
			case HOUSE_HOLD_SOLAR_POWER_GENERATION:
				return new HouseHoldSolarPowerGeneration(instanceURI);
			case INSTANTANEOUS_WATER_HEATER:
				return new InstantaneousWaterHeater(instanceURI);
			case KEROSENE_METER:
				return new KeroseneMeter(instanceURI);
			case LIGHTING_SYSTEM:
				return new LightingSystem(instanceURI);
			case EXTENDED_LIGHTING_SYSTEM:
				return new ExtendedLightingSystem(instanceURI);
			case LOW_VOLTAGE_SMART_ELECTRIC_ENERGY:
				return new LowVoltageSmartElectricEnergy(instanceURI);
			case LP_GAS_METER:
				return new LPGasMeter(instanceURI);
			case MONO_FUNCTION_LIGHTING: 
				return new MonoFunctionLighting(instanceURI);
			case POWER_DISTRIBUTION_BOARD_METERING:
				return new PowerDistributionBoardMetering(instanceURI);
			case SMART_GAS_METER:
				return new SmartGasMeter(instanceURI);
			case SMART_KEROSENE_METER:
				return new SmartKeroseneMeter(instanceURI);
			case STORAGE_BATTERY:
				return new StorageBattery(instanceURI);
			case VEHICLE_CHARGER:
				return new VehicleCharger(instanceURI);
			case WATER_FLOW_METER:
				return new WaterFlowMeter(instanceURI);
			case WATER_HEATER:
				return new WaterHeater(instanceURI);
			case WATT_HOUR_METER:
				return new WattHourMeter(instanceURI);
			//Cooking Household Related Devices	
			case CLOTHES_DRYER:
				return new ClothesDryer(instanceURI);
			case COMBINATION_MICROWAVE_OVEN: 
				return new CombinationMicrowaveOven(instanceURI);
			case COMMERCIAL_SHOWCASE:
				return new CommercialShowcase(instanceURI);
			case COMMERCIAL_SHOWCASE_OUTDOOR_UNIT:
				return new CommercialShowcaseOutdoorUnit(instanceURI);
			case COOKING_HEATER:
				return new CookingHeater(instanceURI);
			case ELECTRIC_HOT_WATER_POT:
				return new ElectricHotWaterPot(instanceURI);
			case REFRIGERATOR:
				return new Refrigerator(instanceURI);
			case RICE_COOKER:
				return new RiceCooker(instanceURI);
			case WASHER_DRYER:
				return new WasherDryer(instanceURI);
			case WASHING_MACHINE:
				return new WashingMachine(instanceURI);
			//Health Related Devices	
			case WEIGHING_MACHINE:
				return new WeighingMachine(instanceURI);
			//Management Operation Related Devices
			case CONTROLLER:
				return new Controller(instanceURI);
			case PARALLEL_PROCESSING_COMBINATION_TYPE_POWER_CONTROL:
				return new ParallelProcessingCombinationTypePowerControl(instanceURI);
			case SWITCH:
				return new Switch(instanceURI);
			// Audiovisual Related Devices
			case AUDIO:
				return new Audio(instanceURI);
			case DISPLAY:
				return new Display(instanceURI);
			case NETWORK_CAMERA:
				return new NetworkCamera(instanceURI);
			case TELEVISION:
				return new Television(instanceURI);
			case DR_CONTROLLER:
				return new DREventController(instanceURI);
		}

		return null;
	}
}
