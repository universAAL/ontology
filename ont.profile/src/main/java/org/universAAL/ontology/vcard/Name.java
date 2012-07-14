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
package org.universAAL.ontology.vcard;

import org.universAAL.middleware.owl.ManagedIndividual;

public class Name extends ManagedIndividual{
    public static final String MY_URI = VCardOntology.NAMESPACE + "Name";
    public static final String PROP_ADDITIONAL_NAME =  VCardOntology.NAMESPACE+"additional-name";
    public static final String PROP_FAMILY_NAME =  VCardOntology.NAMESPACE+"family-name";
    public static final String PROP_GIVEN_NAME =  VCardOntology.NAMESPACE+"given-name";
    public static final String PROP_HONORIFIC_PREFIX =  VCardOntology.NAMESPACE+"honorific-prefix";
    public static final String PROP_HONORIFIC_SUFFIX =  VCardOntology.NAMESPACE+"honorific-suffix";
    
    public Name() {
	super();
    }

    public Name(String uri) {
	super(uri);
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true;
    }
}
