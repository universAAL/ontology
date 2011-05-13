/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung 
	
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

package org.universAAL.ontology.powersocket;

import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.owl.supply.AbsLocation;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.OrderingRestriction;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.phThing.Device;

/**
 * Ontological representation of a power socket. Methods included in this class
 * are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author Steeven Zeiss
 * @since 26.11.2009
 * 
 */
public class Powersocket extends Device {
    public static final String POWERSOCKET_NAMESPACE = "http://ontology.persona.ima.igd.fhg.de/Powersocket.owl#";
    public static final String MY_URI;
    public static final String PROP_SOCKET_VALUE;
    public static final String PROP_SOCKET_LOCATION;
    static {
	MY_URI = POWERSOCKET_NAMESPACE + "Powersocket";
	PROP_SOCKET_VALUE = POWERSOCKET_NAMESPACE + "socketValue";
	PROP_SOCKET_LOCATION = POWERSOCKET_NAMESPACE + "socketLocation";
	register(Powersocket.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_SOCKET_VALUE.equals(propURI))
	    return OrderingRestriction.newOrderingRestriction(new Integer(100),
		    new Integer(0), true, true, Restriction
			    .getAllValuesRestrictionWithCardinality(propURI,
				    TypeMapper.getDatatypeURI(Integer.class),
				    1, 1));
	if (PROP_SOCKET_LOCATION.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    AbsLocation.MY_URI, 1, 1);
	return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	return new String[] { PROP_SOCKET_VALUE, PROP_SOCKET_LOCATION };
    }

    public static String getRDFSComment() {
	return "The class of all powersockets.";
    }

    public static String getRDFSLabel() {
	return "Powersocket";
    }

    public Powersocket() {
	super();
    }

    public Powersocket(String uri) {
	super(uri);
    }

    public Powersocket(String uri, AbsLocation loc) {
	super(uri);
	if (loc == null)
	    throw new IllegalArgumentException();

	props.put(PROP_SOCKET_VALUE, new Integer(0));
	props.put(PROP_SOCKET_LOCATION, loc);
    }

    public int getValue() {
	Integer i = (Integer) props.get(PROP_SOCKET_VALUE);
	return (i == null) ? -1 : i.intValue();
    }

    public AbsLocation getPowersocketLocation() {
	return (AbsLocation) props.get(PROP_SOCKET_LOCATION);
    }

    public void setValue(int percentage) {
	if (percentage > -1 && percentage < 101)
	    props.put(PROP_SOCKET_VALUE, new Integer(percentage));
    }

    public void setPowersocketLocation(AbsLocation l) {
	// TODO: kann man das so machen?
	// setLocation(l);
	if (l != null)
	    props.put(PROP_SOCKET_LOCATION, l);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.universAAL.middleware.owl.ManagedIndividual#getPropSerializationType
     * (java.lang.String)
     */
    public int getPropSerializationType(String propURI) {
	return PROP_SOCKET_LOCATION.equals(propURI) ? PROP_SERIALIZATION_REDUCED
		: PROP_SERIALIZATION_FULL;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.universAAL.middleware.owl.ManagedIndividual#isWellFormed()
     */
    public boolean isWellFormed() {
	return props.containsKey(PROP_SOCKET_VALUE)
		&& props.containsKey(PROP_SOCKET_LOCATION);
    }

}
