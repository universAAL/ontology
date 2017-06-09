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

package org.universAAL.ontology.activityhub.factory;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.activityhub.*;
import org.universAAL.ontology.activityhub.ext.AdaptorPlugActuator;
import org.universAAL.ontology.activityhub.util.ActivityHubSensorType;

/**
 * Factory for the ActivityHub ontology according to ISO 11073 - Part 10471
 * (Independent living activity hub), edition 2010-05-01
 * 
 * @author Thomas Fuxreiter
 */
public class ActivityHubFactory implements ResourceFactory {

	/**
	 * @param classURI
	 *            could be null
	 */
	public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

		switch (factoryIndex) {
		case ActivityHubSensorType.ActivityHub:
			return new ActivityHub(instanceURI);

		// changed to abstract class
		// case ActivityHubSensorType.ActivityHubSensor:
		// return new ActivityHubSensor(instanceURI);
		case ActivityHubSensorType.FallSensor:
			return new FallSensor(instanceURI);
		case ActivityHubSensorType.PersSensor:
			return new PersSensor(instanceURI);
		case ActivityHubSensorType.SmokeSensor:
			return new SmokeSensor(instanceURI);
		case ActivityHubSensorType.CoSensor:
			return new CoSensor(instanceURI);
		case ActivityHubSensorType.WaterSensor:
			return new WaterSensor(instanceURI);
		case ActivityHubSensorType.GasSensor:
			return new GasSensor(instanceURI);
		case ActivityHubSensorType.MotionSensor:
			return new MotionSensor(instanceURI);
		case ActivityHubSensorType.PropertyExitSensor:
			return new PropertyExitSensor(instanceURI);
		case ActivityHubSensorType.EnuresisSensor:
			return new EnuresisSensor(instanceURI);
		case ActivityHubSensorType.ContactClosureSensor:
			return new ContactClosureSensor(instanceURI);
		case ActivityHubSensorType.UsageSensor:
			return new UsageSensor(instanceURI);
		case ActivityHubSensorType.SwitchSensor:
			return new SwitchSensor(instanceURI);
		case ActivityHubSensorType.MedicationDosageSensor:
			return new MedicationDosageSensor(instanceURI);
		case ActivityHubSensorType.TemperatureSensor:
			return new TemperatureSensor(instanceURI);
		case ActivityHubSensorType.AdaptorPlugActuator:
			return new AdaptorPlugActuator(instanceURI);
		}

		return null;
	}
}
