package org.universAAL.ontology.test;

import org.universAAL.middleware.bus.junit.BusTestCase;
import org.universAAL.ontology.DeviceActivator;
import org.universAAL.ontology.MeasurementActivator;
import org.universAAL.ontology.PhWorldActivator;
import org.universAAL.ontology.ProfileActivator;
import org.universAAL.ontology.UnitActivator;
import org.universAAL.ontology.activityhub.Activator;

public class MyTest extends BusTestCase {

    protected void setUp() throws Exception {
	super.setUp();
	new PhWorldActivator().start(mc);
	new UnitActivator().start(mc);
	new MeasurementActivator().start(mc);
	new ProfileActivator().start(mc);
	new DeviceActivator().start(mc);
	new Activator().start(mc);
    }

    public void test() {
    }
}
