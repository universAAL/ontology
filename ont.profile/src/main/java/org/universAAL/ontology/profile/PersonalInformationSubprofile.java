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

import org.universAAL.ontology.vcard.VCardOntology;

public class PersonalInformationSubprofile extends SubProfile{

    public static final String MY_URI=ProfileOntology.NAMESPACE+"PersonalInformationSubprofile";
    
    public static final String PROP_VCARD_VERSION=ProfileOntology.NAMESPACE+"vCardVersion";
    public static final String PROP_LAST_REVISION=ProfileOntology.NAMESPACE+"lastRevision";
    public static final String PROP_NICKNAME=ProfileOntology.NAMESPACE+"nicname";
    public static final String PROP_DISPLAY_NAME=ProfileOntology.NAMESPACE+"displayName";
    public static final String PROP_UCI_LABEL=ProfileOntology.NAMESPACE+"uciLable";
    public static final String PROP_UCI_ADDITIONAL_DATA=ProfileOntology.NAMESPACE+"uciAdditionalData";
    public static final String PROP_BIRTHPLACE=ProfileOntology.NAMESPACE+"birthplace";
    public static final String PROP_ABOUT_ME=ProfileOntology.NAMESPACE+"aboutMe";
    public static final String PROP_GENDER=ProfileOntology.NAMESPACE+"hasGender";
    //From VCard
    public static final String PROP_BDAY = VCardOntology.NAMESPACE+"bday";
    public static final String PROP_EMAIL = VCardOntology.NAMESPACE+"email";
    public static final String PROP_FN = VCardOntology.NAMESPACE+"fn";
    public static final String PROP_N = VCardOntology.NAMESPACE+"n";
    public static final String PROP_ORG = VCardOntology.NAMESPACE+"org";
    public static final String PROP_PHOTO = VCardOntology.NAMESPACE+"photo";
    public static final String PROP_TEL = VCardOntology.NAMESPACE+"tel";
    public static final String PROP_URL = VCardOntology.NAMESPACE+"url";

    protected PersonalInformationSubprofile() {
	super();
    }

    public PersonalInformationSubprofile(String uri) {
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
