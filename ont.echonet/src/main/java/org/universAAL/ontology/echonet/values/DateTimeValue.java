/*******************************************************************************
 * Copyright 2018 PHAM Van Cu, Tan laboratory, Japan Advanced Institute of Science and Technology (JAIST),
 *  Japan as a part of the CARESSES project (http://www.caressesrobot.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class DateTimeValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "DateTimeValue";
	public static final String PROPERTY_HAS_YEAR = EchonetOntology.NAMESPACE + "hasYear";
	public static final String PROPERTY_HAS_CENTURY = EchonetOntology.NAMESPACE + "hasCentury";
	public static final String PROPERTY_HAS_MONTH = EchonetOntology.NAMESPACE + "hasMonth";
	public static final String PROPERTY_HAS_DAY = EchonetOntology.NAMESPACE + "hasDay";
	public static final String PROPERTY_HAS_HOUR = EchonetOntology.NAMESPACE + "hasHour";
	public static final String PROPERTY_HAS_MINUTE = EchonetOntology.NAMESPACE + "hasMinute";
	public static final String PROPERTY_HAS_SECOND = EchonetOntology.NAMESPACE + "hasSecond";
	public static final String PROPERTY_HAS_SECFRACTIONS = EchonetOntology.NAMESPACE + "hasSecfractions";

	
	public DateTimeValue() {
		super();
	}

	public DateTimeValue(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true && hasProperty(PROPERTY_HAS_YEAR) && hasProperty(PROPERTY_HAS_CENTURY);
	}

	public int getCentury() {
		Integer i = (Integer) getProperty(PROPERTY_HAS_CENTURY);
		return (i == null) ? 0 : i.intValue();
	}

	public void setCentury(int newPropValue) {
		changeProperty(PROPERTY_HAS_CENTURY, new Integer(newPropValue));
	}

	public int getYear() {
		Integer i = (Integer) getProperty(PROPERTY_HAS_YEAR);
		return (i == null) ? 0 : i.intValue();
	}

	public void setYear(int newPropValue) {
		changeProperty(PROPERTY_HAS_YEAR, new Integer(newPropValue));
	}

	public int getMonth() {
		Integer i = (Integer) getProperty(PROPERTY_HAS_MONTH);
		return (i == null) ? 0 : i.intValue();
	}

	public void setMonth(int newPropValue) {
		changeProperty(PROPERTY_HAS_MONTH, new Integer(newPropValue));
	}

	public int getDay() {
		Integer i = (Integer) getProperty(PROPERTY_HAS_DAY);
		return (i == null) ? 0 : i.intValue();
	}

	public void setDay(int newPropValue) {
		changeProperty(PROPERTY_HAS_DAY, new Integer(newPropValue));
	}

	public int getHour() {
		Integer i = (Integer) getProperty(PROPERTY_HAS_HOUR);
		return (i == null) ? 0 : i.intValue();
	}

	public void setHour(int newPropValue) {
		changeProperty(PROPERTY_HAS_HOUR, new Integer(newPropValue));
	}

	public int getMinute() {
		Integer i = (Integer) getProperty(PROPERTY_HAS_MINUTE);
		return (i == null) ? 0 : i.intValue();
	}

	public void setMinute(int newPropValue) {
		changeProperty(PROPERTY_HAS_MINUTE, new Integer(newPropValue));
	}

	public int getSecond() {
		Integer i = (Integer) getProperty(PROPERTY_HAS_SECOND);
		return (i == null) ? 0 : i.intValue();
	}

	public void setSecond(int newPropValue) {
		changeProperty(PROPERTY_HAS_SECOND, new Integer(newPropValue));
	}

	public int getSecfractions() {
		Integer i = (Integer) getProperty(PROPERTY_HAS_SECFRACTIONS);
		return (i == null) ? 0 : i.intValue();
	}

	public void setSecfractions(int newPropValue) {
		changeProperty(PROPERTY_HAS_SECFRACTIONS, new Integer(newPropValue));
	}

}
