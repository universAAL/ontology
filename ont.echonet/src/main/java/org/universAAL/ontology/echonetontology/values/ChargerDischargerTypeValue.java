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

public class ChargerDischargerTypeValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "ChargerDischargerTypeValue";
private int order;
	public static final int AC_HLC_CHARGING_ONLY = 0;
	public static final int AC_HLC_CHARGING_DISCHARGING_POSSIBLE = 1;
	public static final int DC_TYPE_AA_CHARGING_ONLY = 2;
	public static final int DC_TYPE_AA_CHARGING_DISCHARGING_POSSIBLE = 3;
	public static final int DC_TYPE_AA_DISCHARGING_ONLY = 4;
	public static final int DC_TYPE_BB_CHARGING_ONLY = 5;
	public static final int DC_TYPE_BB_CHARGING_DISCHARGING_POSSIBLE = 6;
	public static final int DC_TYPE_BB_DISCHARGING_ONLY = 7;
	public static final int DC_TYPE_EE_CHARGING_ONLY = 8;
	public static final int DC_TYPE_EE_CHARGING_DISCHARGING_POSSIBLE = 9;
	public static final int DC_TYPE_EE_DISCHARGING_ONLY = 10;
	public static final int DC_TYPE_FF_CHARGING_ONLY = 11;
	public static final int DC_TYPE_FF_CHARGING_DISCHARGING_POSSIBLE = 12;
	public static final int DC_TYPE_FF_DISCHARGING_ONLY = 13;
	public static final int AC_CPLT = 14;
	
	
	private static final String[] names = {"ac_HLC_ChargingOnly", "ac_HLC_ChargingDischargingPossible", 
										   "dcTypeAA_ChargingOnly", "dcTypeAA_ChargingDischargingPossible", "dcTypeAA_DischargingOnly",
										   "dcTypeBB_ChargingOnly", "dcTypeBB_ChargingDischargingPossible", "dcTypeBB_DischargingOnly",
										   "dcTypeEE_ChargingOnly", "dcTypeEE_ChargingDischargingPossible", "dcTypeEE_DischargingOnly",
										   "dcTypeFF_ChargingOnly", "dcTypeFF_ChargingDischargingPossible", "dcTypeFF_DischargingOnly",
										   "ac_CPLT"};
	
	public static final ChargerDischargerTypeValue AC_HLC_ChargingOnly = new ChargerDischargerTypeValue(AC_HLC_CHARGING_ONLY);
	public static final ChargerDischargerTypeValue AC_HLC_ChargingDischargingPossible = new ChargerDischargerTypeValue(AC_HLC_CHARGING_DISCHARGING_POSSIBLE);
	public static final ChargerDischargerTypeValue DCTypeAA_ChargingOnly = new ChargerDischargerTypeValue(DC_TYPE_AA_CHARGING_ONLY);
	public static final ChargerDischargerTypeValue DCTypeAA_ChargingDischargingPossible = new ChargerDischargerTypeValue(DC_TYPE_AA_CHARGING_DISCHARGING_POSSIBLE);
	public static final ChargerDischargerTypeValue DCTypeAA_DischargingOnly = new ChargerDischargerTypeValue(DC_TYPE_AA_DISCHARGING_ONLY);
	public static final ChargerDischargerTypeValue DCTypeBB_ChargingOnly = new ChargerDischargerTypeValue(DC_TYPE_BB_CHARGING_ONLY);
	public static final ChargerDischargerTypeValue DCTypeBB_ChargingDischargingPossible = new ChargerDischargerTypeValue(DC_TYPE_BB_CHARGING_DISCHARGING_POSSIBLE);
	public static final ChargerDischargerTypeValue DCTypeBB_DischargingOnly = new ChargerDischargerTypeValue(DC_TYPE_BB_DISCHARGING_ONLY);
	public static final ChargerDischargerTypeValue DCTypeEE_ChargingOnly = new ChargerDischargerTypeValue(DC_TYPE_EE_CHARGING_ONLY);
	public static final ChargerDischargerTypeValue DCTypeEE_ChargingDischargingPossible = new ChargerDischargerTypeValue(DC_TYPE_EE_CHARGING_DISCHARGING_POSSIBLE);
	public static final ChargerDischargerTypeValue DCTypeEE_DischargingOnly = new ChargerDischargerTypeValue(DC_TYPE_EE_DISCHARGING_ONLY);
	public static final ChargerDischargerTypeValue DCTypeFF_ChargingOnly = new ChargerDischargerTypeValue(DC_TYPE_FF_CHARGING_ONLY);
	public static final ChargerDischargerTypeValue DCTypeFF_ChargingDischargingPossible = new ChargerDischargerTypeValue(DC_TYPE_FF_CHARGING_DISCHARGING_POSSIBLE);
	public static final ChargerDischargerTypeValue DCTypeFF_DischargingOnly = new ChargerDischargerTypeValue(DC_TYPE_FF_DISCHARGING_ONLY);
	public static final ChargerDischargerTypeValue ACCPLT = new ChargerDischargerTypeValue(AC_CPLT);
	
	private ChargerDischargerTypeValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static ChargerDischargerTypeValue getChargerDischargerTypeValueByOrder(int order) {
		switch (order) {
		case AC_HLC_CHARGING_ONLY:
			return AC_HLC_ChargingOnly;
		case AC_HLC_CHARGING_DISCHARGING_POSSIBLE:
			return AC_HLC_ChargingDischargingPossible;
		case DC_TYPE_AA_CHARGING_ONLY:
			return DCTypeAA_ChargingOnly;
		case DC_TYPE_AA_CHARGING_DISCHARGING_POSSIBLE:
			return DCTypeAA_ChargingDischargingPossible;
		case DC_TYPE_AA_DISCHARGING_ONLY:
			return DCTypeAA_DischargingOnly;	
		case DC_TYPE_BB_CHARGING_ONLY:
			return DCTypeBB_ChargingOnly;
		case DC_TYPE_BB_CHARGING_DISCHARGING_POSSIBLE:
			return DCTypeBB_ChargingDischargingPossible;
		case DC_TYPE_BB_DISCHARGING_ONLY:
			return DCTypeBB_DischargingOnly;
		case DC_TYPE_EE_CHARGING_ONLY:
			return DCTypeEE_ChargingOnly;
		case DC_TYPE_EE_CHARGING_DISCHARGING_POSSIBLE:
			return DCTypeEE_ChargingDischargingPossible;
		case DC_TYPE_EE_DISCHARGING_ONLY:
			return DCTypeEE_DischargingOnly;
		case DC_TYPE_FF_CHARGING_ONLY:
			return DCTypeFF_ChargingOnly;
		case DC_TYPE_FF_CHARGING_DISCHARGING_POSSIBLE:
			return DCTypeFF_ChargingDischargingPossible;
		case DC_TYPE_FF_DISCHARGING_ONLY:
			return DCTypeFF_DischargingOnly;
		case AC_CPLT:
			return ACCPLT;	
		default:
			return null;
		}
	}

	public static final ChargerDischargerTypeValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = AC_HLC_CHARGING_ONLY; i <= AC_CPLT; i++)
			if (names[i].equals(name))
				return getChargerDischargerTypeValueByOrder(i);
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
