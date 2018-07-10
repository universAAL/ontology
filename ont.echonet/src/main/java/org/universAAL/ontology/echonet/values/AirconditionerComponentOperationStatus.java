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

public class AirconditionerComponentOperationStatus extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "AirconditionerComponentOperationStatus";
	public static final String PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS = EchonetOntology.NAMESPACE + "hasCompressorOperationStatus";
	public static final String PROPERTY_HAS_THERMOSTAT_OPERATION_STATUS = EchonetOntology.NAMESPACE + "hasThermostatOperationStatus";

	public AirconditionerComponentOperationStatus() {
		super();
	}
	public AirconditionerComponentOperationStatus(String uri) {
		super(uri);
	}
	public AirconditionerComponentOperationStatus(String uri, OperationStatusValue compressorOperationStatus,
															  OperationStatusValue thermostatOperationStatus ) {
		super(uri);
		setCompressorOperationStatus(compressorOperationStatus);
		setThermostatOperationStatus(thermostatOperationStatus);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public OperationStatusValue getCompressorOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS);
	}
	public void setCompressorOperationStatus(OperationStatusValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS,msg);
	}
	public OperationStatusValue getThermostatOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_THERMOSTAT_OPERATION_STATUS);
	}
	public void setThermostatOperationStatus(OperationStatusValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_THERMOSTAT_OPERATION_STATUS,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
