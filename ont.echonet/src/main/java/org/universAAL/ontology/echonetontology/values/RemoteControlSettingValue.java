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

public class RemoteControlSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "RemoteControlSettingValue";
	
	public static final int NOT_THROUGH_A_PUBLIC_NETWORK = 0;
	public static final int THROUGH_A_PUBLIC_NETWORK = 1;
	public static final int COMMUNICATION_LINE_NORMAL_DISABLE_PUBLIC_NETWORK = 2;
	public static final int COMMUNICATION_LINE_NORMAL_ENABLE_PUBLIC_NETWORK = 3;
	
	
	private static final String[] names = {"notThroughAPublicNetwork", "throughAPublicNetwork",
										   "normalCommunicationLine_PublicNetworkDiabled", 
										   "normalCommunicationLine_PublicNetworkEnalbed",};
	
	public static final RemoteControlSettingValue NotThroughPublicNetwork = new RemoteControlSettingValue(NOT_THROUGH_A_PUBLIC_NETWORK);
	public static final RemoteControlSettingValue ThroughPublicNetwork = new RemoteControlSettingValue(NOT_THROUGH_A_PUBLIC_NETWORK);
	public static final RemoteControlSettingValue NormalCommunicationLine_PublicNetworkDiabled = new RemoteControlSettingValue(COMMUNICATION_LINE_NORMAL_DISABLE_PUBLIC_NETWORK);
	public static final RemoteControlSettingValue NormalCommunicationLine_PublicNetworkEnalbed = new RemoteControlSettingValue(COMMUNICATION_LINE_NORMAL_ENABLE_PUBLIC_NETWORK);
	private int order;

	private RemoteControlSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static RemoteControlSettingValue getRemoteControlSettingValueByOrder(int order) {
		switch (order) {
		case NOT_THROUGH_A_PUBLIC_NETWORK:
			return NotThroughPublicNetwork;
		case THROUGH_A_PUBLIC_NETWORK:
			return ThroughPublicNetwork;
		case COMMUNICATION_LINE_NORMAL_DISABLE_PUBLIC_NETWORK:
			return NormalCommunicationLine_PublicNetworkDiabled;
		case COMMUNICATION_LINE_NORMAL_ENABLE_PUBLIC_NETWORK:
			return NormalCommunicationLine_PublicNetworkEnalbed;		
		default:
			return null;
		}
	}

	public static final RemoteControlSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NOT_THROUGH_A_PUBLIC_NETWORK; i <= COMMUNICATION_LINE_NORMAL_ENABLE_PUBLIC_NETWORK; i++)
			if (names[i].equals(name))
				return getRemoteControlSettingValueByOrder(i);
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
