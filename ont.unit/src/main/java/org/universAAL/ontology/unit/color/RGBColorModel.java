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
public class RGBColorModel extends ColorModel {

	public static final String MY_URI = UnitOntology.NAMESPACE
			+ "RGBColorModel";
	public static final String PROP_RED = UnitOntology.NAMESPACE + "red";
	public static final String PROP_GREEN = UnitOntology.NAMESPACE + "green";
	public static final String PROP_BLUE = UnitOntology.NAMESPACE + "blue";

	public static final Unit IND_UNIT_RGB = new Unit("rgb", "Red Green Blue",
			"RGB", MeasurableDimension.Color);

	/**
	 * 
	 */
	public RGBColorModel() {
	}

	/**
	 * @param uri
	 */
	public RGBColorModel(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return super.isWellFormed() && hasProperty(PROP_RED)
				&& hasProperty(PROP_GREEN) && hasProperty(PROP_BLUE);
	}

	public static RGBColorModel constructRGBColor(int red, int green, int blue) {
		RGBColorModel cm = new RGBColorModel();
		cm.setProperty(PROP_RED, Integer.valueOf(red));
		cm.setProperty(PROP_GREEN, Integer.valueOf(green));
		cm.setProperty(PROP_BLUE, Integer.valueOf(blue));
		return cm;
	}
}
