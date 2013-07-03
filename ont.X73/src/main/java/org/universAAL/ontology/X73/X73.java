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

import org.universAAL.middleware.service.owl.Service;

public class X73 extends Service {
    public static final String MY_URI = X73Ontology.NAMESPACE + "x73";
    public static final String PROP_CONTROLS = X73Ontology.NAMESPACE
	    + "controls";

    public X73() {
	super();
    }

    public X73(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_CONTROLS.equals(propURI) ? PROP_SERIALIZATION_FULL : super
		.getPropSerializationType(propURI);
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_CONTROLS);
    }

    public MDS getControls() {
	return (MDS) getProperty(PROP_CONTROLS);
    }

    public void setControls(MDS newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_CONTROLS, newPropValue);
    }
}
