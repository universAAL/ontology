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

public class AbsoluteTimeStamp extends ManagedIndividual {
    public static final String MY_URI = X73Ontology.NAMESPACE
	    + "AbsoluteTimeStamp";
    public static final String PROP_YEAR = X73Ontology.NAMESPACE + "year";
    public static final String PROP_CENTURY = X73Ontology.NAMESPACE + "century";
    public static final String PROP_MONTH = X73Ontology.NAMESPACE + "month";
    public static final String PROP_DAY = X73Ontology.NAMESPACE + "day";
    public static final String PROP_HOUR = X73Ontology.NAMESPACE + "hour";
    public static final String PROP_MINUTE = X73Ontology.NAMESPACE + "minute";
    public static final String PROP_SECOND = X73Ontology.NAMESPACE + "second";
    public static final String PROP_SECFRACTIONS = X73Ontology.NAMESPACE
	    + "secfractions";

    public AbsoluteTimeStamp() {
	super();
    }

    public AbsoluteTimeStamp(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_YEAR) && hasProperty(PROP_CENTURY);
    }

    public int getCentury() {
	Integer i = (Integer) getProperty(PROP_CENTURY);
	return (i == null) ? 0 : i.intValue();
    }

    public void setCentury(int newPropValue) {
	changeProperty(PROP_CENTURY, new Integer(newPropValue));
    }

    public int getYear() {
	Integer i = (Integer) getProperty(PROP_YEAR);
	return (i == null) ? 0 : i.intValue();
    }

    public void setYear(int newPropValue) {
	changeProperty(PROP_YEAR, new Integer(newPropValue));
    }

    public int getMonth() {
	Integer i = (Integer) getProperty(PROP_MONTH);
	return (i == null) ? 0 : i.intValue();
    }

    public void setMonth(int newPropValue) {
	changeProperty(PROP_MONTH, new Integer(newPropValue));
    }

    public int getDay() {
	Integer i = (Integer) getProperty(PROP_DAY);
	return (i == null) ? 0 : i.intValue();
    }

    public void setDay(int newPropValue) {
	changeProperty(PROP_DAY, new Integer(newPropValue));
    }

    public int getHour() {
	Integer i = (Integer) getProperty(PROP_HOUR);
	return (i == null) ? 0 : i.intValue();
    }

    public void setHour(int newPropValue) {
	changeProperty(PROP_HOUR, new Integer(newPropValue));
    }

    public int getMinute() {
	Integer i = (Integer) getProperty(PROP_MINUTE);
	return (i == null) ? 0 : i.intValue();
    }

    public void setMinute(int newPropValue) {
	changeProperty(PROP_MINUTE, new Integer(newPropValue));
    }

    public int getSecond() {
	Integer i = (Integer) getProperty(PROP_SECOND);
	return (i == null) ? 0 : i.intValue();
    }

    public void setSecond(int newPropValue) {
	changeProperty(PROP_SECOND, new Integer(newPropValue));
    }

    public int getSecfractions() {
	Integer i = (Integer) getProperty(PROP_SECFRACTIONS);
	return (i == null) ? 0 : i.intValue();
    }

    public void setSecfractions(int newPropValue) {
	changeProperty(PROP_SECFRACTIONS, new Integer(newPropValue));
    }
}
