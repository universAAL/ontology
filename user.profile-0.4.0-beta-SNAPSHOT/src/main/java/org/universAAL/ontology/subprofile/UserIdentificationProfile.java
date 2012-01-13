
/*
	Copyright 2008-2014 Forschungszentrum Informatik FZI, http://www.fzi.de
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
 
package org.universAAL.ontology.subprofile;

import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;

/**
 * This class represents an ontological concept.
 * <br> <br> 
 * 
 * <br> <br> 
 * This class was generated at $now by velocity.
 */

public class UserIdentificationProfile extends SubProfile {

	/** Class URI */
	public static final String MY_URI = "http://ontology.universAAL.org/Profile.owl#UserIdentificationProfile";
	
    /** http://ontology.universAAL.org/Profile.owl#preferred-language */
	public static final String PROP_PREFERRED_LANGUAGE = "http://ontology.universAAL.org/Profile.owl#preferred-language";
    /** http://ontology.universAAL.org/Profile.owl#gender */
	public static final String PROP_GENDER = "http://ontology.universAAL.org/Profile.owl#gender";
    /** http://ontology.universAAL.org/Profile.owl#last-name */
	public static final String PROP_LAST_NAME = "http://ontology.universAAL.org/Profile.owl#last-name";
    /** http://ontology.universAAL.org/Profile.owl#phone-number */
	public static final String PROP_PHONE_NUMBER = "http://ontology.universAAL.org/Profile.owl#phone-number";
    /** http://ontology.universAAL.org/Profile.owl#home-address */
	public static final String PROP_HOME_ADDRESS = "http://ontology.universAAL.org/Profile.owl#home-address";
    /** http://ontology.universAAL.org/Profile.owl#email-address */
	public static final String PROP_EMAIL_ADDRESS = "http://ontology.universAAL.org/Profile.owl#email-address";
    /** http://ontology.universAAL.org/Profile.owl#mobile-phone-number */
	public static final String PROP_MOBILE_PHONE_NUMBER = "http://ontology.universAAL.org/Profile.owl#mobile-phone-number";
    /** http://ontology.universAAL.org/Profile.owl#first-name */
	public static final String PROP_FIRST_NAME = "http://ontology.universAAL.org/Profile.owl#first-name";
	
	static {
		register(UserIdentificationProfile.class);
    }
    
    public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_MOBILE_PHONE_NUMBER.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
				 TypeMapper.getDatatypeURI(String.class), 1, 0);
		if (PROP_GENDER.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
				 Gender.MY_URI, 1, 0);
		if (PROP_EMAIL_ADDRESS.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
				 TypeMapper.getDatatypeURI(String.class), 1, 0);
		if (PROP_HOME_ADDRESS.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
				 TypeMapper.getDatatypeURI(String.class), 1, 0);
		if (PROP_PHONE_NUMBER.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
				 TypeMapper.getDatatypeURI(String.class), 1, 0);
		if (PROP_PREFERRED_LANGUAGE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
				 Language.MY_URI, 1, 0);
		if (PROP_LAST_NAME.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
				 TypeMapper.getDatatypeURI(String.class), 1, 0);
		if (PROP_FIRST_NAME.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
				 TypeMapper.getDatatypeURI(String.class), 1, 0);
		return SubProfile.getClassRestrictionsOnProperty(propURI);
    }
 
    public static String[] getStandardPropertyURIs() {
		return new String[] {
					PROP_PREFERRED_LANGUAGE,
					PROP_GENDER,
					PROP_LAST_NAME,
					PROP_PHONE_NUMBER,
					PROP_HOME_ADDRESS,
					PROP_EMAIL_ADDRESS,
					PROP_MOBILE_PHONE_NUMBER,
					PROP_FIRST_NAME 
		};
	}
 	
	/**
     * Returns a human readable description on the essence of this ontology
     * class.
     */
    public static String getRDFSComment() {
		return "";
    }
    
    /**
     * Returns a label with which this ontology class can be introduced to human
     * users.
     */
    public static String getRDFSLabel() {
		return "UserIdentificationProfile";
    }
    
    protected UserIdentificationProfile() {
		super();
    }

    public UserIdentificationProfile(String uri) {
		super(uri);
    }

    protected UserIdentificationProfile(String uriPrefix, int numProps) {
		super(uriPrefix, numProps);
    }
		
	public boolean isWellFormed() {
		return true;
    }
    
    public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
    }
    
    public void setMOBILE_PHONE_NUMBER(String value) {
	    super.setProperty(PROP_MOBILE_PHONE_NUMBER , value);
    }
    
    public String getMOBILE_PHONE_NUMBER() {
    	return (String) props.get(PROP_MOBILE_PHONE_NUMBER );
    }
    
    public void setGender(Gender value) {
	    super.setProperty(PROP_GENDER , value);
    }
    
    public Gender getGender() {
    	return (Gender) props.get(PROP_GENDER );
    }
    
    public void setEMAIL_ADDRESS(String value) {
	    super.setProperty(PROP_EMAIL_ADDRESS , value);
    }
    
    public String getEMAIL_ADDRESS() {
    	return (String) props.get(PROP_EMAIL_ADDRESS );
    }
    
    public void setHOME_ADDRESS(String value) {
	    super.setProperty(PROP_HOME_ADDRESS , value);
    }
    
    public String getHOME_ADDRESS() {
    	return (String) props.get(PROP_HOME_ADDRESS );
    }
    
    public void setPHONE_NUMBER(String value) {
	    super.setProperty(PROP_PHONE_NUMBER , value);
    }
    
    public String getPHONE_NUMBER() {
    	return (String) props.get(PROP_PHONE_NUMBER );
    }
    
    public void setLanguage(Language value) {
	    super.setProperty(PROP_PREFERRED_LANGUAGE , value);
    }
    
    public Language getLanguage() {
    	return (Language) props.get(PROP_PREFERRED_LANGUAGE );
    }
    
    public void setLAST_NAME(String value) {
	    super.setProperty(PROP_LAST_NAME , value);
    }
    
    public String getLAST_NAME() {
    	return (String) props.get(PROP_LAST_NAME );
    }
    
    public void setFIRST_NAME(String value) {
	    super.setProperty(PROP_FIRST_NAME , value);
    }
    
    public String getFIRST_NAME() {
    	return (String) props.get(PROP_FIRST_NAME );
    }
    
    
    

}
