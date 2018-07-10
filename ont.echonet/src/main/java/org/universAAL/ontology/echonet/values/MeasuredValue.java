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

public class MeasuredValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "MeasurementValue";
public static final String PROPERTY_HAS_MESUREMENT_CATEGORY = EchonetOntology.NAMESPACE + "hasMeasurementCategory";
public static final String PROPERTY_HAS_MESUREMENT_VALUE = EchonetOntology.NAMESPACE + "hasMeasurementValue";
public static final String PROPERTY_HAS_MESUREMENT_UNIT = EchonetOntology.NAMESPACE + "hasMeasurementUnit";
public static final String PROPERTY_HAS_MESUREMENT_DATE = EchonetOntology.NAMESPACE + "hasMeasurementDate";


	
	public MeasuredValue(String uri) {
		super(uri);
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public String getClassURI() {
		return MY_URI;
	}
	public ValueCategory getMeasurementType() {
		return (ValueCategory) getProperty(PROPERTY_HAS_MESUREMENT_CATEGORY);
	}
	public void setMeasurementType(ValueCategory msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_MESUREMENT_CATEGORY, msg);
		}
	}
	public DateTimeValue getMeasurementDate() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_MESUREMENT_DATE);
	}
	public void setMeasurementDate(DateTimeValue msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_MESUREMENT_DATE, msg);
		}
	}
	public String getMeasuredUnit() {
		return (String) getProperty(PROPERTY_HAS_MESUREMENT_UNIT);
	}
	public void setMeasuredUnit(String unit) {
		if(unit !=null) 
			changeProperty(PROPERTY_HAS_MESUREMENT_UNIT, unit);	
		}

}
 
