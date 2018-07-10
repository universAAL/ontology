/*******************************************************************************
 * Copyright 2018 PHAM Van Cu, Tan laboratory, Japan Advanced Institute of Science and Technology (JAIST),
 *  Japan as a part of the CARESSES project (http://www.caressesrobot.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.echonet.EchonetOntology;

public class EchonetActivator implements ModuleActivator {
	 public static ModuleContext mc;

	private EchonetOntology echonetOntology = new EchonetOntology();

	public void start(ModuleContext mc) throws Exception {
		EchonetActivator.mc = mc;
		OntologyManagement.getInstance().register(mc, echonetOntology);
	}

	public void stop(ModuleContext mc) throws Exception {
		OntologyManagement.getInstance().unregister(mc, echonetOntology);
	}
}
