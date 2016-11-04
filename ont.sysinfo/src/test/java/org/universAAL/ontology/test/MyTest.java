package org.universAAL.ontology.test;

import org.universAAL.middleware.bus.junit.BusTestCase;
import org.universAAL.ontology.PhWorldActivator;
import org.universAAL.ontology.SysinfoActivator;

public class MyTest extends BusTestCase {

    protected void setUp() throws Exception {
	super.setUp();
	new PhWorldActivator().start(mc);
	new SysinfoActivator().start(mc);
    }

    public void test() {
    }
}
