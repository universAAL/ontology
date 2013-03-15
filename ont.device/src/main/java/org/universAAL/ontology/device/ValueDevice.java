/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package org.universAAL.ontology.device;

//import java.util.ArrayList;
//import java.util.List;

import org.universAAL.ontology.phThing.Device;

//import org.universAAL.middleware.owl.Resource;

public abstract class ValueDevice extends Device {
    public static final String MY_URI = DeviceOntology.NAMESPACE
	    + "ValueDevice";
    public static final String PROP_HAS_VALUE = DeviceOntology.NAMESPACE
	    + "hasValue";
    public static final String PROP_VALUE_TYPE = DeviceOntology.NAMESPACE
	    + "valueType";

    public ValueDevice() {
	super();
    }

    public ValueDevice(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_HAS_VALUE)
		&& hasProperty(PROP_VALUE_TYPE);
    }

    public ValueType getValueType() {
	Object propList = getProperty(PROP_VALUE_TYPE);
	// if (propList instanceof List)
	// return (ValueType[]) ((List) propList).toArray(new ValueType[0]);
	if (propList != null)
	    return (ValueType) propList; // Handle special case of a single item
					 // not contained in a list
	    // return new ValueType[0];
	return null;
    }

    // public void addValueType(ValueType newValue) {
    // Object propList = getProperty(PROP_VALUE_TYPE);
    // List newList;
    // if (propList instanceof List)
    // newList = (List)propList;
    // else {
    // newList = new ArrayList();
    // if (propList != null)
    // newList.add(propList); // Handle special case of a single previous item
    // not contained in a list
    // }
    // newList.add(newValue);
    // changeProperty(PROP_VALUE_TYPE, newList);
    // }

    public void setValueType(ValueType propertyValue) {
	// List propList = new ArrayList(propertyValue.length);
	// for (int i = 0; i < propertyValue.length; i++) {
	// propList.add(propertyValue[i]);
	// }
	// changeProperty(PROP_VALUE_TYPE, propList);
	changeProperty(PROP_VALUE_TYPE, propertyValue);
    }

    // public ValueType[] getValueType() {
    // Object propList = getProperty(PROP_VALUE_TYPE);
    // if (propList instanceof List)
    // return (ValueType[]) ((List) propList).toArray(new ValueType[0]);
    // else if (propList != null)
    // return new ValueType[] {(ValueType)propList}; // Handle special case of a
    // single item not contained in a list
    // return new ValueType[0];
    // }

    // public void addValueType(ValueType newValue) {
    // Object propList = getProperty(PROP_VALUE_TYPE);
    // List newList;
    // if (propList instanceof List)
    // newList = (List)propList;
    // else {
    // newList = new ArrayList();
    // if (propList != null)
    // newList.add(propList); // Handle special case of a single previous item
    // not contained in a list
    // }
    // newList.add(newValue);
    // changeProperty(PROP_VALUE_TYPE, newList);
    // }

    // public void setValueType(ValueType[] propertyValue) {
    // List propList = new ArrayList(propertyValue.length);
    // for (int i = 0; i < propertyValue.length; i++) {
    // propList.add(propertyValue[i]);
    // }
    // changeProperty(PROP_VALUE_TYPE, propList);
    // }

    // public Resource getHasValue() {
    // return (Resource)getProperty(PROP_HAS_VALUE);
    // }
    //
    // public void setHasValue(Resource newPropValue) {
    // if (newPropValue != null)
    // changeProperty(PROP_HAS_VALUE, newPropValue);
    // }
}
