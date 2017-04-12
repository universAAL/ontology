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
 * Continua Health manager ontology.
 * 
 * @author Angel Martinez-Cavero TSB Technologies for Health and Well-being
 * 
 */

// Package
package org.universAAL.ontology.continua;

import org.universAAL.middleware.rdf.Resource;
// Imports
import org.universAAL.middleware.service.owl.Service;

// Main class
public class ContinuaHealthManager extends Service {

    // Attributes
    public static final String MY_URI = ContinuaHealthManagerOntology.NAMESPACE
	    + "ContinuaHealthManagerService";
    public static final String PROP_HAS_CONTINUA_DEVICE = ContinuaHealthManagerOntology.NAMESPACE
	    + "hasContinuaDevice";
    public static final String PROP_HAS_NOT_CONTINUA_DEVICE = ContinuaHealthManagerOntology.NAMESPACE
	    + "hasNotContinuaDevice";

    // Constructor
    public ContinuaHealthManager(String instanceURI) {
	super(instanceURI);
    }

    public ContinuaHealthManager() {
	super();
    }

    // Methods
    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	if (PROP_HAS_CONTINUA_DEVICE.equals(propURI) || PROP_HAS_NOT_CONTINUA_DEVICE.equals(propURI))
	    return Resource.PROP_SERIALIZATION_FULL;
	return super.getPropSerializationType(propURI);
    }
}