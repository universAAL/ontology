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
package org.universaal.ontology.disease;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universaal.ontology.ICD10CirculatorySystemDiseases.owl.AcuteRheumaticFever;
import org.universaal.ontology.ICD10CirculatorySystemDiseases.owl.HeartFailure;
import org.universaal.ontology.ICD10CirculatorySystemDiseases.owl.HypertensiveDisease;
import org.universaal.ontology.ICD10CirculatorySystemDiseases.owl.IschemicHeartDisease;
import org.universaal.ontology.ICD10CirculatorySystemDiseases.owl.OtherCirculatorySystemDisease;
import org.universaal.ontology.ICD10Diseases.owl.CertainInfectiousParasiticDisease;
import org.universaal.ontology.ICD10Diseases.owl.CirculatorySystemDisease;
import org.universaal.ontology.ICD10Diseases.owl.DigestiveSystemDisease;
import org.universaal.ontology.ICD10Diseases.owl.MentalDisorder;
import org.universaal.ontology.ICD10Diseases.owl.Neoplasms;
import org.universaal.ontology.ICD10Diseases.owl.NervousSystemDisease;
import org.universaal.ontology.ICD10Diseases.owl.RespiratorySystemDisease;
import org.universaal.ontology.disease.owl.Diagnostic;
import org.universaal.ontology.disease.owl.Disease;
import org.universaal.ontology.disease.owl.Epidemiology;
import org.universaal.ontology.disease.owl.Etiology;
import org.universaal.ontology.disease.owl.Patogeny;
import org.universaal.ontology.disease.owl.Pronostic;
import org.universaal.ontology.disease.owl.Sympthom;

public class DiseaseFactory extends ResourceFactoryImpl {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new Disease(instanceURI);
	case 1:
	    return new Epidemiology(instanceURI);
	case 2:
	    return new Etiology(instanceURI);
	case 3:
	    return new Patogeny(instanceURI);
	case 4:
	    return new Sympthom(instanceURI);
	case 5:
	    return new Pronostic(instanceURI);
	case 6:
	    return new Diagnostic(instanceURI);
	case 7:
	    return new CertainInfectiousParasiticDisease(instanceURI);
	case 8:
	    return new CirculatorySystemDisease(instanceURI);
	case 9:
	    return new DigestiveSystemDisease(instanceURI);
	case 10:
	    return new MentalDisorder(instanceURI);
	case 11:
	    return new Neoplasms(instanceURI);
	case 12:
	    return new NervousSystemDisease(instanceURI);
	case 13:
	    return new RespiratorySystemDisease(instanceURI);
	case 14:
	    return new AcuteRheumaticFever(instanceURI);
	case 15:
	    return new HeartFailure(instanceURI);
	case 16:
	    return new HypertensiveDisease(instanceURI);
	case 17:
	    return new IschemicHeartDisease(instanceURI);
	case 18:
	    return new OtherCirculatorySystemDisease(instanceURI);

	}

	return null;
    }
}
