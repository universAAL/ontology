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

import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universaal.ontology.disease.owl.DiseaseOntology;

public class DeseaseActivator implements ModuleActivator {

	static ModuleContext context = null;
	DiseaseOntology ontology = new DiseaseOntology();

	public void start(ModuleContext arg0) throws Exception {
		context = arg0;
		OntologyManagement.getInstance().register(ontology);

	}

	public void stop(ModuleContext arg0) throws Exception {
		OntologyManagement.getInstance().unregister(ontology);

	}
}	
