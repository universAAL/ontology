package org.universAAL.ontology.test;

import org.universAAL.middleware.bus.junit.BusTestCase;
import org.universAAL.ontology.MeasurementActivator;
import org.universAAL.ontology.UnitActivator;

public class MyTest extends BusTestCase {

    protected void setUp() throws Exception {
	super.setUp();
	new UnitActivator().start(mc);
	new MeasurementActivator().start(mc);
    }

    public void test() {
    }
}
