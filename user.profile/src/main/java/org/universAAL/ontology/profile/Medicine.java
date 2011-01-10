/*
	Copyright 2008-2010 SPIRIT, http://www.spirit-intl.com/
	SPIRIT S.A. E-BUSINESS AND COMMUNICATIONS ENGINEERING 
	
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
package org.universAAL.ontology.profile;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;


public class Medicine extends ManagedIndividual implements PropertyPublisher {

	public static final String PROFILING_NAMESPACE = "http://ontology.persona.ratio.it/Medicine.owl#";
	public static final String MY_URI;
	public static final String PROP_S_NAME;
	public static final String PROP_S_QUANTITY;
	
	
	static {
		MY_URI = PROFILING_NAMESPACE + "sMedicine";
		PROP_S_NAME = PROFILING_NAMESPACE +"mName";
		PROP_S_QUANTITY = PROFILING_NAMESPACE +"mQuantity";
		register(Medicine.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_S_NAME.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,TypeMapper.getDatatypeURI(String.class) , 1, 1);
		if (PROP_S_QUANTITY.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,TypeMapper.getDatatypeURI(Integer.class) , 1, 1);
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}
	
	public void setProperty(String propURI, Object o) {
		if (PROP_S_NAME.equals(propURI)  &&  o instanceof String)
			setName((String) o);
		else if (PROP_S_QUANTITY.equals(propURI)  &&  o instanceof Integer)
			setQuantity((Integer) o);
		super.setProperty(propURI, o);
	}
	
	public static String[] getStandardPropertyURIs() {
		return new String[] {
				PROP_S_NAME,
				PROP_S_QUANTITY
		};
	}
	
	public static String getRDFSComment() {
		return "The value of Medicine.";
	}

	public static String getRDFSLabel() {
		return "Medicine";
	}
	
	public Medicine(){
		super();
	}
	
	public Medicine(String uri){
		super(uri);
	}
	
	public Medicine(String uri, String mName, Integer mQuantity){
		super(uri);
		if ((mName == null) || (mQuantity == null))
			throw new IllegalArgumentException();
		
		props.put(PROP_S_NAME, mName);
		props.put(PROP_S_QUANTITY,mQuantity);
	}
	
	public String getName() {
		Object o = props.get(PROP_S_NAME);
		return (o == null) ? "" : (String) o;
	}

	public void setName(String mName) {
			props.put(PROP_S_NAME, new String(mName));
	}
	
	public Integer getQuantity() {
		Integer i = (Integer) props.get(PROP_S_QUANTITY);
		if (i == null)
			return new Integer(-1);
		return i;
	}

	public void setQuantity(Integer mQuantity) {
			props.put(PROP_S_QUANTITY, mQuantity);
	}
	
	/* (non-Javadoc)
	 * @see org.persona.ontology.ManagedIndividual#getPropSerializationType(java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	/* (non-Javadoc)
	 * @see org.persona.ontology.ManagedIndividual#isWellFormed()
	 */
	public boolean isWellFormed() {
		return props.containsKey(PROP_S_NAME)
		&& props.containsKey(PROP_S_QUANTITY);
	}

	public ProfileProperty[] getAllProperties() {
		ProfileProperty[] staticProperties = getStaticProperties();
		ProfileProperty[] dynamicProperties = getDynamicProperties();

		int staticLength = staticProperties.length;
		int dynamicLength = dynamicProperties.length;
		int allLength = staticLength + dynamicLength; 
		
		ProfileProperty[] allProperties = 
			new ProfileProperty[allLength];
		
		
		for (int i = 0; i < staticLength; ++i) {
			allProperties[i] = staticProperties[i];			
		}
		for (int i = staticLength; i < allLength; ++i) {
			allProperties[i] = dynamicProperties[staticLength - i];
		}
		
		return allProperties;
	}
	
	public ProfileProperty[] getDynamicProperties() {
		return new ProfileProperty[0];
	}

	public ProfileProperty[] getStaticProperties() {
		ProfileProperty[] ppArray = new ProfileProperty[2];
		
		ppArray[0] = new ProfileProperty(
				((getName() == null) ? "" : getName()), PROP_S_NAME, "Medicine name", true);
		ppArray[1] = new ProfileProperty(getQuantity(), PROP_S_QUANTITY, "Medicine quantity", true);
		
		return ppArray;
	}

	/**
	 * @return
	 */
	public static Medicine loadInstance() {
		return new Medicine();
	}

}
