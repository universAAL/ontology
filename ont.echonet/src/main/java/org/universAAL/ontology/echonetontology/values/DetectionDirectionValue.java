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

public class DetectionDirectionValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "DetectionDirectionValue";
	private int order;
	public static final int IN_DIRECTION = 0;
	public static final int IN_RIGHT_DIRECTION = 1;
	public static final int RIGHT_DIRECTION = 2;
	public static final int OUT_RIGHT_DIRECTION = 3;
	public static final int OUT_DIRECTION = 4;
	public static final int OUT_LEFT_DIRECTION = 5;
	public static final int LEFT_DIRECTION = 6;
	public static final int IN_LEFT_DIRECTION = 7;
	public static final int NO_DETECTION = 8;
	public static final int DETECED_DIRECTION_UNKNOWN = 9;
	private static final String[] names = {"inDirection", "in_RightDirection", "rightDirection", "out_RightDirection", 
										   "outDirection", "out_LeftDirection", "leftDirection", "in_LeftDirection",
										   "noDetection","detected_DirectionUnknown"};
	
	public static final DetectionDirectionValue InDirection = new DetectionDirectionValue(IN_DIRECTION);
	public static final DetectionDirectionValue In_RightDirection = new DetectionDirectionValue(IN_RIGHT_DIRECTION);
	public static final DetectionDirectionValue RightDirection = new DetectionDirectionValue(RIGHT_DIRECTION);
	public static final DetectionDirectionValue Out_RightDirection = new DetectionDirectionValue(OUT_RIGHT_DIRECTION);
	public static final DetectionDirectionValue OutDirection = new DetectionDirectionValue(OUT_DIRECTION);
	public static final DetectionDirectionValue Out_LeftDirection = new DetectionDirectionValue(OUT_LEFT_DIRECTION);
	public static final DetectionDirectionValue LeftDirection = new DetectionDirectionValue(LEFT_DIRECTION);
	public static final DetectionDirectionValue In_LeftDirection = new DetectionDirectionValue(IN_LEFT_DIRECTION);
	public static final DetectionDirectionValue NoDetection = new DetectionDirectionValue(NO_DETECTION);
	public static final DetectionDirectionValue Detected_DirectionUnknown = new DetectionDirectionValue(DETECED_DIRECTION_UNKNOWN);

	private DetectionDirectionValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static DetectionDirectionValue getDetectionDirectionValueByOrder(int order) {
		switch (order) {
		case IN_DIRECTION:
			return InDirection;
		case IN_RIGHT_DIRECTION:
			return In_RightDirection;
		case RIGHT_DIRECTION:
			return RightDirection;
		case OUT_RIGHT_DIRECTION:
			return Out_RightDirection;
		case OUT_DIRECTION:
			return OutDirection;
		case OUT_LEFT_DIRECTION:
			return Out_LeftDirection;
		case LEFT_DIRECTION:
			return LeftDirection;
		case IN_LEFT_DIRECTION:
			return In_LeftDirection;
		case NO_DETECTION:
			return NoDetection;
		case DETECED_DIRECTION_UNKNOWN:
			return Detected_DirectionUnknown;
		default:
			return null;
		}
	}

	public static final DetectionDirectionValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = IN_DIRECTION; i <= DETECED_DIRECTION_UNKNOWN; i++)
			if (names[i].equals(name))
				return getDetectionDirectionValueByOrder(i);
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
