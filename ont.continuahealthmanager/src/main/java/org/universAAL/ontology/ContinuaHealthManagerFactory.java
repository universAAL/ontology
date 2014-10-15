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
 * Continua HDP manager factory.
 * 
 * @author Angel Martinez-Cavero TSB Technologies for Health and Well-being
 * 
 */

// Package
package org.universAAL.ontology;

// Imports
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.continua.ContinuaHealthDevice;
import org.universAAL.ontology.continua.ContinuaHealthManager;

// Main class
public class ContinuaHealthManagerFactory implements ResourceFactory {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	switch (factoryIndex) {
	case 0:
	    return new ContinuaHealthDevice(instanceURI);
	case 1:
	    return new ContinuaHealthManager(instanceURI);
	}
	return null;
    }
}