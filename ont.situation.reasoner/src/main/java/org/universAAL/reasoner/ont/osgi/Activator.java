/*	
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut für Graphische Datenverarbeitung 
	
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
package org.universAAL.reasoner.ont.osgi;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.uAALModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.reasoner.ont.*;

/**
 * The basic idea of the ontology is to have Situations, Queries and Rules like
 * described in the ctxt.situation.reasoner project. All of the according three
 * objects are based on a class "Persistent" that introduces the concept of a
 * class that can be saved a the file-system. The idea here is that the Reasoner
 * should be able to offer rules that are only existing at runtime, but also
 * rules that will be saved and loaded permanently. The class "ElementModel" is
 * used to support objects of a class from the the ontology that are derived
 * from Persistent. It can be used to save/load according elements and handle
 * them at runtime (add/delete/get).
 * 
 * @author amarinc
 * 
 */
public class Activator implements uAALModuleActivator {
	
	ReasoningOntology _ontontology = new ReasoningOntology();

	@Override
	public void start(ModuleContext arg0) throws Exception {
		OntologyManagement.getInstance().register(_ontontology);
	}

	@Override
	public void stop(ModuleContext arg0) throws Exception {
		OntologyManagement.getInstance().unregister(_ontontology);
	}
}
