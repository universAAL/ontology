package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.ontology.device.home.*;
import org.universAAL.ontology.device.wearable.*;

public class Activator implements BundleActivator {

	static BundleContext context = null;
	
	public void start(BundleContext context) throws Exception {
		Activator.context = context;
		Class.forName(CarpetSensor.class.getName());
		Class.forName(ContactSensor.class.getName());
		Class.forName(CurtainActuator.class.getName());
		Class.forName(DimmerActuator.class.getName());
		Class.forName(FaucetSensor.class.getName());
		Class.forName(FireDetector.class.getName());
		Class.forName(GasDetector.class.getName());
		Class.forName(GlassBreakSensor.class.getName());
		Class.forName(LoudSpeaker.class.getName());
		Class.forName(Oven.class.getName());
		Class.forName(PresenceDetector.class.getName());
		Class.forName(SirenActuator.class.getName());	
		Class.forName(Stereoset.class.getName());
		Class.forName(Strap.class.getName());
		Class.forName(TV.class.getName());
		Class.forName(WaterActuator.class.getName());	
		Class.forName(FallDetector.class.getName());
		Class.forName(PanicButton.class.getName());
	}
	
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
