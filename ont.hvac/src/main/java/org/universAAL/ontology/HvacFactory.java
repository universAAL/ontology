/*
	Copyright 2015 UPM, http://www.upm.es/
Universidad Politécnica de Madrid
 */
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.hvac.*;


public class HvacFactory implements ResourceFactory {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {

	case 0:
	    return new Air_Conditioning(instanceURI);  
	case 1:
	    return new Heating(instanceURI);
	case 2:
	    return new Ventilation(instanceURI);
		}
	return null;
    }
}
