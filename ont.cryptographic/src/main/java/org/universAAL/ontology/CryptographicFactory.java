
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.cryptographic.CertificationAuthority;
import org.universAAL.ontology.cryptographic.CryptographicService;
import org.universAAL.ontology.cryptographic.DigestService;
import org.universAAL.ontology.cryptographic.EncryptedResource;
import org.universAAL.ontology.cryptographic.EncryptionService;
import org.universAAL.ontology.cryptographic.KeyRing;
import org.universAAL.ontology.cryptographic.MultidestinationEncryptedResource;
import org.universAAL.ontology.cryptographic.SignAndVerifyService;
import org.universAAL.ontology.cryptographic.SignedResource;
import org.universAAL.ontology.cryptographic.SimpleKey;

public class CryptographicFactory implements ResourceFactory {


  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

	switch (factoryIndex) {
     case 0:
       return new DigestService(instanceURI);
     case 1:
       return new SimpleKey(instanceURI);
     case 2:
       return new KeyRing(instanceURI);
     case 3:
       return new MultidestinationEncryptedResource(instanceURI);
     case 4:
       return new EncryptionService(instanceURI);
     case 5:
       return new SignedResource(instanceURI);
     case 6:
       return new CertificationAuthority(instanceURI);
     case 7:
       return new EncryptedResource(instanceURI);
     case 8:
       return new CryptographicService(instanceURI);
     case 9:
       return new SignAndVerifyService(instanceURI);

	}
	return null;
  }
}
