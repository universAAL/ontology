
package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;


import org.universAAL.ontology.fitbitdata.Sleep;
import org.universAAL.ontology.fitbitdata.FitbitData;
import org.universAAL.ontology.fitbitdata.Activity;

public class FitbitdataFactory extends ResourceFactoryImpl {

	public static final int Sleep = 0;
	public static final int FitbitData = 1;
	public static final int Activity = 2;
	
  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

	switch (factoryIndex) {
     case Sleep:
       return new Sleep(instanceURI);
     case FitbitData:
       return new FitbitData(instanceURI);
     case Activity:
       return new Activity(instanceURI);

	}
	return null;
  }
}
