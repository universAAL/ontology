/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
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
package org.universAAL.ontology.space;

import org.universAAL.middleware.service.owl.Service;

/**
 * Ontological service that handles the arrangement of locations and physical
 * things in a specific space. Methods included in this class are the mandatory
 * ones for representing an ontological service in Java classes for uAAL.
 * 
 */
public class SpaceConfigurationService extends Service {
    public static final String MY_URI = SpaceOntology.NAMESPACE
    		+ "locationConfigurationService";
    public static final String PROP_MANAGED_LOCATIONS = SpaceOntology.NAMESPACE
    		+ "managedLocations";
    public static final String PROP_MANAGED_PHYSICAL_THINGS = SpaceOntology.NAMESPACE
    		+ "managedPhysicalThings";

    public SpaceConfigurationService() {
	super();
    }

    public SpaceConfigurationService(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
     * (java.lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return (PROP_MANAGED_LOCATIONS.equals(propURI) || PROP_MANAGED_PHYSICAL_THINGS.equals(propURI))
		? PROP_SERIALIZATION_FULL : super.getPropSerializationType(propURI);
    }

    public boolean isWellFormed() {
	return true;
    }
}
