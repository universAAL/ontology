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

import org.universAAL.ontology.activityhub.*;
import org.universAAL.ontology.activityhub.ext.AdaptorPlugActuatorEvent;
import org.universAAL.ontology.activityhub.util.ActivityHubSensorType;

/**
 * Factory for the ActivityHub ontology according to ISO 11073 - Part 10471
 * (Independent living activity hub), edition 2010-05-01
 *
 * @author Thomas Fuxreiter
 */
public abstract class ActivityHubEventFactory {

	public static ActivityHubSensorEvent createInstance(
			// String classURI, String instanceURI,
			int factoryIndex, int event) {

		switch (factoryIndex) {
		// changed to abstract class
		// case ActivityHubSensorType.ActivityHubSensor:
		// return new ActivityHubSensor(instanceURI);

		case ActivityHubSensorType.FallSensor:
			return FallSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.PersSensor:
			return PersSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.SmokeSensor:
			return EnvironmentalSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.CoSensor:
			return EnvironmentalSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.WaterSensor:
			return EnvironmentalSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.GasSensor:
			return EnvironmentalSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.MotionSensor:
			return MotionSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.PropertyExitSensor:
			return PropertyExitSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.EnuresisSensor:
			return EnuresisSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.ContactClosureSensor:
			return ContactClosureSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.UsageSensor:
			return UsageSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.SwitchSensor:
			return SwitchSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.MedicationDosageSensor:
			return MedicationDosageSensorEvent.getEventByOrder(event);
		case ActivityHubSensorType.TemperatureSensor:
			return TemperatureSensorEvent.getEventByOrder(event);

		case ActivityHubSensorType.AdaptorPlugActuator:
			return AdaptorPlugActuatorEvent.getEventByOrder(event);

		}

		return null;
	}

}
