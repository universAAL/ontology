package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.activityhub.*;
import org.universAAL.ontology.activityhub.ext.AdaptorPlugActuator;
import org.universAAL.ontology.activityhub.util.ActivityHubSensorType;

/**
 * Factory for the ActivityHub ontology according to ISO 11073 - 
 * Part 10471 (Indepentend living activity hub), edition 2010-05-01
 * 
 * @author Thomas Fuxreiter
 */
public class ActivityHubFactory extends ResourceFactoryImpl {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	
    	switch (factoryIndex) {
//		changed to abstract class
//    	case ActivityHubSensorType.ActivityHubSensor:
//    					return new ActivityHubSensor(instanceURI);
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
    	case ActivityHubSensorType.ActivityHub:
    					return new ActivityHub(instanceURI);
    	}

    	return null;
    }
}
