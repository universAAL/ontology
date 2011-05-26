/*
	Copyright 2008-2010 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute of Computer Graphics Research 
	
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

package org.universAAL.ontology.window;

import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.OrderingRestriction;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.ontology.phThing.DimmerActuator;
import org.universAAL.ontology.phThing.Sensor;

/**
 * Ontological representation of a blind as a device. Methods included in this
 * class are the mandatory ones for representing an ontological concept in Java
 * classes for uAAL. Usually it includes getters and setters for most of its
 * properties.
 * 
 * @author Steeven Zeiss
 * @since 26.11.2009
 * 
 */
public class BlindActuator extends DimmerActuator {
    public static final String MY_URI;
    public static final String PROP_IN_WINDOW;

    static {
	MY_URI = WindowActuator.WINDOW_NAMESPACE + "BlindActuator";
	PROP_IN_WINDOW = WindowActuator.WINDOW_NAMESPACE + "inWindow";
	register(BlindActuator.class);
    }

    public static Restriction getClassRestrictionsOnProperty(String propURI) {
	if (PROP_DIMMABLE_STATUS.equals(propURI))
	    return OrderingRestriction.newOrderingRestriction(new Integer(100),
		    new Integer(0), true, true, Restriction
			    .getAllValuesRestrictionWithCardinality(propURI,
				    TypeMapper.getDatatypeURI(Integer.class),
				    1, 1));
	if (PROP_IN_WINDOW.equals(propURI))
	    return Restriction.getAllValuesRestrictionWithCardinality(propURI,
		    WindowActuator.MY_URI, 1, 0);
	return Sensor.getClassRestrictionsOnProperty(propURI);
    }

    public static String[] getStandardPropertyURIs() {
	String[] inherited = ManagedIndividual.getStandardPropertyURIs();
	String[] toReturn = new String[inherited.length + 1];
	int i = 0;
	while (i < inherited.length) {
	    toReturn[i] = inherited[i];
	    i++;
	}
	toReturn[i] = PROP_IN_WINDOW;
	return toReturn;
    }

    public BlindActuator() {
    }

    public BlindActuator(String uri) {
	super(uri);
    }

    public static String getRDFSComment() {
	return "A Blind Dimmable Actuator";
    }

    public static String getRDFSLabel() {
	return "Blind Actuator";
    }

    public boolean isWellFormed() {
	return true;
    }

}
