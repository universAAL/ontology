package test.integration;

import org.universAAL.middleware.bus.junit.BusTestCase;
import org.universAAL.ontology.UnitActivator;

public class MyTest extends BusTestCase {

    protected void setUp() throws Exception {
	super.setUp();
	new UnitActivator().start(mc);
    }

    public void test() {
    }
}
