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
package org.universAAL.ontology.echonetontology;


import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.EchonetFactory;
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
import org.universAAL.ontology.echonetontology.values.AirFlowDirectionSettingValue;
import org.universAAL.ontology.echonetontology.values.AlarmStatusValue;
import org.universAAL.ontology.echonetontology.values.AutomaticHeatingMenu;
import org.universAAL.ontology.echonetontology.values.CharacterCodes;
import org.universAAL.ontology.echonetontology.values.ChargerDischargerTypeValue;
import org.universAAL.ontology.echonetontology.values.ColorValue;
import org.universAAL.ontology.echonetontology.values.DetectionDirectionValue;
import org.universAAL.ontology.echonetontology.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonetontology.values.FaultDesciptionValue;
import org.universAAL.ontology.echonetontology.values.HumidifyingLevelValue;
import org.universAAL.ontology.echonetontology.values.IdentificationNumberValue;
import org.universAAL.ontology.echonetontology.values.InputSourceSettingValue;
import org.universAAL.ontology.echonetontology.values.InstallationLocationValue;
import org.universAAL.ontology.echonetontology.values.IntervalSettingValue;
import org.universAAL.ontology.echonetontology.values.IonEmissionMethodValue;
import org.universAAL.ontology.echonetontology.values.LiquidAmountLevelValue;
import org.universAAL.ontology.echonetontology.values.MeasurementMethodValue;
import org.universAAL.ontology.echonetontology.values.NumberOfSprinkleSettingValue;
import org.universAAL.ontology.echonetontology.values.OccurenceStatusValue;
import org.universAAL.ontology.echonetontology.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStateSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.PowerConsumptionRange;
import org.universAAL.ontology.echonetontology.values.RadiationMethodValue;
import org.universAAL.ontology.echonetontology.values.RemoteControlSettingValue;
import org.universAAL.ontology.echonetontology.values.SelectiveOpeningOperationSettingValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;
import org.universAAL.ontology.echonetontology.values.TransferingMethods;
import org.universAAL.ontology.echonetontology.values.TypeClassificationValue;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;

/**
 *
 * @author PHAM Van Cu
 *
 */
public final class EchonetOntology extends Ontology {

	private static EchonetFactory factory = new EchonetFactory();;

	public static final String NAMESPACE = "http://ontology.universAAL.org/Echonet.owl#";

