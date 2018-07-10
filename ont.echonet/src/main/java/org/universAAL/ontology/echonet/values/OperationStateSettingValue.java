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

public class OperationStateSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "OperationStateSettingValue";
	private int order;
	public static final int NORMAL_OPERATION_STATE = 0;
	public static final int SPECIAL_STATE = 1;
	public static final int DEFROSTING_STATE = 2;
	public static final int PREHEATING_STATE = 3;
	public static final int HEAT_REMOVAL_STATE = 4;
	public static final int AUTOMATIC_AIRFLOW_SWING_NOT_USED = 5;
	public static final int AUTOMATIC_AIRFLOW_SWING_VERTICAL_USED = 6;
	public static final int AUTOMATIC_AIRFLOW_SWING_HORIZONTAL_USED = 7;
	public static final int AUTOMATIC_AIRFLOW_SWING_VERTICAL_AND_HORIZONTAL_USED = 8;
	public static final int FULLY_OPENED = 9;
	public static final int FULLY_CLOSED = 10;
	public static final int OPENED = 11;
	public static final int CLOSED = 12;
	public static final int STOP_HALFWAY = 13;
	public static final int NON_PRIORITY_STATE = 14;
	public static final int LOCKED = 15;
	public static final int UNLOCKED = 16;
	public static final int ORIDINARY_LEVEL = 17;
	public static final int NOTIFICATION_OF_BATTERY_REPLACEMENT_STATE = 18;
	public static final int SUPPLYING_HOT_WATER_STATE = 19;
	public static final int KEEPING_BATH_TEMPERATURE_STATE = 20;
	public static final int STOPPED = 21;
	public static final int GENERATING = 22;
	public static final int STARTING = 23;
	public static final int STOPPING = 24;
	public static final int IDLING = 25;
	public static final int UNDETERMINED_STATE = 26;
	public static final int VEHICLE_NOT_CONNECTED_STATE = 27;
	public static final int VEHICLE_CONNECTED_NOT_CHARGEABLE_NOT_DISCHARGEABLE_STATE = 28;
	public static final int VEHICLE_CONNECTED_CHARGEABLE_NOT_DISCHARGEABLE_STATE = 29;
	public static final int VEHICLE_CONNECTED_NOT_CHARGEABLE_DISCHARGEABLE_STATE = 30;
	public static final int VEHICLE_CONNECTED_CHARGEABLE_DISCHARGEABLE_STATE = 31;
	public static final int VEHICLE_CONNECTED_CHARGEABLE_STATE = 32;
	public static final int VEHICLE_CONNECTED_NOT_CHARGEABLE_STATE = 33;
	public static final int READY_STATE = 34;
	public static final int BUSY_STATE = 35;
	public static final int IMPLEMENTED_STATE = 36;
	public static final int NOT_IMPLEMENTED_STATE = 37;
	public static final int ENABLE_STATE = 38;
	public static final int DISABLE_STATE = 39;
	public static final int TEMPORARY_DISABLE_STATE = 40;
	public static final int CONNECTED_STATE = 41;
	public static final int DISCONNECTED_STATE = 42;
	public static final int NOT_REGISTERED_STATE = 43;
	public static final int DELETED_STATE = 44;
	public static final int STARTED_RESTARTED_STATE = 45;
	public static final int SUSPENDED_STATE = 46;
	public static final int MOUNTED_STATE = 47;
	public static final int UNMOUNTED_STATED = 48;
	
	
	private static final String[] names = {"normalOperation", "specialState","defrostingState","preHeatingState","heatRemovalState",
										   "automaticAirFlowSwingNotUsed", "automaticAirFlowSwingVerticalUsed", "automaticAirFlowSwingHorizontalUsed",
										   "automaticAirFlowSwingVerticalAndHorizontalUsed","fullyOpened","fullyClosed","opened", "closed", "stopHalfway",
										   "nonPriorityState","locked","unLocked","ordinaryLevel","notificationOfBatteryReplacementState",
										   "supplyingHotWaterState","keepingBathTemperatureState","stopped","generating","starting","stopping",
										   "idling","undeterminedState","vehicleNotConnectedState","vehicleConnectedNotChargeableNotDischargableState",
										   "vehicleConnectedChargeableNotDischargableState","vehicleConnectedNotChargeableDischargableState",
										   "vehicleConnectedChargeableDischargableState","vehicleConnectedChargeableState",
										   "vehicleConnectedNotChargeableState","readyState","busyState","implementedState","notImplementedState",
										   "enableState","disableState","temporaryDisableState","connectedState","disconnectedState","notRegisteredState",
										   "deletedState","startedRestartedState","suspendedState","mountedState","unMountedState"};
	
	
	public static final OperationStateSettingValue NormalOperation = new OperationStateSettingValue(NORMAL_OPERATION_STATE);
	public static final OperationStateSettingValue SpecialState = new OperationStateSettingValue(SPECIAL_STATE);
	public static final OperationStateSettingValue DefrostingState = new OperationStateSettingValue(DEFROSTING_STATE);
	public static final OperationStateSettingValue PreHeatingState = new OperationStateSettingValue(PREHEATING_STATE);
	public static final OperationStateSettingValue HeatRemovalState = new OperationStateSettingValue(HEAT_REMOVAL_STATE);
	public static final OperationStateSettingValue AutomaticAirFlowSwingNotUsed = new OperationStateSettingValue(AUTOMATIC_AIRFLOW_SWING_NOT_USED);
	public static final OperationStateSettingValue AutomaticAirFlowSwingVerticalUsed = new OperationStateSettingValue(AUTOMATIC_AIRFLOW_SWING_VERTICAL_USED);
	public static final OperationStateSettingValue AutomaticAirFlowSwingHorizontalUsed = new OperationStateSettingValue(AUTOMATIC_AIRFLOW_SWING_HORIZONTAL_USED);
	public static final OperationStateSettingValue AutomaticAirFlowSwingVerticalAndHorizontalUsed = new OperationStateSettingValue(AUTOMATIC_AIRFLOW_SWING_VERTICAL_AND_HORIZONTAL_USED);
	public static final OperationStateSettingValue FullyOpened = new OperationStateSettingValue(FULLY_OPENED);
	public static final OperationStateSettingValue FullyClosed = new OperationStateSettingValue(FULLY_CLOSED);
	public static final OperationStateSettingValue Opened = new OperationStateSettingValue(OPENED);
	public static final OperationStateSettingValue Closed = new OperationStateSettingValue(CLOSED);
	public static final OperationStateSettingValue StopHalfway = new OperationStateSettingValue(STOP_HALFWAY);
	public static final OperationStateSettingValue NonPriorityState = new OperationStateSettingValue(NON_PRIORITY_STATE);
	public static final OperationStateSettingValue Locked = new OperationStateSettingValue(LOCKED);
	public static final OperationStateSettingValue UnLocked = new OperationStateSettingValue(UNLOCKED);
	public static final OperationStateSettingValue OrdinaryLevel = new OperationStateSettingValue(ORIDINARY_LEVEL);
	public static final OperationStateSettingValue NotificationOfBatteryReplacementState = new OperationStateSettingValue(NOTIFICATION_OF_BATTERY_REPLACEMENT_STATE);
	public static final OperationStateSettingValue SupplyingHotWaterState = new OperationStateSettingValue(SUPPLYING_HOT_WATER_STATE);
	public static final OperationStateSettingValue KeepingBathTemperatureState = new OperationStateSettingValue(KEEPING_BATH_TEMPERATURE_STATE);
	public static final OperationStateSettingValue Stopped = new OperationStateSettingValue(STOPPED);
	public static final OperationStateSettingValue Generating = new OperationStateSettingValue(GENERATING);
	public static final OperationStateSettingValue Starting = new OperationStateSettingValue(STARTING);
	public static final OperationStateSettingValue Stopping = new OperationStateSettingValue(STOPPING);
	public static final OperationStateSettingValue Idling = new OperationStateSettingValue(IDLING);
	public static final OperationStateSettingValue UndeterminedState = new OperationStateSettingValue(UNDETERMINED_STATE);
	public static final OperationStateSettingValue VehicleNotConnectedState = new OperationStateSettingValue(VEHICLE_NOT_CONNECTED_STATE);
	public static final OperationStateSettingValue VehicleConnectedNotChargeableNotDischargableState = new OperationStateSettingValue(VEHICLE_CONNECTED_NOT_CHARGEABLE_NOT_DISCHARGEABLE_STATE);
	public static final OperationStateSettingValue VehicleConnectedChargeableNotDischargableState = new OperationStateSettingValue(VEHICLE_CONNECTED_CHARGEABLE_NOT_DISCHARGEABLE_STATE);
	public static final OperationStateSettingValue VehicleConnectedNotChargeableDischargableState = new OperationStateSettingValue(VEHICLE_CONNECTED_NOT_CHARGEABLE_DISCHARGEABLE_STATE);
	public static final OperationStateSettingValue VehicleConnectedChargeableDischargableState = new OperationStateSettingValue(VEHICLE_CONNECTED_CHARGEABLE_DISCHARGEABLE_STATE);
	public static final OperationStateSettingValue VehicleConnectedChargeableState = new OperationStateSettingValue(VEHICLE_CONNECTED_CHARGEABLE_STATE);
	public static final OperationStateSettingValue VehicleConnectedNotChargeableState = new OperationStateSettingValue(VEHICLE_CONNECTED_NOT_CHARGEABLE_STATE);
	public static final OperationStateSettingValue ReadyState = new OperationStateSettingValue(READY_STATE);
	public static final OperationStateSettingValue BusyState = new OperationStateSettingValue(BUSY_STATE);
	public static final OperationStateSettingValue ImplementedState = new OperationStateSettingValue(IMPLEMENTED_STATE);
	public static final OperationStateSettingValue NotImplementedState = new OperationStateSettingValue(NOT_IMPLEMENTED_STATE);
	public static final OperationStateSettingValue EnableState = new OperationStateSettingValue(ENABLE_STATE);
	public static final OperationStateSettingValue DisableState = new OperationStateSettingValue(DISABLE_STATE);
	public static final OperationStateSettingValue TemporaryDisableState = new OperationStateSettingValue(TEMPORARY_DISABLE_STATE);
	public static final OperationStateSettingValue ConnectedState = new OperationStateSettingValue(CONNECTED_STATE);
	public static final OperationStateSettingValue DisconnectedState = new OperationStateSettingValue(DISCONNECTED_STATE);
	public static final OperationStateSettingValue NotRegisteredState = new OperationStateSettingValue(NOT_REGISTERED_STATE);
	public static final OperationStateSettingValue DeletedState = new OperationStateSettingValue(DELETED_STATE);
	public static final OperationStateSettingValue StartedRestartedState = new OperationStateSettingValue(STARTED_RESTARTED_STATE);
	public static final OperationStateSettingValue SuspendedState = new OperationStateSettingValue(SUSPENDED_STATE);
	public static final OperationStateSettingValue MountedState = new OperationStateSettingValue(MOUNTED_STATE);
	public static final OperationStateSettingValue UnMountedState = new OperationStateSettingValue(UNMOUNTED_STATED);

	private OperationStateSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static OperationStateSettingValue getOperationStateSettingValueValueByOrder(int order) {
		switch (order) {
		case NORMAL_OPERATION_STATE:
			return NormalOperation;
		case SPECIAL_STATE:
			return SpecialState;	
		case DEFROSTING_STATE:
			return DefrostingState;	
		case PREHEATING_STATE:
			return PreHeatingState;	
		case HEAT_REMOVAL_STATE:
			return HeatRemovalState;
		case AUTOMATIC_AIRFLOW_SWING_NOT_USED:
			return AutomaticAirFlowSwingNotUsed;
		case AUTOMATIC_AIRFLOW_SWING_VERTICAL_USED:
			return AutomaticAirFlowSwingVerticalUsed;
		case AUTOMATIC_AIRFLOW_SWING_HORIZONTAL_USED:
			return AutomaticAirFlowSwingHorizontalUsed;
		case AUTOMATIC_AIRFLOW_SWING_VERTICAL_AND_HORIZONTAL_USED:
			return AutomaticAirFlowSwingVerticalAndHorizontalUsed;
		case FULLY_OPENED:
			return FullyOpened;
		case FULLY_CLOSED:
			return FullyClosed;
		case OPENED:
			return Opened;
		case CLOSED:
			return Closed;
		case STOP_HALFWAY:
			return StopHalfway;
		case NON_PRIORITY_STATE:
			return NonPriorityState;	
		case LOCKED:
			return Locked;
		case UNLOCKED:
			return UnLocked;
		case ORIDINARY_LEVEL:
			return OrdinaryLevel;
		case NOTIFICATION_OF_BATTERY_REPLACEMENT_STATE:
			return NotificationOfBatteryReplacementState;
		case SUPPLYING_HOT_WATER_STATE:
			return SupplyingHotWaterState;
		case KEEPING_BATH_TEMPERATURE_STATE:
			return KeepingBathTemperatureState;
		case STOPPED:
			return Stopped;
		case GENERATING:
			return Generating;
		case STARTING:
			return Starting;
		case STOPPING:
			return Stopping;
		case IDLING:
			return Idling;
		case UNDETERMINED_STATE:
			return UndeterminedState;
		case VEHICLE_NOT_CONNECTED_STATE:
			return VehicleNotConnectedState;
		case VEHICLE_CONNECTED_NOT_CHARGEABLE_NOT_DISCHARGEABLE_STATE:
			return VehicleConnectedNotChargeableNotDischargableState;
		case VEHICLE_CONNECTED_CHARGEABLE_NOT_DISCHARGEABLE_STATE:
			return VehicleConnectedChargeableNotDischargableState;
		case VEHICLE_CONNECTED_NOT_CHARGEABLE_DISCHARGEABLE_STATE:
			return VehicleConnectedNotChargeableDischargableState;
		case VEHICLE_CONNECTED_CHARGEABLE_DISCHARGEABLE_STATE:
			return VehicleConnectedChargeableDischargableState;
		case VEHICLE_CONNECTED_CHARGEABLE_STATE:
			return VehicleConnectedChargeableState;
		case VEHICLE_CONNECTED_NOT_CHARGEABLE_STATE:
			return VehicleConnectedNotChargeableState;
		case READY_STATE:
			return ReadyState;
		case BUSY_STATE:
			return BusyState;
		case IMPLEMENTED_STATE:
			return ImplementedState;
		case NOT_IMPLEMENTED_STATE:
			return NotImplementedState;
		case ENABLE_STATE:
			return EnableState;
		case DISABLE_STATE:
			return DisableState;
		case TEMPORARY_DISABLE_STATE:
			return TemporaryDisableState;
		case CONNECTED_STATE:
			return ConnectedState;
		case DISCONNECTED_STATE:
			return DisconnectedState;	
		case NOT_REGISTERED_STATE:
			return NotRegisteredState;
		case DELETED_STATE:
			return DeletedState;
		case STARTED_RESTARTED_STATE:
			return StartedRestartedState;
		case SUSPENDED_STATE:
			return SuspendedState;
		case MOUNTED_STATE:
			return MountedState;
		case UNMOUNTED_STATED:
			return UnMountedState;
					
		default:
			return null;
		}
	}

	public static final OperationStateSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NORMAL_OPERATION_STATE; i <= UNMOUNTED_STATED; i++)
			if (names[i].equals(name))
				return getOperationStateSettingValueValueByOrder(i);
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
