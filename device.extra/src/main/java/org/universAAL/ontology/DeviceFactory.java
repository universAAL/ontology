package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.device.home.*;

public class DeviceFactory extends ResourceFactoryImpl{

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	switch (factoryIndex) {
	case 0:
	    return new CarpetSensor(instanceURI);
	case 1:
	    return new ContactSensor(instanceURI);
	case 2:
	    return new Oven(instanceURI);
	case 3:
	    return new PresenceDetector(instanceURI);
	case 4:
	    return new SirenActuator(instanceURI);
	case 5:
	    return new Strap(instanceURI);
	}
	return null;
    }

}
