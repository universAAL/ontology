package ont.universAAL.ontology;

import ont.universAAL.ontology.water.FaucetSensor;
import ont.universAAL.ontology.water.WaterActuator;
import ont.universAAL.ontology.water.WaterFloodDetector;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

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
