package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.risk.FallDetector;
import org.universAAL.ontology.risk.PanicButton;

public class RiskFactory extends ResourceFactoryImpl{

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	switch (factoryIndex) {
	case 0:
	    return new FallDetector(instanceURI);
	case 1:
	    return new PanicButton(instanceURI);
	}
	return null;
    }

}
