/*******************************************************************************
 * Copyright 2012 Universidad Politécnica de Madrid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.ICD10CirculatorySystemDiseases.owl;

import org.universAAL.ontology.ICD10Diseases.owl.CirculatorySystemDisease;
import org.universAAL.ontology.disease.owl.DiseaseOntology;

public class AcuteRheumaticFever extends CirculatorySystemDisease {

	public static final String MY_URI = DiseaseOntology.NAMESPACE + "AcuteRheumaticFever";

	public AcuteRheumaticFever() {
		super();
	}

	public AcuteRheumaticFever(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}

	public boolean isWellFormed() {
		return true;
	}

}