	public EchonetOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("The collection of ECHONET Ontology");
		r.setResourceLabel("Echonet");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ServiceBusOntology.NAMESPACE);
		addImport(PhThingOntology.NAMESPACE);
		// ******* Declaration of enumeration classes of the ontology ******* //
		OntClassInfoSetup oci_EchonetDeviceGroupCodeValue = createNewAbstractOntClassInfo(EchonetDeviceGroupCodeValue.MY_URI);
		OntClassInfoSetup oci_OperationStatusValue = createNewAbstractOntClassInfo(OperationStatusValue.MY_URI);
		OntClassInfoSetup oci_InstallationLocationValue = createNewAbstractOntClassInfo(InstallationLocationValue.MY_URI);
		OntClassInfoSetup oci_IdentificationNumberValue = createNewAbstractOntClassInfo(IdentificationNumberValue.MY_URI);	
		OntClassInfoSetup oci_OccurenceStatusValue = createNewAbstractOntClassInfo(OccurenceStatusValue.MY_URI);
		OntClassInfoSetup oci_FaultDesciptionValue = createNewAbstractOntClassInfo(FaultDesciptionValue.MY_URI);
		OntClassInfoSetup oci_OperationModeSettingValue = createNewAbstractOntClassInfo(OperationModeSettingValue.MY_URI);
		OntClassInfoSetup oci_RemoteControlSettingValue = createNewAbstractOntClassInfo(RemoteControlSettingValue.MY_URI);
		OntClassInfoSetup oci_ThresholdLevelValue = createNewAbstractOntClassInfo(ThresholdLevelValue.MY_URI);
		OntClassInfoSetup oci_DetectionDirectionValue = createNewAbstractOntClassInfo(DetectionDirectionValue.MY_URI);
		OntClassInfoSetup oci_OperationStateSettingValue = createNewAbstractOntClassInfo(OperationStateSettingValue.MY_URI);
		OntClassInfoSetup oci_OperationFuntionSettingValue = createNewAbstractOntClassInfo(OperationFunctionSettingValue.MY_URI);
		OntClassInfoSetup oci_AirFlowDirectionSettingValue = createNewAbstractOntClassInfo(AirFlowDirectionSettingValue.MY_URI);
		OntClassInfoSetup oci_IonEmissionMethodValue = createNewAbstractOntClassInfo(IonEmissionMethodValue.MY_URI);
		OntClassInfoSetup oci_LiquidAmountLevelValue = createNewAbstractOntClassInfo(LiquidAmountLevelValue.MY_URI);
		OntClassInfoSetup oci_RadiationMethodValue = createNewAbstractOntClassInfo(RadiationMethodValue.MY_URI);
		OntClassInfoSetup oci_PowerConsumptionRange = createNewAbstractOntClassInfo(PowerConsumptionRange.MY_URI);
		OntClassInfoSetup oci_SelectiveOpeningOperationSettingValue = createNewAbstractOntClassInfo(SelectiveOpeningOperationSettingValue.MY_URI);
		OntClassInfoSetup oci_IntervalSettingValue = createNewAbstractOntClassInfo(IntervalSettingValue.MY_URI);
		OntClassInfoSetup oci_NumberOfSprinkleSettingValue = createNewAbstractOntClassInfo(NumberOfSprinkleSettingValue.MY_URI);
		OntClassInfoSetup oci_AlarmStatusValue = createNewAbstractOntClassInfo(AlarmStatusValue.MY_URI);
		OntClassInfoSetup oci_MeasurementMethodValue = createNewAbstractOntClassInfo(MeasurementMethodValue.MY_URI);
		OntClassInfoSetup oci_ChargerDischargerTypeValue = createNewAbstractOntClassInfo(ChargerDischargerTypeValue.MY_URI);
		OntClassInfoSetup oci_TypeClassificationValue = createNewAbstractOntClassInfo(TypeClassificationValue.MY_URI);
		OntClassInfoSetup oci_ColorValue = createNewAbstractOntClassInfo(ColorValue.MY_URI);
		OntClassInfoSetup oci_AutomaticHeatingMenu = createNewAbstractOntClassInfo(AutomaticHeatingMenu.MY_URI);
		OntClassInfoSetup oci_CharacterCodes = createNewAbstractOntClassInfo(CharacterCodes.MY_URI);
		OntClassInfoSetup oci_InputSourceSettingValue = createNewAbstractOntClassInfo(InputSourceSettingValue.MY_URI);
		OntClassInfoSetup oci_TransferingMethods = createNewAbstractOntClassInfo(TransferingMethods.MY_URI);
		OntClassInfoSetup oci_HumidifyingLevelValue = createNewAbstractOntClassInfo(HumidifyingLevelValue.MY_URI);
		
		
		// ******* Declaration of regular classes of the ECHONET ontology ******* //
		OntClassInfoSetup oci_EchonetSuperDevice = createNewOntClassInfo(EchonetSuperDevice.MY_URI,factory, EchonetFactory.ECHONET_SUPER_DEVICE);
		OntClassInfoSetup oci_ActivityMountSensor = createNewOntClassInfo(ActivityMountSensor.MY_URI,factory, EchonetFactory.ACTIVITY_AMOUNT_SENSOR);
		OntClassInfoSetup oci_AirPollutionSensor = createNewOntClassInfo(AirPollutionSensor.MY_URI,factory, EchonetFactory.AIR_POLLUTION_SENSOR);
		OntClassInfoSetup oci_AirPressureSensor = createNewOntClassInfo(AirPressureSensor.MY_URI,factory, EchonetFactory.AIR_PRESSURE_SENSOR);
		OntClassInfoSetup oci_AirSpeedSensor = createNewOntClassInfo(AirSpeedSensor.MY_URI,factory, EchonetFactory.AIR_SPEED_SENSOR);
		OntClassInfoSetup oci_BathHeatingStatusSensor = createNewOntClassInfo(BathHeatingStatusSensor.MY_URI,factory, EchonetFactory.BATH_HEATING_STATUS_SENSOR);
		OntClassInfoSetup oci_BathWaterLevelSensor = createNewOntClassInfo(BathWaterLevelSensor.MY_URI,factory, EchonetFactory.BATH_WATER_LEVEL_SENSOR);
		OntClassInfoSetup oci_BedPresenceSensor = createNewOntClassInfo(BedPresenceSensor.MY_URI,factory, EchonetFactory.BED_PRESENCE_SENSOR);
		OntClassInfoSetup oci_CallSensor = createNewOntClassInfo(CallSensor.MY_URI,factory, EchonetFactory.CALL_SENSOR);
		OntClassInfoSetup oci_CO2Sensor = createNewOntClassInfo(CO2Sensor.MY_URI,factory, EchonetFactory.CO2_SENSOR);
		OntClassInfoSetup oci_CondensationSensor = createNewOntClassInfo(CondensationSensor.MY_URI,factory, EchonetFactory.CONDENSATION_SENSOR);
		OntClassInfoSetup oci_CrimePreventionSensor = createNewOntClassInfo(CrimePreventionSensor.MY_URI,factory, EchonetFactory.CRIME_PREVENTION_SENSOR);
		OntClassInfoSetup oci_CurrentValueSensor = createNewOntClassInfo(CurrentValueSensor.MY_URI,factory, EchonetFactory.CURRENT_VALUE_SENSOR);
		OntClassInfoSetup oci_EarthquakeSensor = createNewOntClassInfo(EarthquakeSensor.MY_URI,factory, EchonetFactory.EARTHQUAKE_SENSOR);
		OntClassInfoSetup oci_ElectricEnergySensor = createNewOntClassInfo(ElectricEnergySensor.MY_URI,factory, EchonetFactory.ELECTRIC_ENERGY_SENSOR);
		OntClassInfoSetup oci_ElectricLeakSensor = createNewOntClassInfo(ElectricLeakSensor.MY_URI,factory, EchonetFactory.ELECTRIC_LEAK_SENSOR);
		OntClassInfoSetup oci_EmergencyButton = createNewOntClassInfo(EmergencyButton.MY_URI,factory, EchonetFactory.EMERGENCY_BUTTON);
		OntClassInfoSetup oci_FireSensor = createNewOntClassInfo(FireSensor.MY_URI,factory, EchonetFactory.FIRE_SENSOR);	
		OntClassInfoSetup oci_FirstAidSensor = createNewOntClassInfo(FirstAidSensor.MY_URI,factory, EchonetFactory.FIRST_AID_SENSOR);
		OntClassInfoSetup oci_FlameSensor = createNewOntClassInfo(FlameSensor.MY_URI,factory, EchonetFactory.FLAME_SENSOR);
		OntClassInfoSetup oci_GasLeakSensor = createNewOntClassInfo(GasLeakSensor.MY_URI,factory, EchonetFactory.GAS_LEAK_SENSOR);
		OntClassInfoSetup oci_GasSensor = createNewOntClassInfo(GasSensor.MY_URI,factory, EchonetFactory.GAS_SENSOR);
		OntClassInfoSetup oci_HumanBodyLocationSensor = createNewOntClassInfo(HumanBodyLocationSensor.MY_URI,factory, EchonetFactory.HUMAN_BODY_LOCATION_SENSOR);
		OntClassInfoSetup oci_HumanDetectionSensor = createNewOntClassInfo(HumanDetectionSensor.MY_URI,factory, EchonetFactory.HUMAN_DETECTION_SENSOR);
		OntClassInfoSetup oci_HumiditySensor = createNewOntClassInfo(HumiditySensor.MY_URI,factory, EchonetFactory.HUMIDITY_SENSOR);
		OntClassInfoSetup oci_IlluminanceSensor = createNewOntClassInfo(IlluminanceSensor.MY_URI,factory, EchonetFactory.ILLUMINANCE_SENSOR);
		OntClassInfoSetup oci_MailingSensor = createNewOntClassInfo(MailingSensor.MY_URI,factory, EchonetFactory.MAILING_SENSOR);
		OntClassInfoSetup oci_MicromotionsSensor= createNewOntClassInfo(MicromotionSensor.MY_URI,factory, EchonetFactory.MICROMOTION_SENSOR);
		OntClassInfoSetup oci_OdorSensor = createNewOntClassInfo(OdorSensor.MY_URI,factory, EchonetFactory.ODOR_SENSOR);
		OntClassInfoSetup oci_OpenCloseSensor = createNewOntClassInfo(OpenCloseSensor.MY_URI,factory, EchonetFactory.OPEN_CLOSE_SENSOR);
		OntClassInfoSetup oci_OxygenSensor = createNewOntClassInfo(OxygenSensor.MY_URI,factory, EchonetFactory.OXYGEN_SENSOR);
		OntClassInfoSetup oci_PassageSensor = createNewOntClassInfo(PassageSensor.MY_URI,factory, EchonetFactory.PASSAGE_SENSOR);
		OntClassInfoSetup oci_PressureSensor = createNewOntClassInfo(PressureSensor.MY_URI,factory, EchonetFactory.PRESSURE_SENSOR);
		OntClassInfoSetup oci_RainSensor = createNewOntClassInfo(RainSensor.MY_URI,factory, EchonetFactory.RAIN_SENSOR);
		OntClassInfoSetup oci_SmokeSensor = createNewOntClassInfo(SmokeSensor.MY_URI,factory, EchonetFactory.SMOKE_SENSOR);
		OntClassInfoSetup oci_SnowSensor = createNewOntClassInfo(SnowSensor.MY_URI,factory, EchonetFactory.SNOW_SENSOR);
		OntClassInfoSetup oci_SoundSensor = createNewOntClassInfo(SoundSensor.MY_URI,factory, EchonetFactory.SOUND_SENSOR);
		OntClassInfoSetup oci_TemperatureSensor = createNewOntClassInfo(TemperatureSensor.MY_URI,factory, EchonetFactory.TEMPERATURE_SENSOR);
		OntClassInfoSetup oci_VisitorSensor = createNewOntClassInfo(VisitorSensor.MY_URI,factory, EchonetFactory.VISITOR_SENSOR);
		OntClassInfoSetup oci_VOCSensor = createNewOntClassInfo(VOCSensor.MY_URI,factory, EchonetFactory.VOC_SENSOR);
		OntClassInfoSetup oci_WaterFlowRateSensor = createNewOntClassInfo(WaterFlowRateSensor.MY_URI,factory, EchonetFactory.WATER_FLOW_RATE_SENSOR);
		OntClassInfoSetup oci_WaterLeakSensor = createNewOntClassInfo(WaterLeakSensor.MY_URI,factory, EchonetFactory.WATER_LEAK_SENSOR);
		OntClassInfoSetup oci_WaterLevelSensor = createNewOntClassInfo(WaterLevelSensor.MY_URI,factory, EchonetFactory.WATER_LEVEL_SENSOR);
		OntClassInfoSetup oci_WaterOverflowSensor = createNewOntClassInfo(WaterOverflowSensor.MY_URI,factory, EchonetFactory.WATER_OVER_FLOW_SENSOR);
		OntClassInfoSetup oci_WeightSensor = createNewOntClassInfo(WeightSensor.MY_URI,factory, EchonetFactory.WEIGHT_SENSOR);
		
		OntClassInfoSetup oci_AirCleaner = createNewOntClassInfo(AirCleaner.MY_URI,factory, EchonetFactory.AIR_CLEANER);
		OntClassInfoSetup oci_AirConditionerVentilationFan = createNewOntClassInfo(AirConditionerVentilationFan.MY_URI,factory, EchonetFactory.AIR_CONDITIONER_VENTILATION_FAN);
		OntClassInfoSetup oci_ElectricHeater = createNewOntClassInfo(ElectricHeater.MY_URI,factory, EchonetFactory.ELECTRIC_HEATER);
		OntClassInfoSetup oci_ElectricStorageHeater = createNewOntClassInfo(ElectricStorageHeater.MY_URI,factory, EchonetFactory.ELECTRIC_STORAGE_HEATER);
		OntClassInfoSetup oci_FanHeater = createNewOntClassInfo(FanHeater.MY_URI,factory, EchonetFactory.FAN_HEATER);
		OntClassInfoSetup oci_HomeAirConditioner = createNewOntClassInfo(HomeAirConditioner.MY_URI,factory, EchonetFactory.HOME_AIR_CONDITIONER);
		OntClassInfoSetup oci_Humidifier = createNewOntClassInfo(Humidifier.MY_URI,factory, EchonetFactory.HUMIDIFIER);
		OntClassInfoSetup oci_PackageTypeCommercialAirconditionerIndoorUnit = createNewOntClassInfo(PackageTypeCommercialAirConditionerIndoorUnit.MY_URI,factory, EchonetFactory.PACKAGE_TYPE_COMMERCIAL_AIR_CONDITIONER_INDOOR_UNIT);
		OntClassInfoSetup oci_PackageTypeCommercialAirconditionerOutdoorUnit = createNewOntClassInfo(PackageTypeCommercialAirConditionerOutdoorUnit.MY_URI,factory, EchonetFactory.PACKAGE_TYPE_COMMERCIAL_AIR_CONDITIONER_OUTDOOR_UNIT);
		OntClassInfoSetup oci_VentilationFan = createNewOntClassInfo(VentilationFan.MY_URI,factory, EchonetFactory.VENTILATION_FAN);
		
		OntClassInfoSetup oci_BathRoomHeaterDryer = createNewOntClassInfo(BathRoomHeaterDryer.MY_URI,factory, EchonetFactory.BATH_ROOM_HEATER_DRYER);
		OntClassInfoSetup oci_Buzzer = createNewOntClassInfo(Buzzer.MY_URI,factory, EchonetFactory.BUZZER);
		OntClassInfoSetup oci_ColdHotWaterHeatSourceEquipment = createNewOntClassInfo(ColdHotWaterHeatSourceEquipment.MY_URI,factory, EchonetFactory.COLD_HOT_WATER_HEAT_SOURCE_EQUIPMENT);
		OntClassInfoSetup oci_ElectricBlind = createNewOntClassInfo(ElectricBlind.MY_URI,factory, EchonetFactory.ELECTRIC_BLIND);
		OntClassInfoSetup oci_ElectricGate = createNewOntClassInfo(ElectricGate.MY_URI,factory, EchonetFactory.ELECTRIC_GATE);
		OntClassInfoSetup oci_ElectricLock = createNewOntClassInfo(ElectricLock.MY_URI,factory, EchonetFactory.ELECTRIC_LOCK);
		OntClassInfoSetup oci_ElectricRainSlidingShutter = createNewOntClassInfo(ElectricRainSlidingShutter.MY_URI,factory, EchonetFactory.ELECTRIC_RAIN_SLIDING_SHUTTER);
		OntClassInfoSetup oci_ElectricShuttler = createNewOntClassInfo(ElectricShutter.MY_URI,factory, EchonetFactory.ELECTRIC_SHUTTER);
		OntClassInfoSetup oci_ElectricSlidingDoor = createNewOntClassInfo(ElectricSlidingDoor.MY_URI,factory, EchonetFactory.ELECTRIC_SLIDING_DOOR);
		OntClassInfoSetup oci_ElectricToiletSeat = createNewOntClassInfo(ElectricToiletSeat.MY_URI,factory, EchonetFactory.ELECTRIC_TOILET_SEAT);
		OntClassInfoSetup oci_VehicleCharger = createNewOntClassInfo(VehicleCharger.MY_URI,factory, EchonetFactory.VEHICLE_CHARGER);
		OntClassInfoSetup oci_ElectricWindow = createNewOntClassInfo(ElectricWindow.MY_URI,factory, EchonetFactory.ELECTRIC_WINDOW);
		OntClassInfoSetup oci_EngineCogeneration = createNewOntClassInfo(EngineCogeneration.MY_URI,factory, EchonetFactory.ENGINE_COGENERATION);
		OntClassInfoSetup oci_FloorHeater = createNewOntClassInfo(FloorHeater.MY_URI,factory, EchonetFactory.FLOOR_HEATER);
		OntClassInfoSetup oci_FuelCell = createNewOntClassInfo(FuelCell.MY_URI,factory, EchonetFactory.FUEL_CELL);
		OntClassInfoSetup oci_GardenSprinkler = createNewOntClassInfo(GardenSprinkler.MY_URI,factory, EchonetFactory.GARDEN_SPRINKLER);
		OntClassInfoSetup oci_GasMeter = createNewOntClassInfo(GasMeter.MY_URI,factory, EchonetFactory.GAS_METER);	
		OntClassInfoSetup oci_GeneralLight = createNewOntClassInfo(GeneralLighting.MY_URI,factory, EchonetFactory.GENERAL_LIGHTING);
		OntClassInfoSetup oci_HighVoltageSmartElectricEnergy = createNewOntClassInfo(HighVoltageSmartElectricEnergy.MY_URI,factory, EchonetFactory.HIGH_VOLTAGE_SMART_ELECTRIC_ENERGY);
		OntClassInfoSetup oci_SmallWindTurbinePowerGeneration = createNewOntClassInfo(HouseHoldSmallWindTurbinePowerGeneration.MY_URI,factory, EchonetFactory.HOUSE_HOLD_SMALL_WIND_TURBINE_POWER_GENERATION);
		OntClassInfoSetup oci_HouseHoldSolarPowerGeneration = createNewOntClassInfo(HouseHoldSolarPowerGeneration.MY_URI,factory, EchonetFactory.HOUSE_HOLD_SOLAR_POWER_GENERATION);
		OntClassInfoSetup oci_InstantaneousWaterHeater = createNewOntClassInfo(InstantaneousWaterHeater.MY_URI,factory, EchonetFactory.INSTANTANEOUS_WATER_HEATER);
		OntClassInfoSetup oci_KeroseneMeter = createNewOntClassInfo(KeroseneMeter.MY_URI,factory, EchonetFactory.KEROSENE_METER);
		OntClassInfoSetup oci_LightingSystem = createNewOntClassInfo(LightingSystem.MY_URI,factory, EchonetFactory.LIGHTING_SYSTEM);
		OntClassInfoSetup oci_ExtendedLightingSystem = createNewOntClassInfo(ExtendedLightingSystem.MY_URI,factory, EchonetFactory.EXTENDED_LIGHTING_SYSTEM);
		OntClassInfoSetup oci_LowVoltageSmartElectricEnergy = createNewOntClassInfo(LowVoltageSmartElectricEnergy.MY_URI,factory, EchonetFactory.LOW_VOLTAGE_SMART_ELECTRIC_ENERGY);
		OntClassInfoSetup oci_LPGasMeter = createNewOntClassInfo(LPGasMeter.MY_URI,factory, EchonetFactory.LP_GAS_METER);
		OntClassInfoSetup oci_MonoFunctionLighting = createNewOntClassInfo(MonoFunctionLighting.MY_URI,factory, EchonetFactory.MONO_FUNCTION_LIGHTING);
		OntClassInfoSetup oci_PowerDistributionBoardMetering = createNewOntClassInfo(PowerDistributionBoardMetering.MY_URI,factory, EchonetFactory.POWER_DISTRIBUTION_BOARD_METERING);
		OntClassInfoSetup oci_SmartGasMeter = createNewOntClassInfo(SmartGasMeter.MY_URI,factory, EchonetFactory.SMART_GAS_METER);
		OntClassInfoSetup oci_SmartKeroseneMeter = createNewOntClassInfo(SmartKeroseneMeter.MY_URI,factory, EchonetFactory.SMART_KEROSENE_METER);
		OntClassInfoSetup oci_StorageBattery = createNewOntClassInfo(StorageBattery.MY_URI,factory, EchonetFactory.STORAGE_BATTERY);
		OntClassInfoSetup oci_VehicleChargerDischarger = createNewOntClassInfo(ElectricVehicleChargerDischager.MY_URI,factory, EchonetFactory.ELECTRIC_VEHICLE_CHARGER_DISCHAGER);
		OntClassInfoSetup oci_WaterFlowMeter = createNewOntClassInfo(WaterFlowMeter.MY_URI,factory, EchonetFactory.WATER_FLOW_METER);
		OntClassInfoSetup oci_WaterHeater = createNewOntClassInfo(WaterHeater.MY_URI,factory, EchonetFactory.WATER_HEATER);
		OntClassInfoSetup oci_WattHourMeter = createNewOntClassInfo(WattHourMeter.MY_URI,factory, EchonetFactory.WATT_HOUR_METER);
		
		OntClassInfoSetup oci_ClothesDryer = createNewOntClassInfo(ClothesDryer.MY_URI,factory, EchonetFactory.CLOTHES_DRYER);
		OntClassInfoSetup oci_CombinationMicrowaveOven = createNewOntClassInfo(CombinationMicrowaveOven.MY_URI,factory, EchonetFactory.COMBINATION_MICROWAVE_OVEN);
		OntClassInfoSetup oci_CommercialShowcase = createNewOntClassInfo(CommercialShowcase.MY_URI,factory, EchonetFactory.COMMERCIAL_SHOWCASE);
		OntClassInfoSetup oci_CommercialShowcaseOutdoorUnit = createNewOntClassInfo(CommercialShowcaseOutdoorUnit.MY_URI,factory, EchonetFactory.COMMERCIAL_SHOWCASE_OUTDOOR_UNIT);
		OntClassInfoSetup oci_CookingHeater = createNewOntClassInfo(CookingHeater.MY_URI,factory, EchonetFactory.COOKING_HEATER);
		OntClassInfoSetup oci_ElectricHotWaterPot = createNewOntClassInfo(ElectricHotWaterPot.MY_URI,factory, EchonetFactory.ELECTRIC_HOT_WATER_POT);
		OntClassInfoSetup oci_Refrigerator = createNewOntClassInfo(Refrigerator.MY_URI,factory, EchonetFactory.REFRIGERATOR);
		OntClassInfoSetup oci_RiceCooker = createNewOntClassInfo(RiceCooker.MY_URI,factory, EchonetFactory.RICE_COOKER);
		OntClassInfoSetup oci_WasherDryer = createNewOntClassInfo(WasherDryer.MY_URI,factory, EchonetFactory.WASHER_DRYER);
		OntClassInfoSetup oci_WashingMachine = createNewOntClassInfo(WashingMachine.MY_URI,factory, EchonetFactory.WASHING_MACHINE);
		
		OntClassInfoSetup oci_WeighingMachine = createNewOntClassInfo(WeighingMachine.MY_URI,factory, EchonetFactory.WEIGHING_MACHINE);
		
		OntClassInfoSetup oci_Controller = createNewOntClassInfo(Controller.MY_URI,factory, EchonetFactory.CONTROLLER);
		OntClassInfoSetup oci_DR_EventController = createNewOntClassInfo(DREventController.MY_URI,factory, EchonetFactory.DR_CONTROLLER);
		OntClassInfoSetup oci_ParallelProcessingCombinationTypePowerControl = createNewOntClassInfo(ParallelProcessingCombinationTypePowerControl.MY_URI,factory, EchonetFactory.PARALLEL_PROCESSING_COMBINATION_TYPE_POWER_CONTROL);
		OntClassInfoSetup oci_Switch = createNewOntClassInfo(Switch.MY_URI,factory, EchonetFactory.SWITCH);
		
		OntClassInfoSetup oci_Audio = createNewOntClassInfo(Audio.MY_URI,factory, EchonetFactory.AUDIO);
		OntClassInfoSetup oci_Display = createNewOntClassInfo(Display.MY_URI,factory, EchonetFactory.DISPLAY);
		OntClassInfoSetup oci_NetworkCamera = createNewOntClassInfo(NetworkCamera.MY_URI,factory, EchonetFactory.NETWORK_CAMERA);
		OntClassInfoSetup oci_Television= createNewOntClassInfo(Television.MY_URI,factory, EchonetFactory.TELEVISION);
		
		// ******* Add content to enumeration classes of the ontology ******* //

		
		
		oci_EchonetDeviceGroupCodeValue.setResourceComment("Echonet Device Group Code values");
		oci_EchonetDeviceGroupCodeValue.setResourceLabel("EchonetDeviceGroupCodeValue");
		oci_EchonetDeviceGroupCodeValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_EchonetDeviceGroupCodeValue.toEnumeration(new ManagedIndividual[] {
				EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice,EchonetDeviceGroupCodeValue.AudiovisualRelatedDevice,
				EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice,EchonetDeviceGroupCodeValue.HealthRelatedDevice,
				EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice,EchonetDeviceGroupCodeValue.ManagementOperationRelatedDevice,
				EchonetDeviceGroupCodeValue.SensorRelatedDevice
		});
		
		oci_OperationStatusValue.setResourceComment("EPC:x80");
		oci_OperationStatusValue.setResourceLabel("OperationStatusValue");
		oci_OperationStatusValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_OperationStatusValue.toEnumeration(new ManagedIndividual[] {
				OperationStatusValue.On,OperationStatusValue.Off,OperationStatusValue.AutomaticOn,
				OperationStatusValue.ManualOn,OperationStatusValue.ManualOff,OperationStatusValue.Automatic,
				OperationStatusValue.NonAutomatic,OperationStatusValue.AutomaticUsed,OperationStatusValue.NonAutomaticStopped,
				OperationStatusValue.NonAutomaticUsed,OperationStatusValue.Heating,OperationStatusValue.NotHeating,	
				OperationStatusValue.Possible,OperationStatusValue.NotPossible,OperationStatusValue.Normal,
				OperationStatusValue.Alarm,OperationStatusValue.Initial,OperationStatusValue.HeatingSuspended,
				OperationStatusValue.HeatingCycleCompleted,OperationStatusValue.Setting,OperationStatusValue.PreHeating,
				OperationStatusValue.PreheatTemperatureMaintenance,OperationStatusValue.HeatingTemporilyStopped,OperationStatusValue.NotSpecified,
				OperationStatusValue.Stop,OperationStatusValue.Cooking,OperationStatusValue.Steaming,
				OperationStatusValue.CookingCompleted,OperationStatusValue.Refrigeration,OperationStatusValue.Freezing
		});
		oci_InstallationLocationValue.setResourceComment("EPC:x81");
		oci_InstallationLocationValue.setResourceLabel("InstallationLocationValue");
		oci_InstallationLocationValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_InstallationLocationValue.toEnumeration(new ManagedIndividual[] {
				InstallationLocationValue.LivingRoom,InstallationLocationValue.DinningRoom,InstallationLocationValue.Kitchen,
				InstallationLocationValue.Bathroom,InstallationLocationValue.Lavatory,InstallationLocationValue.Washroom_ChangingRoom,
				InstallationLocationValue.Passageway,InstallationLocationValue.Room,InstallationLocationValue.Stairway,
				InstallationLocationValue.FrontDoor,InstallationLocationValue.Storeroom,InstallationLocationValue.Garden_Perimeter,
				InstallationLocationValue.Garare,InstallationLocationValue.Veranda_Balcony,InstallationLocationValue.Others,
				InstallationLocationValue.FreeDefinition,InstallationLocationValue.InstallationLocationNotSpecified,
				InstallationLocationValue.InstallationLocationIndefinited				
		});
		oci_IdentificationNumberValue.setResourceComment("EPC:x83");
		oci_IdentificationNumberValue.setResourceLabel("IdentificationNumberValue");
		oci_IdentificationNumberValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_IdentificationNumberValue.toEnumeration(new ManagedIndividual[] { 
				IdentificationNumberValue.LowerLayerCommunicationProtocol,IdentificationNumberValue.PowerLineCommunicationProtocol_A_D,
				IdentificationNumberValue.LowPowerRadioCommunicationProtocol,IdentificationNumberValue.ExtendedHBS,
				IdentificationNumberValue.IrDA,IdentificationNumberValue.LonTalk, IdentificationNumberValue.Bluetooth,
				IdentificationNumberValue.Ethernet, IdentificationNumberValue.IEEE802_11_11B,IdentificationNumberValue.PowerLineCommunicationProtocol_C,
				IdentificationNumberValue.IPV6_6LoWPAN,IdentificationNumberValue.ManufacturerDefinedProtocol,	
				IdentificationNumberValue.IPV6_Ethernet,IdentificationNumberValue.RandomlyGeneratedProtocol,
				IdentificationNumberValue.IdentificationNotSet
		});
		oci_OccurenceStatusValue.setResourceComment("Occurence status of a property");
		oci_OccurenceStatusValue.setResourceLabel("OccurenceStatusValue");
		oci_OccurenceStatusValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_OccurenceStatusValue.toEnumeration(new ManagedIndividual[] { 
				OccurenceStatusValue.OccurenceStatusFound,OccurenceStatusValue.OccurenceStatusNotFound
		});	
		oci_FaultDesciptionValue.setResourceComment("EPC:x89");
		oci_FaultDesciptionValue.setResourceLabel("FaultDescriptionValue");
		oci_FaultDesciptionValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_FaultDesciptionValue.toEnumeration(new ManagedIndividual[] { 
				FaultDesciptionValue.NoFault,FaultDesciptionValue.RecoverableFaultType1,FaultDesciptionValue.RecoverableFaultType2,
				FaultDesciptionValue.RecoverableFaultType3,FaultDesciptionValue.RecoverableFaultType4,FaultDesciptionValue.RecoverableFaultType5,
				FaultDesciptionValue.RecoverableFaultType6,FaultDesciptionValue.RecoverableFaultType7,FaultDesciptionValue.RequireRepairFaultType1,
				FaultDesciptionValue.RequireRepairFaultType2,FaultDesciptionValue.RequireRepairFaultType3,FaultDesciptionValue.RequireRepairFaultType4,
				FaultDesciptionValue.RequireRepairFaultType5,FaultDesciptionValue.RequireRepairFaultType6,FaultDesciptionValue.UnknownFault
		});
		oci_OperationModeSettingValue.setResourceComment("");
		oci_OperationModeSettingValue.setResourceLabel("OperationModeSettingValue");
		oci_OperationModeSettingValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_OperationModeSettingValue.toEnumeration(new ManagedIndividual[] { 
				OperationModeSettingValue.NormalMode,OperationModeSettingValue.HighSpeedMode,OperationModeSettingValue.SilentMode,
				OperationModeSettingValue.StandardMode,OperationModeSettingValue.ExtraMode,OperationModeSettingValue.AutomaticAirFlowDirectionControlMode,
				OperationModeSettingValue.NonAutomaticAirFlowDirectionControlMode,OperationModeSettingValue.AutomaticAirFlowVerticalDirectionMode,
				OperationModeSettingValue.AutomaticAirFlowHorizontalDirectionMode,OperationModeSettingValue.AutomaticMode,OperationModeSettingValue.CoolingMode,		
				OperationModeSettingValue.HeatingMode,OperationModeSettingValue.DehumidificationMode,OperationModeSettingValue.CiculatorMode,
				OperationModeSettingValue.Other,OperationModeSettingValue.ThroatDryPreventionMode,OperationModeSettingValue.QuietOperationMode,
				OperationModeSettingValue.PowerSavingMode,OperationModeSettingValue.RoomHeatingOnMode,OperationModeSettingValue.RoomHeatingOffMode,
				OperationModeSettingValue.TimerMode,OperationModeSettingValue.NoSetting,OperationModeSettingValue.OverCoolPreventionMode,
				OperationModeSettingValue.VentilationMode,OperationModeSettingValue.PreWarmMode,OperationModeSettingValue.DryerMode,
				OperationModeSettingValue.Stop,OperationModeSettingValue.ModestOperationMode,OperationModeSettingValue.HighPowerOperationMode,
				OperationModeSettingValue.RapidCharginMode,OperationModeSettingValue.ChargingMode,OperationModeSettingValue.DischargingMode,
				OperationModeSettingValue.StandbyMode,OperationModeSettingValue.TestMode,OperationModeSettingValue.RestartMode,	
				OperationModeSettingValue.RecalculationMode,OperationModeSettingValue.MainLightingMode,OperationModeSettingValue.NightLightingMode,
				OperationModeSettingValue.ColorLightingMode,OperationModeSettingValue.CitricAcidCleaningMode,OperationModeSettingValue.QuickMode,
				OperationModeSettingValue.MicrowaveHeatingMode,OperationModeSettingValue.DefrostingMode,OperationModeSettingValue.OvenMode,
				OperationModeSettingValue.GrillMode,OperationModeSettingValue.ToasterMode,OperationModeSettingValue.FermentingMode,
				OperationModeSettingValue.StewingMode,OperationModeSettingValue.SteamingMode,OperationModeSettingValue.TwoStageMicrowaveHeatingMode,	
				OperationModeSettingValue.ConvectionMode,OperationModeSettingValue.HybridMode,OperationModeSettingValue.PowerControlMode,
				OperationModeSettingValue.DeepFryingMode,OperationModeSettingValue.WaterHeatingMode,OperationModeSettingValue.RiceBoilingMode,
				OperationModeSettingValue.StirFryingMode,OperationModeSettingValue.WashingMode,OperationModeSettingValue.RinsingMode,
				OperationModeSettingValue.SpinDryingMode,OperationModeSettingValue.SuspendedMode,OperationModeSettingValue.WorkingCycleStoppedCompletedMode,
				OperationModeSettingValue.NonCoolingMode,OperationModeSettingValue.ContinousMode,OperationModeSettingValue.IntermitentMode
		});
		oci_RemoteControlSettingValue.setResourceComment("EPC:x93");
		oci_RemoteControlSettingValue.setResourceLabel("RemoteControlSetting");
		oci_RemoteControlSettingValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_RemoteControlSettingValue.toEnumeration(new ManagedIndividual[] { 
				RemoteControlSettingValue.NormalCommunicationLine_PublicNetworkDiabled,RemoteControlSettingValue.NotThroughPublicNetwork,
				RemoteControlSettingValue.NormalCommunicationLine_PublicNetworkEnalbed,RemoteControlSettingValue.ThroughPublicNetwork
		});
		
		oci_OperationStateSettingValue.setResourceComment("Operation state of device's functions");
		oci_OperationStateSettingValue.setResourceLabel("OperationStateSettingValue");
		oci_OperationStateSettingValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_OperationStateSettingValue.toEnumeration(new ManagedIndividual[] { 
				OperationStateSettingValue.NormalOperation,OperationStateSettingValue.SpecialState,OperationStateSettingValue.DefrostingState,
				OperationStateSettingValue.PreHeatingState,OperationStateSettingValue.HeatRemovalState,OperationStateSettingValue.AutomaticAirFlowSwingNotUsed,
				OperationStateSettingValue.AutomaticAirFlowSwingVerticalUsed,OperationStateSettingValue.AutomaticAirFlowSwingHorizontalUsed,
				OperationStateSettingValue.AutomaticAirFlowSwingVerticalAndHorizontalUsed,OperationStateSettingValue.FullyOpened,OperationStateSettingValue.FullyClosed,
				OperationStateSettingValue.Opened,OperationStateSettingValue.Closed,OperationStateSettingValue.StopHalfway,
				OperationStateSettingValue.NonPriorityState,OperationStateSettingValue.Locked,OperationStateSettingValue.UnLocked,
				OperationStateSettingValue.OrdinaryLevel,OperationStateSettingValue.NotificationOfBatteryReplacementState,OperationStateSettingValue.SupplyingHotWaterState,
				OperationStateSettingValue.KeepingBathTemperatureState,OperationStateSettingValue.Stopped,OperationStateSettingValue.Generating,
				OperationStateSettingValue.Starting,OperationStateSettingValue.Stopping,OperationStateSettingValue.UndeterminedState,
				OperationStateSettingValue.Idling,OperationStateSettingValue.VehicleNotConnectedState,OperationStateSettingValue.VehicleConnectedNotChargeableNotDischargableState,
				OperationStateSettingValue.VehicleConnectedChargeableNotDischargableState,OperationStateSettingValue.VehicleConnectedNotChargeableDischargableState,
				OperationStateSettingValue.VehicleConnectedChargeableDischargableState,OperationStateSettingValue.VehicleConnectedChargeableState,
				OperationStateSettingValue.VehicleConnectedNotChargeableState,OperationStateSettingValue.ReadyState,OperationStateSettingValue.BusyState,
				OperationStateSettingValue.ImplementedState,OperationStateSettingValue.NotImplementedState, OperationStateSettingValue.EnableState,
				OperationStateSettingValue.DisableState,OperationStateSettingValue.TemporaryDisableState,OperationStateSettingValue.ConnectedState,
				OperationStateSettingValue.DisconnectedState,OperationStateSettingValue.NotRegisteredState,OperationStateSettingValue.DeletedState,
				OperationStateSettingValue.StartedRestartedState,OperationStateSettingValue.SuspendedState,OperationStateSettingValue.MountedState,
				OperationStateSettingValue.UnMountedState
		});
		
		oci_OperationFuntionSettingValue.setResourceComment("Operation state of device's functions");
		oci_OperationFuntionSettingValue.setResourceLabel("OperationFuntionSettingValue");
		oci_OperationFuntionSettingValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_OperationFuntionSettingValue.toEnumeration(new ManagedIndividual[] { 
				OperationFunctionSettingValue.NoSetting,OperationFunctionSettingValue.ClothesDryerFunction,OperationFunctionSettingValue.MiteMoldControlFunction,
				OperationFunctionSettingValue.ActiveDefrostingFunction,OperationFunctionSettingValue.Open,OperationFunctionSettingValue.Close,
				OperationFunctionSettingValue.Stop,OperationFunctionSettingValue.ContinousSetting,OperationFunctionSettingValue.OneTimeSetting,
				OperationFunctionSettingValue.SystemInterconnectedReservePowerFlowAcceptable,OperationFunctionSettingValue.Independent,
				OperationFunctionSettingValue.SystemInterconnectedReservePowerFlowNotAcceptable,OperationFunctionSettingValue.TimerOff,
				OperationFunctionSettingValue.Timer1_On,OperationFunctionSettingValue.Timer2_On,OperationFunctionSettingValue.TimeBasedRevervationON,
				OperationFunctionSettingValue.TimeAndRelativeTimeBasedRevervationON,OperationFunctionSettingValue.TimeAndRelativeTimeBasedRevervationOFF,
				OperationFunctionSettingValue.RelativeTimeBasedRevervationON,OperationFunctionSettingValue.Hybrid,OperationFunctionSettingValue.SystemLinked,	
				OperationFunctionSettingValue.FluorescentLight,OperationFunctionSettingValue.Led,OperationFunctionSettingValue.NoLight,
				OperationFunctionSettingValue.NonFluorocarbonInverter,OperationFunctionSettingValue.Inverter,
				OperationFunctionSettingValue.BuiltInType,OperationFunctionSettingValue.SeperateType,OperationFunctionSettingValue.Others,
				OperationFunctionSettingValue.NormalSetting,OperationFunctionSettingValue.ThermostatOverrideFunctionON,
				OperationFunctionSettingValue.ThermostatOverrideFunctionOFF,OperationFunctionSettingValue.CondensationSuppressorFunction
		});

		oci_ThresholdLevelValue.setResourceComment("");
		oci_ThresholdLevelValue.setResourceLabel("ThresholdLevelValue");
		oci_ThresholdLevelValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_ThresholdLevelValue.toEnumeration(new ManagedIndividual[] { 
				ThresholdLevelValue.MinumumLevel,ThresholdLevelValue.Level_1,ThresholdLevelValue.Level_2,ThresholdLevelValue.Level_3,
				ThresholdLevelValue.Level_4,ThresholdLevelValue.Level_5, ThresholdLevelValue.Level_6,ThresholdLevelValue.Level_7,
				ThresholdLevelValue.Level_8,ThresholdLevelValue.Level_9,ThresholdLevelValue.Level_10,ThresholdLevelValue.Level_11,
				ThresholdLevelValue.Level_12,ThresholdLevelValue.Level_13,ThresholdLevelValue.Level_14,ThresholdLevelValue.Level_15,
				ThresholdLevelValue.MaximumLevel,ThresholdLevelValue.High,ThresholdLevelValue.Medium,ThresholdLevelValue.Low,
				ThresholdLevelValue.AutomaticControl,ThresholdLevelValue.Standard,ThresholdLevelValue.ContinousOperation,
				ThresholdLevelValue.IntermittentOperation
		});
		oci_DetectionDirectionValue.setResourceComment("");
		oci_DetectionDirectionValue.setResourceLabel("DetectionDirectionValue");
		oci_DetectionDirectionValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_DetectionDirectionValue.toEnumeration(new ManagedIndividual[] { 
				DetectionDirectionValue.InDirection,DetectionDirectionValue.In_RightDirection,DetectionDirectionValue.RightDirection,
				DetectionDirectionValue.Out_RightDirection,DetectionDirectionValue.OutDirection,DetectionDirectionValue.Out_LeftDirection,
				DetectionDirectionValue.LeftDirection,DetectionDirectionValue.In_LeftDirection,DetectionDirectionValue.NoDetection,
				DetectionDirectionValue.Detected_DirectionUnknown
		});
		oci_AirFlowDirectionSettingValue.setResourceComment("");
		oci_AirFlowDirectionSettingValue.setResourceLabel("AirFlowDirectionSettingValue");
		oci_AirFlowDirectionSettingValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_AirFlowDirectionSettingValue.toEnumeration(new ManagedIndividual[] { 
				AirFlowDirectionSettingValue.Rightward,AirFlowDirectionSettingValue.Leftward,AirFlowDirectionSettingValue.Central,
				AirFlowDirectionSettingValue.LeftCenter,AirFlowDirectionSettingValue.RightCenter,AirFlowDirectionSettingValue.Uppermost,
				AirFlowDirectionSettingValue.Lowermost,AirFlowDirectionSettingValue.Uppermost_CentralMidpoint,
				AirFlowDirectionSettingValue.Lowermost_CentralMidpoint
		});
		oci_IonEmissionMethodValue.setResourceComment("");
		oci_IonEmissionMethodValue.setResourceLabel("IonEmissionMethodValue");
		oci_IonEmissionMethodValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_IonEmissionMethodValue.toEnumeration(new ManagedIndividual[] { 
				IonEmissionMethodValue.ClusterIonMethod,IonEmissionMethodValue.NegativeIonMethod
		});
		oci_LiquidAmountLevelValue.setResourceComment("");
		oci_LiquidAmountLevelValue.setResourceLabel("LiquidAmountLevelValue");
		oci_LiquidAmountLevelValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_LiquidAmountLevelValue.toEnumeration(new ManagedIndividual[] { 
				LiquidAmountLevelValue.Empty,LiquidAmountLevelValue.MinimumLevel,LiquidAmountLevelValue.AmountLevel20Percent,
				LiquidAmountLevelValue.AmountLevel40Percent,LiquidAmountLevelValue.AmountLevel60Percent,
				LiquidAmountLevelValue.AmountLevel80Percent,LiquidAmountLevelValue.MaxLevel
		});
		oci_RadiationMethodValue.setResourceComment("");
		oci_RadiationMethodValue.setResourceLabel("RadiationMethodValue");
		oci_RadiationMethodValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_RadiationMethodValue.toEnumeration(new ManagedIndividual[] { 
				RadiationMethodValue.WithFan,RadiationMethodValue.WithoutFan
		});
		
		oci_PowerConsumptionRange.setResourceComment("");
		oci_PowerConsumptionRange.setResourceLabel("PowerConsumptionRange");
		oci_PowerConsumptionRange.addSuperClass(ManagedIndividual.MY_URI);
		oci_PowerConsumptionRange.toEnumeration(new ManagedIndividual[] { 
				PowerConsumptionRange.Undefined,PowerConsumptionRange.RangeUpTo50W,
				PowerConsumptionRange.Range50W_100W,PowerConsumptionRange.Range100W_150W,
				PowerConsumptionRange.Range150W_200W,PowerConsumptionRange.RangeOver_200W
		});
		oci_SelectiveOpeningOperationSettingValue.setResourceComment("");
		oci_SelectiveOpeningOperationSettingValue.setResourceLabel("PowerConsumptionRange");
		oci_SelectiveOpeningOperationSettingValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_SelectiveOpeningOperationSettingValue.toEnumeration(new ManagedIndividual[] { 
				SelectiveOpeningOperationSettingValue.DegreeOfSettingPositionOpen,SelectiveOpeningOperationSettingValue.OperationTimeSettingValueOpen,
				SelectiveOpeningOperationSettingValue.OperationTimeSettingValueClose,SelectiveOpeningOperationSettingValue.LocalSettingPosition,
				SelectiveOpeningOperationSettingValue.SlitDegreeOfOpeningSetting
		});
		oci_IntervalSettingValue.setResourceComment("");
		oci_IntervalSettingValue.setResourceLabel("IntervalSettingValue");
		oci_IntervalSettingValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_IntervalSettingValue.toEnumeration(new ManagedIndividual[] { 
				IntervalSettingValue.Off,IntervalSettingValue.Daily,IntervalSettingValue.EveryOtherDay,
				IntervalSettingValue.Every3Day,IntervalSettingValue.OnceAWeek
		});
		
		oci_NumberOfSprinkleSettingValue.setResourceComment("");
		oci_NumberOfSprinkleSettingValue.setResourceLabel("NumberOfSprinkleSettingValue");
		oci_NumberOfSprinkleSettingValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_NumberOfSprinkleSettingValue.toEnumeration(new ManagedIndividual[] { 
				NumberOfSprinkleSettingValue.BothOn,NumberOfSprinkleSettingValue.FirstOn,NumberOfSprinkleSettingValue.SecondOn
		});
		
		oci_AlarmStatusValue.setResourceComment("");
		oci_AlarmStatusValue.setResourceLabel("AlarmStatusValue");
		oci_AlarmStatusValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_AlarmStatusValue.toEnumeration(new ManagedIndividual[] { 
				AlarmStatusValue.NoAlarm,AlarmStatusValue.OutOfHotWater,AlarmStatusValue.WaterLeaking,
				AlarmStatusValue.WaterFrozen,AlarmStatusValue.BreakOpened,AlarmStatusValue.DoorOpened,
				AlarmStatusValue.ManualUnlocked,AlarmStatusValue.Tampered
		});
		oci_MeasurementMethodValue.setResourceComment("");
		oci_MeasurementMethodValue.setResourceLabel("MeasurementMethodValue");
		oci_MeasurementMethodValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_MeasurementMethodValue.toEnumeration(new ManagedIndividual[] { 
				MeasurementMethodValue.ClassUnit,MeasurementMethodValue.InstanceUnit,MeasurementMethodValue.NodeUnit
		});
		oci_ChargerDischargerTypeValue.setResourceComment("");
		oci_ChargerDischargerTypeValue.setResourceLabel("ChargerDischargerTypeValue");
		oci_ChargerDischargerTypeValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_ChargerDischargerTypeValue.toEnumeration(new ManagedIndividual[] { 
				ChargerDischargerTypeValue.AC_HLC_ChargingOnly,ChargerDischargerTypeValue.AC_HLC_ChargingDischargingPossible,
				ChargerDischargerTypeValue.DCTypeAA_ChargingOnly,ChargerDischargerTypeValue.DCTypeAA_ChargingDischargingPossible,
				ChargerDischargerTypeValue.DCTypeAA_DischargingOnly,ChargerDischargerTypeValue.DCTypeBB_ChargingOnly,
				ChargerDischargerTypeValue.DCTypeBB_ChargingDischargingPossible,ChargerDischargerTypeValue.DCTypeBB_DischargingOnly,
				ChargerDischargerTypeValue.DCTypeEE_ChargingOnly,ChargerDischargerTypeValue.DCTypeEE_ChargingDischargingPossible,
				ChargerDischargerTypeValue.DCTypeEE_DischargingOnly,ChargerDischargerTypeValue.DCTypeFF_ChargingOnly,
				ChargerDischargerTypeValue.DCTypeFF_ChargingDischargingPossible,ChargerDischargerTypeValue.DCTypeFF_DischargingOnly,
				ChargerDischargerTypeValue.ACCPLT
		});

		oci_TypeClassificationValue.setResourceComment("");
		oci_TypeClassificationValue.setResourceLabel("TypeClassificationValue");
		oci_TypeClassificationValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_TypeClassificationValue.toEnumeration(new ManagedIndividual[] { 
				TypeClassificationValue.RunningWater,TypeClassificationValue.RecycledWater,TypeClassificationValue.SewageWater,
				TypeClassificationValue.Others,TypeClassificationValue.NotSpecified,TypeClassificationValue.PublicWaterworksCompany,
				TypeClassificationValue.PrivateSectorCompany,TypeClassificationValue.Individual,TypeClassificationValue.CityGas,
				TypeClassificationValue.LPGas,TypeClassificationValue.NaturalGas
		});
		oci_ColorValue.setResourceComment("");
		oci_ColorValue.setResourceLabel("ColorValue");
		oci_ColorValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_ColorValue.toEnumeration(new ManagedIndividual[] { 
				ColorValue.IncandescentLampColor,ColorValue.White,ColorValue.DaylightWhite,ColorValue.DaylightColor,ColorValue.Others
		});
		
		oci_AutomaticHeatingMenu.setResourceComment("");
		oci_AutomaticHeatingMenu.setResourceLabel("AutomaticHeatingMenu");
		oci_AutomaticHeatingMenu.addSuperClass(ManagedIndividual.MY_URI);
		oci_AutomaticHeatingMenu.toEnumeration(new ManagedIndividual[] { 
				AutomaticHeatingMenu.FullyAutomatic,AutomaticHeatingMenu.ReheatingBoiledRice,AutomaticHeatingMenu.ReheatingCookedDish,	
				AutomaticHeatingMenu.WarmSake,AutomaticHeatingMenu.WarmMilk,AutomaticHeatingMenu.BoilingLeafyVegetables,
				AutomaticHeatingMenu.BoilingFruitFlowerVegetables,AutomaticHeatingMenu.BoilingRootVegetables,AutomaticHeatingMenu.DefrostingMeat,
				AutomaticHeatingMenu.DefrostingSashimi,AutomaticHeatingMenu.GrillHamburgerSteak,AutomaticHeatingMenu.BakeGratin,
				AutomaticHeatingMenu.MakeChawanMushi,AutomaticHeatingMenu.CookingRice,AutomaticHeatingMenu.ReheatingFries,
				AutomaticHeatingMenu.Fries,AutomaticHeatingMenu.BakeSpongeCakes,AutomaticHeatingMenu.BakeChiffonCakes,
				AutomaticHeatingMenu.BakeCookies,AutomaticHeatingMenu.BakeCreamPuffs,AutomaticHeatingMenu.ToastBread,
				AutomaticHeatingMenu.UserDefine,AutomaticHeatingMenu.NotSpecified
		});
		
		
		oci_CharacterCodes.setResourceComment("");
		oci_CharacterCodes.setResourceLabel("CharacterCodes");
		oci_CharacterCodes.addSuperClass(ManagedIndividual.MY_URI);
		oci_CharacterCodes.toEnumeration(new ManagedIndividual[] { 
				CharacterCodes.ANSI_X3Dot4,CharacterCodes.Shift_JIS,CharacterCodes.JIS,CharacterCodes.JapanEUC,
				CharacterCodes.UCS4,CharacterCodes.UCS2,CharacterCodes.Latin1,CharacterCodes.UTF8
		});
		
		oci_InputSourceSettingValue.setResourceComment("");
		oci_InputSourceSettingValue.setResourceLabel("CharacterCodes");
		oci_InputSourceSettingValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_InputSourceSettingValue.toEnumeration(new ManagedIndividual[] { 
				InputSourceSettingValue.BuiltIntoTuner,InputSourceSettingValue.BuiltIntoOpticalDisk,InputSourceSettingValue.BuiltIntoMD,
				InputSourceSettingValue.BuiltIntoCassettle,InputSourceSettingValue.ExternalInputAnalogDigitalInputTerminal,
				InputSourceSettingValue.ExternalInputHDMI,InputSourceSettingValue.BuiltInMemoryCardSlot,InputSourceSettingValue.BuiltInMemoryStorage,
				InputSourceSettingValue.ExternalInputUSB,InputSourceSettingValue.DedicatedTerminalForPortablePlayer,InputSourceSettingValue.NotSet,
				InputSourceSettingValue.NetworkRelatedInput,InputSourceSettingValue.EquipmentUniqueArea,InputSourceSettingValue.Prohibited
		});
		
		oci_TransferingMethods.setResourceComment("");
		oci_TransferingMethods.setResourceLabel("TransferingMethods");
		oci_TransferingMethods.addSuperClass(ManagedIndividual.MY_URI);
		oci_TransferingMethods.toEnumeration(new ManagedIndividual[] { 
				TransferingMethods.LocalStorageTransger,TransferingMethods.RemoteStorageTransger,TransferingMethods.MailTransfer, TransferingMethods.NotSet
		});
		oci_HumidifyingLevelValue.setResourceComment("");
		oci_HumidifyingLevelValue.setResourceLabel("HumidifyingLevelValue");
		oci_HumidifyingLevelValue.addSuperClass(ManagedIndividual.MY_URI);
		oci_HumidifyingLevelValue.toEnumeration(new ManagedIndividual[] { 
				HumidifyingLevelValue.Automatic,HumidifyingLevelValue.ContinousOperation,
				HumidifyingLevelValue.IntermitentOperation,HumidifyingLevelValue.HumidifyingLevel1,
				HumidifyingLevelValue.HumidifyingLevel2,HumidifyingLevelValue.HumidifyingLevel3,HumidifyingLevelValue.HumidifyingLevel4				
		});
		
		
		// ******* Add content to device classes of the ontology ******* //
		oci_EchonetSuperDevice.setResourceComment("Super device class");
		oci_EchonetSuperDevice.setResourceLabel("EchonetSuperDevice");
		oci_EchonetSuperDevice.addSuperClass(Device.MY_URI);
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_NODE_IP_ADDRESS).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_NODE_IP_ADDRESS, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_GROUP_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_GROUP_CODE, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_CLASS_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_CLASS_CODE, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_INSTANCE_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_INSTANCE_CODE, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_OPERATION_STATUS).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_OPERATION_STATUS, OperationStatusValue.MY_URI, 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_INSTALLATION_LOCATION).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_INSTALLATION_LOCATION, InstallationLocationValue.MY_URI, 1, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_STANDARD_VERSION_INFORMATION).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_STANDARD_VERSION_INFORMATION, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_IDENTIFICATION_NUMBER).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_IDENTIFICATION_NUMBER, IdentificationNumberValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION, TypeMapper.getDatatypeURI(Integer.class), 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION, TypeMapper.getDatatypeURI(Float.class), 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_MANUFACTURER_FAULT_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_MANUFACTURER_FAULT_CODE, TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_CURRENT_LIMIT_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_CURRENT_LIMIT_SETTING, TypeMapper.getDatatypeURI(Integer.class), 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_FAULT_STATUS).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_FAULT_STATUS, OccurenceStatusValue.MY_URI, 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_FAULT_DESCRIPTION, FaultDesciptionValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_MANUFACTURER_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_MANUFACTURER_CODE, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_BUSINESS_FACILITY_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_BUSINESS_FACILITY_CODE, TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_PRODUCT_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_PRODUCT_CODE, TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_PRODUCTION_NUMBER).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_PRODUCTION_NUMBER, TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_PRODUCTION_DATE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_PRODUCTION_DATE, TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING, OperationModeSettingValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_REMOTE_CONTROL_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_REMOTE_CONTROL_SETTING, RemoteControlSettingValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_CURRENT_TIME_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_CURRENT_TIME_SETTING, TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_CURRENT_DATE_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_CURRENT_DATE_SETTING, TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_POWER_LIMIT_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_POWER_LIMIT_SETTING, TypeMapper.getDatatypeURI(Integer.class), 0, 1));
		oci_EchonetSuperDevice.addDatatypeProperty(EchonetSuperDevice.PROPERTY_HAS_CUMULATIVE_OPERATING_TIME).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_CUMULATIVE_OPERATING_TIME, TypeMapper.getDatatypeURI(String.class), 0, 1));
		
		oci_GasLeakSensor.setResourceComment("Gas Leak Sensor");
		oci_GasLeakSensor.setResourceLabel("GasLeakSensor");
		oci_GasLeakSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_GasLeakSensor.addObjectProperty(GasLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_GasLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_GasLeakSensor.addObjectProperty(GasLeakSensor.PROPERTY_HAS_GAS_LEAK_OCCURENCE_STATUS).setFunctional();
		oci_GasLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasLeakSensor.PROPERTY_HAS_GAS_LEAK_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_GasLeakSensor.addObjectProperty(GasLeakSensor.PROPERTY_RESETTING_GAS_LEAK_OCCURENCE_STATUS).setFunctional();
		oci_GasLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasLeakSensor.PROPERTY_RESETTING_GAS_LEAK_OCCURENCE_STATUS,GasLeakSensor.MY_URI,1,1));		
		oci_CrimePreventionSensor.setResourceComment("Crime Prevention Sensor");
		oci_CrimePreventionSensor.setResourceLabel("CrimePreventionSensor");
		oci_CrimePreventionSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CrimePreventionSensor.addObjectProperty(CrimePreventionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_CrimePreventionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CrimePreventionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_CrimePreventionSensor.addObjectProperty(CrimePreventionSensor.PROPERTY_HAS_INVASION_OCCURENCE_STATUS).setFunctional();
		oci_CrimePreventionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CrimePreventionSensor.PROPERTY_HAS_INVASION_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_CrimePreventionSensor.addObjectProperty(CrimePreventionSensor.PROPERTY_RESETTING_INVASION_OCCURENCE_STATUS).setFunctional();
		oci_CrimePreventionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CrimePreventionSensor.PROPERTY_RESETTING_INVASION_OCCURENCE_STATUS,CrimePreventionSensor.MY_URI,1,1));	
		oci_EmergencyButton.setResourceComment("");
		oci_EmergencyButton.setResourceLabel("EmergencyButton");
		oci_EmergencyButton.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_EmergencyButton.addObjectProperty(EmergencyButton.PROPERTY_HAS_EMERGENCY_OCCURENCE_STATUS).setFunctional();
		oci_EmergencyButton.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EmergencyButton.PROPERTY_HAS_EMERGENCY_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_EmergencyButton.addObjectProperty(EmergencyButton.PROPERTY_RESETTING_EMERGENCY_OCCURENCE_STATUS).setFunctional();
		oci_EmergencyButton.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EmergencyButton.PROPERTY_RESETTING_EMERGENCY_OCCURENCE_STATUS,EmergencyButton.MY_URI,1,1));	
		oci_FirstAidSensor.setResourceComment("");
		oci_FirstAidSensor.setResourceLabel("FirstAidSensor");
		oci_FirstAidSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_FirstAidSensor.addObjectProperty(FirstAidSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_FirstAidSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FirstAidSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_FirstAidSensor.addObjectProperty(FirstAidSensor.PROPERTY_HAS_FIRST_AID_OCCURENCE_STATUS).setFunctional();
		oci_FirstAidSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FirstAidSensor.PROPERTY_HAS_FIRST_AID_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_FirstAidSensor.addObjectProperty(FirstAidSensor.PROPERTY_RESETTING_FIRST_AID_OCCURENCE_STATUS).setFunctional();
		oci_FirstAidSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FirstAidSensor.PROPERTY_RESETTING_FIRST_AID_OCCURENCE_STATUS,FirstAidSensor.MY_URI,1,1));	
		oci_EarthquakeSensor.setResourceComment("");
		oci_EarthquakeSensor.setResourceLabel("EarthquakeSensor");
		oci_EarthquakeSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_HAS_EARTHQUAKE_OCCURENCE_STATUS).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_HAS_EARTHQUAKE_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_RESETTING_EARTHQUAKE_OCCURENCE_STATUS).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_RESETTING_EARTHQUAKE_OCCURENCE_STATUS,EarthquakeSensor.MY_URI,1,1));
		oci_EarthquakeSensor.addDatatypeProperty(EarthquakeSensor.PROPERTY_HAS_SI_VALUE).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_HAS_SI_VALUE,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_RESETTING_SI_VALUE).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_RESETTING_SI_VALUE,EarthquakeSensor.MY_URI,1,1));
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_HAS_COLLAPSE_OCCURENCE_STATUS).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_HAS_COLLAPSE_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_RESETTING_COLLAPSE_OCCURENCE_STATUS).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_RESETTING_COLLAPSE_OCCURENCE_STATUS,EarthquakeSensor.MY_URI,1,1));		
		oci_ElectricLeakSensor.setResourceComment("");
		oci_ElectricLeakSensor.setResourceLabel("ElectricLeakSensor");
		oci_ElectricLeakSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricLeakSensor.addObjectProperty(ElectricLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_ElectricLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricLeakSensor.addObjectProperty(ElectricLeakSensor.PROPERTY_HAS_ELECTRIC_LEAK_OCCURENCE_STATUS).setFunctional();
		oci_ElectricLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLeakSensor.PROPERTY_HAS_ELECTRIC_LEAK_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_ElectricLeakSensor.addObjectProperty(ElectricLeakSensor.PROPERTY_RESETTING_ELECTRIC_LEAK_OCCURENCE_STATUS).setFunctional();
		oci_ElectricLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLeakSensor.PROPERTY_RESETTING_ELECTRIC_LEAK_OCCURENCE_STATUS,ElectricLeakSensor.MY_URI,1,1));	
		oci_HumanDetectionSensor.setResourceComment("");
		oci_HumanDetectionSensor.setResourceLabel("HumanDetectionSensor");
		oci_HumanDetectionSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_HumanDetectionSensor.addObjectProperty(HumanDetectionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_HumanDetectionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanDetectionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_HumanDetectionSensor.addObjectProperty(HumanDetectionSensor.PROPERTY_HAS_HUMAN_DETECTION_STATUS).setFunctional();
		oci_HumanDetectionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanDetectionSensor.PROPERTY_HAS_HUMAN_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_VisitorSensor.setResourceComment("");
		oci_VisitorSensor.setResourceLabel("VisitorSensor");
		oci_VisitorSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_VisitorSensor.addObjectProperty(VisitorSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_VisitorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VisitorSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_VisitorSensor.addObjectProperty(VisitorSensor.PROPERTY_HAS_VISITOR_DETECTION_STATUS).setFunctional();
		oci_VisitorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VisitorSensor.PROPERTY_HAS_VISITOR_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_VisitorSensor.addDatatypeProperty(VisitorSensor.PROPERTY_HAS_VISITOR_DETECTION_HOLDING_TIME).setFunctional();
		oci_VisitorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VisitorSensor.PROPERTY_HAS_VISITOR_DETECTION_HOLDING_TIME,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_CallSensor.setResourceComment("");
		oci_CallSensor.setResourceLabel("CallSensor");
		oci_CallSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CallSensor.addObjectProperty(CallSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_CallSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CallSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_CallSensor.addObjectProperty(CallSensor.PROPERTY_HAS_CALL_STATUS).setFunctional();
		oci_CallSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CallSensor.PROPERTY_HAS_CALL_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_CallSensor.addDatatypeProperty(CallSensor.PROPERTY_HAS_CALL_HOLDING_TIME).setFunctional();
		oci_CallSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CallSensor.PROPERTY_HAS_CALL_HOLDING_TIME,TypeMapper.getDatatypeURI(Integer.class),0,1));		
		oci_CondensationSensor.setResourceComment("");
		oci_CondensationSensor.setResourceLabel("CondensationSensor");
		oci_CondensationSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CondensationSensor.addObjectProperty(CondensationSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_CondensationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CondensationSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_CondensationSensor.addObjectProperty(CondensationSensor.PROPERTY_HAS_CONDENSATION_DETECTION_STATUS).setFunctional();
		oci_CondensationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CondensationSensor.PROPERTY_HAS_CONDENSATION_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_AirPollutionSensor.setResourceComment("");
		oci_AirPollutionSensor.setResourceLabel("AirPollutionSensor");
		oci_AirPollutionSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_AirPollutionSensor.addObjectProperty(AirPollutionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_AirPollutionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirPollutionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_AirPollutionSensor.addObjectProperty(AirPollutionSensor.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS).setFunctional();
		oci_AirPollutionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirPollutionSensor.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_OxygenSensor.setResourceComment("");
		oci_OxygenSensor.setResourceLabel("OxygenSensor");
		oci_OxygenSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_OxygenSensor.addDatatypeProperty(OxygenSensor.PROPERTY_HAS_MEASURED_VALUE_OF_OXYGEN_CONCENTRATION).setFunctional();
		oci_OxygenSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OxygenSensor.PROPERTY_HAS_MEASURED_VALUE_OF_OXYGEN_CONCENTRATION,TypeMapper.getDatatypeURI(Float.class),1,1));	
		oci_IlluminanceSensor.setResourceComment("");
		oci_IlluminanceSensor.setResourceLabel("IlluminanceSensor");
		oci_IlluminanceSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_IlluminanceSensor.addDatatypeProperty(IlluminanceSensor.PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_1).setFunctional();
		oci_IlluminanceSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(IlluminanceSensor.PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_1,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_IlluminanceSensor.addDatatypeProperty(IlluminanceSensor.PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_2).setFunctional();
		oci_IlluminanceSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(IlluminanceSensor.PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_2,TypeMapper.getDatatypeURI(Integer.class),1,1));	
		oci_SoundSensor.setResourceComment("");
		oci_SoundSensor.setResourceLabel("SoundSensor");
		oci_SoundSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_SoundSensor.addObjectProperty(SoundSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_SoundSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SoundSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_SoundSensor.addObjectProperty(SoundSensor.PROPERTY_HAS_SOUND_DETECTION_STATUS).setFunctional();
		oci_SoundSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SoundSensor.PROPERTY_HAS_SOUND_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_SoundSensor.addDatatypeProperty(SoundSensor.PROPERTY_HAS_SOUND_DETECTION_HOLDING_TIME).setFunctional();
		oci_SoundSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SoundSensor.PROPERTY_HAS_SOUND_DETECTION_HOLDING_TIME,TypeMapper.getDatatypeURI(Integer.class),1,1));	
		oci_MailingSensor.setResourceComment("");
		oci_MailingSensor.setResourceLabel("MailingSensor");
		oci_MailingSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_MailingSensor.addObjectProperty(MailingSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_MailingSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MailingSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_MailingSensor.addObjectProperty(MailingSensor.PROPERTY_HAS_MAILING_DETECTION_STATUS).setFunctional();
		oci_MailingSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MailingSensor.PROPERTY_HAS_MAILING_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_WeightSensor.setResourceComment("");
		oci_WeightSensor.setResourceLabel("WeightSensor");
		oci_WeightSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WeightSensor.addObjectProperty(WeightSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_WeightSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WeightSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_WeightSensor.addObjectProperty(WeightSensor.PROPERTY_HAS_WEIGHT_DETECTION_STATUS).setFunctional();
		oci_WeightSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WeightSensor.PROPERTY_HAS_WEIGHT_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_TemperatureSensor.setResourceComment("");
		oci_TemperatureSensor.setResourceLabel("TemperatureSensor");
		oci_TemperatureSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_TemperatureSensor.addDatatypeProperty(TemperatureSensor.PROPERTY_HAS_MEASURED_TEMPERATURE_VALUE).setFunctional();
		oci_TemperatureSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(TemperatureSensor.PROPERTY_HAS_MEASURED_TEMPERATURE_VALUE,TypeMapper.getDatatypeURI(Float.class),1,1));		
		oci_HumiditySensor.setResourceComment("");
		oci_HumiditySensor.setResourceLabel("HumiditySensor");
		oci_HumiditySensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_HumiditySensor.addDatatypeProperty(HumiditySensor.PROPERTY_HAS_MEASURED_RELATIVE_HUMIDITY_VALUE).setFunctional();
		oci_HumiditySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumiditySensor.PROPERTY_HAS_MEASURED_RELATIVE_HUMIDITY_VALUE,TypeMapper.getDatatypeURI(Integer.class),1,1));		
		oci_RainSensor.setResourceComment("");
		oci_RainSensor.setResourceLabel("RainSensor");
		oci_RainSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_RainSensor.addObjectProperty(RainSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_RainSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RainSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_RainSensor.addObjectProperty(RainSensor.PROPERTY_HAS_RAIN_DETECTION_STATUS).setFunctional();
		oci_RainSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RainSensor.PROPERTY_HAS_RAIN_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));		
		oci_WaterLevelSensor.setResourceComment("");
		oci_WaterLevelSensor.setResourceLabel("WaterLevelSensor");
		oci_WaterLevelSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WaterLevelSensor.addDatatypeProperty(WaterLevelSensor.PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_WaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterLevelSensor.PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterLevelSensor.addObjectProperty(WaterLevelSensor.PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_STATUS).setFunctional();
		oci_WaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterLevelSensor.PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_WaterLevelSensor.addDatatypeProperty(WaterLevelSensor.PROPERTY_HAS_MEASURED_WATER_LEVEL_VALUE).setFunctional();
		oci_WaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterLevelSensor.PROPERTY_HAS_MEASURED_WATER_LEVEL_VALUE,TypeMapper.getDatatypeURI(Integer.class),1,1));	
		oci_BathWaterLevelSensor.setResourceComment("");
		oci_BathWaterLevelSensor.setResourceLabel("BathWaterLevelSensor");
		oci_BathWaterLevelSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_BathWaterLevelSensor.addDatatypeProperty(BathWaterLevelSensor.PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_BathWaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathWaterLevelSensor.PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_BathWaterLevelSensor.addObjectProperty(BathWaterLevelSensor.PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_STATUS).setFunctional();
		oci_BathWaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathWaterLevelSensor.PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_BathWaterLevelSensor.addDatatypeProperty(BathWaterLevelSensor.PROPERTY_HAS_MEASURED_BATH_WATER_LEVEL_VALUE).setFunctional();
		oci_BathWaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathWaterLevelSensor.PROPERTY_HAS_MEASURED_BATH_WATER_LEVEL_VALUE,TypeMapper.getDatatypeURI(Integer.class),1,1));	
		oci_BathHeatingStatusSensor.setResourceComment("");
		oci_BathHeatingStatusSensor.setResourceLabel("BathHeatingStatusSensor");
		oci_BathHeatingStatusSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_BathHeatingStatusSensor.addObjectProperty(BathHeatingStatusSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_BathHeatingStatusSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathHeatingStatusSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_BathHeatingStatusSensor.addObjectProperty(BathHeatingStatusSensor.PROPERTY_HAS_BATH_HEATING_DETECTION_STATUS).setFunctional();
		oci_BathHeatingStatusSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathHeatingStatusSensor.PROPERTY_HAS_BATH_HEATING_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_WaterLeakSensor.setResourceComment("");
		oci_WaterLeakSensor.setResourceLabel("WaterLeakSensor");
		oci_WaterLeakSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WaterLeakSensor.addObjectProperty(WaterLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_WaterLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_WaterLeakSensor.addObjectProperty(WaterLeakSensor.PROPERTY_HAS_WATER_LEAK_DETECTION_STATUS).setFunctional();
		oci_WaterLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterLeakSensor.PROPERTY_HAS_WATER_LEAK_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_WaterOverflowSensor.setResourceComment("");
		oci_WaterOverflowSensor.setResourceLabel("WaterOverflowSensor");
		oci_WaterOverflowSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WaterOverflowSensor.addObjectProperty(WaterOverflowSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_WaterOverflowSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterOverflowSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_WaterOverflowSensor.addObjectProperty(WaterOverflowSensor.PROPERTY_HAS_WATER_OVERFLOW_DETECTION_STATUS).setFunctional();
		oci_WaterOverflowSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterOverflowSensor.PROPERTY_HAS_WATER_OVERFLOW_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_FireSensor.setResourceComment("");
		oci_FireSensor.setResourceLabel("FireSensor");
		oci_FireSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_FireSensor.addObjectProperty(FireSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_FireSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FireSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_FireSensor.addObjectProperty(FireSensor.PROPERTY_HAS_FIRE_OCCURENCE_STATUS).setFunctional();
		oci_FireSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FireSensor.PROPERTY_HAS_FIRE_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_FireSensor.addObjectProperty(FireSensor.PROPERTY_RESETTING_FIRE_OCCURENCE_STATUS).setFunctional();
		oci_FireSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FireSensor.PROPERTY_RESETTING_FIRE_OCCURENCE_STATUS,FireSensor.MY_URI,1,1));		
		oci_SmokeSensor.setResourceComment("");
		oci_SmokeSensor.setResourceLabel("SmokeSensor");
		oci_SmokeSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_SmokeSensor.addObjectProperty(SmokeSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_SmokeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmokeSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_SmokeSensor.addObjectProperty(SmokeSensor.PROPERTY_HAS_SMOKE_DETECTION_STATUS).setFunctional();
		oci_SmokeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmokeSensor.PROPERTY_HAS_SMOKE_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_CO2Sensor.setResourceComment("");
		oci_CO2Sensor.setResourceLabel("CO2Sensor");
		oci_CO2Sensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CO2Sensor.addDatatypeProperty(CO2Sensor.PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION).setFunctional();
		oci_CO2Sensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CO2Sensor.PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION,TypeMapper.getDatatypeURI(Integer.class),1,1));	
		oci_GasSensor.setResourceComment("");
		oci_GasSensor.setResourceLabel("GasSensor");
		oci_GasSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_GasSensor.addObjectProperty(GasSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_GasSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_GasSensor.addObjectProperty(GasSensor.PROPERTY_HAS_GAS_DETECTION_STATUS).setFunctional();
		oci_GasSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasSensor.PROPERTY_HAS_GAS_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_GasSensor.addDatatypeProperty(GasSensor.PROPERTY_HAS_MEASURED_VALUE_OF_GAS_CONCENTRATION).setFunctional();
		oci_GasSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasSensor.PROPERTY_HAS_MEASURED_VALUE_OF_GAS_CONCENTRATION,TypeMapper.getDatatypeURI(Integer.class),1,1));	
		oci_VOCSensor.setResourceComment("");
		oci_VOCSensor.setResourceLabel("VOCSensor");
		oci_VOCSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_VOCSensor.addObjectProperty(VOCSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_VOCSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VOCSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_VOCSensor.addObjectProperty(VOCSensor.PROPERTY_HAS_VOC_DETECTION_STATUS).setFunctional();
		oci_VOCSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VOCSensor.PROPERTY_HAS_VOC_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_VOCSensor.addDatatypeProperty(VOCSensor.PROPERTY_HAS_MEASURED_VALUE_OF_VOC_CONCENTRATION).setFunctional();
		oci_VOCSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VOCSensor.PROPERTY_HAS_MEASURED_VALUE_OF_VOC_CONCENTRATION,TypeMapper.getDatatypeURI(Integer.class),1,1));	
		oci_PressureSensor.setResourceComment("");
		oci_PressureSensor.setResourceLabel("PressureSensor");
		oci_PressureSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_PressureSensor.addDatatypeProperty(PressureSensor.PROPERTY_HAS_MEASURED_DIFFIRENTIAL_PRESSURE_VALUE).setFunctional();
		oci_PressureSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PressureSensor.PROPERTY_HAS_MEASURED_DIFFIRENTIAL_PRESSURE_VALUE,TypeMapper.getDatatypeURI(Integer.class),1,1));		
		oci_AirSpeedSensor.setResourceComment("");
		oci_AirSpeedSensor.setResourceLabel("AirSpeedSensor");
		oci_AirSpeedSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_AirSpeedSensor.addDatatypeProperty(AirSpeedSensor.PROPERTY_HAS_MEASURED_VALUE_OF_AIR_SPEED).setFunctional();
		oci_AirSpeedSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirSpeedSensor.PROPERTY_HAS_MEASURED_VALUE_OF_AIR_SPEED,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_AirSpeedSensor.addDatatypeProperty(AirSpeedSensor.PROPERTY_HAS_AIR_FLOW_DIRECTION).setFunctional();
		oci_AirSpeedSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirSpeedSensor.PROPERTY_HAS_AIR_FLOW_DIRECTION,TypeMapper.getDatatypeURI(Integer.class),0,1));		
		oci_OdorSensor.setResourceComment("");
		oci_OdorSensor.setResourceLabel("OdorSensor");
		oci_OdorSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_OdorSensor.addObjectProperty(OdorSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_OdorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OdorSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_OdorSensor.addObjectProperty(OdorSensor.PROPERTY_HAS_ODOR_DETECTION_STATUS).setFunctional();
		oci_OdorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OdorSensor.PROPERTY_HAS_ODOR_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_OdorSensor.addDatatypeProperty(OdorSensor.PROPERTY_HAS_MEASURED_ODOR_VALUE).setFunctional();
		oci_OdorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OdorSensor.PROPERTY_HAS_MEASURED_ODOR_VALUE,TypeMapper.getDatatypeURI(Integer.class),1,1));	
		oci_FlameSensor.setResourceComment("");
		oci_FlameSensor.setResourceLabel("FlameSensor");
		oci_FlameSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_FlameSensor.addObjectProperty(FlameSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_FlameSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FlameSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_FlameSensor.addObjectProperty(FlameSensor.PROPERTY_HAS_FLAME_DETECTION_STATUS).setFunctional();
		oci_FlameSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FlameSensor.PROPERTY_HAS_FLAME_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_FlameSensor.addObjectProperty(FlameSensor.PROPERTY_RESETTING_FLAME_DETECTION_STATUS).setFunctional();
		oci_FlameSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FlameSensor.PROPERTY_RESETTING_FLAME_DETECTION_STATUS,FlameSensor.MY_URI,1,1));		
		oci_ElectricEnergySensor.setResourceComment("");
		oci_ElectricEnergySensor.setResourceLabel("ElectricEnergySensor");
		oci_ElectricEnergySensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricEnergySensor.addDatatypeProperty(ElectricEnergySensor.PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ElectricEnergySensor.addDatatypeProperty(ElectricEnergySensor.PROPERTY_HAS_MEDIUM_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_MEDIUM_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ElectricEnergySensor.addDatatypeProperty(ElectricEnergySensor.PROPERTY_HAS_SMALL_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_SMALL_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ElectricEnergySensor.addDatatypeProperty(ElectricEnergySensor.PROPERTY_HAS_LARGE_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_LARGE_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ElectricEnergySensor.addDatatypeProperty(ElectricEnergySensor.PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY_MEASUREMENT_LOG).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY_MEASUREMENT_LOG,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ElectricEnergySensor.addDatatypeProperty(ElectricEnergySensor.PROPERTY_HAS_EFFECTIVE_VOLTAGE_VALUE).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_EFFECTIVE_VOLTAGE_VALUE,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_CurrentValueSensor.setResourceComment("");
		oci_CurrentValueSensor.setResourceLabel("CurrentValueSensor");
		oci_CurrentValueSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CurrentValueSensor.addDatatypeProperty(CurrentValueSensor.PROPERTY_HAS_MEASURED_CURRENT_VALUE_1).setFunctional();
		oci_CurrentValueSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CurrentValueSensor.PROPERTY_HAS_MEASURED_CURRENT_VALUE_1,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_CurrentValueSensor.addDatatypeProperty(CurrentValueSensor.PROPERTY_HAS_RATED_VOLTAGE_TO_BE_MEASURED).setFunctional();
		oci_CurrentValueSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CurrentValueSensor.PROPERTY_HAS_RATED_VOLTAGE_TO_BE_MEASURED,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_CurrentValueSensor.addDatatypeProperty(CurrentValueSensor.PROPERTY_HAS_MEASURED_CURRENT_VALUE_2).setFunctional();
		oci_CurrentValueSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CurrentValueSensor.PROPERTY_HAS_MEASURED_CURRENT_VALUE_2,TypeMapper.getDatatypeURI(Float.class),1,1));		
		oci_WaterFlowRateSensor.setResourceComment("");
		oci_WaterFlowRateSensor.setResourceLabel("WaterFlowRateSensor");
		oci_WaterFlowRateSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WaterFlowRateSensor.addDatatypeProperty(WaterFlowRateSensor.PROPERTY_HAS_CUMULATIVE_FLOW_RATE).setFunctional();
		oci_WaterFlowRateSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowRateSensor.PROPERTY_HAS_CUMULATIVE_FLOW_RATE,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterFlowRateSensor.addDatatypeProperty(WaterFlowRateSensor.PROPERTY_HAS_FLOW_RATE).setFunctional();
		oci_WaterFlowRateSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowRateSensor.PROPERTY_HAS_FLOW_RATE,TypeMapper.getDatatypeURI(Integer.class),1,1));	
		oci_MicromotionsSensor.setResourceComment("");
		oci_MicromotionsSensor.setResourceLabel("MicromotionSensor");
		oci_MicromotionsSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_MicromotionsSensor.addObjectProperty(MicromotionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_MicromotionsSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MicromotionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_MicromotionsSensor.addObjectProperty(MicromotionSensor.PROPERTY_HAS_MICROMOTION_DETECTION_STATUS).setFunctional();
		oci_MicromotionsSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MicromotionSensor.PROPERTY_HAS_MICROMOTION_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_MicromotionsSensor.addDatatypeProperty(MicromotionSensor.PROPERTY_HAS_DETECTION_COUNTER).setFunctional();
		oci_MicromotionsSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MicromotionSensor.PROPERTY_HAS_DETECTION_COUNTER,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_MicromotionsSensor.addDatatypeProperty(MicromotionSensor.PROPERTY_HAS_MICROMOTION_SAMPLING_COUNT).setFunctional();
		oci_MicromotionsSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MicromotionSensor.PROPERTY_HAS_MICROMOTION_SAMPLING_COUNT,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_MicromotionsSensor.addDatatypeProperty(MicromotionSensor.PROPERTY_HAS_MICROMOTION_SAMPLING_CYCLE).setFunctional();
		oci_MicromotionsSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MicromotionSensor.PROPERTY_HAS_MICROMOTION_SAMPLING_CYCLE,TypeMapper.getDatatypeURI(Integer.class),0,1));	
		oci_PassageSensor.setResourceComment("");
		oci_PassageSensor.setResourceLabel("PassageSensor");
		oci_PassageSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_PassageSensor.addObjectProperty(PassageSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_PassageSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PassageSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_PassageSensor.addDatatypeProperty(PassageSensor.PROPERTY_HAS_DETECTION_HOLD_TIME).setFunctional();
		oci_PassageSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PassageSensor.PROPERTY_HAS_DETECTION_HOLD_TIME,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_PassageSensor.addObjectProperty(PassageSensor.PROPERTY_HAS_DETECTION_DIRECTION).setFunctional();
		oci_PassageSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PassageSensor.PROPERTY_HAS_DETECTION_DIRECTION,DetectionDirectionValue.MY_URI,1,1));	
		oci_BedPresenceSensor.setResourceComment("");
		oci_BedPresenceSensor.setResourceLabel("BedPresenceSensor");
		oci_BedPresenceSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_BedPresenceSensor.addObjectProperty(BedPresenceSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_BedPresenceSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BedPresenceSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_BedPresenceSensor.addObjectProperty(BedPresenceSensor.PROPERTY_HAS_BED_PRESENCE_DETECTION_STATUS).setFunctional();
		oci_BedPresenceSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BedPresenceSensor.PROPERTY_HAS_BED_PRESENCE_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_OpenCloseSensor.setResourceComment("");
		oci_OpenCloseSensor.setResourceLabel("OpenCloseSensor");
		oci_OpenCloseSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_OpenCloseSensor.addObjectProperty(OpenCloseSensor.PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_1).setFunctional();
		oci_OpenCloseSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OpenCloseSensor.PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_1,ThresholdLevelValue.MY_URI,1,1));
		oci_OpenCloseSensor.addObjectProperty(OpenCloseSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_OpenCloseSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OpenCloseSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_OpenCloseSensor.addObjectProperty(OpenCloseSensor.PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_2).setFunctional();
		oci_OpenCloseSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OpenCloseSensor.PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_2,OccurenceStatusValue.MY_URI,1,1));		
		oci_ActivityMountSensor.setResourceComment("");
		oci_ActivityMountSensor.setResourceLabel("ActivityMountSensor");
		oci_ActivityMountSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ActivityMountSensor.addObjectProperty(ActivityMountSensor.PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_1).setFunctional();
		oci_ActivityMountSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ActivityMountSensor.PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_1,ThresholdLevelValue.MY_URI,1,1));
		oci_ActivityMountSensor.addDatatypeProperty(ActivityMountSensor.PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID).setFunctional();
		oci_ActivityMountSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ActivityMountSensor.PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ActivityMountSensor.addObjectProperty(ActivityMountSensor.PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_2).setFunctional();
		oci_ActivityMountSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ActivityMountSensor.PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_2,ThresholdLevelValue.MY_URI,1,1));
		oci_ActivityMountSensor.addDatatypeProperty(ActivityMountSensor.PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION).setFunctional();
		oci_ActivityMountSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ActivityMountSensor.PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION,TypeMapper.getDatatypeURI(String.class),0,1));	
		oci_HumanBodyLocationSensor.setResourceComment("");
		oci_HumanBodyLocationSensor.setResourceLabel("HumanBodyLocationSensor");
		oci_HumanBodyLocationSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_HumanBodyLocationSensor.addDatatypeProperty(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_DETECTION_LOCATION_1).setFunctional();
		oci_HumanBodyLocationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_DETECTION_LOCATION_1,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_HumanBodyLocationSensor.addDatatypeProperty(HumanBodyLocationSensor.PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID).setFunctional();
		oci_HumanBodyLocationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanBodyLocationSensor.PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_HumanBodyLocationSensor.addDatatypeProperty(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_DETECTION_LOCATION_2).setFunctional();
		oci_HumanBodyLocationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_DETECTION_LOCATION_2,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_HumanBodyLocationSensor.addDatatypeProperty(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION).setFunctional();
		oci_HumanBodyLocationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION,TypeMapper.getDatatypeURI(String.class),0,1));	
		oci_SnowSensor.setResourceComment("");
		oci_SnowSensor.setResourceLabel("SnowSensor");
		oci_SnowSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_SnowSensor.addObjectProperty(SnowSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_SnowSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SnowSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_SnowSensor.addObjectProperty(SnowSensor.PROPERTY_HAS_SNOW_DETECTION_STATUS).setFunctional();
		oci_SnowSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SnowSensor.PROPERTY_HAS_SNOW_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_AirPressureSensor.setResourceComment("");
		oci_AirPressureSensor.setResourceLabel("AirPressureSensor");
		oci_AirPressureSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_AirPressureSensor.addDatatypeProperty(AirPressureSensor.PROPERTY_HAS_MEASURED_AIR_PRESSURE).setFunctional();
		oci_AirPressureSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirPressureSensor.PROPERTY_HAS_MEASURED_AIR_PRESSURE,TypeMapper.getDatatypeURI(Float.class),1,1));
		
		oci_HomeAirConditioner.setResourceComment("");
		oci_HomeAirConditioner.setResourceLabel("HomeAirConditioner");
		oci_HomeAirConditioner.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_TYPE_OF_OPERATION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_TYPE_OF_OPERATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_CURRENT_SETTING_OF_TEMPERATURE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_CURRENT_SETTING_OF_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_RELATIVE_HUMIDITY_IN_DEHUMIDIFICATION_MODE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_RELATIVE_HUMIDITY_IN_DEHUMIDIFICATION_MODE,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_COOLING_MODE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_COOLING_MODE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_HEATING_MODE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_HEATING_MODE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_DEHUMIDICATION_MODE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_DEHUMIDICATION_MODE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_RATED_POWER_CONSUMPTION_IN_MODES).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_RATED_POWER_CONSUMPTION_IN_MODES,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_MEASURED_CURRENT_CONSUMPTION).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MEASURED_CURRENT_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_CURRENT_TEMPERATER_SETTING_OF_REMOTE_CONTROL).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_CURRENT_TEMPERATER_SETTING_OF_REMOTE_CONTROL,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_MEASURED_COOLED_AIR_TEMPERATURE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MEASURED_COOLED_AIR_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_RELATIVE_TEMPERATURE_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_RELATIVE_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_CONTROL_OF_AIR_FLOW_DIRECTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_CONTROL_OF_AIR_FLOW_DIRECTION_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_SWING_OF_AIR_FLOW_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_SWING_OF_AIR_FLOW_SETTING,OperationStateSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AIRFLOW_VERTICAL_DIRECTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AIRFLOW_VERTICAL_DIRECTION_SETTING,AirFlowDirectionSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AIRFLOW_HORIZONTAL_DIRECTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AIRFLOW_HORIZONTAL_DIRECTION_SETTING,AirFlowDirectionSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_SPECIAL_STATE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_SPECIAL_STATE,OperationStateSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_NON_PRIORITY_STATE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_NON_PRIORITY_STATE,OperationStateSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_VENTILATION_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_VENTILATION_FUNCTION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_HUMIDIFIER_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_HUMIDIFIER_FUNCTION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_DEGREE_OF_HUMIDIFICATION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_DEGREE_OF_HUMIDIFICATION_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_CLEANING_METHOD).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_CLEANING_METHOD,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_PURIFIER_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_PURIFIER_FUNCTION_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_REFRESHER_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_REFRESHER_FUNCTION_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_REFRESH_METHOD).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_REFRESH_METHOD,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_SELF_CLEANING_METHOD).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_SELF_CLEANING_METHOD,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_SELF_CLEANING_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_SELF_CLEANING_FUNCTION_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_SPECIAL_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_SPECIAL_FUNCTION_SETTING,OperationFunctionSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_OPERATION_STATUS_OF_COMPONENTS).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_OPERATION_STATUS_OF_COMPONENTS,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_THERMOSTAT_SETTING_OVERRIDE_FUNCTION).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_THERMOSTAT_SETTING_OVERRIDE_FUNCTION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AIR_PURIFICATION_MODE_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AIR_PURIFICATION_MODE_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_BUZZER).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_BUZZER,HomeAirConditioner.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));	
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_SETTING_TIME).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HomeAirConditioner.addDatatypeProperty(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		 
		oci_VentilationFan.setResourceComment("");
		oci_VentilationFan.setResourceLabel("VentilationFan");
		oci_VentilationFan.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_VentilationFan.addObjectProperty(VentilationFan.PROPERTY_HAS_VENTILATION_AUTO_SETTING).setFunctional();
		oci_VentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VentilationFan.PROPERTY_HAS_VENTILATION_AUTO_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_VentilationFan.addObjectProperty(VentilationFan.PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE).setFunctional();
		oci_VentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VentilationFan.PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE,ThresholdLevelValue.MY_URI,0,1));
			
		oci_AirConditionerVentilationFan.setResourceComment("");
		oci_AirConditionerVentilationFan.setResourceLabel("AirConditionerVentilationFan");
		oci_AirConditionerVentilationFan.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_AirConditionerVentilationFan.addDatatypeProperty(AirConditionerVentilationFan.PROPERTY_HAS_SETTING_ROOM_RELATIVE_HUMIDITY).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_SETTING_ROOM_RELATIVE_HUMIDITY,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_VENTILATION_AUTO_SETTING).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_VENTILATION_AUTO_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_AirConditionerVentilationFan.addDatatypeProperty(AirConditionerVentilationFan.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE,ThresholdLevelValue.MY_URI,0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_HEAT_EXCHANGER_OPERATION_SETTING).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_HEAT_EXCHANGER_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_AirConditionerVentilationFan.addDatatypeProperty(AirConditionerVentilationFan.PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_SMOKE_DETECTION_STATUS).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_SMOKE_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		
		oci_AirCleaner.setResourceComment("");
		oci_AirCleaner.setResourceLabel("AirCleaner");
		oci_AirCleaner.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_AirCleaner.addObjectProperty(AirCleaner.PROPERTY_HAS_FILTER_CHANGE_NOTICE).setFunctional();
		oci_AirCleaner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirCleaner.PROPERTY_HAS_FILTER_CHANGE_NOTICE,OccurenceStatusValue.MY_URI,0,1));
		oci_AirCleaner.addObjectProperty(AirCleaner.PROPERTY_HAS_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_AirCleaner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirCleaner.PROPERTY_HAS_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_AirCleaner.addObjectProperty(AirCleaner.PROPERTY_HAS_SMOKE_DETECTION_STATUS).setFunctional();
		oci_AirCleaner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirCleaner.PROPERTY_HAS_SMOKE_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_AirCleaner.addObjectProperty(AirCleaner.PROPERTY_HAS_OPTICAL_CATALYST_OPERATION_SETTING).setFunctional();
		oci_AirCleaner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirCleaner.PROPERTY_HAS_OPTICAL_CATALYST_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_AirCleaner.addObjectProperty(AirCleaner.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS).setFunctional();
		oci_AirCleaner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirCleaner.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		
		oci_Humidifier.setResourceComment("");
		oci_Humidifier.setResourceLabel("Humidifier");
		oci_Humidifier.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_RELATIVE_HUMIDIFYING_SETTING).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_RELATIVE_HUMIDIFYING_SETTING,HumidifyingLevelValue.MY_URI,1,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_HUMIDIFYING_LEVEL_SETTING).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_HUMIDIFYING_LEVEL_SETTING,HumidifyingLevelValue.MY_URI,1,1));
		oci_Humidifier.addDatatypeProperty(Humidifier.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_Humidifier.addDatatypeProperty(Humidifier.PROPERTY_HAS_OFF_TIMER_RESERVATION_RELATIVE_TIME_VALUE).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_OFF_TIMER_RESERVATION_RELATIVE_TIME_VALUE,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_ION_EMISSION_SETTING).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_ION_EMISSION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD,IonEmissionMethodValue.MY_URI,0,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_WATER_AMOUNT_LEVEL).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_WATER_AMOUNT_LEVEL,LiquidAmountLevelValue.MY_URI,0,1));
		
		oci_ElectricHeater.setResourceComment("");
		oci_ElectricHeater.setResourceLabel("ElectricHeater");
		oci_ElectricHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricHeater.addDatatypeProperty(ElectricHeater.PROPERTY_HAS_TEMPERATURE_SETTING).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ElectricHeater.addDatatypeProperty(ElectricHeater.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ElectricHeater.addDatatypeProperty(ElectricHeater.PROPERTY_HAS_REMOTELY_SET_TEMPERATURE).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_REMOTELY_SET_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricHeater.addDatatypeProperty(ElectricHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ElectricHeater.addDatatypeProperty(ElectricHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricHeater.addDatatypeProperty(ElectricHeater.PROPERTY_HAS_OFF_TIMER_SETTING_TIME).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_OFF_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ElectricHeater.addDatatypeProperty(ElectricHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		
		
		oci_FanHeater.setResourceComment("");
		oci_FanHeater.setResourceLabel("FanHeater");
		oci_FanHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_FanHeater.addDatatypeProperty(FanHeater.PROPERTY_HAS_TEMPERATURE_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_FanHeater.addDatatypeProperty(FanHeater.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_FanHeater.addDatatypeProperty(FanHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FanHeater.addDatatypeProperty(FanHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_FanHeater.addDatatypeProperty(FanHeater.PROPERTY_HAS_OFF_TIMER_SETTING_TIME).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_OFF_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FanHeater.addDatatypeProperty(FanHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_EXTENSIONAL_OPERATION_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_EXTENSIONAL_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_FanHeater.addDatatypeProperty(FanHeater.PROPERTY_HAS_EXTENSIONAL_OPERATION_TIMER_SETTING_TIME).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_EXTENSIONAL_OPERATION_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_ION_EMISSION_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_ION_EMISSION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD,IonEmissionMethodValue.MY_URI,0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_OIL_AMOUNT_LEVEL).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_OIL_AMOUNT_LEVEL,LiquidAmountLevelValue.MY_URI,0,1));
		
		oci_ElectricStorageHeater.setResourceComment("");
		oci_ElectricStorageHeater.setResourceLabel("ElectricStorageHeater");
		oci_ElectricStorageHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_TEMPERATURE_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_MEASURED_INDOOR_TEMPERATURE).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_MEASURED_INDOOR_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_MEASURED_OUTDOOR_TEMPERATURE).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_MEASURED_OUTDOOR_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_OPERATION_STATUS).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_OPERATION_STATUS,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_HEAT_STORAGE_OPERATION_STATUS).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_HEAT_STORAGE_OPERATION_STATUS,OperationStatusValue.MY_URI,1,1));
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_HEAT_STORAGE_TEMPERATURE_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_HEAT_STORAGE_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_MEASURED_STORED_HEAT_TEMPERATURE).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_MEASURED_STORED_HEAT_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_DAYTIME_HEAT_STORAGE_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_DAYTIME_HEAT_STORAGE_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_DAYTIME_HEAT_STORAGE_ABILITY).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_DAYTIME_HEAT_STORAGE_ABILITY,OperationStatusValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_MIDNIGHT_POWER_DURATION_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_MIDNIGHT_POWER_DURATION_SETTING,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_MIDNIGHT_POWER_START_TIME_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_MIDNIGHT_POWER_START_TIME_SETTING,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_RADIATION_METHOD).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_RADIATION_METHOD,RadiationMethodValue.MY_URI,1,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_CHILD_LOCK_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_CHILD_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_ON_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_ON_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_OFF_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_OFF_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_ON_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_ON_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ElectricStorageHeater.addDatatypeProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_OFF_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_OFF_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		
		oci_PackageTypeCommercialAirconditionerIndoorUnit.setResourceComment("");
		oci_PackageTypeCommercialAirconditionerIndoorUnit.setResourceLabel("PackageTypeCommercialAirconditionerIndoorUnit");
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addDatatypeProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_MEASURED_INDOOR_UNIT_TEMPERATURE).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_MEASURED_INDOOR_UNIT_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_THERMOSTAT_STATE).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_THERMOSTAT_STATE,OperationStatusValue.MY_URI,1,1));
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addDatatypeProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_CURRENT_FUNCTION).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_CURRENT_FUNCTION,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addDatatypeProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_GROUP_INFOMRATION).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_GROUP_INFOMRATION,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_POWER_CONSUMPTION_RANGE_INDOOR_UNIT).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_POWER_CONSUMPTION_RANGE_INDOOR_UNIT,PowerConsumptionRange.MY_URI,0,1));
	
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.setResourceComment("");
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.setResourceLabel("PackageTypeCommercialAirconditionerOutdoorUnit");
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addDatatypeProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_TEMPERATURE).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addDatatypeProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_OUTDOOR_UNIT_RATED_POWER_CONSUMPTION).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_OUTDOOR_UNIT_RATED_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addDatatypeProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_SPECIAL_STATE).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_SPECIAL_STATE,OperationStateSettingValue.MY_URI,0,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addDatatypeProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_GROUP_INFOMRATION).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_GROUP_INFOMRATION,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addDatatypeProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_POSSIBLE_POWER_SAVING_FOR_OUTDOOR_UNIT).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_POSSIBLE_POWER_SAVING_FOR_OUTDOOR_UNIT,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addDatatypeProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_SETTING_RESTRICTING_POWER_CONSUMPTION_FOR_OUTDOOR_UNIT).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_SETTING_RESTRICTING_POWER_CONSUMPTION_FOR_OUTDOOR_UNIT,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addDatatypeProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MINUMUM_POWER_CONSUMPTION_FOR_RESTRICTED_OUTDOOR_UNIT).setFunctional();	
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MINUMUM_POWER_CONSUMPTION_FOR_RESTRICTED_OUTDOOR_UNIT,TypeMapper.getDatatypeURI(Integer.class),0,1));
		
		
		oci_ElectricBlind.setResourceComment("");
		oci_ElectricBlind.setResourceLabel("ElectricBlind");
		oci_ElectricBlind.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_TIMER_OPERATION_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_TIMER_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_WIND_DETECTION_STATUS).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_WIND_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_SUN_LIGHT_DETECTION_STATUS).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_SUN_LIGHT_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_CLOSING_SPEED_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricBlind.addDatatypeProperty(ElectricBlind.PROPERTY_HAS_OPERATION_TIME).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_OPERATION_TIME,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_AUTOMATIC_OPERATION_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_AUTOMATIC_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricBlind.addDatatypeProperty(ElectricBlind.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricBlind.addDatatypeProperty(ElectricBlind.PROPERTY_HAS_SHADE_ANGLE_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_SHADE_ANGLE_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_SPEED).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_SPEED,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_ELECTRIC_LOCK_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_ELECTRIC_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		oci_ElectricShuttler.setResourceComment("");
		oci_ElectricShuttler.setResourceLabel("ElectricShuttler");
		oci_ElectricShuttler.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_TIMER_OPERATION_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_TIMER_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricShuttler.addDatatypeProperty(ElectricShutter.PROPERTY_HAS_OPERATION_TIME).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_OPERATION_TIME,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricShuttler.addDatatypeProperty(ElectricShutter.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricShuttler.addDatatypeProperty(ElectricShutter.PROPERTY_HAS_BLIND_ANGLE_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_BLIND_ANGLE_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_SPEED).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_SPEED,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_ELECTRIC_LOCK_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_ELECTRIC_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		
		oci_ElectricRainSlidingShutter.setResourceComment("");
		oci_ElectricRainSlidingShutter.setResourceLabel("ElectricRainSlidingShutter");
		oci_ElectricRainSlidingShutter.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_TIMER_OPERATION_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_TIMER_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addDatatypeProperty(ElectricRainSlidingShutter.PROPERTY_HAS_OPERATION_TIME).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_OPERATION_TIME,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_OPEN_CLOSE_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_OPEN_CLOSE_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricRainSlidingShutter.addDatatypeProperty(ElectricRainSlidingShutter.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricRainSlidingShutter.addDatatypeProperty(ElectricRainSlidingShutter.PROPERTY_HAS_BLIND_ANGLE_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_BLIND_ANGLE_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_ELECTRIC_LOCK_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_ELECTRIC_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		oci_ElectricGate.setResourceComment("");
		oci_ElectricGate.setResourceLabel("ElectricGate");
		oci_ElectricGate.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricGate.addDatatypeProperty(ElectricGate.PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricGate.addDatatypeProperty(ElectricGate.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_ELECTRIC_LOCK_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_ELECTRIC_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		oci_ElectricWindow.setResourceComment("");
		oci_ElectricWindow.setResourceLabel("ElectricWindow");
		oci_ElectricWindow.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_TIMER_OPERATION_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_TIMER_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_REGISTERED_TEMPERATURE_DETECTION_STATUS).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_REGISTERED_TEMPERATURE_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_RAIN_DETECTION_STATUS).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_RAIN_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricWindow.addDatatypeProperty(ElectricWindow.PROPERTY_HAS_OPERATION_TIME).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_OPERATION_TIME,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_AUTOMATIC_OPERATION_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_AUTOMATIC_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_OPEN_CLOSE_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_OPEN_CLOSE_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricWindow.addDatatypeProperty(ElectricWindow.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_ELECTRIC_LOCK_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_ELECTRIC_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		oci_ElectricSlidingDoor.setResourceComment("");
		oci_ElectricSlidingDoor.setResourceLabel("ElectricSlidingDoor");
		oci_ElectricSlidingDoor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addDatatypeProperty(ElectricSlidingDoor.PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_ElectricSlidingDoor.addDatatypeProperty(ElectricSlidingDoor.PROPERTY_HAS_OPENING_TIME_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPENING_TIME_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricSlidingDoor.addDatatypeProperty(ElectricSlidingDoor.PROPERTY_HAS_DEGREE_OF_OPENING_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_DEGREE_OF_OPENING_SETTING,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		oci_GardenSprinkler.setResourceComment("");
		oci_GardenSprinkler.setResourceLabel("GardenSprinkler");
		oci_GardenSprinkler.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_GardenSprinkler.addObjectProperty(GardenSprinkler.PROPERTY_HAS_SPRINKLE_VALUE_OPEN_CLOSE_SETTING).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_SPRINKLE_VALUE_OPEN_CLOSE_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_GardenSprinkler.addObjectProperty(GardenSprinkler.PROPERTY_HAS_SPRINKLE_INTERVAL_SETTING).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_SPRINKLE_INTERVAL_SETTING,IntervalSettingValue.MY_URI,0,1));
		oci_GardenSprinkler.addObjectProperty(GardenSprinkler.PROPERTY_HAS_NUMBER_OF_SPRINKLES_SETTING).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_NUMBER_OF_SPRINKLES_SETTING,NumberOfSprinkleSettingValue.MY_URI,0,1));
		oci_GardenSprinkler.addDatatypeProperty(GardenSprinkler.PROPERTY_HAS_SPRINKLE_TIME_SETTING_1).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_SPRINKLE_TIME_SETTING_1,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_GardenSprinkler.addDatatypeProperty(GardenSprinkler.PROPERTY_HAS_SPRINKLE_TIME_SETTING_2).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_SPRINKLE_TIME_SETTING_2,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_GardenSprinkler.addDatatypeProperty(GardenSprinkler.PROPERTY_HAS_SPRINKLE_DURATION_SETTING).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_SPRINKLE_DURATION_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
	
		oci_WaterHeater.setResourceComment("");
		oci_WaterHeater.setResourceLabel("WaterHeater");
		oci_WaterHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_AUTOMATIC_WATER_HEATING_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_AUTOMATIC_WATER_HEATING_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_WATER_HEATER_STATUS).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_WATER_HEATER_STATUS,OperationStatusValue.MY_URI,1,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_WATER_HEATING_TEMPERATURE_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_WATER_HEATING_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_TANK_OPERATION_MODE_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_TANK_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_DAYTIME_REHEATING_PERMISSION_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_DAYTIME_REHEATING_PERMISSION_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_OF_WATER_HEATER).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_OF_WATER_HEATER,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_ALARM_STATUS).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_ALARM_STATUS,AlarmStatusValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_HOT_WATER_SUPPLY_STATUS).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_HOT_WATER_SUPPLY_STATUS,OperationStatusValue.MY_URI,1,1));	
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_RELATIVE_TIME_SETTING_FOR_KEEPING_BATH_TEMPERATURE).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_RELATIVE_TIME_SETTING_FOR_KEEPING_BATH_TEMPERATURE,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_TANK_CAPACITY).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_TANK_CAPACITY,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_AUTOMATIC_BATH_WATER_HEATING_MODE_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_AUTOMATIC_BATH_WATER_HEATING_MODE_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_BATHROOM_PRIORITY_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATHROOM_PRIORITY_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR,OperationStateSettingValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_MANUAL_BATH_HOT_WATER_ADDITION_FUNCTION_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MANUAL_BATH_HOT_WATER_ADDITION_FUNCTION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_MANUAL_LUKEWARM_WATER_TEMPERATURE_LOWERING_FUNCTION_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MANUAL_LUKEWARM_WATER_TEMPERATURE_LOWERING_FUNCTION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2,ThresholdLevelValue.MY_URI,0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_ON_TIMER_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_ON_TIMER_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_VOLUME_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_VOLUME_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_MUTE_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MUTE_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_REMAINING_HOT_WATER_VOLUME).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_REMAINING_HOT_WATER_VOLUME,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_PARTICIPATION_IN_ENERGY_SHIFT).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_PARTICIPATION_IN_ENERGY_SHIFT,OperationStatusValue.MY_URI,1,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_STANDARD_TIME_TO_START_HEATING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_STANDARD_TIME_TO_START_HEATING,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_2).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_2,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_WaterHeater.addDatatypeProperty(WaterHeater.PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2,TypeMapper.getDatatypeURI(Integer.class),1,1));
		
		
		oci_ElectricToiletSeat.setResourceComment("");
		oci_ElectricToiletSeat.setResourceLabel("ElectricToiletSeat");
		oci_ElectricToiletSeat.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPERATURE_LEVEL).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPERATURE_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_HEATER_SETTING).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_HEATER_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_SETTING).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_SETTING,OperationFunctionSettingValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addDatatypeProperty(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_START_TIME).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_START_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ElectricToiletSeat.addDatatypeProperty(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_DURATION).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_DURATION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_TEMPERATURE_LEVEL_SETTING).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_TEMPERATURE_LEVEL_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_SETTING).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_STATUS).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addDatatypeProperty(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_START_TIME).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_START_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ElectricToiletSeat.addDatatypeProperty(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_DURATION).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_DURATION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_HUMAN_DETECTION_STATUS).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_HUMAN_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_SEATING_DETECTION_STATUS).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_SEATING_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		
		oci_ElectricLock.setResourceComment("");
		oci_ElectricLock.setResourceLabel("ElectricLock");
		oci_ElectricLock.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_LOCK_SETTING_1).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_LOCK_SETTING_1,OperationModeSettingValue.MY_URI,1,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_LOCK_SETTING_2).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_LOCK_SETTING_2,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_DOOR_GUARD_LOCK_STATUS).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_DOOR_GUARD_LOCK_STATUS,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_OCCUPANT_STATUS).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_OCCUPANT_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_ALARM_STATUS).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_ALARM_STATUS,AlarmStatusValue.MY_URI,1,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_AUTO_LOCK_MODE_SETTING).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_AUTO_LOCK_MODE_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_LOCK_BATTERY_LEVEL).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_LOCK_BATTERY_LEVEL,OperationStateSettingValue.MY_URI,1,1));
		
		oci_InstantaneousWaterHeater.setResourceComment("");
		oci_InstantaneousWaterHeater.setResourceLabel("InstantaneousWaterHeater");
		oci_InstantaneousWaterHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_HEATING_STATUS).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_HEATING_STATUS,OperationStatusValue.MY_URI,1,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_TEMPERATURE_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_WARMER_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_WARMER_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_DURATION_OF_AUTOMATIC_OPERATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_DURATION_OF_AUTOMATIC_OPERATION_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_REMAINING_AUTOMATIC_OPERATION_TIME).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_REMAINING_AUTOMATIC_OPERATION_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_TEMPERATURE_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_HEATER_STATUS).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_HEATER_STATUS,OperationModeSettingValue.MY_URI,1,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_AUTO_MODE_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_AUTO_MODE_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_ADDITIONAL_BOILUP_OPERATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_ADDITIONAL_BOILUP_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_HOT_WATER_ADDING_OPERATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_HOT_WATER_ADDING_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_LOWERING_OPERATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_LOWERING_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2,ThresholdLevelValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETTABLE_LEVEL).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETTABLE_LEVEL,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATHROOM_PRIORITY_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATHROOM_PRIORITY_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_SHOWER_HOT_WATER_SUPPLY_STATUS).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_SHOWER_HOT_WATER_SUPPLY_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_KITCHEN_HOT_WATER_SUPPLY_STATUS).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_KITCHEN_HOT_WATER_SUPPLY_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_WATER_WARMER_ON_TIMER_RESERVATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_WATER_WARMER_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_WATER_WARMER_ON_TIMER_SETTING_TIME).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_WATER_WARMER_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR,OperationStateSettingValue.MY_URI,1,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_InstantaneousWaterHeater.addDatatypeProperty(InstantaneousWaterHeater.PROPERTY_HAS_VOLUME_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_VOLUME_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_MUTE_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_MUTE_SETTING,OperationStatusValue.MY_URI,0,1));
		
		
		oci_BathRoomHeaterDryer.setResourceComment("");
		oci_BathRoomHeaterDryer.setResourceLabel("BathRoomHeaterDryer");
		oci_BathRoomHeaterDryer.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_VENTILATION_OPERATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_VENTILATION_OPERATION_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_PRE_WARM_OPERATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_PRE_WARM_OPERATION_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_HEATER_OPERATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_HEATER_OPERATION_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_DRYER_OPERATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_DRYER_OPERATION_SETTING,ThresholdLevelValue.MY_URI,1,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_AIR_CICURLATOR_OPERATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_AIR_CICURLATOR_OPERATION_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addDatatypeProperty(BathRoomHeaterDryer.PROPERTY_HAS_MEASURED_BATHROOM_RELATIVE_HUMIDITY).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_MEASURED_BATHROOM_RELATIVE_HUMIDITY,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_BathRoomHeaterDryer.addDatatypeProperty(BathRoomHeaterDryer.PROPERTY_HAS_MEASURED_BATHROOM_TEMPERATURE).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_MEASURED_BATHROOM_TEMPERATURE,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_FILTER_CLEANING_REMINDER_SIGN_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_FILTER_CLEANING_REMINDER_SIGN_SETTING,OccurenceStatusValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_HUMAN_BODY_DETECTION_STATUS).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_HUMAN_BODY_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_1).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_1,OperationStatusValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_2).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_2,OperationModeSettingValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addDatatypeProperty(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_BathRoomHeaterDryer.addDatatypeProperty(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addDatatypeProperty(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_SETTING_TIME).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_BathRoomHeaterDryer.addDatatypeProperty(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		
		oci_HouseHoldSolarPowerGeneration.setResourceComment("");
		oci_HouseHoldSolarPowerGeneration.setResourceLabel("HouseHoldSolarPowerGeneration");
		oci_HouseHoldSolarPowerGeneration.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE,OperationFunctionSettingValue.MY_URI,0,1));
		oci_HouseHoldSolarPowerGeneration.addDatatypeProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_INSTANTANEOUS_ELECTRIC_ENERGY_GENERATED_AMOUNT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_INSTANTANEOUS_ELECTRIC_ENERGY_GENERATED_AMOUNT,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_HouseHoldSolarPowerGeneration.addDatatypeProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT,HouseHoldSolarPowerGeneration.MY_URI,1,1));
		oci_HouseHoldSolarPowerGeneration.addDatatypeProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT,HouseHoldSolarPowerGeneration.MY_URI,0,1));
		oci_HouseHoldSolarPowerGeneration.addDatatypeProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_HouseHoldSolarPowerGeneration.addDatatypeProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_HouseHoldSolarPowerGeneration.addDatatypeProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_HouseHoldSolarPowerGeneration.addDatatypeProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_SYSTEM_INTERCONNECTED).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_SYSTEM_INTERCONNECTED,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_HouseHoldSolarPowerGeneration.addDatatypeProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_INDEPENDENT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_INDEPENDENT,TypeMapper.getDatatypeURI(Integer.class),0,1));
		
		oci_ColdHotWaterHeatSourceEquipment.setResourceComment("");
		oci_ColdHotWaterHeatSourceEquipment.setResourceLabel("ColdHotWaterHeatSourceEquipment");
		oci_ColdHotWaterHeatSourceEquipment.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ColdHotWaterHeatSourceEquipment.addObjectProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_WATER_TEMPERATURE_SETTING_1).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_WATER_TEMPERATURE_SETTING_1,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_WATER_TEMPERATURE_SETTING_2).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_WATER_TEMPERATURE_SETTING_2,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_MEASURED_OUTWARD_WATER_TEMPERATURE).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_MEASURED_OUTWARD_WATER_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_MEASURED_INWARD_WATER_TEMPERATURE).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_MEASURED_INWARD_WATER_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ColdHotWaterHeatSourceEquipment.addObjectProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_SPECIAL_OPERATION_SETTING).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_SPECIAL_OPERATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ColdHotWaterHeatSourceEquipment.addObjectProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_DAILY_TIMER_SETTING_STATUS).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_DAILY_TIMER_SETTING_STATUS,OperationFunctionSettingValue.MY_URI,0,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_DAILY_TIMER_SETTING_1).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_DAILY_TIMER_SETTING_1,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_DAILY_TIMER_SETTING_2).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_DAILY_TIMER_SETTING_2,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ColdHotWaterHeatSourceEquipment.addObjectProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ColdHotWaterHeatSourceEquipment.addObjectProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_OFF_TIMER_SETTING_TIME).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_OFF_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_RATED_POWER_CONSUMPTION).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_RATED_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ColdHotWaterHeatSourceEquipment.addDatatypeProperty(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_POWER_CONSUMPTION_MEASUREMENT_METHOD).setFunctional();
		oci_ColdHotWaterHeatSourceEquipment.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ColdHotWaterHeatSourceEquipment.PROPERTY_HAS_POWER_CONSUMPTION_MEASUREMENT_METHOD,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_FloorHeater.setResourceComment("");
		oci_FloorHeater.setResourceLabel("FloorHeater");
		oci_FloorHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_FloorHeater.addDatatypeProperty(FloorHeater.PROPERTY_HAS_TEMPERATURE_SETTING_1).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_TEMPERATURE_SETTING_1,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_FloorHeater.addObjectProperty(FloorHeater.PROPERTY_HAS_TEMPERATURE_SETTING_2).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_TEMPERATURE_SETTING_2,ThresholdLevelValue.MY_URI,1,1));
		oci_FloorHeater.addObjectProperty(FloorHeater.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE,ThresholdLevelValue.MY_URI,0,1));
		oci_FloorHeater.addObjectProperty(FloorHeater.PROPERTY_HAS_MEASURED_FLOOR_TEMPERATURE).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_MEASURED_FLOOR_TEMPERATURE,ThresholdLevelValue.MY_URI,0,1));
		oci_FloorHeater.addDatatypeProperty(FloorHeater.PROPERTY_HAS_ZONE_CHANGE_SETTING).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_ZONE_CHANGE_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FloorHeater.addObjectProperty(FloorHeater.PROPERTY_HAS_SPECIAL_OPERATION_SETTING).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_SPECIAL_OPERATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_FloorHeater.addObjectProperty(FloorHeater.PROPERTY_HAS_DAILY_TIMER_SETTING_STATUS).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_DAILY_TIMER_SETTING_STATUS,OperationFunctionSettingValue.MY_URI,0,1));
		oci_FloorHeater.addDatatypeProperty(FloorHeater.PROPERTY_HAS_DAILY_TIMER_SETTING_1).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_DAILY_TIMER_SETTING_1,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FloorHeater.addDatatypeProperty(FloorHeater.PROPERTY_HAS_DAILY_TIMER_SETTING_2).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_DAILY_TIMER_SETTING_2,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FloorHeater.addObjectProperty(FloorHeater.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_FloorHeater.addDatatypeProperty(FloorHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FloorHeater.addDatatypeProperty(FloorHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FloorHeater.addObjectProperty(FloorHeater.PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_FloorHeater.addDatatypeProperty(FloorHeater.PROPERTY_HAS_OFF_TIMER_SETTING_TIME).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_OFF_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FloorHeater.addDatatypeProperty(FloorHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_FloorHeater.addDatatypeProperty(FloorHeater.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_FloorHeater.addDatatypeProperty(FloorHeater.PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_FloorHeater.addDatatypeProperty(FloorHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_FloorHeater.addObjectProperty(FloorHeater.PROPERTY_HAS_POWER_CONSUMPTION_MEASUREMENT_METHOD).setFunctional();
		oci_FloorHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FloorHeater.PROPERTY_HAS_POWER_CONSUMPTION_MEASUREMENT_METHOD,MeasurementMethodValue.MY_URI,0,1));
		
		oci_FuelCell.setResourceComment("");
		oci_FuelCell.setResourceLabel("FuelCell");
		oci_FuelCell.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_FuelCell.addDatatypeProperty(FuelCell.PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_IN_WATER_HEATER_MODE).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_IN_WATER_HEATER_MODE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_FuelCell.addDatatypeProperty(FuelCell.PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_FuelCell.addDatatypeProperty(FuelCell.PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_FuelCell.addDatatypeProperty(FuelCell.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_FuelCell.addDatatypeProperty(FuelCell.PROPERTY_HAS_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_FuelCell.addObjectProperty(FuelCell.PROPERTY_RESET_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_RESET_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT,FuelCell.MY_URI,1,1));
		oci_FuelCell.addDatatypeProperty(FuelCell.PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_FuelCell.addDatatypeProperty(FuelCell.PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_FuelCell.addObjectProperty(FuelCell.PROPERTY_RESET_MEASURED_CUMMULATIVE_GAS_CONSUMPTION).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_RESET_MEASURED_CUMMULATIVE_GAS_CONSUMPTION,FuelCell.MY_URI,1,1));
		oci_FuelCell.addObjectProperty(FuelCell.PROPERTY_HAS_POWER_GENERATION_SETTING).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_POWER_GENERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_FuelCell.addObjectProperty(FuelCell.PROPERTY_HAS_POWER_GENERATION_STATE).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_POWER_GENERATION_STATE,OperationStateSettingValue.MY_URI,0,1));
		oci_FuelCell.addDatatypeProperty(FuelCell.PROPERTY_HAS_MEASURED_IN_HOUSE_INSTANTANEOUS_POWER_POWER_CONSUMPTION).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_MEASURED_IN_HOUSE_INSTANTANEOUS_POWER_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_FuelCell.addDatatypeProperty(FuelCell.PROPERTY_HAS_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_FuelCell.addObjectProperty(FuelCell.PROPERTY_RESET_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_RESET_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION,FuelCell.MY_URI,1,1));
		oci_FuelCell.addObjectProperty(FuelCell.PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE,OperationFunctionSettingValue.MY_URI,0,1));
		oci_FuelCell.addDatatypeProperty(FuelCell.PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_FuelCell.addDatatypeProperty(FuelCell.PROPERTY_HAS_TANK_CAPACITY).setFunctional();
		oci_FuelCell.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FuelCell.PROPERTY_HAS_TANK_CAPACITY,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_StorageBattery.setResourceComment("");
		oci_StorageBattery.setResourceLabel("StorageBattery");
		oci_StorageBattery.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_StorageBattery.addObjectProperty(StorageBattery.PROPERTY_HAS_IDENTIFICATION_NUMBER).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_IDENTIFICATION_NUMBER,IdentificationNumberValue.MY_URI,1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_CURRENT_DATE_SETTING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_CURRENT_DATE_SETTING,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_CURRENT_TIME_SETTING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_CURRENT_TIME_SETTING,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_CHARGING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_CHARGING,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_DISCHARGING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_DISCHARGING,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_CHARGEABLE_CAPACITY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_CHARGEABLE_CAPACITY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_DISCHARGEABLE_CAPACITY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_DISCHARGEABLE_CAPACITY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_CHARGEABLE_ELECTRIC_ENERGY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_CHARGEABLE_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_DISCHARGEABLE_ELECTRIC_ENERGY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_DISCHARGEABLE_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_CHARGE_UPPER_LIMIT_SETTING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_CHARGE_UPPER_LIMIT_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_DISCHARGE_LOWER_LIMIT_SETTING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_DISCHARGE_LOWER_LIMIT_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_CHARGE_AMOUNT_SETTING_VALUE).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_CHARGE_AMOUNT_SETTING_VALUE,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_DISCHARGE_AMOUNT_SETTING_VALUE).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_DISCHARGE_AMOUNT_SETTING_VALUE,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_StorageBattery.addObjectProperty(StorageBattery.PROPERTY_HAS_RE_INTERCONNECTION_PERMISSION_SETTING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_RE_INTERCONNECTION_PERMISSION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_StorageBattery.addObjectProperty(StorageBattery.PROPERTY_HAS_OPERATION_PERMISSION_SETTING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_OPERATION_PERMISSION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_StorageBattery.addObjectProperty(StorageBattery.PROPERTY_HAS_INDEPENDENT_OPERATION_PERMISSION_SETTING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_INDEPENDENT_OPERATION_PERMISSION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_StorageBattery.addObjectProperty(StorageBattery.PROPERTY_HAS_WORKING_OPERATION_STATUS).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_WORKING_OPERATION_STATUS,OperationModeSettingValue.MY_URI,1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_RATED_ELECTRIC_ENERGY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_RATED_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_RATED_ELECTRIC_ENERGY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_RATED_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_RATED_CAPACITY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_RATED_CAPACITY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_RATED_VOLTAGE).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_RATED_VOLTAGE,TypeMapper.getDatatypeURI(Float.class),0,1));	
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_POWER).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_POWER,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_CURRENT).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_CURRENT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_VOLTAGE).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_VOLTAGE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addObjectProperty(StorageBattery.PROPERTY_RESET_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_RESET_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY,StorageBattery.MY_URI,1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_AC_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_AC_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addObjectProperty(StorageBattery.PROPERTY_RESET_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_RESET_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY,StorageBattery.MY_URI,1,1));
		oci_StorageBattery.addObjectProperty(StorageBattery.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_StorageBattery.addObjectProperty(StorageBattery.PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE,OperationFunctionSettingValue.MY_URI,0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER_INDEPENDENT).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER_INDEPENDENT,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER_INDEPENDENT).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER_INDEPENDENT,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_CURRENT_INDEPENDENT).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_CURRENT_INDEPENDENT,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_CURRENT_INDEPENDENT).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_CURRENT_INDEPENDENT,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_1).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_1,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_2).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_2,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_BATTERY_STATE_OF_HEALTH).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_BATTERY_STATE_OF_HEALTH,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_BATTERY_TYPE).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_BATTERY_TYPE,TypeMapper.getDatatypeURI(String.class),1,1));		
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_1).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_1,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_2).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_StorageBattery.addDatatypeProperty(StorageBattery.PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT).setFunctional();
		oci_StorageBattery.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(StorageBattery.PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_VehicleChargerDischarger.setResourceComment("");
		oci_VehicleChargerDischarger.setResourceLabel("VehicleCharger");
		oci_VehicleChargerDischarger.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_DISCHARGEABLE_CAPACITY_1).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_DISCHARGEABLE_CAPACITY_1,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_DISCHARGEABLE_CAPACITY_2).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_DISCHARGEABLE_CAPACITY_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_1).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_1,TypeMapper.getDatatypeURI(Float.class),1,1));	
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_2).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_3).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_REMANING_DISCHARGEABLE_CAPACITY_3,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_RATED_CHARGE_CAPACITY).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_RATED_CHARGE_CAPACITY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_RATED_DISCHARGE_CAPACITY).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_RATED_DISCHARGE_CAPACITY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleChargerDischarger.addObjectProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_STATUS).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_STATUS,OperationStateSettingValue.MY_URI,1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_VehicleChargerDischarger.addObjectProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_CHARGER_TYPE).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_CHARGER_TYPE,ChargerDischargerTypeValue.MY_URI,1,1));
		oci_VehicleChargerDischarger.addObjectProperty(ElectricVehicleChargerDischager.PROPERTY_SET_VEHICLE_CONNECTION_CONFIRMATION).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_SET_VEHICLE_CONNECTION_CONFIRMATION,ElectricVehicleChargerDischager.MY_URI,1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_VEHICLE_MOUNTED_BATTERY_REMAINING_CHARGEABLE_CAPACITY).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_VEHICLE_MOUNTED_BATTERY_REMAINING_CHARGEABLE_CAPACITY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_RATED_VOLTAGE).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_RATED_VOLTAGE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_CURRENT).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_CURRENT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_VOLTAGE).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_VOLTAGE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addObjectProperty(ElectricVehicleChargerDischager.PROPERTY_RESET_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_RESET_MEASURED_CUMULATIVE_DISCHARGING_ELECTRIC_ENERGY,ElectricVehicleChargerDischager.MY_URI,1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addObjectProperty(ElectricVehicleChargerDischager.PROPERTY_RESET_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_RESET_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY,ElectricVehicleChargerDischager.MY_URI,1,1));
		oci_VehicleChargerDischarger.addObjectProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_VehicleChargerDischarger.addObjectProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_SYSTEM_INTERCONNECTED_TYPE).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_SYSTEM_INTERCONNECTED_TYPE,OperationFunctionSettingValue.MY_URI,0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_ID).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_VEHICLE_ID,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_DISCHARGING_ELECTRIC_ENERGY_SETTING).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_DISCHARGING_ELECTRIC_ENERGY_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleChargerDischarger.addDatatypeProperty(ElectricVehicleChargerDischager.PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT).setFunctional();
		oci_VehicleChargerDischarger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricVehicleChargerDischager.PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_EngineCogeneration.setResourceComment("");
		oci_EngineCogeneration.setResourceLabel("EngineCogeneration");
		oci_EngineCogeneration.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_EngineCogeneration.addDatatypeProperty(EngineCogeneration.PROPERTY_HAS_WATER_TEMPERATURE_IN_WATER_HEATER).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_WATER_TEMPERATURE_IN_WATER_HEATER,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_EngineCogeneration.addDatatypeProperty(EngineCogeneration.PROPERTY_HAS_RATED_POWER_GENERATION_OUTPUT).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_RATED_POWER_GENERATION_OUTPUT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_EngineCogeneration.addDatatypeProperty(EngineCogeneration.PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_EngineCogeneration.addDatatypeProperty(EngineCogeneration.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_EngineCogeneration.addDatatypeProperty(EngineCogeneration.PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_EngineCogeneration.addObjectProperty(EngineCogeneration.PROPERTY_RESET_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_RESET_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT,EngineCogeneration.MY_URI,0,1));
		oci_EngineCogeneration.addDatatypeProperty(EngineCogeneration.PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_EngineCogeneration.addDatatypeProperty(EngineCogeneration.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_EngineCogeneration.addObjectProperty(EngineCogeneration.PROPERTY_RESET_MEASURED_CUMULATIVE_GAS_CONSUMPTION).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_RESET_MEASURED_CUMULATIVE_GAS_CONSUMPTION,EngineCogeneration.MY_URI,0,1));
		oci_EngineCogeneration.addObjectProperty(EngineCogeneration.PROPERTY_HAS_POWER_GENERATION_SETTING).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_POWER_GENERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_EngineCogeneration.addObjectProperty(EngineCogeneration.PROPERTY_HAS_POWER_GENERATION_STATUS).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_POWER_GENERATION_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_EngineCogeneration.addDatatypeProperty(EngineCogeneration.PROPERTY_HAS_IN_HOUSE_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_IN_HOUSE_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_EngineCogeneration.addDatatypeProperty(EngineCogeneration.PROPERTY_HAS_IN_HOUSE_MEASURED_CUMULATIVE_POWER_CONSUMPTION).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_IN_HOUSE_MEASURED_CUMULATIVE_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_EngineCogeneration.addObjectProperty(EngineCogeneration.PROPERTY_RESET_IN_HOUSE_MEASURED_CUMULATIVE_POWER_CONSUMPTION).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_RESET_IN_HOUSE_MEASURED_CUMULATIVE_POWER_CONSUMPTION,EngineCogeneration.MY_URI,1,1));
		oci_EngineCogeneration.addObjectProperty(EngineCogeneration.PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE,OperationFunctionSettingValue.MY_URI,0,1));
		oci_EngineCogeneration.addDatatypeProperty(EngineCogeneration.PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_EngineCogeneration.addDatatypeProperty(EngineCogeneration.PROPERTY_HAS_TANK_CAPACITY).setFunctional();
		oci_EngineCogeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EngineCogeneration.PROPERTY_HAS_TANK_CAPACITY,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_WattHourMeter.setResourceComment("");
		oci_WattHourMeter.setResourceLabel("WattHourMeter");
		oci_WattHourMeter.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WattHourMeter.addDatatypeProperty(WattHourMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT).setFunctional();
		oci_WattHourMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WattHourMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_WattHourMeter.addDatatypeProperty(WattHourMeter.PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT).setFunctional();
		oci_WattHourMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WattHourMeter.PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_WattHourMeter.addDatatypeProperty(WattHourMeter.PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_1).setFunctional();
		oci_WattHourMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WattHourMeter.PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_1,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_WattHourMeter.addDatatypeProperty(WattHourMeter.PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_2).setFunctional();
		oci_WattHourMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WattHourMeter.PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_WaterFlowMeter.setResourceComment("");
		oci_WaterFlowMeter.setResourceLabel("WaterFlowMeter");
		oci_WaterFlowMeter.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WaterFlowMeter.addObjectProperty(WaterFlowMeter.PROPERTY_HAS_WATER_FLOW_METTER_CLASSIFICATION).setFunctional();
		oci_WaterFlowMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowMeter.PROPERTY_HAS_WATER_FLOW_METTER_CLASSIFICATION,TypeClassificationValue.MY_URI,0,1));
		oci_WaterFlowMeter.addObjectProperty(WaterFlowMeter.PROPERTY_HAS_OWNER_CLASSIFICATION).setFunctional();
		oci_WaterFlowMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowMeter.PROPERTY_HAS_OWNER_CLASSIFICATION,TypeClassificationValue.MY_URI,0,1));
		oci_WaterFlowMeter.addDatatypeProperty(WaterFlowMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT).setFunctional();
		oci_WaterFlowMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_WaterFlowMeter.addDatatypeProperty(WaterFlowMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_UNIT).setFunctional();
		oci_WaterFlowMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_UNIT,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_WaterFlowMeter.addDatatypeProperty(WaterFlowMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_HISTORICAL_DATA).setFunctional();
		oci_WaterFlowMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_HISTORICAL_DATA,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_WaterFlowMeter.addObjectProperty(WaterFlowMeter.PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA).setFunctional();
		oci_WaterFlowMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowMeter.PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA,OccurenceStatusValue.MY_URI,0,1));
		oci_WaterFlowMeter.addDatatypeProperty(WaterFlowMeter.PROPERTY_HAS_SECURITY_DATA_INFORMATION).setFunctional();
		oci_WaterFlowMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowMeter.PROPERTY_HAS_SECURITY_DATA_INFORMATION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WaterFlowMeter.addDatatypeProperty(WaterFlowMeter.PROPERTY_HAS_ID_NUMBER_SETTING).setFunctional();
		oci_WaterFlowMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowMeter.PROPERTY_HAS_ID_NUMBER_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WaterFlowMeter.addDatatypeProperty(WaterFlowMeter.PROPERTY_VERIFICATION_EXPIRATION_INFORMATION).setFunctional();
		oci_WaterFlowMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowMeter.PROPERTY_VERIFICATION_EXPIRATION_INFORMATION,TypeMapper.getDatatypeURI(String.class),0,1));
	
		oci_GasMeter.setResourceComment("");
		oci_GasMeter.setResourceLabel("GasMetter");
		oci_GasMeter.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_GasMeter.addDatatypeProperty(GasMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_AMOUNT).setFunctional();
		oci_GasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_AMOUNT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_GasMeter.addDatatypeProperty(GasMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_LOG).setFunctional();
		oci_GasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_LOG,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_LPGasMeter.setResourceComment("");
		oci_LPGasMeter.setResourceLabel("LPGasMeter");
		oci_LPGasMeter.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_METERING_DATA_1).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_METERING_DATA_1,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_METERING_DATA_2).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_METERING_DATA_2,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_LPGasMeter.addObjectProperty(LPGasMeter.PROPERTY_HAS_ERROR_DETECTION_OF_METERING_DATA).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_ERROR_DETECTION_OF_METERING_DATA,OccurenceStatusValue.MY_URI,0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_SECURITY_DATA_1).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_SECURITY_DATA_1,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_SECURITY_DATA_2).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_SECURITY_DATA_2,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_LPGasMeter.addObjectProperty(LPGasMeter.PROPERTY_HAS_CENTER_VALUE_SHUTOFF_STATUS).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_CENTER_VALUE_SHUTOFF_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_LPGasMeter.addObjectProperty(LPGasMeter.PROPERTY_HAS_CENTER_VALUE_SHUTOFF_RECOVERY_PERMISSION_SETTING_STATUS).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_CENTER_VALUE_SHUTOFF_RECOVERY_PERMISSION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_LPGasMeter.addObjectProperty(LPGasMeter.PROPERTY_HAS_EMERGENCY_VALUE_SHUTOFF_STATUS).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_EMERGENCY_VALUE_SHUTOFF_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_LPGasMeter.addObjectProperty(LPGasMeter.PROPERTY_HAS_SHUTOFF_VALUE_OPEN_CLOSE_STATUS).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_SHUTOFF_VALUE_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_LPGasMeter.addObjectProperty(LPGasMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING,ThresholdLevelValue.MY_URI,0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1_VALUE).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1_VALUE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2_VALUE).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2_VALUE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3_VALUE).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3_VALUE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE_GAS_FLOW_CONTINUATION).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE_GAS_FLOW_CONTINUATION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE_WITHOUT_PRESSURE_INCREASE).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE_WITHOUT_PRESSURE_INCREASE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_SHUTOFF_REASON_LOG).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_SHUTOFF_REASON_LOG,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_MAXIMUM_VALUE_OF_SUPPLY_PRESSURE_DATA).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_MAXIMUM_VALUE_OF_SUPPLY_PRESSURE_DATA,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_MINIMUM_VALUE_OF_SUPPLY_PRESSURE_DATA).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_MINIMUM_VALUE_OF_SUPPLY_PRESSURE_DATA,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_CURRENT_VALUE_OF_SUPPLY_PRESSURE_DATA).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_CURRENT_VALUE_OF_SUPPLY_PRESSURE_DATA,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_MAXIMUM_VALUE_OF_BLOCK_PRESSURE_DATA).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_MAXIMUM_VALUE_OF_BLOCK_PRESSURE_DATA,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_MINIMUM_VALUE_OF_BLOCK_PRESSURE_DATA).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_MINIMUM_VALUE_OF_BLOCK_PRESSURE_DATA,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_CURRENT_VALUE_OF_BLOCK_PRESSURE_DATA).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_CURRENT_VALUE_OF_BLOCK_PRESSURE_DATA,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LPGasMeter.addDatatypeProperty(LPGasMeter.PROPERTY_HAS_NUMBER_OF_BLOCK_SUPPLY_PRESSURE_ERROR_DAYS_TIMES).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_NUMBER_OF_BLOCK_SUPPLY_PRESSURE_ERROR_DAYS_TIMES,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_LPGasMeter.addObjectProperty(LPGasMeter.PROPERTY_HAS_TEST_CALL_SETTING).setFunctional();
		oci_LPGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LPGasMeter.PROPERTY_HAS_TEST_CALL_SETTING,OperationStatusValue.MY_URI,0,1));
		
		oci_PowerDistributionBoardMetering.setResourceComment("");
		oci_PowerDistributionBoardMetering.setResourceLabel("PowerDistributionBoardMetering");
		oci_PowerDistributionBoardMetering.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION_LIST_SIMPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION_LIST_SIMPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_VOLTAGE).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_VOLTAGE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_1).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_1,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_2).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_3).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_3,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_4).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_4,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_5).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_5,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_6).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_6,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_7).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_7,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_8).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_8,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_9).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_9,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_10).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_10,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_11).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_11,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_12).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_12,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_13).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_13,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_14).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_14,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_15).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_15,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_16).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_16,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_17).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_17,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_18).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_18,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_19).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_19,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_20).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_20,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_21).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_21,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_22).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_22,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_23).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_23,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_24).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_24,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_25).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_25,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_26).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_26,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_27).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_27,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_28).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_28,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_29).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_29,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_30).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_30,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_31).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_31,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_32).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASUREMENT_CHANNEL_32,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MASTER_RATED_CAPACITY).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MASTER_RATED_CAPACITY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_NUMBER_OF_MEASUREMENT_CHANELS_SIMPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_NUMBER_OF_MEASUREMENT_CHANELS_SIMPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_MEASUREMENT_SIMPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_MEASUREMENT_SIMPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_LIST_SIMPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_LIST_SIMPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_CURRENT_MEASUREMENT_SIMPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_CURRENT_MEASUREMENT_SIMPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT_LIST_SIMPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT_LIST_SIMPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_POWER_CONSUMPTION_MEASUREMENT_SIMPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_POWER_CONSUMPTION_MEASUREMENT_SIMPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_NUMBER_OF_MEASUREMENT_CHANELS_DUPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_NUMBER_OF_MEASUREMENT_CHANELS_DUPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_MEASUREMENT_DUPPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_MEASUREMENT_DUPPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_LIST_DUPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_LIST_DUPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_CURRENT_MEASUREMENT_DUPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_CURRENT_MEASUREMENT_DUPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT_LIST_DUPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT_LIST_DUPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_POWER_CONSUMPTION_MEASUREMENT_DUPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_POWER_CONSUMPTION_MEASUREMENT_DUPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_PowerDistributionBoardMetering.addDatatypeProperty(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION_LIST_DUPLEX).setFunctional();
		oci_PowerDistributionBoardMetering.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PowerDistributionBoardMetering.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION_LIST_DUPLEX,TypeMapper.getDatatypeURI(Float.class),0,1));
	
		oci_LowVoltageSmartElectricEnergy.setResourceComment("");
		oci_LowVoltageSmartElectricEnergy.setResourceLabel("LowVoltageSmartElectricEnergy");
		oci_LowVoltageSmartElectricEnergy.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_COEFFICIENT).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_COEFFICIENT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_NORMAL_DIRECTION).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_NORMAL_DIRECTION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_REVERSED_DIRECTION).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_REVERSED_DIRECTION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LowVoltageSmartElectricEnergy.addDatatypeProperty(LowVoltageSmartElectricEnergy.PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_2).setFunctional();
		oci_LowVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LowVoltageSmartElectricEnergy.PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_2,TypeMapper.getDatatypeURI(String.class),0,1));
	
		oci_SmartGasMeter.setResourceComment("");
		oci_SmartGasMeter.setResourceLabel("SmartGasMeter");
		oci_SmartGasMeter.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_SmartGasMeter.addObjectProperty(SmartGasMeter.PROPERTY_HAS_GAS_METTER_CLASSIFICATION_SETTING).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_GAS_METTER_CLASSIFICATION_SETTING,TypeClassificationValue.MY_URI,0,1));
		oci_SmartGasMeter.addObjectProperty(SmartGasMeter.PROPERTY_HAS_OWNER_CLASSIFICATION).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_OWNER_CLASSIFICATION,TypeClassificationValue.MY_URI,0,1));
		oci_SmartGasMeter.addDatatypeProperty(SmartGasMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_SmartGasMeter.addDatatypeProperty(SmartGasMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_UNIT).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_UNIT,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_SmartGasMeter.addDatatypeProperty(SmartGasMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmartGasMeter.addDatatypeProperty(SmartGasMeter.PROPERTY_HAS_DAY_TO_RETRIEVE_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_DAY_TO_RETRIEVE_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_SmartGasMeter.addObjectProperty(SmartGasMeter.PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA,OccurenceStatusValue.MY_URI,0,1));
		oci_SmartGasMeter.addDatatypeProperty(SmartGasMeter.PROPERTY_HAS_SECURITY_DATA_INFORMATION).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_SECURITY_DATA_INFORMATION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_SmartGasMeter.addObjectProperty(SmartGasMeter.PROPERTY_HAS_VALVE_CLOSURE_BY_THE_CENTER).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_VALVE_CLOSURE_BY_THE_CENTER,OperationStatusValue.MY_URI,0,1));
		oci_SmartGasMeter.addObjectProperty(SmartGasMeter.PROPERTY_HAS_PERMISSION_FROM_THE_CENTER_TO_REOPEN_VALUE_CLOSED_BY_THE_CENTER).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_PERMISSION_FROM_THE_CENTER_TO_REOPEN_VALUE_CLOSED_BY_THE_CENTER,OperationStatusValue.MY_URI,0,1));
		oci_SmartGasMeter.addObjectProperty(SmartGasMeter.PROPERTY_HAS_SHUTOFF_VALVE_STATUS).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_SHUTOFF_VALVE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_SmartGasMeter.addDatatypeProperty(SmartGasMeter.PROPERTY_HAS_HISTORICAL_DATA_OF_SHUTOFF_REASONS).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_HISTORICAL_DATA_OF_SHUTOFF_REASONS,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_SmartGasMeter.addDatatypeProperty(SmartGasMeter.PROPERTY_HAS_ID_NUMBER_SETTING).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_ID_NUMBER_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_SmartGasMeter.addDatatypeProperty(SmartGasMeter.PROPERTY_VERIFICATION_EXPIRATION_INFORMATION).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_VERIFICATION_EXPIRATION_INFORMATION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_SmartGasMeter.addDatatypeProperty(SmartGasMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmartGasMeter.addDatatypeProperty(SmartGasMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED).setFunctional();
		oci_SmartGasMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartGasMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED,TypeMapper.getDatatypeURI(Float.class),0,1));
	
		oci_HighVoltageSmartElectricEnergy.setResourceComment("");
		oci_HighVoltageSmartElectricEnergy.setResourceLabel("HighVoltageSmartElectricEnergy");
		oci_HighVoltageSmartElectricEnergy.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_COEFFICIENT).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_COEFFICIENT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MULTIPLYING_FACTOR_FOR_COEFFICIENT).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MULTIPLYING_FACTOR_FOR_COEFFICIENT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_FIXED_DAY).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_FIXED_DAY,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_HISTORICAL_DATA).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_HISTORICAL_DATA,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_FOR_POWER_FACTOR_MEASUREMENT).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_FOR_POWER_FACTOR_MEASUREMENT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_UNIT).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_UNIT,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MONTHLY_MAXIMUM_ELECTRIC_POWER_DEMAND).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MONTHLY_MAXIMUM_ELECTRIC_POWER_DEMAND,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_ELECTRIC_POWER_DEMAND_AT_FIXED_TIME).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_ELECTRIC_POWER_DEMAND_AT_FIXED_TIME,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_ELECTRIC_POWER_DEMAND).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_ELECTRIC_POWER_DEMAND,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_ELECTRIC_POWER_DEMAND_UNIT).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_ELECTRIC_POWER_DEMAND_UNIT,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_ELECTRIC_POWER_DEMAND_HISTORICAL_DATA).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_ELECTRIC_POWER_DEMAND_HISTORICAL_DATA,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND_UNIT).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND_UNIT,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AT_FIXED_TIME_FOR_POWER_FACTOR_MEASUREMENT).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AT_FIXED_TIME_FOR_POWER_FACTOR_MEASUREMENT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AMOUNT_UNIT).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AMOUNT_UNIT,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_HighVoltageSmartElectricEnergy.addDatatypeProperty(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT_HISTORICAL_DATA).setFunctional();
		oci_HighVoltageSmartElectricEnergy.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HighVoltageSmartElectricEnergy.PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT_HISTORICAL_DATA,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_KeroseneMeter.setResourceComment("");
		oci_KeroseneMeter.setResourceLabel("KeroseneMeter");
		oci_KeroseneMeter.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_KeroseneMeter.addDatatypeProperty(KeroseneMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_AMOUNT).setFunctional();
		oci_KeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(KeroseneMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_AMOUNT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_KeroseneMeter.addDatatypeProperty(KeroseneMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA).setFunctional();
		oci_KeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(KeroseneMeter.PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_SmartKeroseneMeter.setResourceComment("");
		oci_SmartKeroseneMeter.setResourceLabel("SmartKeroseneMeter");
		oci_SmartKeroseneMeter.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_SmartKeroseneMeter.addObjectProperty(SmartKeroseneMeter.PROPERTY_HAS_OWNER_CLASSIFICATION).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_OWNER_CLASSIFICATION,TypeClassificationValue.MY_URI,0,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_UNIT).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_UNIT,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_COLLECTION_DATE_SETTING_FOR_HISTORY_CUMULATIVE_KEROSENE_CONSUMPTION).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_COLLECTION_DATE_SETTING_FOR_HISTORY_CUMULATIVE_KEROSENE_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmartKeroseneMeter.addObjectProperty(SmartKeroseneMeter.PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA,OccurenceStatusValue.MY_URI,0,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_SECURITY_DATA_INFORMATION).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_SECURITY_DATA_INFORMATION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_SmartKeroseneMeter.addObjectProperty(SmartKeroseneMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_ID_NUMBER_SETTING).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_ID_NUMBER_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_VERIFICATION_EXPIRATION_INFORMATION).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_VERIFICATION_EXPIRATION_INFORMATION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_SmartKeroseneMeter.addDatatypeProperty(SmartKeroseneMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED).setFunctional();
		oci_SmartKeroseneMeter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmartKeroseneMeter.PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED,TypeMapper.getDatatypeURI(Float.class),0,1));
	
		oci_GeneralLight.setResourceComment("");
		oci_GeneralLight.setResourceLabel("GeneralLight");
		oci_GeneralLight.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_GeneralLight.addDatatypeProperty(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_LIGHTING_COLOR_SETTING).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_LIGHTING_COLOR_SETTING,ColorValue.MY_URI,0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_LIGHT_COLOR_STEP_SETTING).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_LIGHT_COLOR_STEP_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_GeneralLight.addDatatypeProperty(GeneralLighting.PROPERTY_HAS_MAXIMUM_SPECIFIABLE_VALUES).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_MAXIMUM_SPECIFIABLE_VALUES,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_GeneralLight.addDatatypeProperty(GeneralLighting.PROPERTY_HAS_MAXIMUM_SETABLE_LEVEL_FOR_NIGHT_LIGHTING_VALUES).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_MAXIMUM_SETABLE_LEVEL_FOR_NIGHT_LIGHTING_VALUES,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_LIGHTING_MODE_SETTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_LIGHTING_MODE_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_GeneralLight.addDatatypeProperty(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_MAIN_LIGHTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_MAIN_LIGHTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING,ThresholdLevelValue.MY_URI,0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING,ThresholdLevelValue.MY_URI,0,1));
		oci_GeneralLight.addDatatypeProperty(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_NIGHT_LIGHTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_NIGHT_LIGHTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_MAIN_LIGHTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_MAIN_LIGHTING,ColorValue.MY_URI,0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING,ThresholdLevelValue.MY_URI,0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_NIGHT_LIGHTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_NIGHT_LIGHTING,ColorValue.MY_URI,0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING,ThresholdLevelValue.MY_URI,0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_LIGHTING_MODE_STATUS_IN_AUTO_MODE ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_LIGHTING_MODE_STATUS_IN_AUTO_MODE,OperationModeSettingValue.MY_URI,0,1));
		oci_GeneralLight.addDatatypeProperty(GeneralLighting.PROPERTY_HAS_RGB_SETTING_FOR_COLOR_LIGHTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_RGB_SETTING_FOR_COLOR_LIGHTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_GeneralLight.addDatatypeProperty(GeneralLighting.PROPERTY_HAS_ON_TIMER_SETTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_ON_TIMER_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_GeneralLight.addObjectProperty(GeneralLighting.PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_GeneralLight.addDatatypeProperty(GeneralLighting.PROPERTY_HAS_OFF_TIMER_SETTING ).setFunctional();
		oci_GeneralLight.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GeneralLighting.PROPERTY_HAS_OFF_TIMER_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		
		oci_MonoFunctionLighting.setResourceComment("");
		oci_MonoFunctionLighting.setResourceLabel("MonoFunctionLighting");
		oci_MonoFunctionLighting.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_MonoFunctionLighting.addDatatypeProperty(MonoFunctionLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL).setFunctional();
		oci_MonoFunctionLighting.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MonoFunctionLighting.PROPERTY_HAS_ILLUMINANCE_LEVEL,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_Buzzer.setResourceComment("");
		oci_Buzzer.setResourceLabel("Buzzer");
		oci_Buzzer.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_Buzzer.addObjectProperty(Buzzer.PROPERTY_HAS_SOUND_GENERATION_SETTING).setFunctional();
		oci_Buzzer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Buzzer.PROPERTY_HAS_SOUND_GENERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_Buzzer.addObjectProperty(Buzzer.PROPERTY_HAS_BUZZER_SOUND_TYPE).setFunctional();
		oci_Buzzer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Buzzer.PROPERTY_HAS_BUZZER_SOUND_TYPE,ThresholdLevelValue.MY_URI,0,1));
	
		oci_VehicleCharger.setResourceComment("");
		oci_VehicleCharger.setResourceLabel("VehicleCharger");
		oci_VehicleCharger.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_RATED_CHARGE_CAPACITY).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_RATED_CHARGE_CAPACITY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleCharger.addObjectProperty(VehicleCharger.PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_STATUS).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_STATUS,OperationStateSettingValue.MY_URI,1,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_VehicleCharger.addObjectProperty(VehicleCharger.PROPERTY_HAS_CHARGER_TYPE).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_CHARGER_TYPE,ChargerDischargerTypeValue.MY_URI,1,1));
		oci_VehicleCharger.addObjectProperty(VehicleCharger.PROPERTY_SET_VEHICLE_CONNECTION_CONFIRMATION).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_SET_VEHICLE_CONNECTION_CONFIRMATION,VehicleCharger.MY_URI,1,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_REMAINING_CAPACITY).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_REMAINING_CAPACITY,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_USED_CAPACITY_1).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_USED_CAPACITY_1,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_RATED_VOLTAGE).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_RATED_VOLTAGE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleCharger.addObjectProperty(VehicleCharger.PROPERTY_RESET_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_RESET_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY,VehicleCharger.MY_URI,1,1));
		oci_VehicleCharger.addObjectProperty(VehicleCharger.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_VEHICLE_ID).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_VEHICLE_ID,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_CHARGING_AMOUNT_SETTING).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_CHARGING_AMOUNT_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_VehicleCharger.addDatatypeProperty(VehicleCharger.PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING).setFunctional();
		oci_VehicleCharger.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VehicleCharger.PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_SmallWindTurbinePowerGeneration.setResourceComment("");
		oci_SmallWindTurbinePowerGeneration.setResourceLabel("HouseHoldSmallWindTurbinePowerGeneration");
		oci_SmallWindTurbinePowerGeneration.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_SmallWindTurbinePowerGeneration.addObjectProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_SYSTEM_INTERCONNECTION_STATUS).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_SYSTEM_INTERCONNECTION_STATUS,OperationFunctionSettingValue.MY_URI,1,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_MEASURED_INSTANTANEOUS_GENERATED_ELECTRICITY_AMOUNT).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_MEASURED_INSTANTANEOUS_GENERATED_ELECTRICITY_AMOUNT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_SmallWindTurbinePowerGeneration.addObjectProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_RESET_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_RESET_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT,HouseHoldSmallWindTurbinePowerGeneration.MY_URI,1,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmallWindTurbinePowerGeneration.addObjectProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_RESET_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_RESET_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT,HouseHoldSmallWindTurbinePowerGeneration.MY_URI,1,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_RATED_POWER).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_RATED_POWER,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_MEASURED_WIND_SPEED).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_MEASURED_WIND_SPEED,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_RATED_WIND_SPEED).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_RATED_WIND_SPEED,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_CUT_IN_WIND_SPEED).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_CUT_IN_WIND_SPEED,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_CUT_OUT_WIND_SPEED).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_CUT_OUT_WIND_SPEED,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmallWindTurbinePowerGeneration.addDatatypeProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_EXTREME_WIND_SPEED).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_EXTREME_WIND_SPEED,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_SmallWindTurbinePowerGeneration.addObjectProperty(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_BARKING_STATUS).setFunctional();
		oci_SmallWindTurbinePowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSmallWindTurbinePowerGeneration.PROPERTY_HAS_BARKING_STATUS,OperationStatusValue.MY_URI,1,1));
		
		oci_LightingSystem.setResourceComment("");
		oci_LightingSystem.setResourceLabel("LightingSystem");
		oci_LightingSystem.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_LightingSystem.addDatatypeProperty(LightingSystem.PROPERTY_HAS_ILLUMINANCE_LEVEL).setFunctional();
		oci_LightingSystem.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LightingSystem.PROPERTY_HAS_ILLUMINANCE_LEVEL,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_LightingSystem.addDatatypeProperty(LightingSystem.PROPERTY_HAS_SCENE_CONTROL_SETTING).setFunctional();
		oci_LightingSystem.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LightingSystem.PROPERTY_HAS_SCENE_CONTROL_SETTING,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_LightingSystem.addDatatypeProperty(LightingSystem.PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING).setFunctional();
		oci_LightingSystem.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(LightingSystem.PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING,TypeMapper.getDatatypeURI(Float.class),1,1));
		
		oci_ExtendedLightingSystem.setResourceComment("");
		oci_ExtendedLightingSystem.setResourceLabel("ExtendedLightingSystem");
		oci_ExtendedLightingSystem.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ExtendedLightingSystem.addDatatypeProperty(ExtendedLightingSystem.PROPERTY_HAS_ILLUMINANCE_LEVEL).setFunctional();
		oci_ExtendedLightingSystem.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ExtendedLightingSystem.PROPERTY_HAS_ILLUMINANCE_LEVEL,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ExtendedLightingSystem.addDatatypeProperty(ExtendedLightingSystem.PROPERTY_HAS_SCENE_CONTROL_SETTING).setFunctional();
		oci_ExtendedLightingSystem.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ExtendedLightingSystem.PROPERTY_HAS_SCENE_CONTROL_SETTING,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ExtendedLightingSystem.addDatatypeProperty(ExtendedLightingSystem.PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING).setFunctional();
		oci_ExtendedLightingSystem.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ExtendedLightingSystem.PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ExtendedLightingSystem.addDatatypeProperty(ExtendedLightingSystem.PROPERTY_HAS_POWER_CONSUMPTION_RATE_LIST).setFunctional();
		oci_ExtendedLightingSystem.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ExtendedLightingSystem.PROPERTY_HAS_POWER_CONSUMPTION_RATE_LIST,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ExtendedLightingSystem.addDatatypeProperty(ExtendedLightingSystem.PROPERTY_HAS_POWER_CONSUMPTION_WHEN_FULLY_LIGHTED).setFunctional();
		oci_ExtendedLightingSystem.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ExtendedLightingSystem.PROPERTY_HAS_POWER_CONSUMPTION_WHEN_FULLY_LIGHTED,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ExtendedLightingSystem.addDatatypeProperty(ExtendedLightingSystem.PROPERTY_HAS_POSISSLBE_POWER_SAVING).setFunctional();
		oci_ExtendedLightingSystem.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ExtendedLightingSystem.PROPERTY_HAS_POSISSLBE_POWER_SAVING,TypeMapper.getDatatypeURI(Float.class),1,1));	
		oci_ExtendedLightingSystem.addDatatypeProperty(ExtendedLightingSystem.PROPERTY_HAS_POWER_CONSUMPTION_LIMIT_SETTING).setFunctional();
		oci_ExtendedLightingSystem.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ExtendedLightingSystem.PROPERTY_HAS_POWER_CONSUMPTION_LIMIT_SETTING,TypeMapper.getDatatypeURI(Float.class),1,1));
		
		oci_ElectricHotWaterPot.setResourceComment("");
		oci_ElectricHotWaterPot.setResourceLabel("ElectricHotWaterPot");
		oci_ElectricHotWaterPot.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricHotWaterPot.addObjectProperty(ElectricHotWaterPot.PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricHotWaterPot.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHotWaterPot.PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricHotWaterPot.addObjectProperty(ElectricHotWaterPot.PROPERTY_HAS_NO_WATER_WARNING).setFunctional();
		oci_ElectricHotWaterPot.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHotWaterPot.PROPERTY_HAS_NO_WATER_WARNING,OccurenceStatusValue.MY_URI,1,1));
		oci_ElectricHotWaterPot.addObjectProperty(ElectricHotWaterPot.PROPERTY_HAS_BOIL_UP_SETTING).setFunctional();
		oci_ElectricHotWaterPot.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHotWaterPot.PROPERTY_HAS_BOIL_UP_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricHotWaterPot.addObjectProperty(ElectricHotWaterPot.PROPERTY_HAS_BOIL_UP_WARMER_MODE_SETTING).setFunctional();
		oci_ElectricHotWaterPot.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHotWaterPot.PROPERTY_HAS_BOIL_UP_WARMER_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricHotWaterPot.addDatatypeProperty(ElectricHotWaterPot.PROPERTY_HAS_WARMER_TEMPERATURE_SETTING_VALUE).setFunctional();
		oci_ElectricHotWaterPot.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHotWaterPot.PROPERTY_HAS_WARMER_TEMPERATURE_SETTING_VALUE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_ElectricHotWaterPot.addObjectProperty(ElectricHotWaterPot.PROPERTY_HAS_HOT_WATER_DISCHARGE_STATUS).setFunctional();
		oci_ElectricHotWaterPot.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHotWaterPot.PROPERTY_HAS_HOT_WATER_DISCHARGE_STATUS,OperationStatusValue.MY_URI,1,1));
		oci_ElectricHotWaterPot.addObjectProperty(ElectricHotWaterPot.PROPERTY_HAS_LOCK_STATUS).setFunctional();
		oci_ElectricHotWaterPot.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHotWaterPot.PROPERTY_HAS_LOCK_STATUS,OperationStateSettingValue.MY_URI,0,1));
		
		oci_Refrigerator.setResourceComment("");
		oci_Refrigerator.setResourceLabel("Refrigerator");
		oci_Refrigerator.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,1,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_DOOR_OPEN_WARNING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_DOOR_OPEN_WARNING,OccurenceStatusValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_DOOR_STATUS).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_DOOR_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_FREEZER_COMPARTMENT_DOOR_STATUS).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_FREEZER_COMPARTMENT_DOOR_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_ICE_COMPARTMENT_DOOR_STATUS).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_ICE_COMPARTMENT_DOOR_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_VEGETABLE_COMPARTMENT_DOOR_STATUS).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_VEGETABLE_COMPARTMENT_DOOR_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_MULTI_REFRIGERATING_MODE_COMPARTMENT_DOOR_STATUS).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_MULTI_REFRIGERATING_MODE_COMPARTMENT_DOOR_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_MAXIMUM_ALLOWABLE_TEMEPRATURE_SETTING_LEVEL).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_MAXIMUM_ALLOWABLE_TEMEPRATURE_SETTING_LEVEL,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_TEMPERATURER_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_TEMPERATURER_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));	
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_FREEZER_COMPARTMENT_TEMPERATURER_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_FREEZER_COMPARTMENT_TEMPERATURER_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));	
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_ICE_COMPARTMENT_TEMPERATURER_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_ICE_COMPARTMENT_TEMPERATURER_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));		
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_VEGETABLE_COMPARTMENT_TEMPERATURER_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_VEGETABLE_COMPARTMENT_TEMPERATURER_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));	
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_TEMPERATURER_LEVEL_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_TEMPERATURER_LEVEL_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));	
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_FREEZER_COMPARTMENT_TEMPERATURER_LEVEL_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_FREEZER_COMPARTMENT_TEMPERATURER_LEVEL_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));	
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_ICE_COMPARTMENT_TEMPERATURER_LEVEL_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_ICE_COMPARTMENT_TEMPERATURER_LEVEL_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));		
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_VEGETABLE_COMPARTMENT_TEMPERATURER_LEVEL_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_VEGETABLE_COMPARTMENT_TEMPERATURER_LEVEL_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER_LEVEL_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER_LEVEL_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_MEASURED_REFRIGERATOR_COMPARTMENT_TEMPERATURER).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_MEASURED_REFRIGERATOR_COMPARTMENT_TEMPERATURER,TypeMapper.getDatatypeURI(Float.class),0,1));	
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_MEASURED_FREEZER_COMPARTMENT_TEMPERATURER).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_MEASURED_FREEZER_COMPARTMENT_TEMPERATURER,TypeMapper.getDatatypeURI(Float.class),0,1));	
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_MEASURED_SUB_ZERO_FRESH_COMPARTMENT_TEMPERATURER).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_MEASURED_SUB_ZERO_FRESH_COMPARTMENT_TEMPERATURER,TypeMapper.getDatatypeURI(Float.class),0,1));		
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_MEASURED_VEGETABLE_COMPARTMENT_TEMPERATURER).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_MEASURED_VEGETABLE_COMPARTMENT_TEMPERATURER,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_MEASURED_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_MEASURED_MULTI_REFRIGERATOR_COMPARTMENT_TEMPERATURER,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_COMPRESSOR_ROTATION_SPEED).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_COMPRESSOR_ROTATION_SPEED,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_Refrigerator.addDatatypeProperty(Refrigerator.PROPERTY_HAS_RATED_POWER_CONSUMPTION).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_RATED_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_QUICK_FREEZE_FUNCTION_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_QUICK_FREEZE_FUNCTION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_QUICK_REFRIGERATION_FUNCTION_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_QUICK_REFRIGERATION_FUNCTION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_ICE_MAKER_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_ICE_MAKER_SETTING,OperationStateSettingValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_ICE_MAKER_OPERATION_STATUS).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_ICE_MAKER_OPERATION_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_ICE_MAKER_WATER_TANK_STATUS).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_ICE_MAKER_WATER_TANK_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_HUMIDIFICATION_FUNCTION_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_REFRIGERATOR_COMPARTMENT_HUMIDIFICATION_FUNCTION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_VEGETABLE_COMPARTMENT_HUMIDIFICATION_FUNCTION_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_VEGETABLE_COMPARTMENT_HUMIDIFICATION_FUNCTION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_Refrigerator.addObjectProperty(Refrigerator.PROPERTY_HAS_DEODORIZATION_FUNCTION_SETTING).setFunctional();
		oci_Refrigerator.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Refrigerator.PROPERTY_HAS_DEODORIZATION_FUNCTION_SETTING,OperationStatusValue.MY_URI,0,1));
		
		oci_CombinationMicrowaveOven.setResourceComment("");
		oci_CombinationMicrowaveOven.setResourceLabel("CombinationMicrowaveOven");
		oci_CombinationMicrowaveOven.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CombinationMicrowaveOven.addObjectProperty(CombinationMicrowaveOven.PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_CombinationMicrowaveOven.addObjectProperty(CombinationMicrowaveOven.PROPERTY_HAS_HEATING_STATUS).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_HEATING_STATUS,OperationStatusValue.MY_URI,0,1));		
		oci_CombinationMicrowaveOven.addObjectProperty(CombinationMicrowaveOven.PROPERTY_HAS_HEATING_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_HEATING_SETTING,OperationStateSettingValue.MY_URI,0,1));
		oci_CombinationMicrowaveOven.addObjectProperty(CombinationMicrowaveOven.PROPERTY_HAS_HEATING_MODE_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_HEATING_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_CombinationMicrowaveOven.addObjectProperty(CombinationMicrowaveOven.PROPERTY_HAS_AUTOMATIC_HEATING_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_AUTOMATIC_HEATING_SETTING,OperationStateSettingValue.MY_URI,0,1));
		oci_CombinationMicrowaveOven.addObjectProperty(CombinationMicrowaveOven.PROPERTY_HAS_AUTOMATIC_HEATING_LEVEL_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_AUTOMATIC_HEATING_LEVEL_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_CombinationMicrowaveOven.addObjectProperty(CombinationMicrowaveOven.PROPERTY_HAS_AUTOMATIC_HEATING_MENU_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_AUTOMATIC_HEATING_MENU_SETTING,AutomaticHeatingMenu.MY_URI,0,1));
		oci_CombinationMicrowaveOven.addObjectProperty(CombinationMicrowaveOven.PROPERTY_HAS_OVEN_MODE_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_OVEN_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_CombinationMicrowaveOven.addObjectProperty(CombinationMicrowaveOven.PROPERTY_HAS_OVEN_PREHEATING_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_OVEN_PREHEATING_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_CombinationMicrowaveOven.addObjectProperty(CombinationMicrowaveOven.PROPERTY_HAS_FERMENTING_MODE_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_FERMENTING_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_CombinationMicrowaveOven.addDatatypeProperty(CombinationMicrowaveOven.PROPERTY_HAS_CHAMPER_TEMPERATURE_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_CHAMPER_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CombinationMicrowaveOven.addDatatypeProperty(CombinationMicrowaveOven.PROPERTY_HAS_FOOD_TEMPERATURE_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_FOOD_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CombinationMicrowaveOven.addDatatypeProperty(CombinationMicrowaveOven.PROPERTY_HAS_HEATING_SETTING_TIME).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_HEATING_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));	
		oci_CombinationMicrowaveOven.addDatatypeProperty(CombinationMicrowaveOven.PROPERTY_HAS_REMAINING_HEATING_TIME).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_REMAINING_HEATING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_CombinationMicrowaveOven.addDatatypeProperty(CombinationMicrowaveOven.PROPERTY_HAS_MICROWAVE_HEATING_POWER_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_MICROWAVE_HEATING_POWER_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CombinationMicrowaveOven.addDatatypeProperty(CombinationMicrowaveOven.PROPERTY_HAS_PROMPT_MESSAGE_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_PROMPT_MESSAGE_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_CombinationMicrowaveOven.addDatatypeProperty(CombinationMicrowaveOven.PROPERTY_HAS_ACCESSORIES_TO_COMBINATION_MICROWAVE_OVEN_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_ACCESSORIES_TO_COMBINATION_MICROWAVE_OVEN_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_CombinationMicrowaveOven.addDatatypeProperty(CombinationMicrowaveOven.PROPERTY_HAS_DISPLAY_CHARACTER_STRING_SETTING).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_DISPLAY_CHARACTER_STRING_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_CombinationMicrowaveOven.addDatatypeProperty(CombinationMicrowaveOven.PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_DURATION).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_DURATION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_CombinationMicrowaveOven.addDatatypeProperty(CombinationMicrowaveOven.PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_POWER).setFunctional();
		oci_CombinationMicrowaveOven.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CombinationMicrowaveOven.PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_POWER,TypeMapper.getDatatypeURI(String.class),0,1));
	
		
		oci_CookingHeater.setResourceComment("");
		oci_CookingHeater.setResourceLabel("CookingHeater");
		oci_CookingHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CookingHeater.addObjectProperty(CookingHeater.PROPERTY_HAS_HEATING_STATUS).setFunctional();
		oci_CookingHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CookingHeater.PROPERTY_HAS_HEATING_STATUS,OperationStatusValue.MY_URI,1,1));
		oci_CookingHeater.addObjectProperty(CookingHeater.PROPERTY_HAS_HEATING_SETTING).setFunctional();
		oci_CookingHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CookingHeater.PROPERTY_HAS_HEATING_SETTING,OperationStateSettingValue.MY_URI,0,1));
		oci_CookingHeater.addObjectProperty(CookingHeater.PROPERTY_SETTING_ALL_STOP).setFunctional();
		oci_CookingHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CookingHeater.PROPERTY_SETTING_ALL_STOP,CookingHeater.MY_URI,1,1));
		oci_CookingHeater.addDatatypeProperty(CookingHeater.PROPERTY_HAS_HEATING_POWER_SETTING).setFunctional();
		oci_CookingHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CookingHeater.PROPERTY_HAS_HEATING_POWER_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CookingHeater.addDatatypeProperty(CookingHeater.PROPERTY_HAS_HEATING_TEMPERATURE_SETTING).setFunctional();
		oci_CookingHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CookingHeater.PROPERTY_HAS_HEATING_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CookingHeater.addObjectProperty(CookingHeater.PROPERTY_HAS_STOVE_HEATING_MODES_SETTING).setFunctional();
		oci_CookingHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CookingHeater.PROPERTY_HAS_STOVE_HEATING_MODES_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_CookingHeater.addDatatypeProperty(CookingHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_CookingHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CookingHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));	
		oci_CookingHeater.addObjectProperty(CookingHeater.PROPERTY_HAS_CHILD_LOCK_SETTING).setFunctional();
		oci_CookingHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CookingHeater.PROPERTY_HAS_CHILD_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_CookingHeater.addObjectProperty(CookingHeater.PROPERTY_HAS_RADIANT_HEATER_LOCK_SETTING).setFunctional();
		oci_CookingHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CookingHeater.PROPERTY_HAS_RADIANT_HEATER_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		
		oci_RiceCooker.setResourceComment("");
		oci_RiceCooker.setResourceLabel("RiceCooker");
		oci_RiceCooker.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_RiceCooker.addObjectProperty(RiceCooker.PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS).setFunctional();
		oci_RiceCooker.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RiceCooker.PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_RiceCooker.addObjectProperty(RiceCooker.PROPERTY_HAS_RICE_COOKING_STATUS).setFunctional();
		oci_RiceCooker.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RiceCooker.PROPERTY_HAS_RICE_COOKING_STATUS,OperationStatusValue.MY_URI,1,1));
		oci_RiceCooker.addObjectProperty(RiceCooker.PROPERTY_HAS_RICE_COOKING_CONTROL_SETTING).setFunctional();
		oci_RiceCooker.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RiceCooker.PROPERTY_HAS_RICE_COOKING_CONTROL_SETTING,OperationStateSettingValue.MY_URI,1,1));
		oci_RiceCooker.addObjectProperty(RiceCooker.PROPERTY_HAS_WARMER_SETTING).setFunctional();
		oci_RiceCooker.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RiceCooker.PROPERTY_HAS_WARMER_SETTING,OperationStateSettingValue.MY_URI,0,1));
		oci_RiceCooker.addObjectProperty(RiceCooker.PROPERTY_HAS_INNER_POT_REMOVAL_STATUS).setFunctional();
		oci_RiceCooker.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RiceCooker.PROPERTY_HAS_INNER_POT_REMOVAL_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_RiceCooker.addObjectProperty(RiceCooker.PROPERTY_HAS_COVER_REMOVAL_STATUS).setFunctional();
		oci_RiceCooker.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RiceCooker.PROPERTY_HAS_COVER_REMOVAL_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_RiceCooker.addObjectProperty(RiceCooker.PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING).setFunctional();
		oci_RiceCooker.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RiceCooker.PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_RiceCooker.addDatatypeProperty(RiceCooker.PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_RELATIVE_TIME).setFunctional();
		oci_RiceCooker.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RiceCooker.PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_RiceCooker.addDatatypeProperty(RiceCooker.PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_TIME).setFunctional();
		oci_RiceCooker.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RiceCooker.PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		
		oci_WashingMachine.setResourceComment("");
		oci_WashingMachine.setResourceLabel("WashingMachine");
		oci_WashingMachine.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WashingMachine.addObjectProperty(WashingMachine.PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS).setFunctional();
		oci_WashingMachine.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WashingMachine.PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_WashingMachine.addObjectProperty(WashingMachine.PROPERTY_HAS_WASHING_MACHINE_SETTING).setFunctional();
		oci_WashingMachine.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WashingMachine.PROPERTY_HAS_WASHING_MACHINE_SETTING,OperationStateSettingValue.MY_URI,0,1));
		oci_WashingMachine.addObjectProperty(WashingMachine.PROPERTY_HAS_CURRENT_STAGE_OF_WASHING_CYCLE).setFunctional();
		oci_WashingMachine.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WashingMachine.PROPERTY_HAS_CURRENT_STAGE_OF_WASHING_CYCLE,OperationModeSettingValue.MY_URI,0,1));	
		oci_WashingMachine.addDatatypeProperty(WashingMachine.PROPERTY_HAS_REMAINING_TIME_TO_COMPLETE_WASHING_CYCLE).setFunctional();
		oci_WashingMachine.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WashingMachine.PROPERTY_HAS_REMAINING_TIME_TO_COMPLETE_WASHING_CYCLE,TypeMapper.getDatatypeURI(String.class),0,1));	
		oci_WashingMachine.addObjectProperty(WashingMachine.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING).setFunctional();
		oci_WashingMachine.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WashingMachine.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));	
		oci_WashingMachine.addDatatypeProperty(WashingMachine.PROPERTY_HAS_ON_TIMER_SETTING).setFunctional();
		oci_WashingMachine.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WashingMachine.PROPERTY_HAS_ON_TIMER_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WashingMachine.addDatatypeProperty(WashingMachine.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_WashingMachine.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WashingMachine.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		
		
		oci_CommercialShowcase.setResourceComment("");
		oci_CommercialShowcase.setResourceLabel("CommercialShowcase");
		oci_CommercialShowcase.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CommercialShowcase.addObjectProperty(CommercialShowcase.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_CommercialShowcase.addDatatypeProperty(CommercialShowcase.PROPERTY_HAS_MEASURED_DISCHARGE_TEMPERATURE).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_MEASURED_DISCHARGE_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CommercialShowcase.addDatatypeProperty(CommercialShowcase.PROPERTY_HAS_GROUP_INFORMATION).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_GROUP_INFORMATION,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_CommercialShowcase.addObjectProperty(CommercialShowcase.PROPERTY_HAS_INTERNAL_LIGHTING_OPERATION_STATUS).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_INTERNAL_LIGHTING_OPERATION_STATUS,OperationStatusValue.MY_URI,1,1));
		oci_CommercialShowcase.addObjectProperty(CommercialShowcase.PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_CommercialShowcase.addObjectProperty(CommercialShowcase.PROPERTY_HAS_EXTERNAL_LIGHTING_OPERATION_STATUS).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_EXTERNAL_LIGHTING_OPERATION_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_CommercialShowcase.addDatatypeProperty(CommercialShowcase.PROPERTY_HAS_MEASURED_INTERNAL_TEMPERATURE).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_MEASURED_INTERNAL_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_CommercialShowcase.addDatatypeProperty(CommercialShowcase.PROPERTY_HAS_FREEZING_CAPABILITY_VALUE).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_FREEZING_CAPABILITY_VALUE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CommercialShowcase.addDatatypeProperty(CommercialShowcase.PROPERTY_HAS_DEFROSTING_HEATER_POWER_CONSUMPTION).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_DEFROSTING_HEATER_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CommercialShowcase.addDatatypeProperty(CommercialShowcase.PROPERTY_HAS_FAN_MOTER_POWER_CONSUMPTION).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_FAN_MOTER_POWER_CONSUMPTION,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CommercialShowcase.addObjectProperty(CommercialShowcase.PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_TYPE).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_TYPE,OperationFunctionSettingValue.MY_URI,0,1));
		oci_CommercialShowcase.addObjectProperty(CommercialShowcase.PROPERTY_HAS_HEATER_MODE).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_HEATER_MODE,OperationStatusValue.MY_URI,1,1));
		oci_CommercialShowcase.addObjectProperty(CommercialShowcase.PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_TYPE).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_TYPE,OperationFunctionSettingValue.MY_URI,0,1));
		oci_CommercialShowcase.addDatatypeProperty(CommercialShowcase.PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CommercialShowcase.addDatatypeProperty(CommercialShowcase.PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_ILLUMINANCE_LEVEL).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_ILLUMINANCE_LEVEL,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CommercialShowcase.addDatatypeProperty(CommercialShowcase.PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_SETTING).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_SETTING,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_CommercialShowcase.addObjectProperty(CommercialShowcase.PROPERTY_HAS_SHOWCASE_TYPE_INFORMATION).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_SHOWCASE_TYPE_INFORMATION,OperationFunctionSettingValue.MY_URI,1,1));
		oci_CommercialShowcase.addObjectProperty(CommercialShowcase.PROPERTY_HAS_DOOR_TYPE_INFORMATION).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_DOOR_TYPE_INFORMATION,OperationStateSettingValue.MY_URI,1,1));
		oci_CommercialShowcase.addObjectProperty(CommercialShowcase.PROPERTY_HAS_SHOWCASE_CONFIGURATION_INFORMATION).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_SHOWCASE_CONFIGURATION_INFORMATION,OperationFunctionSettingValue.MY_URI,1,1));
		oci_CommercialShowcase.addDatatypeProperty(CommercialShowcase.PROPERTY_HAS_SHOWCASE_SHAPE_INFORMATION).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_SHOWCASE_SHAPE_INFORMATION,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_CommercialShowcase.addObjectProperty(CommercialShowcase.PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_RANGE_INFORMATION).setFunctional();
		oci_CommercialShowcase.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcase.PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_RANGE_INFORMATION,OperationStatusValue.MY_URI,1,1));
		
		oci_ClothesDryer.setResourceComment("");
		oci_ClothesDryer.setResourceLabel("ClothesDryer");
		oci_ClothesDryer.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ClothesDryer.addObjectProperty(ClothesDryer.PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS).setFunctional();
		oci_ClothesDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ClothesDryer.PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ClothesDryer.addObjectProperty(ClothesDryer.PROPERTY_HAS_DRYING_SETTING).setFunctional();
		oci_ClothesDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ClothesDryer.PROPERTY_HAS_DRYING_SETTING,OperationStateSettingValue.MY_URI,0,1));
		oci_ClothesDryer.addObjectProperty(ClothesDryer.PROPERTY_HAS_DRYING_STATUS).setFunctional();
		oci_ClothesDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ClothesDryer.PROPERTY_HAS_DRYING_STATUS,OperationModeSettingValue.MY_URI,0,1));
		oci_ClothesDryer.addDatatypeProperty(ClothesDryer.PROPERTY_HAS_DRYING_REMAINING_TIME).setFunctional();
		oci_ClothesDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ClothesDryer.PROPERTY_HAS_DRYING_REMAINING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_ClothesDryer.addObjectProperty(ClothesDryer.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING).setFunctional();
		oci_ClothesDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ClothesDryer.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));	
		oci_ClothesDryer.addDatatypeProperty(ClothesDryer.PROPERTY_HAS_ON_TIMER_SETTING).setFunctional();
		oci_ClothesDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ClothesDryer.PROPERTY_HAS_ON_TIMER_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));		
		oci_ClothesDryer.addDatatypeProperty(ClothesDryer.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_ClothesDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ClothesDryer.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		
		oci_WasherDryer.setResourceComment("");
		oci_WasherDryer.setResourceLabel("WasherDryer");
		oci_WasherDryer.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WasherDryer.addObjectProperty(WasherDryer.PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_WasherDryer.addObjectProperty(WasherDryer.PROPERTY_HAS_WASHER_DRYER_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WASHER_DRYER_SETTING,OperationStateSettingValue.MY_URI,0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE_SETTING_1).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE_SETTING_1,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE_SETTING_2).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE_SETTING_2,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_DRYING_CYCLE_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_DRYING_CYCLE_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_1).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_1,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_2).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_2,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_3).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE_OPTION_LIST_3,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_WATER_FLOW_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WATER_FLOW_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_ROTATION_SPEED_FOR_SPIN_DRYING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_ROTATION_SPEED_FOR_SPIN_DRYING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_DEGREE_OF_DRYING_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_DEGREE_OF_DRYING_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_REMAINING_WASHING_TIME).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_REMAINING_WASHING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_REMAINING_DRYING_TIME).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_REMAINING_DRYING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_ELAPSED_TIME_ON_THE_ON_TIMER).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_ELAPSED_TIME_ON_THE_ON_TIMER,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_PRESOAKING_TIME).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_PRESOAKING_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_CURRENT_STAGE_OF_WASHER_DRYER_CYCLE).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_CURRENT_STAGE_OF_WASHER_DRYER_CYCLE,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_WATER_VOLUME_SETTING_1).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WATER_VOLUME_SETTING_1,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_WATER_VOLUME_SETTING_2).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WATER_VOLUME_SETTING_2,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_WATSHING_TIME_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WATSHING_TIME_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_NUMBER_OF_RINSING_TIMES).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_NUMBER_OF_RINSING_TIMES,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_RINSING_PROCESS_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_RINSING_PROCESS_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_SPIN_DRYING_TIME_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_SPIN_DRYING_TIME_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_DRYING_TIME_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_DRYING_TIME_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_WARM_WATER_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WARM_WATER_SETTING,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_BATHTUB_WATER_RECYCLE_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_BATHTUB_WATER_RECYCLE_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addObjectProperty(WasherDryer.PROPERTY_HAS_WRINKLING_MINIMIZATION_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WRINKLING_MINIMIZATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_TIME_TO_COMPLETE_WASHER_AND_DRYER_CYCLE).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_TIME_TO_COMPLETE_WASHER_AND_DRYER_CYCLE,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_WASHER_DRYER_CYCLE,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addObjectProperty(WasherDryer.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_ON_TIMER_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_ON_TIMER_SETTING,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addDatatypeProperty(WasherDryer.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_WasherDryer.addObjectProperty(WasherDryer.PROPERTY_HAS_DOOR_COVER_LOCK_SETTING).setFunctional();
		oci_WasherDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WasherDryer.PROPERTY_HAS_DOOR_COVER_LOCK_SETTING,OperationStateSettingValue.MY_URI,0,1));
		
		oci_CommercialShowcaseOutdoorUnit.setResourceComment("");
		oci_CommercialShowcaseOutdoorUnit.setResourceLabel("CommercialShowcaseOutdoorUnit");
		oci_CommercialShowcaseOutdoorUnit.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CommercialShowcaseOutdoorUnit.addObjectProperty(CommercialShowcaseOutdoorUnit.PROPERTY_HAS_EXCEPTIONAL_STATUS).setFunctional();
		oci_CommercialShowcaseOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcaseOutdoorUnit.PROPERTY_HAS_EXCEPTIONAL_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_CommercialShowcaseOutdoorUnit.addObjectProperty(CommercialShowcaseOutdoorUnit.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_CommercialShowcaseOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcaseOutdoorUnit.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_CommercialShowcaseOutdoorUnit.addDatatypeProperty(CommercialShowcaseOutdoorUnit.PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE).setFunctional();
		oci_CommercialShowcaseOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcaseOutdoorUnit.PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE,TypeMapper.getDatatypeURI(Float.class),0,1));
		oci_CommercialShowcaseOutdoorUnit.addObjectProperty(CommercialShowcaseOutdoorUnit.PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS).setFunctional();
		oci_CommercialShowcaseOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcaseOutdoorUnit.PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_CommercialShowcaseOutdoorUnit.addDatatypeProperty(CommercialShowcaseOutdoorUnit.PROPERTY_HAS_GROUP_INFORMATION).setFunctional();
		oci_CommercialShowcaseOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CommercialShowcaseOutdoorUnit.PROPERTY_HAS_GROUP_INFORMATION,TypeMapper.getDatatypeURI(String.class),1,1));
		
		oci_WeighingMachine.setResourceComment("");
		oci_WeighingMachine.setResourceLabel("WeighingMachine");
		oci_WeighingMachine.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WeighingMachine.addDatatypeProperty(WeighingMachine.PROPERTY_HAS_MEASURED_BODY_WEIGHT).setFunctional();
		oci_WeighingMachine.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WeighingMachine.PROPERTY_HAS_MEASURED_BODY_WEIGHT,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_WeighingMachine.addDatatypeProperty(WeighingMachine.PROPERTY_HAS_MEASURED_BODY_FAT).setFunctional();
		oci_WeighingMachine.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WeighingMachine.PROPERTY_HAS_MEASURED_BODY_FAT,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_Switch.setResourceComment("");
		oci_Switch.setResourceLabel("Switch");
		oci_Switch.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_Switch.addDatatypeProperty(Switch.PROPERTY_HAS_CONNECTED_DEVICE).setFunctional();
		oci_Switch.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Switch.PROPERTY_HAS_CONNECTED_DEVICE,TypeMapper.getDatatypeURI(String.class),0,1));
		
		oci_Controller.setResourceComment("");
		oci_Controller.setResourceLabel("Controller");
		oci_Controller.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_CONTROLLER_ID).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_CONTROLLER_ID,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_NUMBER_OF_CONTROLLED_DEVICES).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_NUMBER_OF_CONTROLLED_DEVICES,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_INDEX).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_INDEX,TypeMapper.getDatatypeURI(Integer.class),0,1));
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_DEVICE_ID).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_DEVICE_ID,TypeMapper.getDatatypeURI(String.class),0,1));	
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_DEVICE_TYPE).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_DEVICE_TYPE,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_DEVICE_NAME).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_DEVICE_NAME,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_Controller.addObjectProperty(Controller.PROPERTY_HAS_CONNECTION_STATUS).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_CONNECTION_STATUS,OperationStatusValue.MY_URI,0,1));	
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_BUSINESS_CODE).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_BUSINESS_CODE,TypeMapper.getDatatypeURI(String.class),0,1));	
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_MANUFACTURER_DATE).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_MANUFACTURER_DATE,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_DATE).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_DATE,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_VERSION_INFORMATION).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_VERSION_INFORMATION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_Controller.addObjectProperty(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_INSTALLATION_LOCATION).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_INSTALLATION_LOCATION,InstallationLocationValue.MY_URI,0,1));
		oci_Controller.addObjectProperty(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_FAULT_STATUS).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_FAULT_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_INSTALLATION_LOCATION_ADDRESS).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_INSTALLATION_LOCATION_ADDRESS,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_GET_PROPERTY_MAP).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_GET_PROPERTY_MAP,TypeMapper.getDatatypeURI(String.class),0,1));	
		oci_Controller.addDatatypeProperty(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_SET_PROPERTY_MAP).setFunctional();
		oci_Controller.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Controller.PROPERTY_HAS_CONTROLLED_DEVICE_SET_PROPERTY_MAP,TypeMapper.getDatatypeURI(String.class),0,1));
		
		oci_DR_EventController.setResourceComment("Demand Reponse Event Controller");
		oci_DR_EventController.setResourceLabel("DR_Event_Controller");
		oci_DR_EventController.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_BUSINESS_ID).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_BUSINESS_ID,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_DR_PROGRAM_TYPE).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_DR_PROGRAM_TYPE,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_DR_PROGRAM_ID).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_DR_PROGRAM_ID,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_CURRENT_VALID_EVENT_INFO).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_CURRENT_VALID_EVENT_INFO,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_NEXT_VALID_EVENT_INFO).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_NEXT_VALID_EVENT_INFO,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_FUTURE_EVENT_INFO_NOTIFICATION_ID_LIST).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_FUTURE_EVENT_INFO_NOTIFICATION_ID_LIST,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_PAST_EVENT_INFO_NOTIFICATION_ID_LIST).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_PAST_EVENT_INFO_NOTIFICATION_ID_LIST,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_NEWEST_RECEIVED_EVENT_NOTIFICATION_ID).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_NEWEST_RECEIVED_EVENT_NOTIFICATION_ID,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_OLDEST_RECEIVED_EVENT_NOTIFICATION_ID).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_OLDEST_RECEIVED_EVENT_NOTIFICATION_ID,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_NOTIFICATION_ID_DESIGNATION).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_NOTIFICATION_ID_DESIGNATION,TypeMapper.getDatatypeURI(Integer.class),1,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_EVENT_INFO_ID_DESIGNATION).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_EVENT_INFO_ID_DESIGNATION,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_TARGET_DEVICE_INFO_LIST).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_TARGET_DEVICE_INFO_LIST,TypeMapper.getDatatypeURI(String.class),0,1));
		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_EVENT_INFO).setFunctional();
		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(DREventController.PROPERTY_HAS_EVENT_INFO,TypeMapper.getDatatypeURI(String.class),1,1));
