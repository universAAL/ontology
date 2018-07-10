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

public class ThresholdLevelValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "ThresholdLevelValue";
	public static final int MINIMUM_LEVEL = 0;
	public static final int LEVEL_1 = 1;
	public static final int LEVEL_2 = 2;
	public static final int LEVEL_3 = 3;
	public static final int LEVEL_4 = 4;
	public static final int LEVEL_5 = 5;
	public static final int LEVEL_6 = 6;
	public static final int LEVEL_7 = 7;
	public static final int LEVEL_8 = 8;
	public static final int LEVEL_9 = 9;
	public static final int LEVEL_10 = 10;
	public static final int LEVEL_11 = 11;
	public static final int LEVEL_12 = 12;
	public static final int LEVEL_13 = 13;
	public static final int LEVEL_14 = 14;
	public static final int LEVEL_15 = 15;
	public static final int MAXIMUM_LEVEL = 16;
	public static final int HIGH = 17;
	public static final int MEDIUM = 18;
	public static final int LOW = 19;
	public static final int AUTOMATIC_CONTROL = 20;
	public static final int STANDARD = 21;
	public static final int CONTINOUS_OPERATION = 22;
	public static final int INTERMITTENT_OPERATION = 23;
	
	
	private static final String[] names = { "minumumLevel","level1", "level2", "level3", "level4", "level5", "level6", "Level7", 
											"level8", "level9","level10","level11", "level12","level13", "level14","level15",
											"maximumLevel","high","medium","low","automaticControl","standard","continousOperation",
											"intermittentOperation"};
	
	public static final ThresholdLevelValue MinumumLevel = new ThresholdLevelValue(MINIMUM_LEVEL);
	public static final ThresholdLevelValue Level_1 = new ThresholdLevelValue(LEVEL_1);
	public static final ThresholdLevelValue Level_2 = new ThresholdLevelValue(LEVEL_2);
	public static final ThresholdLevelValue Level_3 = new ThresholdLevelValue(LEVEL_3);
	public static final ThresholdLevelValue Level_4 = new ThresholdLevelValue(LEVEL_4);
	public static final ThresholdLevelValue Level_5 = new ThresholdLevelValue(LEVEL_5);
	public static final ThresholdLevelValue Level_6 = new ThresholdLevelValue(LEVEL_6);
	public static final ThresholdLevelValue Level_7 = new ThresholdLevelValue(LEVEL_7);
	public static final ThresholdLevelValue Level_8 = new ThresholdLevelValue(LEVEL_8);
	public static final ThresholdLevelValue Level_9 = new ThresholdLevelValue(LEVEL_9);
	public static final ThresholdLevelValue Level_10 = new ThresholdLevelValue(LEVEL_10);
	public static final ThresholdLevelValue Level_11 = new ThresholdLevelValue(LEVEL_11);
	public static final ThresholdLevelValue Level_12 = new ThresholdLevelValue(LEVEL_12);
	public static final ThresholdLevelValue Level_13 = new ThresholdLevelValue(LEVEL_13);
	public static final ThresholdLevelValue Level_14 = new ThresholdLevelValue(LEVEL_14);
	public static final ThresholdLevelValue Level_15 = new ThresholdLevelValue(LEVEL_15);
	public static final ThresholdLevelValue MaximumLevel = new ThresholdLevelValue(MAXIMUM_LEVEL);
	
	public static final ThresholdLevelValue High = new ThresholdLevelValue(HIGH);
	public static final ThresholdLevelValue Medium = new ThresholdLevelValue(MEDIUM);
	public static final ThresholdLevelValue Low = new ThresholdLevelValue(LOW);
	public static final ThresholdLevelValue AutomaticControl = new ThresholdLevelValue(AUTOMATIC_CONTROL);
	public static final ThresholdLevelValue Standard = new ThresholdLevelValue(STANDARD);
	public static final ThresholdLevelValue ContinousOperation = new ThresholdLevelValue(CONTINOUS_OPERATION);
	public static final ThresholdLevelValue IntermittentOperation = new ThresholdLevelValue(INTERMITTENT_OPERATION);

	private int order;

	private ThresholdLevelValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static ThresholdLevelValue getThresholdLevelValueByOrder(int order) {
		switch (order) {
		case MINIMUM_LEVEL:
			return MinumumLevel;
		case LEVEL_1:
			return Level_1;
		case LEVEL_2:
			return Level_2;
		case LEVEL_3:
			return Level_3;
		case LEVEL_4:
			return Level_4;
		case LEVEL_5:
			return Level_5;
		case LEVEL_6:
			return Level_6;
		case LEVEL_7:
			return Level_7;
		case LEVEL_8:
			return Level_8;
		case LEVEL_9:
			return Level_9;
		case LEVEL_10:
			return Level_10;
		case LEVEL_11:
			return Level_11;
		case LEVEL_12:
			return Level_12;
		case LEVEL_13:
			return Level_13;
		case LEVEL_14:
			return Level_14;
		case LEVEL_15:
			return Level_15;
		case MAXIMUM_LEVEL:
			return MaximumLevel;
		case HIGH:
			return High;
		case MEDIUM:
			return Medium;
		case LOW:
			return Low;
		case AUTOMATIC_CONTROL:
			return AutomaticControl;
		case STANDARD:
			return Standard;
		default:
			return null;
		}
	}

	public static final ThresholdLevelValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = LEVEL_1; i <= STANDARD; i++)
			if (names[i].equals(name))
				return getThresholdLevelValueByOrder(i);
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
