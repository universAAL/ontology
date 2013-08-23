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
package org.universAAL.ontology.ui.preferences;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.ui.owl.Preference;

public class AlertPreferences extends Preference {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "AlertPreferences";
    public static final String PROP_ALERT_OPTION = UIPreferencesProfileOntology.NAMESPACE
	    + "alertOption";

    public AlertPreferences() {
	super();
    }

    public AlertPreferences(String uri) {
	super(uri);
    }

    /** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
    public String getClassURI() {
	return MY_URI;
    }

    /**
     * @see org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
     *      (java.lang.String)
     */
    public int getPropSerializationType(String arg0) {
	return Resource.PROP_SERIALIZATION_FULL;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.universAAL.middleware.owl.ManagedIndividual#isWellFormed()
     */
    public boolean isWellFormed() {
	return true && hasProperty(PROP_ALERT_OPTION);
    }

    public AlertType getAlertOption() {
	return (AlertType) getProperty(PROP_ALERT_OPTION);
    }

    public void setAlertOption(AlertType newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_ALERT_OPTION, newPropValue);
    }
}
