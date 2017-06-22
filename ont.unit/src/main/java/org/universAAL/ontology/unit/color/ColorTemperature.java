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
public class ColorTemperature extends ColorModel {

	public static final String MY_URI = UnitOntology.NAMESPACE
			+ "ColorTemperature";
	public static final String PROP_DEGREES = UnitOntology.NAMESPACE
			+ "degrees";

	public static final Unit IND_UNIT_COLOR_TEMPERATURE = new Unit(
			"color_temp", "Color Temperature", "K", MeasurableDimension.Color);

	/**
	 * 
	 */
	public ColorTemperature() {
	}

	/**
	 * @param uri
	 */
	public ColorTemperature(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return super.isWellFormed() && hasProperty(PROP_DEGREES);
	}

	public static ColorTemperature constructRGBColor(int k) {
		ColorTemperature cm = new ColorTemperature();
		cm.setProperty(PROP_DEGREES, Integer.valueOf(k));
		return cm;
	}
}
