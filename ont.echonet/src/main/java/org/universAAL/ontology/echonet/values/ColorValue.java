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

public class ColorValue extends ManagedIndividual{

	protected ColorValue(String uri) {
		super(uri);
	}
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ColorValue";
	
	public static final int INCANDESCENT_LAMP_COLOR = 0;
	public static final int WHITE = 1;
	public static final int DAYLIGHT_WHITE = 2;
	public static final int DAYLIGHT_COLOR = 3;
	public static final int OTHERS = 4;
	private static final String[] names = { "incandescentLampColor", "white","daylightWhite","daylightColor","others"};
	
	public static final ColorValue IncandescentLampColor = new ColorValue(INCANDESCENT_LAMP_COLOR);
	public static final ColorValue White = new ColorValue(WHITE);
	public static final ColorValue DaylightWhite = new ColorValue(DAYLIGHT_WHITE);
	public static final ColorValue DaylightColor = new ColorValue(DAYLIGHT_COLOR);
	public static final ColorValue Others = new ColorValue(OTHERS);
	
	private int order;

	private ColorValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static ColorValue getColorValueByOrder(int order) {
		switch (order) {
		case INCANDESCENT_LAMP_COLOR:
			return IncandescentLampColor;
		case WHITE:
			return White;
		case DAYLIGHT_WHITE:
			return DaylightWhite;
		case DAYLIGHT_COLOR:
			return DaylightColor;
		case OTHERS:
			return Others;
		default:
			return null;
		}
	}

	public static final ColorValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = INCANDESCENT_LAMP_COLOR; i <= OTHERS; i++)
			if (names[i].equals(name))
				return getColorValueByOrder(i);
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
