/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute for Computer Graphics Research
	
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
package org.universAAL.ontology.location.position;

import java.util.Vector;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.location.LocationOntology;

/**
 * Ontological representation of a geometric location coordinates system.
 * Methods included in this class are the mandatory ones for representing an
 * ontological concept in Java classes for uAAL. Usually it includes getters and
 * setters for most of its properties.
 * 
 */
public class CoordinateSystem extends ManagedIndividual {

    public static final String MY_URI = LocationOntology.NAMESPACE
	    + "CoordinateSystem";

    // private static final String[] names = {
    // "WGS84","Metric","Pixel"
    // };

    public static final CoordinateSystem WGS84 = new CoordinateSystem(
	    LocationOntology.NAMESPACE + "WGS84");

    /**
     * Creates a CoordinateSystem object
     * 
     * @param uri
     *            the object URI
     */
    public CoordinateSystem(String uri) {
	super(uri);
    }

    /**
     * Creates a CoordinateSystem object
     */
    public CoordinateSystem() {
	super();
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String arg0) {
	return PROP_SERIALIZATION_OPTIONAL;
    }

    /**
     * returns the common parent system, if possible
     * 
     * @param s1
     * @param s2
     * @return the common parent system or null
     */
    public static CoordinateSystem findCommonParentSystem(CoordinateSystem a,
	    CoordinateSystem b) {
	CoordinateSystem s1 = a, s2 = b;
	if (s1 == s2)
	    return s1;
	Vector seen = new Vector();
	seen.add(s1);
	seen.add(s2);
	boolean breaker = false;
	while (!breaker) {
	    breaker = true;
	    if (s1.getClass() == OriginedMetric.class
		    && ((OriginedMetric) s1).getOrigin() != null) {
		breaker = false;
		s1 = ((OriginedMetric) s1).getOrigin().getCoordinateSystem();
		if (seen.contains(s1))
		    return s1;
		else
		    seen.add(s1);
	    }
	    if (s2.getClass() == OriginedMetric.class
		    && ((OriginedMetric) s2).getOrigin() != null) {
		breaker = false;
		s2 = ((OriginedMetric) s2).getOrigin().getCoordinateSystem();
		if (seen.contains(s2))
		    return s2;
		else
		    seen.add(s2);
	    }
	}
	return null;
    }
}
