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

public class DividedUnit extends DerivedUnit {
    public static final String MY_URI = UnitOntology.NAMESPACE + "DividedUnit";
    public static final String PROP_DIVIDED_BY = UnitOntology.NAMESPACE
	    + "dividedBy";
    public static final String PROP_DIVIDED_BY_PREFIX = UnitOntology.NAMESPACE
	    + "dividedByPrefix";

    public DividedUnit() {
	super();
    }

    public DividedUnit(String uri) {
	super(uri);
    }

    public DividedUnit(String uri, Unit base, Unit dividend) {
	super(uri, base);
	setDividedBy(dividend);
    }

    public DividedUnit(String uri, String symbol, Unit base, Unit dividend) {
	super(uri, base);
	setDividedBy(dividend);
	setSymbol(symbol);
    }

    public DividedUnit(String uri, Unit base, Prefix basePrefix, Unit dividend) {
	super(uri, base, basePrefix);
	setDividedBy(dividend);
    }

    // public DividedUnit(String uri, Unit base, Prefix basePrefix, Unit
    // dividend,
    // Prefix dividendPrefix) {
    // super(uri, base, basePrefix);
    // setDividedBy(dividend);
    // setDividedByPrefix(basePrefix);
    // }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return super.getPropSerializationType(arg0);
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_DIVIDED_BY);
    }

    public Unit getDividedBy() {
	return (Unit) getProperty(PROP_DIVIDED_BY);
    }

    private void setDividedBy(Unit newPropValue) {
	if (newPropValue != null)
	    props.put(PROP_DIVIDED_BY, newPropValue);
    }

    public Prefix getDividedByPrefix() {
	return (Prefix) getProperty(PROP_DIVIDED_BY_PREFIX);
    }

    public void setDividedByPrefix(Prefix newPropValue) {
	if (newPropValue != null)
	    props.put(PROP_DIVIDED_BY_PREFIX, newPropValue);
    }

    public String getSymbol() {
	if (!hasProperty(PROP_SYMBOL)) {
	    String base, div;
	    if (hasProperty(PROP_BASE_PREFIX)) {
		base = getBasePrefix().getSymbol() + getBaseUnit().getSymbol();
	    } else {
		base = getBaseUnit().getSymbol();
	    }
	    if (hasProperty(PROP_DIVIDED_BY_PREFIX)) {
		div = getDividedByPrefix().getSymbol()
			+ getDividedBy().getSymbol();
	    } else {
		div = getDividedBy().getSymbol();
	    }
	    return base + "/" + div;
	} else {
	    return super.getSymbol();
	}
    }
}
