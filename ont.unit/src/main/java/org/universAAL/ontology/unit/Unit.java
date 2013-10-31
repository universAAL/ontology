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

import org.universAAL.middleware.owl.ManagedIndividual;

public class Unit extends ManagedIndividual {
    public static final String MY_URI = UnitOntology.NAMESPACE + "Unit";
    public static final String PROP_UNIT_SYSTEM = UnitOntology.NAMESPACE
	    + "unitSystem";
    public static final String PROP_NAME = UnitOntology.NAMESPACE + "name";
    public static final String PROP_SYMBOL = UnitOntology.NAMESPACE + "symbol";
    public static final String PROP_DIMENSION = UnitOntology.NAMESPACE
	    + "dimension";

    public Unit() {
	super();
    }

    public Unit(String uri) {
	super(uri);
    }

    public Unit(String uri, String name, String symbol,
	    MeasurableDimension dimension) {
	super(uri);
	setName(name);
	setSymbol(symbol);
	setDimension(dimension);
    }

    public Unit(String uri, String name, String symbol,
	    MeasurableDimension dimension, UnitSystem us) {
	super(uri);
	setName(name);
	setSymbol(symbol);
	setDimension(dimension);
	setUnitSystem(us);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	if (arg0.equals(PROP_UNIT_SYSTEM)
		|| arg0.equals(PROP_DIMENSION)){
	    return PROP_SERIALIZATION_REDUCED;
	}
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_NAME) && hasProperty(PROP_SYMBOL)
		&& hasProperty(PROP_DIMENSION);
    }

    public String getName() {
	return (String) getProperty(PROP_NAME);
    }

    private void setName(String newPropValue) {
	if (newPropValue != null)
	    props.put(PROP_NAME, newPropValue);
    }

    public String getSymbol() {
	return (String) getProperty(PROP_SYMBOL);
    }

    protected void setSymbol(String newPropValue) {
	if (newPropValue != null)
	    props.put(PROP_SYMBOL, newPropValue);
    }

    public MeasurableDimension getDimension() {
	return (MeasurableDimension) getProperty(PROP_DIMENSION);
    }

    private void setDimension(MeasurableDimension newPropValue) {
	if (newPropValue != null)
	    props.put(PROP_DIMENSION, newPropValue);
    }

    public UnitSystem getUnitSystem() {
	return (UnitSystem) getProperty(PROP_UNIT_SYSTEM);
    }

    private void setUnitSystem(UnitSystem newPropValue) {
	if (newPropValue != null)
	    props.put(PROP_DIMENSION, newPropValue);
    }
}
