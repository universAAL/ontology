/*
    Copyright 2007-2014 TSB, http://www.tsbtecnologias.es
    Technologies for Health and Well-being - Valencia, Spain

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
import org.universAAL.ontology.personalhealthdevice.PersonalHealthDeviceOntology;

/**
 * OSGi bundle activator. Registers the PersonalHealthDevice Ontology in the
 * universAAL ontology manager.
 * 
 * @author Thomas Fuxreiter (foex@gmx.at)
 */
public class PersonalHealthDeviceActivator implements ModuleActivator {

    PersonalHealthDeviceOntology personalHealthDeviceOntology = new PersonalHealthDeviceOntology();

    public void start(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().register(mc,
		personalHealthDeviceOntology);
    }

    public void stop(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().unregister(mc,
		personalHealthDeviceOntology);
    }
}
