
package org.universAAL.ontology.x73;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;



public class X73Factory extends ResourceFactoryImpl {


  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

	switch (factoryIndex) {
     case 0:
       return new MDSAttribute(instanceURI);
     case 1:
       return new x73(instanceURI);
     case 2:
       return new MDS(instanceURI);

	}
	return null;
  }
}
