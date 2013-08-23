/*******************************************************************************
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 *	
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *	
 * http://www.apache.org/licenses/LICENSE-2.0
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.ui.preferences.service;

import org.universAAL.middleware.service.owl.Service;
import org.universAAL.ontology.ui.preferences.UIPreferencesProfileOntology;

/**
 * Ontological generic service that handles UI preferences subProfile-related
 * information. Methods included in this class are the mandatory ones for
 * representing an ontological service in Java classes for universAAL.
 * 
 * @author eandgrg
 */
public class UIPreferencesService extends Service {

    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "UIPreferencesService";

    public static final String PROP_CONTROLS = UIPreferencesProfileOntology.NAMESPACE
	    + "controls";

    public UIPreferencesService(String uri) {
	super(uri);
    }

    public UIPreferencesService() {
	super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI()
     */
    public String getClassURI() {
	return MY_URI;
    }

    /**
     * @see org.universAAL.middleware.service.owl.Service#getPropSerializationType
     *      (java.lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    /**
     * @see org.universAAL.middleware.owl.ManagedIndividual#isWellFormed()
     */
    public boolean isWellFormed() {
	return true;
    }
}
