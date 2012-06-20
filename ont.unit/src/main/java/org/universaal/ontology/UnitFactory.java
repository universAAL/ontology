package org.universaal.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universaal.ontology.owl.DividedUnit;
import org.universaal.ontology.owl.MultipliedUnit;
import org.universaal.ontology.owl.Prefix;
import org.universaal.ontology.owl.Unit;
import org.universaal.ontology.owl.UnitSystem;

public class UnitFactory extends ResourceFactoryImpl {

	@Override
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
		}
		return null;
	}

}
