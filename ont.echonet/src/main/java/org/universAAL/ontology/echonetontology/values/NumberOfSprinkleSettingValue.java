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

public class NumberOfSprinkleSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "NumberOfSprinkleSettingValue";
	private int order;
	public static final int FIRST_ON = 0;
	public static final int SECOND_ON = 1;
	public static final int BOTH_ON = 2;
	private static final String[] names = {"firstOn", "secondOn","bothOn"};
	public static final NumberOfSprinkleSettingValue FirstOn = new NumberOfSprinkleSettingValue(FIRST_ON);
	public static final NumberOfSprinkleSettingValue SecondOn = new NumberOfSprinkleSettingValue(SECOND_ON);
	public static final NumberOfSprinkleSettingValue BothOn = new NumberOfSprinkleSettingValue(BOTH_ON);

	private NumberOfSprinkleSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static NumberOfSprinkleSettingValue getNumberOfSprinkleSettingValueByOrder(int order) {
		switch (order) {
		case FIRST_ON:
			return FirstOn;
		case SECOND_ON:
			return SecondOn;		
		case BOTH_ON:
			return BothOn;		
		default:
			return null;
		}
	}

	public static final NumberOfSprinkleSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = FIRST_ON; i <= BOTH_ON; i++)
			if (names[i].equals(name))
				return getNumberOfSprinkleSettingValueByOrder(i);
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
