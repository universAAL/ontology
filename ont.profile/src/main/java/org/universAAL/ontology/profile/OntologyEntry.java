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

import org.universAAL.middleware.owl.ManagedIndividual;

public class OntologyEntry extends ManagedIndividual {

	public static final String MY_URI = ProfileOntology.NAMESPACE + "OntologyEntry";
	public static final String PROP_NAMESPACE = ProfileOntology.NAMESPACE + "hasNamespace";
	public static final String PROP_ONTOLOGY_URI = ProfileOntology.NAMESPACE + "hasOntologyURI";
	public static final String PROP_VERSION = ProfileOntology.NAMESPACE + "hasOntVersion";

	protected OntologyEntry() {
		super();
	}

	public OntologyEntry(String uri) {
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