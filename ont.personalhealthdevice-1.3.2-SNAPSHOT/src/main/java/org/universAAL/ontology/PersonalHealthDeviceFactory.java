package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.personalhealthdevice.BloodPressureMeasurement;
import org.universAAL.ontology.personalhealthdevice.BloodPressureMonitor;
import org.universAAL.ontology.personalhealthdevice.WeighingScale;

/**
 * Factory for PersonalHealthDevice Ontology.
 * 
 * @author Thomas Fuxreiter (foex@gmx.at)
 */
public class PersonalHealthDeviceFactory extends ResourceFactoryImpl {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	/*
	 * General comment for this implementation: we assume that this method
	 * is only called by the static method Resource.getResource() => we
	 * assume that the case of registered named resources is already handled
	 * there
	 */
	switch (factoryIndex) {
	case 0:
	    return new BloodPressureMeasurement(instanceURI);
	case 1:
	    return new BloodPressureMonitor(instanceURI);
	case 2:
	    return new WeighingScale(instanceURI);
	}

	return null;
    }

}
