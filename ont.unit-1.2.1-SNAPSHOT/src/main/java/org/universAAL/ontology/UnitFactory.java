package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.unit.DividedUnit;
import org.universAAL.ontology.unit.MultipliedUnit;
import org.universAAL.ontology.unit.Prefix;
import org.universAAL.ontology.unit.Unit;
import org.universAAL.ontology.unit.UnitService;
import org.universAAL.ontology.unit.UnitSystem;

public class UnitFactory extends ResourceFactoryImpl {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	switch (factoryIndex) {
	case 1:
	    return new Unit(instanceURI);
	case 2:
	    return new UnitSystem(instanceURI);
	case 3:
	    return new Prefix(instanceURI);
	case 4:
	    return new MultipliedUnit(instanceURI);
	case 5:
	    return new DividedUnit(instanceURI);
	case 6:
	    return new UnitService(instanceURI);
	}
	return null;
    }

}
