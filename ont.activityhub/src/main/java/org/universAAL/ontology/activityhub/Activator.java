/*
     Copyright 2010-2014 AIT Austrian Institute of Technology GmbH
	 http://www.ait.ac.at
     
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

package org.universAAL.ontology.activityhub;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.ActivityHubOntology;

/**
 * Bundle activator.
 * Registers the ActivityHub Ontology in the universAAL ontology manager.
 *
 * @author Thomas Fuxreiter
 */
public class Activator implements ModuleActivator {

	ActivityHubOntology activityHubOntology = new ActivityHubOntology();
	
	public void start(ModuleContext mc) throws Exception {
		OntologyManagement.getInstance().register(mc, activityHubOntology);		
	}

	public void stop(ModuleContext mc) throws Exception {
		OntologyManagement.getInstance().unregister(mc, activityHubOntology);
	}

}
