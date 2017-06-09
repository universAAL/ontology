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

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.ActivityHubOntology;

/**
 * Intermediate concept. Base class for all SensorEvent classes.
 * 
 * @author Thomas Fuxreiter (foex@gmx.at)
 */
public abstract class ActivityHubSensorEvent extends ManagedIndividual {

	public static final String MY_URI = ActivityHubOntology.NAMESPACE + "ActivityHubSensorEvent";

	public ActivityHubSensorEvent() {
		super();
	}

	public ActivityHubSensorEvent(String uri) {
		super(uri);
	}

	/* MUST be defined! otherwise the URI of the parent class is returned */
	public String getClassURI() {
		return MY_URI;
	}

	/* following 2 methods SHOULD be overwritten */

	/*
	 * defines which part of this concept is serialized e.g. only parts of this
	 * concept should be passed
	 */
	public int getPropSerializationType(String propURI) {
		/*
		 * set OPTIONAL if the properties can be ignored or the class has no
		 * property set FULL if there are properties here set to FULL for all
		 * deriving classes
		 */
		return PROP_SERIALIZATION_FULL;
	}

	/* for testing return true */
	/* variables could be checked here */
	public boolean isWellFormed() {
		return true;
	}

	// public abstract ActivityHubSensorEvent getEventByOrder(int order);

}
