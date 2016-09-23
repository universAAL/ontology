package org.universAAL.ontology.cryptographic;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;


/**
 * Ontological representation of KeyRing in the cryptographic ontology. 
 * Methods included in this class are the mandatory ones for representing an
 * ontological concept in Java classes for the universAAL platform. In addition
 * getters and setters for properties are included.
 * 
 * @author 
 * @author Generated by the OntologyUML2Java transformation of AAL Studio
 */
public class KeyRing extends EncryptionKey {
  public static final String MY_URI = CryptographicOntology.NAMESPACE
    + "KeyRing";
  public static final String PROP_PRIVATE_KEY = CryptographicOntology.NAMESPACE
    + "privateKey";
  public static final String PROP_CERTIFICATION_AUTHORITY = CryptographicOntology.NAMESPACE
    + "certificationAuthority";
  public static final String PROP_PUBLIC_KEY = CryptographicOntology.NAMESPACE
    + "publicKey";


  public KeyRing () {
    super();
  }
  
  public KeyRing (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  
  public int getPropSerializationType(String propURI) {
    if (PROP_PRIVATE_KEY.equals(propURI))
      return PROP_SERIALIZATION_FULL;
    if (PROP_CERTIFICATION_AUTHORITY.equals(propURI))
      return PROP_SERIALIZATION_FULL;
    if (PROP_PUBLIC_KEY.equals(propURI))
      return PROP_SERIALIZATION_FULL;
    return super.getPropSerializationType(propURI);
  } 

  public boolean isWellFormed() {
	return super.isWellFormed() 
      && hasProperty(PROP_PRIVATE_KEY)
      && hasProperty(PROP_CERTIFICATION_AUTHORITY)
      && hasProperty(PROP_PUBLIC_KEY);
  }

  public String getPublicKey() {
    return (String)getProperty(PROP_PUBLIC_KEY);
  }		

  public void setPublicKey(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_PUBLIC_KEY, newPropValue);
  }		

  public String getPrivateKey() {
    return (String)getProperty(PROP_PRIVATE_KEY);
  }		

  public void setPrivateKey(String newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_PRIVATE_KEY, newPropValue);
  }		

  public CertificationAuthority[] getCertificationAuthority() {
    Object propList = getProperty(PROP_CERTIFICATION_AUTHORITY);
    if (propList instanceof List)
      return (CertificationAuthority[]) ((List) propList).toArray(new CertificationAuthority[0]);
    else if (propList != null)
      return new CertificationAuthority[] {(CertificationAuthority)propList}; // Handle special case of a single item not contained in a list
    return new CertificationAuthority[0];
  }

  public void addCertificationAuthority(CertificationAuthority newValue) {
    Object propList = getProperty(PROP_CERTIFICATION_AUTHORITY);
    List newList;
    if (propList instanceof List)
      newList = (List)propList;
    else {
      newList = new ArrayList();
      if (propList != null)
        newList.add(propList); // Handle special case of a single previous item not contained in a list
    }
    newList.add(newValue);
    changeProperty(PROP_CERTIFICATION_AUTHORITY, newList);
  }
  

  public void setCertificationAuthority(CertificationAuthority[] propertyValue) {
    List propList = new ArrayList(propertyValue.length);
    for (int i = 0; i < propertyValue.length; i++) {
      propList.add(propertyValue[i]);
    }
    changeProperty(PROP_CERTIFICATION_AUTHORITY, propList);
  }

}
