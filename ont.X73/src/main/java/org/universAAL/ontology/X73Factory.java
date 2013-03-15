package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.X73.AbsoluteTimeStamp;
import org.universAAL.ontology.X73.BloodPressureDia;
import org.universAAL.ontology.X73.BloodPressureMonitor;
import org.universAAL.ontology.X73.BloodPressureSys;
import org.universAAL.ontology.X73.BodyWeight;
import org.universAAL.ontology.X73.Pulse;
import org.universAAL.ontology.X73.SystemModel;
import org.universAAL.ontology.X73.WeighingScale;
import org.universAAL.ontology.X73.X73;
import org.universAAL.ontology.X73.compoundBasicNuValue;

public class X73Factory extends ResourceFactoryImpl {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new WeighingScale(instanceURI);
	case 1:
	    return new compoundBasicNuValue(instanceURI);
	case 2:
	    return new BodyWeight(instanceURI);
	case 3:
	    return new SystemModel(instanceURI);
	case 4:
	    return new BloodPressureSys(instanceURI);
	case 5:
	    return new BloodPressureDia(instanceURI);
	case 6:
	    return new AbsoluteTimeStamp(instanceURI);
	case 7:
	    return new X73(instanceURI);
	case 8:
	    return new BloodPressureMonitor(instanceURI);
	case 9:
	    return new Pulse(instanceURI);

	}
	return null;
    }
}
