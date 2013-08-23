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

public class PendingDialogsBuilderType extends ManagedIndividual {
    public static final String MY_URI = UIPreferencesProfileOntology.NAMESPACE
	    + "PendingDialogsBuilderType";

    public static final int TABLE = 0;
    public static final int BUTTONS = 1;

    private static final String[] names = { "table", "buttons" };

    public static final PendingDialogsBuilderType table = new PendingDialogsBuilderType(
	    TABLE);
    public static final PendingDialogsBuilderType buttons = new PendingDialogsBuilderType(
	    BUTTONS);

    private int order;

    private PendingDialogsBuilderType(int order) {
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

    public static PendingDialogsBuilderType getPendingDialogsBuilderTypeByOrder(
	    int order) {
	switch (order) {
	case TABLE:
	    return table;
	case BUTTONS:
	    return buttons;
	default:
	    return null;
	}
    }

    public static final PendingDialogsBuilderType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(UIPreferencesProfileOntology.NAMESPACE))
	    name = name.substring(UIPreferencesProfileOntology.NAMESPACE
		    .length());

	for (int i = TABLE; i <= BUTTONS; i++)
	    if (names[i].equals(name))
		return getPendingDialogsBuilderTypeByOrder(i);

	return null;
    }
}
