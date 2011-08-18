package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.ontology.tutorial.MyConcept;
import org.universAAL.ontology.tutorial.MyEnumeration;

//You need an Activator in your ontology bundle because it must be started...
public class Activator implements BundleActivator {

    static BundleContext context = null;

    public void start(BundleContext context) throws Exception {
	Activator.context = context;
	// For every class included in your ontology bundle you must put a
	// "forName" here.
	// This will order all the static blocks of your ontology classes to
	// execute, and all of them will trigger the "register" method there.
	// That way all your concepts and enumerations will be registered into
	// the platform.
	Class.forName(MyConcept.class.getName());
	Class.forName(MyEnumeration.class.getName());
    }

    public void stop(BundleContext arg0) throws Exception {
	// You don´t need to do anything here...
    }
}
