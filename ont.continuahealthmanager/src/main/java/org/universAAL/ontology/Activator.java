/**
 * Activator for the Continua HDP manager ontology.
 * 
 * @author Angel Martinez-Cavero TSB Technologies for Health and Well-being
 * 
 */

// Package
package org.universAAL.ontology;

// Imports
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.owl.OntologyManagement;

// Main class
public class Activator implements BundleActivator {

	// Attributes
	ContinuaHealthManagerOntology cho = new ContinuaHealthManagerOntology();
	
	// Methods
	
	/** Start */
	public void start(BundleContext arg0) throws Exception {
		OntologyManagement.getInstance().register(cho);
	}

	/** Stop */
	public void stop(BundleContext arg0) throws Exception {
		OntologyManagement.getInstance().unregister(cho);		
	}
}