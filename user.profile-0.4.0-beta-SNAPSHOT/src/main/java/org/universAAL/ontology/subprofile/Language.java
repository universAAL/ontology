
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

public class Language extends ManagedIndividual {

	/** Class URI */
	public static final String MY_URI = "http://ontology.universAAL.org/Profile.owl#Language";
	

	public static final Language ENGLISH = new Language("http://ontology.universAAL.org/Profile.owl#English");
	public static final Language ITALIAN = new Language("http://ontology.universAAL.org/Profile.owl#Italian");
	public static final Language SPANISH = new Language("http://ontology.universAAL.org/Profile.owl#Spanish");
	public static final Language DANISH = new Language("http://ontology.universAAL.org/Profile.owl#Danish");
	public static final Language DUTCH = new Language("http://ontology.universAAL.org/Profile.owl#Dutch");
	public static final Language GERMAN = new Language("http://ontology.universAAL.org/Profile.owl#German");

	static {
		register(Language.class);
    }
    
    /**
     * Returns the list of all class members guaranteeing that no other members
     * will be created after a call to this method.
     */
    public static ManagedIndividual[] getEnumerationMembers() {
		return new ManagedIndividual[] { 
 						ENGLISH,
 						ITALIAN,
 						SPANISH,
 						DANISH,
 						DUTCH,
 						GERMAN 		};
    }

    /**
     * Returns the rating with the given URI.
     */
    public static ManagedIndividual getIndividualByURI(String instanceURI) {
	return (instanceURI != null) ? valueOf(instanceURI) : null;
    }
    
    public static final Language valueOf(String uri) {
		if (uri == null) return null;
		else if (uri.equals(ENGLISH.getURI())) return ENGLISH;
		else if (uri.equals(ITALIAN.getURI())) return ITALIAN;
		else if (uri.equals(SPANISH.getURI())) return SPANISH;
		else if (uri.equals(DANISH.getURI())) return DANISH;
		else if (uri.equals(DUTCH.getURI())) return DUTCH;
		else if (uri.equals(GERMAN.getURI())) return GERMAN;
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
		return "Language";
    }
    
    protected Language() {
		super();
    }

    public Language(String uri) {
		super(uri);
    }

    protected Language(String uriPrefix, int numProps) {
		super(uriPrefix, numProps);
    }
		
	public boolean isWellFormed() {
		return true;
    }
    
    public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
    }
    
    
    

}
