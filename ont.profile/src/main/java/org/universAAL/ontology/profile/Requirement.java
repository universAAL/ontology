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

public class Requirement extends ManagedIndividual {

	public static final String MY_URI = ProfileOntology.NAMESPACE + "Requirement";

	public static final String PROP_ALL_VALUES_MATCH = ProfileOntology.NAMESPACE + "allValuesMatch";
	public static final String PROP_FRAGMENT = ProfileOntology.NAMESPACE + "isFragment";
	public static final String PROP_INCOMPATIBLE = ProfileOntology.NAMESPACE + "isIncompatible";
	public static final String PROP_MULTIPLE_SOLUTIONS_USEFUL = ProfileOntology.NAMESPACE + "multipleSolutionsUseful";
	public static final String PROP_REQ_NAME = ProfileOntology.NAMESPACE + "hasReqName";
	public static final String PROP_OPTIONAL = ProfileOntology.NAMESPACE + "isOptional";
	public static final String PROP_REQ_VALUES = ProfileOntology.NAMESPACE + "hasReqValues";

	protected Requirement() {
		super();
	}

	public Requirement(String uri) {
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
