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

public class CharacterCodes extends ManagedIndividual{

	protected CharacterCodes(String uri) {
		super(uri);
	}
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CharacterCodes";
	
	public static final int ANSI_X3DOT4 = 0;
	public static final int SHIFT_JIS = 1;
	public static final int _JIS = 2;
	public static final int JAPAN_EUC = 3;
	public static final int UCS_4 = 4;
	public static final int UCS_2 = 5;
	public static final int LATIN_1 = 6;
	public static final int UTF_8 = 7;
	private static final String[] names = { "ansi_X3Dot4", "shift_JIS","jis","japanEUC","ucs4","ucs2","latin1","utf8"};
	
	public static final CharacterCodes ANSI_X3Dot4 = new CharacterCodes(ANSI_X3DOT4);
	public static final CharacterCodes Shift_JIS = new CharacterCodes(SHIFT_JIS);
	public static final CharacterCodes JIS = new CharacterCodes(_JIS);
	public static final CharacterCodes JapanEUC = new CharacterCodes(JAPAN_EUC);
	public static final CharacterCodes UCS4 = new CharacterCodes(UCS_4);
	public static final CharacterCodes UCS2 = new CharacterCodes(ANSI_X3DOT4);
	public static final CharacterCodes Latin1 = new CharacterCodes(LATIN_1);
	public static final CharacterCodes UTF8 = new CharacterCodes(UTF_8);
	
	private int order;

	private CharacterCodes(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static CharacterCodes getCharacterCodesByOrder(int order) {
		switch (order) {
		case ANSI_X3DOT4:
			return ANSI_X3Dot4;
		case SHIFT_JIS:
			return Shift_JIS;
		case _JIS:
			return JIS;
		case JAPAN_EUC:
			return JapanEUC;
		case UCS_4:
			return UCS4;
		case UCS_2:
			return UCS2;
		case LATIN_1:
			return Latin1;
		case UTF_8:
			return UTF8;
		default:
			return null;
		}
	}

	public static final CharacterCodes valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = ANSI_X3DOT4; i <= UTF_8; i++)
			if (names[i].equals(name))
				return getCharacterCodesByOrder(i);
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
