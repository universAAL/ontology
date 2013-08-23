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

public class MainMenuConfigurationType extends ManagedIndividual {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "MainMenuConfigurationType";

    public static final int CLASSIC = 0;
    public static final int SMART = 1;

    public static final int TASK_BAR = 2;

    private static final String[] names = { "classic", "smart", "taskBar" };

    public static final MainMenuConfigurationType classic = new MainMenuConfigurationType(
	    CLASSIC);
    public static final MainMenuConfigurationType smart = new MainMenuConfigurationType(
	    SMART);
    public static final MainMenuConfigurationType taskBar = new MainMenuConfigurationType(
	    TASK_BAR);

    private int order;

    private MainMenuConfigurationType(int order) {
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
     * @return number of defined configuration types
     */
    public static int getSize() {
	return names.length;
    }

    /** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
    public String getClassURI() {
	return MY_URI;
    }

    public static MainMenuConfigurationType getMainMenuConfigurationTypeByOrder(
	    int order) {
	switch (order) {
	case CLASSIC:
	    return classic;
	case SMART:
	    return smart;
	case TASK_BAR:
	    return taskBar;
	default:
	    return null;
	}
    }

    public static final MainMenuConfigurationType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(UIPreferencesProfileOntology.NAMESPACE))
	    name = name.substring(UIPreferencesProfileOntology.NAMESPACE
		    .length());

	for (int i = CLASSIC; i <= TASK_BAR; i++)
	    if (names[i].equals(name))
		return getMainMenuConfigurationTypeByOrder(i);

	return null;
    }
}
