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

public class LocationValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "LocationValue";
public static final String PROPERTY_HAS_X_COORDINATOR = EchonetOntology.NAMESPACE + "hasXCoordinator";
public static final String PROPERTY_HAS_Y_COORDINATOR = EchonetOntology.NAMESPACE + "hasYCoordinator";
public static final String PROPERTY_HAS_Z_COORDINATOR = EchonetOntology.NAMESPACE + "hasZCoordinator";
	
	public LocationValue() {
		super();
	}
	public LocationValue(String uri) {
		super(uri);
	}
	public LocationValue(String uri, MeasuredValue x, MeasuredValue y, MeasuredValue z) {
		super(uri);
		setX(x);
		setY(y);
		setZ(z);
	}
	public MeasuredValue getX() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_X_COORDINATOR);
	}
	public void setX(MeasuredValue msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_X_COORDINATOR, msg);	
	}
	public MeasuredValue getY() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_Y_COORDINATOR);
	}
	public void setY(MeasuredValue msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_Y_COORDINATOR, msg);	
	}
	public MeasuredValue getZ() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_Z_COORDINATOR);
	}
	public void setZ(MeasuredValue msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_Z_COORDINATOR, msg);	
	}
	
	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public String getClassURI() {
		return MY_URI;
	}

}
