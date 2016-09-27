/*******************************************************************************
 * Copyright 2016 Universidad Politécnica de Madrid UPM
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
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
import org.universAAL.ontology.cryptographic.digest.MessageDigest;
import org.universAAL.ontology.cryptographic.digest.SecureHashAlgorithm;
import org.universAAL.ontology.cryptographic.symmetric.AES;
import org.universAAL.ontology.cryptographic.symmetric.Blowfish;
import org.universAAL.ontology.cryptographic.symmetric.DES;

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
     case 10:
    	 return new MessageDigest(instanceURI);
     case 11:
    	 return new SecureHashAlgorithm(instanceURI);
     case 12:
    	 return new AES(AES.SINGLETON_URI); //SINGLETON INSTANCE: always the same.
     case 13:
    	 return new Blowfish(Blowfish.SINGLETON_URI); //SINGLETON INSTANCE: always the same.
     case 14:
    	 return new DES(DES.SINGLETON_URI);//SINGLETON INSTANCE: always the same.
	}
	return null;
  }
}
