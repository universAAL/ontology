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

public class AccessMode extends Preference {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "AccessMode";
    public static final String PROP_OLFACTORY_MODE_STATUS = UIPreferencesProfileOntology.NAMESPACE
	    + "olfactoryModeStatus";
    public static final String PROP_AUDITORY_MODE_STATUS = UIPreferencesProfileOntology.NAMESPACE
	    + "auditoryModeStatus";
    public static final String PROP_VISUAL_MODE_STATUS = UIPreferencesProfileOntology.NAMESPACE
	    + "visualModeStatus";
    public static final String PROP_TEXTUAL_MODE_STATUS = UIPreferencesProfileOntology.NAMESPACE
	    + "textualModeStatus";
    public static final String PROP_TACTILE_MODE_STATUS = UIPreferencesProfileOntology.NAMESPACE
	    + "tactileModeStatus";

    public AccessMode() {
	super();
    }

    public AccessMode(String uri) {
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
	return true && hasProperty(PROP_OLFACTORY_MODE_STATUS)
		&& hasProperty(PROP_AUDITORY_MODE_STATUS)
		&& hasProperty(PROP_VISUAL_MODE_STATUS)
		&& hasProperty(PROP_TEXTUAL_MODE_STATUS)
		&& hasProperty(PROP_TACTILE_MODE_STATUS);
    }

    public Status getVisualModeStatus() {
	return (Status) getProperty(PROP_VISUAL_MODE_STATUS);
    }

    public void setVisualModeStatus(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_VISUAL_MODE_STATUS, newPropValue);
    }

    public Status getAuditoryModeStatus() {
	return (Status) getProperty(PROP_AUDITORY_MODE_STATUS);
    }

    public void setAuditoryModeStatus(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_AUDITORY_MODE_STATUS, newPropValue);
    }

    public Status getTactileModeStatus() {
	return (Status) getProperty(PROP_TACTILE_MODE_STATUS);
    }

    public void setTactileModeStatus(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_TACTILE_MODE_STATUS, newPropValue);
    }

    public Status getOlfactoryModeStatus() {
	return (Status) getProperty(PROP_OLFACTORY_MODE_STATUS);
    }

    public void setOlfactoryModeStatus(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_OLFACTORY_MODE_STATUS, newPropValue);
    }

    public Status getTextualModeStatus() {
	return (Status) getProperty(PROP_TEXTUAL_MODE_STATUS);
    }

    public void setTextualModeStatus(Status newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_TEXTUAL_MODE_STATUS, newPropValue);
    }
}
