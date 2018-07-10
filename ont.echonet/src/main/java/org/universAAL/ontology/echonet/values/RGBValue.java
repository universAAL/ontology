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

public class RGBValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "RGBValue";
public static final String PROPERTY_HAS_R_VALUE= EchonetOntology.NAMESPACE + "hasRValue";
public static final String PROPERTY_HAS_G_VALUE= EchonetOntology.NAMESPACE + "hasGValue";
public static final String PROPERTY_HAS_B_VALUE = EchonetOntology.NAMESPACE + "hasBValue";
	
	public RGBValue() {
		super();
	}
	public RGBValue(String uri) {
		super(uri);
	}
	public RGBValue(String uri, MeasuredValue r, MeasuredValue g, MeasuredValue b) {
		super(uri);
		setR(r);
		setG(g);
		setB(b);
	}
	public MeasuredValue getB() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_B_VALUE);
	}
	public void setB(MeasuredValue msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_B_VALUE, msg);	
	}
	public MeasuredValue getG() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_G_VALUE);
	}
	public void setG(MeasuredValue msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_G_VALUE, msg);	
	}
	public MeasuredValue getR() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_R_VALUE);
	}
	public void setR(MeasuredValue msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_R_VALUE, msg);	
	}
	
	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}
	public String getClassURI() {
		return MY_URI;
	}

}
