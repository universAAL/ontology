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

package org.universAAL.ontology.activityhub.ext;

import org.universAAL.ontology.ActivityHubOntology;
import org.universAAL.ontology.device.Actuator;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of an adaptor plug actuator. This device is
 * currently not covered by the ISO 11073 standard in part 10471 (Independent
 * living activity hub). This class is an independent extension to the standard.
 * 
 * Specific actuator actions: - power on - power off
 * 
 * @author Thomas Fuxreiter
 * 
 */
public class AdaptorPlugActuator extends Actuator {

	public static final String MY_URI = ActivityHubOntology.NAMESPACE + "AdaptorPlugActuator";
	public static final String PROP_STATUS = ActivityHubOntology.NAMESPACE + "Status";

	public AdaptorPlugActuator() {
	}

	public AdaptorPlugActuator(String uri) {
		super(uri);
	}

	/**
	 * From Resource class: The properties denote the RDF triples of this
	 * resource, realized as Hashtable. The RDF subject is this Resource itself,
	 * the key of the Hashtable is the RDF predicate and the value of the
	 * Hashtable is the RDF object, which can be a literal or another resource.
	 * See {@link #setProperty(String propURI, Object value)} for more
	 * information.
	 */
	public void setStatus(AdaptorPlugActuatorEvent event) {
		props.put(PROP_STATUS, event);
	}

	public AdaptorPlugActuatorEvent getStatus() {
		return ((AdaptorPlugActuatorEvent) props.get(PROP_STATUS));
	}

	/**
	 * @see org.universAAL.ontology.phThing.Sensor#getClassURI()
	 * @return Ontology namespace for this class
	 */
	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		/* no actuator properties?? */
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true;
	}
}
