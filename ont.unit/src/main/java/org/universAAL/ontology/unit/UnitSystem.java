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

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

public class UnitSystem extends ManagedIndividual {
    public static final String MY_URI = UnitOntology.NAMESPACE + "UnitSystem";
    public static final String PROP_UNITS = UnitOntology.NAMESPACE + "units";
    public static final String PROP_NAME = UnitOntology.NAMESPACE + "name";
    public static final String PROP_PREFIXES = UnitOntology.NAMESPACE
	    + "prefixes";

    public UnitSystem() {
	super();
    }

    public UnitSystem(String uri) {
	super(uri);
    }

    public UnitSystem(String uri, String name) {
	super(uri);
	setName(name);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_UNITS) && hasProperty(PROP_NAME)
		&& hasProperty(PROP_PREFIXES);
    }

    public String getName() {
	return (String) getProperty(PROP_NAME);
    }

    private void setName(String newPropValue) {
	if (newPropValue != null)
	    props.put(PROP_NAME, newPropValue);
    }

    public Unit[] getUnits() {
	Object propList = getProperty(PROP_UNITS);
	if (propList instanceof List)
	    return (Unit[]) ((List) propList).toArray(new Unit[0]);
	else if (propList != null)
	    // Handle special case of a single item not contained in a list
	    return new Unit[] { (Unit) propList };
	return new Unit[0];
    }

    protected void addUnits(Unit newValue) {
	Object propList = getProperty(PROP_UNITS);
	List newList;
	if (propList instanceof List)
	    newList = (List) propList;
	else {
	    newList = new ArrayList();
	    if (propList != null)
		// Handle special case of a single item not contained in a list
		newList.add(propList);
	}
	newList.add(newValue);
	props.put(PROP_UNITS, newList);
    }

    protected void setUnits(Unit[] propertyValue) {
	List propList = new ArrayList(propertyValue.length);
	for (int i = 0; i < propertyValue.length; i++) {
	    propList.add(propertyValue[i]);
	}
	props.put(PROP_UNITS, propList);
    }

    public Prefix[] getPrefixes() {
	Object propList = getProperty(PROP_PREFIXES);
	if (propList instanceof List)
	    return (Prefix[]) ((List) propList).toArray(new Prefix[0]);
	else if (propList != null)
	    // Handle special case of a single item not contained in a list
	    return new Prefix[] { (Prefix) propList };
	return new Prefix[0];
    }

    protected void addPrefixes(Prefix newValue) {
	Object propList = getProperty(PROP_PREFIXES);
	List newList;
	if (propList instanceof List)
	    newList = (List) propList;
	else {
	    newList = new ArrayList();
	    if (propList != null)
		// Handle special case of a single item not contained in a list
		newList.add(propList);
	}
	newList.add(newValue);
	props.put(PROP_PREFIXES, newList);
    }

    protected void setPrefixes(Prefix[] propertyValue) {
	List propList = new ArrayList(propertyValue.length);
	for (int i = 0; i < propertyValue.length; i++) {
	    propList.add(propertyValue[i]);
	}
	props.put(PROP_PREFIXES, propList);
    }

    protected void setPrefixes(ArrayList propList) {
	// propList must contain only instances of Prefix
	props.put(PROP_PREFIXES, propList);
    }
}
