package org.universaal.test.integrationTest;

import org.universAAL.middleware.bus.junit.BusTestCase;
import org.universAAL.ontology.PhWorldActivator;
import org.universAAL.ontology.disease.DiseaseActivator;

public class MyTest extends BusTestCase {

    protected void setUp() throws Exception {
	super.setUp();
	new PhWorldActivator().start(mc);
	new DiseaseActivator().start(mc);
    }

    public void test() {
    }
}
