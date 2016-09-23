
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.cryptographic.CertificationAuthority;
import org.universAAL.ontology.cryptographic.CryptograpichService;
import org.universAAL.ontology.cryptographic.KeyRing;
import org.universAAL.ontology.cryptographic.SignedResource;
import org.universAAL.ontology.cryptographic.SimpleKey;

public class CryptographicFactory implements ResourceFactory {


  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

	switch (factoryIndex) {
     case 0:
       return new SignedResource(instanceURI);
     case 1:
       return new SimpleKey(instanceURI);
     case 2:
       return new CryptograpichService(instanceURI);
     case 3:
       return new KeyRing(instanceURI);
     case 4:
       return new CertificationAuthority(instanceURI);

	}
	return null;
  }
}
