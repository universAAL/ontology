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

import org.universAAL.middleware.owl.ManagedIndividual;

public class AlertType extends ManagedIndividual {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "AlertType";

    public static final int VISUAL_ONLY = 0;
    public static final int AUDIO_ONLY = 1;
    public static final int VISUAL_AND_AUDIO = 2;

    private static final String[] names = { "visualOnly", "audioOnly",
	    "visualAndAudio" };

    public static final AlertType visualOnly = new AlertType(VISUAL_ONLY);
    public static final AlertType audioOnly = new AlertType(AUDIO_ONLY);
    public static final AlertType visualAndAudio = new AlertType(
	    VISUAL_AND_AUDIO);

    private int order;

    private AlertType(int order) {
	super(UIPreferencesProfileOntology.NAMESPACE + names[order]);
	this.order = order;
    }

    /**
     * @see org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
     *      (java.lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_OPTIONAL;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.universAAL.middleware.owl.ManagedIndividual#isWellFormed()
     */
    public boolean isWellFormed() {
	return true;
    }

    public String name() {
	return names[order];
    }

    public int ord() {
	return order;
    }

    /**
     * @return number of defined types
     */
    public static int getSize() {
	return names.length;
    }

    /** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
    public String getClassURI() {
	return MY_URI;
    }

    public static AlertType getAlertTypeByOrder(int order) {
	switch (order) {
	case VISUAL_ONLY:
	    return visualOnly;
	case AUDIO_ONLY:
	    return audioOnly;
	case VISUAL_AND_AUDIO:
	    return visualAndAudio;
	default:
	    return null;
	}
    }

    public static final AlertType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(UIPreferencesProfileOntology.NAMESPACE))
	    name = name.substring(UIPreferencesProfileOntology.NAMESPACE
		    .length());

	for (int i = VISUAL_ONLY; i <= VISUAL_AND_AUDIO; i++)
	    if (names[i].equals(name))
		return getAlertTypeByOrder(i);

	return null;
    }
}
