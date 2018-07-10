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
package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class PowerDistributionBoardMetering extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "PowerDistributionBoardMetering";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeElectricEnergyAmount_NormalDirection";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeElectricEnergyAmount_ReverseDirection";
	public static final String PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeElectricEnergyAmountUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeElectricEnergyAmountHistoricalData_NormalDirection";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION = EchonetOntology.NAMESPACE + "hasMeasuredCummulativeElectricEnergyAmountHistoricalData_ReverseDirection";
	public static final String PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "hasDayToRetrieveMeasuredCummulativeElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY= EchonetOntology.NAMESPACE + "hasMeasuredInstantanenousAmountOfElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT= EchonetOntology.NAMESPACE + "hasMeasuredInstantanenousCurrent";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_VOLTAGE= EchonetOntology.NAMESPACE + "hasMeasuredInstantanenousVoltage";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_1= EchonetOntology.NAMESPACE + "hasMeasurementChannel1";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_2= EchonetOntology.NAMESPACE + "hasMeasurementChannel2";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_3= EchonetOntology.NAMESPACE + "hasMeasurementChannel3";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_4= EchonetOntology.NAMESPACE + "hasMeasurementChannel4";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_5= EchonetOntology.NAMESPACE + "hasMeasurementChannel5";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_6= EchonetOntology.NAMESPACE + "hasMeasurementChannel6";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_7= EchonetOntology.NAMESPACE + "hasMeasurementChannel7";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_8= EchonetOntology.NAMESPACE + "hasMeasurementChannel8";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_9= EchonetOntology.NAMESPACE + "hasMeasurementChannel9";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_10= EchonetOntology.NAMESPACE + "hasMeasurementChannel10";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_11= EchonetOntology.NAMESPACE + "hasMeasurementChannel11";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_12= EchonetOntology.NAMESPACE + "hasMeasurementChannel12";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_13= EchonetOntology.NAMESPACE + "hasMeasurementChannel13";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_14= EchonetOntology.NAMESPACE + "hasMeasurementChannel14";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_15= EchonetOntology.NAMESPACE + "hasMeasurementChannel15";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_16= EchonetOntology.NAMESPACE + "hasMeasurementChannel16";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_17= EchonetOntology.NAMESPACE + "hasMeasurementChannel17";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_18= EchonetOntology.NAMESPACE + "hasMeasurementChannel18";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_19= EchonetOntology.NAMESPACE + "hasMeasurementChannel19";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_20= EchonetOntology.NAMESPACE + "hasMeasurementChannel20";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_21= EchonetOntology.NAMESPACE + "hasMeasurementChannel21";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_22= EchonetOntology.NAMESPACE + "hasMeasurementChannel22";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_23= EchonetOntology.NAMESPACE + "hasMeasurementChannel23";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_24= EchonetOntology.NAMESPACE + "hasMeasurementChannel24";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_25= EchonetOntology.NAMESPACE + "hasMeasurementChannel25";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_26= EchonetOntology.NAMESPACE + "hasMeasurementChannel26";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_27= EchonetOntology.NAMESPACE + "hasMeasurementChannel27";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_28= EchonetOntology.NAMESPACE + "hasMeasurementChannel28";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_29= EchonetOntology.NAMESPACE + "hasMeasurementChannel29";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_30= EchonetOntology.NAMESPACE + "hasMeasurementChannel30";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_31= EchonetOntology.NAMESPACE + "hasMeasurementChannel31";
	public static final String PROPERTY_HAS_MEASUREMENT_CHANNEL_32= EchonetOntology.NAMESPACE + "hasMeasurementChannel32";
	public static final String PROPERTY_HAS_MASTER_RATED_CAPACITY= EchonetOntology.NAMESPACE + "hasMasterRatedCapacity";
	public static final String PROPERTY_HAS_NUMBER_OF_MEASUREMENT_CHANELS_SIMPLEX= EchonetOntology.NAMESPACE + "hasNumberOfMeasurementChanels_Simplex";
	public static final String PROPERTY_HAS_CHANNEL_RANGE_FOR_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_MEASUREMENT_SIMPLEX= 
								EchonetOntology.NAMESPACE + "hasChannelRangeForCummulativeAmountOfElectricPowerConsumptionMeasurement_Simplex";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_LIST_SIMPLEX= 
								EchonetOntology.NAMESPACE + "hasMeasuredCummulativeAmountOfElectricPowerConsumptionList_Simplex";
	public static final String PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_CURRENT_MEASUREMENT_SIMPLEX= 
								EchonetOntology.NAMESPACE + "hasChannelRangeForInstantaneousCurrentMeasurement_Simplex";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT_LIST_SIMPLEX= EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousCurrentList_Simplex";
	public static final String PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_POWER_CONSUMPTION_MEASUREMENT_SIMPLEX= 
								EchonetOntology.NAMESPACE + "hasChannelRangeForInstantaneousPowerConsumptionMeasurement_Simplex";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION_LIST_SIMPLEX= 
								EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousPowerConsumptionList_Simplex";
	public static final String PROPERTY_HAS_NUMBER_OF_MEASUREMENT_CHANELS_DUPLEX= EchonetOntology.NAMESPACE + "hasNumberOfMeasurementChanels_Duplex";
	public static final String PROPERTY_HAS_CHANNEL_RANGE_FOR_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_MEASUREMENT_DUPPLEX= 
								EchonetOntology.NAMESPACE + "hasChannelRangeForCummulativeAmountOfElectricPowerConsumptionMeasurement_Duplex";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_LIST_DUPLEX= 
								EchonetOntology.NAMESPACE + "hasMeasuredCummulativeAmountOfElectricPowerConsumptionList_Duplex";
	public static final String PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_CURRENT_MEASUREMENT_DUPLEX= 
								EchonetOntology.NAMESPACE + "hasChannelRangeForInstantaneousCurrentMeasurement_Duplex";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT_LIST_DUPLEX= EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousCurrentList_Duplex";
	public static final String PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_POWER_CONSUMPTION_MEASUREMENT_DUPLEX= 
								EchonetOntology.NAMESPACE + "hasChannelRangeForInstantaneousPowerConsumptionMeasurement_Duplex";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION_LIST_DUPLEX= 
								EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousPowerConsumptionList_Duplex";
	
	public MeasuredValue getMeasuredInstantanenousAmountOfElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY);	
	}
	public void setMeasuredInstantanenousAmountOfElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousPowerConsumptionList_Duplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION_LIST_DUPLEX);	
	}
	public void setMeasuredInstantaneousPowerConsumptionList_Duplex(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION_LIST_DUPLEX, msg);	
	}
	public MeasuredValue getChannelRangeForInstantaneousCurrentMeasurement_dumplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_CURRENT_MEASUREMENT_DUPLEX);	
	}
	public void setChannelRangeForInstantaneousCurrentMeasurement_dumplex(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_CURRENT_MEASUREMENT_DUPLEX, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousCurrentList_Duplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT_LIST_DUPLEX);	
	}
	public void setMeasuredInstantaneousCurrentList_Duplex(MeasuredValue msg) {
		if(msg !=null) 
				changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT_LIST_DUPLEX, msg);	
	}
	public MeasuredValue getChannelRangeForInstantaneousPowerConsumptionMeasurement_Duplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_POWER_CONSUMPTION_MEASUREMENT_DUPLEX);	
	}
	public void setChannelRangeForInstantaneousPowerConsumptionMeasurement_Duplex(MeasuredValue msg) {
		if(msg !=null) 
				changeProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_POWER_CONSUMPTION_MEASUREMENT_DUPLEX, msg);	
	}
	public MeasuredValue getMeasuredCummulativeAmountOfElectricPowerConsumptionList_Duplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_LIST_DUPLEX);	
	}
	public void setMeasuredCummulativeAmountOfElectricPowerConsumptionList_Duplex(MeasuredValue msg) {
		if(msg !=null) 
				changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_LIST_DUPLEX, msg);	
	}
	public MeasuredValue getChannelRangeForCummulativeAmountOfElectricPowerConsumptionMeasurement_Duplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_MEASUREMENT_DUPPLEX);	
	}
	public void setChannelRangeForCummulativeAmountOfElectricPowerConsumptionMeasurement_Duplex(MeasuredValue msg) {
		if(msg !=null) 
				changeProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_MEASUREMENT_DUPPLEX, msg);	
	}
	public MeasuredValue getNumberOfMeasurementChanels_Duplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_NUMBER_OF_MEASUREMENT_CHANELS_DUPLEX);	
	}
	public void setNumberOfMeasurementChanels_Duplex(MeasuredValue msg) {
		if(msg !=null) 
				changeProperty(PROPERTY_HAS_NUMBER_OF_MEASUREMENT_CHANELS_DUPLEX, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousPowerConsumptionList_Simplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION_LIST_SIMPLEX);	
	}
	public void setMeasuredInstantaneousPowerConsumptionList_Simplex(MeasuredValue msg) {
		if(msg !=null) 
				changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION_LIST_SIMPLEX, msg);	
	}
	public MeasuredValue getChannelRangeForInstantaneousPowerConsumptionMeasurement_Simplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_POWER_CONSUMPTION_MEASUREMENT_SIMPLEX);	
	}
	public void setChannelRangeForInstantaneousPowerConsumptionMeasurement_Simplex(MeasuredValue msg) {
		if(msg !=null) 
				changeProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_POWER_CONSUMPTION_MEASUREMENT_SIMPLEX, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousCurrentList_Simplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT_LIST_SIMPLEX);	
	}
	public void setMeasuredInstantaneousCurrentList_Simplex(MeasuredValue msg) {
		if(msg !=null) 
				changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT_LIST_SIMPLEX, msg);	
	}
	public MeasuredValue getChannelRangeForInstantaneousCurrentMeasurement_Simplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_CURRENT_MEASUREMENT_SIMPLEX);	
	}
	public void setChannelRangeForInstantaneousCurrentMeasurement_Simplex(MeasuredValue msg) {
		if(msg !=null) 
				changeProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_INSTANTANEOUS_CURRENT_MEASUREMENT_SIMPLEX, msg);	
	}
	public MeasuredValue getMeasuredCummulativeAmountOfElectricPowerConsumptionList_Simplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_LIST_SIMPLEX);	
	}
	public void setMeasuredCummulativeAmountOfElectricPowerConsumptionList_Simplex(MeasuredValue msg) {
		if(msg !=null) 
				changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_LIST_SIMPLEX, msg);	
	}
	
	public MeasuredValue getChannelRangeForCummulativeAmountOfElectricPowerConsumptionMeasurement_Simplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_MEASUREMENT_SIMPLEX);	
	}
	public void setChannelRangeForCummulativeAmountOfElectricPowerConsumptionMeasurement_Simplex(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHANNEL_RANGE_FOR_CUMMULATIVE_AMOUNT_OF_ELECTRIC_POWER_CONSUMPTION_MEASUREMENT_SIMPLEX, msg);	
	}
	
	public MeasuredValue getNumberOfMeasurementChanels_Simplex() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_NUMBER_OF_MEASUREMENT_CHANELS_SIMPLEX);	
	}
	public void setNumberOfMeasurementChanels_Simplex(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_MEASUREMENT_CHANELS_SIMPLEX, msg);	
	}
	
	public MeasuredValue getMasterRatedCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MASTER_RATED_CAPACITY);	
	}
	public void setMasterRatedCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MASTER_RATED_CAPACITY, msg);	
	}
	
	public MeasuredValue getMeasurementChannel32() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_32);	
	}
	public void setMeasurementChannel32(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_32, msg);	
	}
	public MeasuredValue getMeasurementChannel31() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_31);	
	}
	public void setMeasurementChannel31(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_31, msg);	
	}
	public MeasuredValue getMeasurementChannel30() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_30);	
	}
	public void setMeasurementChannel30(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_30, msg);	
	}
	public MeasuredValue getMeasurementChannel29() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_29);	
	}
	public void setMeasurementChannel29(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_29, msg);	
	}
	public MeasuredValue getMeasurementChannel28() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_28);	
	}
	public void setMeasurementChannel28(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_28, msg);	
	}
	public MeasuredValue getMeasurementChannel27() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_27);	
	}
	public void setMeasurementChannel27(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_27, msg);	
	}
	public MeasuredValue getMeasurementChannel26() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_26);	
	}
	public void setMeasurementChannel26(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_26, msg);	
	}
	public MeasuredValue getMeasurementChannel25() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_25);	
	}
	public void setMeasurementChannel25(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_25, msg);	
	}
	public MeasuredValue getMeasurementChannel24() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_24);	
	}
	public void setMeasurementChannel24(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_24, msg);	
	}
	public MeasuredValue getMeasurementChannel23() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_23);	
	}
	public void setMeasurementChannel23(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_23, msg);	
	}
	public MeasuredValue getMeasurementChannel22() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_22);	
	}
	public void setMeasurementChannel22(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_22, msg);	
	}
	public MeasuredValue getMeasurementChannel21() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_21);	
	}
	public void setMeasurementChannel21(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_21, msg);	
	}
	public MeasuredValue getMeasurementChannel20() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_20);	
	}
	public void setMeasurementChannel20(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_20, msg);	
	}
	public MeasuredValue getMeasurementChannel19() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_19);	
	}
	public void setMeasurementChannel19(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_19, msg);	
	}
	public MeasuredValue getMeasurementChannel18() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_18);	
	}
	public void setMeasurementChannel18(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_18, msg);	
	}
	public MeasuredValue getMeasurementChannel17() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_17);	
	}
	public void setMeasurementChannel17(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_17, msg);	
	}
	public MeasuredValue getMeasurementChannel16() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_16);	
	}
	public void setMeasurementChannel16(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_16, msg);	
	}
	public MeasuredValue getMeasurementChannel15() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_15);	
	}
	public void setMeasurementChannel15(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_15, msg);	
	}
	public MeasuredValue getMeasurementChannel14() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_14);	
	}
	public void setMeasurementChannel14(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_14, msg);	
	}
	public MeasuredValue getMeasurementChannel13() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_13);	
	}
	public void setMeasurementChannel13(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_13, msg);	
	}
	public MeasuredValue getMeasurementChannel12() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_12);	
	}
	public void setMeasurementChannel12(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_12, msg);	
	}
	public MeasuredValue getMeasurementChannel11() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_11);	
	}
	public void setMeasurementChannel11(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_11, msg);	
	}
	public MeasuredValue getMeasurementChannel10() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_10);	
	}
	public void setMeasurementChannel10(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_10, msg);	
	}
	public MeasuredValue getMeasurementChannel9() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_9);	
	}
	public void setMeasurementChannel9(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_9, msg);	
	}
	public MeasuredValue getMeasurementChannel8() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_8);	
	}
	public void setMeasurementChannel8(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_8, msg);	
	}
	public MeasuredValue getMeasurementChannel7() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_7);	
	}
	public void setMeasurementChannel7(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_7, msg);	
	}
	public MeasuredValue getMeasurementChannel6() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_6);	
	}
	public void setMeasurementChannel6(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_6, msg);	
	}
	public MeasuredValue getMeasurementChannel5() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_5);	
	}
	public void setMeasurementChannel5(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_5, msg);	
	}
	public MeasuredValue getMeasurementChannel4() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_4);	
	}
	public void setMeasurementChannel4(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_4, msg);	
	}
	public MeasuredValue getMeasurementChannel3() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_3);	
	}
	public void setMeasurementChannel3(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_3, msg);	
	}
	public MeasuredValue getMeasurementChannel2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_2);	
	}
	public void setMeasurementChannel2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_2, msg);	
	}
	public MeasuredValue getMeasurementChannel1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_1);	
	}
	public void setMeasurementChannel1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASUREMENT_CHANNEL_1, msg);	
	}
	public MeasuredValue getMeasuredInstantanenousVoltage() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_VOLTAGE);	
	}
	public void setMeasuredInstantanenousVoltage(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_VOLTAGE, msg);	
	}
	public MeasuredValue getMeasuredInstantanenousCurrent() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT);	
	}
	public void setMeasuredInstantanenousCurrent(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT, msg);	
	}
	public DateTimeValue getDayToRetrieveMeasuredCummulativeElectricEnergy() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY);	
	}
	public void setDayToRetrieveMeasuredCummulativeElectricEnergy(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getMeasuredCummulativeElectricEnergyAmountHistoricalData_ReverseDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION);	
	}
	public void setMeasuredCummulativeElectricEnergyAmountHistoricalData_ReverseDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION, msg);	
	}
	public MeasuredValue getMeasuredCummulativeElectricEnergyAmountHistoricalData_NormalDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION);	
	}
	public void setMeasuredCummulativeElectricEnergyAmountHistoricalData_NormalDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION, msg);	
	}
	public String getMeasuredCummulativeElectricEnergyAmountUnit() {
		return (String) getProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT);	
	}
	public void setMeasuredCummulativeElectricEnergyAmountUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT, msg);	
	}
	public MeasuredValue getMeasuredCummulativeElectricEnergyAmount_ReverseDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION);	
	}
	public void setMeasuredCummulativeElectricEnergyAmount_ReverseDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION, msg);	
	}
	public MeasuredValue getMeasuredCummulativeElectricEnergyAmount_NormalDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION);	
	}
	public void setMeasuredCummulativeElectricEnergyAmount_NormalDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION, msg);	
	}

	
	public PowerDistributionBoardMetering() {
		super();
	}
	public PowerDistributionBoardMetering(String uri) {
		super(uri);
	}
	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}
	

}
