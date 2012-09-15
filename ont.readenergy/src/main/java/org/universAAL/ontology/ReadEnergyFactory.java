package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.energy.reader.*;

public class ReadEnergyFactory extends ResourceFactoryImpl{
	
	public static final int EnergyReader = 0;
	public static final int EnergyReaderDevice = 1;
	public static final int EnergyReaderMeassurement = 2;

	public Resource createInstance(String classURI, String instanceURI,
			int factoryIndex) {
		switch (factoryIndex) {
		case EnergyReader:
			return new ReadEnergy(instanceURI);
		case EnergyReaderDevice:
			return new ReadEnergyDevice(instanceURI);
		case EnergyReaderMeassurement:
			return new EnergyMeasurement(instanceURI);

		}
		return null;
	}
}
