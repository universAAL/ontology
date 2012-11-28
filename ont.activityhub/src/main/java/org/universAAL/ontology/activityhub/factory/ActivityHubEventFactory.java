package org.universAAL.ontology.activityhub.factory;

import org.universAAL.ontology.activityhub.*;
import org.universAAL.ontology.activityhub.ext.AdaptorPlugActuatorEvent;
import org.universAAL.ontology.activityhub.util.ActivityHubSensorType;

/**
 * Factory for the ActivityHub ontology according to ISO 11073 - 
 * Part 10471 (Independent living activity hub), edition 2010-05-01
 * 
 * @author Thomas Fuxreiter
 */
public abstract class ActivityHubEventFactory {

    public static ActivityHubSensorEvent createInstance(
    		//String classURI, String instanceURI,
    		int factoryIndex,
    		int event) {
	
    	switch (factoryIndex) {
//		changed to abstract class
//    	case ActivityHubSensorType.ActivityHubSensor:
//    					return new ActivityHubSensor(instanceURI);

    	
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
