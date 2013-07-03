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

import org.universAAL.ontology.phThing.Device;

public abstract class MDS extends Device {
    public static final String MY_URI = X73Ontology.NAMESPACE + "MDS";
    public static final String PROP_SYSTEM_ID = X73Ontology.NAMESPACE
	    + "systemId";
    public static final String PROP_SYSTEM_TYPE_SPEC_LIST = X73Ontology.NAMESPACE
	    + "systemTypeSpecList";
    public static final String PROP_SYSTEM_MODEL = X73Ontology.NAMESPACE
	    + "systemModel";

    public MDS() {
	super();
    }

    public MDS(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_SYSTEM_ID)
		&& hasProperty(PROP_SYSTEM_TYPE_SPEC_LIST)
		&& hasProperty(PROP_SYSTEM_MODEL);
    }

    public String getSystemId() {
	return (String) getProperty(PROP_SYSTEM_ID);
    }

    public void setSystemId(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SYSTEM_ID, newPropValue);
    }

    public String getSystemTypeSpecList() {
	return (String) getProperty(PROP_SYSTEM_TYPE_SPEC_LIST);
    }

    public void setSystemTypeSpecList(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SYSTEM_TYPE_SPEC_LIST, newPropValue);
    }

    public SystemModel getSystemModel() {
	return (SystemModel) getProperty(PROP_SYSTEM_MODEL);
    }

    public void setSystemModel(SystemModel newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SYSTEM_MODEL, newPropValue);
    }
}
