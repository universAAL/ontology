
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

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;

/**
 * This class represents an ontological concept.
 * <br> <br> 
 * 
 * <br> <br> 
 * This class was generated at $now by velocity.
 */

public class Gender extends ManagedIndividual {

	/** Class URI */
	public static final String MY_URI = "http://ontology.universAAL.org/Profile.owl#Gender";
	

	public static final Gender GENDER_NOT_SPECIFIED = new Gender("http://ontology.universAAL.org/Profile.owl#Gender-Not-Specified");
	public static final Gender FEMALE = new Gender("http://ontology.universAAL.org/Profile.owl#Female");
	public static final Gender MALE = new Gender("http://ontology.universAAL.org/Profile.owl#Male");

	static {
		register(Gender.class);
    }
    
    /**
     * Returns the list of all class members guaranteeing that no other members
     * will be created after a call to this method.
     */
    public static ManagedIndividual[] getEnumerationMembers() {
		return new ManagedIndividual[] { 
 						GENDER_NOT_SPECIFIED,
 						FEMALE,
 						MALE 		};
    }

    /**
     * Returns the rating with the given URI.
     */
    public static ManagedIndividual getIndividualByURI(String instanceURI) {
	return (instanceURI != null) ? valueOf(instanceURI) : null;
    }
    
    public static final Gender valueOf(String uri) {
		if (uri == null) return null;
		else if (uri.equals(GENDER_NOT_SPECIFIED.getURI())) return GENDER_NOT_SPECIFIED;
		else if (uri.equals(FEMALE.getURI())) return FEMALE;
		else if (uri.equals(MALE.getURI())) return MALE;
		else return null;
    }
		
    
    public static Restriction getClassRestrictionsOnProperty(String propURI) {
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
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
		return "Gender";
    }
    
    protected Gender() {
		super();
    }

    public Gender(String uri) {
		super(uri);
    }

    protected Gender(String uriPrefix, int numProps) {
		super(uriPrefix, numProps);
    }
		
	public boolean isWellFormed() {
		return true;
    }
    
    public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
    }
    
    
    

}
