package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.activityhub.*;
import org.universAAL.ontology.activityhub.ext.AdaptorPlugActuator;

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
//    	case 0:
//    		return new ActivityHub(instanceURI);
    	case 1:
    		return new FallSensor(instanceURI);
    	case 2:
    		return new PersSensor(instanceURI);
    	case 3:
    		return new SmokeSensor(instanceURI);
    	case 4:
    		return new CoSensor(instanceURI);
    	case 5:
    		return new WaterSensor(instanceURI);
    	case 6:
    		return new GasSensor(instanceURI);
    	case 7:
    		return new MotionSensor(instanceURI);
    	case 8:
    		return new PropertyExitSensor(instanceURI);
    	case 9:
    		return new EnuresisSensor(instanceURI);
    	case 10:
    		return new ContactClosureSensor(instanceURI);
    	case 11:
    		return new UsageSensor(instanceURI);
    	case 12:
    		return new SwitchSensor(instanceURI);
    	case 13:
    		return new MedicationDosageSensor(instanceURI);
    	case 14:
    		return new TemperatureSensor(instanceURI);
    	case 15:
    		return new AdaptorPlugActuator(instanceURI);
    	case 16:
    		return new ActivityHub(instanceURI);
    	}

    	return null;
    }
}
