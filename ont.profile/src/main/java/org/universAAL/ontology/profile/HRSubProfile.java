/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	
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


public class HRSubProfile extends SubProfile {

    public static final String MY_URI = ProfileOntology.NAMESPACE
	    + "HRSubProfile";

    public static final String PROP_HR_CONTACT = ProfileOntology.NAMESPACE
	    + "hasHRContact";
    public static final String PROP_HR_DESCRIPTION = ProfileOntology.NAMESPACE
	    + "hasHRDescription";
    public static final String PROP_HR_EXPERIENCE = ProfileOntology.NAMESPACE
	    + "hasHRExperience";
    public static final String PROP_HR_INVOLVEMENT = ProfileOntology.NAMESPACE
	    + "hasHRInvolvement";
    public static final String PROP_HR_QUALIFICATION = ProfileOntology.NAMESPACE
	    + "hasHRQualificaton";
    public static final String PROP_HR_TYPE = ProfileOntology.NAMESPACE
	    + "hasHRType";
    public static final String PROP_HR_CERTIFICATES = ProfileOntology.NAMESPACE
	    + "hasHRCertificates";
    public static final String PROP_HR_PAYMENT_INFO = ProfileOntology.NAMESPACE
	    + "hasHRPaymentInfo";
    public static final String PROP_HR_PROVIDER_USER_ID = ProfileOntology.NAMESPACE
	    + "hasHRProviderUserID";
    public static final String PROP_HR_SLA = ProfileOntology.NAMESPACE
	    + "hasHRSLA";
    public static final String PROP_HR_PROPERTIES = ProfileOntology.NAMESPACE
	    + "hasHRProperties";
    public static final String PROP_HR_RELATED_USERS = ProfileOntology.NAMESPACE
	    + "hasHRRelatedUsers";
    
    protected HRSubProfile() {
	super();
    }

    public HRSubProfile(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public boolean isWellFormed() {
	return true;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

}
