
package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;


import org.universAAL.ontology.cryptographic.CryptographicTechnique;
import org.universAAL.ontology.cryptographic.SimpleBlockEncryption;
import org.universAAL.ontology.cryptographic.SignedResource;
import org.universAAL.ontology.cryptographic.SimpleKey;
import org.universAAL.ontology.cryptographic.Digest;
import org.universAAL.ontology.cryptographic.CryptograpichService;
import org.universAAL.ontology.cryptographic.Encryption;
import org.universAAL.ontology.cryptographic.ChainedBlockEncryption;
import org.universAAL.ontology.cryptographic.AsymmetricEncryption;
import org.universAAL.ontology.cryptographic.KeyExchange;
import org.universAAL.ontology.cryptographic.StreamEncryption;
import org.universAAL.ontology.cryptographic.BlockEncryption;
import org.universAAL.ontology.cryptographic.EncryptionKey;
import org.universAAL.ontology.cryptographic.KeyRing;
import org.universAAL.ontology.cryptographic.CertificationAuthority;
import org.universAAL.ontology.cryptographic.SymetricEncryption;

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
