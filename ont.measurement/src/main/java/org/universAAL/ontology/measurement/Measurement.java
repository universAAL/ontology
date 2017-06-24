/*******************************************************************************
 * Copyright 2012 Universidad Politécnica de Madrid
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
package org.universAAL.ontology.measurement;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.unit.Prefix;
import org.universAAL.ontology.unit.Unit;

/**
 * The Main Measurement Concept. A measurement is a value with a measurement
 * unit, sometimes preceded by a prefix and also may include some type of error
 * declaration.
 *
 * @author amedrano
 * @navassoc - hasPrefix [0..1] Prefix
 * @navassoc - hasUnit - Unit
 * @navassoc - hasError [0..1] MeasurementError
 */
public class Measurement extends ManagedIndividual {
	public static final String MY_URI = MeasurementOntology.NAMESPACE + "Measurement";
	public static final String PROP_HAS_ERROR = MeasurementOntology.NAMESPACE + "hasError";
	public static final String PROP_HAS_UNIT = MeasurementOntology.NAMESPACE + "hasUnit";
	public static final String PROP_HAS_PREFIX = MeasurementOntology.NAMESPACE + "hasPrefix";
	public static final String PROP_VALUE = MeasurementOntology.NAMESPACE + "value";

	public Measurement() {
		super();
	}

	public Measurement(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true && hasProperty(PROP_VALUE);
	}

	public Object getValue() {
		return getProperty(PROP_VALUE);
	}

	public void setValue(Object newPropValue) {
		if (newPropValue != null)
			changeProperty(PROP_VALUE, newPropValue);
	}

	public MeasurementError getHasError() {
		return (MeasurementError) getProperty(PROP_HAS_ERROR);
	}

	public void setHasError(MeasurementError newPropValue) {
		if (newPropValue != null)
			changeProperty(PROP_HAS_ERROR, newPropValue);
	}

	public Unit getHasUnit() {
		return (Unit) getProperty(PROP_HAS_UNIT);
	}

	public void setHasUnit(Unit newPropValue) {
		if (newPropValue != null)
			changeProperty(PROP_HAS_UNIT, newPropValue);
	}

	public Prefix getHasPrefix() {
		return (Prefix) getProperty(PROP_HAS_PREFIX);
	}

	public void setHasPrefix(Prefix newPropValue) {
		if (newPropValue != null)
			changeProperty(PROP_HAS_PREFIX, newPropValue);
	}
}
