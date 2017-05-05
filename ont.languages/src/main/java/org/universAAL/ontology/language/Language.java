/*******************************************************************************
 * Copyright 2013 Universidad Politécnica de Madrid
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.language;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * @author amedrano
 * @author eandgrg
 * 
 */
public abstract class Language extends ManagedIndividual {
    public static final String MY_URI = LanguageOntology.NAMESPACE + "Language";
    public static final String PROP_ENGLISH_LABEL = LanguageOntology.NAMESPACE
	    + "englishLabel";
    public static final String PROP_ISO639CODE = LanguageOntology.NAMESPACE
	    + "iso639code";
    public static final String PROP_NATIVE_LABEL = LanguageOntology.NAMESPACE
	    + "nativeLabel";

    public Language() {
	super();
    }

    public Language(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_FULL;
    }

    public boolean isWellFormed() {
	return true && hasProperty(PROP_ENGLISH_LABEL)
		&& hasProperty(PROP_ISO639CODE)
		&& hasProperty(PROP_NATIVE_LABEL);
    }

    public String getEnglishLabel() {
	return (String) getProperty(PROP_ENGLISH_LABEL);
    }

    public void setEnglishLabel(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_ENGLISH_LABEL, newPropValue);
    }

    public String getNativeLabel() {
	return (String) getProperty(PROP_NATIVE_LABEL);
    }

    public void setNativeLabel(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_NATIVE_LABEL, newPropValue);
    }

    public String getIso639code() {
	return (String) getProperty(PROP_ISO639CODE);
    }

    public void setIso639code(String newPropValue) {
	if (newPropValue != null)
	    changeProperty(PROP_ISO639CODE, newPropValue);
    }
}
