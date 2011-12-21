package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.ontology.device.home.*;

public class Activator implements BundleActivator {

    static BundleContext context = null;

    public void start(BundleContext context) throws Exception {
	Activator.context = context;
	Class.forName(CarpetSensor.class.getName());
	Class.forName(ContactSensor.class.getName());
	Class.forName(Oven.class.getName());
	Class.forName(PresenceDetector.class.getName());
	Class.forName(SirenActuator.class.getName());
	Class.forName(Strap.class.getName());
    }

    public void stop(BundleContext arg0) throws Exception {
	// TODO Auto-generated method stub

    }
}
