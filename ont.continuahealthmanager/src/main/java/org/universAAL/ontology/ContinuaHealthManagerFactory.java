/**
 * Continua HDP manager factory.
 * 
 * @author Angel Martinez-Cavero TSB Technologies for Health and Well-being
 * 
 */

// Package
package org.universAAL.ontology;

// Imports
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.continua.ContinuaHealthDevice;
import org.universAAL.ontology.continua.ContinuaHealthManager;

// Main class
public class ContinuaHealthManagerFactory extends ResourceFactoryImpl {

	public Resource createInstance(String classURI,String instanceURI,int factoryIndex) {
		switch (factoryIndex) {
		case 0:
			return new ContinuaHealthDevice(instanceURI);
		case 1:
			return new ContinuaHealthManager(instanceURI);
		}
		return null;
	}
}