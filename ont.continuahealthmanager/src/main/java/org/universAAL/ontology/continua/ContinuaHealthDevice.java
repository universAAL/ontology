/*
    Copyright 2007-2014 TSB, http://www.tsbtecnologias.es
    Technologies for Health and Well-being - Valencia, Spain

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
/**
 * Continua Health device ontology.
 * 
 * @author Angel Martinez-Cavero TSB Technologies for Health and Well-being
 * 
 */

// Package
package org.universAAL.ontology.continua;

// Imports
import org.universAAL.middleware.owl.ManagedIndividual;

// Main class
public class ContinuaHealthDevice extends ManagedIndividual {

	// Attributes

	public static final String MY_URI = ContinuaHealthManagerOntology.NAMESPACE + "Fact";
	public static final String PROP_HAS_MAC = ContinuaHealthManagerOntology.NAMESPACE + "hasMAC";
	public static final String PROP_HAS_DATA_TYPE = ContinuaHealthManagerOntology.NAMESPACE + "hasDataType";

	// Constructor
	public ContinuaHealthDevice() {
	}

	public ContinuaHealthDevice(String uri) {
		super(uri);
	}

	public ContinuaHealthDevice(String uri, String mac, String dataType) {
		super(uri);
		setMAC(mac);
		setDataType(dataType);
	}

	// Methods
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true;
	}

	public String getMAC() {
		return (String) props.get(PROP_HAS_MAC);
	}

	public void setMAC(String str) {
		props.put(PROP_HAS_MAC, str);
	}

	public String getDataType() {
		return (String) props.get(PROP_HAS_DATA_TYPE);
	}

	public void setDataType(String str) {
		props.put(PROP_HAS_DATA_TYPE, str);
	}

	public String getClassURI() {
		return MY_URI;
	}
}