/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * Licensed under both Apache License, Version 2.0 and MIT License .
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.ui.preferences.UIPreferencesProfileOntology;

/**
 * @author eandgrg
 * 
 */
public class UIPreferencesProfileActivator implements ModuleActivator {

    public static ModuleContext context;

    UIPreferencesProfileOntology uipreferencesontology = new UIPreferencesProfileOntology();

    public void start(ModuleContext context) throws Exception {
	UIPreferencesProfileActivator.context = context;
	OntologyManagement.getInstance().register(uipreferencesontology);

    }

    public void stop(ModuleContext arg0) throws Exception {

	OntologyManagement.getInstance().unregister(uipreferencesontology);

    }

}
