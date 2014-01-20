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

package org.universAAL.ontology.activityhub;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.ActivityHubOntology;

/**
 * Ontological SERVICE that handles activity hub devices. Methods included in
 * this class are the mandatory ones for representing an ontological service in
 * Java classes for uAAL.
 * 
 * Built according to the uAAL lighting service example.
 * 
 * @author Thomas Fuxreiter
 */
public class ActivityHub extends Service {

    public static final String MY_URI = ActivityHubOntology.NAMESPACE
	    + "ActivityHub";

    public static final String PROP_CONTROLS = ActivityHubOntology.NAMESPACE
	    + "controls";

    public ActivityHub() {
	super();
    }

    public ActivityHub(String uri) {
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
	return PROP_CONTROLS.equals(propURI) ? PROP_SERIALIZATION_FULL : super
		.getPropSerializationType(propURI);
    }

    public boolean isWellFormed() {
	return true;
    }
}
