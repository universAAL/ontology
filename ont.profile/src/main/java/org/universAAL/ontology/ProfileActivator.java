/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	Copyright 2008-2014 Forschungszentrum Informatik FZI, http://www.fzi.de
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
	
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
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.profile.ProfileOntology;
import org.universAAL.ontology.vcard.VCardOntology;

/**
 * @author Carsten Stockloew
 */
public class ProfileActivator implements ModuleActivator {

    private VCardOntology ontV = new VCardOntology();
    private ProfileOntology ontP = new ProfileOntology();

    public void start(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().register(mc, ontV);
	OntologyManagement.getInstance().register(mc, ontP);
    }

    public void stop(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().unregister(mc, ontP);
	OntologyManagement.getInstance().unregister(mc, ontV);
    }
}
