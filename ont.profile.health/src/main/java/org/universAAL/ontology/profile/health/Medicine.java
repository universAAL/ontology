/*
	Copyright 2008-2010 SPIRIT, http://www.spirit-intl.com/
	SPIRIT S.A. E-BUSINESS AND COMMUNICATIONS ENGINEERING 
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package org.universAAL.ontology.profile.health;

import org.universAAL.middleware.owl.ManagedIndividual;

/**
 * Ontological representation of a medicine. Methods included in this class are
 * the mandatory ones for representing an ontological concept in Java classes
 * for uAAL. Usually it includes getters and setters for most of its properties.
 * 
 * @author
 * @author Carsten Stockloew
 */
public class Medicine extends ManagedIndividual {

    public static final String MY_URI;
    public static final String PROP_S_NAME;
    public static final String PROP_S_QUANTITY;

    static {
	MY_URI = HealthProfileOntology.NAMESPACE + "sMedicine";
	PROP_S_NAME = HealthProfileOntology.NAMESPACE + "mName";
	PROP_S_QUANTITY = HealthProfileOntology.NAMESPACE + "mQuantity";
    }

    public void setProperty(String propURI, Object o) {
	if (PROP_S_NAME.equals(propURI) && o instanceof String)
	    setName((String) o);
	else if (PROP_S_QUANTITY.equals(propURI) && o instanceof Integer)
	    setQuantity((Integer) o);
	super.setProperty(propURI, o);
    }

    public Medicine() {
	super();
    }

    public Medicine(String uri) {
	super(uri);
    }

    public Medicine(String uri, String mName, Integer mQuantity) {
	super(uri);
	if ((mName == null) || (mQuantity == null))
	    throw new IllegalArgumentException();

	props.put(PROP_S_NAME, mName);
	props.put(PROP_S_QUANTITY, mQuantity);
    }

    /** @see org.universAAL.middleware.owl.ManagedIndividual#getClassURI() */
    public String getClassURI() {
	return MY_URI;
    }

    public String getName() {
	Object o = props.get(PROP_S_NAME);
	return (o == null) ? "" : (String) o;
    }

    public void setName(String mName) {
	props.put(PROP_S_NAME, new String(mName));
    }

    public Integer getQuantity() {
	Integer i = (Integer) props.get(PROP_S_QUANTITY);
	if (i == null)
	    return new Integer(-1);
	return i;
    }

    public void setQuantity(Integer mQuantity) {
	props.put(PROP_S_QUANTITY, mQuantity);
    }

    /**
     * @see org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType(java.
     *      lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_FULL;
    }

    /**
     * @see org.universAAL.middleware.owl.ManagedIndividual#isWellFormed()
     */
    public boolean isWellFormed() {
	return props.containsKey(PROP_S_NAME)
		&& props.containsKey(PROP_S_QUANTITY);
    }
}
