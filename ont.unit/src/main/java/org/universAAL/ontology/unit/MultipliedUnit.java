/*******************************************************************************
 * Copyright 2012 UPM - Universidad Politécnica de Madrid
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
package org.universAAL.ontology.unit;

public class MultipliedUnit extends DerivedUnit {
	public static final String MY_URI = UnitOntology.NAMESPACE + "MultipliedUnit";
	public static final String PROP_MULTIPLIED_BY = UnitOntology.NAMESPACE + "multipliedBy";
	public static final String PROP_MULTIPLIED_BY_PREFIX = UnitOntology.NAMESPACE + "multipliedByPrefix";

	public MultipliedUnit() {
		super();
	}

	public MultipliedUnit(String uri) {
		super(uri);
	}

	public MultipliedUnit(Unit base, Unit mult) {
		super(base);
		setMultipliedBy(mult);
	}

	public MultipliedUnit(String uriPostfix, Unit base, Unit mult) {
		super(uriPostfix, base);
		setMultipliedBy(mult);
	}

	public MultipliedUnit(String uriPostfix, Unit base, Prefix basePrefix, Unit mult) {
		super(uriPostfix, base, basePrefix);
		setMultipliedBy(mult);
	}

	public MultipliedUnit(String uriPostfix, Unit base, Prefix basePrefix, Unit mult, Prefix multPrefix) {
		super(uriPostfix, base, basePrefix);
		setMultipliedBy(mult);
		setMultipliedByPrefix(multPrefix);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return super.getPropSerializationType(arg0);
	}

	public boolean isWellFormed() {
		return true && hasProperty(PROP_MULTIPLIED_BY);
	}

	public Unit getMultipliedBy() {
		return (Unit) getProperty(PROP_MULTIPLIED_BY);
	}

	private void setMultipliedBy(Unit newPropValue) {
		if (newPropValue != null)
			props.put(PROP_MULTIPLIED_BY, newPropValue);
	}

	public Prefix getMultipliedByPrefix() {
		return (Prefix) getProperty(PROP_MULTIPLIED_BY_PREFIX);
	}

	private void setMultipliedByPrefix(Prefix newPropValue) {
		if (newPropValue != null)
			props.put(PROP_MULTIPLIED_BY_PREFIX, newPropValue);
	}

	public String getSymbol() {
		if (!hasProperty(PROP_SYMBOL)) {
			String base, mult;
			if (hasProperty(PROP_BASE_PREFIX)) {
				base = getBasePrefix().getSymbol() + getBaseUnit().getSymbol();
			} else {
				base = getBaseUnit().getSymbol();
			}
			if (hasProperty(PROP_MULTIPLIED_BY_PREFIX)) {
				mult = getMultipliedByPrefix().getSymbol() + getMultipliedBy().getSymbol();
			} else {
				mult = getMultipliedBy().getSymbol();
			}
			return base + mult;
		} else {
			return super.getSymbol();
		}
	}
}
