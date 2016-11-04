package org.universAAL.ontology.test;

import org.universAAL.middleware.bus.junit.BusTestCase;
import org.universAAL.ontology.LanguageActivator;
import org.universAAL.ontology.PhWorldActivator;
import org.universAAL.ontology.ProfileActivator;
import org.universAAL.ontology.UIPreferencesProfileActivator;

public class MyTest extends BusTestCase {

    protected void setUp() throws Exception {
	super.setUp();
	new PhWorldActivator().start(mc);
	new ProfileActivator().start(mc);
	new LanguageActivator().start(mc);
	new UIPreferencesProfileActivator().start(mc);
    }

    public void test() {
    }
}
