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

package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.container.utils.LogUtils;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.X73.X73Ontology;

public class X73Activator implements ModuleActivator {

    X73Ontology x73ontology = new X73Ontology();

    public void start(ModuleContext mc) throws Exception {

	// LogUtils.logError(context, X73Activator.class, "start",
	// new Object[] {"***FUXI***: Ontologies before X73.ont registering"},
	// null);
	// String[] ontsa = OntologyManagement.getInstance().getOntoloyURIs();
	// for (int i = 0; i < ontsa.length; i++)
	// System.out.println("***Onts before***:" + ontsa[i]);
	// LogUtils.logError(context, X73Activator.class, "start",
	// ontsa
	// , null);

	OntologyManagement.getInstance().register(mc, x73ontology);

	// LogUtils.logError(context, X73Activator.class, "start",
	// new Object[] {"***FUXI***: Ontologies after X73.ont registering"}
	// , null);
	// String[] ontsb = OntologyManagement.getInstance().getOntoloyURIs();
	// LogUtils.logError(context, X73Activator.class, "start",
	// ontsb
	// , null);
    }

    public void stop(ModuleContext mc) throws Exception {
	// LogUtils.logError(context, X73Activator.class, "start",
	// new Object[] {"***FUXI***: X73.ont stopping..."}
	// , null);
	OntologyManagement.getInstance().unregister(mc, x73ontology);
    }
}