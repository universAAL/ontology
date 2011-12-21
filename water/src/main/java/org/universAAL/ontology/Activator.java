package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.ontology.water.FaucetSensor;
import org.universAAL.ontology.water.WaterActuator;
import org.universAAL.ontology.water.WaterFloodDetector;

public class Activator implements BundleActivator{
	public static BundleContext context=null;

	public void start(BundleContext context) throws Exception {
		Activator.context=context;
		Class.forName(FaucetSensor.class.getName());
		Class.forName(WaterActuator.class.getName());
		Class.forName(WaterFloodDetector.class.getName());
	}

	public void stop(BundleContext arg0) throws Exception {
	}

}
