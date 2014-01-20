package org.universAAL.ontology;

/**Copyright [2011-2012] [University of Siegen, Embedded System Instiute]

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

 * @author <a href="mailto:abu.sadat@uni-siegen.de">Rubaiyat Sadat</a>
 *	       ©2012
 */

/**
 * The activator class for Dependability Ontology
 */
import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.dependability.*;

public class DependabilityActivator implements ModuleActivator {

    static ModuleContext context = null;

    DependabilityOntology _dependabilityontology = new DependabilityOntology();

    public void start(ModuleContext mc) throws Exception {
	DependabilityActivator.context = mc;
	OntologyManagement.getInstance().register(mc, _dependabilityontology);
    }

    public void stop(ModuleContext mc) throws Exception {
	OntologyManagement.getInstance().unregister(mc, _dependabilityontology);
    }
}
