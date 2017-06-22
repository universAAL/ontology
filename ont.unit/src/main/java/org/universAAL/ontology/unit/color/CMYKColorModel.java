/*******************************************************************************
 * Copyright 2017 2011 Universidad Politécnica de Madrid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.unit.color;

import org.universAAL.ontology.unit.MeasurableDimension;
import org.universAAL.ontology.unit.Unit;
import org.universAAL.ontology.unit.UnitOntology;

/**
 * @author amedrano
 * 
 */
public class CMYKColorModel extends ColorModel {

	public static final String MY_URI = UnitOntology.NAMESPACE
			+ "CMYKColorModel";
	public static final String PROP_CYAN = UnitOntology.NAMESPACE + "cyan";
	public static final String PROP_MAGENTA = UnitOntology.NAMESPACE
			+ "magenta";
	public static final String PROP_YELLOW = UnitOntology.NAMESPACE + "Yellow";
	public static final String PROP_BLACK = UnitOntology.NAMESPACE + "black";

	public static final Unit IND_UNIT_CMYK = new Unit("cmyk",
			"Cyan, Magenta, Yellow, and Key", "CMYK ",
			MeasurableDimension.Color);

	/**
	 * 
	 */
	public CMYKColorModel() {
	}

	/**
	 * @param uri
	 */
	public CMYKColorModel(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return super.isWellFormed() && hasProperty(PROP_CYAN)
				&& hasProperty(PROP_YELLOW) && hasProperty(PROP_MAGENTA)
				&& hasProperty(PROP_BLACK);
	}

	public static CMYKColorModel constructCMYKColor(int cyan, int magenta,
			int yellow, int black) {
		CMYKColorModel cm = new CMYKColorModel();
		cm.setProperty(PROP_CYAN, Integer.valueOf(cyan));
		cm.setProperty(PROP_YELLOW, Integer.valueOf(yellow));
		cm.setProperty(PROP_MAGENTA, Integer.valueOf(magenta));
		cm.setProperty(PROP_BLACK, Integer.valueOf(black));
		return cm;
	}
}
