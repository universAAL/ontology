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

public abstract class DerivedUnit extends Unit {
	public static final String MY_URI = UnitOntology.NAMESPACE + "DerivedUnit";
	public static final String PROP_BASE_UNIT = UnitOntology.NAMESPACE
			+ "baseUnit";
	public static final String PROP_BASE_PREFIX = UnitOntology.NAMESPACE
			+ "basePrefix";

	public DerivedUnit() {
		super();
	}

	public DerivedUnit(String uri) {
		super(uri);
	}

	public DerivedUnit(Unit baseUnit) {
		super();
		setBaseUnit(baseUnit);
	}

	public DerivedUnit(String uriPostfix, Unit baseUnit) {
		super(UnitOntology.NAMESPACE + uriPostfix);
		setBaseUnit(baseUnit);
	}

	public DerivedUnit(String uriPostfix, Unit baseUnit, Prefix basePrefix) {
		super(UnitOntology.NAMESPACE + uriPostfix);
		setBaseUnit(baseUnit);
		setBasePrefix(basePrefix);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return super.getPropSerializationType(arg0);
	}

	public boolean isWellFormed() {
		return true && hasProperty(PROP_BASE_UNIT);
	}

	public Unit getBaseUnit() {
		return (Unit) getProperty(PROP_BASE_UNIT);
	}

	private void setBaseUnit(Unit newPropValue) {
		if (newPropValue != null)
			props.put(PROP_BASE_UNIT, newPropValue);
	}

	public Prefix getBasePrefix() {
		return (Prefix) getProperty(PROP_BASE_PREFIX);
	}

	private void setBasePrefix(Prefix newPropValue) {
		if (newPropValue != null)
			props.put(PROP_BASE_PREFIX, newPropValue);
	}
}
