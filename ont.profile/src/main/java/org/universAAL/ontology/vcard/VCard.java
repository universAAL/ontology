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

public class VCard extends ManagedIndividual {
	public static final String MY_URI = VCardOntology.NAMESPACE + "VCard";
	public static final String PROP_BDAY = VCardOntology.NAMESPACE + "bday";
	public static final String PROP_EMAIL = VCardOntology.NAMESPACE + "email";
	public static final String PROP_FN = VCardOntology.NAMESPACE + "fn";
	public static final String PROP_N = VCardOntology.NAMESPACE + "n";
	public static final String PROP_ORG = VCardOntology.NAMESPACE + "org";
	public static final String PROP_PHOTO = VCardOntology.NAMESPACE + "photo";
	public static final String PROP_TEL = VCardOntology.NAMESPACE + "tel";
	public static final String PROP_URL = VCardOntology.NAMESPACE + "url";

	public VCard() {
		super();
	}

	public VCard(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true;
	}
}
