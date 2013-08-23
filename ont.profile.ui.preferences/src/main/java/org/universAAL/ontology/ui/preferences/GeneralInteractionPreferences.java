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
import org.universAAL.middleware.ui.owl.Modality;
import org.universAAL.middleware.ui.owl.Preference;
import org.universAAL.ontology.language.Language;

public class GeneralInteractionPreferences extends Preference {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "GeneralInteractionPreferences";
    public static final String PROP_SECONDARY_LANGUAGE = UIPreferencesProfileOntology.NAMESPACE
	    + "secondaryLanguage";
    public static final String PROP_PREFERRED_MODALITY = UIPreferencesProfileOntology.NAMESPACE
	    + "preferredModality";
    public static final String PROP_CONTENT_DENSITY = UIPreferencesProfileOntology.NAMESPACE
	    + "contentDensity";
    public static final String PROP_SECONDARY_MODALITY = UIPreferencesProfileOntology.NAMESPACE
	    + "secondaryModality";
    public static final String PROP_PREFERRED_LANGUAGE = UIPreferencesProfileOntology.NAMESPACE
	    + "preferredLanguage";

    public GeneralInteractionPreferences() {
	super();
    }

    public GeneralInteractionPreferences(String uri) {
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
	return true && hasProperty(PROP_SECONDARY_LANGUAGE)
		&& hasProperty(PROP_PREFERRED_MODALITY)
		&& hasProperty(PROP_CONTENT_DENSITY)
		&& hasProperty(PROP_SECONDARY_MODALITY)
		&& hasProperty(PROP_PREFERRED_LANGUAGE);
    }

    public Modality getPreferredModality() {
	return (Modality) getProperty(PROP_PREFERRED_MODALITY);
    }

    public void setPreferredModality(Modality newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_PREFERRED_MODALITY, newPropValue);
    }

    public Modality getSecondaryModality() {
	return (Modality) getProperty(PROP_SECONDARY_MODALITY);
    }

    public void setSecondaryModality(Modality newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SECONDARY_MODALITY, newPropValue);
    }

    public Language getPreferredLanguage() {
	return (Language) getProperty(PROP_PREFERRED_LANGUAGE);
    }

    public void setPreferredLanguage(Language newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_PREFERRED_LANGUAGE, newPropValue);
    }

    public Language getSecondaryLanguage() {
	return (Language) getProperty(PROP_SECONDARY_LANGUAGE);
    }

    public void setSecondaryLanguage(Language newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_SECONDARY_LANGUAGE, newPropValue);
    }

    public ContentDensityType getContentDensity() {
	return (ContentDensityType) getProperty(PROP_CONTENT_DENSITY);
    }

    public void setContentDensity(ContentDensityType newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_CONTENT_DENSITY, newPropValue);
    }
}
