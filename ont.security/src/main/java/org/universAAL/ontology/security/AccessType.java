/*******************************************************************************
 * Copyright 2015 UPM - Universidad Politécnica de Madrid
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.security;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * The different Access types for {@link AccessRight}s.
 * @author amedrano
 */
public class AccessType extends ManagedIndividual {
    public static final String MY_URI = SecurityOntology.NAMESPACE + "AccessType";

    public static final int READ = 0;
    public static final int CHANGE = 1;
    public static final int ADD = 2;
    public static final int REMOVE = 3;


    private static final String[] names = { "Read", 
	    "Change","Add","Remove" };

    /**
     * Read Only Access.
     */
    public static final AccessType read = new AccessType(READ);
    
    /**
     * Change Access.
     */
    public static final AccessType change = new AccessType(CHANGE);
    
    /**
     * Add Access.
     */
    public static final AccessType add = new AccessType(ADD);
    
    /**
     * Remove, Delete Access.
     */
    public static final AccessType remove = new AccessType(REMOVE);

    private int order;

    private AccessType(int order) {
	super(SecurityOntology.NAMESPACE + names[order]);
	this.order = order;
    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_OPTIONAL;
    }

    public boolean isWellFormed() {
	return true;
    }

    public String name() {
	return names[order];
    }

    public int ord() {
	return order;
    }

    public String getClassURI() {
	return MY_URI;
    }

    public static AccessType getAccessTypeByOrder(int order) {
	switch (order) {
	case READ:
	    return read;
	case CHANGE:
	    return change;
	case ADD:
		return add;
	case REMOVE:
		return remove;
	default:
	    return null;
	}
    }

    public static final AccessType valueOf(String name) {
	if (name == null)
	    return null;

	if (name.startsWith(SecurityOntology.NAMESPACE))
	    name = name.substring(SecurityOntology.NAMESPACE.length());

	for (int i = 0; i <= 3; i++)
	    if (names[i].equals(name))
		return getAccessTypeByOrder(i);

	return null;
    }
}