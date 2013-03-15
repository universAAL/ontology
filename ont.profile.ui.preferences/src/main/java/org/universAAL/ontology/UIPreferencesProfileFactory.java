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

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universAAL.ontology.ui.preferences.AccessMode;
import org.universAAL.ontology.ui.preferences.AlertPreferences;
import org.universAAL.ontology.ui.preferences.AuditoryPreferences;
import org.universAAL.ontology.ui.preferences.GeneralInteractionPreferences;
import org.universAAL.ontology.ui.preferences.SystemMenuPreferences;
import org.universAAL.ontology.ui.preferences.UIPreferencesProfile;
import org.universAAL.ontology.ui.preferences.VisualPreferences;
import org.universAAL.ontology.ui.preferences.service.UIPreferencesService;

/**
 * @author eandgrg
 * 
 */
public class UIPreferencesProfileFactory extends ResourceFactoryImpl {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {

	switch (factoryIndex) {
	case 0:
	    return new VisualPreferences(instanceURI);
	case 1:
	    return new SystemMenuPreferences(instanceURI);
	case 2:
	    return new AccessMode(instanceURI);
	case 3:
	    return new AlertPreferences(instanceURI);
	case 4:
	    return new GeneralInteractionPreferences(instanceURI);
	case 5:
	    return new AuditoryPreferences(instanceURI);
	case 6:
	    return new UIPreferencesProfile(instanceURI);
	case 7:
	    return new UIPreferencesService(instanceURI);

	}
	return null;
    }
}
