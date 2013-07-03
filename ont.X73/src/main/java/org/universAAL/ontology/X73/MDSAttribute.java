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

public abstract class MDSAttribute extends ManagedIndividual {
    public static final String MY_URI = X73Ontology.NAMESPACE + "MDSAttribute";
    public static final String PROP_BASIC_NU_OBSERVED_VALUE = X73Ontology.NAMESPACE
	    + "basicNuObservedValue";
    public static final String PROP_COMPOUND_BASIC_NU_OBSERVED_VALUE = X73Ontology.NAMESPACE
	    + "compoundBasicNuObservedValue";
    public static final String PROP_UNIT_CODE = X73Ontology.NAMESPACE
	    + "unitCode";
    public static final String PROP_ABSOLUTE_TIME_STAMP = X73Ontology.NAMESPACE
	    + "absoluteTimeStamp";

    public MDSAttribute() {
	super();
    }

    public MDSAttribute(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_BASIC_NU_OBSERVED_VALUE)
		&& hasProperty(PROP_COMPOUND_BASIC_NU_OBSERVED_VALUE)
		&& hasProperty(PROP_UNIT_CODE)
		&& hasProperty(PROP_ABSOLUTE_TIME_STAMP);
    }

    public String getUnitCode() {
	return (String) getProperty(PROP_UNIT_CODE);
    }

    public void setUnitCode(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_UNIT_CODE, newPropValue);
    }

    public compoundBasicNuValue getCompoundBasicNuObservedValue() {
	return (compoundBasicNuValue) getProperty(PROP_COMPOUND_BASIC_NU_OBSERVED_VALUE);
    }

    public void setCompoundBasicNuObservedValue(
	    compoundBasicNuValue newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_COMPOUND_BASIC_NU_OBSERVED_VALUE, newPropValue);
    }

    public String getBasicNuObservedValue() {
	return (String) getProperty(PROP_BASIC_NU_OBSERVED_VALUE);
    }

    public void setBasicNuObservedValue(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_BASIC_NU_OBSERVED_VALUE, newPropValue);
    }

    public AbsoluteTimeStamp getAbsoluteTimeStamp() {
	return (AbsoluteTimeStamp) getProperty(PROP_ABSOLUTE_TIME_STAMP);
    }

    public void setAbsoluteTimeStamp(AbsoluteTimeStamp newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_ABSOLUTE_TIME_STAMP, newPropValue);
    }
}
