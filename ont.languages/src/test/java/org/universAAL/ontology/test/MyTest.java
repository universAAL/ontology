package org.universAAL.ontology.test;

import org.universAAL.middleware.bus.junit.BusTestCase;
import org.universAAL.ontology.LanguageActivator;

public class MyTest extends BusTestCase {

    protected void setUp() throws Exception {
	super.setUp();
	new LanguageActivator().start(mc);
    }

    public void test() {
    }
}
