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
package org.universAAL.ontology.unit.system;

import org.universAAL.ontology.unit.MeasurableDimension;
import org.universAAL.ontology.unit.Unit;
import org.universAAL.ontology.unit.UnitOntology;
import org.universAAL.ontology.unit.UnitSystem;

/**
 * @author amedrano
 * 
 */
public class ColorSpace extends UnitSystem {

	public static final UnitSystem IND_COLOR_SPACE = new UnitSystem(
			UnitOntology.NAMESPACE + "colorSpaces");

	// units
	public static final Unit IND_UNIT_RGB = new Unit("rgb", "Red Green Blue",
			"RGB", MeasurableDimension.Color);

	public static final Unit IND_UNIT_WEB_COLOR = new Unit("web_color",
			"X11 color names", "", MeasurableDimension.Color);

	// TODO add full webcolor to RGB conversion table.
	public static final Unit IND_UNIT_CMYK = new Unit("cmyk",
			"Cyan, Magenta, Yellow, and Key", "CMYK ",
			MeasurableDimension.Color);

	public static final Unit IND_UNIT_HSV = new Unit("hsv",
			"Hue Saturation Value", "HSV", MeasurableDimension.Color);

	public static final Unit IND_UNIT_LAMBDA = new Unit("wavelength",
			"Wavelength", "λ", MeasurableDimension.Color);

	public static final Unit IND_UNIT_COLOR_TEMPERATURE = new Unit(
			"color_temp", "Color Temperature", "K", MeasurableDimension.Color);

}
