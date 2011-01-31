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

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;



/**
 * The PhysicalAddress class represents an address that identifies a building (i.e. with a street address)
 * @author smazzei
 *
 */
public class PhysicalAddress extends Address {
	
	public static final String MY_URI;
	public static final String PROP_BUILDING_IDENTIFIER;
	public static final String PROP_STREET_NAME;
	
	static {
		MY_URI = uAAL_VOCABULARY_NAMESPACE + "physicalAddress";
		// the building identifier is often a number (e.g. 280), but sometimes it can be
		// an alphanumeric string (e.g. 41E)
		PROP_BUILDING_IDENTIFIER = uAAL_VOCABULARY_NAMESPACE + "buildingIdentifier";
		PROP_STREET_NAME = uAAL_VOCABULARY_NAMESPACE + "streetName"; 
		register(PhysicalAddress.class);
	}
	public class streetAddress{
		public String buildingIdentifier;
		public String streetName;
	}
	
	
	
	
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_BUILDING_IDENTIFIER.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(String.class), 1, 0);
		if (PROP_STREET_NAME.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
					TypeMapper.getDatatypeURI(String.class), 1, 1);
		return Address.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String[] getStandardPropertyURIs() {
		String[] inherited = Address.getStandardPropertyURIs();
		String[] toReturn = new String[inherited.length+2];
		int i = 0;
		while (i < inherited.length) {
			toReturn[i] = inherited[i];
			i++;
		}
		toReturn[i++] = PROP_BUILDING_IDENTIFIER;
		toReturn[i] = PROP_STREET_NAME;
		return toReturn;
	}
	
	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public PhysicalAddress() {
		super();
	}
	
	/**
	 * Constructor just for usage by de-serializers. Do not use this constructor
	 * within applications as it may lead to incomplete instances that cause exceptions.
	 */
	public PhysicalAddress(String uri) {
		super(uri);
	}
		
	
	/**
	 * 
	 * @param uri The ontological object URI
	 * @param locality The address locality (e.g. Milan, London, etc.)
	 * @param streetName A null value is not admitted for this argument
	 * @param buildingIdentifier It can also be null
	 */
	public PhysicalAddress(String uri, String locality, String streetName, String buildingIdentifier) {
		super(uri, locality);
		setStreetAddress(streetName,buildingIdentifier);
	}

	/**
	 * 
	 * @param locality The address locality (e.g. Milan, London, etc.)
	 * @param streetName A null value is not admitted for this argument
	 * @param buildingIdentifier It can also be null
	 */
	public PhysicalAddress(String locality, String streetName, String buildingIdentifier) {
		super(locality);
		setStreetAddress(streetName,buildingIdentifier);
	}
	
	public static String getRDFSComment() {
		return "The class of physical addresses)";
	}
	
	public static String getRDFSLabel() {
		return "PhysicalAddress";
	}

	/**
	 * Set the street address (i.e. street name + building identifier)
	 * @param streetName A null value is not admitted for this argument
	 * @param buildingIdentifier It can also be null
	 */
	public void setStreetAddress(String streetName, String buildingIdentifier)
	{
		if (streetName == null || streetName == "")
			throw new IllegalArgumentException();
		if (buildingIdentifier!=null)
			props.put(PROP_BUILDING_IDENTIFIER, buildingIdentifier);
		
		props.put(PROP_STREET_NAME, streetName);
	}
	/**
	 * Get the street address (i.e. street name + building identifier)
	 * using a streetAddress object. If the building identifier property is not set an 
	 * empty String is returned. If no street name is present a null object is returned (in 
	 * this case the object in not well formed)
	 */
	public streetAddress getStreetAddress(){
		streetAddress addr = new streetAddress();
		if (props.containsKey(PROP_BUILDING_IDENTIFIER))
			addr.buildingIdentifier=(String)props.get(PROP_BUILDING_IDENTIFIER);
		else
			addr.buildingIdentifier="";
		if (props.containsKey(PROP_STREET_NAME))
			addr.streetName=(String)props.get(PROP_STREET_NAME);
		else
			return null;
		return addr;
	}
	
	public int getPropSerializationType(String propURI) {
		if (PROP_BUILDING_IDENTIFIER.equals(propURI)
			|| PROP_STREET_NAME.equals(propURI))
			return PROP_SERIALIZATION_REDUCED;
		
		return super.getPropSerializationType(propURI);
	}
	/**
	 * @return true if locality and street name are presents
	 */
	public boolean isWellFormed() {
		return super.isWellFormed() && props.containsKey(PROP_STREET_NAME);
	}
}
