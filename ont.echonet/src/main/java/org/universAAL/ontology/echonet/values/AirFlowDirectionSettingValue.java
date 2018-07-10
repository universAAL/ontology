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

public class AirFlowDirectionSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "AirFlowDirectionSettingValue";
	private int order;
	public static final int RIGHTWARD = 0;
	public static final int LEFTWARD = 1;
	public static final int CENTRAL = 2;
	public static final int LEFT_CENTER = 3;
	public static final int RIGHT_CENTER = 4;
	public static final int UPPER_MOST = 5;
	public static final int LOWERMOST = 6;
	public static final int UPPERMOST_CENTRAL_MIDPOINT = 7;
	public static final int LOWERMOST_CENTRAL_MIDPOINT = 8;
	private static final String[] names = {"rightward", "leftward", "central", "leftCenter", "rightCenter", "uppermost","lowermost",
											"uppermost_CentralMidpoint", "lowermost_CentralMidpoint"};
	
	public static final AirFlowDirectionSettingValue Rightward = new AirFlowDirectionSettingValue(RIGHTWARD);
	public static final AirFlowDirectionSettingValue Leftward = new AirFlowDirectionSettingValue(LEFTWARD);
	public static final AirFlowDirectionSettingValue Central = new AirFlowDirectionSettingValue(CENTRAL);
	public static final AirFlowDirectionSettingValue LeftCenter = new AirFlowDirectionSettingValue(LEFT_CENTER);
	public static final AirFlowDirectionSettingValue RightCenter = new AirFlowDirectionSettingValue(RIGHT_CENTER);
	public static final AirFlowDirectionSettingValue Uppermost = new AirFlowDirectionSettingValue(UPPER_MOST);
	public static final AirFlowDirectionSettingValue Lowermost = new AirFlowDirectionSettingValue(LOWERMOST);
	public static final AirFlowDirectionSettingValue Uppermost_CentralMidpoint = new AirFlowDirectionSettingValue(UPPERMOST_CENTRAL_MIDPOINT);
	public static final AirFlowDirectionSettingValue Lowermost_CentralMidpoint = new AirFlowDirectionSettingValue(LOWERMOST_CENTRAL_MIDPOINT);

	private AirFlowDirectionSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static AirFlowDirectionSettingValue getAirFlowDirectionSettingValueByOrder(int order) {
		switch (order) {
		case RIGHTWARD:
			return Rightward;
		case LEFTWARD:
			return Leftward;
		case CENTRAL:
			return Central;
		case LEFT_CENTER:
			return LeftCenter;
		case RIGHT_CENTER:
			return RightCenter;
		case UPPER_MOST:
			return Uppermost;
		case LOWERMOST:
			return Lowermost;
		case UPPERMOST_CENTRAL_MIDPOINT:
			return Uppermost_CentralMidpoint;
		case LOWERMOST_CENTRAL_MIDPOINT:
			return Lowermost_CentralMidpoint;
		default:
			return null;
		}
	}

	public static final AirFlowDirectionSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = RIGHTWARD; i <= LOWERMOST_CENTRAL_MIDPOINT; i++)
			if (names[i].equals(name))
				return getAirFlowDirectionSettingValueByOrder(i);
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
