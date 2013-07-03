/*
     Copyright 2010-2014 AIT Austrian Institute of Technology GmbH
	 http://www.ait.ac.at
     
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

package org.universAAL.ontology.X73;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;

public class SystemModel extends ManagedIndividual {
    public static final String MY_URI = X73Ontology.NAMESPACE + "SystemModel";
    public static final String PROP_MANUFACTURER = X73Ontology.NAMESPACE
	    + "manufacturer";
    public static final String PROP_MODEL_NUMBER = X73Ontology.NAMESPACE
	    + "modelNumber";

    public SystemModel() {
	super();
    }

    public SystemModel(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_MANUFACTURER)
		&& hasProperty(PROP_MODEL_NUMBER);
    }

    public String getManufacturer() {
	return (String) getProperty(PROP_MANUFACTURER);
    }

    public void setManufacturer(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_MANUFACTURER, newPropValue);
    }

    public String getModelNumber() {
	return (String) getProperty(PROP_MODEL_NUMBER);
    }

    public void setModelNumber(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_MODEL_NUMBER, newPropValue);
    }
}
