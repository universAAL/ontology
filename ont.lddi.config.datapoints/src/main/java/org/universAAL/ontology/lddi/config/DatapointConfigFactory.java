
package org.universAAL.ontology.lddi.config;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.lddi.config.datapoints.Component;
import org.universAAL.ontology.lddi.config.datapoints.Datapoint;
import org.universAAL.ontology.lddi.config.datapoints.DatapointValueType;

public class DatapointConfigFactory implements ResourceFactory {


  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {
		switch (factoryIndex) {
		case 0:
			if (Component.MY_URI.equals(classURI)) 
				return new Component(instanceURI);
			return null;
		case 1:
			if (DatapointValueType.MY_URI.equals(classURI)) 
				return new DatapointValueType(instanceURI);
			return null;
		case 2:
			if (Datapoint.MY_URI.equals(classURI)) 
				return new Datapoint(instanceURI);
			return null;
			
		}
		return null;
  }
}