//		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_CONFIRM_OPT_INFO).setFunctional();
//		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
//				(DREventController.PROPERTY_HAS_CONFIRM_OPT_INFO,TypeMapper.getDatatypeURI(String.class),0,1));
//		oci_DR_EventController.addDatatypeProperty(DREventController.PROPERTY_HAS_CONFIRM_OPT_INFO_STATUS).setFunctional();
//		oci_DR_EventController.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
//				(DREventController.PROPERTY_HAS_CONFIRM_OPT_INFO_STATUS,TypeMapper.getDatatypeURI(String.class),0,1));


		
		oci_ParallelProcessingCombinationTypePowerControl.setResourceComment("");
		oci_ParallelProcessingCombinationTypePowerControl.setResourceLabel("ParallelProcessingCombinationTypePowerControl");
		oci_ParallelProcessingCombinationTypePowerControl.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ParallelProcessingCombinationTypePowerControl.addDatatypeProperty(ParallelProcessingCombinationTypePowerControl.PROPERTY_SET_POWER_DEVIATION_INFORMATION).setFunctional();
		oci_ParallelProcessingCombinationTypePowerControl.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ParallelProcessingCombinationTypePowerControl.PROPERTY_SET_POWER_DEVIATION_INFORMATION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ParallelProcessingCombinationTypePowerControl.addDatatypeProperty(ParallelProcessingCombinationTypePowerControl.PROPERTY_SET_POWER_REDUCTION_INFORMATION).setFunctional();
		oci_ParallelProcessingCombinationTypePowerControl.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ParallelProcessingCombinationTypePowerControl.PROPERTY_SET_POWER_REDUCTION_INFORMATION,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ParallelProcessingCombinationTypePowerControl.addDatatypeProperty(ParallelProcessingCombinationTypePowerControl.PROPERTY_SET_TRANSMISSION_INTERVAL).setFunctional();
		oci_ParallelProcessingCombinationTypePowerControl.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ParallelProcessingCombinationTypePowerControl.PROPERTY_SET_TRANSMISSION_INTERVAL,TypeMapper.getDatatypeURI(Float.class),1,1));
		oci_ParallelProcessingCombinationTypePowerControl.addDatatypeProperty(ParallelProcessingCombinationTypePowerControl.PROPERTY_SET_RATED_POWER_CONSUMPTION_THRESHOLD).setFunctional();
		oci_ParallelProcessingCombinationTypePowerControl.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ParallelProcessingCombinationTypePowerControl.PROPERTY_SET_RATED_POWER_CONSUMPTION_THRESHOLD,TypeMapper.getDatatypeURI(Float.class),0,1));
		
		oci_Display.setResourceComment("");
		oci_Display.setResourceLabel("Display");
		oci_Display.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_Display.addObjectProperty(Display.PROPERTY_HAS_DISPLAY_CONTROL_SETTING).setFunctional();
		oci_Display.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Display.PROPERTY_HAS_DISPLAY_CONTROL_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_Display.addObjectProperty(Display.PROPERTY_HAS_CHARACTER_STRING_SETTING_ACCEPTANCE_STATUS).setFunctional();
		oci_Display.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Display.PROPERTY_HAS_CHARACTER_STRING_SETTING_ACCEPTANCE_STATUS,OperationStateSettingValue.MY_URI,1,1));
		oci_Display.addDatatypeProperty(Display.PROPERTY_HAS_SUPPORTED_CHARACTER_CODES).setFunctional();
		oci_Display.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Display.PROPERTY_HAS_SUPPORTED_CHARACTER_CODES,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_Display.addObjectProperty(Display.PROPERTY_HAS_CHARACTER_STRING_TO_PRESENT_TO_USER).setFunctional();
		oci_Display.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Display.PROPERTY_HAS_CHARACTER_STRING_TO_PRESENT_TO_USER,CharacterCodes.MY_URI,1,1));
		oci_Display.addDatatypeProperty(Display.PROPERTY_ACCEPTED_CHARACTER_STRING_LENGTH).setFunctional();
		oci_Display.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Display.PROPERTY_ACCEPTED_CHARACTER_STRING_LENGTH,TypeMapper.getDatatypeURI(Float.class),1,1));
		
		oci_Television.setResourceComment("");
		oci_Television.setResourceLabel("Television");
		oci_Television.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_Television.addObjectProperty(Television.PROPERTY_HAS_DISPLAY_CONTROL_SETTING).setFunctional();
		oci_Television.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Television.PROPERTY_HAS_DISPLAY_CONTROL_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_Television.addObjectProperty(Television.PROPERTY_HAS_CHARACTER_STRING_SETTING_ACCEPTANCE_STATUS).setFunctional();
		oci_Television.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Television.PROPERTY_HAS_CHARACTER_STRING_SETTING_ACCEPTANCE_STATUS,OperationStateSettingValue.MY_URI,1,1));
		oci_Television.addDatatypeProperty(Television.PROPERTY_HAS_SUPPORTED_CHARACTER_CODES).setFunctional();
		oci_Television.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Television.PROPERTY_HAS_SUPPORTED_CHARACTER_CODES,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_Television.addObjectProperty(Television.PROPERTY_HAS_CHARACTER_STRING_TO_PRESENT_TO_USER).setFunctional();
		oci_Television.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Television.PROPERTY_HAS_CHARACTER_STRING_TO_PRESENT_TO_USER,CharacterCodes.MY_URI,1,1));
		oci_Television.addDatatypeProperty(Television.PROPERTY_ACCEPTED_CHARACTER_STRING_LENGTH).setFunctional();
		oci_Television.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Television.PROPERTY_ACCEPTED_CHARACTER_STRING_LENGTH,TypeMapper.getDatatypeURI(Float.class),1,1));
		
		oci_Audio.setResourceComment("");
		oci_Audio.setResourceLabel("Audio");
		oci_Audio.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_Audio.addDatatypeProperty(Audio.PROPERTY_HAS_VOLUME_SETTING).setFunctional();
		oci_Audio.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Audio.PROPERTY_HAS_VOLUME_SETTING,TypeMapper.getDatatypeURI(Float.class),0,1));	
		oci_Audio.addObjectProperty(Audio.PROPERTY_HAS_MUTE_SETTING).setFunctional();
		oci_Audio.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Audio.PROPERTY_HAS_MUTE_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_Audio.addObjectProperty(Audio.PROPERTY_HAS_INPUT_SOURCE_SETTING).setFunctional();
		oci_Audio.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Audio.PROPERTY_HAS_INPUT_SOURCE_SETTING,InputSourceSettingValue.MY_URI,0,1));
		
		oci_NetworkCamera.setResourceComment("");
		oci_NetworkCamera.setResourceLabel("NetworkCamera");
		oci_NetworkCamera.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_NetworkCamera.addObjectProperty(NetworkCamera.PROPERTY_HAS_STILL_IMAGE_PHOTOGRAPHY_SETTING_ACCEPTANCE_STATUS).setFunctional();
		oci_NetworkCamera.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(NetworkCamera.PROPERTY_HAS_STILL_IMAGE_PHOTOGRAPHY_SETTING_ACCEPTANCE_STATUS,OperationStateSettingValue.MY_URI,1,1));	
		oci_NetworkCamera.addDatatypeProperty(NetworkCamera.PROPERTY_SET_STILL_IMAGE_PHOTOGRAPHY_SETTING).setFunctional();
		oci_NetworkCamera.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(NetworkCamera.PROPERTY_SET_STILL_IMAGE_PHOTOGRAPHY_SETTING,TypeMapper.getDatatypeURI(Boolean.class),1,1));	
		oci_NetworkCamera.addObjectProperty(NetworkCamera.PROPERTY_HAS_TRANSFER_SETTING).setFunctional();
		oci_NetworkCamera.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(NetworkCamera.PROPERTY_HAS_TRANSFER_SETTING,TransferingMethods.MY_URI,1,1));	
	}
	
}
