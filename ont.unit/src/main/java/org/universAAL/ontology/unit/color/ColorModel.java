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

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.unit.UnitOntology;

/**
 * @author amedrano
 * 
 */
public abstract class ColorModel extends ManagedIndividual {

	public static final String MY_URI = UnitOntology.NAMESPACE + "ColorModel";
	public static final String PROP_COLOR_UNIT = UnitOntology.NAMESPACE
			+ "unitOfColor";

	// public static final Unit IND_UNIT_LAMBDA = new Unit("wavelength",
	// "Wavelength", "λ", MeasurableDimension.Color);

	// TODO add webColor and transformations
	// public static final Unit IND_UNIT_WEB_COLOR = new Unit("web_color",
	// "X11 color names", "", MeasurableDimension.Color);
	/**
	 * 
	 */
	public ColorModel() {
	}

	/**
	 * @param uri
	 */
	public ColorModel(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true && hasProperty(PROP_COLOR_UNIT);
	}

}
