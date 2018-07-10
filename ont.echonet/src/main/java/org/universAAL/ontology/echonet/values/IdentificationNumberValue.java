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

public class IdentificationNumberValue extends ManagedIndividual {
public static final String MY_URI = EchonetOntology.NAMESPACE + "IdentificationNumberValue";
	
	public static final int LOWER_LAYER_COMMUNICATION_PROTOCOL = 0;
	public static final int POWER_LINE_COMMUNICATION_PROTOCOL_A_D = 1;
	public static final int LOW_POWER_RADIO_COMMUNICATION_PROTOCOL = 2;
	public static final int EXTENDED_HBS = 3;
	public static final int IRDA = 4;
	public static final int LON_TALK = 5;
	public static final int BLUETOOTH = 6;
	public static final int ETHERNET = 7;
	public static final int IEEE802_11_11_B = 8;
	public static final int POWER_LINE_COMMUNICATION_PROTOCOL_C = 9;
	public static final int IPV6_ETHERNET = 10;
	public static final int IPV6_6LOWPAN = 11;
	public static final int MANUFACTURER_DEFINED_PROTOCOL = 12;
	public static final int RAMDONLY_GENERATED_PROTOCOL = 13;
	public static final int IDENTIFICATION_NOT_SET = 14;
	
	
	private static final String[] names = {"lowerLayerCommunicationProtocol", "powerLineCommunicationProtocol_A_D",
										   "lowPowerRadioCommunicationProtocol", "extendedHBS", "irDA","lonTalk",
										   "bluetooth", "ethernet", "ieee802_11_11B","powerLineCommunicationProtocol_C",
										   "ipV6_Ethernet", "ipV6_6LoWPAN", "manufacturerDefinedProtocol","randomlyGeneratedProtocol",
										   "identificationNotSet"};
	
	public static final IdentificationNumberValue LowerLayerCommunicationProtocol = new IdentificationNumberValue(LOWER_LAYER_COMMUNICATION_PROTOCOL);
	public static final IdentificationNumberValue PowerLineCommunicationProtocol_A_D = new IdentificationNumberValue(POWER_LINE_COMMUNICATION_PROTOCOL_A_D);
	public static final IdentificationNumberValue LowPowerRadioCommunicationProtocol = new IdentificationNumberValue(LOW_POWER_RADIO_COMMUNICATION_PROTOCOL);
	public static final IdentificationNumberValue ExtendedHBS = new IdentificationNumberValue(EXTENDED_HBS);
	public static final IdentificationNumberValue IrDA = new IdentificationNumberValue(IRDA);
	public static final IdentificationNumberValue LonTalk = new IdentificationNumberValue(LON_TALK);
	public static final IdentificationNumberValue Bluetooth = new IdentificationNumberValue(BLUETOOTH);
	public static final IdentificationNumberValue Ethernet = new IdentificationNumberValue(ETHERNET);
	public static final IdentificationNumberValue IEEE802_11_11B = new IdentificationNumberValue(IEEE802_11_11_B);
	public static final IdentificationNumberValue PowerLineCommunicationProtocol_C = new IdentificationNumberValue(POWER_LINE_COMMUNICATION_PROTOCOL_C);
	public static final IdentificationNumberValue IPV6_Ethernet = new IdentificationNumberValue(IPV6_ETHERNET);
	public static final IdentificationNumberValue IPV6_6LoWPAN = new IdentificationNumberValue(IPV6_6LOWPAN);
	public static final IdentificationNumberValue ManufacturerDefinedProtocol = new IdentificationNumberValue(MANUFACTURER_DEFINED_PROTOCOL);
	public static final IdentificationNumberValue RandomlyGeneratedProtocol = new IdentificationNumberValue(RAMDONLY_GENERATED_PROTOCOL);
	public static final IdentificationNumberValue IdentificationNotSet = new IdentificationNumberValue(IDENTIFICATION_NOT_SET);
	private int order;

	private IdentificationNumberValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static IdentificationNumberValue getIdentificationNumberValueByOrder(int order) {
		switch (order) {
		case LOWER_LAYER_COMMUNICATION_PROTOCOL:
			return LowerLayerCommunicationProtocol;
		case POWER_LINE_COMMUNICATION_PROTOCOL_A_D:
			return PowerLineCommunicationProtocol_A_D;
		case LOW_POWER_RADIO_COMMUNICATION_PROTOCOL:
			return LowPowerRadioCommunicationProtocol;
		case EXTENDED_HBS:
			return ExtendedHBS;
		case IRDA:
			return IrDA;
		case LON_TALK:
			return LonTalk;
		case BLUETOOTH:
			return Bluetooth;
		case ETHERNET:
			return Ethernet;
		case IEEE802_11_11_B:
			return IEEE802_11_11B;
		case POWER_LINE_COMMUNICATION_PROTOCOL_C:
			return PowerLineCommunicationProtocol_C;
		case IPV6_ETHERNET:
			return IPV6_Ethernet;
		case IPV6_6LOWPAN:
			return IPV6_6LoWPAN;
		case MANUFACTURER_DEFINED_PROTOCOL:
			return ManufacturerDefinedProtocol;
		case RAMDONLY_GENERATED_PROTOCOL:
			return RandomlyGeneratedProtocol;
		case IDENTIFICATION_NOT_SET:
			return IdentificationNotSet;			
		default:
			return null;
		}
	}

	public static final IdentificationNumberValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = LOWER_LAYER_COMMUNICATION_PROTOCOL; i <= IDENTIFICATION_NOT_SET; i++)
			if (names[i].equals(name))
				return getIdentificationNumberValueByOrder(i);
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
