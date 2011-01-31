/*
	Copyright 2008-2010 Vodafone Italy, http://www.vodafone.it
	Vodafone Omnitel N.V.
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package org.universAAL.ontology.location.extra;

import java.util.List;
import java.util.Vector;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;


/**
 * The class Address represents a generic address. This is an abstract class because
 * it is not possible to create a generic Address without any address type (it is
 * possible to do it using the PhysicalAddress and the MailBox subclasses).
 * 
 * 
 * @author smazzei
 *
 */
public abstract class Address extends ManagedIndividual {

	public static final String MY_URI;
	public static final String PROP_COUNTRY_NAME;
	public static final String PROP_EXTENDED_ADDRESS;
	public static final String PROP_LOCALITY;
	public static final String PROP_POSTAL_CODE;
	public static final String PROP_REGION;
	
	static {
		MY_URI = uAAL_VOCABULARY_NAMESPACE + "Address";
		PROP_COUNTRY_NAME= uAAL_VOCABULARY_NAMESPACE + "countryName";
		PROP_EXTENDED_ADDRESS= uAAL_VOCABULARY_NAMESPACE + "extendedAddress";
		PROP_LOCALITY= uAAL_VOCABULARY_NAMESPACE + "locality";
		PROP_POSTAL_CODE=uAAL_VOCABULARY_NAMESPACE + "postalCode";
		PROP_REGION = uAAL_VOCABULARY_NAMESPACE + "region";
		register(Address.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		//it is possible to indicate up to two country names (sometimes it could be useful to 
		//indicate the country  name in its original language and in a commonly known language)
		if (PROP_COUNTRY_NAME.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(String.class), 2, 0);
		if (PROP_EXTENDED_ADDRESS.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(String.class), 1, 0);
		//LOCALITY is the only mandatory property for an Address
		if (PROP_LOCALITY.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(String.class), 1, 1);
		if (PROP_POSTAL_CODE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(String.class), 1, 0);
		if (PROP_REGION.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(String.class), 1, 0);
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		return new String[] {
				PROP_COUNTRY_NAME,
				PROP_EXTENDED_ADDRESS,
				PROP_LOCALITY,
				PROP_POSTAL_CODE,
				PROP_REGION
		};
	}
	
	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public Address() {
		super();
	}
	
	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public Address(String uri) {
		super(uri);
	}
	
	
	/**
	 * 
	 * creates a new Address with URI and locality name. If URI is null an anonymous
	 * object is created. 
	 */
	protected Address(String uri, String locality) {
		super(uri);
		if (locality == null || locality=="")
			throw new IllegalArgumentException();
		props.put(PROP_LOCALITY, locality);
	}
	/**
	 * 
	 * creates a new Address with a locality name
	 */
	
	
	public int getPropSerializationType(String propURI) {
		if (  PROP_COUNTRY_NAME.equals(propURI)
			||PROP_EXTENDED_ADDRESS.equals(propURI)
			||PROP_LOCALITY.equals(propURI)
			||PROP_POSTAL_CODE.equals(propURI)
			||PROP_REGION.equals(propURI))
			return PROP_SERIALIZATION_REDUCED;
		
		return PROP_SERIALIZATION_OPTIONAL;
	}
	
	public static String getRDFSComment() {
		return "The class of Addresses (an address can be a physical address or a mailbox)";
	}
	
	public static String getRDFSLabel() {
		return "Address";
	}
	/**
	 * Returns true if the Address contains at least the location property 
	 */
	public boolean isWellFormed() {
		return props.containsKey(PROP_LOCALITY);
	}
	
	/**
	 * @return the Address CountryNames. It can be a null object (if no country name is present), 
	 * an array with one element (if only a country name is present), or an array with two 
	 * elements (if two country names are present)
	 */
	public String [] getCountryName() {
		if (!props.containsKey(PROP_COUNTRY_NAME))
			return null;
		List Countries =(List)props.get(PROP_COUNTRY_NAME);
		return (String[])Countries.toArray(new String[0]);
	}
	/**
	 * Set the current address country name property
	 * @param countryName A String array with one or two elements (it is not possible to use
	 * a null value or an array with more than two elements)
	 */
	public void setCountryName(String [] countryName) {
		if (countryName==null || countryName.length > 2 || countryName.length ==0)
			throw new IllegalArgumentException();
		List countriesList= new Vector();
		for (int i=0; i<countryName.length; i++)
			countriesList.add(countryName[i]);
		props.put(PROP_COUNTRY_NAME, countriesList);
	}
	/**
	 * 
	 * @return The Extended address property (this value can be null)
	 */
	public String getExtendedAddress() {
		if (!props.containsKey(PROP_EXTENDED_ADDRESS))
			return null;
		return (String)props.get(PROP_EXTENDED_ADDRESS);
	}
	/**
	 * Set the Extended address property
	 * @param extendedAddress A null value is not admitted as argument
	 */
	public void setExtendedAddress(String extendedAddress) {
		if (extendedAddress==null)
			throw new IllegalArgumentException();
		props.put(PROP_EXTENDED_ADDRESS, extendedAddress);
	}
	
	/**
	 * 
	 * @return The Locality property (for a well formed Address this value is not null)
	 */
	public String getLocality() {
		if (!props.containsKey(PROP_LOCALITY))
			return null;
		return (String)props.get(PROP_LOCALITY);
	}
	
	/**
	 * Set the Locality property
	 * @param locality A null value is not admitted as argument
	 */
	public void setLocality(String locality) {
		if (locality==null)
			throw new IllegalArgumentException();
		props.put(PROP_LOCALITY, locality);
	}
	
	/**
	 * 
	 * @return The postal code property (this value can be null)
	 */
	public String getPostalCode() {
		if (!props.containsKey(PROP_POSTAL_CODE))
			return null;
		return (String)props.get(PROP_POSTAL_CODE);
	}

	/**
	 * Set the postal code property
	 * @param postalCode A null value is not admitted as argument
	 */
	public void setPostalCode(String postalCode) {
		if (postalCode==null)
			throw new IllegalArgumentException();
		props.put(PROP_POSTAL_CODE, postalCode);
	}

	public String getRegion() {
		if (!props.containsKey(PROP_REGION))
			return null;
		return (String)props.get(PROP_REGION);
	}

	/**
	 * Set the region property
	 * @param region A null value is not admitted as argument
	 */
	public void setRegion(String region) {
		if (region==null)
			throw new IllegalArgumentException();
		props.put(PROP_REGION, region);
	}

}
