/**
 * Activator for the Continua HDP manager ontology.
 * 
 * @author Angel Martinez-Cavero TSB Technologies for Health and Well-being
 * 
 */

// Package
package org.universAAL.ontology;

// Imports
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.owl.OntologyManagement;

// Main class
public class Activator implements ModuleActivator {

    // Attributes
    ContinuaHealthManagerOntology cho = new ContinuaHealthManagerOntology();

    // Methods

    /** Start */
    public void start(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().register(mc, cho);
    }

    /** Stop */
    public void stop(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().unregister(mc, cho);
    }
}