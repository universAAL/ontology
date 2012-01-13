
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
 
package org.universAAL.ontology.profilable;

import org.universAAL.middleware.owl.*;
import org.universAAL.ontology.profile.AssistedPersonProfile;

/**
 * This class represents an ontological concept.
 * <br> <br> 
 * 
 * <br> <br> 
 * This class was generated at $now by velocity.
 */

public class AssistedPerson extends User {

	/** Class URI */
	public static final String MY_URI = "http://ontology.universAAL.org/Profile.owl#ElderlyUser";
	
	
	static {
		register(AssistedPerson.class);
    }
    
    public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_HAS_PROFILE.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI,
				 AssistedPersonProfile.MY_URI, 1, 0);//This is because of ProfilableEntity
		return User.getClassRestrictionsOnProperty(propURI);
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
		return "AssistedPerson";
    }
    
    protected AssistedPerson() {
		super();
    }

    public AssistedPerson(String uri) {
		super(uri);
    }

    protected AssistedPerson(String uriPrefix, int numProps) {
		super(uriPrefix, numProps);
    }
		
	public boolean isWellFormed() {
		return true;
    }
    
    public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
    }
    
    public void setElderlyProfile(AssistedPersonProfile value) {
	    super.setProperty(PROP_HAS_PROFILE , value);
    }
    
    public AssistedPersonProfile getElderlyProfile() {
    	return (AssistedPersonProfile) props.get(PROP_HAS_PROFILE );
    }
    
    
    

}
