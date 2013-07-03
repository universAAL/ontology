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

public class compoundBasicNuValue extends ManagedIndividual {
    public static final String MY_URI = X73Ontology.NAMESPACE
	    + "compoundBasicNuValue";
    public static final String PROP_MEASURED_VALUE_18951 = X73Ontology.NAMESPACE
	    + "measuredValue_18951";
    public static final String PROP_MEASURED_VALUE_18950 = X73Ontology.NAMESPACE
	    + "measuredValue_18950";
    public static final String PROP_MEASURED_VALUE_18949 = X73Ontology.NAMESPACE
	    + "measuredValue_18949";

    public compoundBasicNuValue() {
	super();
    }

    public compoundBasicNuValue(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_MEASURED_VALUE_18951)
		&& hasProperty(PROP_MEASURED_VALUE_18950)
		&& hasProperty(PROP_MEASURED_VALUE_18949);
    }

    public String getMeasuredValue_18949() {
	return (String) getProperty(PROP_MEASURED_VALUE_18949);
    }

    public void setMeasuredValue_18949(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_MEASURED_VALUE_18949, newPropValue);
    }

    public String getMeasuredValue_18950() {
	return (String) getProperty(PROP_MEASURED_VALUE_18950);
    }

    public void setMeasuredValue_18950(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_MEASURED_VALUE_18950, newPropValue);
    }

    public String getMeasuredValue_18951() {
	return (String) getProperty(PROP_MEASURED_VALUE_18951);
    }

    public void setMeasuredValue_18951(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_MEASURED_VALUE_18951, newPropValue);
    }
}
