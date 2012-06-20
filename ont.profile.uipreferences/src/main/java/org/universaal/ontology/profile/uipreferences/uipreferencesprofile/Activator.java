/*******************************************************************************
 * Copyright 2011 Ericsson Nikola Tesla d.d.
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
package org.universaal.ontology.profile.uipreferences.uipreferencesprofile;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.uAALModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universaal.ontology.profile.uipreferences.uipreferencesprofile.owl.UIPreferencesProfileOntology;

/**
 * @author eandgrg
 *
 */
public class Activator implements uAALModuleActivator {

  UIPreferencesProfileOntology ontology = new UIPreferencesProfileOntology();

  /* (non-Javadoc)
 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
 */
public void start(ModuleContext context) throws Exception {
    OntologyManagement.getInstance().register(ontology);
  }

  /* (non-Javadoc)
 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
 */
public void stop(ModuleContext arg0) throws Exception {
    OntologyManagement.getInstance().unregister(ontology);
  }
}	
